package com.example.pedro.prottipo1.modelo;

import android.app.Application;

import java.io.Serializable;

public class Calculadora extends Application implements Serializable {


    private long idCalculadora;
    private long idPaciente;
    private String paciente;

    //SORO FISIOLOGICO
    private float sfusado;
    private float sfprecounitario;
    private float sfquantidadegastanoperiodo;
    private float sfvalorgastonoperiodo ;
    private int sfdias;
    private float sfprecounitario1;

    //RINGER LACTADO
    private float ringerusado;
    private float ringerprecounitario;
    private float ringerquantidadegastanoperiodo;
    private float ringervalorgastonoperiodo;
    private int ringerdias;
    private float ringerprecounitario1;


    public long getIdCalculadora() {
        return idCalculadora;
    }

    public void setIdCalculadora(long idCalculadora) {
        this.idCalculadora = idCalculadora;
    }

    public long getIdPaciente() { return idPaciente; }

    public void setIdPaciente(long idPaciente) { this.idPaciente = idPaciente; }

    public String getPaciente() { return paciente; }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    //SORO FISIOLOGICO
    public float getSfusado() { return sfusado;  }

    public void setSfusado(float sfusado) { this.sfusado = sfusado;  }

    public float getSfprecounitario() { return sfprecounitario;  }

    public void setSfprecounitario(float sfprecounitario) {  this.sfprecounitario = sfprecounitario;  }

    public float getSfquantidadegastanoperiodo() { return sfquantidadegastanoperiodo; }

    public void setSfquantidadegastanoperiodo(float sfquantidadegastanoperiodo) {  this.sfquantidadegastanoperiodo = sfquantidadegastanoperiodo;  }

    public float getSfvalorgastonoperiodo() { return sfvalorgastonoperiodo; }

    public void setSfvalorgastonoperiodo(float sfvalorgastonoperiodo) { this.sfvalorgastonoperiodo = sfvalorgastonoperiodo; }

    public int getSfdias() {return sfdias;}

    public void setSfdias(int sfdias) { this.sfdias = sfdias; }

    public float getSfprecounitario1() { return sfprecounitario1; }

    public void setSfprecounitario1(float sfprecounitario1) { this.sfprecounitario1 = sfprecounitario1; }


    ///RINGER LACTADO
    public float getRingerusado() {
        return ringerusado;
    }

    public void setRingerusado(float ringerusado) {
        this.ringerusado = ringerusado;
    }

    public float getRingerprecounitario() {
        return ringerprecounitario;
    }

    public void setRingerprecounitario(float ringerprecounitario) {
        this.ringerprecounitario = ringerprecounitario;
    }

    public float getRingerquantidadegastanoperiodo() {
        return ringerquantidadegastanoperiodo;
    }

    public void setRingerquantidadegastanoperiodo(float ringerquantidadegastanoperiodo) {
        this.ringerquantidadegastanoperiodo = ringerquantidadegastanoperiodo;
    }

    public float getRingervalorgastonoperiodo() {
        return ringervalorgastonoperiodo;
    }

    public void setRingervalorgastonoperiodo(float ringervalorgastonoperiodo) {
        this.ringervalorgastonoperiodo = ringervalorgastonoperiodo;
    }

    public int getRingerdias() {
        return ringerdias;
    }

    public void setRingerdias(int ringerdias) {
        this.ringerdias = ringerdias;
    }

    public float getRingerprecounitario1() {
        return ringerprecounitario1;
    }

    public void setRingerprecounitario1(float ringerprecounitario1) {
        this.ringerprecounitario1 = ringerprecounitario1;
    }

    ///PHMB
    private float phmbusado;
    private float phmbprecounitario;
    private float phmbquantidadegastanoperiodo;
    private float phmbvalorgastonoperiodo;
    private int phmbdias;
    private float phmbprecounitario1;

    public float getPhmbusado() {
        return phmbusado;
    }

    public void setPhmbusado(float phmbusado) {
        this.phmbusado = phmbusado;
    }

    public float getPhmbprecounitario() {
        return phmbprecounitario;
    }

    public void setPhmbprecounitario(float phmbprecounitario) {
        this.phmbprecounitario = phmbprecounitario;
    }

    public float getPhmbquantidadegastanoperiodo() {
        return phmbquantidadegastanoperiodo;
    }

    public void setPhmbquantidadegastanoperiodo(float phmbquantidadegastanoperiodo) {
        this.phmbquantidadegastanoperiodo = phmbquantidadegastanoperiodo;
    }

    public float getPhmbvalorgastonoperiodo() {
        return phmbvalorgastonoperiodo;
    }

    public void setPhmbvalorgastonoperiodo(float phmbvalorgastonoperiodo) {
        this.phmbvalorgastonoperiodo = phmbvalorgastonoperiodo;
    }

    public int getPhmbdias() {
        return phmbdias;
    }

    public void setPhmbdias(int phmbdias) {
        this.phmbdias = phmbdias;
    }

    public float getPhmbprecounitario1() {
        return phmbprecounitario1;
    }

    public void setPhmbprecounitario1(float phmbprecounitario1) {
        this.phmbprecounitario1 = phmbprecounitario1;
    }

    //pvpi
    private float pvpiusado;
    private float pvpiprecounitario;
    private float pvpiquantidadegastanoperiodo;
    private float pvpivalorgastonoperiodo;
    private int pvpidias;
    private float pvpiprecounitario1;

    public float getPvpiusado() {
        return pvpiusado;
    }

    public void setPvpiusado(float pvpiusado) {
        this.pvpiusado = pvpiusado;
    }

    public float getPvpiprecounitario() {
        return pvpiprecounitario;
    }

    public void setPvpiprecounitario(float pvpiprecounitario) {
        this.pvpiprecounitario = pvpiprecounitario;
    }

    public float getPvpiquantidadegastanoperiodo() {
        return pvpiquantidadegastanoperiodo;
    }

    public void setPvpiquantidadegastanoperiodo(float pvpiquantidadegastanoperiodo) {
        this.pvpiquantidadegastanoperiodo = pvpiquantidadegastanoperiodo;
    }

    public float getPvpivalorgastonoperiodo() {
        return pvpivalorgastonoperiodo;
    }

    public void setPvpivalorgastonoperiodo(float pvpivalorgastonoperiodo) {
        this.pvpivalorgastonoperiodo = pvpivalorgastonoperiodo;
    }

    public int getPvpidias() {
        return pvpidias;
    }

    public void setPvpidias(int pvpidias) {
        this.pvpidias = pvpidias;
    }

    public float getPvpiprecounitario1() {
        return pvpiprecounitario1;
    }

    public void setPvpiprecounitario1(float pvpiprecounitario1) {
        this.pvpiprecounitario1 = pvpiprecounitario1;
    }

    //clorexidine
    private float clorexidineusado;
    private float clorexidineprecounitario;
    private float clorexidinequantidadegastanoperiodo;
    private float clorexidinevalorgastonoperiodo;
    private int clorexidinedias;
    private float clorexidineprecounitario1;

    public float getClorexidineusado() {
        return clorexidineusado;
    }

    public void setClorexidineusado(float clorexidineusado) {
        this.clorexidineusado = clorexidineusado;
    }

    public float getClorexidineprecounitario() {
        return clorexidineprecounitario;
    }

    public void setClorexidineprecounitario(float clorexidineprecounitario) {
        this.clorexidineprecounitario = clorexidineprecounitario;
    }

    public float getClorexidinequantidadegastanoperiodo() {
        return clorexidinequantidadegastanoperiodo;
    }

    public void setClorexidinequantidadegastanoperiodo(float clorexidinequantidadegastanoperiodo) {
        this.clorexidinequantidadegastanoperiodo = clorexidinequantidadegastanoperiodo;
    }

    public float getClorexidinevalorgastonoperiodo() {
        return clorexidinevalorgastonoperiodo;
    }

    public void setClorexidinevalorgastonoperiodo(float clorexidinevalorgastonoperiodo) {
        this.clorexidinevalorgastonoperiodo = clorexidinevalorgastonoperiodo;
    }

    public int getClorexidinedias() {
        return clorexidinedias;
    }

    public void setClorexidinedias(int clorexidinedias) {
        this.clorexidinedias = clorexidinedias;
    }

    public float getClorexidineprecounitario1() {
        return clorexidineprecounitario1;
    }

    public void setClorexidineprecounitario1(float clorexidineprecounitario1) {
        this.clorexidineprecounitario1 = clorexidineprecounitario1;
    }

    //removedorAdesivo
    private float removedorAdesivousado;
    private float removedorAdesivoprecounitario;
    private float removedorAdesivoquantidadegastanoperiodo;
    private float removedorAdesivovalorgastonoperiodo;
    private int removedorAdesivodias;
    private float removedorAdesivoprecounitario1;

    public float getRemovedorAdesivousado() {
        return removedorAdesivousado;
    }

    public void setRemovedorAdesivousado(float removedorAdesivousado) {
        this.removedorAdesivousado = removedorAdesivousado;
    }

    public float getRemovedorAdesivoprecounitario() {
        return removedorAdesivoprecounitario;
    }

    public void setRemovedorAdesivoprecounitario(float removedorAdesivoprecounitario) {
        this.removedorAdesivoprecounitario = removedorAdesivoprecounitario;
    }

    public float getRemovedorAdesivoquantidadegastanoperiodo() {
        return removedorAdesivoquantidadegastanoperiodo;
    }

    public void setRemovedorAdesivoquantidadegastanoperiodo(float removedorAdesivoquantidadegastanoperiodo) {
        this.removedorAdesivoquantidadegastanoperiodo = removedorAdesivoquantidadegastanoperiodo;
    }

    public float getRemovedorAdesivovalorgastonoperiodo() {
        return removedorAdesivovalorgastonoperiodo;
    }

    public void setRemovedorAdesivovalorgastonoperiodo(float removedorAdesivovalorgastonoperiodo) {
        this.removedorAdesivovalorgastonoperiodo = removedorAdesivovalorgastonoperiodo;
    }

    public int getRemovedorAdesivodias() {
        return removedorAdesivodias;
    }

    public void setRemovedorAdesivodias(int removedorAdesivodias) {
        this.removedorAdesivodias = removedorAdesivodias;
    }

    public float getRemovedorAdesivoprecounitario1() {
        return removedorAdesivoprecounitario1;
    }

    public void setRemovedorAdesivoprecounitario1(float removedorAdesivoprecounitario1) {
        this.removedorAdesivoprecounitario1 = removedorAdesivoprecounitario1;
    }

    //removedorAdesivoUnidade
    private float removedorAdesivoUnidadeusado;
    private float removedorAdesivoUnidadeprecounitario;
    private float removedorAdesivoUnidadequantidadegastanoperiodo;
    private float removedorAdesivoUnidadevalorgastonoperiodo;
    private int   removedorAdesivoUnidadedias;
    private float removedorAdesivoUnidadeprecounitario1;

    public float getRemovedorAdesivoUnidadeusado() {
        return removedorAdesivoUnidadeusado;
    }

    public void setRemovedorAdesivoUnidadeusado(float removedorAdesivoUnidadeusado) {
        this.removedorAdesivoUnidadeusado = removedorAdesivoUnidadeusado;
    }

    public float getRemovedorAdesivoUnidadeprecounitario() {
        return removedorAdesivoUnidadeprecounitario;
    }

    public void setRemovedorAdesivoUnidadeprecounitario(float removedorAdesivoUnidadeprecounitario) {
        this.removedorAdesivoUnidadeprecounitario = removedorAdesivoUnidadeprecounitario;
    }

    public float getRemovedorAdesivoUnidadequantidadegastanoperiodo() {
        return removedorAdesivoUnidadequantidadegastanoperiodo;
    }

    public void setRemovedorAdesivoUnidadequantidadegastanoperiodo(float removedorAdesivoUnidadequantidadegastanoperiodo) {
        this.removedorAdesivoUnidadequantidadegastanoperiodo = removedorAdesivoUnidadequantidadegastanoperiodo;
    }

    public float getRemovedorAdesivoUnidadevalorgastonoperiodo() {
        return removedorAdesivoUnidadevalorgastonoperiodo;
    }

    public void setRemovedorAdesivoUnidadevalorgastonoperiodo(float removedorAdesivoUnidadevalorgastonoperiodo) {
        this.removedorAdesivoUnidadevalorgastonoperiodo = removedorAdesivoUnidadevalorgastonoperiodo;
    }

    public int getRemovedorAdesivoUnidadedias() {
        return removedorAdesivoUnidadedias;
    }

    public void setRemovedorAdesivoUnidadedias(int removedorAdesivoUnidadedias) {
        this.removedorAdesivoUnidadedias = removedorAdesivoUnidadedias;
    }

    public float getRemovedorAdesivoUnidadeprecounitario1() {
        return removedorAdesivoUnidadeprecounitario1;
    }

    public void setRemovedorAdesivoUnidadeprecounitario1(float removedorAdesivoUnidadeprecounitario1) {
        this.removedorAdesivoUnidadeprecounitario1 = removedorAdesivoUnidadeprecounitario1;
    }




    //SORO FISIOLOGICO
    private float ageusado;
    private float ageprecounitario;
    private float agequantidadegastanoperiodo;
    private float agevalorgastonoperiodo;
    private int agedias;
    private float ageprecounitario1;

    //alginatoGER LACTADO
    private float alginatogerusado;
    private float alginatogerprecounitario;
    private float alginatogerquantidadegastanoperiodo;
    private float alginatogervalorgastonoperiodo;
    private int alginatogerdias;
    private float alginatogerprecounitario1;

    ///alginatocomprata
    private float alginatocompratausado;
    private float alginatocomprataprecounitario;
    private float alginatocomprataquantidadegastanoperiodo;
    private float alginatocompratavalorgastonoperiodo;
    private int alginatocompratadias;
    private float alginatocomprataprecounitario1;

    //espuma
    private float espumausado;
    private float espumaprecounitario;
    private float espumaquantidadegastanoperiodo;
    private float espumavalorgastonoperiodo;
    private int espumadias;
    private float espumaprecounitario1;

    //espumacomprata
    private float espumacompratausado;
    private float espumacomprataprecounitario;
    private float espumacomprataquantidadegastanoperiodo;
    private float espumacompratavalorgastonoperiodo;
    private int espumacompratadias;
    private float espumacomprataprecounitario1;

    //espumacomsilicone
    private float espumacomsiliconeusado;
    private float espumacomsiliconeprecounitario;
    private float espumacomsiliconequantidadegastanoperiodo;
    private float espumacomsiliconevalorgastonoperiodo;
    private int espumacomsiliconedias;
    private float espumacomsiliconeprecounitario1;

    //espumacomsiliconeeprata
    private float espumacomsiliconeepratausado;
    private float espumacomsiliconeeprataprecounitario;
    private float espumacomsiliconeeprataquantidadegastanoperiodo;
    private float espumacomsiliconeepratavalorgastonoperiodo;
    private int   espumacomsiliconeepratadias;
    private float espumacomsiliconeeprataprecounitario1;


    //SORO FISIOLOGICO
    private float espumacombordausado;
    private float espumacombordaprecounitario;
    private float espumacombordaquantidadegastanoperiodo;
    private float espumacombordavalorgastonoperiodo;
    private int espumacombordadias;
    private float espumacombordaprecounitario1;

    //espumacombordasilicone LACTADO
    private float espumacombordasiliconeusado;
    private float espumacombordasiliconeprecounitario;
    private float espumacombordasiliconequantidadegastanoperiodo;
    private float espumacombordasiliconevalorgastonoperiodo;
    private int espumacombordasiliconedias;
    private float espumacombordasiliconeprecounitario1;

    ///espumacombordasiliconeprata
    private float espumacombordasiliconepratausado;
    private float espumacombordasiliconeprataprecounitario;
    private float espumacombordasiliconeprataquantidadegastanoperiodo;
    private float espumacombordasiliconepratavalorgastonoperiodo;
    private int espumacombordasiliconepratadias;
    private float espumacombordasiliconeprataprecounitario1;

    //hidrofibra
    private float hidrofibrausado;
    private float hidrofibraprecounitario;
    private float hidrofibraquantidadegastanoperiodo;
    private float hidrofibravalorgastonoperiodo;
    private int hidrofibradias;
    private float hidrofibraprecounitario1;

    //hidrofibraprata
    private float hidrofibrapratausado;
    private float hidrofibraprataprecounitario;
    private float hidrofibraprataquantidadegastanoperiodo;
    private float hidrofibrapratavalorgastonoperiodo;
    private int hidrofibrapratadias;
    private float hidrofibraprataprecounitario1;

    //hidrogelb
    private float hidrogelbusado;
    private float hidrogelbprecounitario;
    private float hidrogelbquantidadegastanoperiodo;
    private float hidrogelbvalorgastonoperiodo;
    private int hidrogelbdias;
    private float hidrogelbprecounitario1;

    //papaina
    private float papainausado;
    private float papainaprecounitario;
    private float papainaquantidadegastanoperiodo;
    private float papainavalorgastonoperiodo;
    private int   papainadias;
    private float papainaprecounitario1;




     //SORO FISIOLOGICO
     private float sulfadiazinapratausado;
     private float sulfadiazinaprataprecounitario;
     private float sulfadiazinaprataquantidadegastanoperiodo;
     private float sulfadiazinapratavalorgastonoperiodo;
     private int sulfadiazinapratadias;
     private float sulfadiazinaprataprecounitario1;

     //kolagenase LACTADO
     private float kolagenaseusado;
     private float kolagenaseprecounitario;
     private float kolagenasequantidadegastanoperiodo;
     private float kolagenasevalorgastonoperiodo;
     private int kolagenasedias;
     private float kolagenaseprecounitario1;

     ///telapratananocristalina
     private float telapratananocristalinausado;
     private float telapratananocristalinaprecounitario;
     private float telapratananocristalinaquantidadegastanoperiodo;
     private float telapratananocristalinavalorgastonoperiodo;
     private int telapratananocristalinadias;
     private float telapratananocristalinaprecounitario1;

     //rayon
     private float rayonusado;
     private float rayonprecounitario;
     private float rayonquantidadegastanoperiodo;
     private float rayonvalorgastonoperiodo;
     private int rayondias;
     private float rayonprecounitario1;

     //telanaderenteimpregnada
     private float telanaderenteimpregnadausado;
     private float telanaderenteimpregnadaprecounitario;
     private float telanaderenteimpregnadaquantidadegastanoperiodo;
     private float telanaderenteimpregnadavalorgastonoperiodo;
     private int telanaderenteimpregnadadias;
     private float telanaderenteimpregnadaprecounitario1;

     //carvao
     private float carvaousado;
     private float carvaoprecounitario;
     private float carvaoquantidadegastanoperiodo;
     private float carvaovalorgastonoperiodo;
     private int carvaodias;
     private float carvaoprecounitario1;

     //carvaoprata
     private float carvaopratausado;
     private float carvaoprataprecounitario;
     private float carvaoprataquantidadegastanoperiodo;
     private float carvaopratavalorgastonoperiodo;
     private int   carvaopratadias;
     private float carvaoprataprecounitario1;



//SORO FISIOLOGICO
    private float filmetransparenteusado;
    private float filmetransparenteprecounitario;
    private float filmetransparentequantidadegastanoperiodo;
    private float filmetransparentevalorgastonoperiodo;
    private int filmetransparentedias;
    private float filmetransparenteprecounitario1;

    //hidrocoloide
    private float hidrocoloideusado;
    private float hidrocoloideprecounitario;
    private float hidrocoloidequantidadegastanoperiodo;
    private float hidrocoloidevalorgastonoperiodo;
    private int hidrocoloidedias;
    private float hidrocoloideprecounitario1;



    //protetorcutaneo
    private float protetorcutaneousado;
    private float protetorcutaneoprecounitario;
    private float protetorcutaneoquantidadegastanoperiodo;
    private float protetorcutaneovalorgastonoperiodo;
    private int protetorcutaneodias;
    private float protetorcutaneoprecounitario1;

    //gazeesteril
    private float gazeesterilusado;
    private float gazeesterilprecounitario;
    private float gazeesterilquantidadegastanoperiodo;
    private float gazeesterilvalorgastonoperiodo;
    private int gazeesterildias;
    private float gazeesterilprecounitario1;

    //gazenesteril
    private float gazenesterilusado;
    private float gazenesterilprecounitario;
    private float gazenesterilquantidadegastanoperiodo;
    private float gazenesterilvalorgastonoperiodo;
    private int gazenesterildias;
    private float gazenesterilprecounitario1;

    //atadura
    private float atadurausado;
    private float ataduraprecounitario;
    private float ataduraquantidadegastanoperiodo;
    private float ataduravalorgastonoperiodo;
    private int  ataduradias;
    private float ataduraprecounitario1;


    //SORO FISIOLOGICO
    private float fitaadesivausado;
    private float fitaadesivaprecounitario;
    private float fitaadesivaquantidadegastanoperiodo;
    private float fitaadesivavalorgastonoperiodo;
    private int fitaadesivadias;
    private float fitaadesivaprecounitario1;

    //rayon2
    private float rayon2usado;
    private float rayon2precounitario;
    private float rayon2quantidadegastanoperiodo;
    private float rayon2valorgastonoperiodo;
    private int rayon2dias;
    private float rayon2precounitario1;



    //chumaco
    private float chumacousado;
    private float chumacoprecounitario;
    private float chumacoquantidadegastanoperiodo;
    private float chumacovalorgastonoperiodo;
    private int chumacodias;
    private float chumacoprecounitario1;

    //compressaesteril
    private float compressaesterilusado;
    private float compressaesterilprecounitario;
    private float compressaesterilquantidadegastanoperiodo;
    private float compressaesterilvalorgastonoperiodo;
    private int compressaesterildias;
    private float compressaesterilprecounitario1;

    //espuma2
    private float espuma2usado;
    private float espuma2precounitario;
    private float espuma2quantidadegastanoperiodo;
    private float espuma2valorgastonoperiodo;
    private int espuma2dias;
    private float espuma2precounitario1;

    //filmetransparente2
    private float filmetransparente2usado;
    private float filmetransparente2precounitario;
    private float filmetransparente2quantidadegastanoperiodo;
    private float filmetransparente2valorgastonoperiodo;
    private int  filmetransparente2dias;
    private float filmetransparente2precounitario1;

    //SORO FISIOLOGICO
    private float pressaonegativacpratausado;
    private float pressaonegativacprataprecounitario;
    private float pressaonegativacprataquantidadegastanoperiodo;
    private float pressaonegativacpratavalorgastonoperiodo;
    private int pressaonegativacpratadias;
    private float pressaonegativacprataprecounitario1;

    //pressaonegativasprata
    private float pressaonegativaspratausado;
    private float pressaonegativasprataprecounitario;
    private float pressaonegativasprataquantidadegastanoperiodo;
    private float pressaonegativaspratavalorgastonoperiodo;
    private int pressaonegativaspratadias;
    private float pressaonegativasprataprecounitario1;



    //camahiperbarica
    private float camahiperbaricausado;
    private float camahiperbaricaprecounitario;
    private float camahiperbaricaquantidadegastanoperiodo;
    private float camahiperbaricavalorgastonoperiodo;
    private int camahiperbaricadias;
    private float camahiperbaricaprecounitario1;

    //laserterapia
    private float laserterapiausado;
    private float laserterapiaprecounitario;
    private float laserterapiaquantidadegastanoperiodo;
    private float laserterapiavalorgastonoperiodo;
    private int laserterapiadias;
    private float laserterapiaprecounitario1;

    //desbridamentocirurgico
    private float desbridamentocirurgicousado;
    private float desbridamentocirurgicoprecounitario;
    private float desbridamentocirurgicoquantidadegastanoperiodo;
    private float desbridamentocirurgicovalorgastonoperiodo;
    private int desbridamentocirurgicodias;
    private float desbridamentocirurgicoprecounitario1;

    //taxadesala
    private float taxadesalausado;
    private float taxadesalaprecounitario;
    private float taxadesalaquantidadegastanoperiodo;
    private float taxadesalavalorgastonoperiodo;
    private int  taxadesaladias;
    private float taxadesalaprecounitario1;

    //SORO FISIOLOGICO
    private float analgesicoantiinflamatoriousado;
    private float analgesicoantiinflamatorioprecounitario;
    private float analgesicoantiinflamatorioquantidadegastanoperiodo;
    private float analgesicoantiinflamatoriovalorgastonoperiodo;
    private int analgesicoantiinflamatoriodias;
    private float analgesicoantiinflamatorioprecounitario1;

    //analgesico
    private float analgesicousado;
    private float analgesicoprecounitario;
    private float analgesicoquantidadegastanoperiodo;
    private float analgesicovalorgastonoperiodo;
    private int analgesicodias;
    private float analgesicoprecounitario1;



    //antibiotico
    private float antibioticousado;
    private float antibioticoprecounitario;
    private float antibioticoquantidadegastanoperiodo;
    private float antibioticovalorgastonoperiodo;
    private int antibioticodias;
    private float antibioticoprecounitario1;

    //tecnicoenfermenfermeirom
    private float tecnicoenfermenfermeiromusado;
    private float tecnicoenfermenfermeiromprecounitario;
    private float tecnicoenfermenfermeiromquantidadegastanoperiodo;
    private float tecnicoenfermenfermeiromvalorgastonoperiodo;
    private int tecnicoenfermenfermeiromdias;
    private float tecnicoenfermenfermeiromprecounitario1;

    //enfermeiro
    private float enfermeirousado;
    private float enfermeiroprecounitario;
    private float enfermeiroquantidadegastanoperiodo;
    private float enfermeirovalorgastonoperiodo;
    private int enfermeirodias;
    private float enfermeiroprecounitario1;

    //enfermeiroespecialista
    private float enfermeiroespecialistausado;
    private float enfermeiroespecialistaprecounitario;
    private float enfermeiroespecialistaquantidadegastanoperiodo;
    private float enfermeiroespecialistavalorgastonoperiodo;
    private int  enfermeiroespecialistadias;
    private float enfermeiroespecialistaprecounitario1;


    //medico
    private float medicousado;
    private float medicoprecounitario;
    private float medicoquantidadegastanoperiodo;
    private float medicovalorgastonoperiodo;
    private int medicodias;
    private float medicoprecounitario1;


    //alginato
    private float alginatousado;
    private float alginatoprecounitario;
    private float alginatoquantidadegastanoperiodo;
    private float alginatovalorgastonoperiodo;
    private int alginatodias;
    private float alginatoprecounitario1;

    public float getAlginatousado() {
        return alginatousado;
    }

    public void setAlginatousado(float alginatousado) {
        this.alginatousado = alginatousado;
    }

    public float getAlginatoprecounitario() {
        return alginatoprecounitario;
    }

    public void setAlginatoprecounitario(float alginatoprecounitario) {
        this.alginatoprecounitario = alginatoprecounitario;
    }

    public float getAlginatoquantidadegastanoperiodo() {
        return alginatoquantidadegastanoperiodo;
    }

    public void setAlginatoquantidadegastanoperiodo(float alginatoquantidadegastanoperiodo) {
        this.alginatoquantidadegastanoperiodo = alginatoquantidadegastanoperiodo;
    }

    public float getAlginatovalorgastonoperiodo() {
        return alginatovalorgastonoperiodo;
    }

    public void setAlginatovalorgastonoperiodo(float alginatovalorgastonoperiodo) {
        this.alginatovalorgastonoperiodo = alginatovalorgastonoperiodo;
    }

    public int getAlginatodias() {
        return alginatodias;
    }

    public void setAlginatodias(int alginatodias) {
        this.alginatodias = alginatodias;
    }

    public float getAlginatoprecounitario1() {
        return alginatoprecounitario1;
    }

    public void setAlginatoprecounitario1(float alginatoprecounitario1) {
        this.alginatoprecounitario1 = alginatoprecounitario1;
    }

    public float getAgeusado() {
        return ageusado;
    }

    public void setAgeusado(float ageusado) {
        this.ageusado = ageusado;
    }

    public float getAgeprecounitario() {
        return ageprecounitario;
    }

    public void setAgeprecounitario(float ageprecounitario) {
        this.ageprecounitario = ageprecounitario;
    }

    public float getAgequantidadegastanoperiodo() {
        return agequantidadegastanoperiodo;
    }

    public void setAgequantidadegastanoperiodo(float agequantidadegastanoperiodo) {
        this.agequantidadegastanoperiodo = agequantidadegastanoperiodo;
    }

    public float getAgevalorgastonoperiodo() {
        return agevalorgastonoperiodo;
    }

    public void setAgevalorgastonoperiodo(float agevalorgastonoperiodo) {
        this.agevalorgastonoperiodo = agevalorgastonoperiodo;
    }

    public int getAgedias() {
        return agedias;
    }

    public void setAgedias(int agedias) {
        this.agedias = agedias;
    }

    public float getAgeprecounitario1() {
        return ageprecounitario1;
    }

    public void setAgeprecounitario1(float ageprecounitario1) {
        this.ageprecounitario1 = ageprecounitario1;
    }

    public float getAlginatogerusado() {
        return alginatogerusado;
    }

    public void setAlginatogerusado(float alginatogerusado) {
        this.alginatogerusado = alginatogerusado;
    }

    public float getAlginatogerprecounitario() {
        return alginatogerprecounitario;
    }

    public void setAlginatogerprecounitario(float alginatogerprecounitario) {
        this.alginatogerprecounitario = alginatogerprecounitario;
    }

    public float getAlginatogerquantidadegastanoperiodo() {
        return alginatogerquantidadegastanoperiodo;
    }

    public void setAlginatogerquantidadegastanoperiodo(float alginatogerquantidadegastanoperiodo) {
        this.alginatogerquantidadegastanoperiodo = alginatogerquantidadegastanoperiodo;
    }

    public float getAlginatogervalorgastonoperiodo() {
        return alginatogervalorgastonoperiodo;
    }

    public void setAlginatogervalorgastonoperiodo(float alginatogervalorgastonoperiodo) {
        this.alginatogervalorgastonoperiodo = alginatogervalorgastonoperiodo;
    }

    public int getAlginatogerdias() {
        return alginatogerdias;
    }

    public void setAlginatogerdias(int alginatogerdias) {
        this.alginatogerdias = alginatogerdias;
    }

    public float getAlginatogerprecounitario1() {
        return alginatogerprecounitario1;
    }

    public void setAlginatogerprecounitario1(float alginatogerprecounitario1) {
        this.alginatogerprecounitario1 = alginatogerprecounitario1;
    }

    public float getAlginatocompratausado() {
        return alginatocompratausado;
    }

    public void setAlginatocompratausado(float alginatocompratausado) {
        this.alginatocompratausado = alginatocompratausado;
    }

    public float getAlginatocomprataprecounitario() {
        return alginatocomprataprecounitario;
    }

    public void setAlginatocomprataprecounitario(float alginatocomprataprecounitario) {
        this.alginatocomprataprecounitario = alginatocomprataprecounitario;
    }

    public float getAlginatocomprataquantidadegastanoperiodo() {
        return alginatocomprataquantidadegastanoperiodo;
    }

    public void setAlginatocomprataquantidadegastanoperiodo(float alginatocomprataquantidadegastanoperiodo) {
        this.alginatocomprataquantidadegastanoperiodo = alginatocomprataquantidadegastanoperiodo;
    }

    public float getAlginatocompratavalorgastonoperiodo() {
        return alginatocompratavalorgastonoperiodo;
    }

    public void setAlginatocompratavalorgastonoperiodo(float alginatocompratavalorgastonoperiodo) {
        this.alginatocompratavalorgastonoperiodo = alginatocompratavalorgastonoperiodo;
    }

    public int getAlginatocompratadias() {
        return alginatocompratadias;
    }

    public void setAlginatocompratadias(int alginatocompratadias) {
        this.alginatocompratadias = alginatocompratadias;
    }

    public float getAlginatocomprataprecounitario1() {
        return alginatocomprataprecounitario1;
    }

    public void setAlginatocomprataprecounitario1(float alginatocomprataprecounitario1) {
        this.alginatocomprataprecounitario1 = alginatocomprataprecounitario1;
    }

    public float getEspumausado() {
        return espumausado;
    }

    public void setEspumausado(float espumausado) {
        this.espumausado = espumausado;
    }

    public float getEspumaprecounitario() {
        return espumaprecounitario;
    }

    public void setEspumaprecounitario(float espumaprecounitario) {
        this.espumaprecounitario = espumaprecounitario;
    }

    public float getEspumaquantidadegastanoperiodo() {
        return espumaquantidadegastanoperiodo;
    }

    public void setEspumaquantidadegastanoperiodo(float espumaquantidadegastanoperiodo) {
        this.espumaquantidadegastanoperiodo = espumaquantidadegastanoperiodo;
    }

    public float getEspumavalorgastonoperiodo() {
        return espumavalorgastonoperiodo;
    }

    public void setEspumavalorgastonoperiodo(float espumavalorgastonoperiodo) {
        this.espumavalorgastonoperiodo = espumavalorgastonoperiodo;
    }

    public int getEspumadias() {
        return espumadias;
    }

    public void setEspumadias(int espumadias) {
        this.espumadias = espumadias;
    }

    public float getEspumaprecounitario1() {
        return espumaprecounitario1;
    }

    public void setEspumaprecounitario1(float espumaprecounitario1) {
        this.espumaprecounitario1 = espumaprecounitario1;
    }

    public float getEspumacompratausado() {
        return espumacompratausado;
    }

    public void setEspumacompratausado(float espumacompratausado) {
        this.espumacompratausado = espumacompratausado;
    }

    public float getEspumacomprataprecounitario() {
        return espumacomprataprecounitario;
    }

    public void setEspumacomprataprecounitario(float espumacomprataprecounitario) {
        this.espumacomprataprecounitario = espumacomprataprecounitario;
    }

    public float getEspumacomprataquantidadegastanoperiodo() {
        return espumacomprataquantidadegastanoperiodo;
    }

    public void setEspumacomprataquantidadegastanoperiodo(float espumacomprataquantidadegastanoperiodo) {
        this.espumacomprataquantidadegastanoperiodo = espumacomprataquantidadegastanoperiodo;
    }

    public float getEspumacompratavalorgastonoperiodo() {
        return espumacompratavalorgastonoperiodo;
    }

    public void setEspumacompratavalorgastonoperiodo(float espumacompratavalorgastonoperiodo) {
        this.espumacompratavalorgastonoperiodo = espumacompratavalorgastonoperiodo;
    }

    public int getEspumacompratadias() {
        return espumacompratadias;
    }

    public void setEspumacompratadias(int espumacompratadias) {
        this.espumacompratadias = espumacompratadias;
    }

    public float getEspumacomprataprecounitario1() {
        return espumacomprataprecounitario1;
    }

    public void setEspumacomprataprecounitario1(float espumacomprataprecounitario1) {
        this.espumacomprataprecounitario1 = espumacomprataprecounitario1;
    }

    public float getEspumacomsiliconeusado() {
        return espumacomsiliconeusado;
    }

    public void setEspumacomsiliconeusado(float espumacomsiliconeusado) {
        this.espumacomsiliconeusado = espumacomsiliconeusado;
    }

    public float getEspumacomsiliconeprecounitario() {
        return espumacomsiliconeprecounitario;
    }

    public void setEspumacomsiliconeprecounitario(float espumacomsiliconeprecounitario) {
        this.espumacomsiliconeprecounitario = espumacomsiliconeprecounitario;
    }

    public float getEspumacomsiliconequantidadegastanoperiodo() {
        return espumacomsiliconequantidadegastanoperiodo;
    }

    public void setEspumacomsiliconequantidadegastanoperiodo(float espumacomsiliconequantidadegastanoperiodo) {
        this.espumacomsiliconequantidadegastanoperiodo = espumacomsiliconequantidadegastanoperiodo;
    }

    public float getEspumacomsiliconevalorgastonoperiodo() {
        return espumacomsiliconevalorgastonoperiodo;
    }

    public void setEspumacomsiliconevalorgastonoperiodo(float espumacomsiliconevalorgastonoperiodo) {
        this.espumacomsiliconevalorgastonoperiodo = espumacomsiliconevalorgastonoperiodo;
    }

    public int getEspumacomsiliconedias() {
        return espumacomsiliconedias;
    }

    public void setEspumacomsiliconedias(int espumacomsiliconedias) {
        this.espumacomsiliconedias = espumacomsiliconedias;
    }

    public float getEspumacomsiliconeprecounitario1() {
        return espumacomsiliconeprecounitario1;
    }

    public void setEspumacomsiliconeprecounitario1(float espumacomsiliconeprecounitario1) {
        this.espumacomsiliconeprecounitario1 = espumacomsiliconeprecounitario1;
    }

    public float getEspumacomsiliconeepratausado() {
        return espumacomsiliconeepratausado;
    }

    public void setEspumacomsiliconeepratausado(float espumacomsiliconeepratausado) {
        this.espumacomsiliconeepratausado = espumacomsiliconeepratausado;
    }

    public float getEspumacomsiliconeeprataprecounitario() {
        return espumacomsiliconeeprataprecounitario;
    }

    public void setEspumacomsiliconeeprataprecounitario(float espumacomsiliconeeprataprecounitario) {
        this.espumacomsiliconeeprataprecounitario = espumacomsiliconeeprataprecounitario;
    }

    public float getEspumacomsiliconeeprataquantidadegastanoperiodo() {
        return espumacomsiliconeeprataquantidadegastanoperiodo;
    }

    public void setEspumacomsiliconeeprataquantidadegastanoperiodo(float espumacomsiliconeeprataquantidadegastanoperiodo) {
        this.espumacomsiliconeeprataquantidadegastanoperiodo = espumacomsiliconeeprataquantidadegastanoperiodo;
    }

    public float getEspumacomsiliconeepratavalorgastonoperiodo() {
        return espumacomsiliconeepratavalorgastonoperiodo;
    }

    public void setEspumacomsiliconeepratavalorgastonoperiodo(float espumacomsiliconeepratavalorgastonoperiodo) {
        this.espumacomsiliconeepratavalorgastonoperiodo = espumacomsiliconeepratavalorgastonoperiodo;
    }

    public int getEspumacomsiliconeepratadias() {
        return espumacomsiliconeepratadias;
    }

    public void setEspumacomsiliconeepratadias(int espumacomsiliconeepratadias) {
        this.espumacomsiliconeepratadias = espumacomsiliconeepratadias;
    }

    public float getEspumacomsiliconeeprataprecounitario1() {
        return espumacomsiliconeeprataprecounitario1;
    }

    public void setEspumacomsiliconeeprataprecounitario1(float espumacomsiliconeeprataprecounitario1) {
        this.espumacomsiliconeeprataprecounitario1 = espumacomsiliconeeprataprecounitario1;
    }

    public float getEspumacombordausado() {
        return espumacombordausado;
    }

    public void setEspumacombordausado(float espumacombordausado) {
        this.espumacombordausado = espumacombordausado;
    }

    public float getEspumacombordaprecounitario() {
        return espumacombordaprecounitario;
    }

    public void setEspumacombordaprecounitario(float espumacombordaprecounitario) {
        this.espumacombordaprecounitario = espumacombordaprecounitario;
    }

    public float getEspumacombordaquantidadegastanoperiodo() {
        return espumacombordaquantidadegastanoperiodo;
    }

    public void setEspumacombordaquantidadegastanoperiodo(float espumacombordaquantidadegastanoperiodo) {
        this.espumacombordaquantidadegastanoperiodo = espumacombordaquantidadegastanoperiodo;
    }

    public float getEspumacombordavalorgastonoperiodo() {
        return espumacombordavalorgastonoperiodo;
    }

    public void setEspumacombordavalorgastonoperiodo(float espumacombordavalorgastonoperiodo) {
        this.espumacombordavalorgastonoperiodo = espumacombordavalorgastonoperiodo;
    }

    public int getEspumacombordadias() {
        return espumacombordadias;
    }

    public void setEspumacombordadias(int espumacombordadias) {
        this.espumacombordadias = espumacombordadias;
    }

    public float getEspumacombordaprecounitario1() {
        return espumacombordaprecounitario1;
    }

    public void setEspumacombordaprecounitario1(float espumacombordaprecounitario1) {
        this.espumacombordaprecounitario1 = espumacombordaprecounitario1;
    }

    public float getEspumacombordasiliconeusado() {
        return espumacombordasiliconeusado;
    }

    public void setEspumacombordasiliconeusado(float espumacombordasiliconeusado) {
        this.espumacombordasiliconeusado = espumacombordasiliconeusado;
    }

    public float getEspumacombordasiliconeprecounitario() {
        return espumacombordasiliconeprecounitario;
    }

    public void setEspumacombordasiliconeprecounitario(float espumacombordasiliconeprecounitario) {
        this.espumacombordasiliconeprecounitario = espumacombordasiliconeprecounitario;
    }

    public float getEspumacombordasiliconequantidadegastanoperiodo() {
        return espumacombordasiliconequantidadegastanoperiodo;
    }

    public void setEspumacombordasiliconequantidadegastanoperiodo(float espumacombordasiliconequantidadegastanoperiodo) {
        this.espumacombordasiliconequantidadegastanoperiodo = espumacombordasiliconequantidadegastanoperiodo;
    }

    public float getEspumacombordasiliconevalorgastonoperiodo() {
        return espumacombordasiliconevalorgastonoperiodo;
    }

    public void setEspumacombordasiliconevalorgastonoperiodo(float espumacombordasiliconevalorgastonoperiodo) {
        this.espumacombordasiliconevalorgastonoperiodo = espumacombordasiliconevalorgastonoperiodo;
    }

    public int getEspumacombordasiliconedias() {
        return espumacombordasiliconedias;
    }

    public void setEspumacombordasiliconedias(int espumacombordasiliconedias) {
        this.espumacombordasiliconedias = espumacombordasiliconedias;
    }

    public float getEspumacombordasiliconeprecounitario1() {
        return espumacombordasiliconeprecounitario1;
    }

    public void setEspumacombordasiliconeprecounitario1(float espumacombordasiliconeprecounitario1) {
        this.espumacombordasiliconeprecounitario1 = espumacombordasiliconeprecounitario1;
    }

    public float getEspumacombordasiliconepratausado() {
        return espumacombordasiliconepratausado;
    }

    public void setEspumacombordasiliconepratausado(float espumacombordasiliconepratausado) {
        this.espumacombordasiliconepratausado = espumacombordasiliconepratausado;
    }

    public float getEspumacombordasiliconeprataprecounitario() {
        return espumacombordasiliconeprataprecounitario;
    }

    public void setEspumacombordasiliconeprataprecounitario(float espumacombordasiliconeprataprecounitario) {
        this.espumacombordasiliconeprataprecounitario = espumacombordasiliconeprataprecounitario;
    }

    public float getEspumacombordasiliconeprataquantidadegastanoperiodo() {
        return espumacombordasiliconeprataquantidadegastanoperiodo;
    }

    public void setEspumacombordasiliconeprataquantidadegastanoperiodo(float espumacombordasiliconeprataquantidadegastanoperiodo) {
        this.espumacombordasiliconeprataquantidadegastanoperiodo = espumacombordasiliconeprataquantidadegastanoperiodo;
    }

    public float getEspumacombordasiliconepratavalorgastonoperiodo() {
        return espumacombordasiliconepratavalorgastonoperiodo;
    }

    public void setEspumacombordasiliconepratavalorgastonoperiodo(float espumacombordasiliconepratavalorgastonoperiodo) {
        this.espumacombordasiliconepratavalorgastonoperiodo = espumacombordasiliconepratavalorgastonoperiodo;
    }

    public int getEspumacombordasiliconepratadias() {
        return espumacombordasiliconepratadias;
    }

    public void setEspumacombordasiliconepratadias(int espumacombordasiliconepratadias) {
        this.espumacombordasiliconepratadias = espumacombordasiliconepratadias;
    }

    public float getEspumacombordasiliconeprataprecounitario1() {
        return espumacombordasiliconeprataprecounitario1;
    }

    public void setEspumacombordasiliconeprataprecounitario1(float espumacombordasiliconeprataprecounitario1) {
        this.espumacombordasiliconeprataprecounitario1 = espumacombordasiliconeprataprecounitario1;
    }

    public float getHidrofibrausado() {
        return hidrofibrausado;
    }

    public void setHidrofibrausado(float hidrofibrausado) {
        this.hidrofibrausado = hidrofibrausado;
    }

    public float getHidrofibraprecounitario() {
        return hidrofibraprecounitario;
    }

    public void setHidrofibraprecounitario(float hidrofibraprecounitario) {
        this.hidrofibraprecounitario = hidrofibraprecounitario;
    }

    public float getHidrofibraquantidadegastanoperiodo() {
        return hidrofibraquantidadegastanoperiodo;
    }

    public void setHidrofibraquantidadegastanoperiodo(float hidrofibraquantidadegastanoperiodo) {
        this.hidrofibraquantidadegastanoperiodo = hidrofibraquantidadegastanoperiodo;
    }

    public float getHidrofibravalorgastonoperiodo() {
        return hidrofibravalorgastonoperiodo;
    }

    public void setHidrofibravalorgastonoperiodo(float hidrofibravalorgastonoperiodo) {
        this.hidrofibravalorgastonoperiodo = hidrofibravalorgastonoperiodo;
    }

    public int getHidrofibradias() {
        return hidrofibradias;
    }

    public void setHidrofibradias(int hidrofibradias) {
        this.hidrofibradias = hidrofibradias;
    }

    public float getHidrofibraprecounitario1() {
        return hidrofibraprecounitario1;
    }

    public void setHidrofibraprecounitario1(float hidrofibraprecounitario1) {
        this.hidrofibraprecounitario1 = hidrofibraprecounitario1;
    }

    public float getHidrofibrapratausado() {
        return hidrofibrapratausado;
    }

    public void setHidrofibrapratausado(float hidrofibrapratausado) {
        this.hidrofibrapratausado = hidrofibrapratausado;
    }

    public float getHidrofibraprataprecounitario() {
        return hidrofibraprataprecounitario;
    }

    public void setHidrofibraprataprecounitario(float hidrofibraprataprecounitario) {
        this.hidrofibraprataprecounitario = hidrofibraprataprecounitario;
    }

    public float getHidrofibraprataquantidadegastanoperiodo() {
        return hidrofibraprataquantidadegastanoperiodo;
    }

    public void setHidrofibraprataquantidadegastanoperiodo(float hidrofibraprataquantidadegastanoperiodo) {
        this.hidrofibraprataquantidadegastanoperiodo = hidrofibraprataquantidadegastanoperiodo;
    }

    public float getHidrofibrapratavalorgastonoperiodo() {
        return hidrofibrapratavalorgastonoperiodo;
    }

    public void setHidrofibrapratavalorgastonoperiodo(float hidrofibrapratavalorgastonoperiodo) {
        this.hidrofibrapratavalorgastonoperiodo = hidrofibrapratavalorgastonoperiodo;
    }

    public int getHidrofibrapratadias() {
        return hidrofibrapratadias;
    }

    public void setHidrofibrapratadias(int hidrofibrapratadias) {
        this.hidrofibrapratadias = hidrofibrapratadias;
    }

    public float getHidrofibraprataprecounitario1() {
        return hidrofibraprataprecounitario1;
    }

    public void setHidrofibraprataprecounitario1(float hidrofibraprataprecounitario1) {
        this.hidrofibraprataprecounitario1 = hidrofibraprataprecounitario1;
    }

    public float getHidrogelbusado() {
        return hidrogelbusado;
    }

    public void setHidrogelbusado(float hidrogelbusado) {
        this.hidrogelbusado = hidrogelbusado;
    }

    public float getHidrogelbprecounitario() {
        return hidrogelbprecounitario;
    }

    public void setHidrogelbprecounitario(float hidrogelbprecounitario) {
        this.hidrogelbprecounitario = hidrogelbprecounitario;
    }

    public float getHidrogelbquantidadegastanoperiodo() {
        return hidrogelbquantidadegastanoperiodo;
    }

    public void setHidrogelbquantidadegastanoperiodo(float hidrogelbquantidadegastanoperiodo) {
        this.hidrogelbquantidadegastanoperiodo = hidrogelbquantidadegastanoperiodo;
    }

    public float getHidrogelbvalorgastonoperiodo() {
        return hidrogelbvalorgastonoperiodo;
    }

    public void setHidrogelbvalorgastonoperiodo(float hidrogelbvalorgastonoperiodo) {
        this.hidrogelbvalorgastonoperiodo = hidrogelbvalorgastonoperiodo;
    }

    public int getHidrogelbdias() {
        return hidrogelbdias;
    }

    public void setHidrogelbdias(int hidrogelbdias) {
        this.hidrogelbdias = hidrogelbdias;
    }

    public float getHidrogelbprecounitario1() {
        return hidrogelbprecounitario1;
    }

    public void setHidrogelbprecounitario1(float hidrogelbprecounitario1) {
        this.hidrogelbprecounitario1 = hidrogelbprecounitario1;
    }

    public float getPapainausado() {
        return papainausado;
    }

    public void setPapainausado(float papainausado) {
        this.papainausado = papainausado;
    }

    public float getPapainaprecounitario() {
        return papainaprecounitario;
    }

    public void setPapainaprecounitario(float papainaprecounitario) {
        this.papainaprecounitario = papainaprecounitario;
    }

    public float getPapainaquantidadegastanoperiodo() {
        return papainaquantidadegastanoperiodo;
    }

    public void setPapainaquantidadegastanoperiodo(float papainaquantidadegastanoperiodo) {
        this.papainaquantidadegastanoperiodo = papainaquantidadegastanoperiodo;
    }

    public float getPapainavalorgastonoperiodo() {
        return papainavalorgastonoperiodo;
    }

    public void setPapainavalorgastonoperiodo(float papainavalorgastonoperiodo) {
        this.papainavalorgastonoperiodo = papainavalorgastonoperiodo;
    }

    public int getPapainadias() {
        return papainadias;
    }

    public void setPapainadias(int papainadias) {
        this.papainadias = papainadias;
    }

    public float getPapainaprecounitario1() {
        return papainaprecounitario1;
    }

    public void setPapainaprecounitario1(float papainaprecounitario1) {
        this.papainaprecounitario1 = papainaprecounitario1;
    }

    public float getSulfadiazinapratausado() {
        return sulfadiazinapratausado;
    }

    public void setSulfadiazinapratausado(float sulfadiazinapratausado) {
        this.sulfadiazinapratausado = sulfadiazinapratausado;
    }

    public float getSulfadiazinaprataprecounitario() {
        return sulfadiazinaprataprecounitario;
    }

    public void setSulfadiazinaprataprecounitario(float sulfadiazinaprataprecounitario) {
        this.sulfadiazinaprataprecounitario = sulfadiazinaprataprecounitario;
    }

    public float getSulfadiazinaprataquantidadegastanoperiodo() {
        return sulfadiazinaprataquantidadegastanoperiodo;
    }

    public void setSulfadiazinaprataquantidadegastanoperiodo(float sulfadiazinaprataquantidadegastanoperiodo) {
        this.sulfadiazinaprataquantidadegastanoperiodo = sulfadiazinaprataquantidadegastanoperiodo;
    }

    public float getSulfadiazinapratavalorgastonoperiodo() {
        return sulfadiazinapratavalorgastonoperiodo;
    }

    public void setSulfadiazinapratavalorgastonoperiodo(float sulfadiazinapratavalorgastonoperiodo) {
        this.sulfadiazinapratavalorgastonoperiodo = sulfadiazinapratavalorgastonoperiodo;
    }

    public int getSulfadiazinapratadias() {
        return sulfadiazinapratadias;
    }

    public void setSulfadiazinapratadias(int sulfadiazinapratadias) {
        this.sulfadiazinapratadias = sulfadiazinapratadias;
    }

    public float getSulfadiazinaprataprecounitario1() {
        return sulfadiazinaprataprecounitario1;
    }

    public void setSulfadiazinaprataprecounitario1(float sulfadiazinaprataprecounitario1) {
        this.sulfadiazinaprataprecounitario1 = sulfadiazinaprataprecounitario1;
    }

    public float getKolagenaseusado() {
        return kolagenaseusado;
    }

    public void setKolagenaseusado(float kolagenaseusado) {
        this.kolagenaseusado = kolagenaseusado;
    }

    public float getKolagenaseprecounitario() {
        return kolagenaseprecounitario;
    }

    public void setKolagenaseprecounitario(float kolagenaseprecounitario) {
        this.kolagenaseprecounitario = kolagenaseprecounitario;
    }

    public float getKolagenasequantidadegastanoperiodo() {
        return kolagenasequantidadegastanoperiodo;
    }

    public void setKolagenasequantidadegastanoperiodo(float kolagenasequantidadegastanoperiodo) {
        this.kolagenasequantidadegastanoperiodo = kolagenasequantidadegastanoperiodo;
    }

    public float getKolagenasevalorgastonoperiodo() {
        return kolagenasevalorgastonoperiodo;
    }

    public void setKolagenasevalorgastonoperiodo(float kolagenasevalorgastonoperiodo) {
        this.kolagenasevalorgastonoperiodo = kolagenasevalorgastonoperiodo;
    }

    public int getKolagenasedias() {
        return kolagenasedias;
    }

    public void setKolagenasedias(int kolagenasedias) {
        this.kolagenasedias = kolagenasedias;
    }

    public float getKolagenaseprecounitario1() {
        return kolagenaseprecounitario1;
    }

    public void setKolagenaseprecounitario1(float kolagenaseprecounitario1) {
        this.kolagenaseprecounitario1 = kolagenaseprecounitario1;
    }

    public float getTelapratananocristalinausado() {
        return telapratananocristalinausado;
    }

    public void setTelapratananocristalinausado(float telapratananocristalinausado) {
        this.telapratananocristalinausado = telapratananocristalinausado;
    }

    public float getTelapratananocristalinaprecounitario() {
        return telapratananocristalinaprecounitario;
    }

    public void setTelapratananocristalinaprecounitario(float telapratananocristalinaprecounitario) {
        this.telapratananocristalinaprecounitario = telapratananocristalinaprecounitario;
    }

    public float getTelapratananocristalinaquantidadegastanoperiodo() {
        return telapratananocristalinaquantidadegastanoperiodo;
    }

    public void setTelapratananocristalinaquantidadegastanoperiodo(float telapratananocristalinaquantidadegastanoperiodo) {
        this.telapratananocristalinaquantidadegastanoperiodo = telapratananocristalinaquantidadegastanoperiodo;
    }

    public float getTelapratananocristalinavalorgastonoperiodo() {
        return telapratananocristalinavalorgastonoperiodo;
    }

    public void setTelapratananocristalinavalorgastonoperiodo(float telapratananocristalinavalorgastonoperiodo) {
        this.telapratananocristalinavalorgastonoperiodo = telapratananocristalinavalorgastonoperiodo;
    }

    public int getTelapratananocristalinadias() {
        return telapratananocristalinadias;
    }

    public void setTelapratananocristalinadias(int telapratananocristalinadias) {
        this.telapratananocristalinadias = telapratananocristalinadias;
    }

    public float getTelapratananocristalinaprecounitario1() {
        return telapratananocristalinaprecounitario1;
    }

    public void setTelapratananocristalinaprecounitario1(float telapratananocristalinaprecounitario1) {
        this.telapratananocristalinaprecounitario1 = telapratananocristalinaprecounitario1;
    }

    public float getRayonusado() {
        return rayonusado;
    }

    public void setRayonusado(float rayonusado) {
        this.rayonusado = rayonusado;
    }

    public float getRayonprecounitario() {
        return rayonprecounitario;
    }

    public void setRayonprecounitario(float rayonprecounitario) {
        this.rayonprecounitario = rayonprecounitario;
    }

    public float getRayonquantidadegastanoperiodo() {
        return rayonquantidadegastanoperiodo;
    }

    public void setRayonquantidadegastanoperiodo(float rayonquantidadegastanoperiodo) {
        this.rayonquantidadegastanoperiodo = rayonquantidadegastanoperiodo;
    }

    public float getRayonvalorgastonoperiodo() {
        return rayonvalorgastonoperiodo;
    }

    public void setRayonvalorgastonoperiodo(float rayonvalorgastonoperiodo) {
        this.rayonvalorgastonoperiodo = rayonvalorgastonoperiodo;
    }

    public int getRayondias() {
        return rayondias;
    }

    public void setRayondias(int rayondias) {
        this.rayondias = rayondias;
    }

    public float getRayonprecounitario1() {
        return rayonprecounitario1;
    }

    public void setRayonprecounitario1(float rayonprecounitario1) {
        this.rayonprecounitario1 = rayonprecounitario1;
    }

    public float getTelanaderenteimpregnadausado() {
        return telanaderenteimpregnadausado;
    }

    public void setTelanaderenteimpregnadausado(float telanaderenteimpregnadausado) {
        this.telanaderenteimpregnadausado = telanaderenteimpregnadausado;
    }

    public float getTelanaderenteimpregnadaprecounitario() {
        return telanaderenteimpregnadaprecounitario;
    }

    public void setTelanaderenteimpregnadaprecounitario(float telanaderenteimpregnadaprecounitario) {
        this.telanaderenteimpregnadaprecounitario = telanaderenteimpregnadaprecounitario;
    }

    public float getTelanaderenteimpregnadaquantidadegastanoperiodo() {
        return telanaderenteimpregnadaquantidadegastanoperiodo;
    }

    public void setTelanaderenteimpregnadaquantidadegastanoperiodo(float telanaderenteimpregnadaquantidadegastanoperiodo) {
        this.telanaderenteimpregnadaquantidadegastanoperiodo = telanaderenteimpregnadaquantidadegastanoperiodo;
    }

    public float getTelanaderenteimpregnadavalorgastonoperiodo() {
        return telanaderenteimpregnadavalorgastonoperiodo;
    }

    public void setTelanaderenteimpregnadavalorgastonoperiodo(float telanaderenteimpregnadavalorgastonoperiodo) {
        this.telanaderenteimpregnadavalorgastonoperiodo = telanaderenteimpregnadavalorgastonoperiodo;
    }

    public int getTelanaderenteimpregnadadias() {
        return telanaderenteimpregnadadias;
    }

    public void setTelanaderenteimpregnadadias(int telanaderenteimpregnadadias) {
        this.telanaderenteimpregnadadias = telanaderenteimpregnadadias;
    }

    public float getTelanaderenteimpregnadaprecounitario1() {
        return telanaderenteimpregnadaprecounitario1;
    }

    public void setTelanaderenteimpregnadaprecounitario1(float telanaderenteimpregnadaprecounitario1) {
        this.telanaderenteimpregnadaprecounitario1 = telanaderenteimpregnadaprecounitario1;
    }

    public float getCarvaousado() {
        return carvaousado;
    }

    public void setCarvaousado(float carvaousado) {
        this.carvaousado = carvaousado;
    }

    public float getCarvaoprecounitario() {
        return carvaoprecounitario;
    }

    public void setCarvaoprecounitario(float carvaoprecounitario) {
        this.carvaoprecounitario = carvaoprecounitario;
    }

    public float getCarvaoquantidadegastanoperiodo() {
        return carvaoquantidadegastanoperiodo;
    }

    public void setCarvaoquantidadegastanoperiodo(float carvaoquantidadegastanoperiodo) {
        this.carvaoquantidadegastanoperiodo = carvaoquantidadegastanoperiodo;
    }

    public float getCarvaovalorgastonoperiodo() {
        return carvaovalorgastonoperiodo;
    }

    public void setCarvaovalorgastonoperiodo(float carvaovalorgastonoperiodo) {
        this.carvaovalorgastonoperiodo = carvaovalorgastonoperiodo;
    }

    public int getCarvaodias() {
        return carvaodias;
    }

    public void setCarvaodias(int carvaodias) {
        this.carvaodias = carvaodias;
    }

    public float getCarvaoprecounitario1() {
        return carvaoprecounitario1;
    }

    public void setCarvaoprecounitario1(float carvaoprecounitario1) {
        this.carvaoprecounitario1 = carvaoprecounitario1;
    }

    public float getCarvaopratausado() {
        return carvaopratausado;
    }

    public void setCarvaopratausado(float carvaopratausado) {
        this.carvaopratausado = carvaopratausado;
    }

    public float getCarvaoprataprecounitario() {
        return carvaoprataprecounitario;
    }

    public void setCarvaoprataprecounitario(float carvaoprataprecounitario) {
        this.carvaoprataprecounitario = carvaoprataprecounitario;
    }

    public float getCarvaoprataquantidadegastanoperiodo() {
        return carvaoprataquantidadegastanoperiodo;
    }

    public void setCarvaoprataquantidadegastanoperiodo(float carvaoprataquantidadegastanoperiodo) {
        this.carvaoprataquantidadegastanoperiodo = carvaoprataquantidadegastanoperiodo;
    }

    public float getCarvaopratavalorgastonoperiodo() {
        return carvaopratavalorgastonoperiodo;
    }

    public void setCarvaopratavalorgastonoperiodo(float carvaopratavalorgastonoperiodo) {
        this.carvaopratavalorgastonoperiodo = carvaopratavalorgastonoperiodo;
    }

    public int getCarvaopratadias() {
        return carvaopratadias;
    }

    public void setCarvaopratadias(int carvaopratadias) {
        this.carvaopratadias = carvaopratadias;
    }

    public float getCarvaoprataprecounitario1() {
        return carvaoprataprecounitario1;
    }

    public void setCarvaoprataprecounitario1(float carvaoprataprecounitario1) {
        this.carvaoprataprecounitario1 = carvaoprataprecounitario1;
    }

    public float getFilmetransparenteusado() {
        return filmetransparenteusado;
    }

    public void setFilmetransparenteusado(float filmetransparenteusado) {
        this.filmetransparenteusado = filmetransparenteusado;
    }

    public float getFilmetransparenteprecounitario() {
        return filmetransparenteprecounitario;
    }

    public void setFilmetransparenteprecounitario(float filmetransparenteprecounitario) {
        this.filmetransparenteprecounitario = filmetransparenteprecounitario;
    }

    public float getFilmetransparentequantidadegastanoperiodo() {
        return filmetransparentequantidadegastanoperiodo;
    }

    public void setFilmetransparentequantidadegastanoperiodo(float filmetransparentequantidadegastanoperiodo) {
        this.filmetransparentequantidadegastanoperiodo = filmetransparentequantidadegastanoperiodo;
    }

    public float getFilmetransparentevalorgastonoperiodo() {
        return filmetransparentevalorgastonoperiodo;
    }

    public void setFilmetransparentevalorgastonoperiodo(float filmetransparentevalorgastonoperiodo) {
        this.filmetransparentevalorgastonoperiodo = filmetransparentevalorgastonoperiodo;
    }

    public int getFilmetransparentedias() {
        return filmetransparentedias;
    }

    public void setFilmetransparentedias(int filmetransparentedias) {
        this.filmetransparentedias = filmetransparentedias;
    }

    public float getFilmetransparenteprecounitario1() {
        return filmetransparenteprecounitario1;
    }

    public void setFilmetransparenteprecounitario1(float filmetransparenteprecounitario1) {
        this.filmetransparenteprecounitario1 = filmetransparenteprecounitario1;
    }

    public float getHidrocoloideusado() {
        return hidrocoloideusado;
    }

    public void setHidrocoloideusado(float hidrocoloideusado) {
        this.hidrocoloideusado = hidrocoloideusado;
    }

    public float getHidrocoloideprecounitario() {
        return hidrocoloideprecounitario;
    }

    public void setHidrocoloideprecounitario(float hidrocoloideprecounitario) {
        this.hidrocoloideprecounitario = hidrocoloideprecounitario;
    }

    public float getHidrocoloidequantidadegastanoperiodo() {
        return hidrocoloidequantidadegastanoperiodo;
    }

    public void setHidrocoloidequantidadegastanoperiodo(float hidrocoloidequantidadegastanoperiodo) {
        this.hidrocoloidequantidadegastanoperiodo = hidrocoloidequantidadegastanoperiodo;
    }

    public float getHidrocoloidevalorgastonoperiodo() {
        return hidrocoloidevalorgastonoperiodo;
    }

    public void setHidrocoloidevalorgastonoperiodo(float hidrocoloidevalorgastonoperiodo) {
        this.hidrocoloidevalorgastonoperiodo = hidrocoloidevalorgastonoperiodo;
    }

    public int getHidrocoloidedias() {
        return hidrocoloidedias;
    }

    public void setHidrocoloidedias(int hidrocoloidedias) {
        this.hidrocoloidedias = hidrocoloidedias;
    }

    public float getHidrocoloideprecounitario1() {
        return hidrocoloideprecounitario1;
    }

    public void setHidrocoloideprecounitario1(float hidrocoloideprecounitario1) {
        this.hidrocoloideprecounitario1 = hidrocoloideprecounitario1;
    }

    public float getProtetorcutaneousado() {
        return protetorcutaneousado;
    }

    public void setProtetorcutaneousado(float protetorcutaneousado) {
        this.protetorcutaneousado = protetorcutaneousado;
    }

    public float getProtetorcutaneoprecounitario() {
        return protetorcutaneoprecounitario;
    }

    public void setProtetorcutaneoprecounitario(float protetorcutaneoprecounitario) {
        this.protetorcutaneoprecounitario = protetorcutaneoprecounitario;
    }

    public float getProtetorcutaneoquantidadegastanoperiodo() {
        return protetorcutaneoquantidadegastanoperiodo;
    }

    public void setProtetorcutaneoquantidadegastanoperiodo(float protetorcutaneoquantidadegastanoperiodo) {
        this.protetorcutaneoquantidadegastanoperiodo = protetorcutaneoquantidadegastanoperiodo;
    }

    public float getProtetorcutaneovalorgastonoperiodo() {
        return protetorcutaneovalorgastonoperiodo;
    }

    public void setProtetorcutaneovalorgastonoperiodo(float protetorcutaneovalorgastonoperiodo) {
        this.protetorcutaneovalorgastonoperiodo = protetorcutaneovalorgastonoperiodo;
    }

    public int getProtetorcutaneodias() {
        return protetorcutaneodias;
    }

    public void setProtetorcutaneodias(int protetorcutaneodias) {
        this.protetorcutaneodias = protetorcutaneodias;
    }

    public float getProtetorcutaneoprecounitario1() {
        return protetorcutaneoprecounitario1;
    }

    public void setProtetorcutaneoprecounitario1(float protetorcutaneoprecounitario1) {
        this.protetorcutaneoprecounitario1 = protetorcutaneoprecounitario1;
    }

    public float getGazeesterilusado() {
        return gazeesterilusado;
    }

    public void setGazeesterilusado(float gazeesterilusado) {
        this.gazeesterilusado = gazeesterilusado;
    }

    public float getGazeesterilprecounitario() {
        return gazeesterilprecounitario;
    }

    public void setGazeesterilprecounitario(float gazeesterilprecounitario) {
        this.gazeesterilprecounitario = gazeesterilprecounitario;
    }

    public float getGazeesterilquantidadegastanoperiodo() {
        return gazeesterilquantidadegastanoperiodo;
    }

    public void setGazeesterilquantidadegastanoperiodo(float gazeesterilquantidadegastanoperiodo) {
        this.gazeesterilquantidadegastanoperiodo = gazeesterilquantidadegastanoperiodo;
    }

    public float getGazeesterilvalorgastonoperiodo() {
        return gazeesterilvalorgastonoperiodo;
    }

    public void setGazeesterilvalorgastonoperiodo(float gazeesterilvalorgastonoperiodo) {
        this.gazeesterilvalorgastonoperiodo = gazeesterilvalorgastonoperiodo;
    }

    public int getGazeesterildias() {
        return gazeesterildias;
    }

    public void setGazeesterildias(int gazeesterildias) {
        this.gazeesterildias = gazeesterildias;
    }

    public float getGazeesterilprecounitario1() {
        return gazeesterilprecounitario1;
    }

    public void setGazeesterilprecounitario1(float gazeesterilprecounitario1) {
        this.gazeesterilprecounitario1 = gazeesterilprecounitario1;
    }

    public float getGazenesterilusado() {
        return gazenesterilusado;
    }

    public void setGazenesterilusado(float gazenesterilusado) {
        this.gazenesterilusado = gazenesterilusado;
    }

    public float getGazenesterilprecounitario() {
        return gazenesterilprecounitario;
    }

    public void setGazenesterilprecounitario(float gazenesterilprecounitario) {
        this.gazenesterilprecounitario = gazenesterilprecounitario;
    }

    public float getGazenesterilquantidadegastanoperiodo() {
        return gazenesterilquantidadegastanoperiodo;
    }

    public void setGazenesterilquantidadegastanoperiodo(float gazenesterilquantidadegastanoperiodo) {
        this.gazenesterilquantidadegastanoperiodo = gazenesterilquantidadegastanoperiodo;
    }

    public float getGazenesterilvalorgastonoperiodo() {
        return gazenesterilvalorgastonoperiodo;
    }

    public void setGazenesterilvalorgastonoperiodo(float gazenesterilvalorgastonoperiodo) {
        this.gazenesterilvalorgastonoperiodo = gazenesterilvalorgastonoperiodo;
    }

    public int getGazenesterildias() {
        return gazenesterildias;
    }

    public void setGazenesterildias(int gazenesterildias) {
        this.gazenesterildias = gazenesterildias;
    }

    public float getGazenesterilprecounitario1() {
        return gazenesterilprecounitario1;
    }

    public void setGazenesterilprecounitario1(float gazenesterilprecounitario1) {
        this.gazenesterilprecounitario1 = gazenesterilprecounitario1;
    }

    public float getAtadurausado() {
        return atadurausado;
    }

    public void setAtadurausado(float atadurausado) {
        this.atadurausado = atadurausado;
    }

    public float getAtaduraprecounitario() {
        return ataduraprecounitario;
    }

    public void setAtaduraprecounitario(float ataduraprecounitario) {
        this.ataduraprecounitario = ataduraprecounitario;
    }

    public float getAtaduraquantidadegastanoperiodo() {
        return ataduraquantidadegastanoperiodo;
    }

    public void setAtaduraquantidadegastanoperiodo(float ataduraquantidadegastanoperiodo) {
        this.ataduraquantidadegastanoperiodo = ataduraquantidadegastanoperiodo;
    }

    public float getAtaduravalorgastonoperiodo() {
        return ataduravalorgastonoperiodo;
    }

    public void setAtaduravalorgastonoperiodo(float ataduravalorgastonoperiodo) {
        this.ataduravalorgastonoperiodo = ataduravalorgastonoperiodo;
    }

    public int getAtaduradias() {
        return ataduradias;
    }

    public void setAtaduradias(int ataduradias) {
        this.ataduradias = ataduradias;
    }

    public float getAtaduraprecounitario1() {
        return ataduraprecounitario1;
    }

    public void setAtaduraprecounitario1(float ataduraprecounitario1) {
        this.ataduraprecounitario1 = ataduraprecounitario1;
    }

    public float getFitaadesivausado() {
        return fitaadesivausado;
    }

    public void setFitaadesivausado(float fitaadesivausado) {
        this.fitaadesivausado = fitaadesivausado;
    }

    public float getFitaadesivaprecounitario() {
        return fitaadesivaprecounitario;
    }

    public void setFitaadesivaprecounitario(float fitaadesivaprecounitario) {
        this.fitaadesivaprecounitario = fitaadesivaprecounitario;
    }

    public float getFitaadesivaquantidadegastanoperiodo() {
        return fitaadesivaquantidadegastanoperiodo;
    }

    public void setFitaadesivaquantidadegastanoperiodo(float fitaadesivaquantidadegastanoperiodo) {
        this.fitaadesivaquantidadegastanoperiodo = fitaadesivaquantidadegastanoperiodo;
    }

    public float getFitaadesivavalorgastonoperiodo() {
        return fitaadesivavalorgastonoperiodo;
    }

    public void setFitaadesivavalorgastonoperiodo(float fitaadesivavalorgastonoperiodo) {
        this.fitaadesivavalorgastonoperiodo = fitaadesivavalorgastonoperiodo;
    }

    public int getFitaadesivadias() {
        return fitaadesivadias;
    }

    public void setFitaadesivadias(int fitaadesivadias) {
        this.fitaadesivadias = fitaadesivadias;
    }

    public float getFitaadesivaprecounitario1() {
        return fitaadesivaprecounitario1;
    }

    public void setFitaadesivaprecounitario1(float fitaadesivaprecounitario1) {
        this.fitaadesivaprecounitario1 = fitaadesivaprecounitario1;
    }

    public float getRayon2usado() {
        return rayon2usado;
    }

    public void setRayon2usado(float rayon2usado) {
        this.rayon2usado = rayon2usado;
    }

    public float getRayon2precounitario() {
        return rayon2precounitario;
    }

    public void setRayon2precounitario(float rayon2precounitario) {
        this.rayon2precounitario = rayon2precounitario;
    }

    public float getRayon2quantidadegastanoperiodo() {
        return rayon2quantidadegastanoperiodo;
    }

    public void setRayon2quantidadegastanoperiodo(float rayon2quantidadegastanoperiodo) {
        this.rayon2quantidadegastanoperiodo = rayon2quantidadegastanoperiodo;
    }

    public float getRayon2valorgastonoperiodo() {
        return rayon2valorgastonoperiodo;
    }

    public void setRayon2valorgastonoperiodo(float rayon2valorgastonoperiodo) {
        this.rayon2valorgastonoperiodo = rayon2valorgastonoperiodo;
    }

    public int getRayon2dias() {
        return rayon2dias;
    }

    public void setRayon2dias(int rayon2dias) {
        this.rayon2dias = rayon2dias;
    }

    public float getRayon2precounitario1() {
        return rayon2precounitario1;
    }

    public void setRayon2precounitario1(float rayon2precounitario1) {
        this.rayon2precounitario1 = rayon2precounitario1;
    }

    public float getChumacousado() {
        return chumacousado;
    }

    public void setChumacousado(float chumacousado) {
        this.chumacousado = chumacousado;
    }

    public float getChumacoprecounitario() {
        return chumacoprecounitario;
    }

    public void setChumacoprecounitario(float chumacoprecounitario) {
        this.chumacoprecounitario = chumacoprecounitario;
    }

    public float getChumacoquantidadegastanoperiodo() {
        return chumacoquantidadegastanoperiodo;
    }

    public void setChumacoquantidadegastanoperiodo(float chumacoquantidadegastanoperiodo) {
        this.chumacoquantidadegastanoperiodo = chumacoquantidadegastanoperiodo;
    }

    public float getChumacovalorgastonoperiodo() {
        return chumacovalorgastonoperiodo;
    }

    public void setChumacovalorgastonoperiodo(float chumacovalorgastonoperiodo) {
        this.chumacovalorgastonoperiodo = chumacovalorgastonoperiodo;
    }

    public int getChumacodias() {
        return chumacodias;
    }

    public void setChumacodias(int chumacodias) {
        this.chumacodias = chumacodias;
    }

    public float getChumacoprecounitario1() {
        return chumacoprecounitario1;
    }

    public void setChumacoprecounitario1(float chumacoprecounitario1) {
        this.chumacoprecounitario1 = chumacoprecounitario1;
    }

    public float getCompressaesterilusado() {
        return compressaesterilusado;
    }

    public void setCompressaesterilusado(float compressaesterilusado) {
        this.compressaesterilusado = compressaesterilusado;
    }

    public float getCompressaesterilprecounitario() {
        return compressaesterilprecounitario;
    }

    public void setCompressaesterilprecounitario(float compressaesterilprecounitario) {
        this.compressaesterilprecounitario = compressaesterilprecounitario;
    }

    public float getCompressaesterilquantidadegastanoperiodo() {
        return compressaesterilquantidadegastanoperiodo;
    }

    public void setCompressaesterilquantidadegastanoperiodo(float compressaesterilquantidadegastanoperiodo) {
        this.compressaesterilquantidadegastanoperiodo = compressaesterilquantidadegastanoperiodo;
    }

    public float getCompressaesterilvalorgastonoperiodo() {
        return compressaesterilvalorgastonoperiodo;
    }

    public void setCompressaesterilvalorgastonoperiodo(float compressaesterilvalorgastonoperiodo) {
        this.compressaesterilvalorgastonoperiodo = compressaesterilvalorgastonoperiodo;
    }

    public int getCompressaesterildias() {
        return compressaesterildias;
    }

    public void setCompressaesterildias(int compressaesterildias) {
        this.compressaesterildias = compressaesterildias;
    }

    public float getCompressaesterilprecounitario1() {
        return compressaesterilprecounitario1;
    }

    public void setCompressaesterilprecounitario1(float compressaesterilprecounitario1) {
        this.compressaesterilprecounitario1 = compressaesterilprecounitario1;
    }

    public float getEspuma2usado() {
        return espuma2usado;
    }

    public void setEspuma2usado(float espuma2usado) {
        this.espuma2usado = espuma2usado;
    }

    public float getEspuma2precounitario() {
        return espuma2precounitario;
    }

    public void setEspuma2precounitario(float espuma2precounitario) {
        this.espuma2precounitario = espuma2precounitario;
    }

    public float getEspuma2quantidadegastanoperiodo() {
        return espuma2quantidadegastanoperiodo;
    }

    public void setEspuma2quantidadegastanoperiodo(float espuma2quantidadegastanoperiodo) {
        this.espuma2quantidadegastanoperiodo = espuma2quantidadegastanoperiodo;
    }

    public float getEspuma2valorgastonoperiodo() {
        return espuma2valorgastonoperiodo;
    }

    public void setEspuma2valorgastonoperiodo(float espuma2valorgastonoperiodo) {
        this.espuma2valorgastonoperiodo = espuma2valorgastonoperiodo;
    }

    public int getEspuma2dias() {
        return espuma2dias;
    }

    public void setEspuma2dias(int espuma2dias) {
        this.espuma2dias = espuma2dias;
    }

    public float getEspuma2precounitario1() {
        return espuma2precounitario1;
    }

    public void setEspuma2precounitario1(float espuma2precounitario1) {
        this.espuma2precounitario1 = espuma2precounitario1;
    }

    public float getFilmetransparente2usado() {
        return filmetransparente2usado;
    }

    public void setFilmetransparente2usado(float filmetransparente2usado) {
        this.filmetransparente2usado = filmetransparente2usado;
    }

    public float getFilmetransparente2precounitario() {
        return filmetransparente2precounitario;
    }

    public void setFilmetransparente2precounitario(float filmetransparente2precounitario) {
        this.filmetransparente2precounitario = filmetransparente2precounitario;
    }

    public float getFilmetransparente2quantidadegastanoperiodo() {
        return filmetransparente2quantidadegastanoperiodo;
    }

    public void setFilmetransparente2quantidadegastanoperiodo(float filmetransparente2quantidadegastanoperiodo) {
        this.filmetransparente2quantidadegastanoperiodo = filmetransparente2quantidadegastanoperiodo;
    }

    public float getFilmetransparente2valorgastonoperiodo() {
        return filmetransparente2valorgastonoperiodo;
    }

    public void setFilmetransparente2valorgastonoperiodo(float filmetransparente2valorgastonoperiodo) {
        this.filmetransparente2valorgastonoperiodo = filmetransparente2valorgastonoperiodo;
    }

    public int getFilmetransparente2dias() {
        return filmetransparente2dias;
    }

    public void setFilmetransparente2dias(int filmetransparente2dias) {
        this.filmetransparente2dias = filmetransparente2dias;
    }

    public float getFilmetransparente2precounitario1() {
        return filmetransparente2precounitario1;
    }

    public void setFilmetransparente2precounitario1(float filmetransparente2precounitario1) {
        this.filmetransparente2precounitario1 = filmetransparente2precounitario1;
    }

    public float getPressaonegativacpratausado() {
        return pressaonegativacpratausado;
    }

    public void setPressaonegativacpratausado(float pressaonegativacpratausado) {
        this.pressaonegativacpratausado = pressaonegativacpratausado;
    }

    public float getPressaonegativacprataprecounitario() {
        return pressaonegativacprataprecounitario;
    }

    public void setPressaonegativacprataprecounitario(float pressaonegativacprataprecounitario) {
        this.pressaonegativacprataprecounitario = pressaonegativacprataprecounitario;
    }

    public float getPressaonegativacprataquantidadegastanoperiodo() {
        return pressaonegativacprataquantidadegastanoperiodo;
    }

    public void setPressaonegativacprataquantidadegastanoperiodo(float pressaonegativacprataquantidadegastanoperiodo) {
        this.pressaonegativacprataquantidadegastanoperiodo = pressaonegativacprataquantidadegastanoperiodo;
    }

    public float getPressaonegativacpratavalorgastonoperiodo() {
        return pressaonegativacpratavalorgastonoperiodo;
    }

    public void setPressaonegativacpratavalorgastonoperiodo(float pressaonegativacpratavalorgastonoperiodo) {
        this.pressaonegativacpratavalorgastonoperiodo = pressaonegativacpratavalorgastonoperiodo;
    }

    public int getPressaonegativacpratadias() {
        return pressaonegativacpratadias;
    }

    public void setPressaonegativacpratadias(int pressaonegativacpratadias) {
        this.pressaonegativacpratadias = pressaonegativacpratadias;
    }

    public float getPressaonegativacprataprecounitario1() {
        return pressaonegativacprataprecounitario1;
    }

    public void setPressaonegativacprataprecounitario1(float pressaonegativacprataprecounitario1) {
        this.pressaonegativacprataprecounitario1 = pressaonegativacprataprecounitario1;
    }

    public float getPressaonegativaspratausado() {
        return pressaonegativaspratausado;
    }

    public void setPressaonegativaspratausado(float pressaonegativaspratausado) {
        this.pressaonegativaspratausado = pressaonegativaspratausado;
    }

    public float getPressaonegativasprataprecounitario() {
        return pressaonegativasprataprecounitario;
    }

    public void setPressaonegativasprataprecounitario(float pressaonegativasprataprecounitario) {
        this.pressaonegativasprataprecounitario = pressaonegativasprataprecounitario;
    }

    public float getPressaonegativasprataquantidadegastanoperiodo() {
        return pressaonegativasprataquantidadegastanoperiodo;
    }

    public void setPressaonegativasprataquantidadegastanoperiodo(float pressaonegativasprataquantidadegastanoperiodo) {
        this.pressaonegativasprataquantidadegastanoperiodo = pressaonegativasprataquantidadegastanoperiodo;
    }

    public float getPressaonegativaspratavalorgastonoperiodo() {
        return pressaonegativaspratavalorgastonoperiodo;
    }

    public void setPressaonegativaspratavalorgastonoperiodo(float pressaonegativaspratavalorgastonoperiodo) {
        this.pressaonegativaspratavalorgastonoperiodo = pressaonegativaspratavalorgastonoperiodo;
    }

    public int getPressaonegativaspratadias() {
        return pressaonegativaspratadias;
    }

    public void setPressaonegativaspratadias(int pressaonegativaspratadias) {
        this.pressaonegativaspratadias = pressaonegativaspratadias;
    }

    public float getPressaonegativasprataprecounitario1() {
        return pressaonegativasprataprecounitario1;
    }

    public void setPressaonegativasprataprecounitario1(float pressaonegativasprataprecounitario1) {
        this.pressaonegativasprataprecounitario1 = pressaonegativasprataprecounitario1;
    }

    public float getCamahiperbaricausado() {
        return camahiperbaricausado;
    }

    public void setCamahiperbaricausado(float camahiperbaricausado) {
        this.camahiperbaricausado = camahiperbaricausado;
    }

    public float getCamahiperbaricaprecounitario() {
        return camahiperbaricaprecounitario;
    }

    public void setCamahiperbaricaprecounitario(float camahiperbaricaprecounitario) {
        this.camahiperbaricaprecounitario = camahiperbaricaprecounitario;
    }

    public float getCamahiperbaricaquantidadegastanoperiodo() {
        return camahiperbaricaquantidadegastanoperiodo;
    }

    public void setCamahiperbaricaquantidadegastanoperiodo(float camahiperbaricaquantidadegastanoperiodo) {
        this.camahiperbaricaquantidadegastanoperiodo = camahiperbaricaquantidadegastanoperiodo;
    }

    public float getCamahiperbaricavalorgastonoperiodo() {
        return camahiperbaricavalorgastonoperiodo;
    }

    public void setCamahiperbaricavalorgastonoperiodo(float camahiperbaricavalorgastonoperiodo) {
        this.camahiperbaricavalorgastonoperiodo = camahiperbaricavalorgastonoperiodo;
    }

    public int getCamahiperbaricadias() {
        return camahiperbaricadias;
    }

    public void setCamahiperbaricadias(int camahiperbaricadias) {
        this.camahiperbaricadias = camahiperbaricadias;
    }

    public float getCamahiperbaricaprecounitario1() {
        return camahiperbaricaprecounitario1;
    }

    public void setCamahiperbaricaprecounitario1(float camahiperbaricaprecounitario1) {
        this.camahiperbaricaprecounitario1 = camahiperbaricaprecounitario1;
    }

    public float getLaserterapiausado() {
        return laserterapiausado;
    }

    public void setLaserterapiausado(float laserterapiausado) {
        this.laserterapiausado = laserterapiausado;
    }

    public float getLaserterapiaprecounitario() {
        return laserterapiaprecounitario;
    }

    public void setLaserterapiaprecounitario(float laserterapiaprecounitario) {
        this.laserterapiaprecounitario = laserterapiaprecounitario;
    }

    public float getLaserterapiaquantidadegastanoperiodo() {
        return laserterapiaquantidadegastanoperiodo;
    }

    public void setLaserterapiaquantidadegastanoperiodo(float laserterapiaquantidadegastanoperiodo) {
        this.laserterapiaquantidadegastanoperiodo = laserterapiaquantidadegastanoperiodo;
    }

    public float getLaserterapiavalorgastonoperiodo() {
        return laserterapiavalorgastonoperiodo;
    }

    public void setLaserterapiavalorgastonoperiodo(float laserterapiavalorgastonoperiodo) {
        this.laserterapiavalorgastonoperiodo = laserterapiavalorgastonoperiodo;
    }

    public int getLaserterapiadias() {
        return laserterapiadias;
    }

    public void setLaserterapiadias(int laserterapiadias) {
        this.laserterapiadias = laserterapiadias;
    }

    public float getLaserterapiaprecounitario1() {
        return laserterapiaprecounitario1;
    }

    public void setLaserterapiaprecounitario1(float laserterapiaprecounitario1) {
        this.laserterapiaprecounitario1 = laserterapiaprecounitario1;
    }

    public float getDesbridamentocirurgicousado() {
        return desbridamentocirurgicousado;
    }

    public void setDesbridamentocirurgicousado(float desbridamentocirurgicousado) {
        this.desbridamentocirurgicousado = desbridamentocirurgicousado;
    }

    public float getDesbridamentocirurgicoprecounitario() {
        return desbridamentocirurgicoprecounitario;
    }

    public void setDesbridamentocirurgicoprecounitario(float desbridamentocirurgicoprecounitario) {
        this.desbridamentocirurgicoprecounitario = desbridamentocirurgicoprecounitario;
    }

    public float getDesbridamentocirurgicoquantidadegastanoperiodo() {
        return desbridamentocirurgicoquantidadegastanoperiodo;
    }

    public void setDesbridamentocirurgicoquantidadegastanoperiodo(float desbridamentocirurgicoquantidadegastanoperiodo) {
        this.desbridamentocirurgicoquantidadegastanoperiodo = desbridamentocirurgicoquantidadegastanoperiodo;
    }

    public float getDesbridamentocirurgicovalorgastonoperiodo() {
        return desbridamentocirurgicovalorgastonoperiodo;
    }

    public void setDesbridamentocirurgicovalorgastonoperiodo(float desbridamentocirurgicovalorgastonoperiodo) {
        this.desbridamentocirurgicovalorgastonoperiodo = desbridamentocirurgicovalorgastonoperiodo;
    }

    public int getDesbridamentocirurgicodias() {
        return desbridamentocirurgicodias;
    }

    public void setDesbridamentocirurgicodias(int desbridamentocirurgicodias) {
        this.desbridamentocirurgicodias = desbridamentocirurgicodias;
    }

    public float getDesbridamentocirurgicoprecounitario1() {
        return desbridamentocirurgicoprecounitario1;
    }

    public void setDesbridamentocirurgicoprecounitario1(float desbridamentocirurgicoprecounitario1) {
        this.desbridamentocirurgicoprecounitario1 = desbridamentocirurgicoprecounitario1;
    }

    public float getTaxadesalausado() {
        return taxadesalausado;
    }

    public void setTaxadesalausado(float taxadesalausado) {
        this.taxadesalausado = taxadesalausado;
    }

    public float getTaxadesalaprecounitario() {
        return taxadesalaprecounitario;
    }

    public void setTaxadesalaprecounitario(float taxadesalaprecounitario) {
        this.taxadesalaprecounitario = taxadesalaprecounitario;
    }

    public float getTaxadesalaquantidadegastanoperiodo() {
        return taxadesalaquantidadegastanoperiodo;
    }

    public void setTaxadesalaquantidadegastanoperiodo(float taxadesalaquantidadegastanoperiodo) {
        this.taxadesalaquantidadegastanoperiodo = taxadesalaquantidadegastanoperiodo;
    }

    public float getTaxadesalavalorgastonoperiodo() {
        return taxadesalavalorgastonoperiodo;
    }

    public void setTaxadesalavalorgastonoperiodo(float taxadesalavalorgastonoperiodo) {
        this.taxadesalavalorgastonoperiodo = taxadesalavalorgastonoperiodo;
    }

    public int getTaxadesaladias() {
        return taxadesaladias;
    }

    public void setTaxadesaladias(int taxadesaladias) {
        this.taxadesaladias = taxadesaladias;
    }

    public float getTaxadesalaprecounitario1() {
        return taxadesalaprecounitario1;
    }

    public void setTaxadesalaprecounitario1(float taxadesalaprecounitario1) {
        this.taxadesalaprecounitario1 = taxadesalaprecounitario1;
    }

    public float getAnalgesicoantiinflamatoriousado() {
        return analgesicoantiinflamatoriousado;
    }

    public void setAnalgesicoantiinflamatoriousado(float analgesicoantiinflamatoriousado) {
        this.analgesicoantiinflamatoriousado = analgesicoantiinflamatoriousado;
    }

    public float getAnalgesicoantiinflamatorioprecounitario() {
        return analgesicoantiinflamatorioprecounitario;
    }

    public void setAnalgesicoantiinflamatorioprecounitario(float analgesicoantiinflamatorioprecounitario) {
        this.analgesicoantiinflamatorioprecounitario = analgesicoantiinflamatorioprecounitario;
    }

    public float getAnalgesicoantiinflamatorioquantidadegastanoperiodo() {
        return analgesicoantiinflamatorioquantidadegastanoperiodo;
    }

    public void setAnalgesicoantiinflamatorioquantidadegastanoperiodo(float analgesicoantiinflamatorioquantidadegastanoperiodo) {
        this.analgesicoantiinflamatorioquantidadegastanoperiodo = analgesicoantiinflamatorioquantidadegastanoperiodo;
    }

    public float getAnalgesicoantiinflamatoriovalorgastonoperiodo() {
        return analgesicoantiinflamatoriovalorgastonoperiodo;
    }

    public void setAnalgesicoantiinflamatoriovalorgastonoperiodo(float analgesicoantiinflamatoriovalorgastonoperiodo) {
        this.analgesicoantiinflamatoriovalorgastonoperiodo = analgesicoantiinflamatoriovalorgastonoperiodo;
    }

    public int getAnalgesicoantiinflamatoriodias() {
        return analgesicoantiinflamatoriodias;
    }

    public void setAnalgesicoantiinflamatoriodias(int analgesicoantiinflamatoriodias) {
        this.analgesicoantiinflamatoriodias = analgesicoantiinflamatoriodias;
    }

    public float getAnalgesicoantiinflamatorioprecounitario1() {
        return analgesicoantiinflamatorioprecounitario1;
    }

    public void setAnalgesicoantiinflamatorioprecounitario1(float analgesicoantiinflamatorioprecounitario1) {
        this.analgesicoantiinflamatorioprecounitario1 = analgesicoantiinflamatorioprecounitario1;
    }

    public float getAnalgesicousado() {
        return analgesicousado;
    }

    public void setAnalgesicousado(float analgesicousado) {
        this.analgesicousado = analgesicousado;
    }

    public float getAnalgesicoprecounitario() {
        return analgesicoprecounitario;
    }

    public void setAnalgesicoprecounitario(float analgesicoprecounitario) {
        this.analgesicoprecounitario = analgesicoprecounitario;
    }

    public float getAnalgesicoquantidadegastanoperiodo() {
        return analgesicoquantidadegastanoperiodo;
    }

    public void setAnalgesicoquantidadegastanoperiodo(float analgesicoquantidadegastanoperiodo) {
        this.analgesicoquantidadegastanoperiodo = analgesicoquantidadegastanoperiodo;
    }

    public float getAnalgesicovalorgastonoperiodo() {
        return analgesicovalorgastonoperiodo;
    }

    public void setAnalgesicovalorgastonoperiodo(float analgesicovalorgastonoperiodo) {
        this.analgesicovalorgastonoperiodo = analgesicovalorgastonoperiodo;
    }

    public int getAnalgesicodias() {
        return analgesicodias;
    }

    public void setAnalgesicodias(int analgesicodias) {
        this.analgesicodias = analgesicodias;
    }

    public float getAnalgesicoprecounitario1() {
        return analgesicoprecounitario1;
    }

    public void setAnalgesicoprecounitario1(float analgesicoprecounitario1) {
        this.analgesicoprecounitario1 = analgesicoprecounitario1;
    }

    public float getAntibioticousado() {
        return antibioticousado;
    }

    public void setAntibioticousado(float antibioticousado) {
        this.antibioticousado = antibioticousado;
    }

    public float getAntibioticoprecounitario() {
        return antibioticoprecounitario;
    }

    public void setAntibioticoprecounitario(float antibioticoprecounitario) {
        this.antibioticoprecounitario = antibioticoprecounitario;
    }

    public float getAntibioticoquantidadegastanoperiodo() {
        return antibioticoquantidadegastanoperiodo;
    }

    public void setAntibioticoquantidadegastanoperiodo(float antibioticoquantidadegastanoperiodo) {
        this.antibioticoquantidadegastanoperiodo = antibioticoquantidadegastanoperiodo;
    }

    public float getAntibioticovalorgastonoperiodo() {
        return antibioticovalorgastonoperiodo;
    }

    public void setAntibioticovalorgastonoperiodo(float antibioticovalorgastonoperiodo) {
        this.antibioticovalorgastonoperiodo = antibioticovalorgastonoperiodo;
    }

    public int getAntibioticodias() {
        return antibioticodias;
    }

    public void setAntibioticodias(int antibioticodias) {
        this.antibioticodias = antibioticodias;
    }

    public float getAntibioticoprecounitario1() {
        return antibioticoprecounitario1;
    }

    public void setAntibioticoprecounitario1(float antibioticoprecounitario1) {
        this.antibioticoprecounitario1 = antibioticoprecounitario1;
    }

    public float getTecnicoenfermenfermeiromusado() {
        return tecnicoenfermenfermeiromusado;
    }

    public void setTecnicoenfermenfermeiromusado(float tecnicoenfermenfermeiromusado) {
        this.tecnicoenfermenfermeiromusado = tecnicoenfermenfermeiromusado;
    }

    public float getTecnicoenfermenfermeiromprecounitario() {
        return tecnicoenfermenfermeiromprecounitario;
    }

    public void setTecnicoenfermenfermeiromprecounitario(float tecnicoenfermenfermeiromprecounitario) {
        this.tecnicoenfermenfermeiromprecounitario = tecnicoenfermenfermeiromprecounitario;
    }

    public float getTecnicoenfermenfermeiromquantidadegastanoperiodo() {
        return tecnicoenfermenfermeiromquantidadegastanoperiodo;
    }

    public void setTecnicoenfermenfermeiromquantidadegastanoperiodo(float tecnicoenfermenfermeiromquantidadegastanoperiodo) {
        this.tecnicoenfermenfermeiromquantidadegastanoperiodo = tecnicoenfermenfermeiromquantidadegastanoperiodo;
    }

    public float getTecnicoenfermenfermeiromvalorgastonoperiodo() {
        return tecnicoenfermenfermeiromvalorgastonoperiodo;
    }

    public void setTecnicoenfermenfermeiromvalorgastonoperiodo(float tecnicoenfermenfermeiromvalorgastonoperiodo) {
        this.tecnicoenfermenfermeiromvalorgastonoperiodo = tecnicoenfermenfermeiromvalorgastonoperiodo;
    }

    public int getTecnicoenfermenfermeiromdias() {
        return tecnicoenfermenfermeiromdias;
    }

    public void setTecnicoenfermenfermeiromdias(int tecnicoenfermenfermeiromdias) {
        this.tecnicoenfermenfermeiromdias = tecnicoenfermenfermeiromdias;
    }

    public float getTecnicoenfermenfermeiromprecounitario1() {
        return tecnicoenfermenfermeiromprecounitario1;
    }

    public void setTecnicoenfermenfermeiromprecounitario1(float tecnicoenfermenfermeiromprecounitario1) {
        this.tecnicoenfermenfermeiromprecounitario1 = tecnicoenfermenfermeiromprecounitario1;
    }

    public float getEnfermeirousado() {
        return enfermeirousado;
    }

    public void setEnfermeirousado(float enfermeirousado) {
        this.enfermeirousado = enfermeirousado;
    }

    public float getEnfermeiroprecounitario() {
        return enfermeiroprecounitario;
    }

    public void setEnfermeiroprecounitario(float enfermeiroprecounitario) {
        this.enfermeiroprecounitario = enfermeiroprecounitario;
    }

    public float getEnfermeiroquantidadegastanoperiodo() {
        return enfermeiroquantidadegastanoperiodo;
    }

    public void setEnfermeiroquantidadegastanoperiodo(float enfermeiroquantidadegastanoperiodo) {
        this.enfermeiroquantidadegastanoperiodo = enfermeiroquantidadegastanoperiodo;
    }

    public float getEnfermeirovalorgastonoperiodo() {
        return enfermeirovalorgastonoperiodo;
    }

    public void setEnfermeirovalorgastonoperiodo(float enfermeirovalorgastonoperiodo) {
        this.enfermeirovalorgastonoperiodo = enfermeirovalorgastonoperiodo;
    }

    public int getEnfermeirodias() {
        return enfermeirodias;
    }

    public void setEnfermeirodias(int enfermeirodias) {
        this.enfermeirodias = enfermeirodias;
    }

    public float getEnfermeiroprecounitario1() {
        return enfermeiroprecounitario1;
    }

    public void setEnfermeiroprecounitario1(float enfermeiroprecounitario1) {
        this.enfermeiroprecounitario1 = enfermeiroprecounitario1;
    }

    public float getEnfermeiroespecialistausado() {
        return enfermeiroespecialistausado;
    }

    public void setEnfermeiroespecialistausado(float enfermeiroespecialistausado) {
        this.enfermeiroespecialistausado = enfermeiroespecialistausado;
    }

    public float getEnfermeiroespecialistaprecounitario() {
        return enfermeiroespecialistaprecounitario;
    }

    public void setEnfermeiroespecialistaprecounitario(float enfermeiroespecialistaprecounitario) {
        this.enfermeiroespecialistaprecounitario = enfermeiroespecialistaprecounitario;
    }

    public float getEnfermeiroespecialistaquantidadegastanoperiodo() {
        return enfermeiroespecialistaquantidadegastanoperiodo;
    }

    public void setEnfermeiroespecialistaquantidadegastanoperiodo(float enfermeiroespecialistaquantidadegastanoperiodo) {
        this.enfermeiroespecialistaquantidadegastanoperiodo = enfermeiroespecialistaquantidadegastanoperiodo;
    }

    public float getEnfermeiroespecialistavalorgastonoperiodo() {
        return enfermeiroespecialistavalorgastonoperiodo;
    }

    public void setEnfermeiroespecialistavalorgastonoperiodo(float enfermeiroespecialistavalorgastonoperiodo) {
        this.enfermeiroespecialistavalorgastonoperiodo = enfermeiroespecialistavalorgastonoperiodo;
    }

    public int getEnfermeiroespecialistadias() {
        return enfermeiroespecialistadias;
    }

    public void setEnfermeiroespecialistadias(int enfermeiroespecialistadias) {
        this.enfermeiroespecialistadias = enfermeiroespecialistadias;
    }

    public float getEnfermeiroespecialistaprecounitario1() {
        return enfermeiroespecialistaprecounitario1;
    }

    public void setEnfermeiroespecialistaprecounitario1(float enfermeiroespecialistaprecounitario1) {
        this.enfermeiroespecialistaprecounitario1 = enfermeiroespecialistaprecounitario1;
    }

    public float getMedicousado() {
        return medicousado;
    }

    public void setMedicousado(float medicousado) {
        this.medicousado = medicousado;
    }

    public float getMedicoprecounitario() {
        return medicoprecounitario;
    }

    public void setMedicoprecounitario(float medicoprecounitario) {
        this.medicoprecounitario = medicoprecounitario;
    }

    public float getMedicoquantidadegastanoperiodo() {
        return medicoquantidadegastanoperiodo;
    }

    public void setMedicoquantidadegastanoperiodo(float medicoquantidadegastanoperiodo) {
        this.medicoquantidadegastanoperiodo = medicoquantidadegastanoperiodo;
    }

    public float getMedicovalorgastonoperiodo() {
        return medicovalorgastonoperiodo;
    }

    public void setMedicovalorgastonoperiodo(float medicovalorgastonoperiodo) {
        this.medicovalorgastonoperiodo = medicovalorgastonoperiodo;
    }

    public int getMedicodias() {
        return medicodias;
    }

    public void setMedicodias(int medicodias) {
        this.medicodias = medicodias;
    }

    public float getMedicoprecounitario1() {
        return medicoprecounitario1;
    }

    public void setMedicoprecounitario1(float medicoprecounitario1) {
        this.medicoprecounitario1 = medicoprecounitario1;
    }

    private float total;

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return  "-> Paciente: " +getPaciente()+" "+
                " |Quantidade de soro fisiologico utilizado: "+getSfusado()+" "+
                " |Total de soro fisiologico utilizado "+getSfquantidadegastanoperiodo()+" "+
                " |Quantidade de dias usando soro fisiologico: "+getSfdias()+" "+
                " |Preço da unidade de soro fisiologico "+getSfprecounitario1()+" "+
                " |Valor gasto no periodo " +getSfvalorgastonoperiodo()+" "+
                "Alginato com prata -> "+getAlginatocomprataprecounitario1()+" "+
                "RIN com prata -> "+getRingerprecounitario1()+" "+
                "PHM com prata -> "+getPhmbprecounitario1();
    }

}
