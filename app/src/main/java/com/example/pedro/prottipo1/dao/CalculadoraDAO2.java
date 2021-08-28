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

public class CalculadoraDAO2 extends SQLiteOpenHelper {

    public CalculadoraDAO2(Context context) {

        super(context, "planilha2", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Produtos2 (id INTEGER PRIMARY KEY,idPaciente INTEGER, paciente TEXT," +
                //"sfusado REAL,sfpreco REAL,sfquantidade REAL,sfcustodopaciente REAL,sfmediadecustodopaciente REAL,sfdias INTEGER,sfpreco1 REAL,sfquantidade1 REAL," +

                "removedorDeAdesivousado REAL,removedorDeAdesivoprecounitario REAL,removedorDeAdesivoquantidadegastanoperiodo REAL,removedorDeAdesivovalorgastonoperiodo REAL,removedorDeAdesivodias INTEGER,removedorDeAdesivoprecounitario1 REAL," +
                "removedorDeAdesivoUniusado REAL,removedorDeAdesivoUniprecounitario REAL,removedorDeAdesivoUniquantidadegastanoperiodo REAL,removedorDeAdesivoUnivalorgastonoperiodo REAL,removedorDeAdesivoUnidias INTEGER,removedorDeAdesivoUniprecounitario1 REAL,"+
                "ageusado REAL,ageprecounitario REAL,agequantidadegastanoperiodo REAL,agevalorgastonoperiodo REAL,agedias INTEGER,ageprecounitario1 REAL," +
                "alginatousado REAL,alginatoprecounitario REAL,alginatoquantidadegastanoperiodo REAL,alginatovalorgastonoperiodo REAL,alginatodias INTEGER,alginatoprecounitario1 REAL," +
                "alginatocompratausado REAL,alginatocomprataprecounitario REAL,alginatocomprataquantidadegastanoperiodo REAL,alginatocompratavalorgastonoperiodo REAL,alginatocompratadias INTEGER,alginatocomprataprecounitario1 REAL);";


        db.execSQL(sql);
    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Produtos2";
        db.execSQL(sql);
        onCreate(db);
    }

    public Calculadora insere(Calculadora calculadora) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues dados = pegaDadosDaCalculadora(calculadora);
        db.insert("Produtos2", null,dados);
        return calculadora;
    }

    @NonNull
    private ContentValues pegaDadosDaCalculadora(Calculadora calculadora) {
        ContentValues dados = new ContentValues();
        dados.put("paciente",calculadora.getPaciente());
        dados.put("idPaciente",calculadora.getIdPaciente());

        ///-> alginatocomprata
        dados.put("alginatocompratausado", calculadora.getAlginatocompratausado());
        dados.put("alginatocomprataprecounitario", calculadora.getAlginatocomprataprecounitario());
        dados.put("alginatocomprataquantidadegastanoperiodo", calculadora.getAlginatocomprataquantidadegastanoperiodo());
        dados.put("alginatocompratavalorgastonoperiodo", calculadora.getAlginatocompratavalorgastonoperiodo());
        dados.put("alginatocompratadias", calculadora.getAlginatocompratadias());
        dados.put("alginatocomprataprecounitario1", calculadora.getAlginatocomprataprecounitario1());


        ///->REMOVEDOR DE ADESIVO
        dados.put("removedorDeAdesivousado", calculadora.getRemovedorAdesivousado());
        dados.put("removedorDeAdesivoprecounitario", calculadora.getRemovedorAdesivoprecounitario());
        dados.put("removedorDeAdesivoquantidadegastanoperiodo", calculadora.getRemovedorAdesivoquantidadegastanoperiodo());
        dados.put("removedorDeAdesivovalorgastonoperiodo", calculadora.getRemovedorAdesivovalorgastonoperiodo());
        dados.put("removedorDeAdesivodias", calculadora.getRemovedorAdesivodias());
        dados.put("removedorDeAdesivoprecounitario1", calculadora.getRemovedorAdesivoprecounitario1());

        ///->REMOVEDOR DE ADESIVO UNIDADE
        dados.put("removedorDeAdesivoUniusado", calculadora.getRemovedorAdesivoUnidadeusado());
        dados.put("removedorDeAdesivoUniprecounitario", calculadora.getRemovedorAdesivoUnidadeprecounitario());
        dados.put("removedorDeAdesivoUniquantidadegastanoperiodo", calculadora.getRemovedorAdesivoUnidadequantidadegastanoperiodo());
        dados.put("removedorDeAdesivoUnivalorgastonoperiodo", calculadora.getRemovedorAdesivoUnidadevalorgastonoperiodo());
        dados.put("removedorDeAdesivoUnidias", calculadora.getRemovedorAdesivoUnidadedias());
        dados.put("removedorDeAdesivoUniprecounitario1", calculadora.getRemovedorAdesivoUnidadeprecounitario1());

        ///->age
        dados.put("ageusado", calculadora.getAgeusado());
        dados.put("ageprecounitario", calculadora.getAgeprecounitario());
        dados.put("agequantidadegastanoperiodo", calculadora.getAgequantidadegastanoperiodo());
        dados.put("agevalorgastonoperiodo", calculadora.getAgevalorgastonoperiodo());
        dados.put("agedias", calculadora.getAgedias());
        dados.put("ageprecounitario1", calculadora.getAgeprecounitario1());


        ///-> alginato
        //"alginatousado REAL,alginatoprecounitario REAL,alginatoquantidadegastanoperiodo REAL,alginatovalorgastonoperiodo REAL,alginatodias INTEGER,alginatoprecounitario1 REAL," +
        dados.put("alginatousado", calculadora.getAlginatousado());
        dados.put("alginatoprecounitario", calculadora.getAlginatoprecounitario());
        dados.put("alginatoquantidadegastanoperiodo", calculadora.getAlginatoquantidadegastanoperiodo());
        dados.put("alginatovalorgastonoperiodo", calculadora.getAlginatovalorgastonoperiodo());
        dados.put("alginatodias", calculadora.getAlginatodias());
        dados.put("alginatoprecounitario1", calculadora.getAlginatoprecounitario1());



        return dados;
    }

    public Calculadora bug() {
        String sql = "SELECT * from Produtos2;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);
        Calculadora calculadora= new Calculadora();
        while(c.moveToNext()){


            if (c.getLong(c.getColumnIndex("id")) ==1){
                calculadora.setIdCalculadora(c.getLong(c.getColumnIndex("id")));
                calculadora.setIdPaciente(c.getLong(c.getColumnIndex("idPaciente")));
                calculadora.setPaciente(c.getString(c.getColumnIndex("paciente")));


                calculadora.setSfprecounitario1(c.getFloat(c.getColumnIndex("sfprecounitario1")));
            }

        }
        c.close();
        return calculadora;
    }



    //EXIBIR
    public List<Calculadora> exibir() {
        String sql = "SELECT * from Produtos2;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);
        List<Calculadora> dados = new ArrayList<>();
        while(c.moveToNext()){

            Calculadora calculadora= new Calculadora();
            if (c.getLong(c.getColumnIndex("id")) != 0){
                calculadora.setIdCalculadora(c.getLong(c.getColumnIndex("id")));
                calculadora.setIdPaciente(c.getLong(c.getColumnIndex("idPaciente")));
                calculadora.setPaciente(c.getString(c.getColumnIndex("paciente")));




                ///->REMOVEDOR DE ADESIVO
                calculadora.setRemovedorAdesivousado(c.getFloat(c.getColumnIndex("removedorDeAdesivousado")));
                calculadora.setRemovedorAdesivoprecounitario(c.getFloat(c.getColumnIndex("removedorDeAdesivoprecounitario")));
                calculadora.setRemovedorAdesivoquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("removedorDeAdesivoquantidadegastanoperiodo")));
                calculadora.setRemovedorAdesivovalorgastonoperiodo(c.getFloat(c.getColumnIndex("removedorDeAdesivovalorgastonoperiodo")));
                calculadora.setRemovedorAdesivodias(c.getInt(c.getColumnIndex("removedorDeAdesivodias")));
                calculadora.setRemovedorAdesivoprecounitario1(c.getFloat(c.getColumnIndex("removedorDeAdesivoprecounitario1")));

                ///->REMOVEDOR DE ADESIVO UNIDADE
                calculadora.setRemovedorAdesivoUnidadeusado(c.getFloat(c.getColumnIndex("removedorDeAdesivoUniusado")));
                calculadora.setRemovedorAdesivoUnidadeprecounitario(c.getFloat(c.getColumnIndex("removedorDeAdesivoUniprecounitario")));
                calculadora.setRemovedorAdesivoUnidadequantidadegastanoperiodo(c.getFloat(c.getColumnIndex("removedorDeAdesivoUniquantidadegastanoperiodo")));
                calculadora.setRemovedorAdesivoUnidadevalorgastonoperiodo(c.getFloat(c.getColumnIndex("removedorDeAdesivoUnivalorgastonoperiodo")));
                calculadora.setRemovedorAdesivoUnidadedias(c.getInt(c.getColumnIndex("removedorDeAdesivoUnidias")));
                calculadora.setRemovedorAdesivoUnidadeprecounitario1(c.getFloat(c.getColumnIndex("removedorDeAdesivoUniprecounitario1")));

                //age
                calculadora.setAgeusado(c.getFloat(c.getColumnIndex("ageusado")));
                calculadora.setAgeprecounitario(c.getFloat(c.getColumnIndex("ageprecounitario")));
                calculadora.setAgequantidadegastanoperiodo(c.getFloat(c.getColumnIndex("agequantidadegastanoperiodo")));
                calculadora.setAgevalorgastonoperiodo(c.getFloat(c.getColumnIndex("agevalorgastonoperiodo")));
                calculadora.setAgedias(c.getInt(c.getColumnIndex("agedias")));
                calculadora.setAgeprecounitario1(c.getFloat(c.getColumnIndex("ageprecounitario1")));

                ///-> alginato
                calculadora.setAlginatousado(c.getFloat(c.getColumnIndex("alginatousado")));
                calculadora.setAlginatoprecounitario(c.getFloat(c.getColumnIndex("alginatoprecounitario")));
                calculadora.setAlginatoquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("alginatoquantidadegastanoperiodo")));
                calculadora.setAlginatovalorgastonoperiodo(c.getFloat(c.getColumnIndex("alginatovalorgastonoperiodo")));
                calculadora.setAlginatodias(c.getInt(c.getColumnIndex("alginatodias")));
                calculadora.setAlginatoprecounitario1(c.getFloat(c.getColumnIndex("alginatoprecounitario1")));


                ///->alginatocomprata
                calculadora.setAlginatocompratausado(c.getFloat(c.getColumnIndex("alginatocompratausado")));
                calculadora.setAlginatocomprataprecounitario(c.getFloat(c.getColumnIndex("alginatocomprataprecounitario")));
                calculadora.setAlginatocomprataquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("alginatocomprataquantidadegastanoperiodo")));
                calculadora.setAlginatocompratavalorgastonoperiodo(c.getFloat(c.getColumnIndex("alginatocompratavalorgastonoperiodo")));
                calculadora.setAlginatocompratadias(c.getInt(c.getColumnIndex("alginatocompratadias")));
                calculadora.setAlginatocomprataprecounitario1(c.getFloat(c.getColumnIndex("alginatocomprataprecounitario1")));

                dados.add(calculadora);
            }

        }
        c.close();
        return dados;
    }


    public void atualizaPaciente(Calculadora calculadora){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues dados = pegaDadosDaCalculadora(calculadora);
        String[] params ={String.valueOf(calculadora.getIdPaciente())};
        db.update("Produtos2",dados,"idPaciente = ?",params);
    }



    public Calculadora buscaPacientesComCalculadora(Calculadora calculadora) {
        String sql = "SELECT * from Produtos2;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);

        while(c.moveToNext()){
            if (calculadora.getIdPaciente() == c.getLong(c.getColumnIndex("idPaciente"))){

                calculadora.setIdCalculadora(c.getLong(c.getColumnIndex("id")));
                calculadora.setIdPaciente(c.getLong(c.getColumnIndex("idPaciente")));
                calculadora.setPaciente(c.getString(c.getColumnIndex("paciente")));


                ///->REMOVEDOR DE ADESIVO
                calculadora.setRemovedorAdesivousado(c.getFloat(c.getColumnIndex("removedorDeAdesivousado")));
                calculadora.setRemovedorAdesivoprecounitario(c.getFloat(c.getColumnIndex("removedorDeAdesivoprecounitario")));
                calculadora.setRemovedorAdesivoquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("removedorDeAdesivoquantidadegastanoperiodo")));
                calculadora.setRemovedorAdesivovalorgastonoperiodo(c.getFloat(c.getColumnIndex("removedorDeAdesivovalorgastonoperiodo")));
                calculadora.setRemovedorAdesivodias(c.getInt(c.getColumnIndex("removedorDeAdesivodias")));
                calculadora.setRemovedorAdesivoprecounitario1(c.getFloat(c.getColumnIndex("removedorDeAdesivoprecounitario1")));

                ///->REMOVEDOR DE ADESIVO UNIDADE
                calculadora.setRemovedorAdesivoUnidadeusado(c.getFloat(c.getColumnIndex("removedorDeAdesivoUniusado")));
                calculadora.setRemovedorAdesivoUnidadeprecounitario(c.getFloat(c.getColumnIndex("removedorDeAdesivoUniprecounitario")));
                calculadora.setRemovedorAdesivoUnidadequantidadegastanoperiodo(c.getFloat(c.getColumnIndex("removedorDeAdesivoUniquantidadegastanoperiodo")));
                calculadora.setRemovedorAdesivoUnidadevalorgastonoperiodo(c.getFloat(c.getColumnIndex("removedorDeAdesivoUnivalorgastonoperiodo")));
                calculadora.setRemovedorAdesivoUnidadedias(c.getInt(c.getColumnIndex("removedorDeAdesivoUnidias")));
                calculadora.setRemovedorAdesivoUnidadeprecounitario1(c.getFloat(c.getColumnIndex("removedorDeAdesivoUniprecounitario1")));

                //age
                calculadora.setAgeusado(c.getFloat(c.getColumnIndex("ageusado")));
                calculadora.setAgeprecounitario(c.getFloat(c.getColumnIndex("ageprecounitario")));
                calculadora.setAgequantidadegastanoperiodo(c.getFloat(c.getColumnIndex("agequantidadegastanoperiodo")));
                calculadora.setAgevalorgastonoperiodo(c.getFloat(c.getColumnIndex("agevalorgastonoperiodo")));
                calculadora.setAgedias(c.getInt(c.getColumnIndex("agedias")));
                calculadora.setAgeprecounitario1(c.getFloat(c.getColumnIndex("ageprecounitario1")));

                ///-> alginato
                calculadora.setAlginatousado(c.getFloat(c.getColumnIndex("alginatousado")));
                calculadora.setAlginatoprecounitario(c.getFloat(c.getColumnIndex("alginatoprecounitario")));
                calculadora.setAlginatoquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("alginatoquantidadegastanoperiodo")));
                calculadora.setAlginatovalorgastonoperiodo(c.getFloat(c.getColumnIndex("alginatovalorgastonoperiodo")));
                calculadora.setAlginatodias(c.getInt(c.getColumnIndex("alginatodias")));
                calculadora.setAlginatoprecounitario1(c.getFloat(c.getColumnIndex("alginatoprecounitario1")));


                ///->alginatocomprata
                calculadora.setAlginatocompratausado(c.getFloat(c.getColumnIndex("alginatocompratausado")));
                calculadora.setAlginatocomprataprecounitario(c.getFloat(c.getColumnIndex("alginatocomprataprecounitario")));
                calculadora.setAlginatocomprataquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("alginatocomprataquantidadegastanoperiodo")));
                calculadora.setAlginatocompratavalorgastonoperiodo(c.getFloat(c.getColumnIndex("alginatocompratavalorgastonoperiodo")));
                calculadora.setAlginatocompratadias(c.getInt(c.getColumnIndex("alginatocompratadias")));
                calculadora.setAlginatocomprataprecounitario1(c.getFloat(c.getColumnIndex("alginatocomprataprecounitario1")));


            }
        }
        c.close();
        return calculadora;
    }

    public void atualizaTodosOsPrecosUnitarios() {
        String sql = "SELECT * FROM Produtos2 WHERE id = 1;";
        SQLiteDatabase banco = this.getWritableDatabase();
        Cursor cursor = banco.rawQuery(sql, null);
        cursor.moveToFirst();
        String preco = cursor.getString(cursor.getColumnIndex("sfprecounitario1"));

        up1(preco);
    }
    public void up1(String preco){
        String sql = "SELECT * from Produtos2;";
        SQLiteDatabase db = getWritableDatabase();

        ContentValues dados = new ContentValues();
        dados.put("sfprecounitario1",preco);
        int aux =1;
        while(aux<100){
            String[] params ={String.valueOf(aux)};
            db.update("Produtos2",dados,"id=?",params);
            aux=aux+1;
        }
    }


    public void deletaPAResultados(Calculadora calculadora) {
        SQLiteDatabase db = getWritableDatabase();
        String[] params = {String.valueOf(calculadora.getIdCalculadora())};
        db.delete("Produtos2","id = ?", params);
    }
    public void deletaPAllResultados() {

        SQLiteDatabase db = getWritableDatabase();
        long aux = 1;
        while (aux<1000) {
            String[] params = {String.valueOf(aux)};
            db.delete("Produtos2", "id = ?", params);
            aux++;
        }
  }
    }

