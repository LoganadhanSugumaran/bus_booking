package com.bus.booking.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Booking")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Booking {
    @Id
    @Column(name = "bookingid")
    private Integer bookingId;
    @Column(name = "passengerid")
    private Integer passengerId;
    @Column(name = "busid")
    private Integer busId;
    @Column(name = "departuredate")
    private Date departureDate;



}


