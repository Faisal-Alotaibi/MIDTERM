package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button gotoBtn = (Button) findViewById(R.id.gotoBtn);
    Button gotoBtn2 = (Button) findViewById(R.id.gotoBtn2);
    Button gotoBtn3 = (Button) findViewById(R.id.gotoBtn3);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        gotoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity2.this , MainActivity.class));
            }
        });

        gotoBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity2.this , MainActivity3.class));
            }
        });

        gotoBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity2.this , MainActivity4.class));
            }
        });



    }
}