package com.bus.booking.controller;
import com.bus.booking.model.Booking;
import com.bus.booking.model.Bus;
import com.bus.booking.model.Passenger;
import com.bus.booking.model.Payment;
import com.bus.booking.repository.BookingRepository;
import com.bus.booking.repository.BusRepository;
import com.bus.booking.repository.PassengerRepository;
import com.bus.booking.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RestAPIController {

    @Autowired
    private BusRepository busRepository;

    @Autowired
    private PassengerRepository passengerRepository;

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private PaymentRepository paymentRepository;



    @GetMapping(path = "/getBuses")
    public List<Bus> getBuses(){
        System.out.println("Calling getBuses API");
        return busRepository.findAll();
    }

    @PostMapping(path = "/addBus")
    public Bus addBus(@RequestBody Bus bus){
        System.out.println("Adding bus with id:"+ bus.getBusId());
        return busRepository.save(bus);
    }

    @GetMapping(path = "/getBus/{busId}")
    public Optional<Bus> getBuses(@PathVariable("busId") Integer busId){
        System.out.println("Calling getBus/{busId} API");
        return busRepository.findById(busId);
    }

    @GetMapping(path = "/getPassengers")
    public List<Passenger> getPassengers(){
        System.out.println("Calling getPassengers API");
        return passengerRepository.findAll();
    }

    @GetMapping(path = "/getPassenger/{passengerId}")
    public Optional<Passenger> getPassenger(@PathVariable("passengerId") Integer passengerId){
        System.out.println("Calling getPassenger/{passengerId} API");
        return passengerRepository.findById(passengerId);
    }


    @GetMapping(path = "/getPayments")
    public List<Payment> getPayments(){
        System.out.println("Calling getPayments API");
        return paymentRepository.findAll();
    }

    @GetMapping(path = "/getPayment/{paymentId}")
    public Optional<Payment> getPayment(@PathVariable("paymentId") Integer paymentId){
        System.out.println("Calling getPayment/{paymentId} API");
        return paymentRepository.findById(paymentId);
    }


    @GetMapping(path = "/getBookings")
    public List<Booking> getBookings(){
        System.out.println("Calling getBookings API");
        return bookingRepository.findAll();
    }

    @GetMapping(path = "/getBooking/{bookingId}")
    public Optional<Booking> getBooking(@PathVariable("bookingId") Integer bookingId){
        System.out.println("Calling getBooking/{bookingId} API");
        return bookingRepository.findById(bookingId);
    }
}
