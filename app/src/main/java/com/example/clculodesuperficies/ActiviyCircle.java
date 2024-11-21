package com.example.clculodesuperficies;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class ActiviyCircle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activiy_circle);

        findViewById(R.id.btn_delete).setOnClickListener(v->clear());
        findViewById(R.id.btn_calculate).setOnClickListener(v->calculateSurface());
    }

    private void clear(){
        ((EditText)findViewById(R.id.txt_Side1)).setText("");
        ((TextView)findViewById(R.id.lbl_result)).setText("0.00");
    }
    private void calculateSurface(){
        final double pi = 3.14;

        String side= (((EditText)findViewById(R.id.txt_Side1)).getText().toString());

        double surface;

        if(!side.isEmpty()){
            surface = Double.parseDouble(side)*Double.parseDouble(side)*pi;
            DecimalFormat df = new DecimalFormat("#.00");
            ((TextView)findViewById(R.id.lbl_result)).setText(df.format(surface));
        }

    }
}