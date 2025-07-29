const tabuada = document.getElementById("tabuada");
const formulario = document.getElementById("formulario");

formulario.onsubmit = () => {
    const numero = parseInt(document.getElementById("natural").value);

    tabuada.innerHTML = "";
    
    for (let i = 0; i < numero + 1; i++) {
        tabuada.innerHTML += `${numero} X ${i} = ${numero*i}<br>`;
    }

    return false;
}