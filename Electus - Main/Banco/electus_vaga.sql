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
-- Table structure for table `vaga`
--

DROP TABLE IF EXISTS `vaga`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vaga` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `area` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `tell` varchar(45) NOT NULL,
  `cidade` varchar(45) NOT NULL,
  `uf` varchar(45) NOT NULL,
  `endereco` varchar(45) NOT NULL,
  `atribuicao` varchar(255) DEFAULT NULL,
  `cargo` varchar(255) DEFAULT NULL,
  `cbo` varchar(255) DEFAULT NULL,
  `departamento` varchar(255) DEFAULT NULL,
  `experiencia` varchar(255) DEFAULT NULL,
  `formacao` varchar(255) DEFAULT NULL,
  `habilidade_comportamentais` varchar(255) DEFAULT NULL,
  `habilidades_tecnicas` varchar(255) DEFAULT NULL,
  `tarefas` varchar(255) DEFAULT NULL,
  `teste` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vaga`
--

LOCK TABLES `vaga` WRITE;
/*!40000 ALTER TABLE `vaga` DISABLE KEYS */;
INSERT INTO `vaga` VALUES (1,'aaaaaaaaaa','Seguranca do trabalho','thiagos@gmail.com','4','Bahia','MS','Rua vereador jose','2','2','2','2','2','2','2','2','2','6'),(2,'tectudo','Desenvimento de Sistemas','tecmundo@456','7589456589','Feira de santana','BA','Rua alves','na','Gerente','78946','ADm','na','na','na','na','na','7'),(3,'tectudo','Desenvimento de Sistemas','tecmundo@456','7589456589','Feira de santana','BA','Rua alves','na','Gerente','78946','ADm','na','na','na','na','na','7');
/*!40000 ALTER TABLE `vaga` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-10  1:11:08
