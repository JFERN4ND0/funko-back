package com.fantasma_de_los_funkos.funko.repository;

import com.fantasma_de_los_funkos.funko.entities.Funko;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FunkoRepositoryImp implements FunkoRepository {
    @PersistenceContext
    private EntityManager entityManagerC;

    @Override
    public void createFunko(Funko funko) {

    }

    @Override
    public List<Funko> readAllFunko() {
        return null;
    }

    @Override
    public void updateFunko(String id) {

    }

    @Override
    public void deleteFunko(String id) {

    }
}
