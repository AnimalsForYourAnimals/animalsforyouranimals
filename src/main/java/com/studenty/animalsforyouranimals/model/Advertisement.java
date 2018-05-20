package com.studenty.animalsforyouranimals.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Sławomir Wójcik on 2018-05-20.
 */
@Entity
public class Advertisement {
    @Id
    @GeneratedValue
    private int ad_id;

    @Column(name = "animal")
    private Animal animal;

    @Column(name = "ad_title")
    private String title;

    @Column(name = "ad_cost")
    private int cost;

    public Advertisement(Animal animal, String title, int cost) {
        this.animal = animal;
        this.title = title;
        this.cost = cost;
    }

    public int getAd_id() {
        return ad_id;
    }

    public void setAd_id(int ad_id) {
        this.ad_id = ad_id;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
