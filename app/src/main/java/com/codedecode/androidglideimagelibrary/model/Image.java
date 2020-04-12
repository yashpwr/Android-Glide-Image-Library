package com.codedecode.androidglideimagelibrary.model;

import java.io.Serializable;

public class Image implements Serializable{
    private String name;
    private String img;
    private String timestamp;

    public Image() {
    }

    public Image(String name, String img, String timestamp) {
        this.name = name;
        this.img = img;
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIMG() {
        return img;
    }

    public void setIMG(String img) {
        this.img = img;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
