package com.cookandroid.adn0721_05_gride;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLogin, btnDelete;
    EditText edtId, edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("유예영");
        btnLogin = findViewById(R.id.btnLogin);
        btnDelete = findViewById(R.id.btnDelete);
        edtId = findViewById(R.id.edtId);
        edtPassword = findViewById(R.id.edtPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "아이디 : " + edtId.getText().toString() + " 비밀번호 " + edtPassword.getText().toString();
                Toast.makeText(getApplicationContext(),str)
            }
        });
    }
}