-- Definições das tabelas

CREATE TABLE IF NOT EXISTS cars
(
    id              BIGINT AUTO_INCREMENT PRIMARY KEY,
    model           VARCHAR(255),
    manufacturer    VARCHAR(255),
    production_year VARCHAR(4),
    fipe_value      FLOAT
);

CREATE TABLE IF NOT EXISTS drivers
(
    id        BIGINT AUTO_INCREMENT PRIMARY KEY,
    document  VARCHAR(255),
    birthdate DATE
);

CREATE TABLE IF NOT EXISTS car_drivers
(
    id             BIGINT AUTO_INCREMENT PRIMARY KEY,
    driver_id      BIGINT,
    car_id         BIGINT,
    is_main_driver BOOLEAN,
    FOREIGN KEY (driver_id) REFERENCES drivers (id),
    FOREIGN KEY (car_id) REFERENCES cars (id)
);

CREATE TABLE IF NOT EXISTS customers
(
    id        BIGINT AUTO_INCREMENT PRIMARY KEY,
    name      VARCHAR(255),
    driver_id BIGINT,
    FOREIGN KEY (driver_id) REFERENCES drivers (id)
);

CREATE TABLE IF NOT EXISTS insurances
(
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    customer_id BIGINT,
    creation_dt TIMESTAMP,
    update_dt   TIMESTAMP,
    car_id      BIGINT,
    is_active   BOOLEAN,
    FOREIGN KEY (customer_id) REFERENCES customers (id),
    FOREIGN KEY (car_id) REFERENCES cars (id)
);

CREATE TABLE IF NOT EXISTS claims
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    car_id     BIGINT,
    driver_id  BIGINT,
    event_date DATE,
    FOREIGN KEY (car_id) REFERENCES cars (id),
    FOREIGN KEY (driver_id) REFERENCES drivers (id)
);
