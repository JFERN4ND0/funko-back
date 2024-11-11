package com.fantasma_de_los_funkos.funko.service;

import com.fantasma_de_los_funkos.funko.entities.Funko;

import java.util.List;

public interface IFunkoService {
    List<Funko> getAll();
    List<Funko> getByNombre(String nombre);
    void save(Funko funko);
}
