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


public class CalculadoraDAO6 extends SQLiteOpenHelper {


    public CalculadoraDAO6(Context context) {

        super(context, "planilha6", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Produtos6 (id INTEGER PRIMARY KEY,idPaciente INTEGER, paciente TEXT," +
                //"sfusado REAL,sfpreco REAL,sfquantidade REAL,sfcustodopaciente REAL,sfmediadecustodopaciente REAL,sfdias INTEGER,sfpreco1 REAL,sfquantidade1 REAL," +

                "telanaderenteimpregnadausado REAL,telanaderenteimpregnadaprecounitario REAL,telanaderenteimpregnadaquantidadegastanoperiodo REAL,telanaderenteimpregnadavalorgastonoperiodo REAL,telanaderenteimpregnadadias INTEGER,telanaderenteimpregnadaprecounitario1 REAL," +
                "carvaousado REAL,carvaoprecounitario REAL,carvaoquantidadegastanoperiodo REAL,carvaovalorgastonoperiodo REAL,carvaodias INTEGER,carvaoprecounitario1 REAL," +
                "carvaopratausado REAL,carvaoprataprecounitario REAL,carvaoprataquantidadegastanoperiodo REAL,carvaopratavalorgastonoperiodo REAL,carvaopratadias INTEGER,carvaoprataprecounitario1 REAL," +
                "filmetransparenteusado REAL,filmetransparenteprecounitario REAL,filmetransparentequantidadegastanoperiodo REAL,filmetransparentevalorgastonoperiodo REAL,filmetransparentedias INTEGER,filmetransparenteprecounitario1 REAL," +
                "hidrocoloideusado REAL,hidrocoloideprecounitario REAL,hidrocoloidequantidadegastanoperiodo REAL,hidrocoloidevalorgastonoperiodo REAL,hidrocoloidedias INTEGER,hidrocoloideprecounitario1 REAL);";



        db.execSQL(sql);
    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Produtos6";
        db.execSQL(sql);
        onCreate(db);
    }

    public Calculadora insere(Calculadora calculadora) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues dados = pegaDadosDaCalculadora(calculadora);
        db.insert("Produtos6", null, dados);
        return calculadora;
    }

    @NonNull
    private ContentValues pegaDadosDaCalculadora(Calculadora calculadora) {
        ContentValues dados = new ContentValues();
        dados.put("paciente", calculadora.getPaciente());
        dados.put("idPaciente", calculadora.getIdPaciente());

        ///-> telanaderenteimpregnada
        dados.put("telanaderenteimpregnadausado", calculadora.getTelanaderenteimpregnadausado());
        dados.put("telanaderenteimpregnadaprecounitario", calculadora.getTelanaderenteimpregnadaprecounitario());
        dados.put("telanaderenteimpregnadaquantidadegastanoperiodo", calculadora.getTelanaderenteimpregnadaquantidadegastanoperiodo());
        dados.put("telanaderenteimpregnadavalorgastonoperiodo", calculadora.getTelanaderenteimpregnadavalorgastonoperiodo());
        dados.put("telanaderenteimpregnadadias", calculadora.getTelanaderenteimpregnadadias());
        dados.put("telanaderenteimpregnadaprecounitario1", calculadora.getTelanaderenteimpregnadaprecounitario1());

        ///->carvao
        dados.put("carvaousado", calculadora.getCarvaousado());
        dados.put("carvaoprecounitario", calculadora.getCarvaoprecounitario());
        dados.put("carvaoquantidadegastanoperiodo", calculadora.getCarvaoquantidadegastanoperiodo());
        dados.put("carvaovalorgastonoperiodo", calculadora.getCarvaovalorgastonoperiodo());
        dados.put("carvaodias", calculadora.getCarvaodias());
        dados.put("carvaoprecounitario1", calculadora.getCarvaoprecounitario1());

        ///->carvaoprata
        dados.put("carvaopratausado", calculadora.getCarvaopratausado());
        dados.put("carvaoprataprecounitario", calculadora.getCarvaoprataprecounitario());
        dados.put("carvaoprataquantidadegastanoperiodo", calculadora.getCarvaoprataquantidadegastanoperiodo());
        dados.put("carvaopratavalorgastonoperiodo", calculadora.getCarvaopratavalorgastonoperiodo());
        dados.put("carvaopratadias", calculadora.getCarvaopratadias());
        dados.put("carvaoprataprecounitario1", calculadora.getCarvaoprataprecounitario1());

        ///->filmetransparente
        dados.put("filmetransparenteusado", calculadora.getFilmetransparenteusado());
        dados.put("filmetransparenteprecounitario", calculadora.getFilmetransparenteprecounitario());
        dados.put("filmetransparentequantidadegastanoperiodo", calculadora.getFilmetransparentequantidadegastanoperiodo());
        dados.put("filmetransparentevalorgastonoperiodo", calculadora.getFilmetransparentevalorgastonoperiodo());
        dados.put("filmetransparentedias", calculadora.getFilmetransparentedias());
        dados.put("filmetransparenteprecounitario1", calculadora.getFilmetransparenteprecounitario1());

        ///->hidrocoloide
        dados.put("hidrocoloideusado", calculadora.getHidrocoloideusado());
        dados.put("hidrocoloideprecounitario", calculadora.getHidrocoloideprecounitario());
        dados.put("hidrocoloidequantidadegastanoperiodo", calculadora.getHidrocoloidequantidadegastanoperiodo());
        dados.put("hidrocoloidevalorgastonoperiodo", calculadora.getHidrocoloidevalorgastonoperiodo());
        dados.put("hidrocoloidedias", calculadora.getHidrocoloidedias());
        dados.put("hidrocoloideprecounitario1", calculadora.getHidrocoloideprecounitario1());


        return dados;
    }





    //EXIBIR
    public List<Calculadora> exibir() {
        String sql = "SELECT * from Produtos6;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);
        List<Calculadora> dados = new ArrayList<>();
        while (c.moveToNext()) {

            Calculadora calculadora = new Calculadora();
            if (c.getLong(c.getColumnIndex("id")) != 0) {
                calculadora.setIdCalculadora(c.getLong(c.getColumnIndex("id")));
                calculadora.setIdPaciente(c.getLong(c.getColumnIndex("idPaciente")));
                calculadora.setPaciente(c.getString(c.getColumnIndex("paciente")));


                ///->carvao
                calculadora.setCarvaousado(c.getFloat(c.getColumnIndex("carvaousado")));
                calculadora.setCarvaoprecounitario(c.getFloat(c.getColumnIndex("carvaoprecounitario")));
                calculadora.setCarvaoquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("carvaoquantidadegastanoperiodo")));
                calculadora.setCarvaovalorgastonoperiodo(c.getFloat(c.getColumnIndex("carvaovalorgastonoperiodo")));
                calculadora.setCarvaodias(c.getInt(c.getColumnIndex("carvaodias")));
                calculadora.setCarvaoprecounitario1(c.getFloat(c.getColumnIndex("carvaoprecounitario1")));


                ///->carvaoprata
                calculadora.setCarvaopratausado(c.getFloat(c.getColumnIndex("carvaopratausado")));
                calculadora.setCarvaoprataprecounitario(c.getFloat(c.getColumnIndex("carvaoprataprecounitario")));
                calculadora.setCarvaoprataquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("carvaoprataquantidadegastanoperiodo")));
                calculadora.setCarvaopratavalorgastonoperiodo(c.getFloat(c.getColumnIndex("carvaopratavalorgastonoperiodo")));
                calculadora.setCarvaopratadias(c.getInt(c.getColumnIndex("carvaopratadias")));
                calculadora.setCarvaoprataprecounitario1(c.getFloat(c.getColumnIndex("carvaoprataprecounitario1")));





                ///->filmetransparente
                calculadora.setFilmetransparenteusado(c.getFloat(c.getColumnIndex("filmetransparenteusado")));
                calculadora.setFilmetransparenteprecounitario(c.getFloat(c.getColumnIndex("filmetransparenteprecounitario")));
                calculadora.setFilmetransparentequantidadegastanoperiodo(c.getFloat(c.getColumnIndex("filmetransparentequantidadegastanoperiodo")));
                calculadora.setFilmetransparentevalorgastonoperiodo(c.getFloat(c.getColumnIndex("filmetransparentevalorgastonoperiodo")));
                calculadora.setFilmetransparentedias(c.getInt(c.getColumnIndex("filmetransparentedias")));
                calculadora.setFilmetransparenteprecounitario1(c.getFloat(c.getColumnIndex("filmetransparenteprecounitario1")));



                ///->hidrocoloide
                calculadora.setHidrocoloideusado(c.getFloat(c.getColumnIndex("hidrocoloideusado")));
                calculadora.setHidrocoloideprecounitario(c.getFloat(c.getColumnIndex("hidrocoloideprecounitario")));
                calculadora.setHidrocoloidequantidadegastanoperiodo(c.getFloat(c.getColumnIndex("hidrocoloidequantidadegastanoperiodo")));
                calculadora.setHidrocoloidevalorgastonoperiodo(c.getFloat(c.getColumnIndex("hidrocoloidevalorgastonoperiodo")));
                calculadora.setHidrocoloidedias(c.getInt(c.getColumnIndex("hidrocoloidedias")));
                calculadora.setHidrocoloideprecounitario1(c.getFloat(c.getColumnIndex("hidrocoloideprecounitario1")));









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
        db.update("Produtos6", dados, "idPaciente = ?", params);
    }



    public Calculadora buscaPacientesComCalculadora(Calculadora calculadora) {
        String sql = "SELECT * from Produtos6;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);

        while (c.moveToNext()) {
            if (calculadora.getIdPaciente() == c.getLong(c.getColumnIndex("idPaciente"))) {

                calculadora.setIdCalculadora(c.getLong(c.getColumnIndex("id")));
                calculadora.setIdPaciente(c.getLong(c.getColumnIndex("idPaciente")));
                calculadora.setPaciente(c.getString(c.getColumnIndex("paciente")));

                ///->telanaderenteimpregnada
                calculadora.setTelanaderenteimpregnadausado(c.getFloat(c.getColumnIndex("telanaderenteimpregnadausado")));
                calculadora.setTelanaderenteimpregnadaprecounitario(c.getFloat(c.getColumnIndex("telanaderenteimpregnadaprecounitario")));
                calculadora.setTelanaderenteimpregnadaquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("telanaderenteimpregnadaquantidadegastanoperiodo")));
                calculadora.setTelanaderenteimpregnadavalorgastonoperiodo(c.getFloat(c.getColumnIndex("telanaderenteimpregnadavalorgastonoperiodo")));
                calculadora.setTelanaderenteimpregnadadias(c.getInt(c.getColumnIndex("telanaderenteimpregnadadias")));
                calculadora.setTelanaderenteimpregnadaprecounitario1(c.getFloat(c.getColumnIndex("telanaderenteimpregnadaprecounitario1")));

                ///->carvao
                calculadora.setCarvaousado(c.getFloat(c.getColumnIndex("carvaousado")));
                calculadora.setCarvaoprecounitario(c.getFloat(c.getColumnIndex("carvaoprecounitario")));
                calculadora.setCarvaoquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("carvaoquantidadegastanoperiodo")));
                calculadora.setCarvaovalorgastonoperiodo(c.getFloat(c.getColumnIndex("carvaovalorgastonoperiodo")));
                calculadora.setCarvaodias(c.getInt(c.getColumnIndex("carvaodias")));
                calculadora.setCarvaoprecounitario1(c.getFloat(c.getColumnIndex("carvaoprecounitario1")));

                ///->carvaoprata
                calculadora.setCarvaopratausado(c.getFloat(c.getColumnIndex("carvaopratausado")));
                calculadora.setCarvaoprataprecounitario(c.getFloat(c.getColumnIndex("carvaoprataprecounitario")));
                calculadora.setCarvaoprataquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("carvaoprataquantidadegastanoperiodo")));
                calculadora.setCarvaopratavalorgastonoperiodo(c.getFloat(c.getColumnIndex("carvaopratavalorgastonoperiodo")));
                calculadora.setCarvaopratadias(c.getInt(c.getColumnIndex("carvaopratadias")));
                calculadora.setCarvaoprataprecounitario1(c.getFloat(c.getColumnIndex("carvaoprataprecounitario1")));

                //filmetransparente
                calculadora.setFilmetransparenteusado(c.getFloat(c.getColumnIndex("filmetransparenteusado")));
                calculadora.setFilmetransparenteprecounitario(c.getFloat(c.getColumnIndex("filmetransparenteprecounitario")));
                calculadora.setFilmetransparentequantidadegastanoperiodo(c.getFloat(c.getColumnIndex("filmetransparentequantidadegastanoperiodo")));
                calculadora.setFilmetransparentevalorgastonoperiodo(c.getFloat(c.getColumnIndex("filmetransparentevalorgastonoperiodo")));
                calculadora.setFilmetransparentedias(c.getInt(c.getColumnIndex("filmetransparentedias")));
                calculadora.setFilmetransparenteprecounitario1(c.getFloat(c.getColumnIndex("filmetransparenteprecounitario1")));

                ///-> hidrocoloide
                calculadora.setHidrocoloideusado(c.getFloat(c.getColumnIndex("hidrocoloideusado")));
                calculadora.setHidrocoloideprecounitario(c.getFloat(c.getColumnIndex("hidrocoloideprecounitario")));
                calculadora.setHidrocoloidequantidadegastanoperiodo(c.getFloat(c.getColumnIndex("hidrocoloidequantidadegastanoperiodo")));
                calculadora.setHidrocoloidevalorgastonoperiodo(c.getFloat(c.getColumnIndex("hidrocoloidevalorgastonoperiodo")));
                calculadora.setHidrocoloidedias(c.getInt(c.getColumnIndex("hidrocoloidedias")));
                calculadora.setHidrocoloideprecounitario1(c.getFloat(c.getColumnIndex("hidrocoloideprecounitario1")));


            }
        }
        c.close();
        return calculadora;
    }

    public void atualizaTodosOsPrecosUnitarios() {
        String sql = "SELECT * FROM Produtos6 WHERE id = 1;";
        SQLiteDatabase banco = this.getWritableDatabase();
        Cursor cursor = banco.rawQuery(sql, null);
        cursor.moveToFirst();
        String preco = cursor.getString(cursor.getColumnIndex("sfprecounitario1"));

        up1(preco);
    }
    public void up1(String preco) {
        String sql = "SELECT * from Produtos6;";
        SQLiteDatabase db = getWritableDatabase();

        ContentValues dados = new ContentValues();
        dados.put("sfprecounitario1", preco);
        int aux = 1;
        while (aux < 100) {
            String[] params = { String.valueOf(aux) };
            db.update("Produtos6", dados, "id=?", params);
            aux = aux + 1;
        }
    }


    public void deletaPAResultados(Calculadora calculadora) {
        SQLiteDatabase db = getWritableDatabase();
        String[] params = { String.valueOf(calculadora.getIdCalculadora()) };
        db.delete("Produtos6", "id = ?", params);
    }
    public void deletaPAllResultados() {

        SQLiteDatabase db = getWritableDatabase();
        long aux = 1;
        while (aux < 1000) {
            String[] params = { String.valueOf(aux) };
            db.delete("Produtos6", "id = ?", params);
            aux++;
        }
    }
}


