package com.gmail.sneha.projectmoviesstage1.data;

import com.gmail.sneha.projectmoviesstage1.data.Movie;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MovieResponse {
    private Integer page;
    private Integer totalPages;
    private Integer totalResults;
    private Map<String, Object> additionalProperties = new HashMap<>();

    @SerializedName("results")
    private List<Movie> movies = new ArrayList<>();


    /**
     * @return The page
     */
   public Integer getPage() {
        return page;
    }



    /**
     * @param page The page
     */
    public void setPage(Integer page) {
        this.page = page;
    }


    /**
     * @return The movies
     */
    public List<Movie> getMovies() {
        return movies;
    }


}
