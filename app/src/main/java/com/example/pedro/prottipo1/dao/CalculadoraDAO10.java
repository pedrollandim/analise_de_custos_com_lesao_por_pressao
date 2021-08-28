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


public class CalculadoraDAO10 extends SQLiteOpenHelper {


    public CalculadoraDAO10(Context context) {

        super(context, "planilha10", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Produtos10 (id INTEGER PRIMARY KEY,idPaciente INTEGER, paciente TEXT," +
                //"sfusado REAL,sfpreco REAL,sfquantidade REAL,sfcustodopaciente REAL,sfmediadecustodopaciente REAL,sfdias INTEGER,sfpreco1 REAL,sfquantidade1 REAL," +

                "desbridamentocirurgicousado REAL, desbridamentocirurgicoprecounitario REAL, desbridamentocirurgicoquantidadegastanoperiodo REAL, desbridamentocirurgicovalorgastonoperiodo REAL, desbridamentocirurgicodias INTEGER, desbridamentocirurgicoprecounitario1 REAL, " +
                "taxadesalausado REAL,taxadesalaprecounitario REAL,taxadesalaquantidadegastanoperiodo REAL,taxadesalavalorgastonoperiodo REAL,taxadesaladias INTEGER,taxadesalaprecounitario1 REAL," +
                "analgesicoantiinflamatoriousado REAL,analgesicoantiinflamatorioprecounitario REAL,analgesicoantiinflamatorioquantidadegastanoperiodo REAL,analgesicoantiinflamatoriovalorgastonoperiodo REAL,analgesicoantiinflamatoriodias INTEGER,analgesicoantiinflamatorioprecounitario1 REAL," +
                "analgesicousado REAL,analgesicoprecounitario REAL,analgesicoquantidadegastanoperiodo REAL,analgesicovalorgastonoperiodo REAL,analgesicodias INTEGER,analgesicoprecounitario1 REAL," +
                "antibioticousado REAL,antibioticoprecounitario REAL,antibioticoquantidadegastanoperiodo REAL,antibioticovalorgastonoperiodo REAL,antibioticodias INTEGER,antibioticoprecounitario1 REAL);";


        db.execSQL(sql);
    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Produtos10";
        db.execSQL(sql);
        onCreate(db);
    }

    public Calculadora insere(Calculadora calculadora) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues dados = pegaDadosDaCalculadora(calculadora);
        db.insert("Produtos10", null, dados);
        return calculadora;
    }

    @NonNull
    private ContentValues pegaDadosDaCalculadora(Calculadora calculadora) {
        ContentValues dados = new ContentValues();
        dados.put("paciente", calculadora.getPaciente());
        dados.put("idPaciente", calculadora.getIdPaciente());

        ///->desbridamentocirurgico
        dados.put("desbridamentocirurgicousado", calculadora.getDesbridamentocirurgicousado());
        dados.put("desbridamentocirurgicoprecounitario", calculadora.getDesbridamentocirurgicoprecounitario());
        dados.put("desbridamentocirurgicoquantidadegastanoperiodo", calculadora.getDesbridamentocirurgicoquantidadegastanoperiodo());
        dados.put("desbridamentocirurgicovalorgastonoperiodo", calculadora.getDesbridamentocirurgicovalorgastonoperiodo());
        dados.put("desbridamentocirurgicodias", calculadora.getDesbridamentocirurgicodias());
        dados.put("desbridamentocirurgicoprecounitario1", calculadora.getDesbridamentocirurgicoprecounitario1());

        ///->taxadesala
        dados.put("taxadesalausado", calculadora.getTaxadesalausado());
        dados.put("taxadesalaprecounitario", calculadora.getTaxadesalaprecounitario());
        dados.put("taxadesalaquantidadegastanoperiodo", calculadora.getTaxadesalaquantidadegastanoperiodo());
        dados.put("taxadesalavalorgastonoperiodo", calculadora.getTaxadesalavalorgastonoperiodo());
        dados.put("taxadesaladias", calculadora.getTaxadesaladias());
        dados.put("taxadesalaprecounitario1", calculadora.getTaxadesalaprecounitario1());

        ///->analgesicoantiinflamatorio
        dados.put("analgesicoantiinflamatoriousado", calculadora.getAnalgesicoantiinflamatoriousado());
        dados.put("analgesicoantiinflamatorioprecounitario", calculadora.getAnalgesicoantiinflamatorioprecounitario());
        dados.put("analgesicoantiinflamatorioquantidadegastanoperiodo", calculadora.getAnalgesicoantiinflamatorioquantidadegastanoperiodo());
        dados.put("analgesicoantiinflamatoriovalorgastonoperiodo", calculadora.getAnalgesicoantiinflamatoriovalorgastonoperiodo());
        dados.put("analgesicoantiinflamatoriodias", calculadora.getAnalgesicoantiinflamatoriodias());
        dados.put("analgesicoantiinflamatorioprecounitario1", calculadora.getAnalgesicoantiinflamatorioprecounitario1());


        ///->analgesico
        dados.put("analgesicousado", calculadora.getAnalgesicousado());
        dados.put("analgesicoprecounitario", calculadora.getAnalgesicoprecounitario());
        dados.put("analgesicoquantidadegastanoperiodo", calculadora.getAnalgesicoquantidadegastanoperiodo());
        dados.put("analgesicovalorgastonoperiodo", calculadora.getAnalgesicovalorgastonoperiodo());
        dados.put("analgesicodias", calculadora.getAnalgesicodias());
        dados.put("analgesicoprecounitario1", calculadora.getAnalgesicoprecounitario1());

        ///-> antibiotico
        //"antibioticousado REAL,antibioticoprecounitario REAL,antibioticoquantidadegastanoperiodo REAL,antibioticovalorgastonoperiodo REAL,antibioticodias INTEGER,antibioticoprecounitario1 REAL," +
        dados.put("antibioticousado", calculadora.getAntibioticousado());
        dados.put("antibioticoprecounitario", calculadora.getAntibioticoprecounitario());
        dados.put("antibioticoquantidadegastanoperiodo", calculadora.getAntibioticoquantidadegastanoperiodo());
        dados.put("antibioticovalorgastonoperiodo", calculadora.getAntibioticovalorgastonoperiodo());
        dados.put("antibioticodias", calculadora.getAntibioticodias());
        dados.put("antibioticoprecounitario1", calculadora.getAntibioticoprecounitario1());





        return dados;
    }





    //EXIBIR
    public List<Calculadora> exibir() {
        String sql = "SELECT * from Produtos10;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);
        List<Calculadora> dados = new ArrayList<>();
        while (c.moveToNext()) {

            Calculadora calculadora = new Calculadora();
            if (c.getLong(c.getColumnIndex("id")) != 0) {
                calculadora.setIdCalculadora(c.getLong(c.getColumnIndex("id")));
                calculadora.setIdPaciente(c.getLong(c.getColumnIndex("idPaciente")));
                calculadora.setPaciente(c.getString(c.getColumnIndex("paciente")));

                ///->desbridamentocirurgico
                calculadora.setDesbridamentocirurgicousado(c.getFloat(c.getColumnIndex("desbridamentocirurgicousado")));
                calculadora.setDesbridamentocirurgicoprecounitario(c.getFloat(c.getColumnIndex("desbridamentocirurgicoprecounitario")));
                calculadora.setDesbridamentocirurgicoquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("desbridamentocirurgicoquantidadegastanoperiodo")));
                calculadora.setDesbridamentocirurgicovalorgastonoperiodo(c.getFloat(c.getColumnIndex("desbridamentocirurgicovalorgastonoperiodo")));
                calculadora.setDesbridamentocirurgicodias(c.getInt(c.getColumnIndex("desbridamentocirurgicodias")));
                calculadora.setDesbridamentocirurgicoprecounitario1(c.getFloat(c.getColumnIndex("desbridamentocirurgicoprecounitario1")));

                ///->taxadesala
                calculadora.setTaxadesalausado(c.getFloat(c.getColumnIndex("taxadesalausado")));
                calculadora.setTaxadesalaprecounitario(c.getFloat(c.getColumnIndex("taxadesalaprecounitario")));
                calculadora.setTaxadesalaquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("taxadesalaquantidadegastanoperiodo")));
                calculadora.setTaxadesalavalorgastonoperiodo(c.getFloat(c.getColumnIndex("taxadesalavalorgastonoperiodo")));
                calculadora.setTaxadesaladias(c.getInt(c.getColumnIndex("taxadesaladias")));
                calculadora.setTaxadesalaprecounitario1(c.getFloat(c.getColumnIndex("taxadesalaprecounitario1")));


                ///->analgesicoantiinflamatorio
                calculadora.setAnalgesicoantiinflamatoriousado(c.getFloat(c.getColumnIndex("analgesicoantiinflamatoriousado")));
                calculadora.setAnalgesicoantiinflamatorioprecounitario(c.getFloat(c.getColumnIndex("analgesicoantiinflamatorioprecounitario")));
                calculadora.setAnalgesicoantiinflamatorioquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("analgesicoantiinflamatorioquantidadegastanoperiodo")));
                calculadora.setAnalgesicoantiinflamatoriovalorgastonoperiodo(c.getFloat(c.getColumnIndex("analgesicoantiinflamatoriovalorgastonoperiodo")));
                calculadora.setAnalgesicoantiinflamatoriodias(c.getInt(c.getColumnIndex("analgesicoantiinflamatoriodias")));
                calculadora.setAnalgesicoantiinflamatorioprecounitario1(c.getFloat(c.getColumnIndex("analgesicoantiinflamatorioprecounitario1")));

                ///->analgesico
                calculadora.setAnalgesicousado(c.getFloat(c.getColumnIndex("analgesicousado")));
                calculadora.setAnalgesicoprecounitario(c.getFloat(c.getColumnIndex("analgesicoprecounitario")));
                calculadora.setAnalgesicoquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("analgesicoquantidadegastanoperiodo")));
                calculadora.setAnalgesicovalorgastonoperiodo(c.getFloat(c.getColumnIndex("analgesicovalorgastonoperiodo")));
                calculadora.setAnalgesicodias(c.getInt(c.getColumnIndex("analgesicodias")));
                calculadora.setAnalgesicoprecounitario1(c.getFloat(c.getColumnIndex("analgesicoprecounitario1")));

                ///->antibiotico
                calculadora.setAntibioticousado(c.getFloat(c.getColumnIndex("antibioticousado")));
                calculadora.setAntibioticoprecounitario(c.getFloat(c.getColumnIndex("antibioticoprecounitario")));
                calculadora.setAntibioticoquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("antibioticoquantidadegastanoperiodo")));
                calculadora.setAntibioticovalorgastonoperiodo(c.getFloat(c.getColumnIndex("antibioticovalorgastonoperiodo")));
                calculadora.setAntibioticodias(c.getInt(c.getColumnIndex("antibioticodias")));
                calculadora.setAntibioticoprecounitario1(c.getFloat(c.getColumnIndex("antibioticoprecounitario1")));



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
        db.update("Produtos10", dados, "idPaciente = ?", params);
    }



    public Calculadora buscaPacientesComCalculadora(Calculadora calculadora) {
        String sql = "SELECT * from Produtos10;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);

        while (c.moveToNext()) {
            if (calculadora.getIdPaciente() == c.getLong(c.getColumnIndex("idPaciente"))) {

                calculadora.setIdCalculadora(c.getLong(c.getColumnIndex("id")));
                calculadora.setIdPaciente(c.getLong(c.getColumnIndex("idPaciente")));
                calculadora.setPaciente(c.getString(c.getColumnIndex("paciente")));

                ///->desbridamentocirurgico
                calculadora.setDesbridamentocirurgicousado(c.getFloat(c.getColumnIndex("desbridamentocirurgicousado")));
                calculadora.setDesbridamentocirurgicoprecounitario(c.getFloat(c.getColumnIndex("desbridamentocirurgicoprecounitario")));
                calculadora.setDesbridamentocirurgicoquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("desbridamentocirurgicoquantidadegastanoperiodo")));
                calculadora.setDesbridamentocirurgicovalorgastonoperiodo(c.getFloat(c.getColumnIndex("desbridamentocirurgicovalorgastonoperiodo")));
                calculadora.setDesbridamentocirurgicodias(c.getInt(c.getColumnIndex("desbridamentocirurgicodias")));
                calculadora.setDesbridamentocirurgicoprecounitario1(c.getFloat(c.getColumnIndex("desbridamentocirurgicoprecounitario1")));

                ///->taxadesala
                calculadora.setTaxadesalausado(c.getFloat(c.getColumnIndex("taxadesalausado")));
                calculadora.setTaxadesalaprecounitario(c.getFloat(c.getColumnIndex("taxadesalaprecounitario")));
                calculadora.setTaxadesalaquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("taxadesalaquantidadegastanoperiodo")));
                calculadora.setTaxadesalavalorgastonoperiodo(c.getFloat(c.getColumnIndex("taxadesalavalorgastonoperiodo")));
                calculadora.setTaxadesaladias(c.getInt(c.getColumnIndex("taxadesaladias")));
                calculadora.setTaxadesalaprecounitario1(c.getFloat(c.getColumnIndex("taxadesalaprecounitario1")));


                ///->analgesicoantiinflamatorio
                calculadora.setAnalgesicoantiinflamatoriousado(c.getFloat(c.getColumnIndex("analgesicoantiinflamatoriousado")));
                calculadora.setAnalgesicoantiinflamatorioprecounitario(c.getFloat(c.getColumnIndex("analgesicoantiinflamatorioprecounitario")));
                calculadora.setAnalgesicoantiinflamatorioquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("analgesicoantiinflamatorioquantidadegastanoperiodo")));
                calculadora.setAnalgesicoantiinflamatoriovalorgastonoperiodo(c.getFloat(c.getColumnIndex("analgesicoantiinflamatoriovalorgastonoperiodo")));
                calculadora.setAnalgesicoantiinflamatoriodias(c.getInt(c.getColumnIndex("analgesicoantiinflamatoriodias")));
                calculadora.setAnalgesicoantiinflamatorioprecounitario1(c.getFloat(c.getColumnIndex("analgesicoantiinflamatorioprecounitario1")));

                ///->analgesico
                calculadora.setAnalgesicousado(c.getFloat(c.getColumnIndex("analgesicousado")));
                calculadora.setAnalgesicoprecounitario(c.getFloat(c.getColumnIndex("analgesicoprecounitario")));
                calculadora.setAnalgesicoquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("analgesicoquantidadegastanoperiodo")));
                calculadora.setAnalgesicovalorgastonoperiodo(c.getFloat(c.getColumnIndex("analgesicovalorgastonoperiodo")));
                calculadora.setAnalgesicodias(c.getInt(c.getColumnIndex("analgesicodias")));
                calculadora.setAnalgesicoprecounitario1(c.getFloat(c.getColumnIndex("analgesicoprecounitario1")));

                ///->antibiotico
                calculadora.setAntibioticousado(c.getFloat(c.getColumnIndex("antibioticousado")));
                calculadora.setAntibioticoprecounitario(c.getFloat(c.getColumnIndex("antibioticoprecounitario")));
                calculadora.setAntibioticoquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("antibioticoquantidadegastanoperiodo")));
                calculadora.setAntibioticovalorgastonoperiodo(c.getFloat(c.getColumnIndex("antibioticovalorgastonoperiodo")));
                calculadora.setAntibioticodias(c.getInt(c.getColumnIndex("antibioticodias")));
                calculadora.setAntibioticoprecounitario1(c.getFloat(c.getColumnIndex("antibioticoprecounitario1")));



            }
        }
        c.close();
        return calculadora;
    }

    public void atualizaTodosOsPrecosUnitarios() {
        String sql = "SELECT * FROM Produtos10 WHERE id = 1;";
        SQLiteDatabase banco = this.getWritableDatabase();
        Cursor cursor = banco.rawQuery(sql, null);
        cursor.moveToFirst();
        String preco = cursor.getString(cursor.getColumnIndex("sfprecounitario1"));

        up1(preco);
    }
    public void up1(String preco) {
        String sql = "SELECT * from Produtos10;";
        SQLiteDatabase db = getWritableDatabase();

        ContentValues dados = new ContentValues();
        dados.put("sfprecounitario1", preco);
        int aux = 1;
        while (aux < 100) {
            String[] params = { String.valueOf(aux) };
            db.update("Produtos10", dados, "id=?", params);
            aux = aux + 1;
        }
    }


    public void deletaPAResultados(Calculadora calculadora) {
        SQLiteDatabase db = getWritableDatabase();
        String[] params = { String.valueOf(calculadora.getIdCalculadora()) };
        db.delete("Produtos10", "id = ?", params);
    }
    public void deletaPAllResultados() {

        SQLiteDatabase db = getWritableDatabase();
        long aux = 1;
        while (aux < 1000) {
            String[] params = { String.valueOf(aux) };
            db.delete("Produtos10", "id = ?", params);
            aux++;
        }
    }
}


