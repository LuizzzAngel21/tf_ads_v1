package com.farmaceutica.repository;

import com.farmaceutica.model.DetalleRequerimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleRequerimientoRepository extends JpaRepository<DetalleRequerimiento, Integer> {
}