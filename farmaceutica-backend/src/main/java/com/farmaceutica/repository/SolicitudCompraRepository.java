package com.farmaceutica.repository;

import com.farmaceutica.model.SolicitudCompra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudCompraRepository extends JpaRepository<SolicitudCompra, Integer> {
}