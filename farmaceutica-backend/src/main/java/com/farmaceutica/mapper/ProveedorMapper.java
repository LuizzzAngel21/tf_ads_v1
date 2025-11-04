package com.farmaceutica.mapper;

import com.farmaceutica.dto.ProveedorDto;
import com.farmaceutica.model.Proveedor;

import java.time.Instant;

public class ProveedorMapper {

    // Convierte ProveedorDto -> Proveedor (entidad)
    public static Proveedor toEntity(ProveedorDto dto) {
        if (dto == null) return null;

        Proveedor proveedor = new Proveedor();
        proveedor.setNombreProveedor(dto.getNombreProveedor());
        proveedor.setRuc(dto.getRuc());
        proveedor.setDireccion(dto.getDireccion());
        proveedor.setTelefono(dto.getTelefono());
        proveedor.setCorreo(dto.getCorreo());
        proveedor.setEstado(true); // Asignamos true por defecto al crear
        proveedor.setFechaCreacion(Instant.now());
        proveedor.setFechaActualizacion(Instant.now());

        return proveedor;
    }

    // Convierte Proveedor (entidad) -> ProveedorDto
    public static ProveedorDto toDto(Proveedor proveedor) {
        if (proveedor == null) return null;

        return new ProveedorDto(
                proveedor.getNombreProveedor(),
                proveedor.getRuc(),
                proveedor.getDireccion(),
                proveedor.getTelefono(),
                proveedor.getCorreo()
        );
    }
}
