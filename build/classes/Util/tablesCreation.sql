CREATE TABLE jogo (
    id SERIAL PRIMARY KEY ,
    titulo char(50) ,
    genero char(50) ,
    ranking int,
    foiAssistido boolean
);

CREATE TABLE serie (
   id SERIAL PRIMARY KEY ,
   titulo char(50) ,
   genero char(50) ,
   ranking int,
   numEpisodios int ,
   numEpisodiosAssistidos int
);


CREATE TABLE jogo (
   id SERIAL PRIMARY KEY ,
   titulo char(50) ,
   genero char(50) ,
   ranking int,
   horasJogadas int ,
   foiHistoriaTerminada boolean
);