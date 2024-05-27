-- initialize_kakeibo.sql
CREATE DATABASE IF NOT EXISTS kakeibo;

USE kakeibo;

CREATE TABLE IF NOT EXISTS kakeibo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    date DATE NOT NULL,
    category VARCHAR(255) NOT NULL,
    price INT NOT NULL,
    memo TEXT
);

INSERT INTO kakeibo (date, category, price, memo) VALUES 
('2024-05-20', 'Food', 500, 'Lunch at restaurant'),
('2024-05-21', 'Transport', 300, 'Bus fare'),
('2024-05-22', 'Entertainment', 1000, 'Movie ticket'),
('2024-05-23', 'Utilities', 7000, 'Electricity bill'),
('2024-05-24', 'Groceries', 4500, 'Weekly grocery shopping');
