package com.example.servismart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button btnLanjutkan = findViewById(R.id.btnLanjutkan);

        btnLanjutkan.setOnClickListener(operasi);
    }

    View.OnClickListener operasi = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnLanjutkan:
                    bukaHome();
                    break;
            }
        }
    };

    void bukaHome() {
        Intent i = new Intent(getBaseContext(), Home.class);
        startActivityForResult(i, 0);
    }
}