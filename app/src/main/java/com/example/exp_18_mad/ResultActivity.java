package com.example.exp_18_mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        int num = (int) intent.getSerializableExtra("num");
        int fact = calFact(num);
        res = (TextView) findViewById(R.id.txtRes);
        res.setText("Factorial of "+num+" is "+fact);
    }

    public int calFact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f = f*i;
        }
        return f;
    }
}