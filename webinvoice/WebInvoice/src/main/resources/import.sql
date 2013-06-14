--role
--INSERT INTO `webinvoice`.`role` (`id`, `name`) VALUES (1, 'USER');
--INSERT INTO `webinvoice`.`role` (`id`, `name`) VALUES (2, 'ADMIN');

--user
INSERT INTO `webinvoice`.`user` (`id`, `firstname`, `lastname`, `logintimestamp`, `password`, `username`, `role`) VALUES (1, 'Manpreet', 'Sushil', '2013-05-10 10:00:00', 'passwd', 'manssster', 'ADMIN');
INSERT INTO `webinvoice`.`user` (`id`, `firstname`, `lastname`, `logintimestamp`, `password`, `username`, `role`) VALUES (2, 'Alex ', 'Wang', '2013-05-10 10:00:00', 'passwd', 'alex', 'ADMIN');
INSERT INTO `webinvoice`.`email`(`id`, `emailAddress`, `isPrimary`, `userID`) values(1,'wayf128@hotmail.com',1,2);
