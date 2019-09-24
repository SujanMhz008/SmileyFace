package com.myapp.smileyface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtFirst, edtSecond, edtThird, edtFourth;
    private Button btnAdd, btnSub;
    int first, second, third, fourth, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Binding
        edtFirst = findViewById(R.id.edtFirst);
        edtSecond = findViewById(R.id.edtSecond);
        edtThird = findViewById(R.id.edtThird);
        edtFourth = findViewById(R.id.edtFourth);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSubtract);
        
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Integer.parseInt(edtFirst.getText().toString());
                second = Integer.parseInt(edtSecond.getText().toString());
                third = Integer.parseInt(edtThird.getText().toString());
                fourth = Integer.parseInt(edtFourth.getText().toString());

                result = first + second + third + fourth;
                Toast.makeText(MainActivity.this, "The sum is " + result, Toast.LENGTH_SHORT).show();

            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Integer.parseInt(edtFirst.getText().toString());
                second = Integer.parseInt(edtSecond.getText().toString());
                third = Integer.parseInt(edtThird.getText().toString());
                fourth = Integer.parseInt(edtFourth.getText().toString());

                result = first - second - third - fourth;
                Toast.makeText(MainActivity.this, "The result is " + result, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
