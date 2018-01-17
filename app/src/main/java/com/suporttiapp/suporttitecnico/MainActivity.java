package com.suporttiapp.suporttitecnico;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String PREFER_NAME = "Ref";
    private static final String SENHA_ACESSO = "senha";

    private EditText senha;
    private Button btLogin;
    private Button btActCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        senha = findViewById(R.id.senha);
        btLogin = findViewById(R.id.login_enviar);

        logar();
        cadastrarTecnico();

    }

    private void logar() {
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // requisição ao servidor, encontrar a chave e retorna o técnico.



                SharedPreferences preferences = getSharedPreferences(PREFER_NAME, Context.MODE_PRIVATE);
                String sSalva = preferences.getString(SENHA_ACESSO, "");
                if (sSalva != null){
                    if (sSalva.equals(senha.getText().toString())){
                        // iniciar seção e ir para outra atividade
                        Intent intent = new Intent(MainActivity.this, TelaInicial.class);
                        startActivity(intent);
                    }

                }else {
                    Toast toast = Toast.makeText(getApplicationContext(), R.string.ERR_SENHA_NAO_CADASTRADA, Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });
    }

    public void cadastrarTecnico(){
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
