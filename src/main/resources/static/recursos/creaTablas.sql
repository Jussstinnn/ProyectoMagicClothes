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
ALTER TABLE camisas ADD categoria VARCHAR(100);

INSERT INTO camisas (nombre, descripcion, precio, imagen, categoria) VALUES
('Camisa Casual Azul', 'Disponible - Nuevo', 18900.00, 'https://ae-pic-a1.aliexpress-media.com/kf/Sb032ca0b80064639bce1cb1b1a438e40N.jpg_960x960q75.jpg_.avif', 'Casual'),
('Camisa Blanca Clásica', 'Disponible - Nuevo', 21500.00, 'https://ae-pic-a1.aliexpress-media.com/kf/S0d82ab50d623437c8a1007f2aa1bf5cft.jpg_960x960q75.jpg_.avif', 'Formales'),
('Camisa Estampada Moderna', 'Disponible - Nuevo', 16750.00, 'https://ae-pic-a1.aliexpress-media.com/kf/S0885116a21c845dea7aa810e0de6e518v.jpg_960x960q75.jpg_.avif', 'Casual'),
('Camisa de lino beige', 'Camisa de lino ligera y fresca, ideal para verano.', 19500.00, 'https://ae-pic-a1.aliexpress-media.com/kf/S6e6b9d60b20c4f7190e51f2ba71c065ej.jpg_960x960q75.jpg_.avif', 'Lino'),
('Camisa de mezclilla azul', 'Camisa de mezclilla resistente para un look casual.', 22500.00, 'https://ae-pic-a1.aliexpress-media.com/kf/He86bbca8fd6d4db59e29162d903df858D.jpg_960x960q75.jpg_.avif', 'Denim'),
('Camiseta negra estampada', 'Camiseta negra con estampado moderno y ajuste cómodo.', 24500.00, 'https://ae-pic-a1.aliexpress-media.com/kf/S903f89d7c4d74cdbbf045c566f6b1ad55.jpg_960x960q75.jpg_.avif', 'Casual'),
('Camisa de franela roja', 'Camisa de franela suave, perfecta para clima frío.', 18500.00, 'https://ae-pic-a1.aliexpress-media.com/kf/S278f321b92534dd494b180434436fed3b.jpg_960x960q75.jpg_.avif', 'Invierno'),
('Camisa roja japonesa', 'Camisa japonesa con estampado colorido y vibrante en rojo.', 19900.00, 'https://ae-pic-a1.aliexpress-media.com/kf/S1e35f5b25a3240739eb58dc29716de5cr.jpg_960x960q75.jpg_.avif', 'Cultural'),
('Camisa deportiva técnica', 'Camisa deportiva con tecnología de absorción de sudor.', 21000.00, 'https://ae-pic-a1.aliexpress-media.com/kf/S71c19992408c40619e4adcada7f535057.jpg_960x960q75.jpg_.avif', 'Deportiva'),
('Camisa casual de lino', 'Camisa ligera de lino ideal para climas cálidos. Corte moderno y transpirable.', 18900.00, 'https://ae-pic-a1.aliexpress-media.com/kf/S4b257869be464035bfdbf11a6710e8ebl.jpg_960x960q75.jpg_.avif', 'Lino'),
('Camisa de vestir slim fit', 'Camisa formal de corte suelto.', 24500.00, 'https://ae-pic-a1.aliexpress-media.com/kf/S3a2b4a3752dc4aa78d7152528bc73b0fG.jpg_960x960q75.jpg_.avif', 'Formales'),
('Camisa hawaiana estampada', 'Camisa de verano con estampado de barcos y botones de coco.', 17000.00, 'https://ae-pic-a1.aliexpress-media.com/kf/S2496a49954da427d820bbd86ce880af1K.jpg_960x960q75.jpg_.avif', 'Verano'),
('Camisa de mezclilla', 'Camisa denim de manga larga con bolsillos frontales. Estilo vintage.', 22000.00, 'https://ae-pic-a1.aliexpress-media.com/kf/S8d45697d732c44daa1320bd1df3d1feaK.jpg_960x960q75.jpg_.avif', 'Denim'),
('Camisa polo básica', 'Camisa tipo polo con cuello acanalado y bordado discreto.', 19500.00, 'https://ae-pic-a1.aliexpress-media.com/kf/Sa8eb6250f1cb4cf4a9fefe6fc49deab0N.jpg_960x960q75.jpg_.avif', 'Casual'),
('Abrigo deportivo', 'Camisa ajustada ideal para entrenamiento en climas fríos.', 23000.00, 'https://ae-pic-a1.aliexpress-media.com/kf/Se04079a944aa4b53ade1dd857ed42241i.jpg_960x960q75.jpg_.avif', 'Deportiva');
CREATE TABLE pantalones (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    descripcion VARCHAR(255),
    precio DECIMAL(10,2) NOT NULL,
    imagen VARCHAR(500),
    categoria VARCHAR(100)
);
ALTER TABLE pantalones RENAME TO Pantalon;

INSERT INTO pantalon (nombre, descripcion, precio, imagen, categoria) VALUES
('Pantalón Chino Skinny Fit Azul Oscuro', 'Chino entallado, algodón con elastano, perfecto para looks casuales.', 22900.00, 'https://progresivacr.com/cdn/shop/products/20.1.3_PAN219_AZUL_PANTALON_CHINO_GABARINA_STRETCH_SKINNY_A_1800x1800.jpg?v=1626988393', 'Chino'),
('Pantalón Denim Recto Levi’s 501', 'Jeans clásico Levi’s 501, denim original, corte recto.', 43900.00, 'https://media.nidux.net/pull/800/599/13819/111-product-5f979e99ccff4-005010660-1.jpg', 'Denim'),
('Jogger Deportivo Lisboa Gris', 'Jogger cómodo en drill stretch, ideal para deporte y día a día.', 18990.00, 'https://leonisa.cr/cdn/shop/files/M2552_700_1200X1500_ultima_1_900x.jpg?v=1703253718', 'Deportivo'),
('Pantalón Cargo Caqui Relax', 'Cargo relajado con múltiples bolsillos y cintura ajustable.', 27900.00, 'https://progresivacr.com/cdn/shop/files/EE2EB036-0729-402C-9956-CE68BABE9449_1800x1800.jpg?v=1716398621', 'Cargo'),
('Pantalón Fluido Relaxed Fit Chocolate', 'Tela fluida, suelta y confortable, estilo relajado moderno.', 27990.00, 'https://static.zara.net/assets/public/bf6d/6ad4/90444dba9f07/fd3265ab17e6/00706662717-p/00706662717-p.jpg?ts=1753874523385&w=1520', 'Fluid'),
('Pantalón Cintura Jogger Confort Khaki', 'Jogger tipo chino con cintura elástica, super cómodo.', 27990.00, 'https://static.zara.net/assets/public/e7e7/edf7/16e24259ad5c/da464b27a720/07484303506-p/07484303506-p.jpg?ts=1739350139178&w=1024', 'Deportivo'),
('Pantalón Chino Skinny Fit Gris Medio', 'Chino delgado y elegante, ideal para oficina o salidas.', 22990.00, 'https://static.zara.net/assets/public/e2a9/ed6f/ffaa4105b6b4/a170669fe099/05070401801-p/05070401801-p.jpg?ts=1753860147809&w=1024', 'Chino');
select * from pantalones
select * from camisas
SELECT * FROM usuario;

USE magicclothesdb;

CREATE TABLE vestidos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10,2),
    precio_anterior DECIMAL(10,2),
    imagen VARCHAR(255),
    categoria VARCHAR(100)
);

INSERT INTO vestidos (nombre, descripcion, precio, imagen, categoria) VALUES
('Vestido Azul Pastel Estilo Satinado', 'Vestido con caída fluida y tela tipo satén, perfecto para salidas casuales o eventos de día.', 22900, 'https://static.bershka.net/assets/public/4cbd/0676/8d0a455e83a5/246fc5a12081/05638187462-p/05638187462-p.jpg?ts=1753358641927&w=800', 'vestidos'),
('Vestido Blanco con Volantes', 'Vestido blanco con diseño juvenil, tirantes delgados y volantes en la parte inferior. Ideal para clima cálido.', 24900, 'https://static.bershka.net/assets/public/c344/9e59/ab314a9c9245/bdeb8d12a9e6/00730207250-p/00730207250-p.jpg?ts=1743595544514&w=800', 'vestidos'),
('Vestido Negro Entallado de Manga Larga', 'Vestido de manga larga ajustado al cuerpo, ideal para salidas nocturnas o cenas elegantes.', 27900, 'https://static.bershka.net/assets/public/84a5/97c4/fce44c1b9444/65c70fde7c42/05758360800-p/05758360800-p.jpg?ts=1752741997305&w=800', 'vestidos'),
('Vestido Beige Casual Oversize', 'Vestido beige suelto, cómodo y con estilo relajado, perfecto para el día a día.', 23900, 'https://static.bershka.net/assets/public/3fce/4be8/ad174a93b852/a60d7c648444/05853222710-p/05853222710-p.jpg?ts=1752761279360&w=750', 'vestidos'),
('Vestido Celeste Cut-Out', 'Vestido corto con recortes laterales y escote pronunciado, ideal para eventos y moda veraniega.', 26900, 'https://static.bershka.net/assets/public/23be/eb00/22014f6fad84/6e34630d9dc0/00626074428-p/00626074428-p.jpg?ts=1746628801483&w=750', 'vestidos'),
('Vestido Gris Minimalista', 'Vestido gris básico sin mangas, ideal para combinar con accesorios llamativos.', 19900, 'https://static.bershka.net/assets/public/a519/cd1e/87264937ad75/8c500948633b/05853222400-p/05853222400-p.jpg?ts=1752761279924&w=750', 'vestidos'),
('Vestido Estilo Deportivo Azul', 'Vestido casual con estilo deportivo, cuello redondo y silueta recta.', 20900, 'https://static.bershka.net/assets/public/4cbd/0676/8d0a455e83a5/246fc5a12081/05638187462-p/05638187462-p.jpg?ts=1753358641927&w=750', 'vestidos'),
('Vestido Rojo Encaje Cruzado', 'Vestido entallado en rojo con tirantes cruzados, ideal para destacar en cualquier evento.', 29900, 'https://static.bershka.net/assets/public/9e55/e761/e8d040be92f5/cc9972fb55db/05700376675-a4o/05700376675-a4o.jpg?ts=1751363465639&w=750', 'vestidos'),
('Vestido Naranja Texturizado', 'Vestido con textura sutil y color llamativo, ideal para primavera y verano.', 21900, 'https://static.bershka.net/assets/public/63ea/d98a/e084475c8b60/999b2fcab3cc/00757494600-p/00757494600-p.jpg?ts=1748522014809&w=750', 'vestidos'),
('Vestido Denim Claro Oversize', 'Vestido estilo camisero en mezclilla clara, perfecto para un look casual desenfadado.', 25900, 'https://static.bershka.net/assets/public/6cc0/56f1/03ed4f168e26/0f5545bbca2f/03489180428-28-p/03489180428-28-p.jpg?ts=1749035074881&w=750', 'vestidos');

CREATE TABLE accesorios (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio DOUBLE NOT NULL,
    precio_anterior DOUBLE,
    imagen TEXT
);

DELETE FROM accesorios;
SET SQL_SAFE_UPDATES = 0;
DELETE FROM vestidos;
DELETE FROM accesorios;
SET SQL_SAFE_UPDATES = 1;
INSERT INTO accesorios (nombre, descripcion, precio, precio_anterior, imagen) VALUES
('Collar dorado elegante', 'Collar con diseño moderno dorado, ideal para ocasiones especiales.', 12900, NULL, 'https://static.bershka.net/assets/public/2a91/1b40/9fcb43eeb0df/5f685b9d6b56/09392678302-03-a4o/09392678302-03-a4o.jpg'),

('Pulsera con dije metálico', 'Pulsera ajustable con detalle en forma de corazón.', 8500, NULL, 'https://static.bershka.net/assets/public/9008/7348/f0144872b309/de68b138018c/09391678302-03-a4o/09391678302-03-a4o.jpg'),

('Gafas de sol cuadradas', 'Estilo moderno con protección UV400.', 7500, NULL, 'https://static.bershka.net/assets/public/aaf4/671b/271e451d98c0/78f68f07845d/04297419400-03-a4o/04297419400-03-a4o.jpg'),

('Collar con piedras multicolor', 'Diseño versátil y elegante para combinar con todo.', 10900, 13900, 'https://static.bershka.net/assets/public/6d11/d125/0ca34994bf76/773dea7f0362/04457023302-a4o/04457023302-a4o.jpg'),

('Set de anillos metálicos', 'Incluye 6 anillos con diferentes formas y acabados.', 6900, NULL, 'https://static.bershka.net/assets/public/953f/9eca/d3904812b5fe/73e219b19a2c/09450678808-a4o/09450678808-a4o.jpg'),

('Bufanda tejida oversized', 'Accesorio ideal para el invierno. Suave y cómoda.', 14900, NULL, 'https://static.bershka.net/assets/public/107f/14e1/172e4befb40e/a83293e5adf3/09132423711-a4o/09132423711-a4o.jpg?ts=1726571490374&w=450'),

('Gorra tipo beisbolera', 'Gorra casual de ala curva con bordado frontal.', 8900, NULL, 'https://static.bershka.net/assets/public/af9e/519e/33134cbea760/11c089654a51/09243702401-03-a4o/09243702401-03-a4o.jpg?ts=1751988434262&w=800'),

('Cinturón con hebilla rectangular', 'Cinturón ajustable de cuero sintético.', 11900, 13500, 'https://static.bershka.net/assets/public/ebd4/720d/7ba3413caee0/e93ba864616a/04239486700-a2d/04239486700-a2d.jpg?ts=1738079784699&w=800'),

('Set de aretes variados', '10 piezas con diferentes formas: estrellas, perlas y más.', 9900, NULL, 'https://static.bershka.net/assets/public/c948/ef35/9d684a0bafb8/b6d2a1154fce/04562486302-a4o/04562486302-a4o.jpg?ts=1740989292008&w=800'),

('Bolso tipo clutch', 'Bolso pequeño de mano ideal para fiestas o eventos.', 19900, 23900, 'https://static.bershka.net/assets/public/f057/5ff3/ffab40aeab5f/2b90c8015319/04093626717-a4o/04093626717-a4o.jpg?ts=1746521563972&w=750'),

('Sombrero estilo pescador', 'Perfecto para días soleados o de lluvia ligera.', 7900, NULL, 'https://static.bershka.net/assets/public/3d49/6ac5/383846b8a6cc/d93d7927fb83/09698423805-a4o/09698423805-a4o.jpg?ts=1753791247718&w=800');