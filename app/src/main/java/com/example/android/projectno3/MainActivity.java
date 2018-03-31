package com.example.android.projectno3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void letsStart(View view) {

        String Name = ((EditText) findViewById(R.id.name)).getText().toString();
        String Age = ((EditText) findViewById(R.id.age)).getText().toString();

        RadioButton chooseM = (RadioButton) findViewById(R.id.Male);
        boolean checkM = chooseM.isChecked();

        RadioButton chooseF = (RadioButton) findViewById(R.id.Female);
        boolean checkF = chooseF.isChecked();

        if (Name.length() < 1) {

            Toast.makeText(this, getString(R.string.nameJ), Toast.LENGTH_LONG).show();
            return;
        }

        if (checkM) ;
        else if (checkF) ;

        else {
            Toast.makeText(this, getString(R.string.genderJ), Toast.LENGTH_LONG).show();

            return;
        }

        if (Age.length() < 1) {

            Toast.makeText(this, getString(R.string.ageJ), Toast.LENGTH_LONG).show();
            return;
        }

        Toast.makeText(this, getString(R.string.hiJ) + " " + Name + " " + getString(R.string.hopeJ), Toast.LENGTH_LONG).show();
        nextToSecondPage(view);

    }


    private void nextToSecondPage(View view) {
        Intent intent = new Intent(this, first_lay.class);
        startActivity(intent);

    }

}