package com.example.convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickBtn (View view){
        Button button;
        TextView result;
        EditText inputTxt;

        button = findViewById(R.id.button);
        result  = findViewById(R.id.result);
        inputTxt = findViewById(R.id.inputTxt);



            String s = inputTxt.getText().toString();
            int n = Integer.parseInt(s);
            double pound = n * 2.205;
            result.setText("The corresponding Pound value is = " + pound);
        }



}