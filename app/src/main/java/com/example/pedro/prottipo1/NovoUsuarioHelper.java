package com.example.pedro.prottipo1;

import android.widget.EditText;

import com.example.pedro.prottipo1.modelo.Enfermeiro;

public class NovoUsuarioHelper {

    private final EditText campoNomeEnfermeiro;
    private final EditText campoCoren;
    private final EditText campoSenha;


    public NovoUsuarioHelper(NovoUsuarioActivity novoUsuarioActivity){
        //dica aperta alt+enter depois creadt field para criar a variavel
        campoNomeEnfermeiro = (EditText) novoUsuarioActivity.findViewById(R.id.novo_usuario_nome);
        campoCoren   = (EditText) novoUsuarioActivity.findViewById(R.id.novo_usuario_coren);
        campoSenha = (EditText) novoUsuarioActivity.findViewById(R.id.novo_usuario_senha);
    }


    public Enfermeiro pegaEnfermeiro(){
        Enfermeiro enfermeiro = new Enfermeiro();
        enfermeiro.setNome(campoNomeEnfermeiro.getText().toString());
        enfermeiro.setCoren(campoCoren.getText().toString());
        enfermeiro.setSenha(campoSenha.getText().toString());
        return enfermeiro;
    }


}
