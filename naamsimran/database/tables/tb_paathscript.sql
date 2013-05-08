DROP TABLE IF EXISTS `a8471551_naam`.`paathscript`;
CREATE  TABLE `a8471551_naam`.`paathscript` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `paathid` INT NOT NULL ,
  `sort` INT NOT NULL ,
  `gurmukhi` VARCHAR(1024) NOT NULL ,
  `phonetic` VARCHAR(1024) NOT NULL ,
  `engtranslation` VARCHAR(2048) NOT NULL ,
  `sectionid` INT NOT NULL ,
  PRIMARY KEY (`id`) ,
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) ,
  INDEX `fk_paathscript_paath_paathid` (`paathid` ASC) ,
  INDEX `fk_paathscript_section_sectionid` (`sectionid` ASC) ,
  CONSTRAINT `fk_paathscript_paath_paathid`
    FOREIGN KEY (`paathid` )
    REFERENCES `a8471551_naam`.`paath` (`id` )
    ON DELETE RESTRICT
    ON UPDATE RESTRICT,
  CONSTRAINT `fk_paathscript_section_sectionid`
    FOREIGN KEY (`sectionid` )
    REFERENCES `a8471551_naam`.`section` (`id` )
    ON DELETE RESTRICT
    ON UPDATE RESTRICT)
DEFAULT CHARACTER SET = utf8;

  