package com.studenty.animalsforyouranimals.model;

import javax.persistence.*;

/**
 * Created by Sławomir Wójcik on 2018-05-20.
 */
@Entity
public class Animal {
    @Id
    @GeneratedValue
    @Column(name = "animal_id")
    private int idAnimal;

    @Column(name = "animal_name")
    private String name;

    @Column(name = "animal_cost")
    private int costAnimal;

    @Column(name = "animal_descripction")
    private int descripction;

    @Column(name = "url_image")
    private String pathImage;

    public Animal(){}

    public Animal(String name, int costAnimal, int descripction) {
        this.name = name;
        this.costAnimal = costAnimal;
        this.descripction = descripction;
        this.pathImage = null;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCostAnimal() {
        return costAnimal;
    }

    public void setCostAnimal(int costAnimal) {
        this.costAnimal = costAnimal;
    }

    public int getDescripction() {
        return descripction;
    }

    public void setDescripction(int descripction) {
        this.descripction = descripction;
    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }
}
