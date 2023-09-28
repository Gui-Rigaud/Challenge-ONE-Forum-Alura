CREATE TABLE topicos (

    id bigint not null auto_increment,
    titulo varchar(100) not null unique,
    mensagem text(900) not null,
    createdAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status varchar(50) not null,
    autor varchar(50) not null,
    curso varchar(100) not null,

    primary key (id)
);