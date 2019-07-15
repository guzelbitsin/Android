package com.example.myapplication;

public class Recipe {
    String name;
    String description;
    String tag;
    String image;
    long id;

    public Recipe(long id, String tarifAdi, String tarifIcerik, String tarifEtiket, String image) {
        this.id = id;
        this.image = image;
        this.name = tarifAdi;
        this.description = tarifIcerik;
        this.tag = tarifEtiket;
    }

    public String getName() {
        return name;
    }

    public void setName(String tarifAdi) {
        this.name = tarifAdi;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String tarifIcerik) {
        this.description = tarifIcerik;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tarifEtiket) {
        this.tag = tarifEtiket;
    }

    public void setId(long id){
        this.id = id;
    }

    public long getId(){
        return id;
    }

    public void setImage(String image){
        this.image = image;
    }

    public String getImage(){
        return image;
    }

}

