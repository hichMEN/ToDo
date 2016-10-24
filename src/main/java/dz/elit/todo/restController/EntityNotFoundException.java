package dz.elit.todo.restController;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by mh.chebihi on 18/10/2016.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(Integer id){
        super("could not find entity '" + id + "'.");
    }
}
