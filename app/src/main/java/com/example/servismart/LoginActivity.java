package com.example.servismart;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText txtNomorHP;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        txtNomorHP = findViewById(R.id.txtNomorHP);
        Button btnLanjutkan = findViewById(R.id.btnLanjutkan);
        TextView txtDaftar = findViewById(R.id.txtDaftar);

        txtDaftar.setOnClickListener(new View.OnClickListener() {
        btnLanjutkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}

