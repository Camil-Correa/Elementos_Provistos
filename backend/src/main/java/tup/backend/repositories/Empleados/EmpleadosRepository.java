package tup.backend.repositories.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tup.backend.models.Empleados.Empleados;

@Repository
public interface EmpleadosRepository extends JpaRepository<Empleados, Integer> {

}