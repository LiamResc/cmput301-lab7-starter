package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView cityText = findViewById(R.id.text_city_name);
        Button backBtn = findViewById(R.id.button_back);

        String city = getIntent().getStringExtra("CITY_NAME");
        if (city != null) {
            cityText.setText(city);
        }

        backBtn.setOnClickListener(v -> finish());
    }
}
