package tup.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tup.backend.models.Chalecos.ChalecoBal;

@Repository
public interface ChalecoRepository extends JpaRepository<ChalecoBal, String>{
    
}
