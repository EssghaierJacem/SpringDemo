package com.example.demo.interfaces;

import com.example.demo.entities.Chambre;

import java.util.List;

public interface IChambreService {
    public List<Chambre> retrieveAllChambres();
    public Chambre addChambre(Chambre c);
    public Chambre updateChambre(Chambre c);
    public Chambre retrieveChambre(Long idChambre) ;
    public void deleteChambre(Long idChambre);
}
