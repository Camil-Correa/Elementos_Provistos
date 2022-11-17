package tup.backend.repositories.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tup.backend.models.Empleados.Grado;

@Repository
public interface GradoRepository extends JpaRepository<Grado, String> {

}