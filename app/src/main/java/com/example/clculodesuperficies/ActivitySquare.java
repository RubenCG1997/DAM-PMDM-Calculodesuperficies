package com.example.clculodesuperficies;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class ActivitySquare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);

        findViewById(R.id.btn_delete).setOnClickListener(v->clear());
        findViewById(R.id.btn_calculate).setOnClickListener(v->calculateSurface());
    }

    private void clear(){
        ((EditText)findViewById(R.id.txt_Side1)).setText("");
        ((TextView)findViewById(R.id.lbl_result)).setText("0.00");
    }
    private void calculateSurface(){
        String side= (((EditText)findViewById(R.id.txt_Side1)).getText().toString());

        double surface;

        if(!side.isEmpty()){
            surface = Double.parseDouble(side)*Double.parseDouble(side);
            DecimalFormat df = new DecimalFormat("#.00");
            ((TextView)findViewById(R.id.lbl_result)).setText(df.format(surface));
        }

    }
}