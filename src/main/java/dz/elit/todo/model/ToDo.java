package dz.elit.todo.model;

import javax.persistence.*;

/**
 * Created by mh.chebihi on 30/09/2016.
 */

@Entity
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String code;

    @Column
    private String description;

    @Column
    private int priorite;

    @Column
    private boolean termine;

    @ManyToOne
    @JoinColumn(name="doListId",nullable=false,insertable=false, updatable = false)
    private ToDoList doList;

    public ToDo() {
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ToDo toDo = (ToDo) o;

        return code.equals(toDo.code);

    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", priorite=" + priorite +
                ", termine=" + termine +
                ", doList=" + doList +
                '}';
    }
}
