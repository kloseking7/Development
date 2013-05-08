DROP TABLE IF EXISTS `a8471551_naam`.`paathpage`;
CREATE  TABLE `a8471551_naam`.`paathpage` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `paathid` INT NULL ,
  `starttimesec` DOUBLE NULL ,
  `endtimesec` DOUBLE NULL ,
  `pagenum` INT NULL ,
  PRIMARY KEY (`id`) ,
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) ,
  INDEX `fk_paathpage_paath_paathid` (`paathid` ASC) ,
  CONSTRAINT `fk_paathpage_paath_paathid`
    FOREIGN KEY (`paathid` )
    REFERENCES `a8471551_naam`.`paath` (`id` )
    ON DELETE RESTRICT
    ON UPDATE RESTRICT)
DEFAULT CHARACTER SET = utf8;
