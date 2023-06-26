package com.bus.booking.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Payment")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Payment {
    @Id
    @Column(name = "paymentid")
    private Integer PaymentId;
    @Column(name = "bookingid")
    private Integer bookingId;
    @Column(name = "totalamount")
    private Double totalAmount;
    @Column(name = "paymentdate")
    private Date paymentDate;
    @Column(name = "totalseats")
    private String totalSeats;


}


