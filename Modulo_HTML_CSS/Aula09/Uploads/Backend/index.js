/*
    PACOTES/DEPENDÊNCIAS
    - EXPRESS;
    - NODEMOR;
    - CORS;
    - EXPRESS-FILEUPLOAD.
*/ 

// Importar o express
const express = require('express');

// Importar o cors
const cors = require('cors');

// Importar o express-fileupload
const fileupload = require('express-fileupload');

// Importar o path
const path = require('path');

// Criar um objeto app
const app = express();

// Adicionar o cors
app.use(cors());

// Adicionar o fileupload
app.use(fileupload());

// <input type="file" name="arquivo" id="arquivo">

// Criar rota para realizar o upload (form-data)
app.post('/', async (req, res) => {

    const arquivo = req.files.arquivo;
    const destino = path.join(__dirname, 'uploads', arquivo.name);

    try {
        await arquivo.mv(destino);
        res.status(200).json({ mensagem: 'Upload realizado com sucesso!' });
    } catch (erro) {
        console.error('Erro ao mover o arquivo:', erro);
        res.status(500).json({ erro: 'Erro ao salvar o arquivo' });
    }
});


// Servidor
app.listen(8080);