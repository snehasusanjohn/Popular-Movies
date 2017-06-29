package com.gmail.sneha.projectmoviesstage1.data;

import com.gmail.sneha.projectmoviesstage1.data.Movie;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class MovieResponse {
    // --Commented out by Inspection (6/28/2017 2:43 PM):private Integer page;
    // --Commented out by Inspection (6/28/2017 2:43 PM):private Integer totalPages;
    // --Commented out by Inspection (6/28/2017 2:43 PM):private Integer totalResults;
    // --Commented out by Inspection (6/28/2017 2:43 PM):private Map<String, Object> additionalProperties = new HashMap<>();

    @SerializedName("results")
    private List<Movie> movies = new ArrayList<>();

// --Commented out by Inspection START (6/28/2017 2:36 PM):
//    /**
//     * @return The page
//     */
//    public Integer getPage() {
//        return page;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:36 PM)

// --Commented out by Inspection START (6/28/2017 2:36 PM):
//    /**
//     * @param page The page
//     */
//    public void setPage(Integer page) {
//        this.page = page;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:36 PM)

    /**
     * @return The movies
     */
    public List<Movie> getMovies() {
        return movies;
    }

// --Commented out by Inspection START (6/28/2017 2:36 PM):
//    /**
//     * @param movies The movies
//     */
//    public void setMovies(List<Movie> movies) {
//        this.movies = movies;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:36 PM)

// --Commented out by Inspection START (6/28/2017 2:36 PM):
//    /**
//     * @return The totalPages
//     */
//    public Integer getTotalPages() {
//        return totalPages;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:36 PM)

// --Commented out by Inspection START (6/28/2017 2:36 PM):
//    /**
//     * @param totalPages The total_pages
//     */
//    public void setTotalPages(Integer totalPages) {
//        this.totalPages = totalPages;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:36 PM)

// --Commented out by Inspection START (6/28/2017 2:36 PM):
//    /**
//     * @return The totalResults
//     */
//    public Integer getTotalResults() {
//        return totalResults;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:36 PM)

// --Commented out by Inspection START (6/28/2017 2:36 PM):
//    /**
//     * @param totalResults The total_results
//     */
//    public void setTotalResults(Integer totalResults) {
//        this.totalResults = totalResults;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:36 PM)

// --Commented out by Inspection START (6/28/2017 2:36 PM):
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:36 PM)

// --Commented out by Inspection START (6/28/2017 2:36 PM):
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }
// --Commented out by Inspection STOP (6/28/2017 2:36 PM)
}
