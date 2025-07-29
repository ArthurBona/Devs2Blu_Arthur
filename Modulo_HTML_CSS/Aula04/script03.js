const gerarNumero = () => Math.floor(Math.random() * 100) + 1;
let numero = gerarNumero();

let tentativas = 0;

const acao = (event, valor) => {

    if (event.key === "Enter") {

        tentativas++;

        let retorno = document.getElementById("retorno");
        let chute = parseInt(valor);
        let diff = Math.abs(numero - chute);

        if(diff == 0){
            retorno.innerHTML = `Finalizado! <br> Foram realizadas ${tentativas} tentativas.`;
            tentativas = 0;
            numero = gerarNumero();
        } else if(diff <= 5) {
            retorno.innerText = 'Quase!';
        } else if(diff <= 10) { 
            retorno.innerText = 'Perto!';
        }else if (diff <= 20) {
            retorno.innerText = 'Longe!';
        } else {
            retorno.innerText = 'Muito longe!';
        }
    }
}

