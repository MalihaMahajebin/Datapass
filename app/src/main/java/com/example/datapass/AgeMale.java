package com.example.datapass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AgeMale extends AppCompatActivity {
    Intent intent;
    TextView tv,tvv;
    String name;
    String age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_male);
        intent=getIntent();
        tv=findViewById(R.id.nameAgeMale);
        tvv=findViewById(R.id.AgeMale);
        name = intent.getStringExtra("name");
        age = intent.getStringExtra("age");
        tv.setText(name);
        tvv.setText(age);
    }
}
