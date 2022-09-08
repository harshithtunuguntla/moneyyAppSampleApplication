package com.example.moneyyappapplication;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {

                EditText t1=(EditText)findViewById(R.id.input1);
                EditText t2=(EditText)findViewById(R.id.input2);

                //convert value into int

                int x = 0;
                int y = 0;

                try{
                    x=Integer.parseInt(t1.getText().toString());
                    y=Integer.parseInt(t2.getText().toString());
                    //sum these two numbers
                    int z=x+y;
                    //display this text to TextView
                    TextView tv_data=(TextView)findViewById(R.id.textView);
                    tv_data.setText("The sum is "+z);

                }catch(Exception error1) {
                    if(t1.getText().toString().equals("") | t2.getText().toString().equals("") ){
                        TextView tv_data=(TextView)findViewById(R.id.textView);
                        tv_data.setText("Null values cannot be accepted");
                    }
                    else {
                        TextView tv_data=(TextView)findViewById(R.id.textView);
                        tv_data.setText("Input values cannot be string type");
                    }

//                    Context context = getApplicationContext();
//                    CharSequence text = "Hello toast!";
//                    int duration = Toast.LENGTH_SHORT;
//
//                    Toast toast = Toast.makeText(context, text, duration);
//                    toast.show();
//
                }



            }
        });


}}