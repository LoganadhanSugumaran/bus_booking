

-- Script for creating Bus Booking DB --

CREATE DATABASE booking;

USE booking;

DROP TABLE IF EXISTS `bus`;
CREATE TABLE `bus` (
  `BusId` int(11) NOT NULL,
  `BusType` varchar(128) DEFAULT NULL,
  `IsAC` int(1) DEFAULT NULL,
  `IsSleeper` int(1) DEFAULT NULL,
  `DepartureCity` varchar(128) DEFAULT NULL,
  `ArrivalCity` varchar(128) DEFAULT NULL,
  `cost` double NOT NULL,
  `TotalSeats` int(3) DEFAULT NULL,
  PRIMARY KEY (`BusId`)
);

DROP TABLE IF EXISTS `passenger`;
CREATE TABLE `passenger` (
  `PassengerId` int(11) NOT NULL ,
  `FirstName` varchar(64) DEFAULT NULL,
  `LastName` varchar(64) DEFAULT NULL,
  `Address` varchar(128) DEFAULT NULL,
  `City` varchar(128) DEFAULT NULL,
  `Email` varchar(128) NOT NULL,
  `PhoneNumber` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`PassengerId`),
  UNIQUE KEY `Email` (`Email`)
);

DROP TABLE IF EXISTS `booking`;
CREATE TABLE `booking` (
  `BookingId` int(11) NOT NULL,
  `PassengerId` int(11) DEFAULT NULL,
  `BusId` int(11) DEFAULT NULL,
  `DepartureDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`BookingId`),
  KEY `PassengerId` (`PassengerId`),
  KEY `BusId` (`BusId`),
  CONSTRAINT `booking_ibfk_2` FOREIGN KEY (`BusId`) REFERENCES `bus` (`BusId`) ON DELETE CASCADE
) ;

DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment` (
  `PaymentId` int(11) NOT NULL,
  `BookingId` int(11) DEFAULT NULL,
  `TotalAmount` double DEFAULT NULL,
  `PaymentDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `TotalSeats` int(3) DEFAULT NULL,
  PRIMARY KEY (`PaymentId`),
  KEY `BookingId` (`BookingId`),
  CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`BookingId`) REFERENCES `booking` (`BookingId`) ON DELETE CASCADE
); 


INSERT INTO BUS( BUSID, BUSTYPE, ISAC, ISSLEEPER, DEPARTURECITY, ARRIVALCITY, COST, TOTALSEATS) VALUES ( 1, 'Volvo', 1, 0, 'Bengaluru', 'Chennai', 1000.50, 50)

INSERT INTO PASSENGER( PASSENGERID, FIRSTNAME, LASTNAME, ADDRESS, CITY, EMAIL, PHONENUMBER) VALUES (11, 'JOHN', 'SMITH','MANGALORE', 'KARNATAKA', 'JOHNSMITH@GMAIL.COM','8764564723')

INSERT INTO BOOKING( BOOKINGID, PASSENGERID, BUSID, DEPARTUREDATE) VALUES (1, 11, 1, '2023-05-19 11:08:23')

INSERT INTO PAYMENT( PAYMENTID, BOOKINGID, TOTALAMOUNT, PAYMENTDATE, TOTALSEATS) VALUES (5, 1, 950.50, '2023-05-19 11:08:23', 5)



