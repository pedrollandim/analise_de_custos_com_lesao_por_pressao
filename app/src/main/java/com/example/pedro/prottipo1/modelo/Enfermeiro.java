package com.example.pedro.prottipo1.modelo;

import java.io.Serializable;

public class Enfermeiro implements Serializable {
    private long id;
    private String nome;
    private String coren;
    private String senha;

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public String getSenha() { return senha; }

    public void setSenha(String senha) { this.senha = senha; }

}
