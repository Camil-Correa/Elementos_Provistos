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
@Table(name = "calibre_armas")
public class CalibreArmas {

    @Id
    @Column(name = "calibre", length = 10, nullable = false)
    private String calibre;

    @OneToMany(mappedBy = "calibrearmas")
    @JsonBackReference
    private List<Armas> armas;

}
