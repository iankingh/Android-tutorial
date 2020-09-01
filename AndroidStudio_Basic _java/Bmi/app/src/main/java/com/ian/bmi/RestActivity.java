package com.ian.bmi;

import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest);
        TextView rest = findViewById(R.id.textRest);
        float bmi = getIntent().getFloatExtra("BMI",0);
        rest.setText("YOUR BMI = " +bmi );
    }
}
