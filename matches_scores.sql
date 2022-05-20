CREATE TABLE `matches_score` (
  `idmatches_score` int NOT NULL,
  `set_number` int NOT NULL,
  `player1_score` int DEFAULT NULL,
  `player2_score` int DEFAULT NULL,
  `matches_id` int NOT NULL,
  PRIMARY KEY (`idmatches_score`),
  KEY `matches_id_idx` (`matches_id`),
  CONSTRAINT `matches_id` FOREIGN KEY (`matches_id`) REFERENCES `matches` (`match_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('1', '1', '7', '6', '1');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('2', '2', '2', '6', '1');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('3', '3', '6', '3', '1');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('4', '1', '6', '5', '2');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('5', '2', '4', '6', '2');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('6', '3', '6', '0', '2');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('7', '1', '6', '4', '3');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('8', '2', '6', '0', '3');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('9', '3', '0', '0', '3');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('10', '1', '6', '2', '4');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('11', '2', '1', '6', '4');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('12', '3', '6', '0', '4');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('13', '1', '7', '6', '5');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('14', '2', '6', '7', '5');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('15', '3', '6', '2', '5');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('16', '1', '6', '2', '6');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('17', '2', '1', '6', '6');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('18', '3', '6', '3', '6');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('19', '1', '1', '6', '7');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('20', '2', '2', '6', '7');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('21', '3', '0', '0', '7');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('22', '1', '5', '6', '8');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('23', '2', '6', '2', '8');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('24', '3', '6', '7', '8');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('25', '1', '2', '6', '9');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('26', '2', '6', '4', '9');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('27', '3', '4', '6', '9');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('28', '1', '1', '6', '10');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('29', '2', '6', '5', '10');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('30', '3', '6', '7', '10');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('31', '1', '7', '6', '11');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('32', '2', '6', '7', '11');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('33', '3', '6', '0', '11');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('34', '1', '6', '4', '12');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('35', '2', '3', '6', '12');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('36', '3', '6', '2', '12');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('37', '1', '6', '0', '13');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('38', '2', '5', '6', '13');
INSERT INTO `info_team06_schema`.`matches_score` (`idmatches_score`, `set_number`, `player1_score`, `player2_score`, `matches_id`) VALUES ('39', '3', '7', '6', '13');

