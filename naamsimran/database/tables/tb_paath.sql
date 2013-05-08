DROP TABLE IF EXISTS `a8471551_naam`.`paath`;
CREATE  TABLE `a8471551_naam`.`paath` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `paathname` VARCHAR(256) NOT NULL ,
  `paathdesc` VARCHAR(512) NULL ,
  `paathnamegurmukhi` VARCHAR(256) NULL ,
  `paathaudiolink` VARCHAR(512) NULL ,
  `paathdownloadlink` VARCHAR(512) NULL ,
  PRIMARY KEY (`id`) )
DEFAULT CHARACTER SET = utf8;

  
