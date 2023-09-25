package com.cs407.asiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class calculatorActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        textView =(TextView) findViewById(R.id.textView2);
        Intent intent=getIntent();
        String str=intent.getStringExtra("Result");
        textView.setText(str);
    }
    public void onClick(View view) {
        // create an intent to switch to second activity upon clicking
        Intent intent = new Intent(calculatorActivity.this,MainActivity.class);
        startActivity(intent);
    }
}