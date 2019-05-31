package com.example.score;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class ResultActivitity extends AppCompatActivity {
    private TextView tvResult;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results_activity);
        tvResult=(TextView)findViewById(R.id.tvResult);
        showResults();
    }

    private void showResults(){
        NumberFormat nf = NumberFormat.getInstance();
        Bundle bundle = getIntent().getExtras();
        int programming = bundle.getInt("programming");
        int dataStructure = bundle.getInt("dataStructure");
        int algorithm = bundle.getInt("algorithm");
        int sum = programming + dataStructure + algorithm;
        double average = sum /3.0;
        String text = "programming="+programming+"\ndataStructure="+dataStructure+"\nalgorithm"+algorithm+"\nsum"+sum+"\naverage"+nf.format(average);
        tvResult.setText(text);
        alert(average);
    }
    private void alert(double average){
        String message = new String();
        String title = new String();
        int pic=0;

        if(average==100){
            message="100";
            title="Pass";
            pic=R.drawable.circle;
        }
        else if(average>=60){
            message="60";
            title="Pass";
            pic=R.drawable.circle;
        }
        if(average==40){
            message="100";
            title="failed";
            pic=R.drawable.tan;
        }
        else {
            message="0";
            title="failed";
            pic=R.drawable.fail;
        }
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage(message);
        builder.setTitle(title);
        builder.setIcon(pic);
        builder.show();
    }

    public void onBackClick(View view){finish();}
}
