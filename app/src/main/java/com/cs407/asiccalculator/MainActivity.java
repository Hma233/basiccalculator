package com.cs407.asiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void clickFunctionForDivision(View view) {
        EditText edittext1 = (EditText) findViewById(R.id.editTextText);
        EditText edittext2 = (EditText) findViewById(R.id.editTextText2);
        String num1String = edittext1.getText().toString();
        String num2String = edittext2.getText().toString();
        if (num1String.isEmpty() || num2String.isEmpty()) {
            Toast.makeText(MainActivity.this, "can not be empty", Toast.LENGTH_SHORT).show();
            // Handle empty inputs
            return;
        }
        double a = Double.parseDouble(num1String);
        double b = Double.parseDouble(num2String);
        if (b == 0) {
            Toast.makeText(MainActivity.this, "Cannot divide by zero!", Toast.LENGTH_SHORT).show();
        } else {
            double c = a / b;
            goToActivity(c);
        }
    }
    public void clickFunctionForAdd(View view){
        EditText edittext1 =(EditText) findViewById(R.id.editTextText);
        EditText edittext2 =(EditText) findViewById(R.id.editTextText2);
        String num1String = edittext1.getText().toString();
        String num2String = edittext2.getText().toString();
        if (num1String.isEmpty() || num2String.isEmpty()) {
            Toast.makeText(MainActivity.this, "can not be empty", Toast.LENGTH_SHORT).show();
            // Handle empty inputs
            return;
        }
        double a = Double.parseDouble(num1String);
        double b = Double.parseDouble(num2String);
        double c1 = a+b ;
        goToActivity(c1);
    }

    public void clickFunctionForSubtraction(View view){
        EditText edittext1 =(EditText) findViewById(R.id.editTextText);
        EditText edittext2 =(EditText) findViewById(R.id.editTextText2);
        String num1String = edittext1.getText().toString();
        String num2String = edittext2.getText().toString();
        if (num1String.isEmpty() || num2String.isEmpty()) {
            Toast.makeText(MainActivity.this, "can not be empty", Toast.LENGTH_SHORT).show();
            // Handle empty inputs
            return;
        }
        double a = Double.parseDouble(num1String);
        double b = Double.parseDouble(num2String);
        double c2 = a-b ;
        goToActivity(c2);
    }

    public void clickFunctionForMultiplication(View view){
        EditText edittext1 =(EditText) findViewById(R.id.editTextText);
        EditText edittext2 =(EditText) findViewById(R.id.editTextText2);
        String num1String = edittext1.getText().toString();
        String num2String = edittext2.getText().toString();
        if (num1String.isEmpty() || num2String.isEmpty()) {
            Toast.makeText(MainActivity.this, "can not be empty", Toast.LENGTH_SHORT).show();
            // Handle empty inputs
            return;
        }
        double a = Double.parseDouble(num1String);
        double b = Double.parseDouble(num2String);
        double c2 = a*b ;
        goToActivity(c2);
    }

    public void goToActivity(Double s){
        Intent intent = new Intent(MainActivity.this, calculatorActivity.class);
        intent.putExtra("Result",Double.toString(s));
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}