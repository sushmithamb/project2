package com.example.sushm.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private EditText text;
    private String enteredData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1= (Button) findViewById(R.id.button);
        text= (EditText) findViewById(R.id.editText);

        b1.setOnClickListener(new  View.OnClickListener() {

            @Override
            public void  onClick(View view)  {

                enteredData=text.getText().toString();
                Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("custom-tag",enteredData);
                startActivity(intent);
            }

        });
    }
}
