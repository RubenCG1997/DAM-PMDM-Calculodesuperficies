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

public class ActivityTriangle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        findViewById(R.id.btn_delete).setOnClickListener(v->clear());
        findViewById(R.id.btn_calculate).setOnClickListener(v->calculateSurface());
    }
    private void clear(){
        ((EditText)findViewById(R.id.txt_Side1)).setText("");
        ((EditText)findViewById(R.id.txt_Side2)).setText("");
        ((TextView)findViewById(R.id.lbl_result)).setText("0.00");
    }
    private void calculateSurface(){

        String Higth= (((EditText)findViewById(R.id.txt_Side1)).getText().toString());
        String Base= (((EditText)findViewById(R.id.txt_Side2)).getText().toString());

        double surface;

        if(!Higth.isEmpty() && !Base.isEmpty()){
            surface = (Double.parseDouble(Higth)*Double.parseDouble(Base))/2;
            DecimalFormat df = new DecimalFormat("#.00");
            ((TextView)findViewById(R.id.lbl_result)).setText(df.format(surface));
        }

    }
}