package dz.elit.todo.serviceImp;

import dz.elit.todo.dao.IUtilisateurDao;
import dz.elit.todo.model.Utilisateur;
import dz.elit.todo.service.IUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by mh.chebihi on 18/10/2016.
 */
@Service
public class UtilisateurServiceImp implements IUtilisateurService {
    @Autowired
    protected IUtilisateurDao utilisateurDao;

    public Utilisateur chercher(Integer id) {
        return utilisateurDao.findOne(id);
    }

    public List<Utilisateur> chercher(Date date){ return utilisateurDao.findByDateCreation(date);}

    public List<Utilisateur> chercherTous() {
        return utilisateurDao.findAll();
    }

    public void creerUtilisateur(Utilisateur u) {
        if(utilisateurDao.findByCode(u.getCode()) != null ){
            System.out.println("user existe");
        }
        else {

            utilisateurDao.saveAndFlush(u);
        }
    }

    public void supprimerUtilisateur(Utilisateur u) {
        if(!utilisateurDao.exists(u.getId())){
            System.out.println("user n'existe existe pas");
        }
        else {
            utilisateurDao.delete(u);
        }
    }

    public void supprimerUtilisateur(int id) {

            utilisateurDao.delete(id);

    }
    public void modifierUtilisateur(Utilisateur u) {
        System.out.println("modifierUtilisateur "+u);

        utilisateurDao.save(u);
//        if(utilisateurDao.exists(u.getId())){
//            System.out.println("user existe");
//        }
//        else {
//
//        }
    }


}
