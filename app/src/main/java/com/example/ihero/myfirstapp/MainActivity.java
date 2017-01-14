package com.example.ihero.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.UnderlineSpan;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email, password;
    TextView reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = (Button) findViewById(R.id.bLogin);
        email = (EditText) findViewById(R.id.etEmail);
        password = (EditText) findViewById(R.id.etPassword);
        reg = (TextView) findViewById(R.id.tRegister);
        SpannableString content = new SpannableString("Register");
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
        reg.setText(content);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String em = email.getText().toString();
                String ps = password.getText().toString();

                Toast.makeText(MainActivity.this,"Hi "+em,Toast.LENGTH_SHORT).show();

                startActivity(new Intent(MainActivity.this,MainForm.class));

            }
        });

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Register",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,Register.class));
            }
        });

    }
}
