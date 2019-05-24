-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 23, 2019 at 05:48 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `university_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `student_info`
--

CREATE TABLE `student_info` (
  `stu_id` int(8) NOT NULL,
  `stu_name` varchar(80) NOT NULL,
  `stu_date` date NOT NULL,
  `stu_email` varchar(80) NOT NULL,
  `stu_gpa` float NOT NULL,
  `stu_major` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_info`
--

INSERT INTO `student_info` (`stu_id`, `stu_name`, `stu_date`, `stu_email`, `stu_gpa`, `stu_major`) VALUES
(1, 'bishoy alper aziz', '1997-08-12', 'bishoy.alper.aziz@gmail.com', 3.9, 'Software Engineering'),
(2, 'abdelrahman sobhy', '1997-06-02', 'abdo.sobhy97@gmail.com', 2.8, 'software Engineering'),
(3, 'Abdelrahman tarek', '1997-05-05', 'abdlerhman.tarek.love21@yahoo.com', 2.5, 'computer science'),
(4, 'yasser elsayed', '1997-05-05', 'yasserelsayed77@gmail.com', 3, 'pharmacy'),
(5, 'ahmed mosaad', '1997-12-12', 'ahmed.mosaad.mosaad@yahoo.com', 2.9, 'electronic engineering'),
(6, 'hossam elgamal ', '1997-01-01', 'hossamlovegirls21@gmail.com', 3.2, 'Petroleum Engineering');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `student_info`
--
ALTER TABLE `student_info`
  ADD PRIMARY KEY (`stu_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `student_info`
--
ALTER TABLE `student_info`
  MODIFY `stu_id` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
