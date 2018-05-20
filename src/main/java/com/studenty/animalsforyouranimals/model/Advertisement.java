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

    @Column(name = "ad_title")
    private String title;

    @Column(name = "ad_cost")
    private int cost;

    public Advertisement(String title, int cost) {
        this.title = title;
        this.cost = cost;
    }

    public int getAd_id() {
        return ad_id;
    }

    public void setAd_id(int ad_id) {
        this.ad_id = ad_id;
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
