package tup.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tup.backend.models.Armas.Armas;

@Repository
public interface ArmasRepository extends JpaRepository<Armas, String> {
    
}
