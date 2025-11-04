
package com.farmaceutica.controlador;

import com.farmaceutica.model.Rol;
import com.farmaceutica.repository.RolRepository;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RolController {

    private final RolRepository rolRepository;

    public RolController(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    // Endpoint para listar todos los roles
    @GetMapping
    public List<Rol> listarRoles() {
        return rolRepository.findAll();
    }
}
