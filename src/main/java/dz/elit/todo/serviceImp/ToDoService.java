package dz.elit.todo.serviceImp;

import dz.elit.todo.dao.IToDoDao;
import dz.elit.todo.model.ToDo;
import dz.elit.todo.model.Utilisateur;
import dz.elit.todo.service.IToDoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by mh.chebihi on 20/10/2016.
 */
public class ToDoService implements IToDoService {
    @Autowired
    private IToDoDao toDoDao;

    public ToDo chercher(Integer id) {
        return toDoDao.findOne(id);
    }

    public List<ToDo> chercherTous() {
        return null;
    }

    public List<ToDo> chercherParUtilisateur(Utilisateur utilisateur) {
        return null;
    }

    public void creerUtilisateur(ToDo u) {

    }

    public void supprimerUtilisateur(ToDo u) {

    }

    public void modifierUtilisateur(ToDo u) {

    }
}
