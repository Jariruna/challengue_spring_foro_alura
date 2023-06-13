create table usuarios(
usuario_id bigint not null auto_increment,
nombre varchar(45) not null,
email varchar(100) not null unique,
contrasena varchar(100) not null,

primary key(usuario_id)
)ENGINE=InnoDB;