package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import android.view.View;


public class MainActivity extends AppCompatActivity {

    EditText num1,num2;
    Button add,sub,mul,div;
    TextView result;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        result=findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f, s, a;
                f = Integer.parseInt(num1.getText().toString());
                s = Integer.parseInt(num2.getText().toString());

                a = f + s;

                result.setText("Addition= " + a);
            }

        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f, s, a;
                f = Integer.parseInt(num1.getText().toString());
                s = Integer.parseInt(num2.getText().toString());

                a = f - s;

                result.setText("Subtraction= " + a);
            }

        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f, s, a;
                f = Integer.parseInt(num1.getText().toString());
                s = Integer.parseInt(num2.getText().toString());

                a = f * s;

                result.setText("Multiplication= " + a);
            }

        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f, s, a;
                f = Integer.parseInt(num1.getText().toString());
                s = Integer.parseInt(num2.getText().toString());

                a = f / s;

                result.setText("Division= " + a);
            }

        });
    }
}