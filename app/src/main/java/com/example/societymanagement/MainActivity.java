package com.example.societymanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText floor,flat;
    Button search,list;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        floor=findViewById(R.id.floor);
        flat=findViewById(R.id.flat);
        list=findViewById(R.id.list);
        search=findViewById(R.id.Search);
        String[] arraySpinner = new String[] {"Yoga Classes", "Gym", "Coaching Classes", "Home cooked food", "Swimming pool", "Party hall", "Common plot"};
        Spinner s = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);



        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent homee=new Intent(MainActivity.this,home.class);
                startActivity(homee);
            }
        });
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent due= new Intent(MainActivity.this,due.class);
                startActivity(due);
            }
        });


    }
}