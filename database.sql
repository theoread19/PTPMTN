DROP SCHEMA `KAT_DB`;
CREATE SCHEMA `KAT_DB` DEFAULT CHARACTER SET UTF8MB4;

USE `database`;
DROP DATABASE `KAT_DB`;
CREATE DATABASE `KAT_DB`;
USE `KAT_DB`;

CREATE TABLE `User` (
	`id` INT AUTO_INCREMENT,
    `username` VARCHAR(30) NOT NULL,
    `fullName` VARCHAR(50) NOT NULL,
    `password` VARCHAR(30) NOT NULL,
    `role` VARCHAR(5) NOT NULL,
    CONSTRAINT User_PK PRIMARY KEY (`id`),
    CONSTRAINT User_U UNIQUE (`username`)
) ENGINE = InnoDB;

CREATE TABLE `Beverage` (
	`id` INT AUTO_INCREMENT,
    `name` VARCHAR(30) NOT NULL,
    `price` INT NOT NULL,
    `status` BOOLEAN NOT NULL DEFAULT TRUE,
    CONSTRAINT Beverage_PK PRIMARY KEY (`id`),
    CONSTRAINT Beverage_U UNIQUE (`name`)
) ENGINE = InnoDB;

CREATE TABLE `Bill` (
	`id` INT AUTO_INCREMENT,
    `creatorId` INT,
    `createTime` TIMESTAMP NOT NULL,
    `totalAmount` INT NOT NULL,
    `subtotal` INT NOT NULL,
    `discount` FLOAT NOT NULL,
    `total` FLOAT NOT NULL,
    `cash` INT NOT NULL,
    `change` INT NOT NULL,
    CONSTRAINT Bill_PK PRIMARY KEY (`id`),
    CONSTRAINT creatorId_FK FOREIGN KEY (`creatorId`) REFERENCES `User` (`id`)
) ENGINE = InnoDB;

CREATE TABLE `BillDetail` (
	`billId` INT,
    `beverageId` INT,
    `amount` INT,
    CONSTRAINT billId_FK FOREIGN KEY (`billId`) REFERENCES `Bill` (`id`),
    CONSTRAINT beverageId_FK FOREIGN KEY (`beverageId`) REFERENCES `Beverage` (`id`)
) ENGINE = InnoDB;

INSERT INTO `User` (`username`, `fullName`, `password`, `role`)
	VALUES ("admin", "Admin", "admin", "admin");

SELECT * FROM `User`;