-- Crear tabla CARGO 
CREATE TABLE CARGO (
    ID_CARGO INT PRIMARY KEY,
    NOMBRE_CARGO VARCHAR(100)
);

-- Crear tabla EMPLEADO
CREATE TABLE EMPLEADO (
    ID_EMPLEADO       INT PRIMARY KEY,
    ID_CARGO          INT,
    NOMBRE_EMP        VARCHAR(100),
    APELLIDO_EMP      VARCHAR(100),
    FOREIGN KEY (ID_CARGO) REFERENCES CARGO(ID_CARGO)
);

-- Crear tabla CLIENTE 
CREATE TABLE CLIENTE (
    ID_CLIENTE        INT PRIMARY KEY,
    NOMBRE_CLI        VARCHAR(10),
    APELLIDO_CLI      VARCHAR(20),
    DIRECCION_CLI     VARCHAR(200),
    TELF_CLI          VARCHAR(15),
    RUC_CLI           VARCHAR(13)
);
-- Crear tabla PROVINCIA
CREATE TABLE PROVINCIA (
    ID_PROVINCIA INT PRIMARY KEY,
    NOMBRE_PROVINCIA VARCHAR(100)
);

-- Crear tabla CIUDAD
CREATE TABLE CAPITAL (
    ID_CAPITAL INT PRIMARY KEY,
    NOMBRE_CAPITAL VARCHAR(100),
    ID_PROVINCIA INT,
    FOREIGN KEY (ID_PROVINCIA) REFERENCES PROVINCIA(ID_PROVINCIA)
);

-- Crear tabla SUCURSAL
CREATE TABLE SUCURSAL (
    ID_SUCURSAL      INT PRIMARY KEY,
    NOMBRE_SUC       VARCHAR(100),
    ID_CAPITAL       INT,
    DIRECCION_SUC    VARCHAR(100),
    FOREIGN KEY (ID_CAPITAL) REFERENCES CAPITAL(ID_CAPITAL)
);

-- Crear tabla PRODUCTO 
CREATE TABLE PRODUCTO (
    ID_PRODUCTO      INT PRIMARY KEY,
    NOMBRE_PROD      VARCHAR(100),
    PRECIO_UNIT      DECIMAL(10,2)
);

-- Crear tabla DETALLE_PRODUCTO
CREATE TABLE DETALLE_PRODUCTO (
    ID_DETALLE       INT PRIMARY KEY,
    ID_PRODUCTO      INT,
    CANTIDAD         INT,
    FOREIGN KEY (ID_PRODUCTO) REFERENCES PRODUCTO(ID_PRODUCTO)
);
-- Crear tabla FACTURA
CREATE TABLE FACTURA (
    ID_FACTURA INT PRIMARY KEY,
    ID_CLIENTE INT,
    FECHA DATE,
    TOTAL DECIMAL(10, 2),
    FOREIGN KEY (ID_CLIENTE) REFERENCES CLIENTE(ID_CLIENTE)
);

-- Crear tabla DETALLE_FACTURA 
CREATE TABLE DETALLE_FACTURA (
    ID_DETALLE       INT PRIMARY KEY,
    ID_FACTURA       INT,
    ID_PRODUCTO      INT,
    CANTIDAD         INT,
    SUBTOTAL         DECIMAL(10, 2),
    FOREIGN KEY (ID_FACTURA)  REFERENCES FACTURA(ID_FACTURA),
    FOREIGN KEY (ID_PRODUCTO) REFERENCES PRODUCTO(ID_PRODUCTO)
);

-- Crear tabla RECIBO
CREATE TABLE RECIBO (
    ID_RECIBO        INT PRIMARY KEY,
    ID_EMPLEADO      INT,
    ID_CLIENTE       INT,
    ID_SUCURSAL      INT,
    ID_PRODUCTO      INT, 
    ID_DETALLE       INT,
    FECHA            DATE,
    TOTAL            DECIMAL(10, 2),
    FOREIGN KEY (ID_EMPLEADO) REFERENCES EMPLEADO(ID_EMPLEADO),
    FOREIGN KEY (ID_CLIENTE)  REFERENCES CLIENTE(ID_CLIENTE),
    FOREIGN KEY (ID_SUCURSAL) REFERENCES SUCURSAL(ID_SUCURSAL),
    FOREIGN KEY (ID_PRODUCTO) REFERENCES PRODUCTO(ID_PRODUCTO),
    FOREIGN KEY (ID_DETALLE)  REFERENCES DETALLE_PRODUCTO(ID_DETALLE)
);