package com.example.demo.controllers;

import com.example.demo.entities.Chambre;
import com.example.demo.entities.Reservation;
import com.example.demo.entities.TypeChambre;
import com.example.demo.interfaces.INonRCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class NonRCController {

    @Autowired
    INonRCService nonRCService;

    @GetMapping("/chambresNonReservees")
    public List<Chambre> getChambresNonReservees(@RequestParam String nomUniversite, @RequestParam TypeChambre type) {
        return nonRCService.getChambresNonReserveParNomUniversiteEtTypeChambre(nomUniversite, type);
    }

    @GetMapping("/reservations")
    public List<Reservation> getReservations(@RequestParam Date anneeUniversitaire, @RequestParam String nomUniversite) {
        return nonRCService.getReservationParAnneeUniversitaireEtNomUniversite(anneeUniversitaire, nomUniversite);
    }

    @GetMapping("/chambresParBlocJPQL")
    public List<Chambre> getChambresParBlocJPQL(@RequestParam long idBloc, @RequestParam TypeChambre typeC) {
        return nonRCService.getChambresParBlocEtTypeJPQL(idBloc, typeC);
    }

    @GetMapping("/chambresParBlocKeywords")
    public List<Chambre> getChambresParBlocKeywords(@RequestParam long idBloc, @RequestParam TypeChambre typeC) {
        return nonRCService.getChambresParBlocEtTypeKeywords(idBloc, typeC);
    }
}
