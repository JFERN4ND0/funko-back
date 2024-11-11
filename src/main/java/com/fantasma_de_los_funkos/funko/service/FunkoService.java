package com.fantasma_de_los_funkos.funko.service;

import com.fantasma_de_los_funkos.funko.entities.Funko;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunkoService implements IFunkoService{
    @Autowired
    @Override
    public List<Funko> getAll() {
        return null;
    }

    @Override
    public List<Funko> getByNombre(String nombre) {
        return null;
    }

    @Override
    public void save(Funko funko) {

    }
}
