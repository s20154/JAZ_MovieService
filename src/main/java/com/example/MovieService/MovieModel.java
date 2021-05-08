package com.example.MovieService;


public class MovieModel {
    private Long id;
    private String name;
    private String category;
    private String relaseDate;
    private int starRating;

    public MovieModel(Long id, String name, String category, String relaseDate, int starRating) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.relaseDate = relaseDate;
        this.starRating = starRating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRelaseDate() {
        return relaseDate;
    }

    public void setRelaseDate(String relaseDate) {
        this.relaseDate = relaseDate;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }
}
