package com.example.historique_cnx;

import com.example.historique_cnx.entities.HistoriqueConnexion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/historiqueCnx")
public class HistoriqueController {

    private final HistoriqueRepository historiqueRepository;

    public HistoriqueController(HistoriqueRepository historiqueRepository) {
        this.historiqueRepository = historiqueRepository;
    }

    @GetMapping("/get/{username}")
    public ResponseEntity<List<HistoriqueConnexion>> getHistoriqueByUsername(@PathVariable("username") String username){
        List<HistoriqueConnexion> historique =  this.historiqueRepository.getHistoriqueByUsername(username);
        return new ResponseEntity<>(historique , HttpStatus.OK);
    }
}
