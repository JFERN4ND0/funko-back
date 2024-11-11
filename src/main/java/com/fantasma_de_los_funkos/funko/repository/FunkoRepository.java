package com.fantasma_de_los_funkos.funko.repository;

import com.fantasma_de_los_funkos.funko.entities.Funko;
import org.springframework.stereotype.Repository;

@Repository|
public interface FunkoRepository extends CrudRepository<Funko, Long> {
}
