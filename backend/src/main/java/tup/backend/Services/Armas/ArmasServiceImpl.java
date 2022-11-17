package tup.backend.Services.Armas;

import tup.backend.models.Armas.Armas;
import tup.backend.repositories.ArmasRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ArmasServiceImpl implements ArmasService {
    
        
    @Autowired
    private ArmasRepository armasRepository;

    public List<Armas> all() {
        return armasRepository.findAll();
    }

}
