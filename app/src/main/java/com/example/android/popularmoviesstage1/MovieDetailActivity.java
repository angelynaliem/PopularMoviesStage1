package com.example.android.popularmoviesstage1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.popularmoviesstage1.model.Movie;
import com.example.android.popularmoviesstage1.utils.JsonUtils;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MovieDetailActivity extends AppCompatActivity {

    public static final String EXTRA_POSITION = "extra_position";
    private static final int DEFAULT_POSITION = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        ImageView poster_path = findViewById(R.id.movie_image_poster);

        Intent intent = getIntent();

        int position = intent.getIntExtra(EXTRA_POSITION, DEFAULT_POSITION);
        if (position == DEFAULT_POSITION) {
            return;
        }


        Movie mv = JsonUtils.parseMovieJson(json);
        if (mv == null) {
            return;
        }

        populateUI(mv);
        Picasso.with(this)
                .load(mv.getPosterPath())
                .into(poster_path);
    }


    private void populateUI(Movie mv) {

        TextView movieTitle = findViewById(R.id.movie_original_title);

        ImageView moviePosterPath = findViewById(R.id.movie_image_poster);

        TextView movieOverview = findViewById(R.id.movie_plot_synopsis);

        TextView movieVoteAverage = findViewById(R.id.movie_user_rating);

        TextView movieReleaseDate = findViewById(R.id.movie_release_date);

        movieTitle.setText(mv.getOriginalTitle());
        moviePosterPath.setImageResource(mv.getPosterPath());
        movieOverview.setText(mv.getOverview());
        movieVoteAverage.setText(mv.getVoteAverage());
        movieReleaseDate.setText(mv.getReleaseDate());
         }

}