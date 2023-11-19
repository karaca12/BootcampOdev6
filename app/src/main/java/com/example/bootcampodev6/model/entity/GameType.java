package com.example.bootcampodev6.model.entity;

import java.io.Serializable;

public class GameType implements Serializable {
    private int id;
    private String name;
    private String image;
    private String color;

    public GameType(int id, String name, String image, String color) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.color = color;
    }

    public GameType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
