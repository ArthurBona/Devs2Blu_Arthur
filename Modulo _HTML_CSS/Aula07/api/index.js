// Importar dependência/pacote do express
const express = require('express');

// Objeto Express (manipular rotas e o servidor)
const app = express();

// Habilitar receber objeto JSON nas requisições
app.use(express.json());

// Porta
const port = 3000

// Vetor para armazenar dados pessoas
let vetor = [
    {id:1, nome:"Frenchie", idade:40},
    {id:2, nome:"Hughie", idade:27},
    {id:3, nome:"Billy", idade:43}
];

// Rota para efetuar uma requisição GET
app.get('/', (req, res) => {
  res.status(200).json(vetor);
})

// Rota para efetuar requisição POST
app.post('/', (req, res) => {
    res.send(req.body)
})

// Servidor
app.listen(port);
