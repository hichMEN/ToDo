package dz.elit.todo.restController;


import dz.elit.todo.model.Utilisateur;
import dz.elit.todo.service.IUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mh.chebihi on 18/10/2016.
 */
@RestController
@RequestMapping("/user")
public class UtilisateurController {

    @Autowired
    private IUtilisateurService utilisateurService;

    @GetMapping(value = "/list", headers="Accept=application/json", produces = "application/json")
    @ResponseBody
    private List<Utilisateur> chercherTous(){
        return utilisateurService.chercherTous();
    }

    @GetMapping(value = "/{id}", headers="Accept=application/json", produces = "application/json")
    private Utilisateur chercher(@PathVariable(value = "id") int id){
        return utilisateurService.chercher(id);
    }
    @PostMapping("/add")
    private ResponseEntity ajouterUtilisateur(@RequestBody Utilisateur utilisateur){
            utilisateurService.creerUtilisateur(utilisateur);
        return  new ResponseEntity(utilisateur, HttpStatus.OK);
    }
}
