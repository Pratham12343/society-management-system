package com.example.societymanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class home extends AppCompatActivity {
    TextView floorhome,flathome;
    ImageView homebutton;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        homebutton=findViewById(R.id.homebutton);
        floorhome=findViewById(R.id.floorhome);
        flathome=findViewById(R.id.flathome);



        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(home.this,MainActivity.class);
                startActivity(back);
            }
        });
    }
}