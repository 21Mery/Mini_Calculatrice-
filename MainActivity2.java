package com.example.prep1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtv = (TextView) findViewById(R.id.textView3);

        Bundle b = getIntent().getExtras();

        String result =b.getString("result");

        txtv.setText( result);



    }

    public void back(View view) {
        finish();
    }
}
