package com.doiliomatsinhe.tourguide.model;

import java.io.Serializable;

public class Content implements Serializable {
    private String name;
    private String address;
    private String hours;
    private int cover;
    private String website;
    private String description;
    private String telephone;

    public Content(String name, String address, String hours, int cover, String description) {
        this.name = name;
        this.address = address;
        this.hours = hours;
        this.cover = cover;
        this.description = description;
    }

    public Content(String name, String address, String hours, int cover, String website, String description,String telephone) {
        this.name = name;
        this.address = address;
        this.hours = hours;
        this.cover = cover;
        this.website = website;
        this.description = description;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
