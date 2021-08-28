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

public class LoginDAO extends SQLiteOpenHelper {



    public LoginDAO(Context context) {

        super(context, "VerificacaoDeEnfermeiro", null, 1);
        //super(context, "AgendaDeEnfermeiros", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Enfermeiro (id INTEGER PRIMARY KEY, nome TEXT NOT NULL, coren TEXT NOT NULL, senha TEXT NOT NULL);";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Enfermeiro";
        db.execSQL(sql);
        onCreate(db);
    }

    public void insereEnfermeiro2(Enfermeiro enfermeiro) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues dados = pegaDadosDoEnfermeiro2(enfermeiro);
        db.insert("Enfermeiro", null,dados);
    }

    @NonNull
    private ContentValues pegaDadosDoEnfermeiro2(Enfermeiro enfermeiro) {
        ContentValues dados = new ContentValues();
        dados.put("nome",enfermeiro.getNome());
        dados.put("coren",enfermeiro.getCoren());
        dados.put("senha",enfermeiro.getSenha());
        return dados;
    }


    public List<Enfermeiro> buscaEnfermeiro2() {
        String sql = "SELECT * from Enfermeiro;";
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

    public String buscaCOREN() {
        String sql = "SELECT * from Enfermeiro;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);
        String coren = null;
        while(c.moveToNext()){
            Enfermeiro enfermeiro= new Enfermeiro();
            //enfermeiro.setId(c.getLong(c.getColumnIndex("id")));
            //enfermeiro.setNome(c.getString(c.getColumnIndex("nome")));
            enfermeiro.setCoren(c.getString(c.getColumnIndex("coren")));
            coren = enfermeiro.getCoren();
            //enfermeiro.setSenha(c.getString(c.getColumnIndex("senha")));
        }
        c.close();
        return coren;
    }

    public String buscaNOME() {
        String sql = "SELECT * from Enfermeiro;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);
        String nome = null;
        while(c.moveToNext()){
            Enfermeiro enfermeiro= new Enfermeiro();
            enfermeiro.setNome(c.getString(c.getColumnIndex("nome")));
            nome = enfermeiro.getNome();
        }
        c.close();
        return nome;
    }

    public void deletaEnfermeiro2() {
        SQLiteDatabase db = getWritableDatabase();
        long aux = 1;
        while (aux<1000) {
            String[] params = {String.valueOf(aux)};
            db.delete("Enfermeiro", "id = ?", params);
            aux++;
        }
    }

    public void alteraEnfermeiro2(Enfermeiro enfermeiro) {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues dados = pegaDadosDoEnfermeiro2(enfermeiro);
        String[] params ={String.valueOf(enfermeiro.getId())};

        db.update("Enfermeiro",dados,"id = ?",params);

    }


    public String verificarEnfermeiro2(String nome, String coren, String senha) {
        String sql = "SELECT * FROM Enfermeiro;";
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
