package tup.backend.models.Empleados;
import lombok.Data;

@Data
public class DatosEmpleado {
    private Integer nI;
    private String nombres;
    private String apellidos;
    private Long dni;
    private String jerarquia;
    private String situacion;
}
