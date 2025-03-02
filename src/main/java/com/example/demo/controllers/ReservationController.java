package com.example.demo.controllers;

import com.example.demo.entities.Reservation;
import com.example.demo.interfaces.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
    @Autowired
    IReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> retrieveAllReservations(){
        return reservationService.retrieveAllReservations();
    }

    @PostMapping("/add")
    public Reservation addReservation(Reservation res){
        return reservationService.addReservation(res);
    }

    @PutMapping("/update")
    public Reservation updateReservation(Reservation res){
        return reservationService.updateReservation(res);
    }

    @GetMapping("/get/{id}")
    public Reservation retrieveReservation(@PathVariable("id") Long id){
        return reservationService.retrieveReservation(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteReservation(@PathVariable("id") Long id){
        reservationService.deleteReservation(id);
    }
}
