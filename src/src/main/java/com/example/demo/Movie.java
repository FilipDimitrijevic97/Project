package com.example.demo;
import java.util.List;

/**
 * This class should contain the properties that define a movie or book, such as title, author, 
 * release date, etc. It may also contain getters and setters for these properties, 
 * as well as any other methods that are specific to a movie or book.
 * 
 */

 public class Movie {
    private String title;
    private String director;
    private int releaseYear;
    private List<String> actors;
    
    public Movie(String title, String director, int releaseYear, List<String> actors) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.actors = actors;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDirector() {
        return director;
    }
    
    public void setDirector(String director) {
        this.director = director;
    }
    
    public int getReleaseYear() {
        return releaseYear;
    }
    
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    
    public List<String> getActors() {
        return actors;
    }
    
    public void setActors(List<String> actors) {
        this.actors = actors;
    }
}

