package com.example.demo.controllers;

import com.example.demo.entities.Chambre;
import com.example.demo.interfaces.IChambreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chambre")
public class ChambreController {
    @Autowired
    IChambreService chambreService;

    @GetMapping("/all")
    public List<Chambre> getAll(){
        return chambreService.retrieveAllChambres();
    }

    @PostMapping("/add")
    public Chambre addChambres(@RequestBody Chambre chambre){
        return chambreService.addChambre(chambre);
    }

    @PutMapping("/update")
    public Chambre updateChambre(@RequestBody Chambre f){
        return chambreService.updateChambre(f);
    }

    @GetMapping("/get/{id}")
    public Chambre getChambre(@PathVariable("id") Long id){
        return chambreService.retrieveChambre(id);
    }

    @DeleteMapping("/delete/{id}")
    public void removeChambre(@PathVariable("id") Long id){
        chambreService.deleteChambre(id);
    }
}
