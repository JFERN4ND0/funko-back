package com.fantasma_de_los_funkos.funko.service;

import com.fantasma_de_los_funkos.funko.entities.Funko;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFunkoService {
    public List<Funko> getByNombre(String nombre);

    public List<Funko> getBySerie(String serie);

    public List<Funko> getBelong(String belong);
}
