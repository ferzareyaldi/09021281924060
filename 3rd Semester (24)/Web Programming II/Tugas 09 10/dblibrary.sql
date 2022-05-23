-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 21, 2020 at 12:43 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dblibrary`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_book`
--

CREATE TABLE `tb_book` (
  `id_book` int(11) NOT NULL,
  `title_book` varchar(35) NOT NULL,
  `writer` varchar(25) NOT NULL,
  `publisher` varchar(35) NOT NULL,
  `category` varchar(100) NOT NULL,
  `review` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_book`
--

INSERT INTO `tb_book` (`id_book`, `title_book`, `writer`, `publisher`, `category`, `review`) VALUES
(1, 'Java Programming', 'Reyaldi', 'Stepic', 'Buku Programming,Buku Komputer', 'Buku berisi tentang pemrograman dengan Java'),
(2, 'Kotlin Programming', 'Ferza', 'Coursera', 'Buku Programming', 'Buku ini berisi tentang Pemrograman Kotlin'),
(3, 'Dart Programming', 'Ferzaldi', 'Erlangga', 'Buku Programming,Buku Komputer', 'Buku ini berisi tentang pemrograman Dart'),
(4, 'Organisasi Komputer', 'Neil Rhodes', 'Erlangga', 'Buku Komputer', 'Buku ini berisi tentang organisasi komputer'),
(5, 'Tuntunan Sholat', 'Ust. Khalid B', 'Erlangga', 'Buku Agama', 'Buku ini berisi tentang tuntunan sholat berdasarkan sunnah nabi');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_book`
--
ALTER TABLE `tb_book`
  ADD PRIMARY KEY (`id_book`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
