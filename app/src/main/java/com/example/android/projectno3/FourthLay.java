package com.example.android.projectno3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FourthLay extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_lay);

        TextView textClimate = (TextView) findViewById(R.id.climate);
        textClimate.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textMovies = (TextView) findViewById(R.id.movies);
        textMovies.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textCelebrities = (TextView) findViewById(R.id.celebrities);
        textCelebrities.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textHealthy = (TextView) findViewById(R.id.healthy);
        textHealthy.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void second(View view) {

        again(view);
    }

    public void onBackPressed() {

        Toast.makeText(this, getString(R.string.backJ), Toast.LENGTH_LONG).show();
        return;
    }

    public void again(View view) {

        FirstLay.score = 0;
        SecondLay.score = 0;
        ThirdLay.score = 0;
        FifthLay.score = 0;
        SixthLay.score = 0;

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
