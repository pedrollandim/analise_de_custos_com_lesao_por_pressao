package com.example.pedro.prottipo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pedro.prottipo1.dao.EnfermeiroDAO;
import com.example.pedro.prottipo1.dao.PacienteDAO;
import com.example.pedro.prottipo1.modelo.Enfermeiro;
import com.example.pedro.prottipo1.modelo.Paciente;

public class NovoUsuarioActivity extends AppCompatActivity {

    private NovoUsuarioHelper ajudaUSUARIO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_usuario);

        ajudaUSUARIO = new NovoUsuarioHelper(this);


        Button salvarNovoEnfermeiro = (Button)findViewById(R.id.novo_usuario_salvar);
        salvarNovoEnfermeiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText campoSenha1 = (EditText)findViewById(R.id.novo_usuario_senha);
                EditText campoSenha2 = (EditText)findViewById(R.id.novo_usuario_confirmar_senha);
                if(campoSenha1.getText().toString().equals(campoSenha2.getText().toString())){
                    Enfermeiro enfermeiro = ajudaUSUARIO.pegaEnfermeiro();
                    EnfermeiroDAO dao = new EnfermeiroDAO(NovoUsuarioActivity.this);
                    dao.insereEnfermeiro(enfermeiro);
                    dao.close();
                    Toast.makeText(NovoUsuarioActivity.this,"Cadastro efetuado",Toast.LENGTH_LONG).show();
                    finish();
                }
                if(!campoSenha1.getText().toString().equals(campoSenha2.getText().toString())){
                    Toast.makeText(NovoUsuarioActivity.this,"Senha incorreta",Toast.LENGTH_LONG).show();
                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflar = getMenuInflater();
        inflar.inflate(R.menu.menu_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.menu_menu_ok:
                EditText campoSenha1 = (EditText)findViewById(R.id.novo_usuario_senha);
                EditText campoSenha2 = (EditText)findViewById(R.id.novo_usuario_confirmar_senha);
                if(campoSenha1.getText().toString().equals(campoSenha2.getText().toString())){
                    Enfermeiro enfermeiro = ajudaUSUARIO.pegaEnfermeiro();
                    EnfermeiroDAO dao = new EnfermeiroDAO(NovoUsuarioActivity.this);
                    dao.insereEnfermeiro(enfermeiro);
                    dao.close();
                    Toast.makeText(NovoUsuarioActivity.this,"Cadastro efetuado",Toast.LENGTH_LONG).show();
                    finish();
                }
                if(!campoSenha1.getText().toString().equals(campoSenha2.getText().toString())){
                    Toast.makeText(NovoUsuarioActivity.this,"Senha incorreta ",Toast.LENGTH_LONG).show();
                }
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
