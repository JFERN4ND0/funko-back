package com.fantasma_de_los_funkos.funko.repository;

import com.fantasma_de_los_funkos.funko.entities.Funko;
import java.util.List;

public interface FunkoRepository {
    public void createFunko(Funko funko);

    public List<Funko> readAllFunko();
    public void updateFunko(String id);

    public void deleteFunko(String id);
}
