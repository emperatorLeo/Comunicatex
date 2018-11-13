package com.independenciatecnologica.chat_practica.model;

import android.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;

public class Message {

    private String name;
    private String message;
    private String time;
   // private String urlImage;
    private int urlImage;

    public Message(String name, String message, String time, int urlImage) {
        this.name = name;
        this.message = message;
        this.time = time;
        this.urlImage = urlImage;
    }
    /*
    public Message(String name, String message, String time, String urlImage) {
        this.name = name;
        this.message = message;
        this.time = time;
        this.urlImage = urlImage;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }*/

    public int getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(int urlImage) {
        this.urlImage = urlImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

   /* @BindingAdapter({"urlImage"})
    public static void loadImgae(CircleImageView view , String url){
        Glide.with(view.getContext())
                .load(url)
                .into(view);
    }*/

    @BindingAdapter({"urlImage"})
    public static void loadImgae(CircleImageView view , int url){
        Glide.with(view.getContext())
                .load(url)
                .into(view);
    }
}
