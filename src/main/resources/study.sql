/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50710
Source Host           : localhost:3306
Source Database       : study

Target Server Type    : MYSQL
Target Server Version : 50710
File Encoding         : 65001

Date: 2017-07-03 21:37:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for clazz
-- ----------------------------
DROP TABLE IF EXISTS `clazz`;
CREATE TABLE `clazz` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of clazz
-- ----------------------------
INSERT INTO `clazz` VALUES ('4', '1班');
INSERT INTO `clazz` VALUES ('5', '2班');
INSERT INTO `clazz` VALUES ('6', '3班');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('2', 'USER');
INSERT INTO `role` VALUES ('3', 'ADMIN');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `gender` tinyint(1) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `clazz` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `clazz_id` (`clazz`),
  CONSTRAINT `student_ibfk_1` FOREIGN KEY (`clazz`) REFERENCES `clazz` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('35', '张三', '18', '1', '2017-07-03', '4');
INSERT INTO `student` VALUES ('36', '李四', '19', '1', '2017-07-03', '5');
INSERT INTO `student` VALUES ('37', '王二', '19', '1', '2017-07-03', '4');
INSERT INTO `student` VALUES ('38', '麻', '19', '1', '2017-07-03', '5');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `gender` tinyint(1) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `balance` int(11) DEFAULT NULL,
  `register_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('20', 'mybatis', '30', '1', '1992-12-17', '100', '2017-07-01 20:42:20');
INSERT INTO `user` VALUES ('22', '张三', '18', '1', '1990-11-17', '100', '2017-07-01 21:23:11');
INSERT INTO `user` VALUES ('23', '张三', '18', '1', '1990-11-17', '100', '2017-07-01 21:26:46');
INSERT INTO `user` VALUES ('24', '张三', '18', '1', '1990-11-17', '100', '2017-07-01 21:31:49');
INSERT INTO `user` VALUES ('26', 'mybatis', '30', '1', '1992-11-17', '100', '2017-07-01 21:35:45');
INSERT INTO `user` VALUES ('29', '李四', '30', '1', '1992-11-17', '100', '2017-07-01 21:40:10');
INSERT INTO `user` VALUES ('31', 'spring-boot-mybatis', '25', '1', '1992-11-17', '100', '2017-07-02 13:34:26');
INSERT INTO `user` VALUES ('33', 'spring-boot-mybatis', '30', '1', '1992-11-17', '100', '2017-07-02 13:47:53');
SET FOREIGN_KEY_CHECKS=1;
