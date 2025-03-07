package com.example.demo.services;

import com.example.demo.entities.Chambre;
import com.example.demo.entities.Reservation;
import com.example.demo.entities.TypeChambre;
import com.example.demo.interfaces.IChambreService;
import com.example.demo.repositories.IChambreRepository;
import com.example.demo.repositories.IReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ChambreService implements IChambreService {
    @Autowired
    IChambreRepository chambreRepository;

    @Autowired
    IReservationRepository reservationRepository;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return (List<Chambre>) chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(Long idChambre) {
        return chambreRepository.findById(idChambre).orElse(null);
    }

    @Override
    public void deleteChambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);
    }

}
