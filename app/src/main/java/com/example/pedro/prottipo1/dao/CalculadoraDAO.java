package com.example.pedro.prottipo1.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.NonNull;

import com.example.pedro.prottipo1.modelo.Calculadora;
import com.example.pedro.prottipo1.modelo.Paciente;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraDAO extends SQLiteOpenHelper{

    public CalculadoraDAO(Context context) {

        super(context, "planilha", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Produtos (id INTEGER PRIMARY KEY,idPaciente INTEGER, paciente TEXT," +
                //"sfusado REAL,sfpreco REAL,sfquantidade REAL,sfcustodopaciente REAL,sfmediadecustodopaciente REAL,sfdias INTEGER,sfpreco1 REAL,sfquantidade1 REAL," +

                "sfusado REAL,sfprecounitario REAL,sfquantidadegastanoperiodo REAL,sfvalorgastonoperiodo REAL,sfdias INTEGER,sfprecounitario1 REAL," +
                "rinusado REAL,rinprecounitario REAL,rinquantidadegastanoperiodo REAL,rinvalorgastonoperiodo REAL,rindias INTEGER,rinprecounitario1 REAL," +
                "phmbusado REAL,phmbprecounitario REAL,phmbquantidadegastanoperiodo REAL,phmbvalorgastonoperiodo REAL,phmbdias INTEGER,phmbprecounitario1 REAL," +
                "pvpiusado REAL,pvpiprecounitario REAL,pvpiquantidadegastanoperiodo REAL,pvpivalorgastonoperiodo REAL,pvpidias INTEGER,pvpiprecounitario1 REAL,"+
                "clorexidineusado REAL,clorexidineprecounitario REAL,clorexidinequantidadegastanoperiodo REAL,clorexidinevalorgastonoperiodo REAL,clorexidinedias INTEGER,clorexidineprecounitario1 REAL)";/*," +

                2-> "removedorDeAdesivousado REAL,removedorDeAdesivoprecounitario REAL,removedorDeAdesivoquantidadegastanoperiodo REAL,removedorDeAdesivovalorgastonoperiodo REAL,removedorDeAdesivodias INTEGER,removedorDeAdesivoprecounitario1 REAL," +
                "removedorDeAdesivoUniusado REAL,removedorDeAdesivoUniprecounitario REAL,removedorDeAdesivoUniquantidadegastanoperiodo REAL,removedorDeAdesivoUnivalorgastonoperiodo REAL,removedorDeAdesivoUnidias INTEGER,removedorDeAdesivoUniprecounitario1 REAL,"+
                "ageusado REAL,ageprecounitario REAL,agequantidadegastanoperiodo REAL,agevalorgastonoperiodo REAL,agedias INTEGER,ageprecounitario1 REAL," +
                "alginatousado REAL,alginatoprecounitario REAL,alginatoquantidadegastanoperiodo REAL,alginatovalorgastonoperiodo REAL,alginatodias INTEGER,alginatoprecounitario1 REAL," +
                "alginatocompratausado REAL,alginatocomprataprecounitario REAL,alginatocomprataquantidadegastanoperiodo REAL,alginatocompratavalorgastonoperiodo REAL,alginatocompratadias INTEGER,alginatocomprataprecounitario1 REAL," +

                3-> "espumausado REAL,espumaprecounitario REAL,espumaquantidadegastanoperiodo REAL,espumavalorgastonoperiodo REAL,espumadias INTEGER,espumaprecounitario1 REAL," +
                "espumacompratausado REAL,espumacomprataprecounitario REAL,espumacomprataquantidadegastanoperiodo REAL,espumacompratavalorgastonoperiodo REAL,espumacompratadias INTEGER,espumacomprataprecounitario1 REAL," +
                "espumacomsiliconeusado REAL,espumacomsiliconeprecounitario REAL,espumacomsiliconequantidadegastanoperiodo REAL,espumacomsiliconevalorgastonoperiodo REAL,espumacomsiliconedias INTEGER,espumacomsiliconeprecounitario1 REAL," +
                "espumacomsiliconeepratausado REAL,espumacomsiliconeeprataprecounitario REAL,espumacomsiliconeeprataquantidadegastanoperiodo REAL,espumacomsiliconeepratavalorgastonoperiodo REAL,espumacomsiliconeepratadias INTEGER,espumacomsiliconeeprataprecounitario1 REAL," +
                "espumacombordausado REAL,espumacombordaprecounitario REAL,espumacombordaquantidadegastanoperiodo REAL,espumacombordavalorgastonoperiodo REAL,espumacombordadias INTEGER,espumacombordaprecounitario1 REAL," +

                4-> "espumacombordasiliconeusado REAL,espumacombordasiliconeprecounitario REAL,espumacombordasiliconequantidadegastanoperiodo REAL,espumacombordasiliconevalorgastonoperiodo REAL,espumacombordasiliconedias INTEGER,espumacombordasiliconeprecounitario1 REAL," +
                "espumacombordasiliconepratausado REAL,espumacombordasiliconeprataprecounitario REAL,espumacombordasiliconeprataquantidadegastanoperiodo REAL,espumacombordasiliconepratavalorgastonoperiodo REAL,espumacombordasiliconepratadias INTEGER,espumacombordasiliconeprataprecounitario1 REAL," +
                "hidrofibrausado REAL,hidrofibraprecounitario REAL,hidrofibraquantidadegastanoperiodo REAL,hidrofibravalorgastonoperiodo REAL,hidrofibradias INTEGER,hidrofibraprecounitario1 REAL," +
                "hidrofibrapratausado REAL,hidrofibraprataprecounitario REAL,hidrofibraprataquantidadegastanoperiodo REAL,hidrofibrapratavalorgastonoperiodo REAL,hidrofibrapratadias INTEGER,hidrofibraprataprecounitario1 REAL," +
                "hidrogelbusado REAL,hidrogelbprecounitario REAL,hidrogelbquantidadegastanoperiodo REAL,hidrogelbvalorgastonoperiodo REAL,hidrogelbdias INTEGER,hidrogelbprecounitario1 REAL," +

                5-> "papainausado REAL,papainaprecounitario REAL,papainaquantidadegastanoperiodo REAL,papainavalorgastonoperiodo REAL,papainadias INTEGER,papainaprecounitario1 REAL," +
                "sulfadiazinapratausado REAL,sulfadiazinaprataprecounitario REAL,sulfadiazinaprataquantidadegastanoperiodo REAL,sulfadiazinapratavalorgastonoperiodo REAL,sulfadiazinapratadias INTEGER,sulfadiazinaprataprecounitario1 REAL," +
                "kolagenaseusado REAL,kolagenaseprecounitario REAL,kolagenasequantidadegastanoperiodo REAL,kolagenasevalorgastonoperiodo REAL,kolagenasedias INTEGER,kolagenaseprecounitario1 REAL," +
                "telapratananocristalinausado REAL,telapratananocristalinaprecounitario REAL,telapratananocristalinaquantidadegastanoperiodo REAL,telapratananocristalinavalorgastonoperiodo REAL,telapratananocristalinadias INTEGER,telapratananocristalinaprecounitario1 REAL," +
                "rayonusado REAL,rayonprecounitario REAL,rayonquantidadegastanoperiodo REAL,rayonvalorgastonoperiodo REAL,rayondias INTEGER,rayonprecounitario1 REAL," +

                6-> "telanaderenteimpregnadausado REAL,telanaderenteimpregnadaprecounitario REAL,telanaderenteimpregnadaquantidadegastanoperiodo REAL,telanaderenteimpregnadavalorgastonoperiodo REAL,telanaderenteimpregnadadias INTEGER,telanaderenteimpregnadaprecounitario1 REAL," +
                "carvaousado REAL,carvaoprecounitario REAL,carvaoquantidadegastanoperiodo REAL,carvaovalorgastonoperiodo REAL,carvaodias INTEGER,carvaoprecounitario1 REAL," +
                "carvaopratausado REAL,carvaoprataprecounitario REAL,carvaoprataquantidadegastanoperiodo REAL,carvaopratavalorgastonoperiodo REAL,carvaopratadias INTEGER,carvaoprataprecounitario1 REAL," +
                "filmetransparenteusado REAL,filmetransparenteprecounitario REAL,filmetransparentequantidadegastanoperiodo REAL,filmetransparentevalorgastonoperiodo REAL,filmetransparentedias INTEGER,filmetransparenteprecounitario1 REAL," +
                "hidrocoloideusado REAL,hidrocoloideprecounitario REAL,hidrocoloidequantidadegastanoperiodo REAL,hidrocoloidevalorgastonoperiodo REAL,hidrocoloidedias INTEGER,hidrocoloideprecounitario1 REAL," +

                7-> "protetorcutaneousado REAL,protetorcutaneoprecounitario REAL,protetorcutaneoquantidadegastanoperiodo REAL,protetorcutaneovalorgastonoperiodo REAL,protetorcutaneodias INTEGER,protetorcutaneoprecounitario1 REAL," +
                "gazeesterilusado REAL,gazeesterilprecounitario REAL,gazeesterilquantidadegastanoperiodo REAL,gazeesterilvalorgastonoperiodo REAL,gazeesterildias INTEGER,gazeesterilprecounitario1 REAL," +
                "gazenesterilusado REAL,gazenesterilprecounitario REAL,gazenesterilquantidadegastanoperiodo REAL,gazenesterilvalorgastonoperiodo REAL,gazenesterildias INTEGER,gazenesterilprecounitario1 REAL," +
                "atadurausado REAL,ataduraprecounitario REAL,ataduraquantidadegastanoperiodo REAL,ataduravalorgastonoperiodo REAL,ataduradias INTEGER,ataduraprecounitario1 REAL," +
                "fitaadesivausado REAL,fitaadesivaprecounitario REAL,fitaadesivaquantidadegastanoperiodo REAL,fitaadesivavalorgastonoperiodo REAL,fitaadesivadias INTEGER,fitaadesivaprecounitario1 REAL," +

                8-> "rayon2usado REAL,rayon2precounitario REAL,rayon2quantidadegastanoperiodo REAL,rayon2valorgastonoperiodo REAL,rayon2dias INTEGER,rayon2precounitario1 REAL," +
                "chumacousado REAL,chumacoprecounitario REAL,chumacoquantidadegastanoperiodo REAL,chumacovalorgastonoperiodo REAL,chumacodias INTEGER,chumacoprecounitario1 REAL," +
                "compressaesterilusado REAL,compressaesterilprecounitario REAL,compressaesterilquantidadegastanoperiodo REAL,compressaesterilvalorgastonoperiodo REAL,compressaesterildias INTEGER,compressaesterilprecounitario1 REAL," +
                "espuma2usado REAL,espuma2precounitario REAL,espuma2quantidadegastanoperiodo REAL,espuma2valorgastonoperiodo REAL,espuma2dias INTEGER,espuma2precounitario1 REAL," +
                "filmetransparente2usado REAL,filmetransparente2precounitario REAL,filmetransparente2quantidadegastanoperiodo REAL,filmetransparente2valorgastonoperiodo REAL,filmetransparente2dias INTEGER,filmetransparente2precounitario1 REAL," +

                9-> "pressaonegativacpratausado REAL,pressaonegativacprataprecounitario REAL,pressaonegativacprataquantidadegastanoperiodo REAL,pressaonegativacpratavalorgastonoperiodo REAL,pressaonegativacpratadias INTEGER,pressaonegativacprataprecounitario1 REAL,"+
                "pressaonegativaspratausado REAL,pressaonegativasprataprecounitario REAL,pressaonegativasprataquantidadegastanoperiodo REAL,pressaonegativaspratavalorgastonoperiodo REAL,pressaonegativaspratadias INTEGER,pressaonegativasprataprecounitario1 REAL," +
                "camahiperbaricausado REAL,camahiperbaricaprecounitario REAL,camahiperbaricaquantidadegastanoperiodo REAL,camahiperbaricavalorgastonoperiodo REAL,camahiperbaricadias INTEGER,camahiperbaricaprecounitario1 REAL," +
                "laserterapiausado REAL,laserterapiaprecounitario REAL,laserterapiaquantidadegastanoperiodo REAL,laserterapiavalorgastonoperiodo REAL,laserterapiadias INTEGER,laserterapiaprecounitario1 REAL," +

                10-> "desbridamentocirurgicousado REAL,desbridamentocirurgicoprecounitario REAL,desbridamentocirurgicoquantidadegastanoperiodo REAL,desbridamentocirurgicovalorgastonoperiodo REAL,desbridamentocirurgicodias INTEGER,desbridamentocirurgicoprecounitario1 REAL," +
                "taxadesalausado REAL,taxadesalaprecounitario REAL,taxadesalaquantidadegastanoperiodo REAL,taxadesalavalorgastonoperiodo REAL,taxadesaladias INTEGER,taxadesalaprecounitario1 REAL," +
                "analgesicoantiinflamatoriousado REAL,analgesicoantiinflamatorioprecounitario REAL,analgesicoantiinflamatorioquantidadegastanoperiodo REAL,analgesicoantiinflamatoriovalorgastonoperiodo REAL,analgesicoantiinflamatoriodias INTEGER,analgesicoantiinflamatorioprecounitario1 REAL," +
                "analgesicousado REAL,analgesicoprecounitario REAL,analgesicoquantidadegastanoperiodo REAL,analgesicovalorgastonoperiodo REAL,analgesicodias INTEGER,analgesicoprecounitario1 REAL," +
                "antibioticousado REAL,antibioticoprecounitario REAL,antibioticoquantidadegastanoperiodo REAL,antibioticovalorgastonoperiodo REAL,antibioticodias INTEGER,antibioticoprecounitario1 REAL," +

                11-> "tecnicoenfermenfermeiromusado REAL,tecnicoenfermenfermeiromprecounitario REAL,tecnicoenfermenfermeiromquantidadegastanoperiodo REAL,tecnicoenfermenfermeiromvalorgastonoperiodo REAL,tecnicoenfermenfermeiromdias INTEGER,tecnicoenfermenfermeiromprecounitario1 REAL," +
                "enfermeirousado REAL,enfermeiroprecounitario REAL,enfermeiroquantidadegastanoperiodo REAL,enfermeirovalorgastonoperiodo REAL,enfermeirodias INTEGER,enfermeiroprecounitario1 REAL," +
                "enfermeiroespecialistausado REAL,enfermeiroespecialistaprecounitario REAL,enfermeiroespecialistaquantidadegastanoperiodo REAL,enfermeiroespecialistavalorgastonoperiodo REAL,enfermeiroespecialistadias INTEGER,enfermeiroespecialistaprecounitario1 REAL," +
                "medicousado REAL,medicoprecounitario REAL,medicoquantidadegastanoperiodo REAL,medicovalorgastonoperiodo REAL,medicodias INTEGER,medicoprecounitario1 REAL);";*/


        db.execSQL(sql);
    }
//1 usado = O QUE O USUARIO CONSUMIO NO DIA
//2 precounitario = O VALOR UNITARIO DO MEDICAMENTO
//3 quantidadegastanoperiodo = SOMA DO MEDICAMENTO USADO EM TODOS OS DIAS (TOTAL DE MEDICAMENTO CONSUMIDO)
//4 valorgastonoperiodo = [É A QUANTIDADE GASTA NO PERIODO (TOTAL DE MEDICAMENTO CONSUMIDO) ] * [ CUSTO UNITARIO]
//5 dias = QUANTIDADE DE DIAS QUE O PACIENTE RECEBEU MEDICAÇÃO
//6 precounitario1 = O VALOR UNITARIO DO MEDICAMENTO


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Produtos";
        db.execSQL(sql);
        onCreate(db);
    }

    public Calculadora insere(Calculadora calculadora) {
    SQLiteDatabase db = getWritableDatabase();
    ContentValues dados = pegaDadosDaCalculadora(calculadora);
    db.insert("Produtos", null,dados);
    return calculadora;
    }

    @NonNull
    private ContentValues pegaDadosDaCalculadora(Calculadora calculadora) {
        ContentValues dados = new ContentValues();
        dados.put("paciente",calculadora.getPaciente());
        dados.put("idPaciente",calculadora.getIdPaciente());

        ///-> SORO FISIOLOGICO
        //"sfusado REAL,sfprecounitario REAL,sfquantidadegastanoperiodo REAL,sfvalorgastonoperiodo REAL,sfdias INTEGER,sfprecounitario1 REAL," +
        dados.put("sfusado",calculadora.getSfusado());
        dados.put("sfprecounitario",calculadora.getSfprecounitario());
        dados.put("sfquantidadegastanoperiodo",calculadora.getSfquantidadegastanoperiodo());
        dados.put("sfvalorgastonoperiodo",calculadora.getSfvalorgastonoperiodo());
        dados.put("sfdias",calculadora.getSfdias());
        dados.put("sfprecounitario1",calculadora.getSfprecounitario1());

        ///-> RINGER
        dados.put("rinusado", calculadora.getRingerusado());
        dados.put("rinprecounitario", calculadora.getRingerprecounitario());
        dados.put("rinquantidadegastanoperiodo", calculadora.getRingerquantidadegastanoperiodo());
        dados.put("rinvalorgastonoperiodo", calculadora.getRingervalorgastonoperiodo());
        dados.put("rindias", calculadora.getRingerdias());
        dados.put("rinprecounitario1", calculadora.getRingerprecounitario1());

        ///->PHMB
        dados.put("phmbusado", calculadora.getPhmbusado());
        dados.put("phmbprecounitario", calculadora.getPhmbprecounitario());
        dados.put("phmbquantidadegastanoperiodo", calculadora.getPhmbquantidadegastanoperiodo());
        dados.put("phmbvalorgastonoperiodo", calculadora.getPhmbvalorgastonoperiodo());
        dados.put("phmbdias", calculadora.getPhmbdias());
        dados.put("phmbprecounitario1", calculadora.getPhmbprecounitario1());

        ///->PVPI
        dados.put("pvpiusado", calculadora.getPvpiusado());
        dados.put("pvpiprecounitario", calculadora.getPvpiprecounitario());
        dados.put("pvpiquantidadegastanoperiodo", calculadora.getPvpiquantidadegastanoperiodo());
        dados.put("pvpivalorgastonoperiodo", calculadora.getPvpivalorgastonoperiodo());
        dados.put("pvpidias", calculadora.getPvpidias());
        dados.put("pvpiprecounitario1", calculadora.getPvpiprecounitario1());


        ///->CLOREXIDINE
        dados.put("clorexidineusado", calculadora.getClorexidineusado());
        dados.put("clorexidineprecounitario", calculadora.getClorexidineprecounitario());
        dados.put("clorexidinequantidadegastanoperiodo", calculadora.getClorexidinequantidadegastanoperiodo());
        dados.put("clorexidinevalorgastonoperiodo", calculadora.getClorexidinevalorgastonoperiodo());
        dados.put("clorexidinedias", calculadora.getClorexidinedias());
        dados.put("clorexidineprecounitario1", calculadora.getClorexidineprecounitario1());
/*
        ///->REMOVEDOR DE ADESIVO
        dados.put("removedorAdesivousado", calculadora.getRemovedorAdesivousado());
        dados.put("removedorAdesivoprecounitario", calculadora.getRemovedorAdesivoprecounitario());
        dados.put("removedorAdesivoquantidadegastanoperiodo", calculadora.getRemovedorAdesivoquantidadegastanoperiodo());
        dados.put("removedorAdesivovalorgastonoperiodo", calculadora.getRemovedorAdesivovalorgastonoperiodo());
        dados.put("removedorAdesivodias", calculadora.getRemovedorAdesivodias());
        dados.put("removedorAdesivoprecounitario1", calculadora.getRemovedorAdesivoprecounitario1());
/*
        ///->REMOVEDOR DE ADESIVO UNIDADE
        dados.put("removedorAdesivoUnidadeusado", calculadora.getRemovedorAdesivoUnidadeusado());
        dados.put("removedorAdesivoUnidadeprecounitario", calculadora.getRemovedorAdesivoUnidadeprecounitario());
        dados.put("removedorAdesivoUnidadequantidadegastanoperiodo", calculadora.getRemovedorAdesivoUnidadequantidadegastanoperiodo());
        dados.put("removedorAdesivoUnidadevalorgastonoperiodo", calculadora.getRemovedorAdesivoUnidadevalorgastonoperiodo());
        dados.put("removedorAdesivoUnidadedias", calculadora.getRemovedorAdesivoUnidadedias());
        dados.put("removedorAdesivoUnidadeprecounitario1", calculadora.getRemovedorAdesivoUnidadeprecounitario1());

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

///-> alginatocomprata
        dados.put("alginatocompratausado", calculadora.getAlginatocompratausado());
        dados.put("alginatocomprataprecounitario", calculadora.getAlginatocomprataprecounitario());
        dados.put("alginatocomprataquantidadegastanoperiodo", calculadora.getAlginatocomprataquantidadegastanoperiodo());
        dados.put("alginatocompratavalorgastonoperiodo", calculadora.getAlginatocompratavalorgastonoperiodo());
        dados.put("alginatocompratadias", calculadora.getAlginatocompratadias());
        dados.put("alginatocomprataprecounitario1", calculadora.getAlginatocomprataprecounitario1());

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
/*
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
*/
        return dados;
    }

    public Calculadora bug() {
        String sql = "SELECT * from Produtos;";
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
        String sql = "SELECT * from Produtos;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);
        List<Calculadora> dados = new ArrayList<>();
        while(c.moveToNext()){

            Calculadora calculadora= new Calculadora();
            if (c.getLong(c.getColumnIndex("id")) != 0){
                calculadora.setIdCalculadora(c.getLong(c.getColumnIndex("id")));
                calculadora.setIdPaciente(c.getLong(c.getColumnIndex("idPaciente")));
                calculadora.setPaciente(c.getString(c.getColumnIndex("paciente")));

                //SORO FISIOLOGICO
                calculadora.setSfusado(c.getFloat(c.getColumnIndex("sfusado")));
                calculadora.setSfprecounitario(c.getFloat(c.getColumnIndex("sfprecounitario")));
                calculadora.setSfquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("sfquantidadegastanoperiodo")));
                calculadora.setSfvalorgastonoperiodo(c.getFloat(c.getColumnIndex("sfvalorgastonoperiodo")));
                calculadora.setSfdias(c.getInt(c.getColumnIndex("sfdias")));
                calculadora.setSfprecounitario1(c.getFloat(c.getColumnIndex("sfprecounitario1")));

             ///-> RINGER
                calculadora.setRingerusado(c.getFloat(c.getColumnIndex("rinusado")));
                calculadora.setRingerprecounitario(c.getFloat(c.getColumnIndex("rinprecounitario")));
                calculadora.setRingerquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("rinquantidadegastanoperiodo")));
                calculadora.setRingervalorgastonoperiodo(c.getFloat(c.getColumnIndex("rinvalorgastonoperiodo")));
                calculadora.setRingerdias(c.getInt(c.getColumnIndex("rindias")));
                calculadora.setRingerprecounitario1(c.getFloat(c.getColumnIndex("rinprecounitario1")));

                ///->PHMB
                calculadora.setPhmbusado(c.getFloat(c.getColumnIndex("phmbusado")));
                calculadora.setPhmbprecounitario(c.getFloat(c.getColumnIndex("phmbprecounitario")));
                calculadora.setPhmbquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("phmbquantidadegastanoperiodo")));
                calculadora.setPhmbvalorgastonoperiodo(c.getFloat(c.getColumnIndex("phmbvalorgastonoperiodo")));
                calculadora.setPhmbdias(c.getInt(c.getColumnIndex("phmbdias")));
                calculadora.setPhmbprecounitario1(c.getFloat(c.getColumnIndex("phmbprecounitario1")));

                ///->PVPI
                calculadora.setPvpiusado(c.getFloat(c.getColumnIndex("pvpiusado")));
                calculadora.setPvpiprecounitario(c.getFloat(c.getColumnIndex("pvpiprecounitario")));
                calculadora.setPvpiquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("pvpiquantidadegastanoperiodo")));
                calculadora.setPvpivalorgastonoperiodo(c.getFloat(c.getColumnIndex("pvpivalorgastonoperiodo")));
                calculadora.setPvpidias(c.getInt(c.getColumnIndex("pvpidias")));
                calculadora.setPvpiprecounitario1(c.getFloat(c.getColumnIndex("pvpiprecounitario1")));

                ///->CLOREXIDINE
                calculadora.setClorexidineusado(c.getFloat(c.getColumnIndex("clorexidineusado")));
                calculadora.setClorexidineprecounitario(c.getFloat(c.getColumnIndex("clorexidineprecounitario")));
                calculadora.setClorexidinequantidadegastanoperiodo(c.getFloat(c.getColumnIndex("clorexidinequantidadegastanoperiodo")));
                calculadora.setClorexidinevalorgastonoperiodo(c.getFloat(c.getColumnIndex("clorexidinevalorgastonoperiodo")));
                calculadora.setClorexidinedias(c.getInt(c.getColumnIndex("clorexidinedias")));
                calculadora.setClorexidineprecounitario1(c.getFloat(c.getColumnIndex("clorexidineprecounitario1")));
/*
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

*/

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
        db.update("Produtos",dados,"idPaciente = ?",params);
    }



    public Calculadora buscaPacientesComCalculadora(Calculadora calculadora) {
        String sql = "SELECT * from Produtos;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);

        while(c.moveToNext()){
            if (calculadora.getIdPaciente() == c.getLong(c.getColumnIndex("idPaciente"))){

                calculadora.setIdCalculadora(c.getLong(c.getColumnIndex("id")));
                calculadora.setIdPaciente(c.getLong(c.getColumnIndex("idPaciente")));
                calculadora.setPaciente(c.getString(c.getColumnIndex("paciente")));


                //SORO FISIOLOGICO
                calculadora.setSfusado(c.getFloat(c.getColumnIndex("sfusado")));
                calculadora.setSfprecounitario(c.getFloat(c.getColumnIndex("sfprecounitario")));
                calculadora.setSfquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("sfquantidadegastanoperiodo")));
                calculadora.setSfvalorgastonoperiodo(c.getFloat(c.getColumnIndex("sfvalorgastonoperiodo")));
                calculadora.setSfdias(c.getInt(c.getColumnIndex("sfdias")));
                calculadora.setSfprecounitario1(c.getFloat(c.getColumnIndex("sfprecounitario1")));

              ///-> RINGER
                calculadora.setRingerusado(c.getFloat(c.getColumnIndex("rinusado")));
                calculadora.setRingerprecounitario(c.getFloat(c.getColumnIndex("rinprecounitario")));
                calculadora.setRingerquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("rinquantidadegastanoperiodo")));
                calculadora.setRingervalorgastonoperiodo(c.getFloat(c.getColumnIndex("rinvalorgastonoperiodo")));
                calculadora.setRingerdias(c.getInt(c.getColumnIndex("rindias")));
                calculadora.setRingerprecounitario1(c.getFloat(c.getColumnIndex("rinprecounitario1")));

                ///->PHMB
                calculadora.setPhmbusado(c.getFloat(c.getColumnIndex("phmbusado")));
                calculadora.setPhmbprecounitario(c.getFloat(c.getColumnIndex("phmbprecounitario")));
                calculadora.setPhmbquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("phmbquantidadegastanoperiodo")));
                calculadora.setPhmbvalorgastonoperiodo(c.getFloat(c.getColumnIndex("phmbvalorgastonoperiodo")));
                calculadora.setPhmbdias(c.getInt(c.getColumnIndex("phmbdias")));
                calculadora.setPhmbprecounitario1(c.getFloat(c.getColumnIndex("phmbprecounitario1")));

                ///->PVPI
                calculadora.setPvpiusado(c.getFloat(c.getColumnIndex("pvpiusado")));
                calculadora.setPvpiprecounitario(c.getFloat(c.getColumnIndex("pvpiprecounitario")));
                calculadora.setPvpiquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("pvpiquantidadegastanoperiodo")));
                calculadora.setPvpivalorgastonoperiodo(c.getFloat(c.getColumnIndex("pvpivalorgastonoperiodo")));
                calculadora.setPvpidias(c.getInt(c.getColumnIndex("pvpidias")));
                calculadora.setPvpiprecounitario1(c.getFloat(c.getColumnIndex("pvpiprecounitario1")));


                ///->CLOREXIDINE
                calculadora.setClorexidineusado(c.getFloat(c.getColumnIndex("clorexidineusado")));
                calculadora.setClorexidineprecounitario(c.getFloat(c.getColumnIndex("clorexidineprecounitario")));
                calculadora.setClorexidinequantidadegastanoperiodo(c.getFloat(c.getColumnIndex("clorexidinequantidadegastanoperiodo")));
                calculadora.setClorexidinevalorgastonoperiodo(c.getFloat(c.getColumnIndex("clorexidinevalorgastonoperiodo")));
                calculadora.setClorexidinedias(c.getInt(c.getColumnIndex("clorexidinedias")));
                calculadora.setClorexidineprecounitario1(c.getFloat(c.getColumnIndex("clorexidineprecounitario1")));
/*
                ///->REMOVEDOR DE ADESIVO
                calculadora.setRemovedorAdesivousado(c.getFloat(c.getColumnIndex("removedorDeAdesivousado")));
                calculadora.setRemovedorAdesivoprecounitario(c.getFloat(c.getColumnIndex("removedorDeAdesivoprecounitario")));
                calculadora.setRemovedorAdesivoquantidadegastanoperiodo(c.getFloat(c.getColumnIndex("removedorDeAdesivoquantidadegastanoperiodo")));
                calculadora.setRemovedorAdesivovalorgastonoperiodo(c.getFloat(c.getColumnIndex("removedorDeAdesivovalorgastonoperiodo")));
                calculadora.setRemovedorAdesivodias(c.getInt(c.getColumnIndex("removedorDeAdesivodias")));
                calculadora.setRemovedorAdesivoprecounitario1(c.getFloat(c.getColumnIndex("removedorDeAdesivoprecounitario1")));
/*
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

*/


            }
        }
        c.close();
        return calculadora;
    }

    public void atualizaTodosOsPrecosUnitarios() {
        String sql = "SELECT * FROM Produtos WHERE id = 1;";
        SQLiteDatabase banco = this.getWritableDatabase();
        Cursor cursor = banco.rawQuery(sql, null);
        cursor.moveToFirst();
        String preco = cursor.getString(cursor.getColumnIndex("sfprecounitario1"));

        up1(preco);
    }
    public void up1(String preco){
        String sql = "SELECT * from Produtos;";
        SQLiteDatabase db = getWritableDatabase();

        ContentValues dados = new ContentValues();
        dados.put("sfprecounitario1",preco);
        int aux =1;
        while(aux<100){
            String[] params ={String.valueOf(aux)};
            db.update("Produtos",dados,"id=?",params);
            aux=aux+1;
        }
    }


    public void deletaPAResultados(Calculadora calculadora) {
        SQLiteDatabase db = getWritableDatabase();
        String[] params = {String.valueOf(calculadora.getIdCalculadora())};
        db.delete("Produtos","id = ?", params);
    }
    public void deletaPAllResultados() {

        SQLiteDatabase db = getWritableDatabase();
        long aux = 1;
        while (aux<1000) {
            String[] params = {String.valueOf(aux)};
            db.delete("Produtos", "id = ?", params);
            aux++;
        }
    }
}

