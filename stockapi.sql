-- MySQL dump 10.13  Distrib 8.0.27, for macos11 (x86_64)
--
-- Host: localhost    Database: stockapi
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bwibbu`
--

DROP TABLE IF EXISTS `bwibbu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bwibbu` (
  `code` varchar(5) NOT NULL COMMENT '?∠巨隞??',
  `name` varchar(45) NOT NULL COMMENT '?∠巨?迂',
  `pe_ratio` double NOT NULL COMMENT '?祉?瘥?',
  `dividend_yield` double NOT NULL COMMENT '畾??',
  `pb_ratio` double NOT NULL COMMENT '?∪瘛典潭?',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '?萄遣??',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bwibbu`
--

LOCK TABLES `bwibbu` WRITE;
/*!40000 ALTER TABLE `bwibbu` DISABLE KEYS */;
INSERT INTO `bwibbu` VALUES ('1101','台泥',14.22,4.9,1.2,'2022-05-11 17:13:24'),('1102','亞泥',10.94,7.66,0.95,'2022-05-11 17:13:24'),('1103','嘉泥',16.24,3.67,0.45,'2022-05-11 17:13:24'),('1104','環泥',12.41,4.85,0.7,'2022-05-11 17:13:24'),('1108','幸福',16.77,5.5,0.95,'2022-05-11 17:13:24'),('1109','信大',9.92,7.75,0.82,'2022-05-11 17:13:24'),('1110','東泥',71.85,1.03,1.27,'2022-05-11 17:13:24'),('1201','味全',19.95,2.43,1.48,'2022-05-11 17:13:24'),('1203','味王',16.84,3.38,1.41,'2022-05-11 17:13:24'),('1210','大成',20.41,4.22,1.9,'2022-05-11 17:13:24');
/*!40000 ALTER TABLE `bwibbu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `daily_tranction_stock_data`
--

DROP TABLE IF EXISTS `daily_tranction_stock_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `daily_tranction_stock_data` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `CODE` varchar(45) DEFAULT NULL COMMENT '霅隞??',
  `NAME` varchar(45) DEFAULT NULL COMMENT '霅?迂',
  `TRADE_VOLUME` int DEFAULT NULL COMMENT '?漱?⊥',
  `TRADE_VALUE` bigint DEFAULT NULL COMMENT '?漱??',
  `OPENING_PRICE` decimal(10,2) DEFAULT NULL COMMENT '???',
  `HIGHEST_PRICE` decimal(10,2) DEFAULT NULL COMMENT '?擃',
  `LOWEST_PRICE` decimal(10,2) DEFAULT NULL COMMENT '?雿',
  `CHANGE_GAP` decimal(10,2) DEFAULT NULL COMMENT '瞍脰??孵榆',
  `CLOSING_PRICE` decimal(10,2) DEFAULT NULL COMMENT '?嗥??',
  `TRANSACTION_COUNT` int DEFAULT NULL COMMENT '?漱蝑',
  `CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '撱箇???',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `daily_tranction_stock_data`
--

LOCK TABLES `daily_tranction_stock_data` WRITE;
/*!40000 ALTER TABLE `daily_tranction_stock_data` DISABLE KEYS */;
/*!40000 ALTER TABLE `daily_tranction_stock_data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `general_balance_sheet`
--

DROP TABLE IF EXISTS `general_balance_sheet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `general_balance_sheet` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `RELEASE_DATE` varchar(45) DEFAULT NULL COMMENT '出表日期',
  `YEAR` varchar(45) DEFAULT NULL COMMENT '年度',
  `SEASON` varchar(45) DEFAULT NULL COMMENT '季別',
  `COMPANYCODE` varchar(45) DEFAULT NULL COMMENT '公司代號',
  `CURRENT_ASSETS` varchar(45) DEFAULT NULL COMMENT '流動資產',
  `NONCURRENT_ASSETS` varchar(45) DEFAULT NULL COMMENT '非流動資產',
  `TOTAL_ASSETS` varchar(45) DEFAULT NULL COMMENT '資產總計',
  `CURRENT_LIABILITIES` varchar(45) DEFAULT NULL COMMENT '流動負債',
  `NONCURRENT_LIABILITIES` varchar(45) DEFAULT NULL COMMENT '非流動負債',
  `TOTAL_LIABILITIES` varchar(45) DEFAULT NULL COMMENT '負債總計',
  `CAPITAL` varchar(45) DEFAULT NULL COMMENT '股本',
  `SECURITY_TOKEN_OFFERING` varchar(45) DEFAULT NULL COMMENT '權益─具證券性質之虛擬通貨',
  `ADDITIONAL_PAID_IN_CAPITAL` varchar(45) DEFAULT NULL COMMENT '資本公積',
  `RETAINED_EARNINGS` varchar(45) DEFAULT NULL COMMENT '保留盈餘',
  `OTHER_RIGHTS` varchar(45) DEFAULT NULL COMMENT '其他權益',
  `TREASURY_STOCK` varchar(45) DEFAULT NULL COMMENT '庫藏股票',
  `OWNERS_EQUITY_ATTRIBUTABLE_TO_PARENT_COMPANY` varchar(45) DEFAULT NULL COMMENT '歸屬於母公司業主之權益合計',
  `RIGHTS_IN_SAME_CONTROLLER` varchar(45) DEFAULT NULL COMMENT '共同控制下前手權益',
  `RIGHTS_IN_DIFFERENT_CONTROLLER` varchar(45) DEFAULT NULL COMMENT '合併前非屬共同控制股權',
  `NONCONTROLLING_INTERESTS` varchar(45) DEFAULT NULL COMMENT '非控制權益',
  `TOTAL_EQUITY` varchar(45) DEFAULT NULL COMMENT '權益總計',
  `WAIT_TO_CANCEL_CAPITAL` varchar(45) DEFAULT NULL COMMENT '待註銷股本股數（單位：股）',
  `UNISSUES_SHARES` varchar(45) DEFAULT NULL COMMENT '預收股款（權益項下）之約當發行股數（單位：股）',
  `TOTAL_HANDLE_TREASURY_STOCK` varchar(45) DEFAULT NULL COMMENT '母公司暨子公司所持有之母公司庫藏股股數（單位：股）',
  `BOOK_VALUE_PER_SHARE` varchar(45) DEFAULT NULL COMMENT '每股參考淨值',
  `COMPANYNAME` varchar(45) DEFAULT NULL COMMENT '公司名稱',
  `CREATE_TIME` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `general_balance_sheet`
--

LOCK TABLES `general_balance_sheet` WRITE;
/*!40000 ALTER TABLE `general_balance_sheet` DISABLE KEYS */;
INSERT INTO `general_balance_sheet` VALUES (1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2022-05-13 16:36:13');
/*!40000 ALTER TABLE `general_balance_sheet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `ACCOUNT` varchar(45) NOT NULL COMMENT '雿輻?董??',
  `NAME` varchar(45) NOT NULL COMMENT '雿輻????',
  `PASSWORD` varchar(60) NOT NULL COMMENT '雿輻??蝣???)',
  `AUTHORITY` varchar(45) NOT NULL DEFAULT 'NORMAL' COMMENT '甈?',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'ken123','ken','$2a$10$bxLglkP5M80vAllUem1Bx.MnAsStix0i0FYowV0iy1W55vV21Gx42','NORMAL');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-14 12:49:43
