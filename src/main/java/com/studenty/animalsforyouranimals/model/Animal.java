package com.studenty.animalsforyouranimals.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Indexed;

import javax.persistence.*;

/**
 * Created by Sławomir Wójcik on 2018-05-20.
 */
@Indexed
@Entity
public class Animal {
    @Id
    @GeneratedValue
    @Column(name = "animal_id")
    private int idAnimal;

    @NotEmpty(message = "*Wprowadź nazwe zwięrzecia")
    @Column(name = "animal_name")
    private String name;

    @NotEmpty(message = "*Wprowadź opis")
    @Column(name = "animal_descripction")
    private String descripction;

    @Column(name = "url_image")
    private String pathImage;

    public Animal(){}

    public Animal(String name, String descripction) {
        this.name = name;
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

    public String getDescripction() {
        return descripction;
    }

    public void setDescripction(String descripction) {
        this.descripction = descripction;
    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }
}
