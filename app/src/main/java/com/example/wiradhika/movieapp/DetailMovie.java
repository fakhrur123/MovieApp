package com.example.wiradhika.movieapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.wiradhika.movieapp.R;

public class DetailMovie extends AppCompatActivity {
    private TextView txtTitle;
    private TextView txtOverview;
    private TextView txtRelease;
    private ImageView imgPoster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);
        Movie f = (Movie) getIntent().getSerializableExtra("F");
        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText(f.getTxtTitle());
        txtOverview = (TextView) findViewById(R.id.txtDescription);
        txtOverview.setText(f.getTxtOverview());
        txtRelease = (TextView) findViewById(R.id.txtDateShow);
        txtRelease.setText(f.getReleaseDate());

        imgPoster = (ImageView) findViewById(R.id.posterMovie);
        Glide.with(getApplicationContext())
                .load(f.getImgPoster())
                .override(350,350)
                .into(imgPoster);
    }
}
