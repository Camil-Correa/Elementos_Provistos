package tup.backend.models.Chalecos;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;

import lombok.Data;
import tup.backend.models.Empleados.Empleados;

@Data
@Entity
@Table(name = "chaleco_balistico")
public class ChalecoBal {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "marca", nullable = false)
    private MarcasChalecos marcasChalecos;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "modelo", nullable = false)
    private ModelosChalecos modelosChalecos;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "talle", nullable = false)
    private TallesChalecos tallesChalecos;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "niv_prot", nullable = false)
    private NivelProt nivelprotList;

    @Id
    @Column(name = "num_serie", nullable = false, length = 15)
    private String numSerie;

    @OneToOne(mappedBy = "chalecoBal")
    @JsonBackReference
    private Empleados empleados;

    @Column(name = "fecha_fab", length = 7, nullable = false)
    private String fechaFab;

}
