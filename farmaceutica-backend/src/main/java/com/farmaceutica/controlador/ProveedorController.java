

package com.farmaceutica.controlador;

import com.farmaceutica.dto.ProveedorDto;
import com.farmaceutica.service.ProveedorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/proveedores")
public class ProveedorController {

    private final ProveedorService service;

    public ProveedorController(ProveedorService service) {
        this.service = service;
    }

    @PostMapping
    public ProveedorDto crearProveedor(@RequestBody ProveedorDto dto) {
        return service.crearProveedor(dto);
    }

    @GetMapping
    public List<ProveedorDto> listarProveedores() {
        return service.listarProveedores();
    }
}
