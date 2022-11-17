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
@Table(name = "modelo_armas")
public class ModelosArmas {

    @Id
    @Column(name = "modelo", length = 30, nullable = false)
    private String modelo;

    @OneToMany(mappedBy = "modeloarmas")
    @JsonBackReference
    private List<Armas> armas;

}
