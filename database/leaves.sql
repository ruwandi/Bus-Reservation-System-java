-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 12, 2018 at 04:36 PM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `leaves`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_details`
--

CREATE TABLE IF NOT EXISTS `admin_details` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `admin_details`
--

INSERT INTO `admin_details` (`id`, `name`, `username`, `password`) VALUES
(1, 'Ruwandi', 'Admin1', 'admin1'),
(2, 'Chathura', 'Admin2', 'admin2');

-- --------------------------------------------------------

--
-- Table structure for table `bus_details`
--

CREATE TABLE IF NOT EXISTS `bus_details` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `bus_no` varchar(100) NOT NULL,
  `bus_source` varchar(100) NOT NULL,
  `bus_dest` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `bus_details`
--

INSERT INTO `bus_details` (`id`, `bus_no`, `bus_source`, `bus_dest`) VALUES
(1, 'EP-2081', 'sasu', 'Galle'),
(2, 'EP-2054', 'rashi', 'Hambanthota');

-- --------------------------------------------------------

--
-- Table structure for table `user_details`
--

CREATE TABLE IF NOT EXISTS `user_details` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `email_id` varchar(100) NOT NULL,
  `phone_no` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=21 ;

--
-- Dumping data for table `user_details`
--

INSERT INTO `user_details` (`id`, `firstname`, `lastname`, `username`, `password`, `email_id`, `phone_no`) VALUES
(13, 'cathura', 'ravisankha', 'cathura', '19950107cha', 'chathurasika9592@gmail.com', '0711539038'),
(14, 'ruwandi', 'madunamali', 'ruwandi', '1102', 'ruwandi1102@gmail.com', '0702279385'),
(18, 'dilmi', 'hansika', 'dilmi', 'cat', 'ruwandi@gmail.com', '123468'),
(19, 'dfgd', '', '', '', '', ''),
(20, '', '', 'ruwandi', '1102', '', '');
