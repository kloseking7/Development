-- sample database script for testing mysql dataaccess component.

-- schema
CREATE DATABASE `sample`;

-- table
CREATE  TABLE `sample`.`customer` (
  `idcustomer` INT NOT NULL AUTO_INCREMENT ,
  `customername` VARCHAR(128) NULL ,
  `birthdate` DATE NULL ,
  PRIMARY KEY (`idcustomer`) ,
  UNIQUE INDEX `idcustomer_UNIQUE` (`idcustomer` ASC) );
  
-- sample data
INSERT INTO `sample`.`customer` (`customername`, `birthdate`) VALUES ('John Smith', '1980-01-01');
INSERT INTO `sample`.`customer` (`customername`, `birthdate`) VALUES ('Richard Woods', '1974-11-11');
INSERT INTO `sample`.`customer` (`customername`, `birthdate`) VALUES ('Gary Sobers', '1981-01-11');

