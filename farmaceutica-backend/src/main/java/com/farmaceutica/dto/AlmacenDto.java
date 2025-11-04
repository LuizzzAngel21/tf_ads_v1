package com.farmaceutica.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.farmaceutica.model.Almacen}
 */
@Value
public class AlmacenDto implements Serializable {
    Integer id;
    @NotNull
    @Size(max = 150)
    String nombreAlmacen;
    String ubicacion;
    @Size(max = 50)
    String tipoAlmacen;
    Integer capacidad;
    Boolean estado;
}


