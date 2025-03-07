package com.example.demo.interfaces;

import com.example.demo.entities.Chambre;
import com.example.demo.entities.Reservation;
import com.example.demo.entities.TypeChambre;
import java.util.Date;
import java.util.List;

public interface INonRCService {
    List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeChambre type);
    List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(Date anneeUniversitaire, String nomUniversite);
    List<Chambre> getChambresParBlocEtTypeJPQL(long idBloc, TypeChambre typeC);
    List<Chambre> getChambresParBlocEtTypeKeywords(long idBloc, TypeChambre typeC);
}