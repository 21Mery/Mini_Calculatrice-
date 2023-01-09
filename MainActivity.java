package com.example.prep1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //private EditText Number1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void calculate(View view) {
        EditText editTextNumber1 =(EditText)findViewById(R.id.editTextNumber1);
        EditText editTextNumber2 =(EditText)findViewById(R.id.editTextNumber2);

        int Number1 =Integer.parseInt(editTextNumber1.getText().toString());
        int Number2 =Integer.parseInt(editTextNumber2.getText().toString());

        RadioButton addRadioButton = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton subRadioButton = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton mulRadioButton = (RadioButton) findViewById(R.id.radioButton4);
        RadioButton divRadioButton = (RadioButton) findViewById(R.id.radioButton5);

       int result = 0;
        if (addRadioButton.isChecked()){
            result = Number1  + Number2;
        } else if (subRadioButton.isChecked()){
            result = Number1  - Number2;
        }else if (mulRadioButton.isChecked()){
            result = Number1  * Number2;

        }else if (divRadioButton.isChecked()){
            result = Number1 / Number2;
        }
        TextView textViewres = (TextView) findViewById(R.id.textViewres);
        textViewres.setText("Resultat : "+result);

    }



    public void reset(View view) {
        EditText editTextNumber1 =(EditText)findViewById(R.id.editTextNumber1);
        EditText editTextNumber2 =(EditText)findViewById(R.id.editTextNumber2);
        editTextNumber1.setText("");
        editTextNumber2.setText("");
        TextView textViewres = (TextView) findViewById(R.id.textViewres);
        textViewres.setText("");

    };

    public void intent(View view) {
        EditText editTextNumber1 =(EditText)findViewById(R.id.editTextNumber1);
        EditText editTextNumber2 =(EditText)findViewById(R.id.editTextNumber2);
        TextView textViewres = (TextView) findViewById(R.id.textViewres);

        Intent myitent = new Intent(this,MainActivity2.class);
        Bundle b = new Bundle();
        b.putString("result",textViewres.getText().toString());

        myitent.putExtras(b);
        startActivity(myitent);


    }
}
