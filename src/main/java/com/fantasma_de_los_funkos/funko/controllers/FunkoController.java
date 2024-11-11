package com.fantasma_de_los_funkos.funko.controllers;

import com.fantasma_de_los_funkos.funko.entities.Funko;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/funkos")
public class FunkoController {

    @GetMapping("/all")
    public ResponseEntity<List<Funko>> getAll() {
        List<Funko> funkos = new ArrayList<>();
        funkos.add(new Funko());
        return ResponseEntity.ok(funkos);
    }
}
