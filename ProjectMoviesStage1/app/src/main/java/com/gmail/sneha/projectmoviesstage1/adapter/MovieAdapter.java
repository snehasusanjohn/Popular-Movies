package com.gmail.sneha.projectmoviesstage1.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.gmail.sneha.projectmoviesstage1.R;
import com.gmail.sneha.projectmoviesstage1.data.Movie;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    // --Commented out by Inspection (6/28/2017 2:33 PM):private static final String TAG = MovieAdapter.class.getSimpleName();
    private final Context mContext;
    private final List<Movie> mMovieList;
    final private ListItemClickListener mOnClickListener;

    public interface ListItemClickListener {
        void onListItemClick(Movie movieDetail);
    }

    public MovieAdapter(Context context,ListItemClickListener listener){
        mContext = context;
        mOnClickListener = listener;
        mMovieList = new ArrayList<>();
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_movie,parent,false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {

        Movie movie = mMovieList.get(position);
        Picasso.with(mContext)
                .load(movie.getPosterPath())
                .into(holder.movieImageView);

    }

    @Override
    public int getItemCount() {
        return mMovieList.size();
    }

    public void setMovieList(List<Movie> moviesList){
        mMovieList.clear();
        mMovieList.addAll(moviesList);
        notifyDataSetChanged();
    }

    class MovieViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView movieImageView;


        public MovieViewHolder(View itemView) {
            super(itemView);
            movieImageView = (ImageView)itemView.findViewById(R.id.movieImageView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int clickedPosition = getAdapterPosition();
            Movie movie = mMovieList.get(clickedPosition);
            mOnClickListener.onListItemClick(movie);

        }
    }

}
