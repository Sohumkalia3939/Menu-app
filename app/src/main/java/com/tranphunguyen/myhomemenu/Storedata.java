package com.tranphunguyen.myhomemenu;

public class Storedata {
    String image,text;

    public Storedata() {
    }

    public Storedata(String image, String text) {
        this.image = image;
        this.text = text;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
