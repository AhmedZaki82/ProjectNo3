package com.example.android.projectno3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SixthLay extends FifthLay {

    static int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sixth_lay);
    }

    public void next_6(View view) {

        String first = getString(R.string.watsonJ);
        String  second = getString(R.string.trumpJ);
        String third = getString(R.string.duckJ);

        EditText edtAnswer = (EditText) findViewById(R.id.edtAnswer);

       if (edtAnswer.getText().toString().equals(first)) {
           score = ++score;
           Toast.makeText(this, getString(R.string.answerJ)+"\n"+getString(R.string.scoreJ)+(FirstLay.score+SecondLay.score+ThirdLay.score+FifthLay.score+SixthLay.score)+"/5", Toast.LENGTH_LONG).show();
           nextToFifthPage(view);
       } else if (edtAnswer.getText().toString().equals(second)) {

           Toast.makeText(this, getString(R.string.wrongJ)+"\n"+getString(R.string.scoreJ)+(FirstLay.score+SecondLay.score+ThirdLay.score+FifthLay.score)+"/5", Toast.LENGTH_LONG).show();
           nextToFifthPage(view);
       } else if (edtAnswer.getText().toString().equals(third)) {

           Toast.makeText(this, getString(R.string.wrongJ)+"\n"+getString(R.string.scoreJ)+(FirstLay.score+SecondLay.score+ThirdLay.score+FifthLay.score+"/5"), Toast.LENGTH_LONG).show();
           nextToFifthPage(view);
       } else {

           Toast.makeText(this, getString(R.string.three), Toast.LENGTH_LONG).show();
           return;
       }

    }

    public void onBackPressed() {

        Toast.makeText(this, getString(R.string.backJ), Toast.LENGTH_LONG).show();
        return;
    }

    private void nextToFifthPage(View view) {

        Intent intent = new Intent(this, FourthLay.class);
        startActivity(intent);

    }
}
