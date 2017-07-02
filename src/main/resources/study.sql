/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50710
Source Host           : localhost:3306
Source Database       : study

Target Server Type    : MYSQL
Target Server Version : 50710
File Encoding         : 65001

Date: 2017-07-02 16:06:25
*/

SET FOREIGN_KEY_CHECKS=0;

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
