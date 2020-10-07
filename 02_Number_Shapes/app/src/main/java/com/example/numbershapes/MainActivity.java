package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number {


        int number;
        public boolean isSquare(){
            double sqrRoot=Math.sqrt(number);

            return sqrRoot == Math.floor(sqrRoot);
        }

        public boolean isTriangular(){

            int counter=1;
            int triangularNumber=1;

            while(triangularNumber<number){
                counter++;
                triangularNumber=triangularNumber+counter;

            }
            return triangularNumber == number;
        }
    }

    public void testNumber(View view) {



        EditText editText=(EditText) findViewById(R.id.editTextNumber);

        Number myNumber=new Number();

        myNumber.number=Integer.parseInt(editText.getText().toString());
        String message;
        if(editText.getText().toString().isEmpty()){
            message="Please enter a number";
        }
        else {
            if (myNumber.isSquare() && myNumber.isTriangular()) {
                message = "The number is both Triangular and Square";
            } else if (myNumber.isSquare()) {
                message = "The number is only Square";
            } else if (myNumber.isTriangular()) {
                message = "The number is only Triangular";
            } else {
                message = "The number is neither Triangular nor Square";
            }
        }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        //System.out.println(myNumber.isSquare());
        //Log.i("Info","Button is pressed");
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}