SET datestyle = "ISO, DMY";

CREATE TABLE aluno (
  nome VARCHAR(50) NOT NULL PRIMARY KEY,
  email VARCHAR(20) NOT NULL,
  sexo VARCHAR(2),
  curso VARCHAR(20) NOT NULL,
  dataInicio VARCHAR(50) NOT NULL
);
