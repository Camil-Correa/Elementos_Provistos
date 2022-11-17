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
@Table(name = "estfun_armas")
public class EstFunArmas {
 
    @Id
    @Column(name = "est_func", length = 15, nullable = false)
    private String est_func;

    @OneToMany(mappedBy = "estfunarmas")
    @JsonBackReference
    private List<Armas> armas;

}
