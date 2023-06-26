package com.bus.booking.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Bus")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bus {

    @Id
    @Column(name = "busid")
    private Integer busId;
    @Column(name = "bustype")
    private String busType;
    @Column(name = "isac")
    private int isAc;
    @Column(name = "issleeper")
    private int isSleeper;
    @Column(name = "departurecity")
    private String departureCity;
    @Column(name = "arrivalcity")
    private String arrivalCity;
    @Column(name = "cost")
    private double cost;
    @Column(name = "totalseats")
    private int totalSeats;

}
