package com.example.viewmodel.modal;

import java.util.List;

public class Movie {
    String movieName;
    int rating ;
    String imgUrl;

    public Movie(String movieName, int rating, String imgUrl) {
        this.movieName = movieName;
        this.rating = rating;
        this.imgUrl = imgUrl;
    }


    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }


}
