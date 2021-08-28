package com.example.pedro.prottipo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pedro.prottipo1.dao.EnfermeiroDAO;
import com.example.pedro.prottipo1.dao.LoginDAO;
import com.example.pedro.prottipo1.dao.PacienteDAO;
import com.example.pedro.prottipo1.modelo.Enfermeiro;
import com.example.pedro.prottipo1.modelo.Paciente;

import java.util.List;

public class LoginActivity extends AppCompatActivity {

    private LoginHelper ajudaLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ajudaLogin = new LoginHelper(LoginActivity.this);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        Button loginEfetuado = (Button)findViewById(R.id.login_login);
        loginEfetuado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDeMudarDeTela = new Intent(LoginActivity.this,MenuActivity.class);
                EnfermeiroDAO dao = new EnfermeiroDAO(LoginActivity.this);
                Enfermeiro enfermeiro = ajudaLogin.pegaEnfermeiro2();
                LoginDAO daologin = new LoginDAO(LoginActivity.this);


                daologin.deletaEnfermeiro2();
                daologin.insereEnfermeiro2(enfermeiro);
                daologin.close();

                EditText campoNome = (EditText)findViewById(R.id.login_nome);
                EditText campoCoren = (EditText)findViewById(R.id.login_coren);
                EditText campoSenha = (EditText)findViewById(R.id.login_senha);

                String confirmacaoDeEnfermeiro = dao.verificarEnfermeiro(campoNome.getText().toString(),campoCoren.getText().toString(),campoSenha.getText().toString());
                dao.close();

                if ( confirmacaoDeEnfermeiro.equals("usuariocadastrado") ){
                    Toast.makeText(LoginActivity.this,"Login efetuado",Toast.LENGTH_LONG).show();
                    startActivity(intentDeMudarDeTela);
                }
                if (confirmacaoDeEnfermeiro.equals("usuarionaocadastrado")){
                    //Toast.makeText(LoginActivity.this,"Enfermeiro "+ enfermeiro.getNome() +" Salvo.",Toast.LENGTH_LONG).show();
                    Toast.makeText(LoginActivity.this,"Paciente nao cadastrado",Toast.LENGTH_LONG).show();
                }

            }
        });

        Button novoEnfermeiro = (Button)findViewById(R.id.login_novo_usuario);
        novoEnfermeiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaTelaNovoEnfermeiro = new Intent(LoginActivity.this,NovoUsuarioActivity.class);
                startActivity(irParaTelaNovoEnfermeiro);
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}
