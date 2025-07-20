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

CREATE TABLE pago (
    id_pago INT AUTO_INCREMENT PRIMARY KEY,
    monto DECIMAL(10,2) NOT NULL,
    fecha_pago DATETIME NOT NULL,
    metodo_pago ENUM('TARJETA_CREDITO', 'TARJETA_DEBITO') NOT NULL
);

 <!-- Con esto se ven -->
USE magicclothesdb;
SELECT * FROM pago;

CREATE TABLE producto (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    descripcion TEXT,
    precio DOUBLE
);

CREATE TABLE carrito (
    id_carrito BIGINT AUTO_INCREMENT PRIMARY KEY,
    usuario VARCHAR(100)
);

CREATE TABLE carrito_item (
    id_item BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_carrito BIGINT,
    id_producto INT,
    cantidad INT,
    FOREIGN KEY (id_carrito) REFERENCES carrito(id_carrito),
    FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
);

 <!-- Con esto se ven .-->
USE magicclothesdb;
SELECT * FROM producto;
SELECT * FROM carrito;
SELECT * FROM carrito_item;