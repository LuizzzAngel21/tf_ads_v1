package com.farmaceutica.service;

import com.farmaceutica.dto.ProveedorDto;
import com.farmaceutica.mapper.ProveedorMapper;
import com.farmaceutica.model.Proveedor;
import com.farmaceutica.repository.ProveedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProveedorService {

    private final ProveedorRepository repository;

    public ProveedorService(ProveedorRepository repository) {
        this.repository = repository;
    }

    // Crear proveedor
    public ProveedorDto crearProveedor(ProveedorDto dto) {
        Proveedor proveedor = ProveedorMapper.toEntity(dto);
        proveedor = repository.save(proveedor);
        return ProveedorMapper.toDto(proveedor);
    }

    // Listar todos los proveedores
    public List<ProveedorDto> listarProveedores() {
        List<Proveedor> proveedores = repository.findAll();
        return proveedores.stream()
                .map(ProveedorMapper::toDto)
                .collect(Collectors.toList());
    }
}
