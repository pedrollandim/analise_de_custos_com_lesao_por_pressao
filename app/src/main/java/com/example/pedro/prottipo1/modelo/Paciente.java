package com.example.pedro.prottipo1.modelo;

import android.app.Application;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.io.Serializable;

public class Paciente extends Application implements Serializable{


    private long id;
    private String nome;
    private String telefone;
    private String email;
    private String sexo;
    private String datadenascimento;
    private String corenPA;
    private String nomeEnfermeiro;
    private String instituicao;
    private String localizazaolp;
    private String estagiolp;
    private Spinner sexosp;

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public SpinnerAdapter getSexoSP() {
        return (SpinnerAdapter) sexosp;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(String datadenascimento) {
        this.datadenascimento = datadenascimento;
    }
    public String getCorenPA() { return corenPA; }

    public void setCorenPA(String corenPA) { this.corenPA = corenPA; }

    public String getNomeEnfermeiro() { return nomeEnfermeiro; }

    public void setNomeEnfermeiro(String nomeEnfermeiro) { this.nomeEnfermeiro = nomeEnfermeiro;}

    public String getInstituicao() { return instituicao; }

    public void setInstituicao(String instituicao) { this.instituicao = instituicao; }

    public String getLocalizazaolp() { return localizazaolp; }

    public void setLocalizazaolp(String localizazaolp) { this.localizazaolp = localizazaolp; }

    public String getEstagiolp() {  return estagiolp;  }

    public void setEstagiolp(String estagiolp) { this.estagiolp = estagiolp; }

    String quantidadeLP;
    String riscobraden;

    public String getRiscobraden() {
        return riscobraden;
    }

    public void setRiscobraden(String riscobraden) {
        this.riscobraden = riscobraden;
    }

    public String getQuantidadeLP() {
        return quantidadeLP;
    }

    public void setQuantidadeLP(String quantidadeLP) {
        this.quantidadeLP = quantidadeLP;
    }

    @Override
    public String toString() {
        //return getId() + " - " + getNome() + " - Enfermeiro Responsavel: "+getNomeEnfermeiro();
        return "-> Paciente: " + getNome() + " |Profissional responsável: "+getNomeEnfermeiro() +" "+ getSexo()+" - TIPO: "+getEstagiolp()+" - "+ getDatadenascimento()+" Risco: "+getRiscobraden();
    }


}
