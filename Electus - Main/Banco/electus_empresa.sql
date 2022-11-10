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
-- Table structure for table `empresa`
--

DROP TABLE IF EXISTS `empresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empresa` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `data` varchar(20) NOT NULL,
  `cnpj` varchar(25) NOT NULL,
  `tel` varchar(20) NOT NULL,
  `responsavel` varchar(50) NOT NULL,
  `email` varchar(54) NOT NULL,
  `cidade` varchar(25) NOT NULL,
  `uf` varchar(40) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `cep` varchar(30) NOT NULL,
  `area` varchar(50) NOT NULL,
  `senha` varchar(30) NOT NULL,
  `cargo0` varchar(45) DEFAULT NULL,
  `departamento0` varchar(45) DEFAULT NULL,
  `cbo0` varchar(45) DEFAULT NULL,
  `atribuicao0` varchar(45) DEFAULT NULL,
  `tarefas0` varchar(45) DEFAULT NULL,
  `formacao0` varchar(45) DEFAULT NULL,
  `experiencia0` varchar(45) DEFAULT NULL,
  `habilidade_comportamentais0` varchar(45) DEFAULT NULL,
  `habilidades_tecnicas0` varchar(45) DEFAULT NULL,
  `cargo1` varchar(45) DEFAULT NULL,
  `departamento1` varchar(45) DEFAULT NULL,
  `cbo1` varchar(45) DEFAULT NULL,
  `atribuicao1` varchar(45) DEFAULT NULL,
  `tarefas1` varchar(45) DEFAULT NULL,
  `formacao1` varchar(45) DEFAULT NULL,
  `experiencia1` varchar(45) DEFAULT NULL,
  `habilidade_comportamentais1` varchar(45) DEFAULT NULL,
  `habilidades_tecnicas1` varchar(45) DEFAULT NULL,
  `cargo2` varchar(45) DEFAULT NULL,
  `departamento2` varchar(45) DEFAULT NULL,
  `cbo2` varchar(45) DEFAULT NULL,
  `atribuicao2` varchar(45) DEFAULT NULL,
  `tarefas2` varchar(45) DEFAULT NULL,
  `formacao2` varchar(45) DEFAULT NULL,
  `experiencia2` varchar(45) DEFAULT NULL,
  `habilidade_comportamentais2` varchar(45) DEFAULT NULL,
  `habilidades_tecnicas2` varchar(45) DEFAULT NULL,
  `teste` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empresa`
--

LOCK TABLES `empresa` WRITE;
/*!40000 ALTER TABLE `empresa` DISABLE KEYS */;
INSERT INTO `empresa` VALUES (1,'Thiago NEry','2022-11-02','44','44','Thiago NEry','thiagos@gmail.com','Bahia','estado','Rua vereador jose','46780000','adm','aa','8','8','8','8','8','8','8','8','8',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,'','','','','','','','estado','','','adm','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,'ADM','2022-11-11','123','456456456','Thiago Nery Braga da Silva','Thiago@gmail.456','Feira de Santana','BA','Rua Vereador Jose Braga','456','Quimica','123',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(4,'TecMundo','2022-11-09','456789','456789','Matheus Soares Gonsalvez','Methus@gmail.com','Salvador','BA','São Jorge','45','Refrigeração e Climatização','123',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(5,'ta','2022-11-14','4545','54545','Jose','Jose@gmail','456','BA','Rua vereador jose','46780000','Admistração','45',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,'aaaaaaaaaa','2022-11-08','12','4','Thiago NEry','thiagos@gmail.com','Bahia','MS','Rua vereador jose','46780000','Seguranca do trabalho','4','1','1','1','1','1','1','1','1','1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(7,'tectudo','2022-02-09','789456156','7589456589','Jose Alves','tecmundo@456','Feira de santana','BA','Rua alves','456464664','Desenvimento de Sistemas','45',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `empresa` ENABLE KEYS */;
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
