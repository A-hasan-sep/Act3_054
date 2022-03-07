package com.pam.constraintlayout054;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;

    EditText edemail, edpassword;

    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btSignin);
        edemail=findViewById(R.id.edEmail);
        edpassword=findViewById(R.id.edPassword);

        //membuat fungsi onclik pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menyimpan input user di edittext email dan password kedalam variabel nama dan password
                nama =  edemail.getText().toString();
                password = edpassword.getText().toString();

                //mengeset email dan password yang benar
                String email = "ASEP";
                String pass = "hasan";

                //mengecek apakah isi dari email dan password sudah sama dengan email dan password yang sudah diset
                if (nama.equals(email) && password.equals(pass)){
                    //membuat variable toast dan menampilkan pesan "Login Sukses"
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login Sukses",
                            Toast.LENGTH_LONG);

                    //menampilkan toast
                    t.show();

                    //membuat objek bundle
                    Bundle b = new Bundle();

                    //memasukkan value dari variable nama dengan kunci "nm",sedangkan variable password dengan kunci "pw" dan dimasukkan kedalam bundle
                    b.putString("nm",nama.trim());
                    b.putString("pw",password.trim());

                    //membuat objek intent berpindah activity dari mainactivity ke ActivityHasil
                    Intent i = new Intent(getApplicationContext(), ActivityHasil.class);

                    //memasukkan bundle kedalam intent untuk dikirim ke ActivityHasil
                    i.putExtras(b);

                    //berpndah ke ActivityHasil
                    startActivity(i);
                }

                Toast t = Toast.makeText(getApplicationContext(),
                        "email anda: "+nama+" dan password anda: "+password+"", Toast.LENGTH_LONG);
                t.show();
            }
        });
    }
}