const formulario = document.getElementById("formulario")
const resultado = document.getElementById("IMC")

formulario.onsubmit = () => {

    const peso = parseFloat(document.getElementById("peso").value);
    const altura = parseFloat(document.getElementById("altura").value);

    let imc = peso/(altura * altura);

    if (imc >= 40) {
        resultado.innerText = `Seu IMC é de ${imc.toFixed(2)}, sua situação é de obesidade grau 3`
    } else if (imc >= 35) {
        resultado.innerText = `Seu IMC é de ${imc.toFixed(2)}, sua situação é de obesidade grau 2`
    } else if (imc >= 30) {
        resultado.innerText = `Seu IMC é de ${imc.toFixed(2)}, sua situação é de obesidade grau 1`
    } else if (imc >= 25) {
        resultado.innerText = `Seu IMC é de ${imc.toFixed(2)}, sua situação é de sobrepeso`
    } else if (imc >= 18.5) {
        resultado.innerText = `Seu IMC é de ${imc.toFixed(2)}, sua situação é de peso normal`
    } else {
        resultado.innerText = `Seu IMC é de ${imc.toFixed(2)}, sua situação é de abaixo do peso`
    }


    return false;

}