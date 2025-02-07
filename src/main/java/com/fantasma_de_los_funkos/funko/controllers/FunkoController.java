package com.fantasma_de_los_funkos.funko.controllers;

import com.fantasma_de_los_funkos.funko.entities.Funko;

import com.fantasma_de_los_funkos.funko.repository.FunkoRepository;
import com.fantasma_de_los_funkos.funko.service.IFunkoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/funkos")
public class FunkoController {

    @Autowired
    private IFunkoService service;

    @PostMapping("/save")
    public void save(@RequestBody Funko funko) {
        service.save(funko);
    }

    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Integer.parseInt(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Funko>> getAll() {
        List<Funko> funkos = service.getAllFunko();
        return ResponseEntity.ok(funkos);
    }

    @GetMapping("/byName/{name}")
    public ResponseEntity<?> getByName(@PathVariable String name) {
        List<Funko> funkos = service.getByName(name);

        if (funkos.isEmpty()) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("funkos de " + name + " no encontrados");
        } else {
            return ResponseEntity.ok(funkos);
        }
    }

    @GetMapping("/bySerie/{serie}")
    public ResponseEntity<?> getBySerie(@PathVariable String serie) {
        List<Funko> funkos = service.getBySerie(serie);

        if (funkos.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("funkos de " + serie + " no encontrados");
        } else {
            return ResponseEntity.ok(funkos);
        }
    }

    @GetMapping("/byBelong/{belong}")
    public ResponseEntity<?> getBelong(@PathVariable String belong) {
        List<Funko> funkos = service.getBelong(belong);

        if (funkos.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("funkos de " + belong + " no encontrados");
        } else {
            return ResponseEntity.ok(funkos);
        }
    }
}
