package tup.backend.models.Armas;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;

import javax.persistence.Column;

import lombok.Data;


@Data
@Entity
@Table(name = "tipo_armas")
public class TipoArmas {

    @Id
    @Column(name = "tipo", length = 30, nullable = false)
    private String tipo;

    @OneToMany(mappedBy = "tipoarmas")
    @JsonBackReference
    private List<Armas> armas;

}
