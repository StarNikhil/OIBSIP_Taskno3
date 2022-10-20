package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    EditText e1,e2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        e1=findViewById(R.id.editTextTextPersonName3);
        e2=findViewById(R.id.editTextTextPersonName4);
        t1=findViewById(R.id.textView2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().isEmpty() || e2.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"please enter the value",Toast.LENGTH_SHORT).show();
                }
                else {
                    int a = Integer.parseInt(e1.getText().toString());
                    int b = Integer.parseInt(e2.getText().toString());
                    int c = a + b;
                    t1.setText("Result:" + String.valueOf(c));
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().isEmpty() || e2.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"please enter the value",Toast.LENGTH_SHORT).show();
                }
                else {
                    int a = Integer.parseInt(e1.getText().toString());
                    int b = Integer.parseInt(e2.getText().toString());
                    int c = a - b;
                    t1.setText("Result:" + String.valueOf(c));
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().isEmpty() || e2.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"please enter the value",Toast.LENGTH_SHORT).show();
                }
                else {
                    int a = Integer.parseInt(e1.getText().toString());
                    int b = Integer.parseInt(e2.getText().toString());
                    int c = a * b;
                    t1.setText("Result:" + String.valueOf(c));
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().isEmpty() || e2.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"please enter the value",Toast.LENGTH_SHORT).show();
                }
                else {
                    int a = Integer.parseInt(e1.getText().toString());
                    int b = Integer.parseInt(e2.getText().toString());
                    int c = a / b;
                    t1.setText("Result:" + String.valueOf(c));
                }
            }
        });
    }
}