package org.launchcode.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by J on 4/10/2017.
 */
@Entity
public class Menu {

    @NotNull
    @Size(min=3, max=30)
    private String name;

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToMany
    private List<Cheese> cheeses;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Cheese> getCheeses() {
        return cheeses;
    }

    public void addItem(Cheese item){
        cheeses.add(item);
    }

    public Menu() {
    }

    public Menu(String name) {
        this.name = name;
    }
}
