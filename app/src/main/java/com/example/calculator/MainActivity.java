package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextA;
    private EditText editTextB;
    private EditText editTextC;
    private TextView textViewX;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextA = findViewById(R.id.edit_text_a);
        editTextB = findViewById(R.id.edit_text_b);
        editTextC = findViewById(R.id.edit_text_с);
        textViewX = findViewById(R.id.edit_view_x);

    }

    private int getIntValue(EditText editText){
        return Integer.parseInt(editText.getText().toString());
    }

    public void click(View view){
        int a = getIntValue(editTextA);
        int b = getIntValue(editTextB);
        int c = getIntValue(editTextC);
        double x = (c - b) / (double)a;
        textViewX.setText((int)x);
        Toast.makeText(this,x + "", Toast.LENGTH_SHORT).show();
    }
}