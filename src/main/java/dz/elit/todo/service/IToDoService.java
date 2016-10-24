package dz.elit.todo.service;

import dz.elit.todo.model.ToDo;
import dz.elit.todo.model.Utilisateur;

import java.util.List;

/**
 * Created by mh.chebihi on 20/10/2016.
 */
public interface IToDoService {
    public ToDo chercher(Integer id);
    public List<ToDo> chercherTous();
    public List<ToDo> chercherParUtilisateur(Utilisateur utilisateur);
    public void creerUtilisateur(ToDo u);
    public void supprimerUtilisateur(ToDo u);
    public void modifierUtilisateur(ToDo u);
}
