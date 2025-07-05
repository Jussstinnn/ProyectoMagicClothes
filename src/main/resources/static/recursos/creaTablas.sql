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

CREATE TABLE camisas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    descripcion VARCHAR(255),
    precio DECIMAL(10,2) NOT NULL,
    imagen VARCHAR(500),
    disponibilidad VARCHAR(100)  NOT NULL
);

-- Insertar registros
INSERT INTO camisas (nombre, descripcion, precio, imagen, disponibilidad) VALUES
('Camisa Casual Azul', 'Disponible - Nuevo', 18900.00, 'https://ae-pic-a1.aliexpress-media.com/kf/Sb032ca0b80064639bce1cb1b1a438e40N.jpg_960x960q75.jpg_.avif', 'Disponible'),
('Camisa Blanca Clásica', 'Disponible - Nuevo', 21500.00, 'https://ae-pic-a1.aliexpress-media.com/kf/S0d82ab50d623437c8a1007f2aa1bf5cft.jpg_960x960q75.jpg_.avif', 'Disponible'),
('Camisa Estampada Moderna', 'Disponible - Nuevo', 16750.00, 'https://ae-pic-a1.aliexpress-media.com/kf/S0885116a21c845dea7aa810e0de6e518v.jpg_960x960q75.jpg_.avif', 'Disponible'),
('Camisa de lino beige', 'Camisa de lino ligera y fresca, ideal para verano.', 19500.00, 'https://ae-pic-a1.aliexpress-media.com/kf/S6e6b9d60b20c4f7190e51f2ba71c065ej.jpg_960x960q75.jpg_.avif', 'Disponible'),
('Camisa de mezclilla azul', 'Camisa de mezclilla resistente para un look casual.', 22500.00, 'https://ae-pic-a1.aliexpress-media.com/kf/He86bbca8fd6d4db59e29162d903df858D.jpg_960x960q75.jpg_.avif', 'Disponible'),
('Camiseta negra estampada', 'Camiseta negra con estampado moderno y ajuste cómodo.', 24500.00, 'https://ae-pic-a1.aliexpress-media.com/kf/S903f89d7c4d74cdbbf045c566f6b1ad55.jpg_960x960q75.jpg_.avif', 'Disponible'),
('Camisa de franela roja', 'Camisa de franela suave, perfecta para clima frío.', 18500.00, 'https://ae-pic-a1.aliexpress-media.com/kf/S278f321b92534dd494b180434436fed3b.jpg_960x960q75.jpg_.avif', 'Disponible'),
('Camisa rojas japonesa', 'Camisa japonesa con estampado colorido y vibrante en rojo.', 19900.00, 'https://ae-pic-a1.aliexpress-media.com/kf/S1e35f5b25a3240739eb58dc29716de5cr.jpg_960x960q75.jpg_.avif', 'Disponible'),
('Camisa deportiva técnica', 'Camisa deportiva con tecnología de absorción de sudor.', 21000.00, 'https://ae-pic-a1.aliexpress-media.com/kf/S71c19992408c40619e4adcada7f535057.jpg_960x960q75.jpg_.avif', 'Disponible'),
('Camisa casual de lino', 'Camisa ligera de lino ideal para climas cálidos. Corte moderno y transpirable.', 18900.00, 'https://ae-pic-a1.aliexpress-media.com/kf/S4b257869be464035bfdbf11a6710e8ebl.jpg_960x960q75.jpg_.avif', 'Disponible'),
('Camisa de vestir slim fit', 'Camisa formal de corte suelto.', 24500.00, 'https://ae-pic-a1.aliexpress-media.com/kf/S3a2b4a3752dc4aa78d7152528bc73b0fG.jpg_960x960q75.jpg_.avif', 'Disponible'),
('Camisa hawaiana estampada', 'Camisa de verano con estampado de barcos y botones de coco.', 17000.00, 'https://ae-pic-a1.aliexpress-media.com/kf/S2496a49954da427d820bbd86ce880af1K.jpg_960x960q75.jpg_.avif', 'Disponible'),
('Camisa de mezclilla', 'Camisa denim de manga larga con bolsillos frontales. Estilo vintage.', 22000.00, 'https://ae-pic-a1.aliexpress-media.com/kf/S8d45697d732c44daa1320bd1df3d1feaK.jpg_960x960q75.jpg_.avif', 'Disponible'),
('Camisa polo básica', 'Camisa tipo polo con cuello acanalado y bordado discreto.', 19500.00, 'https://ae-pic-a1.aliexpress-media.com/kf/Sa8eb6250f1cb4cf4a9fefe6fc49deab0N.jpg_960x960q75.jpg_.avif', 'Disponible'),
('Abrigo deportivo', 'Camisa ajustada ideal para entrenamiento en climas fríos.', 23000.00, 'https://ae-pic-a1.aliexpress-media.com/kf/Se04079a944aa4b53ade1dd857ed42241i.jpg_960x960q75.jpg_.avif', 'Disponible');
 <!-- Con esto se ven -->
SELECT * FROM usuario;