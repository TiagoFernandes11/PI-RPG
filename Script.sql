drop database if exists projeto;
create database if not exists projeto;

use projeto;

CREATE TABLE IF NOT EXISTS usuario (
  codusuario int(3) primary key auto_increment,
  usuario VARCHAR(16) NOT NULL,
  email VARCHAR(255) NULL,
  senha VARCHAR(32) NOT NULL,
  datacriacao TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  imagem BLOB NOT NULL,
  horasjogadas TIME NOT NULL);
  
  insert into usuario(codusuario,usuario,email,senha) values(null,"TiagoAnal", "tiagoanal@terra.com.br", "senha123");