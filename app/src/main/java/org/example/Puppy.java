package org.example;

public class Puppy implements Cutie {

    private String description;
    private int rating;

    public Puppy() {}

    public Puppy(int rating) {this.rating = rating;}

    public Puppy(String description, int rating) {

        this.description = description;
        this.rating = rating;
    }

    public String description() {

        return description;
    }

    public Integer cutenessRating () {

        return rating;
    }

}

