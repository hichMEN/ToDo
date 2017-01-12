package dz.elit.todo.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;


/**
 * Created by mh.chebihi on 28/09/2016.
 */

@Entity
@JsonRootName(value = "utilisateur")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Table(name = "utilisateur")
public class Utilisateur  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private int id;

    @Column(unique = true)
    @NotNull
    @JsonProperty("code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String code;
    @Column
    @JsonProperty("nom")
    private String nom;
    @Column
    @JsonProperty("prenom")
    private String prenom;
    @Column
    @JsonProperty("login")
    private String login;
    @Column
//    @JsonFormat(
//            shape = JsonFormat.Shape.STRING,
//            pattern = "dd-MM-yyyy")
//    @JsonProperty("dateCreation")
//    @JsonSerialize(using = DateSerialized.class)
//    @JsonDeserialize(using = DateDessirealized.class)
    private Date dateCreation;

    @JsonIgnore
    @Nullable
   @OneToMany( mappedBy = "user", fetch =  FetchType.EAGER)
    @Cascade({CascadeType.ALL})
    private List<ToDoList> toDoLists;

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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public List<ToDoList> getToDoLists() {
        return toDoLists;
    }

    public void setToDoLists(List<ToDoList> toDoLists) {
        this.toDoLists = toDoLists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Utilisateur that = (Utilisateur) o;

        if (id != that.id) return false;
        return code.equals(that.code);

    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "utilisateur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", login='" + login + '\'' +
                ", dateCreation=" + dateCreation +
                '}';
    }
}
