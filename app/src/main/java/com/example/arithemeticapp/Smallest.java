package com.example.arithemeticapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Smallest extends AppCompatActivity {
    EditText ed1,ed2;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_smallest);
        ed1=(EditText) findViewById(R.id.num1);
        ed2=(EditText) findViewById(R.id.num2);
        b1=(AppCompatButton) findViewById(R.id.small);
        b2=(AppCompatButton) findViewById(R.id.bcktohome);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int small;
                String num1 = ed1.getText().toString();
                String num2 = ed2.getText().toString();
                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);
                if(n1<n2)
                {
                    small=n1;
                }
                else
                {
                    small=n2;
                }
                Toast.makeText(getApplicationContext(),String.valueOf(small),Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }
}