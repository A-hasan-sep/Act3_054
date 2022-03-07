package com.pam.constraintlayout054;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityHasil extends AppCompatActivity {
    //mendeklarasikan variable dengga tipe data TextView
    TextView txEmail, txpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        //menghubungkan variable txEmail dan txPassword dengan komponen TextView pada layout
        txEmail = findViewById(R.id.tvEmail);
        txpassword = findViewById(R.id.tvPassword);

        //membuat objek bundle dan mengambil data yang dikirimkan dari activity sebelumnya
        Bundle bundle = getIntent().getExtras();

        //membuat variable string yang digunakan untuk menyimpan data yang dikirim dari activity sebelumnya dengan kunci "nm" dan "pw"
        String email = bundle.getString("nm");
        String pass = bundle.getString("pw");

        //menampilkan value dari variable email dan pass kedalam txEmail dan txPassword
        txEmail.setText(email);
        txpassword.setText(pass);
    }
}