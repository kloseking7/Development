CREATE DATABASE  IF NOT EXISTS `webinvoice` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `webinvoice`;
-- MySQL dump 10.13  Distrib 5.5.9, for Win32 (x86)
--
-- Host: localhost    Database: webinvoice
-- ------------------------------------------------------
-- Server version	5.5.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `autonum`
--

DROP TABLE IF EXISTS `autonum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `autonum` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `prefix` bigint(20) DEFAULT NULL,
  `number` bigint(20) DEFAULT NULL,
  `suffix` bigint(20) DEFAULT NULL,
  `userID` bigint(20) DEFAULT NULL,
  `clientID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `auton_client_fk` (`clientID`),
  KEY `auton_user_fk` (`clientID`),
  CONSTRAINT `auton_client_fk` FOREIGN KEY (`clientID`) REFERENCES `person` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `auton_user_fk` FOREIGN KEY (`clientID`) REFERENCES `person` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autonum`
--

LOCK TABLES `autonum` WRITE;
/*!40000 ALTER TABLE `autonum` DISABLE KEYS */;
/*!40000 ALTER TABLE `autonum` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-05-06 23:17:33