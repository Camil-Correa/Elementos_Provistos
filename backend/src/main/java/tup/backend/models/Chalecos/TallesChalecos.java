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
@Table(name = "talle_chaleco")
public class TallesChalecos {

    @Id
    @Column(name = "talle", length = 4, nullable = false)
    private String talle;

    @OneToMany(mappedBy = "tallesChalecos")
    @JsonBackReference
    private List<ChalecoBal> chalecoBal;

}
