/* 1 */

CREATE TABLE plantas (
	id INT PRIMARY KEY,
	tamanaho_cm INT,
	nome_cientifico VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE frutos (
	id INT PRIMARY KEY,
	cor VARCHAR(30),
	comestivel BOOLEAN,
	planta_id INT,
	FOREIGN KEY(planta_id) REFERENCES plantas(id)
);

/* 2 */

CREATE TABLE livros (
	id INT PRIMARY KEY,
	titulo VARCHAR(50),
	autor VARCHAR(50)
);

CREATE TABLE generos (
	id INT PRIMARY KEY,
	nome VARCHAR(50)
);

CREATE TABLE autores (
	id INT PRIMARY KEY,
	nome VARCHAR(50),
	data_nascimento DATE,
	nacionalidade VARCHAR(50)
);

CREATE TABLE livro_genero (
	livro_id INT,
	genero_id INT,
	PRIMARY KEY (livro_id, genero_id),
	FOREIGN KEY(livro_id) REFERENCES livros(id),
	FOREIGN KEY(genero_id) REFERENCES generos(id)
);

CREATE TABLE autor_livro (
	autor_id INT,
	livro_id INT,
	PRIMARY KEY (autor_id, livro_id),
	FOREIGN KEY(autor_id) REFERENCES autores(id),
	FOREIGN KEY(livro_id) REFERENCES livros(id)
);

/* 3 */

CREATE TABLE passageiros (
	id INT PRIMARY KEY,
	nome VARCHAR(50),
	cpf VARCHAR(14),
	data_nascimento DATE
);

CREATE TABLE aeronaves (
	id INT PRIMARY KEY,
	marca VARCHAR(50),
	modelo VARCHAR(50),
	capacidade INT,
	matricula VARCHAR(10),
	ano_fabricacao INT
);

CREATE TABLE aeroportos (
	id INT PRIMARY KEY,
	nome VARCHAR(50),
	codigo VARCHAR(3),
	cidade VARCHAR(30),
	ser_internacional BOOLEAN
);

CREATE TABLE voos (
	id INT PRIMARY KEY,
	aeroporto_origem_id INT NOT NULL,
	aeroporto_destino_id INT NOT NULL,
	aeronave_id INT NOT NULL,
	data_hora_partida TIMESTAMP,
	duracao_estimada_minutos INT,
	FOREIGN KEY (aeronave_id) REFERENCES aeronaves(id),
	FOREIGN KEY (aeroporto_origem_id) REFERENCES aeroportos(id),
	FOREIGN KEY (aeroporto_destino_id) REFERENCES aeroportos(id)
);

CREATE TABLE passagens (
	id INT PRIMARY KEY,
	passageiro_id INT,
	voo_id INT,
	assento VARCHAR(5),
	portao VARCHAR(5),
	FOREIGN KEY (passageiro_id) REFERENCES passageiros(id),
	FOREIGN KEY (voo_id) REFERENCES voos(id)
);

/* 4 */

CREATE TABLE clientes (
	id INT PRIMARY KEY,
	nome VARCHAR(50),
	cpf VARCHAR(14),
	telefone VARCHAR(20),
	email VARCHAR(30),
	endereco VARCHAR(50),
	data_nascimento DATE
);

CREATE TABLE computadores (
	id INT PRIMARY KEY,
	marca VARCHAR(50),
	modelo VARCHAR(50),
	configuracao VARCHAR(100)
);

CREATE TABLE tipo_servico (
	id INT PRIMARY KEY,
	definicao VARCHAR(50)
);

CREATE TABLE servicos (
	id INT PRIMARY KEY,
	data_hora TIMESTAMP,
	estimativa_dias INT,
	estimativa_preco FLOAT,
	tipo_servico_id INT,
	cliente_id INT,
	FOREIGN KEY(cliente_id) REFERENCES clientes(id),
	FOREIGN KEY(tipo_servico_id) REFERENCES tipo_servico(id)
);

CREATE TABLE servico_computador (
	servico_id INT,
	computador_id INT,
	PRIMARY KEY(servico_id, computador_id),
	FOREIGN KEY(servico_id) REFERENCES servicos(id),
	FOREIGN KEY(computador_id) REFERENCES computadores(id)
);

/* 5 */

CREATE TABLE turmas (
	id INT PRIMARY KEY,
	sala VARCHAR(20),
	serie VARCHAR(10)
);

CREATE TABLE alunos (
	id INT PRIMARY KEY,
	nome VARCHAR(50),
	cpf VARCHAR(14),
	data_nascimento DATE,
	turma_id INT,
	FOREIGN KEY(turma_id) REFERENCES turmas(id)
);

/* 6 */

CREATE TABLE familias (
	id INT PRIMARY KEY,
	nome VARCHAR(30),
	caracteristica VARCHAR(100)
);

CREATE TABLE elementos (
	id INT PRIMARY KEY,
	nome VARCHAR(30),
	simbolo VARCHAR(2),
	massa_atomica FLOAT,
	numero_atomico INT,
	ponto_fusao DECIMAL(6,2),
	ponto_ebulicao DECIMAL(6,2),
	estado_padrao INT,
	familia_id INT,
	FOREIGN KEY(familia_id) REFERENCES familias(id)
);

/* 7 */

CREATE TABLE tipos_pratos (
	id INT PRIMARY KEY,
	nome VARCHAR(30)
);

CREATE TABLE pratos (
	id INT PRIMARY KEY,
	nome VARCHAR(40),
	preco FLOAT,
	tipo_id INT,
	FOREIGN KEY (tipo_id) REFERENCES tipos_pratos(id)
);

CREATE TABLE ingredientes (
	id INT PRIMARY KEY,
	nome VARCHAR(30)
);

CREATE TABLE prato_ingrediente (
	prato_id INT,
	ingrediente_id INT,
	quantidade INT,
	unidade_medida VARCHAR(10),
	PRIMARY KEY (prato_id, ingrediente_id),
	FOREIGN KEY (prato_id) REFERENCES pratos(id),
	FOREIGN KEY (ingrediente_id) REFERENCES ingredientes(id)
);

/* 8 */

CREATE TABLE areas (
	id INT PRIMARY KEY,
	nome VARCHAR(30),
	bioma VARCHAR(30),
	pais VARCHAR(30)
);

CREATE TABLE arvores (
	id INT PRIMARY KEY,
	nome_cientifico VARCHAR(30),
	fator_risco VARCHAR(30),
	altura_cm INT,
	idade_estimada INT,
	area_id INT,
	FOREIGN KEY (area_id) REFERENCES areas(id)
);

/* 9 */

CREATE TABLE times (
	id INT PRIMARY KEY,
	nome VARCHAR(40),
	pais VARCHAR(40),
	tecnico VARCHAR(40),
	divisao VARCHAR(30)
);

CREATE TABLE patrocinadores (
	id INT PRIMARY KEY,
	nome VARCHAR(40),
	time_patrocinado VARCHAR(40),
	valor_patrocinio FLOAT,
	time_id INT,
	FOREIGN KEY (time_id) REFERENCES times(id)
);

CREATE TABLE jogadores (
	id INT PRIMARY KEY,
	nome VARCHAR(50),
	data_nascimento DATE,
	posicao VARCHAR(30),
	salario FLOAT,
	time_id INT,
	FOREIGN KEY(time_id) REFERENCES times(id)
);

/* 10 */

CREATE TABLE filmes (
	id INT PRIMARY KEY,
	nome VARCHAR(50),
	data_estreia DATE,
	duracao_min INT
);

CREATE TABLE generos_filmes (
	id INT PRIMARY KEY,
	nome VARCHAR(30) NOT NULL UNIQUE
);

CREATE TABLE filmes_generos (
	filme_id INT NOT NULL,
	genero_id INT NOT NULL,
	PRIMARY KEY(filme_id, genero_id),
	FOREIGN KEY (filme_id) REFERENCES filmes(id),
	FOREIGN KEY (genero_id) REFERENCES generos_filmes(id)
);

CREATE TABLE ingressos_filmes (
	id INT PRIMARY KEY,
	horario TIMESTAMP,
	assento VARCHAR(3),
	filme_id INT,
	FOREIGN KEY (filme_id) REFERENCES filmes(id)
);

/* 11 */

CREATE TABLE tipos (
	id INT PRIMARY KEY,
	nome VARCHAR(30) NOT NULL UNIQUE
);

CREATE TABLE eventos (
	id INT PRIMARY KEY,
	titulo VARCHAR(50),
	data_hora TIMESTAMP,
	local VARCHAR(40),
	tipo_id INT,
	FOREIGN KEY (tipo_id) REFERENCES tipos(id)
);

CREATE TABLE pessoas (
	id INT PRIMARY KEY,
	nome VARCHAR(50),
	cpf VARCHAR(14),
	telefone VARCHAR(20),
	email VARCHAR(30),
	endereco VARCHAR(50),
	data_nascimento DATE
);

CREATE TABLE ingressos_eventos (
	id INT PRIMARY KEY,
	evento_id INT,
	pessoa_id INT,
	FOREIGN KEY (evento_id) REFERENCES eventos(id),
	FOREIGN KEY (pessoa_id) REFERENCES pessoas(id)
);
