CREATE TABLE `users` (
  `uid` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `account_type` varchar(45) NOT NULL,
  `pwd` varchar(45) NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `info_team06_schema`.`users` (`uid`, `username`, `account_type`, `pwd`) VALUES ('1', 'root', 'admin', 'rootoor');
INSERT INTO `info_team06_schema`.`users` (`uid`, `username`, `account_type`, `pwd`) VALUES ('2', 'reda', 'admin', 'reda123');
INSERT INTO `info_team06_schema`.`users` (`uid`, `username`, `account_type`, `pwd`) VALUES ('3', 'loukas', 'admin', 'loukas123');
INSERT INTO `info_team06_schema`.`users` (`uid`, `username`, `account_type`, `pwd`) VALUES ('4', 'pablo', 'admin', 'pablo123');
INSERT INTO `info_team06_schema`.`users` (`uid`, `username`, `account_type`, `pwd`) VALUES ('5', 'angeline', 'admin', 'angeline12');
INSERT INTO `info_team06_schema`.`users` (`uid`, `username`, `account_type`, `pwd`) VALUES ('6', 'nedhir', 'admin', 'nedhir123');
INSERT INTO `info_team06_schema`.`users` (`uid`, `username`, `account_type`, `pwd`) VALUES ('7', 'fft_admin', 'admin', 'fftadmin123');