package dz.elit.todo.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by mh.chebihi on 28/09/2016.
 */
@Entity
public class ToDoList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String code;

    @Column
    private String description;

    @Column
    private String objectif;

    @Column
    @JsonSerialize(using = DateSerialized.class)
    private Date dateCreation;

    @ManyToOne
    @JoinColumn(name="userid",nullable=false,insertable=false, updatable = false)
    private Utilisateur user;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "doList")
    private List<ToDo> toDos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getObjectif() {
        return objectif;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }

    public List<ToDo> getToDos() {
        return toDos;
    }

    public void setToDos(List<ToDo> toDos) {
        this.toDos = toDos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ToDoList toDoList = (ToDoList) o;

        return code.equals(toDoList.code);

    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }

    @Override
    public String toString() {
        return "ToDoList{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", objectif='" + objectif + '\'' +
                ", dateCreation=" + dateCreation +
                '}';
    }
}
