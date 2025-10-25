package com.pos.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pos.project.dtos.PratoDto;
import com.pos.project.model.Prato;
import com.pos.project.services.PratoServices;

@RestController
public class Controller {


    @Autowired
    private PratoServices pratoServices;
    
    @GetMapping("/")
    public String test(){
        return "Olá, mundo";
    }

    @PostMapping("/pratos")
    public ResponseEntity newPrato(@RequestBody PratoDto prato){
        String response = pratoServices.savePrato(prato);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/pratos")
    public Iterable<Prato> getPratos(){
        Iterable<Prato> pratos = pratoServices.getPratos();
        return pratos;
    }
}
