package com.example.uizen.guessmynumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText editText=(EditText) findViewById(R.id.editText);
    int enteredNum= Integer.parseInt(editText.getText().toString());

    int randomInt;

    public void makeToast(String string)
    {
        Toast.makeText(MainActivity.this,string,Toast.LENGTH_SHORT).show();
    }

    public void myFunction(View view) {


        if(enteredNum>randomInt)
        {
            makeToast("Greater!");
           // Toast.makeText(MainActivity.this, "Entered number "+enteredNum+" is greater", Toast.LENGTH_SHORT).show();
        }
        else if(enteredNum<randomInt)
        {
            makeToast("Less !");
           // Toast.makeText(MainActivity.this,"Entered number "+enteredNum+" is less",Toast.LENGTH_SHORT).show();
        }
        else
            makeToast("Equal !");
           // Toast.makeText(MainActivity.this, "Entered value is equal to the generated one "+randomInt, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         randomInt= new Random().nextInt(10)+1;

    }


}

