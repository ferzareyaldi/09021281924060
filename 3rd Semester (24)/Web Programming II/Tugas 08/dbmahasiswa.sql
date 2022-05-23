-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 19 Okt 2020 pada 07.37
-- Versi server: 10.4.11-MariaDB
-- Versi PHP: 7.3.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbmahasiswa`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_mahasiswa`
--

CREATE TABLE `tb_mahasiswa` (
  `id` int(12) NOT NULL,
  `nama` varchar(35) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `gender` enum('Pria','Wanita') NOT NULL,
  `tgl_lahir` date NOT NULL,
  `jurusan` varchar(35) NOT NULL,
  `minat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_mahasiswa`
--

INSERT INTO `tb_mahasiswa` (`id`, `nama`, `alamat`, `gender`, `tgl_lahir`, `jurusan`, `minat`) VALUES
(1, 'Budi Susanto utama', 'Jl.Jendral Sudirman No78789', 'Pria', '1999-02-12', 'Sistem Komputer', 'Programming,Desain,OlahRaga'),
(2, 'Ari Fernandes', 'Jl. Permata hati No 55 Palembang', 'Pria', '2007-07-07', 'Teknik Informatika', 'Programming,Desain,OlahRaga'),
(5, 'Sari Rahayu', 'Bukit', 'Wanita', '1999-01-01', 'Teknik Informatika', 'OlahRaga'),
(12, 'Ani', 'plaju', 'Pria', '2019-01-01', 'Teknik Informatika', 'Programming,Desain,OlahRaga');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_mahasiswa`
--
ALTER TABLE `tb_mahasiswa`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
