package com.fantasma_de_los_funkos.funko.service;

import com.fantasma_de_los_funkos.funko.entities.Funko;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IFunkoService {

    public List<Funko> getAllFunko();
    public Funko getById(Integer id);
    public void remove(Integer id);
    public void save(Funko funko);

    public List<Funko> getByName(String name);

    public List<Funko> getBySerie(String serie);

    public List<Funko> getBelong(String belong);
}
