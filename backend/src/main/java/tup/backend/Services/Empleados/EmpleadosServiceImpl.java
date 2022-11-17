package tup.backend.Services.Empleados;

import tup.backend.models.Empleados.Empleados;
import tup.backend.repositories.Empleados.EmpleadosRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadosServiceImpl implements EmpleadosService {

    @Autowired
    private EmpleadosRepository empleadosRepository;

    public List<Empleados> all() {
        return empleadosRepository.findAll();
    }

    @Override
    public Empleados oneemp(int nI) {
        return empleadosRepository.findById(nI).orElseThrow();
    }
}
