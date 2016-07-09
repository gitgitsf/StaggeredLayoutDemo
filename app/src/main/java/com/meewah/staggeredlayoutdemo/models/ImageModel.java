package com.meewah.staggeredlayoutdemo.models;


public class ImageModel {

    int imageDrawerId;
    String name;

    public ImageModel(int imageDrawerId, String name) {
        this.imageDrawerId = imageDrawerId;
        this.name = name;
    }

    public void setImageDrawerId(int imageDrawerId) {
        this.imageDrawerId = imageDrawerId;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getImageDrawerId() {
        return imageDrawerId;
    }

    public String getName() {
        return name;
    }



}
