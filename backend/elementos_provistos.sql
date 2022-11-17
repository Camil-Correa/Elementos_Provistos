-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-11-2022 a las 00:28:07
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `elementos_provistos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `armas`
--

CREATE TABLE `armas` (
  `tipo` char(30) NOT NULL,
  `marca` char(30) NOT NULL,
  `modelo` varchar(30) NOT NULL,
  `calibre` varchar(10) NOT NULL,
  `numeracion` varchar(15) NOT NULL,
  `est_func` char(15) NOT NULL,
  `remarque` char(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `armas`
--

INSERT INTO `armas` (`tipo`, `marca`, `modelo`, `calibre`, `numeracion`, `est_func`, `remarque`) VALUES
('Escopeta', 'HATSAN', 'ESCORT', '12|70', '233700', 'Bueno', 'ns i need info');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `calibre_armas`
--

CREATE TABLE `calibre_armas` (
  `calibre` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `calibre_armas`
--

INSERT INTO `calibre_armas` (`calibre`) VALUES
('12|70'),
('9mm');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `chaleco_balistico`
--

CREATE TABLE `chaleco_balistico` (
  `marca` varchar(15) NOT NULL,
  `modelo` varchar(10) NOT NULL,
  `talle` char(4) NOT NULL,
  `niv_prot` varchar(4) NOT NULL,
  `num_serie` varchar(15) NOT NULL,
  `fecha_fab` varchar(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `chaleco_balistico`
--

INSERT INTO `chaleco_balistico` (`marca`, `modelo`, `talle`, `niv_prot`, `num_serie`, `fecha_fab`) VALUES
('F.M', 'MM-2.2', 'M', 'RB2', 'FM-07016823', '04/2021');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `nI` int(6) NOT NULL,
  `nombres` char(50) NOT NULL,
  `apellidos` char(50) NOT NULL,
  `dni` int(8) NOT NULL,
  `jerarquia` char(30) DEFAULT NULL,
  `situacion` char(20) NOT NULL,
  `numeracion` varchar(15) NOT NULL,
  `num_serie` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`nI`, `nombres`, `apellidos`, `dni`, `jerarquia`, `situacion`, `numeracion`, `num_serie`) VALUES
(672754, 'Julián Emuanuel', 'Gorosito', 44231514, 'DIRECTOR GENERAL DE POLICÍA', 'RETIRO', '233700', 'FM-07016823');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estfun_armas`
--

CREATE TABLE `estfun_armas` (
  `est_func` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `estfun_armas`
--

INSERT INTO `estfun_armas` (`est_func`) VALUES
('Bueno');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grado`
--

CREATE TABLE `grado` (
  `jerarquia` char(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `grado`
--

INSERT INTO `grado` (`jerarquia`) VALUES
('COMISARIO'),
('COMISARIO SUPERVISOR'),
('DIRECTOR DE POLICÍA'),
('DIRECTOR GENERAL DE POLICÍA'),
('INSPECTOR'),
('OFICIAL DE POLICÍA'),
('SUB COMISARIO'),
('SUB DIRECTOR DE POLICÍA'),
('SUBINSPECTOR'),
('SUBOFICIAL DE POLICÍA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `marcas_armas`
--

CREATE TABLE `marcas_armas` (
  `marca` char(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `marcas_armas`
--

INSERT INTO `marcas_armas` (`marca`) VALUES
('F.M'),
('HATSAN');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `marcas_chaleco`
--

CREATE TABLE `marcas_chaleco` (
  `marca` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `marcas_chaleco`
--

INSERT INTO `marcas_chaleco` (`marca`) VALUES
('F.M'),
('IRON DRAGON');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `modelo_armas`
--

CREATE TABLE `modelo_armas` (
  `modelo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `modelo_armas`
--

INSERT INTO `modelo_armas` (`modelo`) VALUES
('ESCORT'),
('FMK3');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `modelo_chaleco`
--

CREATE TABLE `modelo_chaleco` (
  `modelo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `modelo_chaleco`
--

INSERT INTO `modelo_chaleco` (`modelo`) VALUES
('2.4E'),
('ID.21'),
('MM-2.2'),
('MM2.2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nivprot_chaleco`
--

CREATE TABLE `nivprot_chaleco` (
  `niv_prot` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `nivprot_chaleco`
--

INSERT INTO `nivprot_chaleco` (`niv_prot`) VALUES
('RB2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `situacion_empleado`
--

CREATE TABLE `situacion_empleado` (
  `situacion` char(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `situacion_empleado`
--

INSERT INTO `situacion_empleado` (`situacion`) VALUES
('ACTIVO'),
('COMISIÓN ISEP'),
('DEPÓSITO JUDICIAL'),
('DISPONIBILIDAD'),
('JUNTA MÉDICA'),
('PRESCRIPCION MÉDICA'),
('RETIRO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `talle_chaleco`
--

CREATE TABLE `talle_chaleco` (
  `talle` char(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `talle_chaleco`
--

INSERT INTO `talle_chaleco` (`talle`) VALUES
('L'),
('M'),
('S'),
('XL'),
('XS'),
('XXL'),
('XXS'),
('XXXL'),
('XXXS');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_armas`
--

CREATE TABLE `tipo_armas` (
  `tipo` char(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tipo_armas`
--

INSERT INTO `tipo_armas` (`tipo`) VALUES
('Armas Cortas'),
('Escopeta'),
('Pistola AM');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `armas`
--
ALTER TABLE `armas`
  ADD PRIMARY KEY (`numeracion`),
  ADD KEY `fk_TaA` (`tipo`),
  ADD KEY `fk_MarA` (`marca`),
  ADD KEY `fk_ModA` (`modelo`),
  ADD KEY `fk_CaA` (`calibre`),
  ADD KEY `fk_EaA` (`est_func`);

--
-- Indices de la tabla `calibre_armas`
--
ALTER TABLE `calibre_armas`
  ADD PRIMARY KEY (`calibre`);

--
-- Indices de la tabla `chaleco_balistico`
--
ALTER TABLE `chaleco_balistico`
  ADD PRIMARY KEY (`num_serie`),
  ADD KEY `fk_MarCb` (`marca`),
  ADD KEY `fk_ModCb` (`modelo`),
  ADD KEY `fk_TCb` (`talle`),
  ADD KEY `fk_NpCb` (`niv_prot`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`nI`),
  ADD KEY `fk_GE` (`jerarquia`),
  ADD KEY `fk_SeE` (`situacion`),
  ADD KEY `fk_AE` (`numeracion`),
  ADD KEY `fk_ChE` (`num_serie`);

--
-- Indices de la tabla `estfun_armas`
--
ALTER TABLE `estfun_armas`
  ADD PRIMARY KEY (`est_func`);

--
-- Indices de la tabla `grado`
--
ALTER TABLE `grado`
  ADD PRIMARY KEY (`jerarquia`);

--
-- Indices de la tabla `marcas_armas`
--
ALTER TABLE `marcas_armas`
  ADD PRIMARY KEY (`marca`);

--
-- Indices de la tabla `marcas_chaleco`
--
ALTER TABLE `marcas_chaleco`
  ADD PRIMARY KEY (`marca`);

--
-- Indices de la tabla `modelo_armas`
--
ALTER TABLE `modelo_armas`
  ADD PRIMARY KEY (`modelo`);

--
-- Indices de la tabla `modelo_chaleco`
--
ALTER TABLE `modelo_chaleco`
  ADD PRIMARY KEY (`modelo`);

--
-- Indices de la tabla `nivprot_chaleco`
--
ALTER TABLE `nivprot_chaleco`
  ADD PRIMARY KEY (`niv_prot`);

--
-- Indices de la tabla `situacion_empleado`
--
ALTER TABLE `situacion_empleado`
  ADD PRIMARY KEY (`situacion`);

--
-- Indices de la tabla `talle_chaleco`
--
ALTER TABLE `talle_chaleco`
  ADD PRIMARY KEY (`talle`);

--
-- Indices de la tabla `tipo_armas`
--
ALTER TABLE `tipo_armas`
  ADD PRIMARY KEY (`tipo`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `armas`
--
ALTER TABLE `armas`
  ADD CONSTRAINT `fk_CaA` FOREIGN KEY (`calibre`) REFERENCES `calibre_armas` (`calibre`),
  ADD CONSTRAINT `fk_EaA` FOREIGN KEY (`est_func`) REFERENCES `estfun_armas` (`est_func`),
  ADD CONSTRAINT `fk_MarA` FOREIGN KEY (`marca`) REFERENCES `marcas_armas` (`marca`),
  ADD CONSTRAINT `fk_ModA` FOREIGN KEY (`modelo`) REFERENCES `modelo_armas` (`modelo`),
  ADD CONSTRAINT `fk_TaA` FOREIGN KEY (`tipo`) REFERENCES `tipo_armas` (`tipo`);

--
-- Filtros para la tabla `chaleco_balistico`
--
ALTER TABLE `chaleco_balistico`
  ADD CONSTRAINT `fk_MarCb` FOREIGN KEY (`marca`) REFERENCES `marcas_chaleco` (`marca`),
  ADD CONSTRAINT `fk_ModCb` FOREIGN KEY (`modelo`) REFERENCES `modelo_chaleco` (`modelo`),
  ADD CONSTRAINT `fk_NpCb` FOREIGN KEY (`niv_prot`) REFERENCES `nivprot_chaleco` (`niv_prot`),
  ADD CONSTRAINT `fk_TCb` FOREIGN KEY (`talle`) REFERENCES `talle_chaleco` (`talle`);

--
-- Filtros para la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD CONSTRAINT `fk_AE` FOREIGN KEY (`numeracion`) REFERENCES `armas` (`numeracion`),
  ADD CONSTRAINT `fk_ChE` FOREIGN KEY (`num_serie`) REFERENCES `chaleco_balistico` (`num_serie`),
  ADD CONSTRAINT `fk_GE` FOREIGN KEY (`jerarquia`) REFERENCES `grado` (`jerarquia`),
  ADD CONSTRAINT `fk_SeE` FOREIGN KEY (`situacion`) REFERENCES `situacion_empleado` (`situacion`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
