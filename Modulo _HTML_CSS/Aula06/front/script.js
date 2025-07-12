let addresses = [];
const urlApi = 'http://localhost:3000/addresses';

fetch(urlApi)
.then(res => res.json())
.then(a => {
    addresses = a;
    console.log('Endereços carregados:', addresses);
    renderTable();
})

const renderTable = () => {
    let table = document.getElementById("table")
    table.innerHTML = '';
    for (let i = 0; i < addresses.length; i++) {
        let address = addresses[i];
        let row = table.insertRow(-1);
        let colunaId = row.insertCell(0);
        let colunaName = row.insertCell(1);
        let colunaZip = row.insertCell(2);
        let colunaState = row.insertCell(3);
        let colunaCity = row.insertCell(4);
        let colunaNeighborhood = row.insertCell(5);
        let colunaStreet = row.insertCell(6);
        let colunaEdit = row.insertCell(7);
        let colunaExclude = row.insertCell(8);
        
        colunaId.innerHTML = address.id;
        colunaName.innerHTML = address.name;
        colunaZip.innerHTML = address.zip;
        colunaState.innerHTML = address.state;
        colunaCity.innerHTML = address.city;
        colunaNeighborhood.innerHTML = address.neighborhood;
        colunaStreet.innerHTML = address.street;
        colunaEdit.innerHTML = `<button class="btn btn-warning" onclick="edit('${address.id}')">✏️</button>`;
        colunaExclude.innerHTML = `<button class="btn btn-danger" onclick="exclude('${address.id}')">🗑️</button>`;
    }
}

let editingId = null;

const edit = (id) => {
    let address = addresses.find(a => a.id === id);

    document.getElementById("name").value = address.name;
    document.getElementById("zipCode").value = address.zip;
    document.getElementById("state").value = address.state;
    document.getElementById("city").value = address.city;
    document.getElementById("neighborhood").value = address.neighborhood;
    document.getElementById("street").value = address.street;

    editingId = id;

    document.getElementById("btnRegister").innerText = "🔄 Update Address";
}

const exclude = (id) => {
    if (!confirm("Are you sure about deleting this address?")) return;

    fetch (`${urlApi}/${id}`,{
        method: 'DELETE'
    })
    .then(res => {
        let index = addresses.findIndex(addresses => addresses.id === id)
        addresses.splice(index, 1);

        renderTable();
    })
}

const register = () => {
    let name = document.getElementById("name");
    let zip = document.getElementById("zipCode");

    fetch(`https://viacep.com.br/ws/${zip.value}/json/`)
    .then(res => res.json())
    .then(data => {
        let address = {
            name: name.value,
            zip: zip.value,
            state: data.uf,
            city: data.localidade,
            neighborhood: data.bairro,
            street: data.logradouro
        };
        if (editingId) {
            return fetch(`${urlApi}/${editingId}`, {
                method: 'PUT',
                body: JSON.stringify(address),
                headers: { 'Content-Type': 'application/json' }
            });
        } else {
            return fetch(urlApi, {
                method: 'POST',
                body: JSON.stringify(address),
                headers: { 'Content-Type': 'application/json' }
            });
        }
    })
    .then(res => res.json())
    .then(a => {
        if (editingId) {
            let index = addresses.findIndex(addr => addr.id === editingId);
            if (index !== -1) {
                addresses[index] = a;
            }
            editingId = null;
            document.getElementById("btnRegister").innerText = "📦 Register Address";
        } else {
            addresses.push(a);
        }
        renderTable();
        name.value = '';
        zip.value = '';
        document.getElementById("state").value = '';
        document.getElementById("city").value = '';
        document.getElementById("neighborhood").value = '';
        document.getElementById("street").value = '';
        name.focus();
    });
}
