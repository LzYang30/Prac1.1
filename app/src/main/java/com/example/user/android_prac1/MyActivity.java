package com.example.user.android_prac1;
//Date 25/10/16
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MyActivity extends AppCompatActivity {
    private EditText editTextName;
    private EditText editTextId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        //Link UI to program
        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextId = (EditText)findViewById(R.id.editTextId);
    }

    public void sendMessage(View view){
        //Log.d("Main Activity","Button clicked.");
        Intent intent = new Intent(this, SecondActivity.class);

        String name;
        String id;
        //Extract input from UI(View)
        name = editTextName.getText().toString();
        id = editTextId.getText().toString();
        intent.putExtra("NAME",name);
        intent.putExtra("ID",id);

        startActivity(intent);
    }
}
