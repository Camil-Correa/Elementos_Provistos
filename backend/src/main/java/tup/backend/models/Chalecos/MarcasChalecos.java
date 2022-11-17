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
@Table(name = "marcas_chaleco")
public class MarcasChalecos {
        
    @Id
    @Column(name = "marca", length = 15, nullable = false)
    private String marca;

    @OneToMany(mappedBy = "marcasChalecos")
    @JsonBackReference
    private List<ChalecoBal> chalecoBal;

}
