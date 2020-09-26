package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){
        Log.i("Info", "Pressed");

        EditText editText =(EditText)findViewById(R.id.editTextNumberDecimal);
        String amountInRupees=editText.getText().toString();

        Double amountInDollars=Double.parseDouble(amountInRupees)*0.014;

        String finalString= String.format("%.2f",amountInDollars);

        Toast.makeText(this, "rupees "+amountInRupees+" equals $ " + amountInDollars,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}