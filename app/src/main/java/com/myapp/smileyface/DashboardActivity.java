package com.myapp.smileyface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSum, btnTemperature, btnSI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnSum = findViewById(R.id.btnSum);
        btnTemperature = findViewById(R.id.btnTemp);
        btnSI = findViewById(R.id.btnSI);

        btnSum.setOnClickListener(this);
        btnTemperature.setOnClickListener(this);
        btnSI.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnSum) {
            Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.btnTemp) {
            Intent intentemp = new Intent(DashboardActivity.this, TemperatureActivity.class);
            startActivity(intentemp);
        }
        else if (v.getId() == R.id.btnSI) {
            Intent intentSI = new Intent(DashboardActivity.this, SimpleInterestActivity.class);
            startActivity(intentSI);
        }
    }
}
