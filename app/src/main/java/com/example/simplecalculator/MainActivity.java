package com.example.simplecalculator;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     EditText ed1,ed2;
     TextView result;
     Button b1,b2,b3,b4;
     Integer a,b,c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.ed1);
        ed2 = (EditText) findViewById(R.id.ed2);
        b1 = (Button) findViewById(R.id.add);
        b2 = (Button) findViewById(R.id.sub);
        b3 = (Button) findViewById(R.id.mul);
        b4 = (Button) findViewById(R.id.div);
        result = (TextView) findViewById(R.id.tv1);


        if(savedInstanceState!=null && savedInstanceState.containsKey("ap")){
            c = savedInstanceState.getInt("ap");
            result.setText(String.valueOf(c));
        }

    }
        public void Addition (View view){
            a = Integer.parseInt(ed1.getText().toString());
            b = Integer.parseInt(ed2.getText().toString());
            int sum = a + b;
            result.setText(String.valueOf(sum));
        }

        public void Subtraction (View view){
            a = Integer.parseInt(ed1.getText().toString());
            b = Integer.parseInt(ed2.getText().toString());
            int sub = a - b;
            result.setText(String.valueOf(sub));
        }

        public void multiplication (View view){
            a = Integer.parseInt(ed1.getText().toString());
            b = Integer.parseInt(ed2.getText().toString());
            int mul = a * b;
            result.setText(String.valueOf(mul));

        }


        public void Division (View view){
            a = Integer.parseInt(ed1.getText().toString());
            b = Integer.parseInt(ed2.getText().toString());

            int div = a / b;
            result.setText(String.valueOf(div));


        }



   @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("ap",c);
    }
}