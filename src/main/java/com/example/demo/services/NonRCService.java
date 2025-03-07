package com.example.demo.services;

import com.example.demo.entities.Chambre;
import com.example.demo.entities.Reservation;
import com.example.demo.entities.TypeChambre;
import com.example.demo.interfaces.INonRCService;
import com.example.demo.repositories.IChambreRepository;
import com.example.demo.repositories.IReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NonRCService implements INonRCService {

    @Autowired
    IChambreRepository chambreRepository;

    @Autowired
    IReservationRepository reservationRepository;

    public List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeChambre type) {
        return chambreRepository.findChambresNonReservees(nomUniversite, type);
    }

    public List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(Date anneeUniversitaire, String nomUniversite) {
        return reservationRepository.findReservationsByAnneeUniversitaireAndNomUniversite(anneeUniversitaire, nomUniversite);
    }

    public List<Chambre> getChambresParBlocEtTypeJPQL(long idBloc, TypeChambre typeC) {
        return chambreRepository.findChambresByBlocAndTypeJPQL(idBloc, typeC);
    }

    public List<Chambre> getChambresParBlocEtTypeKeywords(long idBloc, TypeChambre typeC) {
        return chambreRepository.findByBlocIdBlocAndTypeChambre(idBloc, typeC);
    }
}
