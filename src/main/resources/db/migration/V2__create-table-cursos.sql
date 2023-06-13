CREATE TABLE cursos (
    curso_id BIGINT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45) NOT NULL,
    categoria VARCHAR(45) NOT NULL,
    PRIMARY KEY (curso_id)
)ENGINE=InnoDB;