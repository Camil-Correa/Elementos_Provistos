package tup.backend.Services.Empleados;

import java.util.List;
import tup.backend.models.Empleados.Empleados;


public interface EmpleadosService {
    
    public List<Empleados> all();
    
    public Empleados oneemp(int nI);

}
