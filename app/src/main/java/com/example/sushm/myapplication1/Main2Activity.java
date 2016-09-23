package com.example.sushm.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView awesomeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       // awesomeTextView=(TextView)findViewById(R.id.textView);

        Bundle bundle=getIntent().getExtras();
        String data= bundle.getString("custom-tag");
        if(data!=null)
        {
        awesomeTextView.setText(data);
        }
    }
}