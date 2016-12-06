package dz.elit.todo.dao;

import dz.elit.todo.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by mh.chebihi on 09/10/2016.
 */

@Repository
public interface IUtilisateurDao extends JpaRepository<Utilisateur ,Integer> {
    public List<Utilisateur> findByDateCreation(Date dateCreation);
    public Utilisateur findByCode(String code);
}
