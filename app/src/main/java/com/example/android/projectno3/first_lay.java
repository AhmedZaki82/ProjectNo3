package com.example.android.projectno3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class first_lay extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_lay);

    }

    public void next_1(View view) {

        RadioButton answer1 = (RadioButton) findViewById(R.id.first_r);
        RadioButton answer2 = (RadioButton) findViewById(R.id.second_r);
        RadioButton answer3 = (RadioButton) findViewById(R.id.third_r);
        RadioButton answer4 = (RadioButton) findViewById(R.id.fourth_r);

        boolean check1 = answer1.isChecked();
        boolean check2 = answer2.isChecked();
        boolean check3 = answer3.isChecked();
        boolean check4 = answer4.isChecked();
        int score = 1;

        if (check4) {
            Toast.makeText(this, getString(R.string.greatJ)+"." + "\n"+getString(R.string.scoreJ)+score+"/4", Toast.LENGTH_LONG).show();
        } else if (check1) {

            Toast.makeText(this, getString(R.string.sorryJ), Toast.LENGTH_LONG).show();

            return;
        } else if (check2) {

            Toast.makeText(this, getString(R.string.sorryJ), Toast.LENGTH_LONG).show();

            return;
        } else if (check3) {

            Toast.makeText(this, getString(R.string.sorryJ), Toast.LENGTH_LONG).show();

            return;
        } else {

            Toast.makeText(this, getString(R.string.chooseAnswerJ), Toast.LENGTH_LONG).show();
            return;
        }

        nextToThirdPage(view);

    }

    private void nextToThirdPage(View view) {

        Intent intent = new Intent(this, second_lay.class);
        startActivity(intent);

    }

}
