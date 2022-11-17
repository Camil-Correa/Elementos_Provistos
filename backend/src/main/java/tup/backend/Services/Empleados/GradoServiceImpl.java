package tup.backend.Services.Empleados;

import tup.backend.models.Empleados.Grado;
import tup.backend.repositories.Empleados.GradoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GradoServiceImpl implements GradoService{

    @Autowired
    private GradoRepository gradoRepository;

    @Override
    public Grado onegrad(String jerarquia) {
        return gradoRepository.findById(jerarquia).orElseThrow();
    }
    
}
