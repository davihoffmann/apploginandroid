package br.com.davihoffmann.apploginandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button botaoLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        botaoLogin = findViewById(R.id.botaoLoginID);

        botaoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText textoLogin = findViewById(R.id.editTextLoginID);
                EditText textoSenha = findViewById(R.id.editTextSenhaID);

                String resultadoLogin = textoLogin.getText().toString();
                String resultadoLoginSenha = textoSenha.getText().toString();

                Log.d("teste", "Login: " +resultadoLogin);
                Log.d("teste", "Senha: " +resultadoLoginSenha);

                if("admin".equals(resultadoLogin) && "123456".equals(resultadoLoginSenha)){
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();
                } else {
                    Log.d("Atenção", "Erro ao fazer Login");
                    Toast.makeText(getApplicationContext(), "Usuário ou Senha Invalidos!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
