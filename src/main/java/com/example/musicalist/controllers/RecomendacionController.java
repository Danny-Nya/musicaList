package com.example.musicalist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.musicalist.DTOs.RecomendacionDTO;
import com.example.musicalist.modelo.Recomendacion;
import com.example.musicalist.services.RecomendacionService;

@RestController
@RequestMapping("/Recomendacion")
public class RecomendacionController {

    @Autowired
    RecomendacionService recomendacionService;

    @PostMapping("/Agregar")
    public Recomendacion insertar(@RequestBody RecomendacionDTO recomendacionDTO){

        return recomendacionService.insertar(recomendacionDTO);
    }

    @GetMapping("/Lista")
    public List<RecomendacionDTO> listar(){

        return recomendacionService.listar();
    }
    
    
    
}