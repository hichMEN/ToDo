package dz.elit.todo.service;

import dz.elit.todo.dao.IUtilisateurDao;
import dz.elit.todo.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by mh.chebihi on 18/10/2016.
 */

public interface IUtilisateurService {

    public Utilisateur chercher(Integer id);
    public List<Utilisateur> chercher(Date date);
    public List<Utilisateur> chercherTous();
    public void creerUtilisateur(Utilisateur u);
    public void supprimerUtilisateur(Utilisateur u);
    public void modifierUtilisateur(Utilisateur u);
}
