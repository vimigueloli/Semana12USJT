CREATE DATABASE registros;
USE registros;
CREATE TABLE esporte(
    nome_e VARCHAR(30) not null  PRIMARY KEY
);
CREATE TABLE pessoas(
	id_p_number INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nome_p VARCHAR(30),
    idade INT,
    sexo VARCHAR(1),
    endereço VARCHAR(30),
    vegetarian BOOLEAN,
    fk_nome_e VARCHAR(30) NOT NULL,    
    FOREIGN KEY (fk_nome_e) REFERENCES esporte (nome_e)
);

DROP DATABASE registros; 
select * from pessoas;
 