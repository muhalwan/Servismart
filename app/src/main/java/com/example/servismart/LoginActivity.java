package com.example.servismart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText txtNomorHP = findViewById(R.id.txtNomorHP);
        Button btnLanjutkan = findViewById(R.id.btnLanjutkan);
        TextView txtDaftar = findViewById(R.id.btnDaftar);

        txtDaftar.setOnClickListener(operasi);
        btnLanjutkan.setOnClickListener(operasi);
    }

        View.OnClickListener operasi = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    /*case R.id.btnLanjutkan:
                        bukaVerifikasi();
                        break;*/
                    case R.id.btnLanjutkan:
                        bukaHome();
                        break;
                    case R.id.btnDaftar:
                        bukaDaftar();
                        break;
                }
            }
        };

        /*void bukaVerifikasi() {
            Intent i = new Intent(LoginActivity.this, VerifikasiActivity.class);
            i.putExtra("nomorHP", txtNomorHP.getText().toString());
           startActivityForResult(i, 0);
        }*/

        void bukaDaftar() {
            Intent i = new Intent(getBaseContext(), signup.class);
            startActivityForResult(i, 0);
        }

        void bukaHome() {
            Intent i = new Intent(getBaseContext(), Home.class);
            startActivityForResult(i, 0);
        }
    }


