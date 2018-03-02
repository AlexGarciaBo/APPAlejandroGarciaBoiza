package com.example.a21540743.appalejandrogarciaboiza;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by 21540743 on 02/03/2018.
 */


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

    }
    TextView titulo = (TextView) findViewById(R.id.Title);

    Typeface myFont = Typeface.createFromAsset(getAssets(), "Nittizen_TRIAL.ttf");
        titulo.s

    public void PasarPantalla(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}



