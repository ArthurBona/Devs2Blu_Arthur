function converter() {
    const valor = parseFloat(document.getElementById("valor").value);
    const moeda = document.getElementById("moeda").value;
    const resultado = document.getElementById("resultado");

    // Cotações fixas do horário em que estou fazendo, às 18:28 de Domingo.
    const cotacoes = {
        dolar: 5.42,
        euro: 6.39,
        libra: 7.4,
        bitcoin: 585693
    };

    const cotacao = cotacoes[moeda];
    const valorConvertido = valor / cotacao;

    let simbolo;
    switch (moeda) {
        case 'dolar': simbolo = 'US$'; break;
        case 'euro': simbolo = '€'; break;
        case 'libra': simbolo = '£'; break;
        case 'bitcoin': simbolo = '₿'; break;
        default: simbolo = '';
    }

    resultado.innerText = `R$ ${valor.toFixed(2)} = ${simbolo} ${valorConvertido.toFixed(4)}`;

} 
    

