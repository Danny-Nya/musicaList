package com.example.musicalist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.musicalist.DTOs.VotoDTO;
import com.example.musicalist.modelo.Voto;
import com.example.musicalist.services.VotoService;
@RestController
@RequestMapping("/Voto")
public class VotoController {

    @Autowired
    VotoService votoService;

    @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
    @PostMapping("/Agregar")
    public Voto insertar(@RequestBody VotoDTO votoDTO){
        return votoService.insertar(votoDTO);
    
    
    }

    @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
    @GetMapping("/Lista")
    public List<VotoDTO> lista(){
        return votoService.listar();

    }
}
