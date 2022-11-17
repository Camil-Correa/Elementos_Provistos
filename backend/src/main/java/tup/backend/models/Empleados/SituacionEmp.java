package tup.backend.models.Empleados;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "situacion_empleado")
public class SituacionEmp {
    
    @Id
    @Column(name = "situacion", length = 20, nullable = false)
    private String situacion;

    @OneToMany(mappedBy = "situacionEmp")
    @JsonBackReference
    private List<Empleados> empleados;
    
}
