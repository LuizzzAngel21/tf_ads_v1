package com.farmaceutica.repository;

import com.farmaceutica.model.FormaFarmaceutica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormasFarmaceuticaRepository extends JpaRepository<FormaFarmaceutica, Integer> {
}