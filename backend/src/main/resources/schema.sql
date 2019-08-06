CREATE TABLE customers (
  id        SERIAL PRIMARY KEY,
  firstName VARCHAR(20)  NOT NULL,
  lastName  VARCHAR(20)  NOT NULL,
  email     VARCHAR(100) NOT NULL,
  login     VARCHAR(30)  NOT NULL,
  password  VARCHAR(255)  NOT NULL
);

CREATE TABLE products (
  id     SERIAL PRIMARY KEY,
  name   VARCHAR(20)                 NOT NULL,
  price  INTEGER CHECK (price > 0)   NOT NULL,
  amount INTEGER
);


CREATE TABLE orders (
  id         SERIAL PRIMARY KEY,
  customerId INTEGER REFERENCES customers (id) NOT NULL,
  address    VARCHAR(100),
  date       TIME
);