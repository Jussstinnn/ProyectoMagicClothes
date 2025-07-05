CREATE DATABASE magicclothesdb;
use magicclothesdb;
CREATE TABLE usuario (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    correo VARCHAR(150) NOT NULL UNIQUE,
    contrasena VARCHAR(255) NOT NULL,
    ubicacion VARCHAR(100) NOT NULL
);

 <!-- Estos SON REGISTROS-->
INSERT INTO usuario (nombre, apellido, correo, contrasena, ubicacion) VALUES
('Laura', 'Sánchez', 'laura@example.com', 'clave123', 'San José'),
('Carlos', 'Ramírez', 'carlos.ramirez@example.com', 'abc456', 'Heredia'),
('María', 'Fernández', 'mariaf@example.com', 'securepass', 'Cartago'),
('Andrés', 'Gómez', 'andresg@example.com', 'mypassword', 'Alajuela'),
('Lucía', 'Vargas', 'lucia.v@example.com', 'pass321', 'Limón');

 <!-- Con esto se ven -->
SELECT * FROM usuario;