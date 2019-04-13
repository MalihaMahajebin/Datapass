package com.example.datapass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        private EditText et;
    private EditText ett;
   private Intent intent;
   private Integer age;
   private int male;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.name);
        ett=findViewById(R.id.age);
    }

    public void changePage(View view) {
        if (TextUtils.isEmpty(et.getText())|| TextUtils.isEmpty(ett.getText())) {
            Toast.makeText(getApplicationContext(), "Name and age is required!!", Toast.LENGTH_SHORT).show();
        }
        else {
            age = Integer.valueOf(ett.getText().toString());
            if (age < 18 && male == 0) {
                intent = new Intent(this, LowFemale.class);
                intent.putExtra("name", et.getText().toString());
                intent.putExtra("age", ett.getText().toString());
                startActivity(intent);
            } else if (age >= 18 && male == 0) {
                intent = new Intent(this, AgeFemale.class);
                intent.putExtra("name", et.getText().toString());
                intent.putExtra("age", ett.getText().toString());
                startActivity(intent);
            } else if (age >= 18 && male == 1) {
                intent = new Intent(this, AgeMale.class);
                intent.putExtra("name", et.getText().toString());
                intent.putExtra("age", ett.getText().toString());
                startActivity(intent);
            } else if (age < 18 && male == 1) {
                intent = new Intent(this, LowMale.class);
                intent.putExtra("name", et.getText().toString());
                intent.putExtra("age", ett.getText().toString());
                startActivity(intent);
            }
        }
    }
    public void RadioClick(View view) {
        int radioOpt = view.getId();
        if(radioOpt == R.id.male){
            male=1;
        }
        else {
            male=0;
        }

    }
}
