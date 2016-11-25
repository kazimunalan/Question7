CREATE DATABASE  IF NOT EXISTS 'userdb';
USE 'tasksdb';

CREATE TABLE `tasksdb`.`t_tasks` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `surname` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
