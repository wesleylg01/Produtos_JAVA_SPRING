create table produto (
    id bigint not null primary key,
    nome varchar(100) not null,
    descricao varchar(255),
    preco numeric(18,2)
);

INSERT INTO produto (id, nome, descricao, preco) VALUES
(1, 'Pen Drive', 'Pen Driver Kingston 32 Gb', 49.99),
(2, 'Mouse de bolinha', 'Mouse de bolinha que ficava amarelo', 15.45),
(3, 'Capa de monitor', 'Capa para monitor de tubo', 12.20);