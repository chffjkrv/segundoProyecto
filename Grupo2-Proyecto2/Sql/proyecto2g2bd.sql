CREATE DATABASE  IF NOT EXISTS `proyecto2g2bd` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci */;
USE `proyecto2g2bd`;
-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: 10.90.36.105    Database: proyecto2g2bd
-- ------------------------------------------------------
-- Server version	5.7.24-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `contactos`
--

DROP TABLE IF EXISTS `contactos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `contactos` (
  `idcontacto` int(6) NOT NULL AUTO_INCREMENT,
  `idusuariocontact1` int(6) NOT NULL,
  `idusuariocontact2` int(6) NOT NULL,
  PRIMARY KEY (`idcontacto`),
  KEY `idusuariocontact2_idx` (`idusuariocontact2`),
  KEY `idusuariocontact1_idx` (`idusuariocontact1`),
  CONSTRAINT `idusuariocontact1` FOREIGN KEY (`idusuariocontact1`) REFERENCES `usuarios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `idusuariocontact2` FOREIGN KEY (`idusuariocontact2`) REFERENCES `usuarios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contactos`
--

LOCK TABLES `contactos` WRITE;
/*!40000 ALTER TABLE `contactos` DISABLE KEYS */;
INSERT INTO `contactos` VALUES (1,1,2),(2,1,4),(3,1,5),(4,1,15);
/*!40000 ALTER TABLE `contactos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `descartes`
--

DROP TABLE IF EXISTS `descartes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `descartes` (
  `idusuario1` int(11) NOT NULL,
  `idusuario2` int(11) NOT NULL,
  `iddescarte` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`iddescarte`),
  KEY `idusuario1_idx` (`idusuario1`,`idusuario2`),
  KEY `idusuario2_idx` (`idusuario2`),
  CONSTRAINT `idusuario1` FOREIGN KEY (`idusuario1`) REFERENCES `usuarios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `idusuario2` FOREIGN KEY (`idusuario2`) REFERENCES `usuarios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `descartes`
--

LOCK TABLES `descartes` WRITE;
/*!40000 ALTER TABLE `descartes` DISABLE KEYS */;
INSERT INTO `descartes` VALUES (1,2,6),(1,6,9),(1,14,10),(1,21,11),(2,1,3),(2,3,4),(2,7,5),(5,1,2);
/*!40000 ALTER TABLE `descartes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `genero` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `edad` int(5) NOT NULL,
  `descripcion` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4219 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'danielFeo','male',13,'en el 99 habia select JODER'),(2,'Yael','Female',37,'thicc doggo'),(3,'Shelton','Male',68,'mlem'),(4,'Fidel','Female',69,'blep'),(5,'Elanor','Female',62,'smol pupperino'),(6,'Cesar','Female',54,'thicc doggo'),(7,'Adolph','Male',48,'boop the snoot'),(8,'Mervin','Male',51,'mlem'),(9,'Numbers','Male',28,'long boi'),(10,'Leighann','Male',21,'thicc doggo'),(11,'Cletus','Male',79,'blep'),(12,'Titus','Male',43,'blep'),(13,'Tamatha','Male',82,'boop the snoot'),(14,'Jama','Female',44,'big ol\' pupper'),(15,'Benita','Female',27,'boop the snoot'),(16,'Marylin','Female',23,'heck no pal'),(17,'Alison','Male',78,'smol pupperino'),(18,'Nettie','Male',16,'boop the snoot'),(19,'Lance','Female',23,'they\'re good dogs Brent'),(20,'Belinda','Female',20,'big ol\' pupper'),(21,'Deidre','Female',19,'smol pupperino'),(22,'Viviana','Male',37,'mlem'),(23,'Bernard','Male',78,'big ol\' pupper'),(24,'Marquetta','Female',81,'mlem'),(25,'Ivy','Male',56,'boop the snoot'),(26,'Marlin','Female',74,'11/10'),(27,'Man','Male',45,'long boi'),(28,'Cristen','Male',61,'smol pupperino'),(29,'Pat','Female',34,'mlem'),(30,'Rod','Female',27,'mlem'),(31,'Jim','Female',60,'zoom'),(32,'Alfredia','Female',49,'smol pupperino'),(33,'Jewel','Female',30,'11/10'),(34,'Becki','Female',76,'11/10'),(35,'Una','Female',58,'blep'),(36,'Divina','Male',45,'big ol\' pupper'),(37,'Lonna','Male',52,'they\'re good dogs Brent'),(38,'Genaro','Female',24,'thicc doggo'),(39,'Eusebio','Male',40,'mlem'),(40,'Kirby','Female',37,'thicc doggo'),(41,'Concha','Male',22,'thicc doggo'),(42,'Lacy','Male',75,'smol pupperino'),(43,'Conception','Female',78,'smol pupperino'),(44,'Stanley','Male',24,'zoom'),(45,'Lan','Male',83,'big ol\' pupper'),(46,'Rickey','Male',28,'zoom'),(47,'Gilbert','Female',26,'11/10'),(48,'Dwain','Male',14,'thicc doggo'),(49,'Agatha','Male',75,'blep'),(50,'Antonio','Male',79,'boop the snoot'),(51,'Tuyet','Female',37,'long boi'),(52,'Miss','Male',76,'mlem'),(53,'Richie','Female',22,'thicc doggo'),(54,'Leonard','Male',26,'boop the snoot'),(55,'Thad','Male',16,'zoom'),(56,'Elida','Male',66,'thicc doggo'),(57,'Tamela','Male',72,'thicc doggo'),(58,'Damion','Female',74,'smol pupperino'),(59,'Genesis','Female',53,'blep'),(60,'Dennis','Female',64,'long boi'),(61,'Laverna','Female',54,'thicc doggo'),(62,'German','Male',21,'they\'re good dogs Brent'),(64,'Virgilio','Female',33,'thicc doggo'),(65,'Adrianne','Female',25,'thicc doggo'),(66,'Trinidad','Female',56,'boop the snoot'),(67,'Coletta','Male',32,'smol pupperino'),(68,'Odessa','Male',35,'boop the snoot'),(69,'Hyon','Male',64,'11/10'),(70,'Rory','Male',29,'11/10'),(71,'Nestor','Male',12,'long boi'),(72,'Jacinto','Male',81,'big ol\' pupper'),(73,'Lyda','Male',14,'heck no pal'),(74,'Fay','Female',14,'mlem'),(75,'Mary','Female',30,'smol pupperino'),(76,'Twana','Female',29,'smol pupperino'),(77,'Stewart','Male',32,'11/10'),(78,'Ramon','Male',15,'blep'),(79,'Fidel','Male',68,'blep'),(80,'Hiram','Female',28,'thicc doggo'),(81,'Dana','Female',40,'they\'re good dogs Brent'),(82,'Darrell','Male',26,'mlem'),(83,'Floy','Male',68,'heck no pal'),(84,'Kris','Female',74,'mlem'),(85,'Zula','Male',40,'big ol\' pupper'),(86,'Sally','Male',48,'11/10'),(87,'Adalberto','Male',25,'zoom'),(88,'Gerald','Female',13,'heck no pal'),(89,'Dwana','Female',40,'thicc doggo'),(90,'Hunter','Male',15,'mlem'),(91,'Maudie','Female',14,'zoom'),(92,'Timmy','Female',13,'heck no pal'),(93,'Annabel','Female',41,'they\'re good dogs Brent'),(94,'Brenda','Female',62,'heck no pal'),(95,'Zonia','Female',23,'blep'),(96,'Jordan','Male',62,'smol pupperino'),(97,'Etta','Male',29,'smol pupperino'),(98,'Edie','Female',51,'smol pupperino'),(99,'Cristen','Female',79,'zoom'),(100,'Van','Female',80,'boop the snoot'),(101,'Dania','Female',75,'blep'),(102,'Marin','Female',52,'11/10'),(103,'Muoi','Male',82,'heck no pal'),(104,'Petrina','Female',78,'heck no pal'),(105,'Carlo','Male',51,'they\'re good dogs Brent'),(106,'Buford','Female',61,'zoom'),(107,'Quentin','Male',40,'mlem'),(108,'Norman','Female',52,'blep'),(109,'Christinia','Male',22,'blep'),(110,'Georgianne','Male',14,'heck no pal'),(111,'Simon','Male',36,'zoom'),(112,'Daniel','Male',68,'big ol\' pupper'),(113,'Lillian','Male',52,'blep'),(114,'Ricarda','Male',56,'boop the snoot'),(115,'Marcela','Female',61,'11/10'),(116,'Rayna','Female',61,'boop the snoot'),(117,'Ray','Female',18,'long boi'),(118,'Shawn','Female',24,'thicc doggo'),(119,'Arden','Male',32,'zoom'),(120,'Deborah','Male',33,'they\'re good dogs Brent'),(121,'Quinn','Female',30,'long boi'),(122,'Katheryn','Female',78,'11/10'),(123,'Ronald','Male',46,'mlem'),(124,'Marcelle','Female',54,'11/10'),(126,'Verdell','Male',80,'boop the snoot'),(127,'Gaston','Female',48,'they\'re good dogs Brent'),(128,'Calista','Male',38,'they\'re good dogs Brent'),(129,'Loris','Male',63,'smol pupperino'),(130,'Wesley','Female',35,'long boi'),(131,'Victor','Female',55,'11/10'),(132,'Kirsten','Male',18,'11/10'),(133,'Milton','Male',38,'thicc doggo'),(134,'Tia','Male',73,'smol pupperino'),(135,'Gerald','Female',20,'thicc doggo'),(136,'Albertha','Female',49,'big ol\' pupper'),(137,'Phyliss','Male',75,'11/10'),(138,'Jimmy','Male',41,'heck no pal'),(139,'Darla','Female',80,'long boi'),(140,'Kevin','Female',62,'they\'re good dogs Brent'),(141,'Bethel','Female',47,'long boi'),(142,'Kristen','Male',31,'zoom'),(143,'Erik','Male',35,'blep'),(144,'Kurtis','Male',53,'blep'),(145,'Jeraldine','Female',69,'smol pupperino'),(146,'Wally','Female',46,'mlem'),(147,'Jae','Female',23,'long boi'),(148,'Dion','Male',21,'zoom'),(149,'Blanch','Male',34,'mlem'),(150,'Leroy','Female',73,'zoom'),(151,'Nigel','Female',43,'smol pupperino'),(152,'Tristan','Female',45,'heck no pal'),(153,'Abraham','Male',50,'smol pupperino'),(154,'Dayle','Female',23,'long boi'),(155,'Maira','Female',18,'smol pupperino'),(156,'Donald','Male',33,'long boi'),(157,'Kelley','Male',82,'11/10'),(158,'Brianne','Male',76,'boop the snoot'),(159,'Merrill','Female',23,'thicc doggo'),(160,'Brad','Female',16,'heck no pal'),(161,'Hubert','Male',12,'11/10'),(162,'Anisha','Female',67,'smol pupperino'),(163,'Carla','Female',73,'mlem'),(164,'Norris','Male',35,'thicc doggo'),(165,'Hollie','Female',30,'zoom'),(166,'Pat','Male',68,'they\'re good dogs Brent'),(167,'Janetta','Female',72,'smol pupperino'),(168,'Jacquline','Male',40,'long boi'),(169,'Ned','Female',42,'big ol\' pupper'),(170,'Von','Female',15,'they\'re good dogs Brent'),(171,'Jenifer','Male',34,'long boi'),(172,'Brett','Female',21,'they\'re good dogs Brent'),(173,'Julius','Male',44,'mlem'),(174,'Opal','Female',52,'big ol\' pupper'),(175,'Joslyn','Male',22,'11/10'),(176,'Lon','Male',54,'blep'),(177,'Barrett','Female',48,'they\'re good dogs Brent'),(178,'Todd','Male',24,'heck no pal'),(179,'Jerrold','Male',53,'they\'re good dogs Brent'),(180,'Troy','Male',64,'zoom'),(181,'Carlo','Male',47,'11/10'),(182,'Efren','Female',14,'zoom'),(183,'Doug','Male',33,'zoom'),(184,'Irvin','Male',48,'big ol\' pupper'),(185,'Alison','Female',33,'zoom'),(186,'Maya','Male',26,'thicc doggo'),(187,'Juan','Masculino',23,'Hola'),(188,'Jesse','Female',53,'big ol\' pupper'),(189,'Rene','Female',15,'big ol\' pupper'),(190,'Raye','Female',22,'mlem'),(191,'Trina','Male',46,'long boi'),(192,'Randolph','Female',34,'smol pupperino'),(193,'Antonio','Female',36,'smol pupperino'),(194,'Rima','Male',18,'zoom'),(195,'Daniell','Male',71,'smol pupperino'),(196,'Devora','Female',42,'long boi'),(197,'Deangelo','Female',25,'zoom'),(198,'Monet','Female',63,'11/10'),(199,'Thomas','Female',39,'boop the snoot'),(200,'Tyler','Male',12,'big ol\' pupper'),(201,'Carol','Female',65,'11/10'),(202,'Waldo','Male',39,'heck no pal'),(203,'Kenisha','Female',37,'big ol\' pupper'),(204,'Devon','Male',14,'zoom'),(205,'Brian','Female',13,'11/10'),(206,'Fausto','Female',16,'thicc doggo'),(207,'Kisha','Female',30,'heck no pal'),(208,'Rikki','Female',51,'blep'),(209,'Merrill','Male',17,'11/10'),(210,'Malcolm','Female',64,'smol pupperino'),(211,'Deanne','Male',52,'boop the snoot'),(212,'Connie','Male',44,'big ol\' pupper'),(213,'Bruce','Male',68,'mlem'),(214,'Rufus','Female',28,'long boi'),(215,'Casandra','Female',78,'thicc doggo'),(216,'Matthew','Male',67,'mlem'),(217,'Dante','Male',22,'11/10'),(218,'Teisha','Male',52,'they\'re good dogs Brent'),(219,'Kurt','Female',53,'smol pupperino'),(220,'Bradley','Female',59,'zoom'),(221,'Judson','Female',26,'boop the snoot'),(222,'Pearly','Male',16,'thicc doggo'),(223,'Xuan','Female',33,'zoom'),(224,'Shizuko','Male',78,'heck no pal'),(225,'Curtis','Female',14,'heck no pal'),(226,'Kristie','Male',45,'thicc doggo'),(227,'Ike','Female',35,'long boi'),(228,'Dorthey','Female',47,'zoom'),(229,'Clay','Male',45,'thicc doggo'),(230,'Jacques','Male',58,'heck no pal'),(231,'Zachery','Female',56,'they\'re good dogs Brent'),(232,'Johnathon','Female',68,'11/10'),(233,'Krystin','Male',61,'zoom'),(234,'Ivan','Male',79,'zoom'),(235,'Jacklyn','Female',74,'mlem'),(236,'Alyson','Male',36,'heck no pal'),(237,'Estrella','Male',54,'they\'re good dogs Brent'),(238,'Annetta','Female',26,'thicc doggo'),(239,'Annika','Male',55,'zoom'),(240,'Elanor','Male',42,'boop the snoot'),(241,'Steven','Female',13,'smol pupperino'),(242,'Leandra','Male',33,'heck no pal'),(243,'Bobette','Female',32,'they\'re good dogs Brent'),(244,'Neil','Male',82,'big ol\' pupper'),(245,'Kellee','Female',31,'heck no pal'),(246,'Dario','Male',34,'11/10'),(247,'Leandro','Male',33,'mlem'),(248,'Donald','Female',66,'zoom'),(249,'Juan','Masculino',23,'Hola'),(250,'Antonio','Male',35,'smol pupperino'),(251,'Kelly','Male',41,'boop the snoot'),(252,'Andres','Female',43,'mlem'),(253,'Malcolm','Female',25,'11/10'),(254,'Jamison','Male',78,'mlem'),(255,'Lindsey','Female',30,'long boi'),(256,'Carly','Male',72,'smol pupperino'),(257,'Gertrudis','Female',13,'mlem'),(258,'Al','Female',24,'boop the snoot'),(259,'Harland','Male',34,'boop the snoot'),(260,'Jeni','Male',30,'mlem'),(261,'Robert','Male',30,'mlem'),(262,'Jacklyn','Male',37,'big ol\' pupper'),(263,'Jules','Female',22,'they\'re good dogs Brent'),(264,'Thanh','Male',13,'they\'re good dogs Brent'),(265,'Roger','Female',76,'heck no pal'),(266,'Leonarda','Male',17,'big ol\' pupper'),(267,'Angila','Female',81,'blep'),(268,'Chris','Male',19,'heck no pal'),(269,'Adina','Female',30,'they\'re good dogs Brent'),(270,'Rickey','Male',45,'blep'),(271,'Ron','Female',59,'11/10'),(272,'Dewayne','Male',21,'thicc doggo'),(273,'Bryce','Male',58,'thicc doggo'),(274,'Marquitta','Male',52,'boop the snoot'),(275,'Cheryle','Male',45,'long boi'),(276,'Chin','Male',48,'11/10'),(277,'Cori','Female',66,'heck no pal'),(278,'Lia','Female',31,'big ol\' pupper'),(279,'Rusty','Female',17,'smol pupperino'),(280,'Luciano','Male',16,'mlem'),(281,'Agueda','Female',34,'big ol\' pupper'),(282,'Chet','Male',81,'smol pupperino'),(283,'Golden','Male',64,'smol pupperino'),(284,'Edmond','Male',67,'smol pupperino'),(285,'Javier','Male',27,'big ol\' pupper'),(286,'Carmine','Female',20,'boop the snoot'),(287,'Dylan','Female',26,'11/10'),(288,'Youlanda','Female',68,'blep'),(289,'Erick','Female',52,'11/10'),(290,'Ward','Female',79,'mlem'),(291,'Salina','Male',60,'smol pupperino'),(292,'Leslie','Male',78,'boop the snoot'),(293,'Maryanne','Male',39,'long boi'),(294,'Magali','Male',49,'heck no pal'),(295,'Tommy','Male',13,'11/10'),(296,'Adell','Female',27,'11/10'),(297,'Ernesto','Female',57,'they\'re good dogs Brent'),(298,'Patria','Female',66,'11/10'),(299,'Almeta','Female',39,'11/10'),(300,'Elmo','Male',57,'smol pupperino'),(301,'Leo','Female',41,'zoom'),(302,'Tandra','Female',65,'heck no pal'),(303,'Carrol','Male',67,'big ol\' pupper'),(304,'Jonathan','Male',47,'11/10'),(305,'Mika','Female',52,'long boi'),(306,'Junie','Female',51,'11/10'),(307,'Rafaela','Male',13,'11/10'),(308,'Merlin','Female',37,'they\'re good dogs Brent'),(309,'Gaye','Male',29,'boop the snoot'),(310,'Shaunda','Male',83,'thicc doggo'),(311,'Juan','Masculino',23,'Hola'),(312,'Vida','Female',28,'they\'re good dogs Brent'),(313,'Deloras','Male',40,'zoom'),(314,'Buford','Female',33,'zoom'),(315,'Ricky','Female',79,'heck no pal'),(316,'Scot','Female',46,'they\'re good dogs Brent'),(317,'Edwardo','Male',62,'zoom'),(318,'Anabel','Male',67,'they\'re good dogs Brent'),(319,'Denny','Female',73,'big ol\' pupper'),(320,'Marvin','Female',44,'blep'),(321,'Lindy','Female',28,'they\'re good dogs Brent'),(322,'Alethea','Female',61,'big ol\' pupper'),(323,'Bradford','Male',26,'blep'),(324,'Felicidad','Female',48,'heck no pal'),(325,'Herman','Female',77,'boop the snoot'),(326,'Joy','Male',18,'blep'),(327,'Joann','Female',47,'big ol\' pupper'),(328,'Eugene','Male',53,'heck no pal'),(329,'Reid','Female',67,'blep'),(330,'Everett','Male',78,'11/10'),(331,'Hildegarde','Female',23,'heck no pal'),(332,'Theodore','Female',47,'mlem'),(333,'Kendal','Female',69,'long boi'),(334,'Cary','Female',23,'they\'re good dogs Brent'),(335,'Noah','Female',72,'mlem'),(336,'Lloyd','Male',34,'smol pupperino'),(337,'Monty','Female',23,'thicc doggo'),(338,'Annamaria','Female',76,'big ol\' pupper'),(339,'Rashad','Female',17,'blep'),(340,'Beau','Female',29,'thicc doggo'),(341,'Josue','Male',52,'blep'),(342,'Doyle','Male',20,'mlem'),(343,'Oliver','Female',76,'long boi'),(344,'Dayle','Male',81,'boop the snoot'),(345,'Joye','Female',33,'zoom'),(346,'Zola','Female',62,'thicc doggo'),(347,'Logan','Female',50,'heck no pal'),(348,'Kristopher','Male',61,'big ol\' pupper'),(349,'Micheal','Female',27,'boop the snoot'),(350,'Claudie','Female',67,'heck no pal'),(351,'Ariel','Female',79,'boop the snoot'),(352,'Clarisa','Male',36,'zoom'),(353,'Kareen','Male',23,'heck no pal'),(354,'Deborah','Male',31,'thicc doggo'),(355,'Florentino','Female',78,'long boi'),(356,'Lucio','Male',78,'they\'re good dogs Brent'),(357,'Ollie','Female',43,'heck no pal'),(358,'Domenic','Female',32,'boop the snoot'),(359,'September','Male',60,'thicc doggo'),(360,'Garth','Female',39,'boop the snoot'),(361,'Tatyana','Female',79,'11/10'),(362,'Tomas','Female',64,'blep'),(363,'Lesha','Female',19,'thicc doggo'),(364,'Dana','Male',81,'boop the snoot'),(365,'Lorita','Male',53,'heck no pal'),(366,'Graham','Female',52,'blep'),(367,'Claribel','Male',25,'zoom'),(368,'Errol','Male',47,'long boi'),(369,'Rueben','Female',35,'thicc doggo'),(370,'Cinda','Male',73,'zoom'),(371,'Brent','Female',20,'boop the snoot'),(372,'Troy','Female',71,'they\'re good dogs Brent'),(373,'Juan','Masculino',23,'Hola'),(374,'Adriane','Male',42,'thicc doggo'),(375,'Marva','Female',54,'mlem'),(376,'Devona','Female',53,'big ol\' pupper'),(377,'Timika','Male',29,'boop the snoot'),(378,'Paola','Male',55,'boop the snoot'),(379,'Ivory','Female',62,'mlem'),(380,'Corie','Female',64,'big ol\' pupper'),(381,'Damon','Male',41,'thicc doggo'),(382,'Rolande','Male',20,'long boi'),(383,'Jerald','Female',34,'heck no pal'),(384,'Thomas','Female',49,'they\'re good dogs Brent'),(385,'Margarett','Male',62,'big ol\' pupper'),(386,'Chuck','Female',61,'heck no pal'),(387,'Virgilio','Female',47,'blep'),(388,'Pok','Female',27,'smol pupperino'),(389,'Ismael','Male',71,'zoom'),(390,'James','Male',43,'heck no pal'),(391,'Aracelis','Male',77,'11/10'),(392,'Vincent','Male',45,'heck no pal'),(393,'Anthony','Female',79,'blep'),(394,'Armand','Female',44,'heck no pal'),(395,'Virgil','Female',79,'they\'re good dogs Brent'),(396,'Kieth','Female',40,'11/10'),(397,'Trang','Male',76,'they\'re good dogs Brent'),(398,'Rogelio','Female',56,'blep'),(399,'Lorinda','Male',33,'mlem'),(400,'Nicola','Female',24,'11/10'),(401,'Gonzalo','Male',75,'11/10'),(402,'Jerry','Male',17,'zoom'),(403,'Melodee','Female',23,'boop the snoot'),(404,'Mauro','Female',56,'they\'re good dogs Brent'),(405,'Santo','Female',77,'blep'),(406,'Albina','Male',59,'heck no pal'),(407,'Jacob','Female',40,'they\'re good dogs Brent'),(408,'Mariana','Female',52,'mlem'),(409,'Tiara','Female',66,'thicc doggo'),(410,'Arron','Male',40,'smol pupperino'),(411,'Andria','Male',24,'smol pupperino'),(412,'Faustino','Male',38,'heck no pal'),(413,'Ivonne','Male',58,'smol pupperino'),(414,'Santiago','Male',46,'mlem'),(415,'Val','Female',43,'big ol\' pupper'),(416,'Mose','Male',67,'thicc doggo'),(417,'Rosanna','Male',41,'boop the snoot'),(418,'Corrie','Male',55,'11/10'),(419,'Jennell','Female',18,'11/10'),(420,'Owen','Male',81,'thicc doggo'),(421,'Val','Female',29,'smol pupperino'),(422,'Dee','Male',78,'smol pupperino'),(423,'Carol','Female',19,'smol pupperino'),(424,'Jeremy','Female',66,'11/10'),(425,'Daniel','Female',67,'blep'),(426,'Eduardo','Female',54,'big ol\' pupper'),(427,'Leonard','Female',48,'11/10'),(428,'Danille','Female',32,'they\'re good dogs Brent'),(429,'Natosha','Male',42,'blep'),(430,'Jamie','Female',38,'mlem'),(431,'Samuel','Female',48,'zoom'),(432,'Sherilyn','Female',52,'smol pupperino'),(433,'Lorie','Male',18,'they\'re good dogs Brent'),(434,'Margorie','Female',35,'smol pupperino'),(435,'Juan','Masculino',23,'Hola'),(436,'Herbert','Female',16,'heck no pal'),(437,'Ashlea','Female',51,'thicc doggo'),(438,'Jerrie','Female',55,'they\'re good dogs Brent'),(439,'Mack','Male',46,'11/10'),(440,'Charlette','Male',74,'blep'),(441,'Junko','Female',23,'thicc doggo'),(442,'Dorthea','Male',19,'blep'),(443,'Sang','Male',70,'long boi'),(444,'Dorris','Female',27,'they\'re good dogs Brent'),(445,'Micheal','Female',43,'they\'re good dogs Brent'),(446,'Arlen','Female',45,'big ol\' pupper'),(447,'Lakisha','Female',37,'11/10'),(463,'Lorenzo','Female',43,'thicc doggo'),(464,'Issac','Female',41,'blep'),(4208,'papayaaa','Male',68,'mieradm'),(4209,'zzzz','male',20,'epepee'),(4210,'pepita','female',18,'eeeee'),(4211,'pepe','male',18,'ssss'),(4212,'Zoe','Female',21,'eeee'),(4213,'nombre','male',50,'123456789'),(4214,'mohibulAlom','male',99,'soy mas mayor en todos los aspectos, vamos, un viejales'),(4215,'feofeofeo','male',55,'por el culo te la inco\n'),(4216,'asdfasdf','male',55,'asdfasdfasdf'),(4217,'noexisto','male',44,'3216546987pollasgordas'),(4218,'asdfasdf','male',50,'sdfasdfasdfasdf');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-09-05 15:03:16
