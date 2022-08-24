package com.example.instantcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button add,subtract,multiply,divide;
    private TextView result;
    private EditText a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Welcome To Insta Calc", Toast.LENGTH_SHORT).show();
        add=findViewById(R.id.bt1);
        subtract=findViewById(R.id.bt2);
        multiply=findViewById(R.id.bt3);
        divide=findViewById(R.id.bt4);
        result=findViewById(R.id.textView4);
        a=findViewById(R.id.num1);
        b=findViewById(R.id.num2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double res=Integer.parseInt(a.getText().toString())+Integer.parseInt(b.getText().toString());
                Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_SHORT).show();
                result.setText("Result : "+res);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double res=Integer.parseInt(a.getText().toString())-Integer.parseInt(b.getText().toString());
                Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_SHORT).show();
                result.setText("Result : "+res);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double res=Integer.parseInt(a.getText().toString())*Integer.parseInt(b.getText().toString());
                Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_SHORT).show();
                result.setText("Result : "+res);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double res=Double.parseDouble(a.getText().toString())/Double.parseDouble(b.getText().toString());
                Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_SHORT).show();
                res=Math.round(res*100.0)/100.0;
                result.setText("Result : "+res);
            }
        });

    }
}