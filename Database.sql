DROP SCHEMA `KAT_DB`;
CREATE SCHEMA `KAT_DB` DEFAULT CHARACTER SET UTF8MB4;

USE `database`;
DROP DATABASE `KAT_DB`;
CREATE DATABASE `KAT_DB`;
USE `KAT_DB`;

CREATE TABLE `User` (
	`id` INT AUTO_INCREMENT,
    `username` VARCHAR(30),
    `password` VARCHAR(30),
    `role` VARCHAR(5),
    CONSTRAINT User_PK PRIMARY KEY (`id`),
    CONSTRAINT User_U UNIQUE (`username`)
) ENGINE = InnoDB;

CREATE TABLE `Bill` (
	`id` INT AUTO_INCREMENT,
    `creatorId` INT,
    `createTime` TIMESTAMP,
    `totalAmount` INT,
    `subtotal` INT,
    `discount` FLOAT,
    `total` FLOAT,
    `cash` INT,
    `change` INT,
    CONSTRAINT Bill_PK PRIMARY KEY (`id`),
    CONSTRAINT creatorId_FK FOREIGN KEY (`creatorId`) REFERENCES `User` (`id`)
) ENGINE = InnoDB;

CREATE TABLE `Beverage` (
	`id` INT AUTO_INCREMENT,
    `name` VARCHAR(30),
    `price` INT,
    CONSTRAINT Beverage_PK PRIMARY KEY (`id`),
    CONSTRAINT Beverage_U UNIQUE (`name`)
) ENGINE = InnoDB;

CREATE TABLE `BillDetail` (
	`billId` INT,
    `beverageId` INT,
    `amount` INT,
    CONSTRAINT billId_FK FOREIGN KEY (`billId`) REFERENCES `Bill` (`id`),
    CONSTRAINT beverageId_FK FOREIGN KEY (`beverageId`) REFERENCES `Beverage` (`id`)
) ENGINE = InnoDB;

INSERT INTO `User` (`username`, `password`, `role`)
	VALUES ("admin", "admin", "admin");

SELECT * FROM `User`;