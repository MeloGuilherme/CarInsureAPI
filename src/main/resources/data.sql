-- Inserção de dados
INSERT INTO cars (model, manufacturer, production_year, fipe_value)
VALUES
('Carro 1', 'Fabricante 1', '2020', 25000.0),
('Carro 2', 'Fabricante 2', '2019', 22000.0),
('Carro 3', 'Fabricante 3', '2021', 27000.0);

INSERT INTO drivers (document, birthdate)
VALUES
('12345678901', '1990-01-15'),
('98765432109', '1985-07-22'),
('45678901234', '1995-03-30');

INSERT INTO car_drivers (driver_id, car_id, is_main_driver)
VALUES
(1, 1, true),
(2, 2, true),
(3, 3, true);

INSERT INTO customers (name, driver_id)
VALUES
('Cliente 1', 1),
('Cliente 2', 2),
('Cliente 3', 3);

INSERT INTO insurances (customer_id, creation_dt, update_dt, car_id, is_active)
VALUES
(1, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 1, true),
(2, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 2, true),
(3, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 3, true);

INSERT INTO claims (car_id, driver_id, event_date)
VALUES
(1, 1, '2023-09-25'),
(2, 2, '2023-09-24'),
(3, 3, '2023-09-23');
