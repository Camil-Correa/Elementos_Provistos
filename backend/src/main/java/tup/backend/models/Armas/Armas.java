package tup.backend.models.Armas;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tup.backend.models.Empleados.Empleados;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "armas")
public class Armas {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="tipo")
    private TipoArmas tipoarmas;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="marca")
    private MarcasArmas marcasarmas;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="modelo")
    private ModelosArmas modeloarmas;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="calibre")
    private CalibreArmas calibrearmas;

    @Id
    @Column(name = "numeracion", length = 15, nullable = false)
    private String numeracion;
    
    @OneToOne(mappedBy = "armas")
    @JsonBackReference
    private Empleados empleados;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="est_func")
    private EstFunArmas estfunarmas;

    @Column(name = "remarque", length = 30, nullable = false)
    private String remarque;

}
