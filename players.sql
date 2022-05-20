CREATE TABLE `players` (
  `player_id` int NOT NULL AUTO_INCREMENT,
  `firstname` varchar(45) NOT NULL,
  `lastname` varchar(45) NOT NULL,
  `age` int NOT NULL,
  `category` varchar(45) NOT NULL,
  `country` varchar(45) NOT NULL,
  `ranking` int NOT NULL,
  `hand` varchar(45) NOT NULL,
  `nb_timePlayed` int NOT NULL,
  `nb_win` int NOT NULL,
  PRIMARY KEY (`player_id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `info_team06_schema`.`players` (`player_id`, `firstname`, `lastname`, `age`, `category`, `country`, `ranking`, `hand`, `nb_timePlayed`, `nb_win`) VALUES ('1', 'Novak', 'Djokovic', '34', 'Men', 'Serbia', '1', 'Left', '140', '3');
INSERT INTO `info_team06_schema`.`players` (`player_id`, `firstname`, `lastname`, `age`, `category`, `country`, `ranking`, `hand`, `nb_timePlayed`, `nb_win`) VALUES ('2', 'Iga', 'Swiatek', '20', 'Women', 'Poland', '4', 'Right', '110', '1');
INSERT INTO `info_team06_schema`.`players` (`player_id`, `firstname`, `lastname`, `age`, `category`, `country`, `ranking`, `hand`, `nb_timePlayed`, `nb_win`) VALUES ('3', 'Angeline', 'Ha', '21', 'Women', 'France', '15', 'Left', '90', '1');
INSERT INTO `info_team06_schema`.`players` (`player_id`, `firstname`, `lastname`, `age`, `category`, `country`, `ranking`, `hand`, `nb_timePlayed`, `nb_win`) VALUES ('4', 'Rafael', 'Nadal', '35', 'Men', 'Spain', '14', 'Right', '90', '0');
INSERT INTO `info_team06_schema`.`players` (`player_id`, `firstname`, `lastname`, `age`, `category`, `country`, `ranking`, `hand`, `nb_timePlayed`, `nb_win`) VALUES ('28', 'Reda', 'Khermach', '21', 'Men', 'Morocco', '4', 'Right', '125', '2');
INSERT INTO `info_team06_schema`.`players` (`player_id`, `firstname`, `lastname`, `age`, `category`, `country`, `ranking`, `hand`, `nb_timePlayed`, `nb_win`) VALUES ('29', 'Daniil', 'Medvedev', '26', 'Men', 'Russia', '2', 'Right', '100', '2');
INSERT INTO `info_team06_schema`.`players` (`player_id`, `firstname`, `lastname`, `age`, `category`, `country`, `ranking`, `hand`, `nb_timePlayed`, `nb_win`) VALUES ('30', 'Alexander', 'Zverev', '24', 'Men', 'Germany', '3', 'Right', '75', '1');
INSERT INTO `info_team06_schema`.`players` (`player_id`, `firstname`, `lastname`, `age`, `category`, `country`, `ranking`, `hand`, `nb_timePlayed`, `nb_win`) VALUES ('31', 'Stefanos', 'Tsitsipas', '23', 'Men', 'Greece', '5', 'Right', '120', '0');
INSERT INTO `info_team06_schema`.`players` (`player_id`, `firstname`, `lastname`, `age`, `category`, `country`, `ranking`, `hand`, `nb_timePlayed`, `nb_win`) VALUES ('32', 'Ashleigh', 'Barty', '25', 'Women', 'Australia', '1', 'Right', '87', '1');
INSERT INTO `info_team06_schema`.`players` (`player_id`, `firstname`, `lastname`, `age`, `category`, `country`, `ranking`, `hand`, `nb_timePlayed`, `nb_win`) VALUES ('33', 'Barbora', 'Krejcikova', '26', 'Women', 'Czechia', '9', 'Right', '92', '0');
INSERT INTO `info_team06_schema`.`players` (`player_id`, `firstname`, `lastname`, `age`, `category`, `country`, `ranking`, `hand`, `nb_timePlayed`, `nb_win`) VALUES ('34', 'Aryna', 'Sabalenka', '23', 'Women', 'Belarus', '25', 'Right', '113', '1');
INSERT INTO `info_team06_schema`.`players` (`player_id`, `firstname`, `lastname`, `age`, `category`, `country`, `ranking`, `hand`, `nb_timePlayed`, `nb_win`) VALUES ('35', 'Anett', 'Kontaveit', '26', 'Women', 'Estonia', '3', 'Right', '85', '1');
