package com.example.amit2.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clicked(View view)
    {
        EditText editText=(EditText) findViewById(R.id.editText);
        String dollar = editText.getText().toString();
        double dollars = Double.parseDouble(dollar);
        double inr = dollars*78.6;
        String indianrs = String.format("%.2f",inr);
        Toast.makeText(this,"Amount is "+ indianrs +" rs",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
