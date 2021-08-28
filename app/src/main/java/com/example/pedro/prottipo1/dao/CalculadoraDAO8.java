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


public class CalculadoraDAO8 extends SQLiteOpenHelper {


    public CalculadoraDAO8(Context context) {

        super(context, "planilha8", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Produtos8 (id INTEGER PRIMARY KEY,idPaciente INTEGER, paciente TEXT," +
                //"sfusado REAL,sfpreco REAL,sfquantidade REAL,sfcustodopaciente REAL,sfmediadecustodopaciente REAL,sfdias INTEGER,sfpreco1 REAL,sfquantidade1 REAL," +

                "rayon2usado REAL,rayon2precounitario REAL,rayon2quantidadegastanoperiodo REAL,rayon2valorgastonoperiodo REAL,rayon2dias INTEGER,rayon2precounitario1 REAL," +
                "chumacousado REAL,chumacoprecounitario REAL,chumacoquantidadegastanoperiodo REAL,chumacovalorgastonoperiodo REAL,chumacodias INTEGER,chumacoprecounitario1 REAL," +
                "compressaesterilusado REAL,compressaesterilprecounitario REAL,compressaesterilquantidadegastanoperiodo REAL,compressaesterilvalorgastonoperiodo REAL,compressaesterildias INTEGER,compressaesterilprecounitario1 REAL," +
                "espuma2usado REAL,espuma2precounitario REAL,espuma2quantidadegastanoperiodo REAL,espuma2valorgastonoperiodo REAL,espuma2dias INTEGER,espuma2precounitario1 REAL," +
                "filmetransparente2usado REAL,filmetransparente2precounitario REAL,filmetransparente2quantidadegastanoperiodo REAL,filmetransparente2valorgastonoperiodo REAL,filmetransparente2dias INTEGER,filmetransparente2precounitario1 REAL);";


        db.execSQL(sql);
    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Produtos8";
        db.execSQL(sql);
        onCreate(db);
    }

    public Calculadora insere(Calculadora calculadora) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues dados = pegaDadosDaCalculadora(calculadora);
        db.insert("Produtos8", null, dados);
        return calculadora;
    }

    @NonNull
    private ContentValues pegaDadosDaCalculadora(Calculadora calculadora) {
        ContentValues dados = new ContentValues();
        dados.put("paciente", calculadora.getPaciente());
        dados.put("idPaciente", calculadora.getIdPaciente());

        ///->rayon2
        dados.put("rayon2usado", calculadora.getRayon2usado());
        dados.put("rayon2precounitario", calculadora.getRayon2precounitario());
        dados.put("rayon2quantidadegastanoperiodo", calculadora.getRayon2quantidadegastanoperiodo());
        dados.put("rayon2valorgastonoperiodo", calculadora.getRayon2valorgastonoperiodo());
        dados.put("rayon2dias", calculadora.getRayon2dias());
        dados.put("rayon2precounitario1", calculadora.getRayon2precounitario1());

        ///->chumaco
        dados.put("chumacousado", calculadora.getChumacousado());
        dados.put("chumacoprecounitario", calculadora.getChumacoprecounitario());
        dados.put("chumacoquantidadegastanoperiodo", calculadora.getChumacoquantidadegastanoperiodo());
        dados.put("chumacovalorgastonoperiodo", calculadora.getChumacovalorgastonoperiodo());
        dados.put("chumacodias", calculadora.getChumacodias());
        dados.put("chumacoprecounitario1", calculadora.getChumacoprecounitario1());

        ///->compressaesteril
        dados.put("compressaesterilusado", calculadora.getCompressaesterilusado());
        dados.put("compressaesterilprecounitario", calculadora.getCompressaesterilprecounitario());
        dados.put("compressaesterilquantidadegastanoperiodo", calculadora.getCompressaesterilquantidadegastanoperiodo());
        dados.put("compressaesterilvalorgastonoperiodo", calculadora.getCompressaesterilvalorgastonoperiodo());
        dados.put("compressaesterildias", calculadora.getCompressaesterildias());
        dados.put("compressaesterilprecounitario1", calculadora.getCompressaesterilprecounitario1());

        ///->espuma2
        dados.put("espuma2usado", calculadora.getEspuma2usado());
        dados.put("espuma2precounitario", calculadora.getEspuma2precounitario());
        dados.put("espuma2quantidadegastanoperiodo", calculadora.getEspuma2quantidadegastanoperiodo());
        dados.put("espuma2valorgastonoperiodo", calculadora.getEspuma2valorgastonoperiodo());
        dados.put("espuma2dias", calculadora.getEspuma2dias());
        dados.put("espuma2precounitario1", calculadora.getEspuma2precounitario1());


        ///->filmetransparente2
        dados.put("filmetransparente2usado", calculadora.getFilmetransparente2usado());
        dados.put("filmetransparente2precounitario", calculadora.getFilmetransparente2precounitario());
        dados.put("filmetransparente2quantidadegastanoperiodo", calculadora.getFilmetransparente2quantidadegastanoperiodo());
        dados.put("filmetransparente2valorgastonoperiodo", calculadora.getFilmetransparente2valorgastonoperiodo());
        dados.put("filmetransparente2dias", calculadora.getFilmetransparente2dias());
        dados.put("filmetransparente2precounitario1", calculadora.getFilmetransparente2precounitario1());



        return dados;
    }





    //EXIBIR
    public List<Calculadora> exibir() {
        String sql = "SELECT * from Produtos8;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);
        List<Calculadora> dados = new ArrayList<>();
        while (c.moveToNext()) {

            Calculadora calculadora = new Calculadora();
            if (c.getLong(c.getColumnIndex("id")) != 0) {
                calculadora.setIdCalculadora(c.getLong(c.getColumnIndex("id")));
                calculadora.setIdPaciente(c.getLong(c.getColumnIndex("idPaciente")));
                calculadora.setPaciente(c.getString(c.getColumnIndex("paciente")));

                //rayon2
                calculadora.setRayon2usado(c.getFloat(c.getColumnIndex("rayon2usado")));
                calculadora.setRayon2precounitario(c.getFloat(c.getColumnIndex("rayon2precounitario")));
                calculadora.setRayon2quantidadegastanoperiodo(c.getFloat(c.getColumnIndex("rayon2quantidadegastanoperiodo")));
                calculadora.setRayon2valorgastonoperiodo(c.getFloat(c.getColumnIndex("rayon2valorgastonoperiodo")));
                calculadora.setRayon2dias(c.getInt(c.getColumnIndex("rayon2dias")));
                calculadora.setRayon2precounitario1(c.getFloat(c.getColumnIndex("rayon2precounitario1")));

                ///-> chumaco
                calculadora.setChumacousado(c.getFloat(c.getColumnIndex("chumacousado")));
                calculadora.setChumacoprecounitario(c.getFloat(c.getColumnIndex("chumacoprecounitario")));
                calculadora.setChumacoquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("chumacoquantidadegastanoperiodo")));
                calculadora.setChumacovalorgastonoperiodo(c.getFloat(c.getColumnIndex("chumacovalorgastonoperiodo")));
                calculadora.setChumacodias(c.getInt(c.getColumnIndex("chumacodias")));
                calculadora.setChumacoprecounitario1(c.getFloat(c.getColumnIndex("chumacoprecounitario1")));


                ///->compressaesteril
                calculadora.setCompressaesterilusado(c.getFloat(c.getColumnIndex("compressaesterilusado")));
                calculadora.setCompressaesterilprecounitario(c.getFloat(c.getColumnIndex("compressaesterilprecounitario")));
                calculadora.setCompressaesterilquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("compressaesterilquantidadegastanoperiodo")));
                calculadora.setCompressaesterilvalorgastonoperiodo(c.getFloat(c.getColumnIndex("compressaesterilvalorgastonoperiodo")));
                calculadora.setCompressaesterildias(c.getInt(c.getColumnIndex("compressaesterildias")));
                calculadora.setCompressaesterilprecounitario1(c.getFloat(c.getColumnIndex("compressaesterilprecounitario1")));

                ///->espuma2
                calculadora.setEspuma2usado(c.getFloat(c.getColumnIndex("espuma2usado")));
                calculadora.setEspuma2precounitario(c.getFloat(c.getColumnIndex("espuma2precounitario")));
                calculadora.setEspuma2quantidadegastanoperiodo(c.getFloat(c.getColumnIndex("espuma2quantidadegastanoperiodo")));
                calculadora.setEspuma2valorgastonoperiodo(c.getFloat(c.getColumnIndex("espuma2valorgastonoperiodo")));
                calculadora.setEspuma2dias(c.getInt(c.getColumnIndex("espuma2dias")));
                calculadora.setEspuma2precounitario1(c.getFloat(c.getColumnIndex("espuma2precounitario1")));


                ///->filmetransparente2
                calculadora.setFilmetransparente2usado(c.getFloat(c.getColumnIndex("filmetransparente2usado")));
                calculadora.setFilmetransparente2precounitario(c.getFloat(c.getColumnIndex("filmetransparente2precounitario")));
                calculadora.setFilmetransparente2quantidadegastanoperiodo(c.getFloat(c.getColumnIndex("filmetransparente2quantidadegastanoperiodo")));
                calculadora.setFilmetransparente2valorgastonoperiodo(c.getFloat(c.getColumnIndex("filmetransparente2valorgastonoperiodo")));
                calculadora.setFilmetransparente2dias(c.getInt(c.getColumnIndex("filmetransparente2dias")));
                calculadora.setFilmetransparente2precounitario1(c.getFloat(c.getColumnIndex("filmetransparente2precounitario1")));



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
        db.update("Produtos8", dados, "idPaciente = ?", params);
    }



    public Calculadora buscaPacientesComCalculadora(Calculadora calculadora) {
        String sql = "SELECT * from Produtos8;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);

        while (c.moveToNext()) {
            if (calculadora.getIdPaciente() == c.getLong(c.getColumnIndex("idPaciente"))) {

                calculadora.setIdCalculadora(c.getLong(c.getColumnIndex("id")));
                calculadora.setIdPaciente(c.getLong(c.getColumnIndex("idPaciente")));
                calculadora.setPaciente(c.getString(c.getColumnIndex("paciente")));

                //rayon2
                calculadora.setRayon2usado(c.getFloat(c.getColumnIndex("rayon2usado")));
                calculadora.setRayon2precounitario(c.getFloat(c.getColumnIndex("rayon2precounitario")));
                calculadora.setRayon2quantidadegastanoperiodo(c.getFloat(c.getColumnIndex("rayon2quantidadegastanoperiodo")));
                calculadora.setRayon2valorgastonoperiodo(c.getFloat(c.getColumnIndex("rayon2valorgastonoperiodo")));
                calculadora.setRayon2dias(c.getInt(c.getColumnIndex("rayon2dias")));
                calculadora.setRayon2precounitario1(c.getFloat(c.getColumnIndex("rayon2precounitario1")));

                ///-> chumaco
                calculadora.setChumacousado(c.getFloat(c.getColumnIndex("chumacousado")));
                calculadora.setChumacoprecounitario(c.getFloat(c.getColumnIndex("chumacoprecounitario")));
                calculadora.setChumacoquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("chumacoquantidadegastanoperiodo")));
                calculadora.setChumacovalorgastonoperiodo(c.getFloat(c.getColumnIndex("chumacovalorgastonoperiodo")));
                calculadora.setChumacodias(c.getInt(c.getColumnIndex("chumacodias")));
                calculadora.setChumacoprecounitario1(c.getFloat(c.getColumnIndex("chumacoprecounitario1")));


                ///->compressaesteril
                calculadora.setCompressaesterilusado(c.getFloat(c.getColumnIndex("compressaesterilusado")));
                calculadora.setCompressaesterilprecounitario(c.getFloat(c.getColumnIndex("compressaesterilprecounitario")));
                calculadora.setCompressaesterilquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("compressaesterilquantidadegastanoperiodo")));
                calculadora.setCompressaesterilvalorgastonoperiodo(c.getFloat(c.getColumnIndex("compressaesterilvalorgastonoperiodo")));
                calculadora.setCompressaesterildias(c.getInt(c.getColumnIndex("compressaesterildias")));
                calculadora.setCompressaesterilprecounitario1(c.getFloat(c.getColumnIndex("compressaesterilprecounitario1")));

                ///->espuma2
                calculadora.setEspuma2usado(c.getFloat(c.getColumnIndex("espuma2usado")));
                calculadora.setEspuma2precounitario(c.getFloat(c.getColumnIndex("espuma2precounitario")));
                calculadora.setEspuma2quantidadegastanoperiodo(c.getFloat(c.getColumnIndex("espuma2quantidadegastanoperiodo")));
                calculadora.setEspuma2valorgastonoperiodo(c.getFloat(c.getColumnIndex("espuma2valorgastonoperiodo")));
                calculadora.setEspuma2dias(c.getInt(c.getColumnIndex("espuma2dias")));
                calculadora.setEspuma2precounitario1(c.getFloat(c.getColumnIndex("espuma2precounitario1")));


                ///->filmetransparente2
                calculadora.setFilmetransparente2usado(c.getFloat(c.getColumnIndex("filmetransparente2usado")));
                calculadora.setFilmetransparente2precounitario(c.getFloat(c.getColumnIndex("filmetransparente2precounitario")));
                calculadora.setFilmetransparente2quantidadegastanoperiodo(c.getFloat(c.getColumnIndex("filmetransparente2quantidadegastanoperiodo")));
                calculadora.setFilmetransparente2valorgastonoperiodo(c.getFloat(c.getColumnIndex("filmetransparente2valorgastonoperiodo")));
                calculadora.setFilmetransparente2dias(c.getInt(c.getColumnIndex("filmetransparente2dias")));
                calculadora.setFilmetransparente2precounitario1(c.getFloat(c.getColumnIndex("filmetransparente2precounitario1")));



            }
        }
        c.close();
        return calculadora;
    }

    public void atualizaTodosOsPrecosUnitarios() {
        String sql = "SELECT * FROM Produtos8 WHERE id = 1;";
        SQLiteDatabase banco = this.getWritableDatabase();
        Cursor cursor = banco.rawQuery(sql, null);
        cursor.moveToFirst();
        String preco = cursor.getString(cursor.getColumnIndex("sfprecounitario1"));

        up1(preco);
    }
    public void up1(String preco) {
        String sql = "SELECT * from Produtos8;";
        SQLiteDatabase db = getWritableDatabase();

        ContentValues dados = new ContentValues();
        dados.put("sfprecounitario1", preco);
        int aux = 1;
        while (aux < 100) {
            String[] params = { String.valueOf(aux) };
            db.update("Produtos8", dados, "id=?", params);
            aux = aux + 1;
        }
    }


    public void deletaPAResultados(Calculadora calculadora) {
        SQLiteDatabase db = getWritableDatabase();
        String[] params = { String.valueOf(calculadora.getIdCalculadora()) };
        db.delete("Produtos8", "id = ?", params);
    }
    public void deletaPAllResultados() {

        SQLiteDatabase db = getWritableDatabase();
        long aux = 1;
        while (aux < 1000) {
            String[] params = { String.valueOf(aux) };
            db.delete("Produtos8", "id = ?", params);
            aux++;
        }
    }


}


