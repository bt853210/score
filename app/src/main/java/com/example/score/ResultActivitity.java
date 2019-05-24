package com.example.score;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ResultActivitity extends AppCompatActivity {
    private TextView tvResult;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results_activity);
        tvResult=(TextView)findViewById(R.id.tvResult);
    }
}
