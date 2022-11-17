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
@Table(name = "nivprot_chaleco")
public class NivelProt {

    @Id
    @Column(name = "niv_prot", length = 4, nullable = false)
    private String niv_prot;

    @OneToMany(mappedBy = "nivelprotList")
    @JsonBackReference
    private List<ChalecoBal> chalecoBal;

}
