package com.example.demo.controllers;

import com.example.demo.entities.Universite;
import com.example.demo.interfaces.IUniversiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universite")
public class UniversiteController {
    @Autowired
    IUniversiteService universiteService;


    @GetMapping("/all")
    public List<Universite> retrieveAll(){
        return universiteService.retrieveAllUniversities();
    }

    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite u){
        return universiteService.addUniversite(u);
    }

    @PutMapping("/update")
    public Universite updateUniversite(@RequestBody  Universite u ){
        return universiteService.updateUniversite(u);
    }

    @GetMapping("/get/{id}")
    public Universite retrieveUniversite(@PathVariable("id") Long id)
    {
        return universiteService.retrieveUniversite(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUniversite(@PathVariable("id") Long id){
        universiteService.deleteUniversite(id);
    }
}
