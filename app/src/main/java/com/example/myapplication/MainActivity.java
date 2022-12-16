package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
     private static final String Tag="lifecycle";
     EditText editYear;
     TextView TxtAgeResult;
     Button btncalculates;
    int ageResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editYear=findViewById(R.id.editTextNumber);
        TxtAgeResult=findViewById(R.id.textviewResult);
        btncalculates=findViewById(R.id.btncalculate);
       btncalculates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ageResult= Calendar.getInstance().get(Calendar.YEAR)-Integer.parseInt(editYear.getText().toString());
                TxtAgeResult.setText(""+ageResult);

            }
        });
    }
        
   
}