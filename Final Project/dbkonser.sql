-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 30, 2020 at 05:12 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbkonser`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `idadmin` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `telepon` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`idadmin`, `nama`, `alamat`, `email`, `telepon`) VALUES
(23, 'sela aulia', 'malang', 'selaaulia7@gmail.com', '081233222333'),
(27, 'farhan agil', 'pasuruan', 'farhan.agil@gmail.com', '089123456231'),
(28, 'hendri daffa', 'mojokerto', 'hendri@email.co.id', '088912321231'),
(29, 'diva ardhia', 'mojokerto', 'divardhia@gmail.com', '098123123432');

-- --------------------------------------------------------

--
-- Table structure for table `pembeli`
--

CREATE TABLE `pembeli` (
  `idpembeli` int(11) NOT NULL,
  `nik` varchar(255) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `telepon` varchar(20) NOT NULL,
  `jenis` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pembeli`
--

INSERT INTO `pembeli` (`idpembeli`, `nik`, `nama`, `alamat`, `email`, `telepon`, `jenis`) VALUES
(32, '3208978901234567', 'malik tuan', 'Lamongan', 'maliktuan@email.co.id', '089234543222', 'Member'),
(33, '3334567890989990', 'jaka jier', 'Surabaya', 'jaka.jier@gmail.com', '082345333444', 'Non Member'),
(34, '3212223330009990', 'Januar Brow', 'Surabaya', 'jaybrow@email.com', '089999000909', 'Non Member'),
(37, '234155646579422578', 'izaq aldi', 'jakarta', 'izaqaldi04@gmail.co.id', '088123123123', 'Member'),
(39, '24445627819234453', 'farhan agil', 'pasuruan', 'farhan@email.co.id', '098898231234', 'Non Member');

-- --------------------------------------------------------

--
-- Table structure for table `tiket`
--

CREATE TABLE `tiket` (
  `idtiket` int(11) NOT NULL,
  `konser` varchar(255) NOT NULL,
  `kategori` varchar(20) NOT NULL,
  `harga` int(20) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tiket`
--

INSERT INTO `tiket` (`idtiket`, `konser`, `kategori`, `harga`, `tanggal`) VALUES
(41, 'EVERYWHERE', 'Standing A', 1750000, '2018-11-11'),
(42, 'EVERYWHERE', 'Standing B', 1500000, '2018-11-11'),
(44, 'EVERYWHERE', 'Seating A', 2600000, '2018-11-11'),
(45, 'EVERYWHERE', 'Seating B', 2000000, '2018-11-11'),
(48, 'EVERYWHERE', 'Standing B', 1500000, '2018-11-11'),
(49, 'EVERYWHERE', 'standing A', 2600000, '2018-11-11'),
(50, 'EVERYWHERE', 'standing B', 1500000, '2018-11-11'),
(52, 'EVERYWHERE', 'seating B', 2000000, '2018-11-11'),
(53, 'EVERYWHERE', 'seating A', 2600000, '2018-11-11');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `idtransaksi` int(11) NOT NULL,
  `idadmin` int(11) NOT NULL,
  `idpembeli` int(11) NOT NULL,
  `idtiket` int(11) NOT NULL,
  `jumlah` int(20) NOT NULL,
  `tglbeli` date NOT NULL,
  `diskon` int(50) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`idtransaksi`, `idadmin`, `idpembeli`, `idtiket`, `jumlah`, `tglbeli`, `diskon`, `total`) VALUES
(36, 23, 32, 41, 3, '2018-11-09', 0, 300000),
(39, 28, 33, 41, 5, '2018-10-29', 875000, 7875000),
(40, 29, 34, 41, 1, '2018-10-30', 0, 1500000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`idadmin`);

--
-- Indexes for table `pembeli`
--
ALTER TABLE `pembeli`
  ADD PRIMARY KEY (`idpembeli`);

--
-- Indexes for table `tiket`
--
ALTER TABLE `tiket`
  ADD PRIMARY KEY (`idtiket`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`idtransaksi`),
  ADD KEY `idadmin` (`idadmin`),
  ADD KEY `idpembeli` (`idpembeli`),
  ADD KEY `idtiket` (`idtiket`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `idadmin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT for table `pembeli`
--
ALTER TABLE `pembeli`
  MODIFY `idpembeli` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- AUTO_INCREMENT for table `tiket`
--
ALTER TABLE `tiket`
  MODIFY `idtiket` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `idtransaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `FK_TransaksiAdmin` FOREIGN KEY (`idadmin`) REFERENCES `admin` (`idadmin`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_TransaksiPembeli` FOREIGN KEY (`idpembeli`) REFERENCES `pembeli` (`idpembeli`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_TransaksiTiket` FOREIGN KEY (`idtiket`) REFERENCES `tiket` (`idtiket`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
