package com.example.pedro.prottipo1;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.pedro.prottipo1.dao.CalculadoraDAO;
import com.example.pedro.prottipo1.dao.CalculadoraDAO10;
import com.example.pedro.prottipo1.dao.CalculadoraDAO11;
import com.example.pedro.prottipo1.dao.CalculadoraDAO2;
import com.example.pedro.prottipo1.dao.CalculadoraDAO3;
import com.example.pedro.prottipo1.dao.CalculadoraDAO4;
import com.example.pedro.prottipo1.dao.CalculadoraDAO5;
import com.example.pedro.prottipo1.dao.CalculadoraDAO6;
import com.example.pedro.prottipo1.dao.CalculadoraDAO7;
import com.example.pedro.prottipo1.dao.CalculadoraDAO8;
import com.example.pedro.prottipo1.dao.CalculadoraDAO9;
import com.example.pedro.prottipo1.modelo.Calculadora;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class ResultadosActivity extends AppCompatActivity {

BarChart barchat;
    private Chart chart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        barchat =(BarChart)findViewById(R.id.resultadobarra);


        /***
        String[] pacientes = new String[]{"jan","fev","fev","marc","pl"};
        XAxis xAxis= barchat.getXAxis();
        //xAxis.setValueFormatter(new MyXAxisValueFormatter(pacientes));
        xAxis.setValueFormatter();
        xAxis.setPosition(XAxis.XAxisPosition.BOTH_SIDED);
***/
/**
        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(0,1));
        barEntries.add(new BarEntry(2,2));
        barEntries.add(new BarEntry(5,4));

        BarDataSet barDataSet = new BarDataSet(barEntries,"Dates");

        ArrayList<String> theDates = new ArrayList<>();
        theDates.add("abril");
        theDates.add("maio");
        theDates.add("junho");
        theDates.add("julho");
        theDates.add("agosto");
        theDates.add("setembro");






        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        BarData thedata = new BarData(barDataSet);



        float barWidth = 0.43f;

        thedata.setBarWidth(barWidth);
        barchat.setData(thedata);

        String[] months = new String[]{"pedro","lino","dois","may","jun","augs"};
        XAxis xAxis= barchat.getXAxis();
        xAxis.setValueFormatter(new MyXAxisValueFormatter(theDates));

**/


        ExibeResultado();
    }

    public class MyXAxisValueFormatter implements IAxisValueFormatter{
        ArrayList<String> mValues = new ArrayList<>();
        //private String[] mValues;

        public MyXAxisValueFormatter(ArrayList<String> values) {
            this.mValues = values;
        }

        @Override
        public String getFormattedValue(float value, AxisBase axis) {
            // "value" represents the position of the label on the axis (x or y)
            return mValues.get((int) value);
        }

    }

    private void ExibeResultado() {
        CalculadoraDAO dao = new CalculadoraDAO(ResultadosActivity.this);
        CalculadoraDAO2 dao2 = new CalculadoraDAO2(ResultadosActivity.this);
        CalculadoraDAO3 dao3 = new CalculadoraDAO3(ResultadosActivity.this);
        CalculadoraDAO4 dao4 = new CalculadoraDAO4(ResultadosActivity.this);
        CalculadoraDAO5 dao5 = new CalculadoraDAO5(ResultadosActivity.this);
        CalculadoraDAO6 dao6 = new CalculadoraDAO6(ResultadosActivity.this);
        CalculadoraDAO7 dao7 = new CalculadoraDAO7(ResultadosActivity.this);
        CalculadoraDAO8 dao8 = new CalculadoraDAO8(ResultadosActivity.this);
        CalculadoraDAO9 dao9 = new CalculadoraDAO9(ResultadosActivity.this);
        CalculadoraDAO10 dao10 = new CalculadoraDAO10(ResultadosActivity.this);
        CalculadoraDAO11 dao11 = new CalculadoraDAO11(ResultadosActivity.this);

        List<Calculadora> calculadoras = dao.exibir();
        List<Calculadora> calculadoras2 = dao2.exibir();
        List<Calculadora> calculadoras3 = dao3.exibir();
        List<Calculadora> calculadoras4 = dao4.exibir();
        List<Calculadora> calculadoras5 = dao5.exibir();
        List<Calculadora> calculadoras6 = dao6.exibir();
        List<Calculadora> calculadoras7 = dao7.exibir();
        List<Calculadora> calculadoras8 = dao8.exibir();
        List<Calculadora> calculadoras9 = dao9.exibir();
        List<Calculadora> calculadoras10 = dao10.exibir();
        List<Calculadora> calculadoras11 = dao11.exibir();

        dao.close();
        dao2.close();
        dao3.close();
        dao4.close();
        dao5.close();
        dao6.close();
        dao7.close();
        dao8.close();
        dao9.close();
        dao10.close();
        dao11.close();


       //calculadoras.addAll(calculadoras2);

        //calculadoras.set(0,).setAlginatocomprataprecounitario1();
        //calculadoras2.get(0).getAlginatocomprataprecounitario1();


        List<Calculadora> dados = new ArrayList<>();
        int a=0;


        ArrayList<BarEntry> barEntries = new ArrayList<>();
        ArrayList<String> theDates = new ArrayList<>();


        while(a<(calculadoras.size())){
            //Toast.makeText(ResultadosActivity.this,"RAPADURA "+calculadoras.size(),Toast.LENGTH_LONG).show();
            Calculadora calculadora = new Calculadora();


            calculadora.setIdCalculadora(calculadoras.get(a).getIdCalculadora());
            calculadora.setIdPaciente(calculadoras.get(a).getIdPaciente());
            calculadora.setPaciente(calculadoras.get(a).getPaciente());

            calculadora.setSfprecounitario1(calculadoras.get(a).getSfprecounitario1());
            calculadora.setRingerprecounitario1(calculadoras.get(a).getRingerprecounitario1());
            calculadora.setPhmbprecounitario1(calculadoras.get(a).getPhmbprecounitario1());
            calculadora.setPvpiprecounitario1(calculadoras.get(a).getPvpiprecounitario1());
            calculadora.setClorexidineprecounitario1(calculadoras.get(a).getClorexidineprecounitario1());

            calculadora.setRemovedorAdesivoprecounitario1(calculadoras2.get(a).getRemovedorAdesivoprecounitario1());
            calculadora.setRemovedorAdesivoUnidadeprecounitario1(calculadoras2.get(a).getRemovedorAdesivoUnidadeprecounitario1());
            calculadora.setAgeprecounitario1(calculadoras2.get(a).getAgeprecounitario1());
            calculadora.setAlginatoprecounitario1(calculadoras2.get(a).getAlginatoprecounitario1());
            calculadora.setAlginatocomprataprecounitario1(calculadoras2.get(a).getAlginatocomprataprecounitario1());

            calculadora.setEspumaprecounitario1(calculadoras3.get(a).getEspumaprecounitario1());
            calculadora.setEspumacomprataprecounitario1(calculadoras3.get(a).getEspumacomprataprecounitario1());
            calculadora.setEspumacomsiliconeprecounitario1(calculadoras3.get(a).getEspumacomsiliconeprecounitario1());
            calculadora.setEspumacomsiliconeeprataprecounitario1(calculadoras3.get(a).getEspumacomsiliconeeprataprecounitario1());
            calculadora.setEspumacombordaprecounitario1(calculadoras3.get(a).getEspumacombordaprecounitario1());

            calculadora.setEspumacombordasiliconeprecounitario1(calculadoras4.get(a).getEspumacombordasiliconeprecounitario1());
            calculadora.setEspumacombordasiliconeprataprecounitario1(calculadoras4.get(a).getEspumacombordasiliconeprataprecounitario1());
            calculadora.setHidrofibraprecounitario1(calculadoras4.get(a).getHidrofibraprecounitario1());
            calculadora.setHidrofibraprataprecounitario1(calculadoras4.get(a).getHidrofibraprataprecounitario1());
            calculadora.setHidrogelbprecounitario1(calculadoras4.get(a).getHidrogelbprecounitario1());

            calculadora.setPapainaprecounitario1(calculadoras5.get(a).getPapainaprecounitario1());
            calculadora.setSulfadiazinaprataprecounitario1(calculadoras5.get(a).getSulfadiazinaprataprecounitario1());
            calculadora.setKolagenaseprecounitario1(calculadoras5.get(a).getKolagenaseprecounitario1());
            calculadora.setTelapratananocristalinaprecounitario1(calculadoras5.get(a).getTelapratananocristalinaprecounitario1());
            calculadora.setRayonprecounitario1(calculadoras5.get(a).getRayonprecounitario1());

            calculadora.setTelanaderenteimpregnadaprecounitario1(calculadoras6.get(a).getTelanaderenteimpregnadaprecounitario1());
            calculadora.setCarvaoprecounitario1(calculadoras6.get(a).getCarvaoprecounitario1());
            calculadora.setCarvaoprataprecounitario1(calculadoras6.get(a).getCarvaoprataprecounitario1());
            calculadora.setFilmetransparenteprecounitario1(calculadoras6.get(a).getFilmetransparenteprecounitario1());
            calculadora.setHidrocoloideprecounitario1(calculadoras6.get(a).getHidrocoloideprecounitario1());

            calculadora.setProtetorcutaneoprecounitario1(calculadoras7.get(a).getProtetorcutaneoprecounitario1());
            calculadora.setGazeesterilprecounitario1(calculadoras7.get(a).getGazeesterilprecounitario1());
            calculadora.setGazenesterilprecounitario1(calculadoras7.get(a).getGazenesterilprecounitario1());
            calculadora.setAtaduraprecounitario1(calculadoras7.get(a).getAtaduraprecounitario1());
            calculadora.setFitaadesivaprecounitario1(calculadoras7.get(a).getFitaadesivaprecounitario1());

            calculadora.setRayon2precounitario1(calculadoras8.get(a).getRayon2precounitario1());
            calculadora.setChumacoprecounitario1(calculadoras8.get(a).getChumacoprecounitario1());
            calculadora.setCompressaesterilprecounitario1(calculadoras8.get(a).getCompressaesterilprecounitario1());
            calculadora.setEspuma2precounitario1(calculadoras8.get(a).getEspuma2precounitario1());
            calculadora.setFilmetransparente2precounitario1(calculadoras8.get(a).getFilmetransparente2precounitario1());

            calculadora.setPressaonegativacprataprecounitario1(calculadoras9.get(a).getPressaonegativacprataprecounitario1());
            calculadora.setPressaonegativasprataprecounitario1(calculadoras9.get(a).getPressaonegativasprataprecounitario1());
            calculadora.setCamahiperbaricaprecounitario1(calculadoras9.get(a).getCamahiperbaricaprecounitario1());
            calculadora.setLaserterapiaprecounitario1(calculadoras9.get(a).getLaserterapiaprecounitario1());

            calculadora.setDesbridamentocirurgicoprecounitario1(calculadoras10.get(a).getDesbridamentocirurgicoprecounitario1());
            calculadora.setTaxadesalaprecounitario1(calculadoras10.get(a).getChumacoprecounitario1());
            calculadora.setAnalgesicoantiinflamatorioprecounitario1(calculadoras10.get(a).getAnalgesicoantiinflamatorioprecounitario1());
            calculadora.setAnalgesicoprecounitario1(calculadoras10.get(a).getAnalgesicoprecounitario1());
            calculadora.setAntibioticoprecounitario1(calculadoras10.get(a).getAntibioticoprecounitario1());

            calculadora.setTecnicoenfermenfermeiromprecounitario1(calculadoras11.get(a).getTecnicoenfermenfermeiromprecounitario1());
            calculadora.setEnfermeiroprecounitario1(calculadoras11.get(a).getEnfermeiroprecounitario1());
            calculadora.setEnfermeiroespecialistaprecounitario1(calculadoras11.get(a).getEnfermeiroespecialistaprecounitario1());
            calculadora.setMedicoprecounitario1(calculadoras11.get(a).getMedicoprecounitario1());



            calculadora.setTotal(calculadora.getSfprecounitario1() +
                            calculadora.getRingerprecounitario1() +
                            calculadora.getPhmbprecounitario1() +
                            calculadora.getPvpiprecounitario1() +
                            calculadora.getClorexidineprecounitario1() +
                            calculadora.getRemovedorAdesivoprecounitario1() +
                            calculadora.getRemovedorAdesivoUnidadeprecounitario1() +
                            calculadora.getAgeprecounitario1() +
                            calculadora.getAlginatoprecounitario1() +
                            calculadora.getAlginatocomprataprecounitario1() +
                            calculadora.getEspumaprecounitario1() +
                            calculadora.getEspumacomprataprecounitario1() +
                            calculadora.getEspumacomsiliconeprecounitario1() +
                            calculadora.getEspumacomsiliconeeprataprecounitario1() +
                            calculadora.getEspumacombordaprecounitario1() +
                            calculadora.getEspumacombordasiliconeprecounitario1() +
                            calculadora.getEspumacombordasiliconeprataprecounitario1() +
                            calculadora.getHidrofibraprecounitario1() +
                            calculadora.getHidrofibraprataprecounitario1() +
                            calculadora.getHidrogelbprecounitario1() +
                            calculadora.getPapainaprecounitario1() +
                            calculadora.getSulfadiazinaprataprecounitario1() +
                            calculadora.getKolagenaseprecounitario1() +
                            calculadora.getTelapratananocristalinaprecounitario1() +
                            calculadora.getRayonprecounitario1() +
                            calculadora.getTelanaderenteimpregnadaprecounitario1() +
                            calculadora.getCarvaoprecounitario1() +
                            calculadora.getCarvaoprataprecounitario1() +
                            calculadora.getFilmetransparenteprecounitario1() +
                            calculadora.getHidrocoloideprecounitario1() +
                            calculadora.getProtetorcutaneoprecounitario1() +
                            calculadora.getGazeesterilprecounitario1() +
                            calculadora.getGazenesterilprecounitario1() +
                            calculadora.getAtaduraprecounitario1() +
                            calculadora.getFitaadesivaprecounitario1() +
                            calculadora.getRayon2precounitario1() +
                            calculadora.getChumacoprecounitario1() +
                            calculadora.getCompressaesterilprecounitario1() +
                            calculadora.getEspuma2precounitario1() +
                            calculadora.getFilmetransparente2precounitario1() +
                            calculadora.getPressaonegativacprataprecounitario1() +
                            calculadora.getPressaonegativasprataprecounitario1() +
                            calculadora.getCamahiperbaricaprecounitario1() +
                            calculadora.getLaserterapiaprecounitario1() +
                            calculadora.getDesbridamentocirurgicoprecounitario1() +
                            calculadora.getTaxadesalaprecounitario1() +
                            calculadora.getAnalgesicoantiinflamatorioprecounitario1() +
                            calculadora.getAnalgesicoprecounitario1() +
                            calculadora.getAntibioticoprecounitario1() +
                            calculadora.getTecnicoenfermenfermeiromprecounitario1() +
                            calculadora.getEnfermeiroprecounitario1() +
                            calculadora.getEnfermeiroespecialistaprecounitario1() +
                            calculadora.getMedicoprecounitario1());

            theDates.add(calculadora.getPaciente());
            barEntries.add(new BarEntry(a,calculadora.getTotal()));

            dados.add(calculadora);
            a=a+1;


        }

        BarDataSet barDataSet = new BarDataSet(barEntries,"Custo em Reais");
        barchat.setTouchEnabled(true);

        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        BarData thedata = new BarData(barDataSet);



        float barWidth = 0.1f;

        thedata.setBarWidth(barWidth);
        barchat.setData(thedata);

        String[] months = new String[]{"pedro","lino","dois","may","jun","augs"};
        XAxis xAxis= barchat.getXAxis();
        xAxis.setValueFormatter(new MyXAxisValueFormatter(theDates));




        //Toast.makeText(ResultadosActivity.this,"RAPADURA "+calculadoras.size(),Toast.LENGTH_LONG).show();
        //Toast.makeText(ResultadosActivity.this,"RAPADURA "+calculadoras.get(0).getRemovedorAdesivoprecounitario1(),Toast.LENGTH_LONG).show();

       /** ListView listaAlunos = (ListView) findViewById(R.id.resultado);
        ArrayAdapter<Calculadora> adapter = new ArrayAdapter<Calculadora>(this, android.R.layout.simple_list_item_1,dados);
        listaAlunos.setAdapter(adapter);**/

    }



}


/*

 CalculadoraDAO dao = new CalculadoraDAO(ResultadosActivity.this);
        List<Calculadora> calculadoras = dao.exibir();
        dao.close();
        ListView listaAlunos = (ListView) findViewById(R.id.resultado);
        ArrayAdapter<Calculadora> adapter = new ArrayAdapter<Calculadora>(this, android.R.layout.simple_list_item_1,calculadoras);
        listaAlunos.setAdapter(adapter);


 */