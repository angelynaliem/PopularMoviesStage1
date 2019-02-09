package com.example.android.popularmoviesstage1.utils;

import com.example.android.popularmoviesstage1.model.Movie;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonUtils {

    public static Movie parseMovieJson(String json) {

        Movie mv = null;

        String Results = "results",
                OriginalTitle = "original_title",
                PosterPath = "poster_path",
                Overview = "overview",
                VoteAverage = "vote_average",
                ReleaseDate = "release_date";

        try {

            JSONObject rootObject, nameObject;
            String original_title, poster_path, overview, vote_average, release_date;

            rootObject = new JSONObject(json);

            nameObject = rootObject.getJSONObject(Results);

            original_title = nameObject.optString(OriginalTitle);

            poster_path = rootObject.optString(PosterPath);

            overview = rootObject.optString(PosterPath);

            vote_average = rootObject.optString(VoteAverage);

            release_date = rootObject.optString(ReleaseDate);

            mv = new Movie(original_title, poster_path, overview, vote_average, release_date);


        } catch (JSONException e) {
            e.printStackTrace();
        }

        return mv;

    }

    private static List<String> jsonArrayValuesToList(JSONArray jsonArray) {

        List<String> mvList = new ArrayList<String>();

        for (int i = 0; i < jsonArray.length(); i++) {
            try {
                mvList.add(jsonArray.getString(i));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return mvList;

    }
}
