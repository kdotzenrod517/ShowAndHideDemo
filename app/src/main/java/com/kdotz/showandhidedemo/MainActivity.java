package com.kdotz.showandhidedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View view){
        TextView textView = (TextView) findViewById(R.id.textView);
        if(textView.getVisibility() == View.INVISIBLE){
            textView.setVisibility(View.VISIBLE);
        }
    }


    public void hide(View view){
        TextView textView = (TextView) findViewById(R.id.textView);
        if(textView.getVisibility() == View.VISIBLE){
            textView.setVisibility(View.INVISIBLE);
        }
    }
}
