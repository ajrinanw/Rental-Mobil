-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 28, 2022 at 10:37 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rental_mobil`
--

-- --------------------------------------------------------

--
-- Table structure for table `mobil`
--

CREATE TABLE `mobil` (
  `kode` varchar(10) NOT NULL,
  `nama_mobil` varchar(20) NOT NULL,
  `merek` varchar(30) NOT NULL,
  `warna` varchar(20) NOT NULL,
  `no_polisi` varchar(20) NOT NULL,
  `no_bpkb` varchar(20) NOT NULL,
  `harga` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mobil`
--

INSERT INTO `mobil` (`kode`, `nama_mobil`, `merek`, `warna`, `no_polisi`, `no_bpkb`, `harga`) VALUES
('1', 'S', 'Tesla', 'Merah', 'B234RFO', '123412341234', 1200000),
('3', 'G Class', 'Mercedes Bens', 'Hitam', 'AD789BE', '234234342345', 900000),
('2', 'CR-V', 'Honda', 'Abu-Abu', 'K2341AJ', '345634563456', 450000),
('4', 'X1', 'BMW', 'Putih', 'B123UY', '984039260582', 870000),
('5', 'Pajero Sport', 'Mitsubishi', 'Hitam', 'B9856JU', '740205739503', 600000);

-- --------------------------------------------------------

--
-- Table structure for table `pengembalian`
--

CREATE TABLE `pengembalian` (
  `namaPelanggan` varchar(25) NOT NULL,
  `noPolisi` varchar(11) NOT NULL,
  `tglPinjam` varchar(10) NOT NULL,
  `tglBalik` varchar(10) NOT NULL,
  `lama` varchar(3) NOT NULL,
  `hargaSewa` varchar(11) NOT NULL,
  `totHarga` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pengembalian`
--

INSERT INTO `pengembalian` (`namaPelanggan`, `noPolisi`, `tglPinjam`, `tglBalik`, `lama`, `hargaSewa`, `totHarga`) VALUES
('Dicky Hendra Pamungkas', 'AD789BE', '15/03/2022', '17/03/2022', '3', '900000', '2700000.0');

-- --------------------------------------------------------

--
-- Table structure for table `penyewa`
--

CREATE TABLE `penyewa` (
  `No` int(20) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Nik` varchar(20) NOT NULL,
  `namaMobil` varchar(25) NOT NULL,
  `noPolisi` varchar(25) NOT NULL,
  `tglPinjam` varchar(10) NOT NULL,
  `Harga` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `penyewa`
--

INSERT INTO `penyewa` (`No`, `Nama`, `Nik`, `namaMobil`, `noPolisi`, `tglPinjam`, `Harga`) VALUES
(1, 'Ajrina Nasywa Wahyudi', 'K3520009', 'X1 - BMW', 'B123UY', '04/05/2022', '870000'),
(2, 'Annisa Rachmawati', 'K3520015', 'Pajero Sport - Mitsubishi', 'B9856JU', '28/04/2022', '600000'),
(3, 'Wahyudi', '12341234', 'CR-V - Honda', 'K2341AJ', '11/02/2022', '450000'),
(4, 'Dicky Hendra Pamungkas', 'K3520021', 'G Class', 'AD789BE', '15/03/2022', '900000'),
(5, 'Pimingkis', '56785678', 'S - Tesla', 'B234RFO', '14/05/2022', '1200000'),
(6, 'Icut', '123412341234', 'CR-V - Honda', 'K2341AJ', '11/12/2012', '450000'),
(7, 'Aje', '34567559', 'X1 - BMW', 'B123UY', '12/05/2022', '870000'),
(8, 'Dino Daniro', '3649765', 'Pajero Sport - Mitsubishi', 'B9856JU', '11/05/2022', '600000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `penyewa`
--
ALTER TABLE `penyewa`
  ADD PRIMARY KEY (`No`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
