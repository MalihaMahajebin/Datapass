package com.example.datapass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LowFemale extends AppCompatActivity {
    Intent intent;
    TextView tv,tvv;
    String name;
    String age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_low_female);
        intent=getIntent();
        tv=findViewById(R.id.LowNameFemale);
        tvv=findViewById(R.id.AgeLowFemale);
        name = intent.getStringExtra("name");
        age = intent.getStringExtra("age");
        tv.setText(name);
        tvv.setText(age);
    }
}
