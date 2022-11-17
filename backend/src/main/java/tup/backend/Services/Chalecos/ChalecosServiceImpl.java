package tup.backend.Services.Chalecos;

import tup.backend.models.Chalecos.ChalecoBal;
import tup.backend.repositories.ChalecoRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChalecosServiceImpl implements ChalecosService {
    
    @Autowired
    private ChalecoRepository chalecoRepository;

    public List<ChalecoBal> all() {
        return chalecoRepository.findAll();
    }

}
