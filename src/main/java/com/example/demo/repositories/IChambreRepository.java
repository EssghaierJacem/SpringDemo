package com.example.demo.repositories;

import com.example.demo.entities.Chambre;
import com.example.demo.entities.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IChambreRepository extends JpaRepository<Chambre,Long> {

    @Query("SELECT c FROM Chambre c WHERE c.bloc.foyer.universite.nomUniversite = :nomUniversite AND c.typeChambre = :type AND c.reservations IS EMPTY")
    List<Chambre> findChambresNonReservees(String nomUniversite, TypeChambre type);

    @Query("SELECT c FROM Chambre c WHERE c.bloc.idBloc = :idBloc AND c.typeChambre = :typeC")
    List<Chambre> findChambresByBlocAndTypeJPQL(long idBloc, TypeChambre typeC);

    List<Chambre> findByBlocIdBlocAndTypeChambre(long idBloc, TypeChambre type);
}
