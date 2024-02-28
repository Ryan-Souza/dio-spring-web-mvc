package edu.br.globallabs.springwebmvc.rest;

import edu.br.globallabs.springwebmvc.model.Jedi;
import edu.br.globallabs.springwebmvc.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JediResource {

    @Autowired
    private JediRepository jediRepository;

    @GetMapping("/api/jedi")
    public List<Jedi> getAllJedi(){
        return jediRepository.getAllJedi();
    }
}
