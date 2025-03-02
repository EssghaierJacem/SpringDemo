package com.example.demo.interfaces;

import com.example.demo.entities.Reservation;

import java.util.List;

public interface IReservationService {
    public List<Reservation> retrieveAllReservations();
    public Reservation updateReservation(Reservation r);
    public Reservation addReservation(Reservation r);
    public Reservation retrieveReservation(Long idReservation);
    public void deleteReservation(Long idReservation);

}
