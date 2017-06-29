package com.gmail.sneha.projectmoviesstage1.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Movie implements Serializable{
    @Expose
    private Boolean adult;
    @SerializedName("backdrop_path")
    @Expose
    private String backdropPath;
    @SerializedName("genre_ids")
    @Expose
    private List<Integer> genreIds = new ArrayList<>();
    @Expose
    private Integer id;
    @SerializedName("original_language")
    @Expose
    private String originalLanguage;
    @SerializedName("original_title")
    @Expose
    private String originalTitle;
    @Expose
    private String overview;
    @SerializedName("release_date")
    @Expose
    private String releaseDate;
    @SerializedName("poster_path")
    @Expose
    private String posterPath;
    @Expose
    private Double popularity;
    @Expose
    private String title;
    @Expose
    private Boolean video;
    @SerializedName("vote_average")
    @Expose
    private Double voteAverage;
    @SerializedName("vote_count")
    @Expose
    private Integer voteCount;

// --Commented out by Inspection START (6/28/2017 2:42 PM):
//    /**
//     *
//     * @return
//     * The adult
//     */
//    public Boolean getAdult() {
//        return adult;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:42 PM)

// --Commented out by Inspection START (6/28/2017 2:42 PM):
//    /**
//     *
//     * @param adult
//     * The adult
//     */
//    public void setAdult(Boolean adult) {
//        this.adult = adult;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:42 PM)

    /**
     *
     * @return
     * The backdropPath
     */
    public String getBackdropPath() {
        return "http://image.tmdb.org/t/p/w500" + backdropPath;
    }

// --Commented out by Inspection START (6/28/2017 2:42 PM):
//    /**
//     *
//     * @param backdropPath
//     * The backdrop_path
//     */
//    public void setBackdropPath(String backdropPath) {
//        this.backdropPath = backdropPath;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:42 PM)

// --Commented out by Inspection START (6/28/2017 2:42 PM):
//    /**
//     *
//     * @return
//     * The genreIds
//     */
//    public List<Integer> getGenreIds() {
//        return genreIds;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:42 PM)

// --Commented out by Inspection START (6/28/2017 2:42 PM):
//    /**
//     *
//     * @param genreIds
//     * The genre_ids
//     */
//    public void setGenreIds(List<Integer> genreIds) {
//        this.genreIds = genreIds;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:42 PM)

// --Commented out by Inspection START (6/28/2017 2:42 PM):
//    /**
//     *
//     * @return
//     * The id
//     */
//    public Integer getId() {
//        return id;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:42 PM)

// --Commented out by Inspection START (6/28/2017 2:42 PM):
//    /**
//     *
//     * @param id
//     * The id
//     */
//    public void setId(Integer id) {
//        this.id = id;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:42 PM)

// --Commented out by Inspection START (6/28/2017 2:42 PM):
//    /**
//     *
//     * @return
//     * The originalLanguage
//     */
//    public String getOriginalLanguage() {
//        return originalLanguage;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:42 PM)

// --Commented out by Inspection START (6/28/2017 2:42 PM):
//    /**
//     *
//     * @param originalLanguage
//     * The original_language
//     */
//    public void setOriginalLanguage(String originalLanguage) {
//        this.originalLanguage = originalLanguage;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:42 PM)

// --Commented out by Inspection START (6/28/2017 2:42 PM):
//    /**
//     *
//     * @return
//     * The originalTitle
//     */
//    public String getOriginalTitle() {
//        return originalTitle;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:42 PM)

// --Commented out by Inspection START (6/28/2017 2:42 PM):
//    /**
//     *
//     * @param originalTitle
//     * The original_title
//     */
//    public void setOriginalTitle(String originalTitle) {
//        this.originalTitle = originalTitle;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:42 PM)

    /**
     *
     * @return
     * The overview
     */
    public String getOverview() {
        return overview;
    }

// --Commented out by Inspection START (6/28/2017 2:42 PM):
//    /**
//     *
//     * @param overview
//     * The overview
//     */
//    public void setOverview(String overview) {
//        this.overview = overview;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:42 PM)

    /**
     *
     * @return
     * The releaseDate
     */
    public String getReleaseDate() {
        return releaseDate;
    }

// --Commented out by Inspection START (6/28/2017 2:42 PM):
//    /**
//     *
//     * @param releaseDate
//     * The release_date
//     */
//    public void setReleaseDate(String releaseDate) {
//        this.releaseDate = releaseDate;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:42 PM)

    /**
     *
     * @return
     * The posterPath
     */
    public String getPosterPath() {
        return "http://image.tmdb.org/t/p/w500" + posterPath;
    }

// --Commented out by Inspection START (6/28/2017 2:42 PM):
//    /**
//     *
//     * @param posterPath
//     * The poster_path
//     */
//    public void setPosterPath(String posterPath) {
//        this.posterPath = posterPath;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:42 PM)

// --Commented out by Inspection START (6/28/2017 2:42 PM):
//    /**
//     *
//     * @return
//     * The popularity
//     */
//    public Double getPopularity() {
//        return popularity;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:42 PM)

// --Commented out by Inspection START (6/28/2017 2:43 PM):
//    /**
//     *
//     * @param popularity
//     * The popularity
//     */
//    public void setPopularity(Double popularity) {
//        this.popularity = popularity;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:43 PM)

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

// --Commented out by Inspection START (6/28/2017 2:43 PM):
//    /**
//     *
//     * @param title
//     * The title
//     */
//    public void setTitle(String title) {
//        this.title = title;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:43 PM)

// --Commented out by Inspection START (6/28/2017 2:43 PM):
//    /**
//     *
//     * @return
//     * The video
//     */
//    public Boolean getVideo() {
//        return video;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:43 PM)

// --Commented out by Inspection START (6/28/2017 2:43 PM):
//    /**
//     *
//     * @param video
//     * The video
//     */
//    public void setVideo(Boolean video) {
//        this.video = video;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:43 PM)

    /**
     *
     * @return
     * The voteAverage
     */
    public Double getVoteAverage() {
        return voteAverage;
    }

// --Commented out by Inspection START (6/28/2017 2:43 PM):
//    /**
//     *
//     * @param voteAverage
//     * The vote_average
//     */
//    public void setVoteAverage(Double voteAverage) {
//        this.voteAverage = voteAverage;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:43 PM)

// --Commented out by Inspection START (6/28/2017 2:43 PM):
//    /**
//     *
//     * @return
//     * The voteCount
//     */
//    public Integer getVoteCount() {
//        return voteCount;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:43 PM)

// --Commented out by Inspection START (6/28/2017 2:43 PM):
//    /**
//     *
//     * @param voteCount
//     * The vote_count
//     */
//    public void setVoteCount(Integer voteCount) {
//        this.voteCount = voteCount;
//    }
// --Commented out by Inspection STOP (6/28/2017 2:43 PM)
}
