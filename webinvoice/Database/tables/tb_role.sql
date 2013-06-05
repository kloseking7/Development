CREATE DATABASE  IF NOT EXISTS `webinvoice` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `webinvoice`;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
CREATE TABLE `webinvoice` .`role` (
  `id` bigint(20) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
