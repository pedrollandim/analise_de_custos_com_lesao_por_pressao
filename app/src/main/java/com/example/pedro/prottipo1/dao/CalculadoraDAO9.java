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



public class CalculadoraDAO9 extends SQLiteOpenHelper {


    public CalculadoraDAO9(Context context) {

        super(context, "planilha9", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Produtos9 (id INTEGER PRIMARY KEY,idPaciente INTEGER, paciente TEXT," +
                //"sfusado REAL,sfpreco REAL,sfquantidade REAL,sfcustodopaciente REAL,sfmediadecustodopaciente REAL,sfdias INTEGER,sfpreco1 REAL,sfquantidade1 REAL," +

                "pressaonegativacpratausado REAL,pressaonegativacprataprecounitario REAL,pressaonegativacprataquantidadegastanoperiodo REAL,pressaonegativacpratavalorgastonoperiodo REAL,pressaonegativacpratadias INTEGER,pressaonegativacprataprecounitario1 REAL," +
                "pressaonegativaspratausado REAL,pressaonegativasprataprecounitario REAL,pressaonegativasprataquantidadegastanoperiodo REAL,pressaonegativaspratavalorgastonoperiodo REAL,pressaonegativaspratadias INTEGER,pressaonegativasprataprecounitario1 REAL," +
                "camahiperbaricausado REAL,camahiperbaricaprecounitario REAL,camahiperbaricaquantidadegastanoperiodo REAL,camahiperbaricavalorgastonoperiodo REAL,camahiperbaricadias INTEGER,camahiperbaricaprecounitario1 REAL," +
                "laserterapiausado REAL,laserterapiaprecounitario REAL,laserterapiaquantidadegastanoperiodo REAL,laserterapiavalorgastonoperiodo REAL,laserterapiadias INTEGER,laserterapiaprecounitario1 REAL);";


        db.execSQL(sql);
    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Produtos9";
        db.execSQL(sql);
        onCreate(db);
    }

    public Calculadora insere(Calculadora calculadora) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues dados = pegaDadosDaCalculadora(calculadora);
        db.insert("Produtos9", null, dados);
        return calculadora;
    }

    @NonNull
    private ContentValues pegaDadosDaCalculadora(Calculadora calculadora) {
        ContentValues dados = new ContentValues();
        dados.put("paciente", calculadora.getPaciente());
        dados.put("idPaciente", calculadora.getIdPaciente());

        ///-> pressaonegativacprata
        //"pressaonegativacpratausado REAL,pressaonegativacprataprecounitario REAL,pressaonegativacprataquantidadegastanoperiodo REAL,pressaonegativacpratavalorgastonoperiodo REAL,pressaonegativacpratadias INTEGER,pressaonegativacprataprecounitario1 REAL," +
        dados.put("pressaonegativacpratausado", calculadora.getPressaonegativacpratausado());
        dados.put("pressaonegativacprataprecounitario", calculadora.getPressaonegativacprataprecounitario());
        dados.put("pressaonegativacprataquantidadegastanoperiodo", calculadora.getPressaonegativacprataquantidadegastanoperiodo());
        dados.put("pressaonegativacpratavalorgastonoperiodo", calculadora.getPressaonegativacpratavalorgastonoperiodo());
        dados.put("pressaonegativacpratadias", calculadora.getPressaonegativacpratadias());
        dados.put("pressaonegativacprataprecounitario1", calculadora.getPressaonegativacprataprecounitario1());

        ///-> pressaonegativasprata
        dados.put("pressaonegativaspratausado", calculadora.getPressaonegativaspratausado());
        dados.put("pressaonegativasprataprecounitario", calculadora.getPressaonegativasprataprecounitario());
        dados.put("pressaonegativasprataquantidadegastanoperiodo", calculadora.getPressaonegativasprataquantidadegastanoperiodo());
        dados.put("pressaonegativaspratavalorgastonoperiodo", calculadora.getPressaonegativaspratavalorgastonoperiodo());
        dados.put("pressaonegativaspratadias", calculadora.getPressaonegativaspratadias());
        dados.put("pressaonegativasprataprecounitario1", calculadora.getPressaonegativasprataprecounitario1());

        ///->camahiperbarica
        dados.put("camahiperbaricausado", calculadora.getCamahiperbaricausado());
        dados.put("camahiperbaricaprecounitario", calculadora.getCamahiperbaricaprecounitario());
        dados.put("camahiperbaricaquantidadegastanoperiodo", calculadora.getCamahiperbaricaquantidadegastanoperiodo());
        dados.put("camahiperbaricavalorgastonoperiodo", calculadora.getCamahiperbaricavalorgastonoperiodo());
        dados.put("camahiperbaricadias", calculadora.getCamahiperbaricadias());
        dados.put("camahiperbaricaprecounitario1", calculadora.getCamahiperbaricaprecounitario1());

        ///->laserterapia
        dados.put("laserterapiausado", calculadora.getLaserterapiausado());
        dados.put("laserterapiaprecounitario", calculadora.getLaserterapiaprecounitario());
        dados.put("laserterapiaquantidadegastanoperiodo", calculadora.getLaserterapiaquantidadegastanoperiodo());
        dados.put("laserterapiavalorgastonoperiodo", calculadora.getLaserterapiavalorgastonoperiodo());
        dados.put("laserterapiadias", calculadora.getLaserterapiadias());
        dados.put("laserterapiaprecounitario1", calculadora.getLaserterapiaprecounitario1());




        return dados;
    }





    //EXIBIR
    public List<Calculadora> exibir() {
        String sql = "SELECT * from Produtos9;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);
        List<Calculadora> dados = new ArrayList<>();
        while (c.moveToNext()) {

            Calculadora calculadora = new Calculadora();
            if (c.getLong(c.getColumnIndex("id")) != 0) {
                calculadora.setIdCalculadora(c.getLong(c.getColumnIndex("id")));
                calculadora.setIdPaciente(c.getLong(c.getColumnIndex("idPaciente")));
                calculadora.setPaciente(c.getString(c.getColumnIndex("paciente")));

                ///->pressaonegativacprata
                calculadora.setPressaonegativacpratausado(c.getFloat(c.getColumnIndex("pressaonegativacpratausado")));
                calculadora.setPressaonegativacprataprecounitario(c.getFloat(c.getColumnIndex("pressaonegativacprataprecounitario")));
                calculadora.setPressaonegativacprataquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("pressaonegativacprataquantidadegastanoperiodo")));
                calculadora.setPressaonegativacpratavalorgastonoperiodo(c.getFloat(c.getColumnIndex("pressaonegativacpratavalorgastonoperiodo")));
                calculadora.setPressaonegativacpratadias(c.getInt(c.getColumnIndex("pressaonegativacpratadias")));
                calculadora.setPressaonegativacprataprecounitario1(c.getFloat(c.getColumnIndex("pressaonegativacprataprecounitario1")));

                ///->pressaonegativasprata
                calculadora.setPressaonegativaspratausado(c.getFloat(c.getColumnIndex("pressaonegativaspratausado")));
                calculadora.setPressaonegativasprataprecounitario(c.getFloat(c.getColumnIndex("pressaonegativasprataprecounitario")));
                calculadora.setPressaonegativasprataquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("pressaonegativasprataquantidadegastanoperiodo")));
                calculadora.setPressaonegativaspratavalorgastonoperiodo(c.getFloat(c.getColumnIndex("pressaonegativaspratavalorgastonoperiodo")));
                calculadora.setPressaonegativaspratadias(c.getInt(c.getColumnIndex("pressaonegativaspratadias")));
                calculadora.setPressaonegativasprataprecounitario1(c.getFloat(c.getColumnIndex("pressaonegativasprataprecounitario1")));

                //camahiperbarica
                calculadora.setCamahiperbaricausado(c.getFloat(c.getColumnIndex("camahiperbaricausado")));
                calculadora.setCamahiperbaricaprecounitario(c.getFloat(c.getColumnIndex("camahiperbaricaprecounitario")));
                calculadora.setCamahiperbaricaquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("camahiperbaricaquantidadegastanoperiodo")));
                calculadora.setCamahiperbaricavalorgastonoperiodo(c.getFloat(c.getColumnIndex("camahiperbaricavalorgastonoperiodo")));
                calculadora.setCamahiperbaricadias(c.getInt(c.getColumnIndex("camahiperbaricadias")));
                calculadora.setCamahiperbaricaprecounitario1(c.getFloat(c.getColumnIndex("camahiperbaricaprecounitario1")));

                ///-> laserterapia
                calculadora.setLaserterapiausado(c.getFloat(c.getColumnIndex("laserterapiausado")));
                calculadora.setLaserterapiaprecounitario(c.getFloat(c.getColumnIndex("laserterapiaprecounitario")));
                calculadora.setLaserterapiaquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("laserterapiaquantidadegastanoperiodo")));
                calculadora.setLaserterapiavalorgastonoperiodo(c.getFloat(c.getColumnIndex("laserterapiavalorgastonoperiodo")));
                calculadora.setLaserterapiadias(c.getInt(c.getColumnIndex("laserterapiadias")));
                calculadora.setLaserterapiaprecounitario1(c.getFloat(c.getColumnIndex("laserterapiaprecounitario1")));



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
        db.update("Produtos9", dados, "idPaciente = ?", params);
    }



    public Calculadora buscaPacientesComCalculadora(Calculadora calculadora) {
        String sql = "SELECT * from Produtos9;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);

        while (c.moveToNext()) {
            if (calculadora.getIdPaciente() == c.getLong(c.getColumnIndex("idPaciente"))) {

                calculadora.setIdCalculadora(c.getLong(c.getColumnIndex("id")));
                calculadora.setIdPaciente(c.getLong(c.getColumnIndex("idPaciente")));
                calculadora.setPaciente(c.getString(c.getColumnIndex("paciente")));

                ///->pressaonegativacprata
                calculadora.setPressaonegativacpratausado(c.getFloat(c.getColumnIndex("pressaonegativacpratausado")));
                calculadora.setPressaonegativacprataprecounitario(c.getFloat(c.getColumnIndex("pressaonegativacprataprecounitario")));
                calculadora.setPressaonegativacprataquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("pressaonegativacprataquantidadegastanoperiodo")));
                calculadora.setPressaonegativacpratavalorgastonoperiodo(c.getFloat(c.getColumnIndex("pressaonegativacpratavalorgastonoperiodo")));
                calculadora.setPressaonegativacpratadias(c.getInt(c.getColumnIndex("pressaonegativacpratadias")));
                calculadora.setPressaonegativacprataprecounitario1(c.getFloat(c.getColumnIndex("pressaonegativacprataprecounitario1")));

                ///->pressaonegativasprata
                calculadora.setPressaonegativaspratausado(c.getFloat(c.getColumnIndex("pressaonegativaspratausado")));
                calculadora.setPressaonegativasprataprecounitario(c.getFloat(c.getColumnIndex("pressaonegativasprataprecounitario")));
                calculadora.setPressaonegativasprataquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("pressaonegativasprataquantidadegastanoperiodo")));
                calculadora.setPressaonegativaspratavalorgastonoperiodo(c.getFloat(c.getColumnIndex("pressaonegativaspratavalorgastonoperiodo")));
                calculadora.setPressaonegativaspratadias(c.getInt(c.getColumnIndex("pressaonegativaspratadias")));
                calculadora.setPressaonegativasprataprecounitario1(c.getFloat(c.getColumnIndex("pressaonegativasprataprecounitario1")));

                //camahiperbarica
                calculadora.setCamahiperbaricausado(c.getFloat(c.getColumnIndex("camahiperbaricausado")));
                calculadora.setCamahiperbaricaprecounitario(c.getFloat(c.getColumnIndex("camahiperbaricaprecounitario")));
                calculadora.setCamahiperbaricaquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("camahiperbaricaquantidadegastanoperiodo")));
                calculadora.setCamahiperbaricavalorgastonoperiodo(c.getFloat(c.getColumnIndex("camahiperbaricavalorgastonoperiodo")));
                calculadora.setCamahiperbaricadias(c.getInt(c.getColumnIndex("camahiperbaricadias")));
                calculadora.setCamahiperbaricaprecounitario1(c.getFloat(c.getColumnIndex("camahiperbaricaprecounitario1")));

                ///-> laserterapia
                calculadora.setLaserterapiausado(c.getFloat(c.getColumnIndex("laserterapiausado")));
                calculadora.setLaserterapiaprecounitario(c.getFloat(c.getColumnIndex("laserterapiaprecounitario")));
                calculadora.setLaserterapiaquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("laserterapiaquantidadegastanoperiodo")));
                calculadora.setLaserterapiavalorgastonoperiodo(c.getFloat(c.getColumnIndex("laserterapiavalorgastonoperiodo")));
                calculadora.setLaserterapiadias(c.getInt(c.getColumnIndex("laserterapiadias")));
                calculadora.setLaserterapiaprecounitario1(c.getFloat(c.getColumnIndex("laserterapiaprecounitario1")));



            }
        }
        c.close();
        return calculadora;
    }

    public void atualizaTodosOsPrecosUnitarios() {
        String sql = "SELECT * FROM Produtos9 WHERE id = 1;";
        SQLiteDatabase banco = this.getWritableDatabase();
        Cursor cursor = banco.rawQuery(sql, null);
        cursor.moveToFirst();
        String preco = cursor.getString(cursor.getColumnIndex("sfprecounitario1"));

        up1(preco);
    }
    public void up1(String preco) {
        String sql = "SELECT * from Produtos9;";
        SQLiteDatabase db = getWritableDatabase();

        ContentValues dados = new ContentValues();
        dados.put("sfprecounitario1", preco);
        int aux = 1;
        while (aux < 100) {
            String[] params = { String.valueOf(aux) };
            db.update("Produtos9", dados, "id=?", params);
            aux = aux + 1;
        }
    }


    public void deletaPAResultados(Calculadora calculadora) {
        SQLiteDatabase db = getWritableDatabase();
        String[] params = { String.valueOf(calculadora.getIdCalculadora()) };
        db.delete("Produtos9", "id = ?", params);
    }
    public void deletaPAllResultados() {

        SQLiteDatabase db = getWritableDatabase();
        long aux = 1;
        while (aux < 1000) {
            String[] params = { String.valueOf(aux) };
            db.delete("Produtos9", "id = ?", params);
            aux++;
        }
    }
}


