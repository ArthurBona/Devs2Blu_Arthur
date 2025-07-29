let carrinho = [];

function mostrarProdutosNaTela(lista) {
  const container = document.getElementById('lista-produtos');
  container.innerHTML = '';
  lista.forEach(produto => {
    const card = document.createElement('div');
    card.classList.add('card-produto');
    card.innerHTML = `
      <img src="${produto.imagem}" alt="${produto.nome}">
      <h3>${produto.nome}</h3>
      <p class="preco">R$ ${produto.valor.toFixed(2)}</p>
      <button ${produto.quantidade === 0 ? 'disabled' : ''}>Adicionar ao carrinho</button>
    `;
    container.appendChild(card);

    card.querySelector('button').addEventListener('click', () => adicionarAoCarrinho(produto.id));
    card.addEventListener('click', e => {
      if (e.target.tagName !== 'BUTTON') toggleAmpliarCard(card);
    });
  });
}

function toggleAmpliarCard(card) {
  const ampliado = document.querySelector('.card-produto.ampliado');
  if (ampliado && ampliado !== card) {
    ampliado.classList.remove('ampliado');
  }
  card.classList.toggle('ampliado');
  if (!card.classList.contains('ampliado')) return;
  // Clique fora do card fecha ele
  function cliqueFora(event) {
    if (!card.contains(event.target)) {
      card.classList.remove('ampliado');
      document.removeEventListener('click', cliqueFora);
    }
  }
  setTimeout(() => {
    document.addEventListener('click', cliqueFora);
  }, 0);
}

function adicionarAoCarrinho(id) {
  const produto = produtos.find(p => p.id === id);
  if (!produto || produto.quantidade === 0) return;

  const itemCarrinho = carrinho.find(item => item.id === id);
  if (itemCarrinho) {
    if (itemCarrinho.quantidade < produto.quantidade) {
      itemCarrinho.quantidade++;
    } else {
      alert('Quantidade máxima em estoque atingida');
    }
  } else {
    carrinho.push({ id: produto.id, nome: produto.nome, valor: produto.valor, quantidade: 1 });
  }
  atualizarCarrinho();
}

function atualizarCarrinho() {
  const listaCarrinho = document.getElementById('lista-carrinho');
  const totalCarrinho = document.getElementById('total-carrinho');
  const btnFinalizar = document.getElementById('finalizar-compra');
  const btnLimpar = document.getElementById('limpar-carrinho');

  listaCarrinho.innerHTML = '';

  if (carrinho.length === 0) {
    listaCarrinho.innerHTML = '<li>Carrinho vazio</li>';
    totalCarrinho.textContent = 'Total: R$ 0,00';
    btnFinalizar.disabled = true;
    btnLimpar.disabled = true;
    return;
  }

  let total = 0;

  carrinho.forEach(item => {
    const li = document.createElement('li');
    li.textContent = `${item.nome} - Qtd: ${item.quantidade} - R$ ${(item.valor * item.quantidade).toFixed(2)}`;
    listaCarrinho.appendChild(li);
    total += item.valor * item.quantidade;
  });

  totalCarrinho.textContent = `Total: R$ ${total.toFixed(2)}`;
  btnFinalizar.disabled = false;
  btnLimpar.disabled = false;
}

function finalizarCompra() {
  carrinho.forEach(item => {
    const produto = produtos.find(p => p.id === item.id);
    if (produto) {
      produto.quantidade -= item.quantidade;
    }
  });
  carrinho = [];
  atualizarCarrinho();
  mostrarProdutosNaTela(produtos);
  alert('Compra finalizada com sucesso!');
}

function limparCarrinho() {
  carrinho = [];
  atualizarCarrinho();
}

function filtrarCategoria(categoria) {
  const produtosFiltrados = produtos.filter(p => p.categoria === categoria);
  mostrarProdutosNaTela(produtosFiltrados);
}

function pesquisarProdutos(termo) {
  termo = termo.toLowerCase();
  const produtosFiltrados = produtos.filter(p => p.nome.toLowerCase().includes(termo));
  mostrarProdutosNaTela(produtosFiltrados);
}

document.getElementById('form-pesquisa').addEventListener('submit', e => {
  e.preventDefault();
  const termo = document.getElementById('input-pesquisa').value.trim();
  if (termo) {
    pesquisarProdutos(termo);
  } else {
    mostrarProdutosNaTela(produtos);
  }
});

document.getElementById('finalizar-compra').addEventListener('click', finalizarCompra);
document.getElementById('limpar-carrinho').addEventListener('click', limparCarrinho);

mostrarProdutosNaTela(produtos);
atualizarCarrinho();
