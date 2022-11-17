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
@Table(name = "marcas_armas")
public class MarcasArmas {
    
    @Id
    @Column(name = "marca", length = 30, nullable = false)
    private String marca;

    @OneToMany(mappedBy = "marcasarmas")
    @JsonBackReference
    private List<Armas> armas;
}
