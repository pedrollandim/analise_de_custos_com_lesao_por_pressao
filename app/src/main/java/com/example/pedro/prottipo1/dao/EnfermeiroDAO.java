package com.example.pedro.prottipo1.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.NonNull;

import com.example.pedro.prottipo1.modelo.Enfermeiro;

import java.util.ArrayList;
import java.util.List;

public class EnfermeiroDAO extends SQLiteOpenHelper {

    public EnfermeiroDAO(Context context) {

        super(context, "AgendaDeEnfermeiros", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Enfermeiros (id INTEGER PRIMARY KEY, nome TEXT NOT NULL, coren TEXT NOT NULL, senha TEXT NOT NULL);";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Enfermeiros";
        db.execSQL(sql);
        onCreate(db);
    }

    public void insereEnfermeiro(Enfermeiro enfermeiro) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues dados = pegaDadosDoEnfermeiro(enfermeiro);
        db.insert("Enfermeiros", null,dados);
    }

    @NonNull
    private ContentValues pegaDadosDoEnfermeiro(Enfermeiro enfermeiro) {
        ContentValues dados = new ContentValues();
        dados.put("nome",enfermeiro.getNome());
        dados.put("coren",enfermeiro.getCoren());
        dados.put("senha",enfermeiro.getSenha());
        return dados;
    }


    public List<Enfermeiro> buscaEnfermeiro() {
        String sql = "SELECT * from Enfermeiros;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);

        List<Enfermeiro> enfermeiros = new ArrayList<>();
        while(c.moveToNext()){
            Enfermeiro enfermeiro= new Enfermeiro();
            enfermeiro.setId(c.getLong(c.getColumnIndex("id")));
            enfermeiro.setNome(c.getString(c.getColumnIndex("nome")));
            enfermeiro.setCoren(c.getString(c.getColumnIndex("coren")));
            enfermeiro.setSenha(c.getString(c.getColumnIndex("senha")));
            enfermeiros.add(enfermeiro);
        }
        c.close();
        return enfermeiros;
    }

    public void deletaEnfermeiro(Enfermeiro enfermeiro) {
        SQLiteDatabase db = getWritableDatabase();
        String[] params = {String.valueOf(enfermeiro.getId())};
        db.delete("Enfermeiros","id = ?",params);
    }

    public void alteraEnfermeiro(Enfermeiro enfermeiro) {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues dados = pegaDadosDoEnfermeiro(enfermeiro);
        String[] params ={String.valueOf(enfermeiro.getId())};

        db.update("Enfermeiros",dados,"id = ?",params);

    }


    public String verificarEnfermeiro(String nome, String coren, String senha) {
        String sql = "SELECT * FROM Enfermeiros;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql,null);
        String nome1;
        String coren1;
        String senha1;
        while (c.moveToNext()){
        nome1 = c.getString(c.getColumnIndex("nome"));
        coren1 = c.getString(c.getColumnIndex("coren"));
        senha1 = c.getString(c.getColumnIndex("senha"));
        if (nome.equals(nome1)){
            if (coren.equals(coren1)){
                if (senha.equals(senha1)){
                    return "usuariocadastrado";
                }
            }
        }
        }
        return  "usuarionaocadastrado";
    }
}
