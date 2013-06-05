CREATE DATABASE  IF NOT EXISTS `webinvoice` /*!40100 DEFAULT CHARACTER SET utf8 */;

--
-- Table structure for table `email`
--

DROP TABLE IF EXISTS `webinvoice`.`email`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `webinvoice` .`email` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `emailAddress` varchar(50) DEFAULT NULL,
  `userID` bigint(20) DEFAULT NULL,
  `isPrimary` boolean DEFAULT 0,
  PRIMARY KEY (`id`),
  KEY `user_email_fk` (`userID`),
  CONSTRAINT `user_email_fk` FOREIGN KEY (`userID`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8;

