use kat_db;

CREATE TABLE User (
	id INT AUTO_INCREMENT,
    username VARCHAR(30) unique,
    password VARCHAR(30),
    role VARCHAR(5),
    CONSTRAINT User_PK PRIMARY KEY (id)
) ENGINE = InnoDB;

CREATE TABLE Discount(
	id INT AUTO_INCREMENT,
    discountValue FLOAT,
    CONSTRAINT Discount_PK PRIMARY KEY (id)
);

CREATE TABLE Bill (
	id INT AUTO_INCREMENT,
    creatorId INT,
    discountId INT,
    createTime TIMESTAMP,
    total INT,
    totalAmount INT,
    receivedMoney INT,
    changeMoney int,
    CONSTRAINT Bill_PK PRIMARY KEY (id),
    CONSTRAINT creatorId_FK FOREIGN KEY (creatorId) REFERENCES User (id),
    CONSTRAINT discountId_FK FOREIGN KEY (discountId) REFERENCES Discount (id)
) ENGINE = InnoDB;

CREATE TABLE Beverage (
	id INT AUTO_INCREMENT,
    name VARCHAR(30),
    price INT,
    CONSTRAINT Beverage_PK PRIMARY KEY (id)
) ENGINE = InnoDB;

CREATE TABLE BillDetail (
	billId INT,
    beverageId INT,
    amount INT,
    CONSTRAINT billId_FK FOREIGN KEY (billId) REFERENCES Bill (id),
    CONSTRAINT beverageId_FK FOREIGN KEY (beverageId) REFERENCES Beverage (id)
) ENGINE = InnoDB;

INSERT INTO User (username, password, role)
	VALUES ("admin", "admin", "admin");

SELECT * FROM User;