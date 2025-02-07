package com.fantasma_de_los_funkos.funko.service;

import com.fantasma_de_los_funkos.funko.entities.Funko;
import com.fantasma_de_los_funkos.funko.repository.FunkoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunkoService implements IFunkoService{

    @Autowired
    private FunkoRepository repository;

    public List<Funko> getAllFunko() {
        return (List<Funko>) repository.findAll();
    }

    @Override
    public Funko getById(Integer id) {
        return (Funko) repository.findById(id).get();
    }

    @Override
    public void remove(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void save(Funko funko) {
        repository.save(funko);
    }

    @Override
    public List<Funko> getByName(String name) {
        return repository.findByNameLike(name);
    }

    @Override
    public List<Funko> getBySerie(String serie) {
        return repository.findBySerieLike(serie);
    }

    @Override
    public List<Funko> getBelong(String belong) {
        return repository.findByBelong(belong);
    }
}
