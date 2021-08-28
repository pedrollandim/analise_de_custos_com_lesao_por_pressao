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


public class CalculadoraDAO5 extends SQLiteOpenHelper {


    public CalculadoraDAO5(Context context) {

        super(context, "planilha5", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Produtos5 (id INTEGER PRIMARY KEY,idPaciente INTEGER, paciente TEXT," +
                //"sfusado REAL,sfpreco REAL,sfquantidade REAL,sfcustodopaciente REAL,sfmediadecustodopaciente REAL,sfdias INTEGER,sfpreco1 REAL,sfquantidade1 REAL," +

                "papainausado REAL,papainaprecounitario REAL,papainaquantidadegastanoperiodo REAL,papainavalorgastonoperiodo REAL,papainadias INTEGER,papainaprecounitario1 REAL," +
                "sulfadiazinapratausado REAL,sulfadiazinaprataprecounitario REAL,sulfadiazinaprataquantidadegastanoperiodo REAL,sulfadiazinapratavalorgastonoperiodo REAL,sulfadiazinapratadias INTEGER,sulfadiazinaprataprecounitario1 REAL," +
                "kolagenaseusado REAL,kolagenaseprecounitario REAL,kolagenasequantidadegastanoperiodo REAL,kolagenasevalorgastonoperiodo REAL,kolagenasedias INTEGER,kolagenaseprecounitario1 REAL," +
                "telapratananocristalinausado REAL,telapratananocristalinaprecounitario REAL,telapratananocristalinaquantidadegastanoperiodo REAL,telapratananocristalinavalorgastonoperiodo REAL,telapratananocristalinadias INTEGER,telapratananocristalinaprecounitario1 REAL," +
                "rayonusado REAL,rayonprecounitario REAL,rayonquantidadegastanoperiodo REAL,rayonvalorgastonoperiodo REAL,rayondias INTEGER,rayonprecounitario1 REAL);";


        db.execSQL(sql);
    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Produtos5";
        db.execSQL(sql);
        onCreate(db);
    }

    public Calculadora insere(Calculadora calculadora) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues dados = pegaDadosDaCalculadora(calculadora);
        db.insert("Produtos5", null, dados);
        return calculadora;
    }

    @NonNull
    private ContentValues pegaDadosDaCalculadora(Calculadora calculadora) {
        ContentValues dados = new ContentValues();
        dados.put("paciente", calculadora.getPaciente());
        dados.put("idPaciente", calculadora.getIdPaciente());

        ///->papaina
        dados.put("papainausado", calculadora.getPapainausado());
        dados.put("papainaprecounitario", calculadora.getPapainaprecounitario());
        dados.put("papainaquantidadegastanoperiodo", calculadora.getPapainaquantidadegastanoperiodo());
        dados.put("papainavalorgastonoperiodo", calculadora.getPapainavalorgastonoperiodo());
        dados.put("papainadias", calculadora.getPapainadias());
        dados.put("papainaprecounitario1", calculadora.getPapainaprecounitario1());

        ///->sulfadiazinaprata
        dados.put("sulfadiazinapratausado", calculadora.getSulfadiazinapratausado());
        dados.put("sulfadiazinaprataprecounitario", calculadora.getSulfadiazinaprataprecounitario());
        dados.put("sulfadiazinaprataquantidadegastanoperiodo", calculadora.getSulfadiazinaprataquantidadegastanoperiodo());
        dados.put("sulfadiazinapratavalorgastonoperiodo", calculadora.getSulfadiazinapratavalorgastonoperiodo());
        dados.put("sulfadiazinapratadias", calculadora.getSulfadiazinapratadias());
        dados.put("sulfadiazinaprataprecounitario1", calculadora.getSulfadiazinaprataprecounitario1());

        ///->kolagenase
        dados.put("kolagenaseusado", calculadora.getKolagenaseusado());
        dados.put("kolagenaseprecounitario", calculadora.getKolagenaseprecounitario());
        dados.put("kolagenasequantidadegastanoperiodo", calculadora.getKolagenasequantidadegastanoperiodo());
        dados.put("kolagenasevalorgastonoperiodo", calculadora.getKolagenasevalorgastonoperiodo());
        dados.put("kolagenasedias", calculadora.getKolagenasedias());
        dados.put("kolagenaseprecounitario1", calculadora.getKolagenaseprecounitario1());


        ///->telapratananocristalinagetT
        dados.put("telapratananocristalinausado", calculadora.getTelapratananocristalinausado());
        dados.put("telapratananocristalinaprecounitario", calculadora.getTelapratananocristalinaprecounitario());
        dados.put("telapratananocristalinaquantidadegastanoperiodo", calculadora.getTelapratananocristalinaquantidadegastanoperiodo());
        dados.put("telapratananocristalinavalorgastonoperiodo", calculadora.getTelapratananocristalinavalorgastonoperiodo());
        dados.put("telapratananocristalinadias", calculadora.getTelapratananocristalinadias());
        dados.put("telapratananocristalinaprecounitario1", calculadora.getTelapratananocristalinaprecounitario1());

        ///-> rayon
        //"rayonusado REAL,rayonprecounitario REAL,rayonquantidadegastanoperiodo REAL,rayonvalorgastonoperiodo REAL,rayondias INTEGER,rayonprecounitario1 REAL," +
        dados.put("rayonusado", calculadora.getRayonusado());
        dados.put("rayonprecounitario", calculadora.getRayonprecounitario());
        dados.put("rayonquantidadegastanoperiodo", calculadora.getRayonquantidadegastanoperiodo());
        dados.put("rayonvalorgastonoperiodo", calculadora.getRayonvalorgastonoperiodo());
        dados.put("rayondias", calculadora.getRayondias());
        dados.put("rayonprecounitario1", calculadora.getRayonprecounitario1());





        return dados;
    }





    //EXIBIR
    public List<Calculadora> exibir() {
        String sql = "SELECT * from Produtos5;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);
        List<Calculadora> dados = new ArrayList<>();
        while (c.moveToNext()) {

            Calculadora calculadora = new Calculadora();
            if (c.getLong(c.getColumnIndex("id")) != 0) {
                calculadora.setIdCalculadora(c.getLong(c.getColumnIndex("id")));
                calculadora.setIdPaciente(c.getLong(c.getColumnIndex("idPaciente")));
                calculadora.setPaciente(c.getString(c.getColumnIndex("paciente")));

                ///->papaina
                calculadora.setPapainausado(c.getFloat(c.getColumnIndex("papainausado")));
                calculadora.setPapainaprecounitario(c.getFloat(c.getColumnIndex("papainaprecounitario")));
                calculadora.setPapainaquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("papainaquantidadegastanoperiodo")));
                calculadora.setPapainavalorgastonoperiodo(c.getFloat(c.getColumnIndex("papainavalorgastonoperiodo")));
                calculadora.setPapainadias(c.getInt(c.getColumnIndex("papainadias")));
                calculadora.setPapainaprecounitario1(c.getFloat(c.getColumnIndex("papainaprecounitario1")));

                //sulfadiazinaprata
                calculadora.setSulfadiazinapratausado(c.getFloat(c.getColumnIndex("sulfadiazinapratausado")));
                calculadora.setSulfadiazinaprataprecounitario(c.getFloat(c.getColumnIndex("sulfadiazinaprataprecounitario")));
                calculadora.setSulfadiazinaprataquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("sulfadiazinaprataquantidadegastanoperiodo")));
                calculadora.setSulfadiazinapratavalorgastonoperiodo(c.getFloat(c.getColumnIndex("sulfadiazinapratavalorgastonoperiodo")));
                calculadora.setSulfadiazinapratadias(c.getInt(c.getColumnIndex("sulfadiazinapratadias")));
                calculadora.setSulfadiazinaprataprecounitario1(c.getFloat(c.getColumnIndex("sulfadiazinaprataprecounitario1")));

                ///-> kolagenase
                calculadora.setKolagenaseusado(c.getFloat(c.getColumnIndex("kolagenaseusado")));
                calculadora.setKolagenaseprecounitario(c.getFloat(c.getColumnIndex("kolagenaseprecounitario")));
                calculadora.setKolagenasequantidadegastanoperiodo(c.getFloat(c.getColumnIndex("kolagenasequantidadegastanoperiodo")));
                calculadora.setKolagenasevalorgastonoperiodo(c.getFloat(c.getColumnIndex("kolagenasevalorgastonoperiodo")));
                calculadora.setKolagenasedias(c.getInt(c.getColumnIndex("kolagenasedias")));
                calculadora.setKolagenaseprecounitario1(c.getFloat(c.getColumnIndex("kolagenaseprecounitario1")));


                ///->telapratananocristalina
                calculadora.setTelapratananocristalinausado(c.getFloat(c.getColumnIndex("telapratananocristalinausado")));
                calculadora.setTelapratananocristalinaprecounitario(c.getFloat(c.getColumnIndex("telapratananocristalinaprecounitario")));
                calculadora.setTelapratananocristalinaquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("telapratananocristalinaquantidadegastanoperiodo")));
                calculadora.setTelapratananocristalinavalorgastonoperiodo(c.getFloat(c.getColumnIndex("telapratananocristalinavalorgastonoperiodo")));
                calculadora.setTelapratananocristalinadias(c.getInt(c.getColumnIndex("telapratananocristalinadias")));
                calculadora.setTelapratananocristalinaprecounitario1(c.getFloat(c.getColumnIndex("telapratananocristalinaprecounitario1")));

                ///->rayon
                calculadora.setRayonusado(c.getFloat(c.getColumnIndex("rayonusado")));
                calculadora.setRayonprecounitario(c.getFloat(c.getColumnIndex("rayonprecounitario")));
                calculadora.setRayonquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("rayonquantidadegastanoperiodo")));
                calculadora.setRayonvalorgastonoperiodo(c.getFloat(c.getColumnIndex("rayonvalorgastonoperiodo")));
                calculadora.setRayondias(c.getInt(c.getColumnIndex("rayondias")));
                calculadora.setRayonprecounitario1(c.getFloat(c.getColumnIndex("rayonprecounitario1")));



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
        db.update("Produtos5", dados, "idPaciente = ?", params);
    }



    public Calculadora buscaPacientesComCalculadora(Calculadora calculadora) {
        String sql = "SELECT * from Produtos5;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);

        while (c.moveToNext()) {
            if (calculadora.getIdPaciente() == c.getLong(c.getColumnIndex("idPaciente"))) {

                calculadora.setIdCalculadora(c.getLong(c.getColumnIndex("id")));
                calculadora.setIdPaciente(c.getLong(c.getColumnIndex("idPaciente")));
                calculadora.setPaciente(c.getString(c.getColumnIndex("paciente")));

                ///->papaina
                calculadora.setPapainausado(c.getFloat(c.getColumnIndex("papainausado")));
                calculadora.setPapainaprecounitario(c.getFloat(c.getColumnIndex("papainaprecounitario")));
                calculadora.setPapainaquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("papainaquantidadegastanoperiodo")));
                calculadora.setPapainavalorgastonoperiodo(c.getFloat(c.getColumnIndex("papainavalorgastonoperiodo")));
                calculadora.setPapainadias(c.getInt(c.getColumnIndex("papainadias")));
                calculadora.setPapainaprecounitario1(c.getFloat(c.getColumnIndex("papainaprecounitario1")));

                //sulfadiazinaprata
                calculadora.setSulfadiazinapratausado(c.getFloat(c.getColumnIndex("sulfadiazinapratausado")));
                calculadora.setSulfadiazinaprataprecounitario(c.getFloat(c.getColumnIndex("sulfadiazinaprataprecounitario")));
                calculadora.setSulfadiazinaprataquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("sulfadiazinaprataquantidadegastanoperiodo")));
                calculadora.setSulfadiazinapratavalorgastonoperiodo(c.getFloat(c.getColumnIndex("sulfadiazinapratavalorgastonoperiodo")));
                calculadora.setSulfadiazinapratadias(c.getInt(c.getColumnIndex("sulfadiazinapratadias")));
                calculadora.setSulfadiazinaprataprecounitario1(c.getFloat(c.getColumnIndex("sulfadiazinaprataprecounitario1")));

                ///-> kolagenase
                calculadora.setKolagenaseusado(c.getFloat(c.getColumnIndex("kolagenaseusado")));
                calculadora.setKolagenaseprecounitario(c.getFloat(c.getColumnIndex("kolagenaseprecounitario")));
                calculadora.setKolagenasequantidadegastanoperiodo(c.getFloat(c.getColumnIndex("kolagenasequantidadegastanoperiodo")));
                calculadora.setKolagenasevalorgastonoperiodo(c.getFloat(c.getColumnIndex("kolagenasevalorgastonoperiodo")));
                calculadora.setKolagenasedias(c.getInt(c.getColumnIndex("kolagenasedias")));
                calculadora.setKolagenaseprecounitario1(c.getFloat(c.getColumnIndex("kolagenaseprecounitario1")));


                ///->telapratananocristalina
                calculadora.setTelapratananocristalinausado(c.getFloat(c.getColumnIndex("telapratananocristalinausado")));
                calculadora.setTelapratananocristalinaprecounitario(c.getFloat(c.getColumnIndex("telapratananocristalinaprecounitario")));
                calculadora.setTelapratananocristalinaquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("telapratananocristalinaquantidadegastanoperiodo")));
                calculadora.setTelapratananocristalinavalorgastonoperiodo(c.getFloat(c.getColumnIndex("telapratananocristalinavalorgastonoperiodo")));
                calculadora.setTelapratananocristalinadias(c.getInt(c.getColumnIndex("telapratananocristalinadias")));
                calculadora.setTelapratananocristalinaprecounitario1(c.getFloat(c.getColumnIndex("telapratananocristalinaprecounitario1")));

                ///->rayon
                calculadora.setRayonusado(c.getFloat(c.getColumnIndex("rayonusado")));
                calculadora.setRayonprecounitario(c.getFloat(c.getColumnIndex("rayonprecounitario")));
                calculadora.setRayonquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("rayonquantidadegastanoperiodo")));
                calculadora.setRayonvalorgastonoperiodo(c.getFloat(c.getColumnIndex("rayonvalorgastonoperiodo")));
                calculadora.setRayondias(c.getInt(c.getColumnIndex("rayondias")));
                calculadora.setRayonprecounitario1(c.getFloat(c.getColumnIndex("rayonprecounitario1")));





            }
        }
        c.close();
        return calculadora;
    }

    public void atualizaTodosOsPrecosUnitarios() {
        String sql = "SELECT * FROM Produtos5 WHERE id = 1;";
        SQLiteDatabase banco = this.getWritableDatabase();
        Cursor cursor = banco.rawQuery(sql, null);
        cursor.moveToFirst();
        String preco = cursor.getString(cursor.getColumnIndex("sfprecounitario1"));

        up1(preco);
    }
    public void up1(String preco) {
        String sql = "SELECT * from Produtos5;";
        SQLiteDatabase db = getWritableDatabase();

        ContentValues dados = new ContentValues();
        dados.put("sfprecounitario1", preco);
        int aux = 1;
        while (aux < 100) {
            String[] params = { String.valueOf(aux) };
            db.update("Produtos5", dados, "id=?", params);
            aux = aux + 1;
        }
    }


    public void deletaPAResultados(Calculadora calculadora) {
        SQLiteDatabase db = getWritableDatabase();
        String[] params = { String.valueOf(calculadora.getIdCalculadora()) };
        db.delete("Produtos5", "id = ?", params);
    }
    public void deletaPAllResultados() {

        SQLiteDatabase db = getWritableDatabase();
        long aux = 1;
        while (aux < 1000) {
            String[] params = { String.valueOf(aux) };
            db.delete("Produtos5", "id = ?", params);
            aux++;
        }
    }
}


