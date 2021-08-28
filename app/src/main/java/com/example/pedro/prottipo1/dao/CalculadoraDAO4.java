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

public class CalculadoraDAO4 extends SQLiteOpenHelper {


    public CalculadoraDAO4(Context context) {

        super(context, "planilha4", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Produtos4 (id INTEGER PRIMARY KEY,idPaciente INTEGER, paciente TEXT," +
                //"sfusado REAL,sfpreco REAL,sfquantidade REAL,sfcustodopaciente REAL,sfmediadecustodopaciente REAL,sfdias INTEGER,sfpreco1 REAL,sfquantidade1 REAL," +

                "espumacombordasiliconeusado REAL,espumacombordasiliconeprecounitario REAL,espumacombordasiliconequantidadegastanoperiodo REAL,espumacombordasiliconevalorgastonoperiodo REAL,espumacombordasiliconedias INTEGER,espumacombordasiliconeprecounitario1 REAL," +
                "espumacombordasiliconepratausado REAL,espumacombordasiliconeprataprecounitario REAL,espumacombordasiliconeprataquantidadegastanoperiodo REAL,espumacombordasiliconepratavalorgastonoperiodo REAL,espumacombordasiliconepratadias INTEGER,espumacombordasiliconeprataprecounitario1 REAL," +
                "hidrofibrausado REAL,hidrofibraprecounitario REAL,hidrofibraquantidadegastanoperiodo REAL,hidrofibravalorgastonoperiodo REAL,hidrofibradias INTEGER,hidrofibraprecounitario1 REAL," +
                "hidrofibrapratausado REAL,hidrofibraprataprecounitario REAL,hidrofibraprataquantidadegastanoperiodo REAL,hidrofibrapratavalorgastonoperiodo REAL,hidrofibrapratadias INTEGER,hidrofibraprataprecounitario1 REAL," +
                "hidrogelbusado REAL,hidrogelbprecounitario REAL,hidrogelbquantidadegastanoperiodo REAL,hidrogelbvalorgastonoperiodo REAL,hidrogelbdias INTEGER,hidrogelbprecounitario1 REAL);";


        db.execSQL(sql);
    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Produtos4";
        db.execSQL(sql);
        onCreate(db);
    }

    public Calculadora insere(Calculadora calculadora) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues dados = pegaDadosDaCalculadora(calculadora);
        db.insert("Produtos4", null, dados);
        return calculadora;
    }

    @NonNull
    private ContentValues pegaDadosDaCalculadora(Calculadora calculadora) {
        ContentValues dados = new ContentValues();
        dados.put("paciente", calculadora.getPaciente());
        dados.put("idPaciente", calculadora.getIdPaciente());

        ///->espumacombordasilicone
        dados.put("espumacombordasiliconeusado", calculadora.getEspumacombordasiliconeusado());
        dados.put("espumacombordasiliconeprecounitario", calculadora.getEspumacombordasiliconeprecounitario());
        dados.put("espumacombordasiliconequantidadegastanoperiodo", calculadora.getEspumacombordasiliconequantidadegastanoperiodo());
        dados.put("espumacombordasiliconevalorgastonoperiodo", calculadora.getEspumacombordasiliconevalorgastonoperiodo());
        dados.put("espumacombordasiliconedias", calculadora.getEspumacombordasiliconedias());
        dados.put("espumacombordasiliconeprecounitario1", calculadora.getEspumacombordasiliconeprecounitario1());

        ///-> espumacombordasiliconeprata
        //"espumacombordasiliconepratausado REAL,espumacombordasiliconeprataprecounitario REAL,espumacombordasiliconeprataquantidadegastanoperiodo REAL,espumacombordasiliconepratavalorgastonoperiodo REAL,espumacombordasiliconepratadias INTEGER,espumacombordasiliconeprataprecounitario1 REAL," +
        dados.put("espumacombordasiliconepratausado", calculadora.getEspumacombordasiliconepratausado());
        dados.put("espumacombordasiliconeprataprecounitario", calculadora.getEspumacombordasiliconeprataprecounitario());
        dados.put("espumacombordasiliconeprataquantidadegastanoperiodo", calculadora.getEspumacombordasiliconeprataquantidadegastanoperiodo());
        dados.put("espumacombordasiliconepratavalorgastonoperiodo", calculadora.getEspumacombordasiliconepratavalorgastonoperiodo());
        dados.put("espumacombordasiliconepratadias", calculadora.getEspumacombordasiliconepratadias());
        dados.put("espumacombordasiliconeprataprecounitario1", calculadora.getEspumacombordasiliconeprataprecounitario1());



        ///-> hidrofibra
        dados.put("hidrofibrausado", calculadora.getHidrofibrausado());
        dados.put("hidrofibraprecounitario", calculadora.getHidrofibraprecounitario());
        dados.put("hidrofibraquantidadegastanoperiodo", calculadora.getHidrofibraquantidadegastanoperiodo());
        dados.put("hidrofibravalorgastonoperiodo", calculadora.getHidrofibravalorgastonoperiodo());
        dados.put("hidrofibradias", calculadora.getHidrofibradias());
        dados.put("hidrofibraprecounitario1", calculadora.getHidrofibraprecounitario1());

        ///->hidrofibraprata
        dados.put("hidrofibrapratausado", calculadora.getHidrofibrapratausado());
        dados.put("hidrofibraprataprecounitario", calculadora.getHidrofibraprataprecounitario());
        dados.put("hidrofibraprataquantidadegastanoperiodo", calculadora.getHidrofibraprataquantidadegastanoperiodo());
        dados.put("hidrofibrapratavalorgastonoperiodo", calculadora.getHidrofibrapratavalorgastonoperiodo());
        dados.put("hidrofibrapratadias", calculadora.getHidrofibrapratadias());
        dados.put("hidrofibraprataprecounitario1", calculadora.getHidrofibraprataprecounitario1());

        ///->hidrogelb
        dados.put("hidrogelbusado", calculadora.getHidrogelbusado());
        dados.put("hidrogelbprecounitario", calculadora.getHidrogelbprecounitario());
        dados.put("hidrogelbquantidadegastanoperiodo", calculadora.getHidrogelbquantidadegastanoperiodo());
        dados.put("hidrogelbvalorgastonoperiodo", calculadora.getHidrogelbvalorgastonoperiodo());
        dados.put("hidrogelbdias", calculadora.getHidrogelbdias());
        dados.put("hidrogelbprecounitario1", calculadora.getHidrogelbprecounitario1());




        return dados;
    }





    //EXIBIR
    public List<Calculadora> exibir() {
        String sql = "SELECT * from Produtos4;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);
        List<Calculadora> dados = new ArrayList<>();
        while (c.moveToNext()) {

            Calculadora calculadora = new Calculadora();
            if (c.getLong(c.getColumnIndex("id")) != 0) {
                calculadora.setIdCalculadora(c.getLong(c.getColumnIndex("id")));
                calculadora.setIdPaciente(c.getLong(c.getColumnIndex("idPaciente")));
                calculadora.setPaciente(c.getString(c.getColumnIndex("paciente")));

                ///-> Espumacombordasilicone
                calculadora.setEspumacombordasiliconeusado(c.getFloat(c.getColumnIndex("espumacombordasiliconeusado")));
                calculadora.setEspumacombordasiliconeprecounitario(c.getFloat(c.getColumnIndex("espumacombordasiliconeprecounitario")));
                calculadora.setEspumacombordasiliconequantidadegastanoperiodo(c.getFloat(c.getColumnIndex("espumacombordasiliconequantidadegastanoperiodo")));
                calculadora.setEspumacombordasiliconevalorgastonoperiodo(c.getFloat(c.getColumnIndex("espumacombordasiliconevalorgastonoperiodo")));
                calculadora.setEspumacombordasiliconedias(c.getInt(c.getColumnIndex("espumacombordasiliconedias")));
                calculadora.setEspumacombordasiliconeprecounitario1(c.getFloat(c.getColumnIndex("espumacombordasiliconeprecounitario1")));

                ///->espumacombordasiliconeprata
                calculadora.setEspumacombordasiliconepratausado(c.getFloat(c.getColumnIndex("espumacombordasiliconepratausado")));
                calculadora.setEspumacombordasiliconeprataprecounitario(c.getFloat(c.getColumnIndex("espumacombordasiliconeprataprecounitario")));
                calculadora.setEspumacombordasiliconeprataquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("espumacombordasiliconeprataquantidadegastanoperiodo")));
                calculadora.setEspumacombordasiliconepratavalorgastonoperiodo(c.getFloat(c.getColumnIndex("espumacombordasiliconepratavalorgastonoperiodo")));
                calculadora.setEspumacombordasiliconepratadias(c.getInt(c.getColumnIndex("espumacombordasiliconepratadias")));
                calculadora.setEspumacombordasiliconeprataprecounitario1(c.getFloat(c.getColumnIndex("espumacombordasiliconeprataprecounitario1")));

                ///->hidrofibra
                calculadora.setHidrofibrausado(c.getFloat(c.getColumnIndex("hidrofibrausado")));
                calculadora.setHidrofibraprecounitario(c.getFloat(c.getColumnIndex("hidrofibraprecounitario")));
                calculadora.setHidrofibraquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("hidrofibraquantidadegastanoperiodo")));
                calculadora.setHidrofibravalorgastonoperiodo(c.getFloat(c.getColumnIndex("hidrofibravalorgastonoperiodo")));
                calculadora.setHidrofibradias(c.getInt(c.getColumnIndex("hidrofibradias")));
                calculadora.setHidrofibraprecounitario1(c.getFloat(c.getColumnIndex("hidrofibraprecounitario1")));


                ///->hidrofibraprata
                calculadora.setHidrofibrapratausado(c.getFloat(c.getColumnIndex("hidrofibrapratausado")));
                calculadora.setHidrofibraprataprecounitario(c.getFloat(c.getColumnIndex("hidrofibraprataprecounitario")));
                calculadora.setHidrofibraprataquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("hidrofibraprataquantidadegastanoperiodo")));
                calculadora.setHidrofibrapratavalorgastonoperiodo(c.getFloat(c.getColumnIndex("hidrofibrapratavalorgastonoperiodo")));
                calculadora.setHidrofibrapratadias(c.getInt(c.getColumnIndex("hidrofibrapratadias")));
                calculadora.setHidrofibraprataprecounitario1(c.getFloat(c.getColumnIndex("hidrofibraprataprecounitario1")));

                ///->hidrogelb
                calculadora.setHidrogelbusado(c.getFloat(c.getColumnIndex("hidrogelbusado")));
                calculadora.setHidrogelbprecounitario(c.getFloat(c.getColumnIndex("hidrogelbprecounitario")));
                calculadora.setHidrogelbquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("hidrogelbquantidadegastanoperiodo")));
                calculadora.setHidrogelbvalorgastonoperiodo(c.getFloat(c.getColumnIndex("hidrogelbvalorgastonoperiodo")));
                calculadora.setHidrogelbdias(c.getInt(c.getColumnIndex("hidrogelbdias")));
                calculadora.setHidrogelbprecounitario1(c.getFloat(c.getColumnIndex("hidrogelbprecounitario1")));


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
        db.update("Produtos4", dados, "idPaciente = ?", params);
    }



    public Calculadora buscaPacientesComCalculadora(Calculadora calculadora) {
        String sql = "SELECT * from Produtos4;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);

        while (c.moveToNext()) {
            if (calculadora.getIdPaciente() == c.getLong(c.getColumnIndex("idPaciente"))) {

                calculadora.setIdCalculadora(c.getLong(c.getColumnIndex("id")));
                calculadora.setIdPaciente(c.getLong(c.getColumnIndex("idPaciente")));
                calculadora.setPaciente(c.getString(c.getColumnIndex("paciente")));

                ///-> Espumacombordasilicone
                calculadora.setEspumacombordasiliconeusado(c.getFloat(c.getColumnIndex("espumacombordasiliconeusado")));
                calculadora.setEspumacombordasiliconeprecounitario(c.getFloat(c.getColumnIndex("espumacombordasiliconeprecounitario")));
                calculadora.setEspumacombordasiliconequantidadegastanoperiodo(c.getFloat(c.getColumnIndex("espumacombordasiliconequantidadegastanoperiodo")));
                calculadora.setEspumacombordasiliconevalorgastonoperiodo(c.getFloat(c.getColumnIndex("espumacombordasiliconevalorgastonoperiodo")));
                calculadora.setEspumacombordasiliconedias(c.getInt(c.getColumnIndex("espumacombordasiliconedias")));
                calculadora.setEspumacombordasiliconeprecounitario1(c.getFloat(c.getColumnIndex("espumacombordasiliconeprecounitario1")));

                ///->espumacombordasiliconeprata
                calculadora.setEspumacombordasiliconepratausado(c.getFloat(c.getColumnIndex("espumacombordasiliconepratausado")));
                calculadora.setEspumacombordasiliconeprataprecounitario(c.getFloat(c.getColumnIndex("espumacombordasiliconeprataprecounitario")));
                calculadora.setEspumacombordasiliconeprataquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("espumacombordasiliconeprataquantidadegastanoperiodo")));
                calculadora.setEspumacombordasiliconepratavalorgastonoperiodo(c.getFloat(c.getColumnIndex("espumacombordasiliconepratavalorgastonoperiodo")));
                calculadora.setEspumacombordasiliconepratadias(c.getInt(c.getColumnIndex("espumacombordasiliconepratadias")));
                calculadora.setEspumacombordasiliconeprataprecounitario1(c.getFloat(c.getColumnIndex("espumacombordasiliconeprataprecounitario1")));

                ///->hidrofibra
                calculadora.setHidrofibrausado(c.getFloat(c.getColumnIndex("hidrofibrausado")));
                calculadora.setHidrofibraprecounitario(c.getFloat(c.getColumnIndex("hidrofibraprecounitario")));
                calculadora.setHidrofibraquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("hidrofibraquantidadegastanoperiodo")));
                calculadora.setHidrofibravalorgastonoperiodo(c.getFloat(c.getColumnIndex("hidrofibravalorgastonoperiodo")));
                calculadora.setHidrofibradias(c.getInt(c.getColumnIndex("hidrofibradias")));
                calculadora.setHidrofibraprecounitario1(c.getFloat(c.getColumnIndex("hidrofibraprecounitario1")));


                ///->hidrofibraprata
                calculadora.setHidrofibrapratausado(c.getFloat(c.getColumnIndex("hidrofibrapratausado")));
                calculadora.setHidrofibraprataprecounitario(c.getFloat(c.getColumnIndex("hidrofibraprataprecounitario")));
                calculadora.setHidrofibraprataquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("hidrofibraprataquantidadegastanoperiodo")));
                calculadora.setHidrofibrapratavalorgastonoperiodo(c.getFloat(c.getColumnIndex("hidrofibrapratavalorgastonoperiodo")));
                calculadora.setHidrofibrapratadias(c.getInt(c.getColumnIndex("hidrofibrapratadias")));
                calculadora.setHidrofibraprataprecounitario1(c.getFloat(c.getColumnIndex("hidrofibraprataprecounitario1")));

                ///->hidrogelb
                calculadora.setHidrogelbusado(c.getFloat(c.getColumnIndex("hidrogelbusado")));
                calculadora.setHidrogelbprecounitario(c.getFloat(c.getColumnIndex("hidrogelbprecounitario")));
                calculadora.setHidrogelbquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("hidrogelbquantidadegastanoperiodo")));
                calculadora.setHidrogelbvalorgastonoperiodo(c.getFloat(c.getColumnIndex("hidrogelbvalorgastonoperiodo")));
                calculadora.setHidrogelbdias(c.getInt(c.getColumnIndex("hidrogelbdias")));
                calculadora.setHidrogelbprecounitario1(c.getFloat(c.getColumnIndex("hidrogelbprecounitario1")));




            }
        }
        c.close();
        return calculadora;
    }

    public void atualizaTodosOsPrecosUnitarios() {
        String sql = "SELECT * FROM Produtos4 WHERE id = 1;";
        SQLiteDatabase banco = this.getWritableDatabase();
        Cursor cursor = banco.rawQuery(sql, null);
        cursor.moveToFirst();
        String preco = cursor.getString(cursor.getColumnIndex("sfprecounitario1"));

        up1(preco);
    }
    public void up1(String preco) {
        String sql = "SELECT * from Produtos4;";
        SQLiteDatabase db = getWritableDatabase();

        ContentValues dados = new ContentValues();
        dados.put("sfprecounitario1", preco);
        int aux = 1;
        while (aux < 100) {
            String[] params = { String.valueOf(aux) };
            db.update("Produtos4", dados, "id=?", params);
            aux = aux + 1;
        }
    }


    public void deletaPAResultados(Calculadora calculadora) {
        SQLiteDatabase db = getWritableDatabase();
        String[] params = { String.valueOf(calculadora.getIdCalculadora()) };
        db.delete("Produtos4", "id = ?", params);
    }
    public void deletaPAllResultados() {

        SQLiteDatabase db = getWritableDatabase();
        long aux = 1;
        while (aux < 1000) {
            String[] params = { String.valueOf(aux) };
            db.delete("Produtos4", "id = ?", params);
            aux++;
        }
    }
}

