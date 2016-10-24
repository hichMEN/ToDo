package dz.elit.todo.dao;

import dz.elit.todo.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mh.chebihi on 20/10/2016.
 */
@Repository
public interface IToDoDao extends JpaRepository<ToDo,Integer> {
}
