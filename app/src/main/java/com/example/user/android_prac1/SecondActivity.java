package com.example.user.android_prac1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewName ;
    private TextView textViewID ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Link UI to program;
        textViewName = (TextView)findViewById(R.id.textViewName);
        textViewID = (TextView)findViewById(R.id.textViewID);

        String name;
        String id;

        Bundle extras = getIntent().getExtras();
        if(!extras.isEmpty()){
            name = (String) extras.getString("NAME");
            id = (String) extras.getString("ID");
            textViewName.setText(name);
            textViewID.setText(id);
        }else{
            textViewName.setText("Name Empty");
            textViewID.setText("ID Empty");
        }
    }

    public void Close(View view){
        finish();
    }

}
