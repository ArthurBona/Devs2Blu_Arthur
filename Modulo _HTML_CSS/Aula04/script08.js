let perguntas = [
  ["Qual a cor do céu?", "Azul", "Verde", "Vermelho", "Amarelo", 0],
  ["Quanto é 2 + 2?", "3", "4", "5", "6", 1],
  ["Qual animal mia?", "Cachorro", "Gato", "Pássaro", "Peixe", 1],
  ["Qual planeta é conhecido como Planeta Vermelho?", "Terra", "Marte", "Júpiter", "Saturno", 1],
  ["Qual a capital do Brasil?", "Rio", "São Paulo", "Brasília", "Salvador", 2],
  ["Qual é a estação do ano mais quente?", "Inverno", "Outono", "Verão", "Primavera", 2],
  ["Qual fruta é amarela?", "Maçã", "Laranja", "Banana", "Uva", 2],
  ["Quantos lados tem um quadrado?", "2", "3", "4", "5", 2],
  ["Qual é o contrário de 'dia'?", "Noite", "Manhã", "Tarde", "Madrugada", 0],
  ["Qual é o número depois do 9?", "8", "9", "10", "11", 2]
];

let usadas = [];
for (let i = 0; i < perguntas.length; i++) {
  usadas[i] = false;
}

let selecionadas = [];
let total = 5;
let pontos = 0;
let atual = 0;

while (selecionadas.length < total) {
  let r = Math.floor(Math.random() * perguntas.length);
  if (usadas[r] === false) {
    usadas[r] = true;
    selecionadas.push(perguntas[r]);
  }
}

function mostrar() {
  if (atual < total) {
    let p = selecionadas[atual];
    document.getElementById("pergunta").innerText = "Pergunta " + (atual + 1) + ": " + p[0];

    let html = "";
    for (let i = 1; i <= 4; i++) {
      html += '<button onclick="responder(' + (i - 1) + ')">' + p[i] + '</button><br>';
    }
    document.getElementById("alternativas").innerHTML = html;
    document.getElementById("resultado").innerText = "";
  } else {
    document.getElementById("pergunta").innerText = "Fim do Quiz!";
    document.getElementById("alternativas").innerHTML = "";
    document.getElementById("resultado").innerText = "Você acertou " + pontos + " de " + total + " perguntas.";
  }
}

function responder(resp) {
  let correta = selecionadas[atual][5];
  if (resp === correta) {
    pontos++;
  }
  atual++;
  mostrar();
}

mostrar();
