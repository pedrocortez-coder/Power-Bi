Create table Usuarios2
(
IdUsuario int not null IDENTITY(1,1),
Usuario varchar(50) not null,
SenhaHash varchar(200) not null,
SenhaSalt varchar(200) not null,
Constraint PK_User2 primary key(IdUsuario)
)