package com.example.android.projectno3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class FifthLay extends ThirdLay {

    static int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth_lay);
    }

    public void next_5(View view) {

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

        if (check1 && check2 && check3 && check4) {
            score = ++score;
            Toast.makeText(this, getString(R.string.jobJ), Toast.LENGTH_LONG).show();
        } else if (check5) {
            Toast.makeText(this, getString(R.string.wrongJ), Toast.LENGTH_LONG).show();
        } else if (check1 && check2 && check3 && check4 && check5) {
            Toast.makeText(this, getString(R.string.wrongJ), Toast.LENGTH_LONG).show();
        } else if (!check1 && !check2 && !check3 && !check4 && !check5){
            Toast.makeText(this, getString(R.string.sorry2J), Toast.LENGTH_LONG).show();
            return;
        } else {
            Toast.makeText(this, getString(R.string.wrongJ), Toast.LENGTH_LONG).show();
        }

        nextToFifthPage(view);
    }

    public void onBackPressed() {

        Toast.makeText(this, getString(R.string.backJ), Toast.LENGTH_LONG).show();
        return;
    }


    private void nextToFifthPage(View view) {

        Intent intent = new Intent(this, SixthLay.class);
        startActivity(intent);
    }
}
