package com.farmaceutica.repository;

import com.farmaceutica.model.LoteProducto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LotesProductoRepository extends JpaRepository<LoteProducto, Integer> {
}