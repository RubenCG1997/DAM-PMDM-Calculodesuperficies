package com.example.clculodesuperficies;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class ActivityOval extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oval);

        findViewById(R.id.btn_delete).setOnClickListener(v->clear());
        findViewById(R.id.btn_calculate).setOnClickListener(v->calculateSurface());
    }
    private void clear(){
        ((EditText)findViewById(R.id.txt_Side1)).setText("");
        ((EditText)findViewById(R.id.txt_Side2)).setText("");
        ((TextView)findViewById(R.id.lbl_result)).setText("0.00");
    }
    private void calculateSurface(){
        final double pi = 3.14;
        String MinorRadius= (((EditText)findViewById(R.id.txt_Side1)).getText().toString());
        String MaxRadius= (((EditText)findViewById(R.id.txt_Side2)).getText().toString());

        double surface;

        if(!MinorRadius.isEmpty() && !MaxRadius.isEmpty()){
            if (Double.parseDouble(MaxRadius)>Double.parseDouble(MinorRadius)){
                surface = Double.parseDouble(MinorRadius)*Double.parseDouble(MaxRadius)*pi;
                DecimalFormat df = new DecimalFormat("#.00");
                ((TextView)findViewById(R.id.lbl_result)).setText(df.format(surface));
            }
            else{
                ((TextView)findViewById(R.id.lbl_result)).setText(R.string.msg_error);
            }

        }

    }
}