insert into produtos(nome, preco) values('Pequi', 100.5), ('Cuscuz', 5.5);
insert into estoque(quantidade, produto_id) values(100, 1), (400, 2);

insert into clientes(nome, email) values('Gaveta', 'gaveta@gmail.com'), ('Yuri', 'yuri@gmail.com');

insert into compras(status, cliente_id) values('AGUARDANDO', 1);

insert into compras_produtos(compra_id, produtos_id) values(1, 1), (1, 2);