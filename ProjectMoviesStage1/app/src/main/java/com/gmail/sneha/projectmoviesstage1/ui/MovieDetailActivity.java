package com.gmail.sneha.projectmoviesstage1.ui;

import android.databinding.DataBindingUtil;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import com.gmail.sneha.projectmoviesstage1.R;
import com.gmail.sneha.projectmoviesstage1.data.Movie;
import com.gmail.sneha.projectmoviesstage1.databinding.ActivityMovieDetailBinding;
import com.gmail.sneha.projectmoviesstage1.databinding.MovieDetailsContentBinding;
import com.squareup.picasso.Picasso;

public class MovieDetailActivity extends AppCompatActivity {

    public static final String EXTRA_MOVIE = "movie";
    ActivityMovieDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_movie_detail);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_movie_detail);
        Movie mMovie;
        if(getIntent().hasExtra(EXTRA_MOVIE)){
            mMovie = (Movie) getIntent().getSerializableExtra(EXTRA_MOVIE);
        }
        else{
            String exception = getString(R.string.movie_detail_activity_exception);
            throw new IllegalArgumentException(exception);
        }


        //CollapsingToolbarLayout toolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        //toolbarLayout.setTitle(mMovie.getTitle());
        binding.toolbarLayout.setTitle(mMovie.getTitle());
        //ImageView backdrop = (ImageView) findViewById(R.id.backdrop);

/*        ImageView backdrop = (ImageView) findViewById(R.id.backdrop);
        TextView title = (TextView) findViewById(R.id.movie_title);
        TextView releaseDate = (TextView) findViewById(R.id.movie_releasedate);
        TextView rating = (TextView) findViewById(R.id.movie_rating);
        TextView description = (TextView) findViewById(R.id.movie_description);
        ImageView poster = (ImageView) findViewById(R.id.movie_poster);*/

        //title.setText(mMovie.getTitle());
        binding.included.movieTitle.setText(mMovie.getTitle());
       // releaseDate.setText(mMovie.getReleaseDate());
        binding.included.movieReleasedate.setText(mMovie.getReleaseDate());
        String ratingText = getString(R.string.average_rating) + " " +mMovie.getVoteAverage().toString();
        //rating.setText(ratingText);
        binding.included.movieRating.setText(ratingText);
      //  description.setText(mMovie.getOverview());
        binding.included.movieDescription.setText(mMovie.getOverview());
        Picasso.with(this)
                .load(mMovie.getPosterPath())
                .into(binding.included.moviePoster);
        Picasso.with(this)
                .load(mMovie.getBackdropPath())
                .into(binding.backdrop);
/*        Picasso.with(this)
                .load(mMovie.getPosterPath())
                .into(poster);
        Picasso.with(this)
                .load(mMovie.getBackdropPath())
                .into(backdrop);*/

    }
}
