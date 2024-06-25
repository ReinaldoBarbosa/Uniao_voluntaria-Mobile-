package com.example.unio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import Model.SquareView;

public class Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);


        SquareView squareView = new SquareView(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(200, 200);
        squareView.setLayoutParams(params);
        LinearLayout layout = findViewById(R.id.layout_cadastro);
        layout.addView(squareView);
    }
}