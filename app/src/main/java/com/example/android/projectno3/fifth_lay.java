package com.example.android.projectno3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class fifth_lay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth_lay);
    }

    public void next_5(View view) {

        int score = 4;

        CheckBox first_c = findViewById(R.id.first_c);
        CheckBox second_c = findViewById(R.id.second_c);
        CheckBox third_c = findViewById(R.id.third_c);
        CheckBox fourth_c = findViewById(R.id.fourth_c);
        CheckBox fifth_c = findViewById(R.id.fifth_c);

        boolean check1 = first_c.isChecked();
        boolean check2 = second_c.isChecked();
        boolean check3 = third_c.isChecked();
        boolean check4 = fourth_c.isChecked();
        boolean check5 = fifth_c.isChecked();

        if (check1) {

            Toast.makeText(this, getString(R.string.scoreJ)+score+"/4", Toast.LENGTH_LONG).show();
        } else if (check2) {

            Toast.makeText(this, getString(R.string.scoreJ), Toast.LENGTH_LONG).show();

        } else if (check3) {

            Toast.makeText(this, getString(R.string.scoreJ) + score + "/4", Toast.LENGTH_LONG).show();
        } else if (check4) {

            Toast.makeText(this, getString(R.string.scoreJ) + score + "/4", Toast.LENGTH_LONG).show();
        } else if (check5) {

            Toast.makeText(this, getString(R.string.ohJ)+"\n"+getString(R.string.scoreJ) + score + "/4", Toast.LENGTH_LONG).show();
        } else {

            Toast.makeText(this, getString(R.string.sorry2J), Toast.LENGTH_LONG).show();
            return;
        }

        nextToFifthPage(view);

    }

    private void nextToFifthPage(View view) {

        Intent intent = new Intent(this, fourth_lay.class);
        startActivity(intent);

    }
}
