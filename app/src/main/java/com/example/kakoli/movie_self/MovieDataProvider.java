package com.example.kakoli.movie_self;

/**
 * Created by kakoli on 4/1/17.
 */

public class MovieDataProvider {
    private int movie_poster_resource;
    private String movie_title;
    private String movie_ratings;

    public MovieDataProvider(int movie_poster_resource, String movie_title, String movie_ratings) {
        this.movie_poster_resource = movie_poster_resource;
        this.movie_title = movie_title;
        this.movie_ratings = movie_ratings;
    }

    public int getMovie_poster_resource() {
        return movie_poster_resource;
    }

    public void setMovie_poster_resource(int movie_poster_resource) {
        this.movie_poster_resource = movie_poster_resource;
    }

    public String getMovie_title() {
        return movie_title;
    }

    public void setMovie_title(String movie_title) {
        this.movie_title = movie_title;
    }

    public String getMovie_ratings() {
        return movie_ratings;
    }

    public void setMovie_ratings(String movie_ratings) {
        this.movie_ratings = movie_ratings;
    }
}
