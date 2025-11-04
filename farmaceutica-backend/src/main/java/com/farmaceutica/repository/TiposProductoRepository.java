package com.farmaceutica.repository;

import com.farmaceutica.model.TipoProducto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TiposProductoRepository extends JpaRepository<TipoProducto, Integer> {
}