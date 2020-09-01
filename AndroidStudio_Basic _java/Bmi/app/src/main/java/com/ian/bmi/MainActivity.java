package com.ian.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextWeight;
    private EditText editTextHeight;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            findView();
        }

    private void findView() {
        editTextWeight = findViewById(R.id.editTextWeight);
        editTextHeight = findViewById(R.id.editTextHeight);
    }

    public void bmi(View view){
    String w =editTextWeight.getText().toString();
    String h =editTextHeight.getText().toString();
    float weight = Float.parseFloat(w);
    float height = Float.parseFloat(h);
    float bmi = weight/(height*height);
    Intent  intent = new Intent(this,RestActivity.class);
    intent.putExtra("BMI",bmi);
    startActivity(intent);
    }
}
