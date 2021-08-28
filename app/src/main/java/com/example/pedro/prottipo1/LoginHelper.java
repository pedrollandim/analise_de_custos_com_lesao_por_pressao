package com.example.pedro.prottipo1;

import android.widget.EditText;

import com.example.pedro.prottipo1.modelo.Enfermeiro;
import com.example.pedro.prottipo1.modelo.Paciente;

public class LoginHelper {

    private final EditText campo_login_nome;
    private final EditText campo_login_coren;
    private final EditText campo_login_senha;

    private Enfermeiro enfermeiro;


    public LoginHelper(LoginActivity loginActivity){
        //dica aperta alt+enter depois creadt field para criar a variavel
        campo_login_nome= (EditText)  loginActivity.findViewById(R.id.login_nome);
        campo_login_senha   = (EditText) loginActivity.findViewById(R.id.login_senha);
        campo_login_coren= (EditText) loginActivity.findViewById(R.id.login_coren);
        enfermeiro = new Enfermeiro();
    }

    public Enfermeiro pegaEnfermeiro2(){
        enfermeiro.setNome(campo_login_nome.getText().toString());
        enfermeiro.setSenha(campo_login_senha.getText().toString());
        enfermeiro.setCoren(campo_login_coren.getText().toString());
        return enfermeiro;
    }

    public void preencheFormulario2(Enfermeiro enfermeiro) {
        campo_login_nome.setText(enfermeiro.getNome());
        campo_login_senha.setText(enfermeiro.getSenha());
        campo_login_coren.setText(enfermeiro.getCoren());
        this.enfermeiro = enfermeiro;
    }

}
