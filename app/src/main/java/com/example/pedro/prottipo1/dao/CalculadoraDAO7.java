package com.example.pedro.prottipo1.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.NonNull;

import com.example.pedro.prottipo1.modelo.Calculadora;

import java.util.ArrayList;
import java.util.List;


public class CalculadoraDAO7 extends SQLiteOpenHelper {


    public CalculadoraDAO7(Context context) {

        super(context, "planilha7", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Produtos7 (id INTEGER PRIMARY KEY,idPaciente INTEGER, paciente TEXT," +
                //"sfusado REAL,sfpreco REAL,sfquantidade REAL,sfcustodopaciente REAL,sfmediadecustodopaciente REAL,sfdias INTEGER,sfpreco1 REAL,sfquantidade1 REAL," +

                "protetorcutaneousado REAL,protetorcutaneoprecounitario REAL,protetorcutaneoquantidadegastanoperiodo REAL,protetorcutaneovalorgastonoperiodo REAL,protetorcutaneodias INTEGER,protetorcutaneoprecounitario1 REAL," +
                "gazeesterilusado REAL,gazeesterilprecounitario REAL,gazeesterilquantidadegastanoperiodo REAL,gazeesterilvalorgastonoperiodo REAL,gazeesterildias INTEGER,gazeesterilprecounitario1 REAL," +
                "gazenesterilusado REAL,gazenesterilprecounitario REAL,gazenesterilquantidadegastanoperiodo REAL,gazenesterilvalorgastonoperiodo REAL,gazenesterildias INTEGER,gazenesterilprecounitario1 REAL," +
                "atadurausado REAL,ataduraprecounitario REAL,ataduraquantidadegastanoperiodo REAL,ataduravalorgastonoperiodo REAL,ataduradias INTEGER,ataduraprecounitario1 REAL," +
                "fitaadesivausado REAL,fitaadesivaprecounitario REAL,fitaadesivaquantidadegastanoperiodo REAL,fitaadesivavalorgastonoperiodo REAL,fitaadesivadias INTEGER,fitaadesivaprecounitario1 REAL);";


        db.execSQL(sql);
    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Produtos7";
        db.execSQL(sql);
        onCreate(db);
    }

    public Calculadora insere(Calculadora calculadora) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues dados = pegaDadosDaCalculadora(calculadora);
        db.insert("Produtos7", null, dados);
        return calculadora;
    }

    @NonNull
    private ContentValues pegaDadosDaCalculadora(Calculadora calculadora) {
        ContentValues dados = new ContentValues();
        dados.put("paciente", calculadora.getPaciente());
        dados.put("idPaciente", calculadora.getIdPaciente());

        ///->protetorcutaneo
        dados.put("protetorcutaneousado", calculadora.getProtetorcutaneousado());
        dados.put("protetorcutaneoprecounitario", calculadora.getProtetorcutaneoprecounitario());
        dados.put("protetorcutaneoquantidadegastanoperiodo", calculadora.getProtetorcutaneoquantidadegastanoperiodo());
        dados.put("protetorcutaneovalorgastonoperiodo", calculadora.getProtetorcutaneovalorgastonoperiodo());
        dados.put("protetorcutaneodias", calculadora.getProtetorcutaneodias());
        dados.put("protetorcutaneoprecounitario1", calculadora.getProtetorcutaneoprecounitario1());


        ///->gazeesteril
        dados.put("gazeesterilusado", calculadora.getGazeesterilusado());
        dados.put("gazeesterilprecounitario", calculadora.getGazeesterilprecounitario());
        dados.put("gazeesterilquantidadegastanoperiodo", calculadora.getGazeesterilquantidadegastanoperiodo());
        dados.put("gazeesterilvalorgastonoperiodo", calculadora.getGazeesterilvalorgastonoperiodo());
        dados.put("gazeesterildias", calculadora.getGazeesterildias());
        dados.put("gazeesterilprecounitario1", calculadora.getGazeesterilprecounitario1());

        ///-> gazenesteril
        //"gazenesterilusado REAL,gazenesterilprecounitario REAL,gazenesterilquantidadegastanoperiodo REAL,gazenesterilvalorgastonoperiodo REAL,gazenesterildias INTEGER,gazenesterilprecounitario1 REAL," +
        dados.put("gazenesterilusado", calculadora.getGazenesterilusado());
        dados.put("gazenesterilprecounitario", calculadora.getGazenesterilprecounitario());
        dados.put("gazenesterilquantidadegastanoperiodo", calculadora.getGazenesterilquantidadegastanoperiodo());
        dados.put("gazenesterilvalorgastonoperiodo", calculadora.getGazenesterilvalorgastonoperiodo());
        dados.put("gazenesterildias", calculadora.getGazenesterildias());
        dados.put("gazenesterilprecounitario1", calculadora.getGazenesterilprecounitario1());



        ///-> atadura
        dados.put("atadurausado", calculadora.getAtadurausado());
        dados.put("ataduraprecounitario", calculadora.getAtaduraprecounitario());
        dados.put("ataduraquantidadegastanoperiodo", calculadora.getAtaduraquantidadegastanoperiodo());
        dados.put("ataduravalorgastonoperiodo", calculadora.getAtaduravalorgastonoperiodo());
        dados.put("ataduradias", calculadora.getAtaduradias());
        dados.put("ataduraprecounitario1", calculadora.getAtaduraprecounitario1());

        ///->fitaadesiva
        dados.put("fitaadesivausado", calculadora.getFitaadesivausado());
        dados.put("fitaadesivaprecounitario", calculadora.getFitaadesivaprecounitario());
        dados.put("fitaadesivaquantidadegastanoperiodo", calculadora.getFitaadesivaquantidadegastanoperiodo());
        dados.put("fitaadesivavalorgastonoperiodo", calculadora.getFitaadesivavalorgastonoperiodo());
        dados.put("fitaadesivadias", calculadora.getFitaadesivadias());
        dados.put("fitaadesivaprecounitario1", calculadora.getFitaadesivaprecounitario1());


        return dados;
    }





    //EXIBIR
    public List<Calculadora> exibir() {
        String sql = "SELECT * from Produtos7;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);
        List<Calculadora> dados = new ArrayList<>();
        while (c.moveToNext()) {

            Calculadora calculadora = new Calculadora();
            if (c.getLong(c.getColumnIndex("id")) != 0) {
                calculadora.setIdCalculadora(c.getLong(c.getColumnIndex("id")));
                calculadora.setIdPaciente(c.getLong(c.getColumnIndex("idPaciente")));
                calculadora.setPaciente(c.getString(c.getColumnIndex("paciente")));

                ///->protetorcutaneo
                calculadora.setProtetorcutaneousado(c.getFloat(c.getColumnIndex("protetorcutaneousado")));
                calculadora.setProtetorcutaneoprecounitario(c.getFloat(c.getColumnIndex("protetorcutaneoprecounitario")));
                calculadora.setProtetorcutaneoquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("protetorcutaneoquantidadegastanoperiodo")));
                calculadora.setProtetorcutaneovalorgastonoperiodo(c.getFloat(c.getColumnIndex("protetorcutaneovalorgastonoperiodo")));
                calculadora.setProtetorcutaneodias(c.getInt(c.getColumnIndex("protetorcutaneodias")));
                calculadora.setProtetorcutaneoprecounitario1(c.getFloat(c.getColumnIndex("protetorcutaneoprecounitario1")));

                ///->gazeesteril
                calculadora.setGazeesterilusado(c.getFloat(c.getColumnIndex("gazeesterilusado")));
                calculadora.setGazeesterilprecounitario(c.getFloat(c.getColumnIndex("gazeesterilprecounitario")));
                calculadora.setGazeesterilquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("gazeesterilquantidadegastanoperiodo")));
                calculadora.setGazeesterilvalorgastonoperiodo(c.getFloat(c.getColumnIndex("gazeesterilvalorgastonoperiodo")));
                calculadora.setGazeesterildias(c.getInt(c.getColumnIndex("gazeesterildias")));
                calculadora.setGazeesterilprecounitario1(c.getFloat(c.getColumnIndex("gazeesterilprecounitario1")));


                ///->gazenesteril
                calculadora.setGazenesterilusado(c.getFloat(c.getColumnIndex("gazenesterilusado")));
                calculadora.setGazenesterilprecounitario(c.getFloat(c.getColumnIndex("gazenesterilprecounitario")));
                calculadora.setGazenesterilquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("gazenesterilquantidadegastanoperiodo")));
                calculadora.setGazenesterilvalorgastonoperiodo(c.getFloat(c.getColumnIndex("gazenesterilvalorgastonoperiodo")));
                calculadora.setGazenesterildias(c.getInt(c.getColumnIndex("gazenesterildias")));
                calculadora.setGazenesterilprecounitario1(c.getFloat(c.getColumnIndex("gazenesterilprecounitario1")));

                ///->atadura
                calculadora.setAtadurausado(c.getFloat(c.getColumnIndex("atadurausado")));
                calculadora.setAtaduraprecounitario(c.getFloat(c.getColumnIndex("ataduraprecounitario")));
                calculadora.setAtaduraquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("ataduraquantidadegastanoperiodo")));
                calculadora.setAtaduravalorgastonoperiodo(c.getFloat(c.getColumnIndex("ataduravalorgastonoperiodo")));
                calculadora.setAtaduradias(c.getInt(c.getColumnIndex("ataduradias")));
                calculadora.setAtaduraprecounitario1(c.getFloat(c.getColumnIndex("ataduraprecounitario1")));

                ///->fitaadesiva
                calculadora.setFitaadesivausado(c.getFloat(c.getColumnIndex("fitaadesivausado")));
                calculadora.setFitaadesivaprecounitario(c.getFloat(c.getColumnIndex("fitaadesivaprecounitario")));
                calculadora.setFitaadesivaquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("fitaadesivaquantidadegastanoperiodo")));
                calculadora.setFitaadesivavalorgastonoperiodo(c.getFloat(c.getColumnIndex("fitaadesivavalorgastonoperiodo")));
                calculadora.setFitaadesivadias(c.getInt(c.getColumnIndex("fitaadesivadias")));
                calculadora.setFitaadesivaprecounitario1(c.getFloat(c.getColumnIndex("fitaadesivaprecounitario1")));


                dados.add(calculadora);
            }

        }
        c.close();
        return dados;
    }


    public void atualizaPaciente(Calculadora calculadora) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues dados = pegaDadosDaCalculadora(calculadora);
        String[] params = { String.valueOf(calculadora.getIdPaciente()) };
        db.update("Produtos7", dados, "idPaciente = ?", params);
    }



    public Calculadora buscaPacientesComCalculadora(Calculadora calculadora) {
        String sql = "SELECT * from Produtos7;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);

        while (c.moveToNext()) {
            if (calculadora.getIdPaciente() == c.getLong(c.getColumnIndex("idPaciente"))) {

                calculadora.setIdCalculadora(c.getLong(c.getColumnIndex("id")));
                calculadora.setIdPaciente(c.getLong(c.getColumnIndex("idPaciente")));
                calculadora.setPaciente(c.getString(c.getColumnIndex("paciente")));

                ///->protetorcutaneo
                calculadora.setProtetorcutaneousado(c.getFloat(c.getColumnIndex("protetorcutaneousado")));
                calculadora.setProtetorcutaneoprecounitario(c.getFloat(c.getColumnIndex("protetorcutaneoprecounitario")));
                calculadora.setProtetorcutaneoquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("protetorcutaneoquantidadegastanoperiodo")));
                calculadora.setProtetorcutaneovalorgastonoperiodo(c.getFloat(c.getColumnIndex("protetorcutaneovalorgastonoperiodo")));
                calculadora.setProtetorcutaneodias(c.getInt(c.getColumnIndex("protetorcutaneodias")));
                calculadora.setProtetorcutaneoprecounitario1(c.getFloat(c.getColumnIndex("protetorcutaneoprecounitario1")));

                ///->gazeesteril
                calculadora.setGazeesterilusado(c.getFloat(c.getColumnIndex("gazeesterilusado")));
                calculadora.setGazeesterilprecounitario(c.getFloat(c.getColumnIndex("gazeesterilprecounitario")));
                calculadora.setGazeesterilquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("gazeesterilquantidadegastanoperiodo")));
                calculadora.setGazeesterilvalorgastonoperiodo(c.getFloat(c.getColumnIndex("gazeesterilvalorgastonoperiodo")));
                calculadora.setGazeesterildias(c.getInt(c.getColumnIndex("gazeesterildias")));
                calculadora.setGazeesterilprecounitario1(c.getFloat(c.getColumnIndex("gazeesterilprecounitario1")));


                ///->gazenesteril
                calculadora.setGazenesterilusado(c.getFloat(c.getColumnIndex("gazenesterilusado")));
                calculadora.setGazenesterilprecounitario(c.getFloat(c.getColumnIndex("gazenesterilprecounitario")));
                calculadora.setGazenesterilquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("gazenesterilquantidadegastanoperiodo")));
                calculadora.setGazenesterilvalorgastonoperiodo(c.getFloat(c.getColumnIndex("gazenesterilvalorgastonoperiodo")));
                calculadora.setGazenesterildias(c.getInt(c.getColumnIndex("gazenesterildias")));
                calculadora.setGazenesterilprecounitario1(c.getFloat(c.getColumnIndex("gazenesterilprecounitario1")));

                ///->atadura
                calculadora.setAtadurausado(c.getFloat(c.getColumnIndex("atadurausado")));
                calculadora.setAtaduraprecounitario(c.getFloat(c.getColumnIndex("ataduraprecounitario")));
                calculadora.setAtaduraquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("ataduraquantidadegastanoperiodo")));
                calculadora.setAtaduravalorgastonoperiodo(c.getFloat(c.getColumnIndex("ataduravalorgastonoperiodo")));
                calculadora.setAtaduradias(c.getInt(c.getColumnIndex("ataduradias")));
                calculadora.setAtaduraprecounitario1(c.getFloat(c.getColumnIndex("ataduraprecounitario1")));

                ///->fitaadesiva
                calculadora.setFitaadesivausado(c.getFloat(c.getColumnIndex("fitaadesivausado")));
                calculadora.setFitaadesivaprecounitario(c.getFloat(c.getColumnIndex("fitaadesivaprecounitario")));
                calculadora.setFitaadesivaquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("fitaadesivaquantidadegastanoperiodo")));
                calculadora.setFitaadesivavalorgastonoperiodo(c.getFloat(c.getColumnIndex("fitaadesivavalorgastonoperiodo")));
                calculadora.setFitaadesivadias(c.getInt(c.getColumnIndex("fitaadesivadias")));
                calculadora.setFitaadesivaprecounitario1(c.getFloat(c.getColumnIndex("fitaadesivaprecounitario1")));


            }
        }
        c.close();
        return calculadora;
    }

    public void atualizaTodosOsPrecosUnitarios() {
        String sql = "SELECT * FROM Produtos7 WHERE id = 1;";
        SQLiteDatabase banco = this.getWritableDatabase();
        Cursor cursor = banco.rawQuery(sql, null);
        cursor.moveToFirst();
        String preco = cursor.getString(cursor.getColumnIndex("sfprecounitario1"));

        up1(preco);
    }
    public void up1(String preco) {
        String sql = "SELECT * from Produtos7;";
        SQLiteDatabase db = getWritableDatabase();

        ContentValues dados = new ContentValues();
        dados.put("sfprecounitario1", preco);
        int aux = 1;
        while (aux < 100) {
            String[] params = { String.valueOf(aux) };
            db.update("Produtos7", dados, "id=?", params);
            aux = aux + 1;
        }
    }


    public void deletaPAResultados(Calculadora calculadora) {
        SQLiteDatabase db = getWritableDatabase();
        String[] params = { String.valueOf(calculadora.getIdCalculadora()) };
        db.delete("Produtos7", "id = ?", params);
    }
    public void deletaPAllResultados() {

        SQLiteDatabase db = getWritableDatabase();
        long aux = 1;
        while (aux < 1000) {
            String[] params = { String.valueOf(aux) };
            db.delete("Produtos7", "id = ?", params);
            aux++;
        }
    }
}


