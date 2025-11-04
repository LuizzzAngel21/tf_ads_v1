package com.farmaceutica.repository;

import com.farmaceutica.model.ProductoProveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoProveedorRepository extends JpaRepository<ProductoProveedor, Integer> {
}