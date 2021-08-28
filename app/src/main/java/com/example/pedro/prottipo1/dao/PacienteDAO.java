package com.example.pedro.prottipo1.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.NonNull;
import android.text.InputFilter;

import com.example.pedro.prottipo1.LoginActivity;
import com.example.pedro.prottipo1.modelo.Enfermeiro;
import com.example.pedro.prottipo1.modelo.Paciente;

import java.util.ArrayList;
import java.util.List;

public class PacienteDAO extends SQLiteOpenHelper {
    public PacienteDAO(Context context) {

        super(context, "Agenda", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Pacientes (id INTEGER PRIMARY KEY, nome TEXT NOT NULL, telefone TEXT," +
                "email TEXT, sexo TEXT, datadenascimento TEXT,coren TEXT, enfermeiropa TEXT,instituicao TEXT," +
                "localizazaolp TEXT,estagiolp TEXT,quantidadeLP TEXT,riscobraden TEXT);";

        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Pacientes";
        db.execSQL(sql);
        onCreate(db);
    }

    public void insere(Paciente paciente) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues dados = pegaDadosDoPaciente(paciente);
        db.insert("Pacientes", null,dados);
    }

    @NonNull
    private ContentValues pegaDadosDoPaciente(Paciente paciente) {
        ContentValues dados = new ContentValues();
        dados.put("nome",paciente.getNome());
        dados.put("telefone",paciente.getTelefone());
        dados.put("email",paciente.getEmail());
        dados.put("sexo",paciente.getSexo());
        dados.put("datadenascimento",paciente.getDatadenascimento());
        dados.put("coren",paciente.getCorenPA());
        dados.put("enfermeiropa",paciente.getNomeEnfermeiro());
        dados.put("instituicao",paciente.getInstituicao());
        dados.put("localizazaolp",paciente.getLocalizazaolp());
        dados.put("estagiolp",paciente.getEstagiolp());
        dados.put("quantidadeLP",paciente.getQuantidadeLP());
        dados.put("riscobraden",paciente.getRiscobraden());

        return dados;
    }


    public List<Paciente> buscaPacientes() {
        String sql = "SELECT * from Pacientes;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);

        List<Paciente> pacientes = new ArrayList<>();
        while(c.moveToNext()){
            Paciente paciente= new Paciente();
            paciente.setId(c.getLong(c.getColumnIndex("id")));
            paciente.setNome(c.getString(c.getColumnIndex("nome")));
            paciente.setTelefone(c.getString(c.getColumnIndex("telefone")));
            paciente.setEmail(c.getString(c.getColumnIndex("email")));
            paciente.setSexo(c.getString(c.getColumnIndex("sexo")));
            paciente.setDatadenascimento(c.getString(c.getColumnIndex("datadenascimento")));
            paciente.setCorenPA(c.getString(c.getColumnIndex("coren")));
            paciente.setNomeEnfermeiro(c.getString(c.getColumnIndex("enfermeiropa")));
            paciente.setInstituicao(c.getString(c.getColumnIndex("instituicao")));
            paciente.setLocalizazaolp(c.getString(c.getColumnIndex("localizazaolp")));
            paciente.setEstagiolp(c.getString(c.getColumnIndex("estagiolp")));
            paciente.setQuantidadeLP(c.getString(c.getColumnIndex("quantidadeLP")));
            paciente.setRiscobraden(c.getString(c.getColumnIndex("riscobraden")));
            //paciente.setQuantidadeLP(c.getInt(c.getColumnIndex("quantidadeLP")));
            pacientes.add(paciente);
        }
        c.close();
        return pacientes;
    }


    /////////////////////

    public List<Paciente> buscaPacientesCOREN(String corenAUX) {
        String sql = "SELECT * from Pacientes;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);


        List<Paciente> pacientes = new ArrayList<>();

        while(c.moveToNext()){

            Paciente paciente= new Paciente();
            paciente.setCorenPA(c.getString(c.getColumnIndex("coren")));
            if (paciente.getCorenPA().equals(corenAUX)){
                paciente.setId(c.getLong(c.getColumnIndex("id")));
                paciente.setNome(c.getString(c.getColumnIndex("nome")));
                paciente.setTelefone(c.getString(c.getColumnIndex("telefone")));
                paciente.setEmail(c.getString(c.getColumnIndex("email")));
                paciente.setSexo(c.getString(c.getColumnIndex("sexo")));
                paciente.setDatadenascimento(c.getString(c.getColumnIndex("datadenascimento")));
                paciente.setCorenPA(c.getString(c.getColumnIndex("coren")));
                paciente.setNomeEnfermeiro(c.getString(c.getColumnIndex("enfermeiropa")));
                paciente.setInstituicao(c.getString(c.getColumnIndex("instituicao")));
                paciente.setLocalizazaolp(c.getString(c.getColumnIndex("localizazaolp")));
                paciente.setEstagiolp(c.getString(c.getColumnIndex("estagiolp")));
                paciente.setQuantidadeLP(c.getString(c.getColumnIndex("quantidadeLP")));
                paciente.setRiscobraden(c.getString(c.getColumnIndex("riscobraden")));
                //paciente.setQuantidadeLP(c.getInt(c.getColumnIndex("quantidadeLP")));
                pacientes.add(paciente);
            }
        }
        c.close();
        return pacientes;
    }



    //////



    public void deletaPA(Paciente paciente) {
        SQLiteDatabase db = getWritableDatabase();
        String[] params = {String.valueOf(paciente.getId())};
        db.delete("Pacientes","id = ?",params);
    }
    public void deletaPAll() {

        SQLiteDatabase db = getWritableDatabase();
        long aux = 1;
        while (aux<1000) {
            String[] params = {String.valueOf(aux)};
            db.delete("Pacientes", "id = ?", params);
            aux++;
        }
    }

    public void altera(Paciente paciente) {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues dados = pegaDadosDoPaciente(paciente);
        String[] params ={String.valueOf(paciente.getId())};

        db.update("Pacientes",dados,"id = ?",params);

    }

}
