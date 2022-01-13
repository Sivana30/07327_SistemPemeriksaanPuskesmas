-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 13 Jan 2022 pada 09.14
-- Versi server: 10.4.21-MariaDB
-- Versi PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pendaftaranpuskesmas`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `daftarpasien`
--

CREATE TABLE `daftarpasien` (
  `pasienid` int(11) NOT NULL,
  `accdokter` int(11) NOT NULL,
  `dokterpenanganan` varchar(50) NOT NULL,
  `keluhan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `daftarpasien`
--

INSERT INTO `daftarpasien` (`pasienid`, `accdokter`, `dokterpenanganan`, `keluhan`) VALUES
(1, 1, 'baik', 'gak ada');

-- --------------------------------------------------------

--
-- Struktur dari tabel `dokter`
--

CREATE TABLE `dokter` (
  `nama` varchar(30) NOT NULL,
  `notelp` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `tgllahir` date NOT NULL,
  `nip` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `dokter`
--

INSERT INTO `dokter` (`nama`, `notelp`, `password`, `tgllahir`, `nip`) VALUES
('admin', '345', 'admin', '2022-01-05', 'admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pasien`
--

CREATE TABLE `pasien` (
  `nama` varchar(30) NOT NULL,
  `notelp` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `tgllahir` date NOT NULL,
  `diagnosa` text NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pasien`
--

INSERT INTO `pasien` (`nama`, `notelp`, `password`, `tgllahir`, `diagnosa`, `id`) VALUES
('admin1', '089', 'admin1', '2002-08-22', 'belom', 1);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `daftarpasien`
--
ALTER TABLE `daftarpasien`
  ADD PRIMARY KEY (`pasienid`);

--
-- Indeks untuk tabel `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `pasien`
--
ALTER TABLE `pasien`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
