-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: stockapi
-- ------------------------------------------------------
-- Server version	5.5.5-10.5.8-MariaDB

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
  `create_time` datetime NOT NULL DEFAULT current_timestamp() COMMENT '?萄遣??',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bwibbu`
--

LOCK TABLES `bwibbu` WRITE;
/*!40000 ALTER TABLE `bwibbu` DISABLE KEYS */;
/*!40000 ALTER TABLE `bwibbu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `daily_tranction_stock_data`
--

DROP TABLE IF EXISTS `daily_tranction_stock_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `daily_tranction_stock_data` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CODE` varchar(45) DEFAULT NULL COMMENT '霅隞??',
  `NAME` varchar(45) DEFAULT NULL COMMENT '霅?迂',
  `TRADE_VOLUME` int(11) DEFAULT NULL COMMENT '?漱?⊥',
  `TRADE_VALUE` bigint(20) DEFAULT NULL COMMENT '?漱??',
  `OPENING_PRICE` decimal(10,2) DEFAULT NULL COMMENT '???',
  `HIGHEST_PRICE` decimal(10,2) DEFAULT NULL COMMENT '?擃',
  `LOWEST_PRICE` decimal(10,2) DEFAULT NULL COMMENT '?雿',
  `CHANGE_GAP` decimal(10,2) DEFAULT NULL COMMENT '瞍脰??孵榆',
  `CLOSING_PRICE` decimal(10,2) DEFAULT NULL COMMENT '?嗥??',
  `TRANSACTION_COUNT` int(11) DEFAULT NULL COMMENT '?漱蝑',
  `CREATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '撱箇???',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='銝???交?鈭方?閮?;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `daily_tranction_stock_data`
--

LOCK TABLES `daily_tranction_stock_data` WRITE;
/*!40000 ALTER TABLE `daily_tranction_stock_data` DISABLE KEYS */;
/*!40000 ALTER TABLE `daily_tranction_stock_data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ACCOUNT` varchar(45) NOT NULL COMMENT '雿輻?董??',
  `NAME` varchar(45) NOT NULL COMMENT '雿輻????',
  `PASSWORD` varchar(60) NOT NULL COMMENT '雿輻??蝣???)',
  `AUTHORITY` varchar(45) NOT NULL DEFAULT 'NORMAL' COMMENT '甈?',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'ken123','ken','$2a$10$SJYauYU.gs2S.b146MPkIurbuiiDNHeJTr/jT8ZCpL4zszjEwvImK','ADMIN'),(2,'leo123','Leo','$2a$10$yFqLRs.3dd5a4RgmnpSxO.QpdlER1stGsYF6.6o0otdyo3DPh8MAy','NORMAL'),(5,'leo123456','Leo4','$2a$10$f91INdU8Eo3a4tjysyXd5uUgM7qvnRq9owTe9YdXLDHJewFFck0Fy','NORMAL'),(6,'ken123001','ken002','$2a$10$gOWo3PTBZFhcAjz0cy/sC.r8PmvCMlhQU7r1za1MM0Jnw2qLw9ruq','NORMAL');
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

-- Dump completed on 2022-03-13 19:03:11
