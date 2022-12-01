CREATE DATABASE  IF NOT EXISTS `electus` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `electus`;
-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: electus
-- ------------------------------------------------------
-- Server version	8.0.30

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
  `aluno` varchar(50) DEFAULT NULL,
  `data_nascimento` varchar(20) DEFAULT NULL,
  `cpf` varchar(11) DEFAULT NULL,
  `numero_telefone` varchar(50) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `sexo` varchar(15) DEFAULT NULL,
  `endereco` varchar(55) DEFAULT NULL,
  `numero_casa` varchar(30) DEFAULT NULL,
  `curso` varchar(50) DEFAULT NULL,
  `modulo` varchar(40) DEFAULT NULL,
  `periodo` varchar(15) DEFAULT NULL,
  `senha` varchar(20) DEFAULT NULL,
  `descricao` varchar(80) DEFAULT NULL,
  `formacao` varchar(255) DEFAULT NULL,
  `teste` varchar(1000) DEFAULT NULL,
  `nomeimagem` varchar(255) DEFAULT NULL,
  `imagem` longblob,
  `alteracao_armazenamento_dados` varchar(255) DEFAULT NULL,
  `alteracao_correcao_programa` varchar(255) DEFAULT NULL,
  `atualizacao_documentacao_programa` varchar(255) DEFAULT NULL,
  `codificacaoprogramas` varchar(255) DEFAULT NULL,
  `desenvolvimento_prototipos` varchar(255) DEFAULT NULL,
  `docente` varchar(255) DEFAULT NULL,
  `documentacao_programa` varchar(255) DEFAULT NULL,
  `implementacao_dados` varchar(255) DEFAULT NULL,
  `realizacao_testes` varchar(255) DEFAULT NULL,
  `validacao` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cpf_UNIQUE` (`cpf`),
  UNIQUE KEY `numero_telefone_UNIQUE` (`numero_telefone`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aluno`
--

LOCK TABLES `aluno` WRITE;
/*!40000 ALTER TABLE `aluno` DISABLE KEYS */;
INSERT INTO `aluno` VALUES (1,'Thiago','2006-01-30','11111111111','7594568912','Thiago@gmail.com','Masculino','Rua Vereador Jose Braga','96','Desenvolvimento de Sistemas','Modulo 2','Vespertino','12',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
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

-- Dump completed on 2022-12-01  8:40:32
