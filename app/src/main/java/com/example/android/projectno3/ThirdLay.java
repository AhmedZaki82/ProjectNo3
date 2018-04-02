package com.example.android.projectno3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class ThirdLay extends SecondLay {

    static int score;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_lay);
    }

    public void next_3(View view) {

        RadioButton answer1 = (RadioButton) findViewById(R.id.first_r);
        RadioButton answer2 = (RadioButton) findViewById(R.id.second_r);
        RadioButton answer3 = (RadioButton) findViewById(R.id.third_r);
        RadioButton answer4 = (RadioButton) findViewById(R.id.fourth_r);

        boolean check1 = answer1.isChecked();
        boolean check2 = answer2.isChecked();
        boolean check3 = answer3.isChecked();
        boolean check4 = answer4.isChecked();

        if (check4) {
            score = ++score;

            Toast.makeText(this, getString(R.string.proudJ)+".", Toast.LENGTH_LONG).show();
        } else if (check1) {

            Toast.makeText(this, getString(R.string.sorryJ)+"." , Toast.LENGTH_LONG).show();

        } else if (check2) {

            Toast.makeText(this, getString(R.string.sorryJ)+"." , Toast.LENGTH_LONG).show();

        } else if (check3) {

            Toast.makeText(this, getString(R.string.sorryJ)+"." , Toast.LENGTH_LONG).show();

        } else {

            Toast.makeText(this, getString(R.string.chooseAnswerJ), Toast.LENGTH_LONG).show();
            return;
        }

        nextToFifthPage(view);
    }

    public void onBackPressed() {

        Toast.makeText(this, getString(R.string.backJ), Toast.LENGTH_LONG).show();
        return;
    }

    private void nextToFifthPage(View view) {

        Intent intent = new Intent(this, FifthLay.class);
        startActivity(intent);
    }
}
