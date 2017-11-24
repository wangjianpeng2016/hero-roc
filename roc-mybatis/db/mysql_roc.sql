/*
 Navicat Premium Data Transfer

 Source Server         : 115.28.158.223-exercise
 Source Server Type    : MySQL
 Source Server Version : 50637
 Source Host           : 115.28.158.223
 Source Database       : mysql_roc

 Target Server Type    : MySQL
 Target Server Version : 50637
 File Encoding         : utf-8

 Date: 11/24/2017 20:45:37 PM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `mybatis_person`
-- ----------------------------
DROP TABLE IF EXISTS `mybatis_person`;
CREATE TABLE `mybatis_person` (
  `id_` int(11) NOT NULL AUTO_INCREMENT,
  `name_` varchar(255) DEFAULT NULL,
  `age_` int(11) DEFAULT NULL,
  `profile_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id_`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `mybatis_person`
-- ----------------------------
BEGIN;
INSERT INTO `mybatis_person` VALUES ('1', 'Person-A', '73', '11'), ('2', 'Person-B', '41', '12'), ('3', 'Person-C', '53', '13'), ('4', 'Person-D', '45', '14'), ('5', 'Person-E', '20', '15'), ('6', 'Person-F', '63', '16'), ('7', 'Person-G', '19', '17'), ('8', 'Person-H', '88', '18'), ('9', 'Person-I', '94', '19'), ('10', 'Person-J', '7', '20'), ('11', 'Person-K', '58', '21'), ('12', 'Person-L', '93', '22'), ('13', 'Person-M', '66', '23'), ('14', 'Person-N', '9', '24'), ('15', 'Person-O', '42', '25'), ('16', 'Person-P', '40', '26'), ('17', 'Person-Q', '81', '27'), ('18', 'Person-R', '32', '28'), ('19', 'Person-S', '62', '29'), ('20', 'Person-T', '29', '30'), ('21', 'Person-U', '63', '31'), ('22', 'Person-V', '79', '32'), ('23', 'Person-W', '85', '33'), ('24', 'Person-X', '95', '34'), ('25', 'Person-Y', '91', '35'), ('26', 'Person-Z', '82', '36');
COMMIT;

-- ----------------------------
--  Table structure for `mybatis_personal_profile`
-- ----------------------------
DROP TABLE IF EXISTS `mybatis_personal_profile`;
CREATE TABLE `mybatis_personal_profile` (
  `id_` int(11) NOT NULL AUTO_INCREMENT,
  `address_` varchar(255) DEFAULT NULL,
  `phone_num` bigint(11) DEFAULT NULL,
  PRIMARY KEY (`id_`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `mybatis_personal_profile`
-- ----------------------------
BEGIN;
INSERT INTO `mybatis_personal_profile` VALUES ('11', '天津', '18600000001'), ('12', '北京', '18600000002'), ('13', '上海', '18600000003'), ('14', '重庆', '18600000004'), ('15', '深圳', '18600000005'), ('16', '杭州', '18600000006'), ('17', '广州', '18600000007'), ('18', '大连', '18600000008'), ('19', '西安', '18600000009'), ('20', '长沙', '18600000010'), ('21', '武汉', '18600000011'), ('22', '南京', '18600000012'), ('23', '保定', '18600000013'), ('24', '廊坊', '18600000014'), ('25', '石家庄', '18600000015'), ('26', '平顶山', '18600000016'), ('27', '贵阳', '18600000017'), ('28', '厦门', '18600000018'), ('29', '福州', '18600000019'), ('30', '泉州', '18600000020'), ('31', '温州', '18600000021'), ('32', '成都', '18600000022'), ('33', '宜宾', '18600000023'), ('34', '泸州', '18600000024'), ('35', '武昌', '18600000025'), ('36', '宁波', '18600000026');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
