package com.gmail.sneha.projectmoviesstage1.network;

import com.gmail.sneha.projectmoviesstage1.data.MovieResponse;

import retrofit.Callback;
import retrofit.http.GET;

public interface MovieApiService {

    @GET("/movie/popular")
    void getPopularMovies(Callback<MovieResponse> cb);

    @GET("/movie/top_rated")
    void getTopRatedMovies(Callback<MovieResponse> cb);
}
