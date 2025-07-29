const acao = (event, valor) => {

    let valorConvertido = parseInt(valor);
    let resultado = document.getElementById("retorno");

    if (event.key === 'Enter') {

        if (valorConvertido % 4 == 0) {
            if (valorConvertido  % 100 == 0) {
                if (valorConvertido % 400 == 0) {
                    resultado.innerText = `o ano ${valorConvertido} é um ano bissexto!`;
                    return false;
                } else {
                    resultado.innerText = `o ano ${valorConvertido} não é um ano bissexto!`;
                    return false;
                }
            }
            resultado.innerText = `o ano ${valorConvertido} é um ano bissexto!`;
        } else {
            resultado.innerText = `o ano ${valorConvertido} não é um ano bissexto!`;
        }
    }
    return false;
}