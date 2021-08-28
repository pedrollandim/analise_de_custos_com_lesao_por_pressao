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

public class CalculadoraDAO11 extends SQLiteOpenHelper {


    public CalculadoraDAO11(Context context) {

        super(context, "planilha11", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Produtos11 (id INTEGER PRIMARY KEY,idPaciente INTEGER, paciente TEXT," +
                //"sfusado REAL,sfpreco REAL,sfquantidade REAL,sfcustodopaciente REAL,sfmediadecustodopaciente REAL,sfdias INTEGER,sfpreco1 REAL,sfquantidade1 REAL," +

                "tecnicoenfermenfermeiromusado REAL,tecnicoenfermenfermeiromprecounitario REAL,tecnicoenfermenfermeiromquantidadegastanoperiodo REAL,tecnicoenfermenfermeiromvalorgastonoperiodo REAL,tecnicoenfermenfermeiromdias INTEGER,tecnicoenfermenfermeiromprecounitario1 REAL," +
                "enfermeirousado REAL,enfermeiroprecounitario REAL,enfermeiroquantidadegastanoperiodo REAL,enfermeirovalorgastonoperiodo REAL,enfermeirodias INTEGER,enfermeiroprecounitario1 REAL," +
                "enfermeiroespecialistausado REAL,enfermeiroespecialistaprecounitario REAL,enfermeiroespecialistaquantidadegastanoperiodo REAL,enfermeiroespecialistavalorgastonoperiodo REAL,enfermeiroespecialistadias INTEGER,enfermeiroespecialistaprecounitario1 REAL," +
                "medicousado REAL,medicoprecounitario REAL,medicoquantidadegastanoperiodo REAL,medicovalorgastonoperiodo REAL,medicodias INTEGER,medicoprecounitario1 REAL);";


        db.execSQL(sql);
    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Produtos11";
        db.execSQL(sql);
        onCreate(db);
    }

    public Calculadora insere(Calculadora calculadora) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues dados = pegaDadosDaCalculadora(calculadora);
        db.insert("Produtos11", null, dados);
        return calculadora;
    }

    @NonNull
    private ContentValues pegaDadosDaCalculadora(Calculadora calculadora) {
        ContentValues dados = new ContentValues();
        dados.put("paciente", calculadora.getPaciente());
        dados.put("idPaciente", calculadora.getIdPaciente());

        ///-> tecnicoenfermenfermeirom
        dados.put("tecnicoenfermenfermeiromusado", calculadora.getTecnicoenfermenfermeiromusado());
        dados.put("tecnicoenfermenfermeiromprecounitario", calculadora.getTecnicoenfermenfermeiromprecounitario());
        dados.put("tecnicoenfermenfermeiromquantidadegastanoperiodo", calculadora.getTecnicoenfermenfermeiromquantidadegastanoperiodo());
        dados.put("tecnicoenfermenfermeiromvalorgastonoperiodo", calculadora.getTecnicoenfermenfermeiromvalorgastonoperiodo());
        dados.put("tecnicoenfermenfermeiromdias", calculadora.getTecnicoenfermenfermeiromdias());
        dados.put("tecnicoenfermenfermeiromprecounitario1", calculadora.getTecnicoenfermenfermeiromprecounitario1());

        ///->enfermeiro
        dados.put("enfermeirousado", calculadora.getEnfermeirousado());
        dados.put("enfermeiroprecounitario", calculadora.getEnfermeiroprecounitario());
        dados.put("enfermeiroquantidadegastanoperiodo", calculadora.getEnfermeiroquantidadegastanoperiodo());
        dados.put("enfermeirovalorgastonoperiodo", calculadora.getEnfermeirovalorgastonoperiodo());
        dados.put("enfermeirodias", calculadora.getEnfermeirodias());
        dados.put("enfermeiroprecounitario1", calculadora.getEnfermeiroprecounitario1());

        ///->enfermeiroespecialista
        dados.put("enfermeiroespecialistausado", calculadora.getEnfermeiroespecialistausado());
        dados.put("enfermeiroespecialistaprecounitario", calculadora.getEnfermeiroespecialistaprecounitario());
        dados.put("enfermeiroespecialistaquantidadegastanoperiodo", calculadora.getEnfermeiroespecialistaquantidadegastanoperiodo());
        dados.put("enfermeiroespecialistavalorgastonoperiodo", calculadora.getEnfermeiroespecialistavalorgastonoperiodo());
        dados.put("enfermeiroespecialistadias", calculadora.getEnfermeiroespecialistadias());
        dados.put("enfermeiroespecialistaprecounitario1", calculadora.getEnfermeiroespecialistaprecounitario1());

        ///->medico
        dados.put("medicousado", calculadora.getMedicousado());
        dados.put("medicoprecounitario", calculadora.getMedicoprecounitario());
        dados.put("medicoquantidadegastanoperiodo", calculadora.getMedicoquantidadegastanoperiodo());
        dados.put("medicovalorgastonoperiodo", calculadora.getMedicovalorgastonoperiodo());
        dados.put("medicodias", calculadora.getMedicodias());
        dados.put("medicoprecounitario1", calculadora.getMedicoprecounitario1());



        return dados;
    }





    //EXIBIR
    public List<Calculadora> exibir() {
        String sql = "SELECT * from Produtos11;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);
        List<Calculadora> dados = new ArrayList<>();
        while (c.moveToNext()) {

            Calculadora calculadora = new Calculadora();
            if (c.getLong(c.getColumnIndex("id")) != 0) {
                calculadora.setIdCalculadora(c.getLong(c.getColumnIndex("id")));
                calculadora.setIdPaciente(c.getLong(c.getColumnIndex("idPaciente")));
                calculadora.setPaciente(c.getString(c.getColumnIndex("paciente")));

                //tecnicoenfermenfermeirom
                calculadora.setTecnicoenfermenfermeiromusado(c.getFloat(c.getColumnIndex("tecnicoenfermenfermeiromusado")));
                calculadora.setTecnicoenfermenfermeiromprecounitario(c.getFloat(c.getColumnIndex("tecnicoenfermenfermeiromprecounitario")));
                calculadora.setTecnicoenfermenfermeiromquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("tecnicoenfermenfermeiromquantidadegastanoperiodo")));
                calculadora.setTecnicoenfermenfermeiromvalorgastonoperiodo(c.getFloat(c.getColumnIndex("tecnicoenfermenfermeiromvalorgastonoperiodo")));
                calculadora.setTecnicoenfermenfermeiromdias(c.getInt(c.getColumnIndex("tecnicoenfermenfermeiromdias")));
                calculadora.setTecnicoenfermenfermeiromprecounitario1(c.getFloat(c.getColumnIndex("tecnicoenfermenfermeiromprecounitario1")));

                ///-> enfermeiro
                calculadora.setEnfermeirousado(c.getFloat(c.getColumnIndex("enfermeirousado")));
                calculadora.setEnfermeiroprecounitario(c.getFloat(c.getColumnIndex("enfermeiroprecounitario")));
                calculadora.setEnfermeiroquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("enfermeiroquantidadegastanoperiodo")));
                calculadora.setEnfermeirovalorgastonoperiodo(c.getFloat(c.getColumnIndex("enfermeirovalorgastonoperiodo")));
                calculadora.setEnfermeirodias(c.getInt(c.getColumnIndex("enfermeirodias")));
                calculadora.setEnfermeiroprecounitario1(c.getFloat(c.getColumnIndex("enfermeiroprecounitario1")));


                ///->enfermeiroespecialista
                calculadora.setEnfermeiroespecialistausado(c.getFloat(c.getColumnIndex("enfermeiroespecialistausado")));
                calculadora.setEnfermeiroespecialistaprecounitario(c.getFloat(c.getColumnIndex("enfermeiroespecialistaprecounitario")));
                calculadora.setEnfermeiroespecialistaquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("enfermeiroespecialistaquantidadegastanoperiodo")));
                calculadora.setEnfermeiroespecialistavalorgastonoperiodo(c.getFloat(c.getColumnIndex("enfermeiroespecialistavalorgastonoperiodo")));
                calculadora.setEnfermeiroespecialistadias(c.getInt(c.getColumnIndex("enfermeiroespecialistadias")));
                calculadora.setEnfermeiroespecialistaprecounitario1(c.getFloat(c.getColumnIndex("enfermeiroespecialistaprecounitario1")));

                ///->medico
                calculadora.setMedicousado(c.getFloat(c.getColumnIndex("medicousado")));
                calculadora.setMedicoprecounitario(c.getFloat(c.getColumnIndex("medicoprecounitario")));
                calculadora.setMedicoquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("medicoquantidadegastanoperiodo")));
                calculadora.setMedicovalorgastonoperiodo(c.getFloat(c.getColumnIndex("medicovalorgastonoperiodo")));
                calculadora.setMedicodias(c.getInt(c.getColumnIndex("medicodias")));
                calculadora.setMedicoprecounitario1(c.getFloat(c.getColumnIndex("medicoprecounitario1")));

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
        db.update("Produtos11", dados, "idPaciente = ?", params);
    }



    public Calculadora buscaPacientesComCalculadora(Calculadora calculadora) {
        String sql = "SELECT * from Produtos11;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);

        while (c.moveToNext()) {
            if (calculadora.getIdPaciente() == c.getLong(c.getColumnIndex("idPaciente"))) {

                calculadora.setIdCalculadora(c.getLong(c.getColumnIndex("id")));
                calculadora.setIdPaciente(c.getLong(c.getColumnIndex("idPaciente")));
                calculadora.setPaciente(c.getString(c.getColumnIndex("paciente")));

                //tecnicoenfermenfermeirom
                calculadora.setTecnicoenfermenfermeiromusado(c.getFloat(c.getColumnIndex("tecnicoenfermenfermeiromusado")));
                calculadora.setTecnicoenfermenfermeiromprecounitario(c.getFloat(c.getColumnIndex("tecnicoenfermenfermeiromprecounitario")));
                calculadora.setTecnicoenfermenfermeiromquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("tecnicoenfermenfermeiromquantidadegastanoperiodo")));
                calculadora.setTecnicoenfermenfermeiromvalorgastonoperiodo(c.getFloat(c.getColumnIndex("tecnicoenfermenfermeiromvalorgastonoperiodo")));
                calculadora.setTecnicoenfermenfermeiromdias(c.getInt(c.getColumnIndex("tecnicoenfermenfermeiromdias")));
                calculadora.setTecnicoenfermenfermeiromprecounitario1(c.getFloat(c.getColumnIndex("tecnicoenfermenfermeiromprecounitario1")));

                ///-> enfermeiro
                calculadora.setEnfermeirousado(c.getFloat(c.getColumnIndex("enfermeirousado")));
                calculadora.setEnfermeiroprecounitario(c.getFloat(c.getColumnIndex("enfermeiroprecounitario")));
                calculadora.setEnfermeiroquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("enfermeiroquantidadegastanoperiodo")));
                calculadora.setEnfermeirovalorgastonoperiodo(c.getFloat(c.getColumnIndex("enfermeirovalorgastonoperiodo")));
                calculadora.setEnfermeirodias(c.getInt(c.getColumnIndex("enfermeirodias")));
                calculadora.setEnfermeiroprecounitario1(c.getFloat(c.getColumnIndex("enfermeiroprecounitario1")));


                ///->enfermeiroespecialista
                calculadora.setEnfermeiroespecialistausado(c.getFloat(c.getColumnIndex("enfermeiroespecialistausado")));
                calculadora.setEnfermeiroespecialistaprecounitario(c.getFloat(c.getColumnIndex("enfermeiroespecialistaprecounitario")));
                calculadora.setEnfermeiroespecialistaquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("enfermeiroespecialistaquantidadegastanoperiodo")));
                calculadora.setEnfermeiroespecialistavalorgastonoperiodo(c.getFloat(c.getColumnIndex("enfermeiroespecialistavalorgastonoperiodo")));
                calculadora.setEnfermeiroespecialistadias(c.getInt(c.getColumnIndex("enfermeiroespecialistadias")));
                calculadora.setEnfermeiroespecialistaprecounitario1(c.getFloat(c.getColumnIndex("enfermeiroespecialistaprecounitario1")));

                ///->medico
                calculadora.setMedicousado(c.getFloat(c.getColumnIndex("medicousado")));
                calculadora.setMedicoprecounitario(c.getFloat(c.getColumnIndex("medicoprecounitario")));
                calculadora.setMedicoquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("medicoquantidadegastanoperiodo")));
                calculadora.setMedicovalorgastonoperiodo(c.getFloat(c.getColumnIndex("medicovalorgastonoperiodo")));
                calculadora.setMedicodias(c.getInt(c.getColumnIndex("medicodias")));
                calculadora.setMedicoprecounitario1(c.getFloat(c.getColumnIndex("medicoprecounitario1")));



            }
        }
        c.close();
        return calculadora;
    }

    public void atualizaTodosOsPrecosUnitarios() {
        String sql = "SELECT * FROM Produtos11 WHERE id = 1;";
        SQLiteDatabase banco = this.getWritableDatabase();
        Cursor cursor = banco.rawQuery(sql, null);
        cursor.moveToFirst();
        String preco = cursor.getString(cursor.getColumnIndex("sfprecounitario1"));

        up1(preco);
    }
    public void up1(String preco) {
        String sql = "SELECT * from Produtos11;";
        SQLiteDatabase db = getWritableDatabase();

        ContentValues dados = new ContentValues();
        dados.put("sfprecounitario1", preco);
        int aux = 1;
        while (aux < 100) {
            String[] params = { String.valueOf(aux) };
            db.update("Produtos11", dados, "id=?", params);
            aux = aux + 1;
        }
    }


    public void deletaPAResultados(Calculadora calculadora) {
        SQLiteDatabase db = getWritableDatabase();
        String[] params = { String.valueOf(calculadora.getIdCalculadora()) };
        db.delete("Produtos11", "id = ?", params);
    }
    public void deletaPAllResultados() {

        SQLiteDatabase db = getWritableDatabase();
        long aux = 1;
        while (aux < 1000) {
            String[] params = { String.valueOf(aux) };
            db.delete("Produtos11", "id = ?", params);
            aux++;
        }
    }
}


