package com.example.android.popularmoviesstage1.model;

public class Movie {

    private String original_title;
    private String poster_path;
    private String overview;
    private String vote_average;
    private String release_date;

    public Movie() {
    }

        public Movie(String original_title, String poster_path, String overview, String vote_average, String release_date) {

            this.original_title = original_title;
            this.poster_path = poster_path;
            this.overview = overview;
            this.vote_average = vote_average;
            this.release_date = release_date;

        }

        public String getOriginalTitle() {
            return original_title;

        }

        public  void setOriginalTitle (String original_title) {
            this.original_title = original_title;
        }

        public int getPosterPath () {
            return poster_path;
        }

        public void setPosterPath (String poster_path) {
            this.poster_path = poster_path;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview (String overview) {
            this.overview = overview;
        }

    public String getVoteAverage() {
        return vote_average;
    }

    public void setVoteAverage (String vote_average) {
        this.vote_average = vote_average;
    }

    public String getReleaseDate() {
        return release_date;
    }

    public void setReleaseDate (String release_date) {
        this.release_date = release_date;
    }

    }

