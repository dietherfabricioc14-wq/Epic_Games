package com.example.atividadefabri;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        View btnBack = findViewById(R.id.btn_back_profile);
        if (btnBack != null) {
            btnBack.setOnClickListener(v -> finish());
        }
    }
}