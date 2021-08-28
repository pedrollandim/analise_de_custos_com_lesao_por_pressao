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


public class CalculadoraDAO3 extends SQLiteOpenHelper {


    public CalculadoraDAO3(Context context) {

        super(context, "planilha3", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Produtos3 (id INTEGER PRIMARY KEY,idPaciente INTEGER, paciente TEXT," +
                //"sfusado REAL,sfpreco REAL,sfquantidade REAL,sfcustodopaciente REAL,sfmediadecustodopaciente REAL,sfdias INTEGER,sfpreco1 REAL,sfquantidade1 REAL," +

                "espumausado REAL,espumaprecounitario REAL,espumaquantidadegastanoperiodo REAL,espumavalorgastonoperiodo REAL,espumadias INTEGER,espumaprecounitario1 REAL," +
                "espumacompratausado REAL,espumacomprataprecounitario REAL,espumacomprataquantidadegastanoperiodo REAL,espumacompratavalorgastonoperiodo REAL,espumacompratadias INTEGER,espumacomprataprecounitario1 REAL," +
                "espumacomsiliconeusado REAL,espumacomsiliconeprecounitario REAL,espumacomsiliconequantidadegastanoperiodo REAL,espumacomsiliconevalorgastonoperiodo REAL,espumacomsiliconedias INTEGER,espumacomsiliconeprecounitario1 REAL," +
                "espumacomsiliconeepratausado REAL,espumacomsiliconeeprataprecounitario REAL,espumacomsiliconeeprataquantidadegastanoperiodo REAL,espumacomsiliconeepratavalorgastonoperiodo REAL,espumacomsiliconeepratadias INTEGER,espumacomsiliconeeprataprecounitario1 REAL," +
                "espumacombordausado REAL,espumacombordaprecounitario REAL,espumacombordaquantidadegastanoperiodo REAL,espumacombordavalorgastonoperiodo REAL,espumacombordadias INTEGER,espumacombordaprecounitario1 REAL);";


        db.execSQL(sql);
    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Produtos3";
        db.execSQL(sql);
        onCreate(db);
    }

    public Calculadora insere(Calculadora calculadora) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues dados = pegaDadosDaCalculadora(calculadora);
        db.insert("Produtos3", null, dados);
        return calculadora;
    }

    @NonNull
    private ContentValues pegaDadosDaCalculadora(Calculadora calculadora) {
        ContentValues dados = new ContentValues();
        dados.put("paciente", calculadora.getPaciente());
        dados.put("idPaciente", calculadora.getIdPaciente());

        ///->espuma
        dados.put("espumausado", calculadora.getEspumausado());
        dados.put("espumaprecounitario", calculadora.getEspumaprecounitario());
        dados.put("espumaquantidadegastanoperiodo", calculadora.getEspumaquantidadegastanoperiodo());
        dados.put("espumavalorgastonoperiodo", calculadora.getEspumavalorgastonoperiodo());
        dados.put("espumadias", calculadora.getEspumadias());
        dados.put("espumaprecounitario1", calculadora.getEspumaprecounitario1());

        ///->espumacomprata
        dados.put("espumacompratausado", calculadora.getEspumacompratausado());
        dados.put("espumacomprataprecounitario", calculadora.getEspumacomprataprecounitario());
        dados.put("espumacomprataquantidadegastanoperiodo", calculadora.getEspumacomprataquantidadegastanoperiodo());
        dados.put("espumacompratavalorgastonoperiodo", calculadora.getEspumacompratavalorgastonoperiodo());
        dados.put("espumacompratadias", calculadora.getEspumacompratadias());
        dados.put("espumacomprataprecounitario1", calculadora.getEspumacomprataprecounitario1());

        ///->espumacomsilicone
        dados.put("espumacomsiliconeusado", calculadora.getEspumacomsiliconeusado());
        dados.put("espumacomsiliconeprecounitario", calculadora.getEspumacomsiliconeprecounitario());
        dados.put("espumacomsiliconequantidadegastanoperiodo", calculadora.getEspumacomsiliconequantidadegastanoperiodo());
        dados.put("espumacomsiliconevalorgastonoperiodo", calculadora.getEspumacomsiliconevalorgastonoperiodo());
        dados.put("espumacomsiliconedias", calculadora.getEspumacomsiliconedias());
        dados.put("espumacomsiliconeprecounitario1", calculadora.getEspumacomsiliconeprecounitario1());

        ///->espumacomsiliconeeprata
        dados.put("espumacomsiliconeepratausado", calculadora.getEspumacomsiliconeepratausado());
        dados.put("espumacomsiliconeeprataprecounitario", calculadora.getEspumacomsiliconeeprataprecounitario());
        dados.put("espumacomsiliconeeprataquantidadegastanoperiodo", calculadora.getEspumacomsiliconeeprataquantidadegastanoperiodo());
        dados.put("espumacomsiliconeepratavalorgastonoperiodo", calculadora.getEspumacomsiliconeepratavalorgastonoperiodo());
        dados.put("espumacomsiliconeepratadias", calculadora.getEspumacomsiliconeepratadias());
        dados.put("espumacomsiliconeeprataprecounitario1", calculadora.getEspumacomsiliconeeprataprecounitario1());

        ///->espumacomborda
        dados.put("espumacombordausado", calculadora.getEspumacombordausado());
        dados.put("espumacombordaprecounitario", calculadora.getEspumacombordaprecounitario());
        dados.put("espumacombordaquantidadegastanoperiodo", calculadora.getEspumacombordaquantidadegastanoperiodo());
        dados.put("espumacombordavalorgastonoperiodo", calculadora.getEspumacombordavalorgastonoperiodo());
        dados.put("espumacombordadias", calculadora.getEspumacombordadias());
        dados.put("espumacombordaprecounitario1", calculadora.getEspumacombordaprecounitario1());



        return dados;
    }





    //EXIBIR
    public List<Calculadora> exibir() {
        String sql = "SELECT * from Produtos3;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);
        List<Calculadora> dados = new ArrayList<>();
        while (c.moveToNext()) {

            Calculadora calculadora = new Calculadora();
            if (c.getLong(c.getColumnIndex("id")) != 0) {
                calculadora.setIdCalculadora(c.getLong(c.getColumnIndex("id")));
                calculadora.setIdPaciente(c.getLong(c.getColumnIndex("idPaciente")));
                calculadora.setPaciente(c.getString(c.getColumnIndex("paciente")));

                ///->espuma
                calculadora.setEspumausado(c.getFloat(c.getColumnIndex("espumausado")));
                calculadora.setEspumaprecounitario(c.getFloat(c.getColumnIndex("espumaprecounitario")));
                calculadora.setEspumaquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("espumaquantidadegastanoperiodo")));
                calculadora.setEspumavalorgastonoperiodo(c.getFloat(c.getColumnIndex("espumavalorgastonoperiodo")));
                calculadora.setEspumadias(c.getInt(c.getColumnIndex("espumadias")));
                calculadora.setEspumaprecounitario1(c.getFloat(c.getColumnIndex("espumaprecounitario1")));


                ///->espumacomprata
                calculadora.setEspumacompratausado(c.getFloat(c.getColumnIndex("espumacompratausado")));
                calculadora.setEspumacomprataprecounitario(c.getFloat(c.getColumnIndex("espumacomprataprecounitario")));
                calculadora.setEspumacomprataquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("espumacomprataquantidadegastanoperiodo")));
                calculadora.setEspumacompratavalorgastonoperiodo(c.getFloat(c.getColumnIndex("espumacompratavalorgastonoperiodo")));
                calculadora.setEspumacompratadias(c.getInt(c.getColumnIndex("espumacompratadias")));
                calculadora.setEspumacomprataprecounitario1(c.getFloat(c.getColumnIndex("espumacomprataprecounitario1")));

                ///->espumacomsilicone
                calculadora.setEspumacomsiliconeusado(c.getFloat(c.getColumnIndex("espumacomsiliconeusado")));
                calculadora.setEspumacomsiliconeprecounitario(c.getFloat(c.getColumnIndex("espumacomsiliconeprecounitario")));
                calculadora.setEspumacomsiliconequantidadegastanoperiodo(c.getFloat(c.getColumnIndex("espumacomsiliconequantidadegastanoperiodo")));
                calculadora.setEspumacomsiliconevalorgastonoperiodo(c.getFloat(c.getColumnIndex("espumacomsiliconevalorgastonoperiodo")));
                calculadora.setEspumacomsiliconedias(c.getInt(c.getColumnIndex("espumacomsiliconedias")));
                calculadora.setEspumacomsiliconeprecounitario1(c.getFloat(c.getColumnIndex("espumacomsiliconeprecounitario1")));

                ///->espumacomsiliconeeprata
                calculadora.setEspumacomsiliconeepratausado(c.getFloat(c.getColumnIndex("espumacomsiliconeepratausado")));
                calculadora.setEspumacomsiliconeeprataprecounitario(c.getFloat(c.getColumnIndex("espumacomsiliconeeprataprecounitario")));
                calculadora.setEspumacomsiliconeeprataquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("espumacomsiliconeeprataquantidadegastanoperiodo")));
                calculadora.setEspumacomsiliconeepratavalorgastonoperiodo(c.getFloat(c.getColumnIndex("espumacomsiliconeepratavalorgastonoperiodo")));
                calculadora.setEspumacomsiliconeepratadias(c.getInt(c.getColumnIndex("espumacomsiliconeepratadias")));
                calculadora.setEspumacomsiliconeeprataprecounitario1(c.getFloat(c.getColumnIndex("espumacomsiliconeeprataprecounitario1")));

                //espumacomborda
                calculadora.setEspumacombordausado(c.getFloat(c.getColumnIndex("espumacombordausado")));
                calculadora.setEspumacombordaprecounitario(c.getFloat(c.getColumnIndex("espumacombordaprecounitario")));
                calculadora.setEspumacombordaquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("espumacombordaquantidadegastanoperiodo")));
                calculadora.setEspumacombordavalorgastonoperiodo(c.getFloat(c.getColumnIndex("espumacombordavalorgastonoperiodo")));
                calculadora.setEspumacombordadias(c.getInt(c.getColumnIndex("espumacombordadias")));
                calculadora.setEspumacombordaprecounitario1(c.getFloat(c.getColumnIndex("espumacombordaprecounitario1")));

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
        db.update("Produtos3", dados, "idPaciente = ?", params);
    }



    public Calculadora buscaPacientesComCalculadora(Calculadora calculadora) {
        String sql = "SELECT * from Produtos3;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);

        while (c.moveToNext()) {
            if (calculadora.getIdPaciente() == c.getLong(c.getColumnIndex("idPaciente"))) {

                calculadora.setIdCalculadora(c.getLong(c.getColumnIndex("id")));
                calculadora.setIdPaciente(c.getLong(c.getColumnIndex("idPaciente")));
                calculadora.setPaciente(c.getString(c.getColumnIndex("paciente")));

                ///->espuma
                calculadora.setEspumausado(c.getFloat(c.getColumnIndex("espumausado")));
                calculadora.setEspumaprecounitario(c.getFloat(c.getColumnIndex("espumaprecounitario")));
                calculadora.setEspumaquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("espumaquantidadegastanoperiodo")));
                calculadora.setEspumavalorgastonoperiodo(c.getFloat(c.getColumnIndex("espumavalorgastonoperiodo")));
                calculadora.setEspumadias(c.getInt(c.getColumnIndex("espumadias")));
                calculadora.setEspumaprecounitario1(c.getFloat(c.getColumnIndex("espumaprecounitario1")));


                ///->espumacomprata
                calculadora.setEspumacompratausado(c.getFloat(c.getColumnIndex("espumacompratausado")));
                calculadora.setEspumacomprataprecounitario(c.getFloat(c.getColumnIndex("espumacomprataprecounitario")));
                calculadora.setEspumacomprataquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("espumacomprataquantidadegastanoperiodo")));
                calculadora.setEspumacompratavalorgastonoperiodo(c.getFloat(c.getColumnIndex("espumacompratavalorgastonoperiodo")));
                calculadora.setEspumacompratadias(c.getInt(c.getColumnIndex("espumacompratadias")));
                calculadora.setEspumacomprataprecounitario1(c.getFloat(c.getColumnIndex("espumacomprataprecounitario1")));

                ///->espumacomsilicone
                calculadora.setEspumacomsiliconeusado(c.getFloat(c.getColumnIndex("espumacomsiliconeusado")));
                calculadora.setEspumacomsiliconeprecounitario(c.getFloat(c.getColumnIndex("espumacomsiliconeprecounitario")));
                calculadora.setEspumacomsiliconequantidadegastanoperiodo(c.getFloat(c.getColumnIndex("espumacomsiliconequantidadegastanoperiodo")));
                calculadora.setEspumacomsiliconevalorgastonoperiodo(c.getFloat(c.getColumnIndex("espumacomsiliconevalorgastonoperiodo")));
                calculadora.setEspumacomsiliconedias(c.getInt(c.getColumnIndex("espumacomsiliconedias")));
                calculadora.setEspumacomsiliconeprecounitario1(c.getFloat(c.getColumnIndex("espumacomsiliconeprecounitario1")));

                ///->espumacomsiliconeeprata
                calculadora.setEspumacomsiliconeepratausado(c.getFloat(c.getColumnIndex("espumacomsiliconeepratausado")));
                calculadora.setEspumacomsiliconeeprataprecounitario(c.getFloat(c.getColumnIndex("espumacomsiliconeeprataprecounitario")));
                calculadora.setEspumacomsiliconeeprataquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("espumacomsiliconeeprataquantidadegastanoperiodo")));
                calculadora.setEspumacomsiliconeepratavalorgastonoperiodo(c.getFloat(c.getColumnIndex("espumacomsiliconeepratavalorgastonoperiodo")));
                calculadora.setEspumacomsiliconeepratadias(c.getInt(c.getColumnIndex("espumacomsiliconeepratadias")));
                calculadora.setEspumacomsiliconeeprataprecounitario1(c.getFloat(c.getColumnIndex("espumacomsiliconeeprataprecounitario1")));

                //espumacomborda
                calculadora.setEspumacombordausado(c.getFloat(c.getColumnIndex("espumacombordausado")));
                calculadora.setEspumacombordaprecounitario(c.getFloat(c.getColumnIndex("espumacombordaprecounitario")));
                calculadora.setEspumacombordaquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("espumacombordaquantidadegastanoperiodo")));
                calculadora.setEspumacombordavalorgastonoperiodo(c.getFloat(c.getColumnIndex("espumacombordavalorgastonoperiodo")));
                calculadora.setEspumacombordadias(c.getInt(c.getColumnIndex("espumacombordadias")));
                calculadora.setEspumacombordaprecounitario1(c.getFloat(c.getColumnIndex("espumacombordaprecounitario1")));



            }
        }
        c.close();
        return calculadora;
    }


    public void deletaPAResultados(Calculadora calculadora) {
        SQLiteDatabase db = getWritableDatabase();
        String[] params = { String.valueOf(calculadora.getIdCalculadora()) };
        db.delete("Produtos3", "id = ?", params);
    }
    public void deletaPAllResultados() {

        SQLiteDatabase db = getWritableDatabase();
        long aux = 1;
        while (aux < 1000) {
            String[] params = { String.valueOf(aux) };
            db.delete("Produtos3", "id = ?", params);
            aux++;
        }
    }
}
