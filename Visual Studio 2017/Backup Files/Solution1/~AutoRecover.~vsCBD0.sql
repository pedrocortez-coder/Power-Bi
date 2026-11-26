CREATE TABLE Itens
(
IdItem int NOT NULL,
Nome varchar(100),
Validade date,
CONSTRAINT PK_Itens PRIMARY KEY(IdItem)
)
go
CREATE TABLE Tipos
(
IdTipo int NOT NULL,
Descricao varchar(100),
CONSTRAINT PK_Tipos PRIMARY KEY(IdTipo)
)
go
CREATE TABLE Estoque
(
IdItem int NOT NULL,
IdTipo int NOT NULL,
Quantidade smallint,
ValorUnitario decimal(10,2),
CONSTRAINT PK_Estoque PRIMARY KEY(IdItem,IdTipo,Quantidade,ValorUnitario),
CONSTRAINT FK_EstoqueItem FOREIGN KEY(IdItem) REFERENCES Itens(IdItem),
CONSTRAINT FK_EstoqueTipo FOREIGN KEY(IdTipo) REFERENCES Tipos(IdTipo)
)
go
/* Itens */
INSERT INTO Itens(IdItem,Nome,Validade)
VALUES(1,'Arroz','01/07/2025');
INSERT INTO Itens(IdItem,Nome,Validade)
VALUES(2,'Iogurte','25/08/2024');
INSERT INTO Itens(IdItem,Nome,Validade)
VALUES(3,'Shampoo','13/05/2026');
INSERT INTO Itens(IdItem,Nome,Validade)
VALUES(4,'Lapis','11/12/2028');
INSERT INTO Itens(IdItem,Nome,Validade)
VALUES(5,'Milho','30/09/2024');
INSERT INTO Itens(IdItem,Nome,Validade)
VALUES(6,'Boneco Hulk','06/11/2032');
INSERT INTO Itens(IdItem,Nome,Validade)
VALUES(7,'Caneta Bic','10/07/2030');

/* Tipos */
INSERT INTO Tipos(IdTipo,Descricao)
VALUES(11,'Alimenticio');
INSERT INTO Tipos(IdTipo,Descricao)
VALUES(22,'Beleza');
INSERT INTO Tipos(IdTipo,Descricao)
VALUES(33,'Papelaria');
INSERT INTO Tipos(IdTipo,Descricao)
VALUES(44,'Brinquedo');
/* Estoque */
INSERT INTO Estoque(IdItem,IdTipo,Quantidade,ValorUnitario)
VALUES(1,11,50,22.50);
INSERT INTO Estoque(IdItem,IdTipo,Quantidade,ValorUnitario)
VALUES(2,11,120,2.75);
INSERT INTO Estoque(IdItem,IdTipo,Quantidade,ValorUnitario)
VALUES(3,22,73,29.80);
INSERT INTO Estoque(IdItem,IdTipo,Quantidade,ValorUnitario)
VALUES(4,33,300,2.25);
INSERT INTO Estoque(IdItem,IdTipo,Quantidade,ValorUnitario)
VALUES(5,11,60,7.89);
INSERT INTO Estoque(IdItem,IdTipo,Quantidade,ValorUnitario)
VALUES(6,44,20,49.50);
