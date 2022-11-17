package tup.backend.models.Chalecos;

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
@Table(name = "modelo_chaleco")
public class ModelosChalecos {

    @Id
    @Column(name = "modelo", length = 30, nullable = false)
    private String modelo;

    @OneToMany(mappedBy = "modelosChalecos")
    @JsonBackReference
    private List<ChalecoBal> chalecoBal;

}
