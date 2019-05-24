package com.example.score;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etPrograming,etDataStructure,etAlgorithm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }
    private void findViews(){
        etPrograming = (EditText)findViewById(R.id.etProgramming);
        etDataStructure=(EditText)findViewById(R.id.etDataStructure);
        etAlgorithm=(EditText)findViewById(R.id.etAlgorithm);
    }
    private boolean isValid(EditText editText){
        String pattern = "1[0]{2}|[0-9]{1,2}";
        String text = editText.getText().toString();
        if(!text.matches(pattern)){
            editText.setError("0~100");
            return false;
        }
        else return true;
    }
}
