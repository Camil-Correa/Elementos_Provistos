package tup.backend.models.Empleados;

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
@Table(name = "grado")
public class Grado {

    @Id
    @Column(name = "jerarquia", length = 30, nullable = false)
    private String jerarquia;

    @OneToMany(mappedBy = "grado")
    @JsonBackReference
    private List<Empleados> empleados;

    public String getJergrad() {
        return this.jerarquia;
    }

    public void setJergrad(String jerarquia) {
        this.jerarquia = jerarquia;
    }

}