package com.example.demo.repositories;

import com.example.demo.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IReservationRepository extends JpaRepository<Reservation,Long> {

    @Query("SELECT r FROM Reservation r WHERE r.anneeUniversitaire = :anneeUniversitaire AND r.bloc.foyer.universite.nomUniversite = :nomUniversite")
    List<Reservation> findReservationsByAnneeUniversitaireAndNomUniversite(Date anneeUniversitaire, String nomUniversite);
}

