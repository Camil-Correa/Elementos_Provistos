package tup.backend.Services.Empleados;

import org.springframework.stereotype.Service;
import tup.backend.models.Empleados.Grado;

@Service
public interface GradoService {

    public Grado onegrad(String jerarquia);

}
