package com.gmail.sneha.projectmoviesstage1.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.gmail.sneha.projectmoviesstage1.BuildConfig;
import com.gmail.sneha.projectmoviesstage1.R;
import com.gmail.sneha.projectmoviesstage1.adapter.MovieAdapter;
import com.gmail.sneha.projectmoviesstage1.data.Movie;
import com.gmail.sneha.projectmoviesstage1.data.MovieResponse;
import com.gmail.sneha.projectmoviesstage1.network.MovieApiService;

import retrofit.Callback;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity implements MovieAdapter.ListItemClickListener{

    private RecyclerView mRecyclerView;
    private MovieAdapter mMovieAdapter;
    private ProgressBar mLoadingIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mLoadingIndicator = (ProgressBar) findViewById(R.id.pb_loading_indicator);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
        mMovieAdapter = new MovieAdapter(this,this);
        mRecyclerView.setAdapter(mMovieAdapter);
        getPopularMovies();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.movies_list_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id){

            case R.id.menu_sort_popularity:
                item.setChecked(true);
                getPopularMovies();
                return true;

            case R.id.menu_sort_rating:
                item.setChecked(true);
                getTopRatedMovies();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void getPopularMovies(){

        mLoadingIndicator.setVisibility(View.VISIBLE);
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("https://api.themoviedb.org/3")
                .setRequestInterceptor(new RequestInterceptor() {
                    @Override
                    public void intercept(RequestFacade request) {
                        request.addEncodedQueryParam("api_key", BuildConfig.THE_MOVIE_DATABASE_API_KEY);
                        request.addEncodedQueryParam("language","en-US");
                        request.addEncodedQueryParam("page","1");
                    }
                })

                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();

        MovieApiService service = restAdapter.create(MovieApiService.class);
        service.getPopularMovies(new Callback<MovieResponse>() {
            @Override
            public void success(MovieResponse movieResponse, Response response) {
                mLoadingIndicator.setVisibility(View.GONE);
                mRecyclerView.scrollToPosition(0);
                mMovieAdapter.setMovieList(movieResponse.getMovies());
            }

            @Override
            public void failure(RetrofitError error) {
                mLoadingIndicator.setVisibility(View.GONE);
                Context context = MainActivity.this;
                String errorText;
                if(error.getResponse()!= null){
                    errorText = error.getResponse().getReason();
                }
                else{
                    errorText = error.getMessage();
                }
                Toast.makeText(context, errorText + getString(R.string.error_internet_connection), Toast.LENGTH_LONG).show();
                error.printStackTrace();
            }
        });
    }

    private void getTopRatedMovies(){
        mLoadingIndicator.setVisibility(View.VISIBLE);
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("https://api.themoviedb.org/3")
                .setRequestInterceptor(new RequestInterceptor() {
                    @Override
                    public void intercept(RequestFacade request) {
                        request.addEncodedQueryParam("api_key", BuildConfig.THE_MOVIE_DATABASE_API_KEY);
                        request.addEncodedQueryParam("language","en-US");
                        request.addEncodedQueryParam("page","1");
                    }
                })

                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();

        MovieApiService service = restAdapter.create(MovieApiService.class);
        service.getTopRatedMovies(new Callback<MovieResponse>() {
            @Override
            public void success(MovieResponse movieResponse, Response response) {
                mLoadingIndicator.setVisibility(View.GONE);
                mRecyclerView.scrollToPosition(0);
                mMovieAdapter.setMovieList(movieResponse.getMovies());
            }

            @Override
            public void failure(RetrofitError error) {
                mLoadingIndicator.setVisibility(View.GONE);
                Context context = MainActivity.this;
                String errorText;
                if(error.getResponse()!= null){
                    errorText = error.getResponse().getReason();
                }
                else{
                    errorText = error.getMessage();
                }
                Toast.makeText(context, errorText + getString(R.string.error_internet_connection), Toast.LENGTH_LONG).show();
                error.printStackTrace();
            }
        });
    }

    @Override
    public void onListItemClick(Movie movieDetail) {
        Intent intent = new Intent(this,MovieDetailActivity.class);
        intent.putExtra(MovieDetailActivity.EXTRA_MOVIE,movieDetail);
        startActivity(intent);
    }
}
