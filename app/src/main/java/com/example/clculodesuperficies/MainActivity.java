package com.example.clculodesuperficies;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_rectangle).setOnClickListener(v->goRectangleActivity());
        findViewById(R.id.btn_square).setOnClickListener(v->goSquareActivity());
        findViewById(R.id.btn_oval).setOnClickListener(v->goOvalActivity());
        findViewById(R.id.btn_circle).setOnClickListener(v->goCircleActivity());
        findViewById(R.id.btn_triangle).setOnClickListener(v->goTriangleActivity());
        findViewById(R.id.btn_rhombus).setOnClickListener(v->goRhombusActivity());
        findViewById(R.id.btn_pentagon).setOnClickListener(v->goPentagonActivity());
        findViewById(R.id.btn_hexagon).setOnClickListener(v->goHexagonActivity());
    }

    private void goHexagonActivity() {
        Intent intent = new Intent(getApplicationContext(), ActivityHexagon.class);
        startActivity(intent);
    }

    private void goPentagonActivity() {
        Intent intent = new Intent(getApplicationContext(), ActivityPentagon.class);
        startActivity(intent);
    }

    private void goRhombusActivity() {
        Intent intent = new Intent(getApplicationContext(), ActivityRhombus.class);
        startActivity(intent);
    }

    private void goTriangleActivity() {
        Intent intent = new Intent(getApplicationContext(), ActivityTriangle.class);
        startActivity(intent);
    }

    private void goCircleActivity() {
        Intent intent = new Intent(getApplicationContext(), ActiviyCircle.class);
        startActivity(intent);
    }

    private void goOvalActivity() {
        Intent intent = new Intent(getApplicationContext(), ActivityOval.class);
        startActivity(intent);
    }

    private void goSquareActivity() {
        Intent intent = new Intent(getApplicationContext(), ActivitySquare.class);
        startActivity(intent);
    }

    private void goRectangleActivity() {
        Intent intent = new Intent(getApplicationContext(), ActivityRectangle.class);
        startActivity(intent);
    }

}