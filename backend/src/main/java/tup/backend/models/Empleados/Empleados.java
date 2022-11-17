package tup.backend.models.Empleados;

import tup.backend.models.Armas.Armas;
import tup.backend.models.Chalecos.ChalecoBal;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
@Table(name = "empleados")
public class Empleados {

    @Id
    @Column(name = "nI", length = 6, nullable = false)
    private Integer nI;

    @Column(name = "nombres", length = 50, nullable = false)
    private String nombres;

    @Column(name = "apellidos", length = 50, nullable = false)
    private String apellidos;

    @Column(name = "dni", length = 8, nullable = false)
    private Long dni;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "jerarquia", nullable = true)
    private Grado grado = null;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "situacion", nullable = false)
    private SituacionEmp situacionEmp;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "numeracion", nullable = false, referencedColumnName = "numeracion")
    private Armas armas;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "num_serie", nullable = true, referencedColumnName = "num_serie")
    private ChalecoBal chalecoBal = null;

    // @Column(name = "Jerarquia", length = 30, nullable = true)
    // private Character jerarquia = null;

    // @Column(name = "Situacion", length = 20, nullable = false)
    // private Character situacion;

    // @Column(name = "Numeracion", length = 15, nullable = false)
    // private String numeracion;

    // @Column(name = "num_serie", length = 15, nullable = true)
    // private String numSerie = null;

}
