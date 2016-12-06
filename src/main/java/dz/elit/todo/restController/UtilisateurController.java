package dz.elit.todo.restController;


import dz.elit.todo.model.Utilisateur;
import dz.elit.todo.service.IUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by mh.chebihi on 18/10/2016.
 */
@CrossOrigin
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

    @PostMapping(value = "/add", headers="Accept=application/json")
    @ResponseBody
    private ResponseEntity ajouterUtilisateur(@RequestBody Utilisateur utilisateur){
        System.out.println("call REST put ajouterUtilisateur "+ utilisateur.toString());
        utilisateur.setDateCreation(new Date());
            utilisateurService.creerUtilisateur(utilisateur);
        return  new ResponseEntity(utilisateur, HttpStatus.OK);
    }

    @PutMapping(value = "/update", headers ="Accept=application/json")
    @ResponseBody
    private ResponseEntity modifierUtilisateur(@RequestBody Utilisateur utilisateur){
        System.out.println("call REST put modifierUtilisateur "+ utilisateur.toString());
        utilisateurService.modifierUtilisateur(utilisateur);
        return new ResponseEntity(utilisateur, HttpStatus.OK);
    }

    @DeleteMapping( "/delete/{id}")
//    @ResponseBody
    private void supprimerUtilisateur(@PathVariable(value = "id") int id){

        utilisateurService.supprimerUtilisateur(id);
//        return new ResponseEntity(utilisateur, HttpStatus.OK);
    }

    @GetMapping(value="/testData/{dateCreation}", headers="Accept=application/json", produces = "application/json")
    private List<Utilisateur> chercherListUserAvantDate(@PathVariable(value = "dateCreation") @DateTimeFormat(pattern="dd-MM-yyyy") Date dateCreation){
        return utilisateurService.chercher(dateCreation);
    }
}
