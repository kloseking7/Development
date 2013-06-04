CREATE DATABASE  IF NOT EXISTS `webinvoice` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `webinvoice`;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `webinvoice` .`user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) DEFAULT NULL,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `logintimestamp` datetime DEFAULT NULL,
  `roleID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `role_fk` (`roleID`),
  CONSTRAINT `role_fk` FOREIGN KEY (`roleID`) REFERENCES `role` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
)
