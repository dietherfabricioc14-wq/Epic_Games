package com.example.atividadefabri;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class LibraryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        View btnBack = findViewById(R.id.btn_back_library);
        if (btnBack != null) {
            btnBack.setOnClickListener(v -> finish());
        }
    }
}