/*
    EXPRESS;
    NODEMON;
    CORS;
    JSONWEBTOKEN.
 */

// Importar express
const express = require('express');

// Importar cors
const cors = require('cors');

// Importar jsonwebtoken
const jwt = require('jsonwebtoken');

// Criar o objeto app
const app = express();

// Referenciar cors
app.use(cors());

// Aceitar requisições contendo JSON (body)
app.use(express.json());

// Palavra/Frase secreta
const segredo = "Homero"

// Rota para criar o token
app.post('/', (req, res) => {
    // Obter o nome
    const nome = req.body;

    // Gerar token
    const token = jwt.sign({nome}, segredo, {expiresIn: '1h'});

    // Retonar
    res.status(200).json({ token });
})

// Rota para validar o token
app.get('/', (req,res) => {
    // Extrair bearer do cabeçalho
    const headers = req.headers.authorization;

    // Extrair o token
    const token = headers.split(' ')[1];

    // Try-catch
    try{
        const validarToken = jwt.verify(token, segredo);

        res.status(200).json({mensagem:'Autenticado! O nome informado é: ' + validarToken.nome});
    }catch(erro){
        res.status(400).json({mensagem:'Falha' + erro});
    }

    res.json(token);
})

// Servidor
app.listen(8080);