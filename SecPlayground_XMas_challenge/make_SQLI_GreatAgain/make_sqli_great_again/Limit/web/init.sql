ALTER USER 'root'@'localhost' IDENTIFIED BY 'rootpass';

CREATE DATABASE IF NOT EXISTS mydb;
USE mydb;

CREATE TABLE IF NOT EXISTS products (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  price DECIMAL(10,2) NOT NULL,
  description TEXT
);

INSERT INTO products (name, price, description) VALUES
('Tablet', 350.00, 'Lightweight tablet with long battery life'),
('Smartwatch', 199.99, 'Water-resistant smartwatch with fitness tracking'),
('Monitor', 299.99, '27-inch 4K monitor'),
('Keyboard', 49.99, 'Mechanical keyboard with RGB'),
('Mouse', 29.99, 'Wireless ergonomic mouse'),
('Desk Lamp', 39.99, 'LED desk lamp with adjustable brightness'),
('External SSD', 129.99, 'Portable 1TB SSD with USB-C');
