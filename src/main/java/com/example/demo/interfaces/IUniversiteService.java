package com.example.demo.interfaces;

import com.example.demo.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    public List<Universite> retrieveAllUniversities();
    public Universite addUniversite(Universite u);
    public Universite UpdateUniversite(Universite u);
    public Universite retrieveUniversite(Long idUniversite);
    public void deleteUniversite(Long idUniversite);
    public Universite updateUniversite(Universite u);
}
