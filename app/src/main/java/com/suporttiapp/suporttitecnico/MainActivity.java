package com.suporttiapp.suporttitecnico;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String NOME_PREFERENCE = "REFERENCIA_LOGIN_AUTOMATICO";

    private EditText senha;
    private Button btLogin;
    private Button btActCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        senha = findViewById(R.id.senha);
        btLogin = findViewById(R.id.login_enviar);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences(NOME_PREFERENCE, MODE_PRIVATE).edit();
                editor.putString("login", senha.getText().toString());
                editor.commit();
            }
        });

        btActCadastro = findViewById(R.id.btActCadastro);
        btActCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Registrar.class);
                startActivity(intent);
            }
        });

    }
}
