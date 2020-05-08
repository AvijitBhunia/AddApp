package com.example.addapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t3;
    EditText et1,et2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.editText1);
        et2=(EditText)findViewById(R.id.editText2);
        t3=(TextView)findViewById(R.id.textView3);
        b1=(Button)findViewById(R.id.addButton);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int a=Integer.parseInt(et1.getText().toString());
               int b=Integer.parseInt(et2.getText().toString());
               int sum=a+b;
               t3.setText("Sum is "+sum);
            }
        });
    }
}
