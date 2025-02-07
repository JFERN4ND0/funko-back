package com.fantasma_de_los_funkos.funko.repository;

import com.fantasma_de_los_funkos.funko.entities.Funko;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FunkoRepository extends JpaRepository<Funko, Integer> {
    @Query("SELECT f FROM Funko f WHERE f.name LIKE %:name%")
    List<Funko> findByNameLike(@Param("name") String name);

    @Query("SELECT f FROM Funko f WHERE f.serie LIKE %:serie%")
    List<Funko> findBySerieLike(@Param("serie") String serie);

    @Query("SELECT f FROM Funko f WHERE f.belong = :belong")
    List<Funko> findByBelong(@Param("belong") String belong);
}
