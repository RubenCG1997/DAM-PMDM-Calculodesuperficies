package com.example.clculodesuperficies;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class ActivityRhombus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhombus);

        findViewById(R.id.btn_delete).setOnClickListener(v->clear());
        findViewById(R.id.btn_calculate).setOnClickListener(v->calculateSurface());
    }
    private void clear(){
        ((EditText)findViewById(R.id.txt_Side1)).setText("");
        ((EditText)findViewById(R.id.txt_Side2)).setText("");
        ((TextView)findViewById(R.id.lbl_result)).setText("0.00");
    }
    private void calculateSurface(){

        String smallDiag= (((EditText)findViewById(R.id.txt_Side1)).getText().toString());
        String majorDiag= (((EditText)findViewById(R.id.txt_Side2)).getText().toString());

        double surface;

        if(!smallDiag.isEmpty() && !majorDiag.isEmpty()){
            if(Double.parseDouble(majorDiag)>Double.parseDouble(smallDiag)){
                surface = (Double.parseDouble(smallDiag)*Double.parseDouble(majorDiag))/2;
                DecimalFormat df = new DecimalFormat("#.00");
                ((TextView)findViewById(R.id.lbl_result)).setText(df.format(surface));
            }
            else{
                ((TextView)findViewById(R.id.lbl_result)).setText(R.string.msg_error);
            }

        }

    }
}