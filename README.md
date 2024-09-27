# desafio-estagio

Parte 2: SQL
Cenário:
Você tem as seguintes tabelas em um banco de dados:
Tabela: Produtos
ID_Produto	Nome_Produto	Preco_Unitario
1	Arroz	15.00
2	Feijão	8.00
3	Óleo	5.00
Tabela: Compras
ID_Compra	ID_Produto	Quantidade
101	1	2
102	2	1
103	3	3

Questão 1:
Escreva uma consulta SQL que retorne o valor total de cada compra. O valor total deve ser calculado multiplicando a quantidade pelo preço unitário de cada produto.

SELECT c.ID_Compra, SUM(c.Quantidade * p.Preco_Unitario) AS Valor_Total
FROM Compras c
JOIN Produtos p ON c.ID_Produto = p.ID_Produto
GROUP BY c.ID_Compra;

Questão 2:
Escreva uma consulta SQL que retorne o produto mais vendido (com maior quantidade total).

SELECT p.Nome_Produto, SUM(c.Quantidade) AS Total_Vendido
FROM Compras c
JOIN Produtos p ON c.ID_Produto = p.ID_Produto
GROUP BY p.Nome_Produto
ORDER BY Total_Vendido DESC
LIMIT 1;

Questão 3:
Escreva uma consulta SQL que liste todos os produtos e o número de vezes que cada um foi comprado.

SELECT p.Nome_Produto, COUNT(c.ID_Compra) AS Numero_De_Vezes_Comprado
FROM Compras c
JOIN Produtos p ON c.ID_Produto = p.ID_Produto
GROUP BY p.Nome_Produto;


