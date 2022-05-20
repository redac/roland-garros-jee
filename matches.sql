CREATE TABLE `matches` (
  `match_num` int NOT NULL,
  `date` datetime DEFAULT NULL,
  `player1_id` int NOT NULL,
  `player2_id` int NOT NULL,
  `winner_id` int DEFAULT NULL,
  `looser_id` int DEFAULT NULL,
  PRIMARY KEY (`match_num`),
  KEY `player1_id_idx` (`player1_id`),
  KEY `player2_id_idx` (`player2_id`),
  CONSTRAINT `player1_id` FOREIGN KEY (`player1_id`) REFERENCES `players` (`player_id`),
  CONSTRAINT `player2_id` FOREIGN KEY (`player2_id`) REFERENCES `players` (`player_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `info_team06_schema`.`matches` (`match_num`, `date`, `player1_id`, `player2_id`, `winner_id`, `looser_id`) VALUES ('1', '2022-10-02 15:30:00', '1', '2', '1', '2');
INSERT INTO `info_team06_schema`.`matches` (`match_num`, `date`, `player1_id`, `player2_id`, `winner_id`, `looser_id`) VALUES ('2', '2022-10-02 15:30:00', '3', '4', '3', '4');
INSERT INTO `info_team06_schema`.`matches` (`match_num`, `date`, `player1_id`, `player2_id`, `winner_id`, `looser_id`) VALUES ('3', '2022-10-02 15:30:00', '28', '29', '28', '29');
INSERT INTO `info_team06_schema`.`matches` (`match_num`, `date`, `player1_id`, `player2_id`, `winner_id`, `looser_id`) VALUES ('4', '2022-10-10 15:30:00', '30', '31', '30', '31');
INSERT INTO `info_team06_schema`.`matches` (`match_num`, `date`, `player1_id`, `player2_id`, `winner_id`, `looser_id`) VALUES ('5', '2022-10-09 15:30:00', '32', '33', '32', '33');
INSERT INTO `info_team06_schema`.`matches` (`match_num`, `date`, `player1_id`, `player2_id`, `winner_id`, `looser_id`) VALUES ('6', '2022-10-08 15:30:00', '34', '35', '34', '35');
INSERT INTO `info_team06_schema`.`matches` (`match_num`, `date`, `player1_id`, `player2_id`, `winner_id`, `looser_id`) VALUES ('7', '2022-10-01 15:30:00', '1', '29', '29', '1');
INSERT INTO `info_team06_schema`.`matches` (`match_num`, `date`, `player1_id`, `player2_id`, `winner_id`, `looser_id`) VALUES ('8', '2022-10-10 15:30:00', '34', '2', '2', '34');
INSERT INTO `info_team06_schema`.`matches` (`match_num`, `date`, `player1_id`, `player2_id`, `winner_id`, `looser_id`) VALUES ('9', '2022-10-15 15:30:00', '33', '29', '29', '33');
INSERT INTO `info_team06_schema`.`matches` (`match_num`, `date`, `player1_id`, `player2_id`, `winner_id`, `looser_id`) VALUES ('10', '2022-10-22 15:30:00', '30', '28', '28', '30');
INSERT INTO `info_team06_schema`.`matches` (`match_num`, `date`, `player1_id`, `player2_id`, `winner_id`, `looser_id`) VALUES ('11', '2022-10-17 15:30:00', '1', '4', '1', '4');
INSERT INTO `info_team06_schema`.`matches` (`match_num`, `date`, `player1_id`, `player2_id`, `winner_id`, `looser_id`) VALUES ('12', '2022-10-15 20:30:00', '1', '28', '1', '28');
INSERT INTO `info_team06_schema`.`matches` (`match_num`, `date`, `player1_id`, `player2_id`, `winner_id`, `looser_id`) VALUES ('13', '2022-10-10 15:30:00', '35', '1', '35', '1');
