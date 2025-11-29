package org.example;

public class Kitty implements Cutie{

    private int rating;
    private String description;

    Kitty(int rating) {this.rating = rating;}

    Kitty(String description, int rating) {

        this.rating = rating;
        this.description = description;
    }

    public Integer cutenessRating() {return rating;}

    public String description() {return description;}
}