CREATE DATABASE  IF NOT EXISTS `electus` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `electus`;
-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: electus
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `aluno`
--

DROP TABLE IF EXISTS `aluno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `aluno` (
  `id` int NOT NULL AUTO_INCREMENT,
  `aluno` varchar(50) NOT NULL,
  `data_nascimento` varchar(20) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `numero_telefone` varchar(50) NOT NULL,
  `email` varchar(30) NOT NULL,
  `sexo` varchar(15) NOT NULL,
  `endereco` varchar(55) NOT NULL,
  `numero_casa` varchar(30) NOT NULL,
  `curso` varchar(50) NOT NULL,
  `modulo` varchar(40) NOT NULL,
  `periodo` varchar(15) NOT NULL,
  `senha` varchar(20) NOT NULL,
  `descricao` varchar(80) DEFAULT NULL,
  `formacao` varchar(255) DEFAULT NULL,
  `teste` varchar(1000) DEFAULT NULL,
  `nomeimagem` varchar(255) DEFAULT NULL,
  `imagem` longblob,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cpf_UNIQUE` (`cpf`),
  UNIQUE KEY `numero_telefone_UNIQUE` (`numero_telefone`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aluno`
--

LOCK TABLES `aluno` WRITE;
/*!40000 ALTER TABLE `aluno` DISABLE KEYS */;
INSERT INTO `aluno` VALUES (3,'THiago','2022-11-17','12345678910','4564654654','aaaaaaaaaaaaaaaaaaaaa','Masculino','aaaaa','aaaaaa','seguranca-trabalho','m-3','vesp','aa','sdsdsdsds','',NULL,'C:\\fakepath\\image1.png',NULL),(4,'THIAGO','2022-11-16','78945612310','78978','asdasdsadasdasd','Masculino','sadsdasdasd','45','r-computadores','m-2','vesp','aa',NULL,NULL,NULL,NULL,NULL),(5,'aaaaaaaaaaaa','2022-11-16','45646546','45646546','ddddddddddddd','Masculino','gggggggggg','45','seguranca-trabalho','m-2','noturno','45',NULL,NULL,NULL,NULL,NULL),(6,'dsdasd','2022-12-05','45454','4564654','asdasdasdsadsadsa','Masculino','sdsdsd','4','seguranca-trabalho','m-3','vesp','a',NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `aluno` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-08 14:57:29
