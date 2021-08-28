package com.example.pedro.prottipo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
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
import com.example.pedro.prottipo1.modelo.Paciente;

public class CalculadoraActivity extends AppCompatActivity {

    int barraQuantidaUsadadeSF_1;
    int barraQuantidaUsadadeRINGER_1;
    int barraQuantidaUsadadePHMB_1;
    int barraQuantidaUsadadePVPI_1;
    int barraQuantidaUsadadeCLOREXIDINE_1;
    int barraQuantidaUsadadeREMOVEDORADESIVO_1;
    int barraQuantidaUsadadeREMOVEDORADESIVOUNIDADE_1;


    int barraQuantidaUsadadeage_1;
    int barraQuantidaUsadadealginato_1;
    int barraQuantidaUsadadealginatocomprata_1;
    int barraQuantidaUsadadeespuma_1;
    int barraQuantidaUsadadeespumacomprata_1;
    int barraQuantidaUsadadeespumacomsilicone_1;
    int barraQuantidaUsadadeespumacomsiliconeeprata_1;

    int barraQuantidaUsadadeespumacomborda_1;
    int barraQuantidaUsadadeespumacombordasilicone_1;
    int barraQuantidaUsadadeespumacombordasiliconeprata_1;
    int barraQuantidaUsadadehidrofibra_1;
    int barraQuantidaUsadadehidrofibraprata_1;
    int barraQuantidaUsadadehidrogelb_1;
    int barraQuantidaUsadadepapaina_1;
    int barraQuantidaUsadadesulfadiazinaprata_1;
    int barraQuantidaUsadadekolagenase_1;
    int barraQuantidaUsadadetelapratananocristalina_1;
    int barraQuantidaUsadaderayon_1;
    int barraQuantidaUsadadetelanaderenteimpregnada_1;
    int barraQuantidaUsadadecarvao_1;
    int barraQuantidaUsadadecarvaoprata_1;
    int barraQuantidaUsadadefilmetransparente_1;


    int barraQuantidaUsadadehidrocoloide_1;
    int barraQuantidaUsadadeprotetorcutaneo_1;
    int barraQuantidaUsadadegazeesteril_1;
    int barraQuantidaUsadadegazenesteril_1;
    int barraQuantidaUsadadeatadura_1;
    int barraQuantidaUsadadefitaadesiva_1;
    int barraQuantidaUsadaderayon2_1;

    int barraQuantidaUsadadechumaco_1;
    int barraQuantidaUsadadecompressaesteril_1;
    int barraQuantidaUsadadeespuma2_1;
    int barraQuantidaUsadadefilmetransparente2_1;
    int barraQuantidaUsadadepressaonegativacprata_1;
    int barraQuantidaUsadadepressaonegativasprata_1;
    int barraQuantidaUsadadecamahiperbarica_1;


    int barraQuantidaUsadadelaserterapia_1;
    int barraQuantidaUsadadedesbridamentocirurgico_1;
    int barraQuantidaUsadadetaxadesala_1;
    int barraQuantidaUsadadeanalgesicoantiinflamatorio_1;
    int barraQuantidaUsadadeanalgesico_1;
    int barraQuantidaUsadadeantibiotico_1;
    int barraQuantidaUsadadetecnicoenfermenfermeirom_1;

    int barraQuantidaUsadadeenfermeiro_1;
    int barraQuantidaUsadadeenfermeiroespecialista_1;
    int barraQuantidaUsadademedico_1;

    EditText valorsf;
    EditText valorrin;
    EditText valorphmb;
    EditText valorpvpi;
    EditText valorclorexidine;
    EditText valorremovedordeadesivo;
    EditText valorremovedordeadesivounidade;

    EditText valorremovedorDeAdesivo;
    EditText valorremovedorDeAdesivoUni;
    EditText valorage;
    EditText valoralginato;
    EditText valoralginatocomprata;

    EditText valorespuma;
    EditText valorespumacomprata;
    EditText valorespumacomsilicone;
    EditText valorespumacomsiliconeeprata;
    EditText valorespumacomborda;

    EditText valorespumacombordasilicone;
    EditText valorespumacombordasiliconeprata;
    EditText valorhidrofibra;
    EditText valorhidrofibraprata;
    EditText valorhidrogelb;

    EditText valorpapaina;
    EditText valorsulfadiazinaprata;
    EditText valorkolagenase;
    EditText valortelapratananocristalina;
    EditText valorrayon;

    EditText valortelanaderenteimpregnada;
    EditText valorcarvao;
    EditText valorcarvaoprata;
    EditText valorfilmetransparente;
    EditText valorhidrocoloide;

    EditText valorprotetorcutaneo;
    EditText valorgazeesteril;
    EditText valorgazenesteril;
    EditText valoratadura;
    EditText valorfitaadesiva;

    EditText valorrayon2;
    EditText valorchumaco;
    EditText valorcompressaesteril;
    EditText valorespuma2;
    EditText valorfilmetransparente2;

    EditText valorpressaonegativacprata;
    EditText valorpressaonegativasprata;
    EditText valorcamahiperbarica;
    EditText valorlaserterapia;

    EditText valordesbridamentocirurgico;
    EditText valortaxadesala;
    EditText valoranalgesicoantiinflamatorio;
    EditText valoranalgesico;
    EditText valorantibiotico;

    EditText valortecnicoenfermenfermeirom;
    EditText valorenfermeiro;
    EditText valorenfermeiroespecialista;
    EditText valormedico;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);


        ///->SORO FISIOLOGICO
      final TextView QuantidaUsadadeSFTXT=(TextView)findViewById(R.id.calculadora_s_d_l_e_r_d_c_a_soro_fisiologico_texto);
        SeekBar barraQuantidaUsadadeSF =(SeekBar)findViewById(R.id.calculadora_s_d_l_e_r_d_c_a_soro_fisiologico_barra);
        barraQuantidaUsadadeSF.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadeSF_1=progress/10;
                QuantidaUsadadeSFTXT.setText(barraQuantidaUsadadeSF_1+" mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        ///-> RINGER
        final TextView QuantidaUsadadeRINGERTXT = (TextView)findViewById(R.id.calculadora_s_d_l_e_r_d_c_a_ringer_lactato_texto);
        SeekBar barraQuantidaUsadadeRINGER = (SeekBar)findViewById(R.id.calculadora_s_d_l_e_r_d_c_a_ringer_lactato_barra);
        barraQuantidaUsadadeRINGER.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadeRINGER_1 = progress / 10;
                QuantidaUsadadeRINGERTXT.setText(barraQuantidaUsadadeRINGER_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ///->PHMB
        final TextView QuantidaUsadadePHMBTXT = (TextView)findViewById(R.id.calculadora_s_d_l_e_r_d_c_a_PHMB_texto);
        SeekBar barraQuantidaUsadadePHMB = (SeekBar)findViewById(R.id.calculadora_s_d_l_e_r_d_c_a_PHMB_barra);
        barraQuantidaUsadadePHMB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadePHMB_1 = progress / 10;
                QuantidaUsadadePHMBTXT.setText(barraQuantidaUsadadePHMB_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ///->PVPI
        final TextView QuantidaUsadadePVPITXT = (TextView)findViewById(R.id.calculadora_s_d_l_e_r_d_c_a_PVPI_texto);
        SeekBar barraQuantidaUsadadePVPI = (SeekBar)findViewById(R.id.calculadora_s_d_l_e_r_d_c_a_PVPI_barra);
        barraQuantidaUsadadePVPI.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadePVPI_1 = progress / 10;
                QuantidaUsadadePVPITXT.setText(barraQuantidaUsadadePVPI_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        ///->CLOREXIDINE
        final TextView QuantidaUsadadeCLOREXIDINETXT = (TextView)findViewById(R.id.calculadora_s_d_l_e_r_d_c_a_Clorexidine_texto);
        SeekBar barraQuantidaUsadadeCLOREXIDINE = (SeekBar)findViewById(R.id.calculadora_s_d_l_e_r_d_c_a_Clorexidine_barra);
        barraQuantidaUsadadeCLOREXIDINE.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadeCLOREXIDINE_1 = progress / 10;
                QuantidaUsadadeCLOREXIDINETXT.setText(barraQuantidaUsadadeCLOREXIDINE_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        ///->REMOVEDOR DE ADESIVO
        final TextView QuantidaUsadadeREMOVEDORADESIVOTXT = (TextView)findViewById(R.id.calculadora_s_d_l_e_r_d_c_a_removedor_de_adesivo_texto);
        SeekBar barraQuantidaUsadadeREMOVEDORADESIVO = (SeekBar)findViewById(R.id.calculadora_s_d_l_e_r_d_c_a_removedor_de_adesivo_barra);
        barraQuantidaUsadadeREMOVEDORADESIVO.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadeREMOVEDORADESIVO_1 = progress / 10;
                QuantidaUsadadeREMOVEDORADESIVOTXT.setText(barraQuantidaUsadadeREMOVEDORADESIVO_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ///->REMOVEDOR DE ADESIVO UNIDADE
        final TextView QuantidaUsadadeREMOVEDORADESIVOUNIDADETXT = (TextView)findViewById(R.id.calculadora_s_d_l_e_r_d_c_a_removedor_de_adesivo_u_texto);
        SeekBar barraQuantidaUsadadeREMOVEDORADESIVOUNIDADE = (SeekBar)findViewById(R.id.calculadora_s_d_l_e_r_d_c_a_removedor_de_adesivo_u_barra);
        barraQuantidaUsadadeREMOVEDORADESIVOUNIDADE.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadeREMOVEDORADESIVOUNIDADE_1 = progress / 10;
                QuantidaUsadadeREMOVEDORADESIVOUNIDADETXT.setText(barraQuantidaUsadadeREMOVEDORADESIVOUNIDADE_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        ///->age
        final TextView QuantidaUsadadeageTXT = (TextView)findViewById(R.id.calculadora_cobertura_primaria_age_texto);
        SeekBar barraQuantidaUsadadeage = (SeekBar)findViewById(R.id.calculadora_cobertura_primaria_age_barra);
        barraQuantidaUsadadeage.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadeage_1 = progress / 10;
                QuantidaUsadadeageTXT.setText(barraQuantidaUsadadeage_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


///-> alginato
        final TextView QuantidaUsadadealginatoTXT = (TextView)findViewById(R.id.calculadora_cobertura_primaria_alginato_texto);
        SeekBar barraQuantidaUsadadealginato = (SeekBar)findViewById(R.id.calculadora_cobertura_primaria_alginato_barra);
        barraQuantidaUsadadealginato.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadealginato_1 = progress / 10;
                QuantidaUsadadealginatoTXT.setText(barraQuantidaUsadadealginato_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ///->alginatocomprata
        final TextView QuantidaUsadadealginatocomprataTXT = (TextView)findViewById(R.id.calculadora_cobertura_primaria_alginato_com_prata_texto);
        SeekBar barraQuantidaUsadadealginatocomprata = (SeekBar)findViewById(R.id.calculadora_cobertura_primaria_alginato_com_prata_barra);
        barraQuantidaUsadadealginatocomprata.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadealginatocomprata_1 = progress / 10;
                QuantidaUsadadealginatocomprataTXT.setText(barraQuantidaUsadadealginatocomprata_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ///->espuma
        final TextView QuantidaUsadadeespumaTXT = (TextView)findViewById(R.id.calculadora_cobertura_primaria_espuma_texto);
        SeekBar barraQuantidaUsadadeespuma = (SeekBar)findViewById(R.id.calculadora_cobertura_primaria_espuma_barra);
        barraQuantidaUsadadeespuma.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadeespuma_1 = progress / 10;
                QuantidaUsadadeespumaTXT.setText(barraQuantidaUsadadeespuma_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        ///->espumacomprata
        final TextView QuantidaUsadadeespumacomprataTXT = (TextView)findViewById(R.id.calculadora_cobertura_primaria_espuma_com_prata_texto);
        SeekBar barraQuantidaUsadadeespumacomprata = (SeekBar)findViewById(R.id.calculadora_cobertura_primaria_espuma_com_prata_barra);
        barraQuantidaUsadadeespumacomprata.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadeespumacomprata_1 = progress / 10;
                QuantidaUsadadeespumacomprataTXT.setText(barraQuantidaUsadadeespumacomprata_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        ///->espumacomsilicone
        final TextView QuantidaUsadadeespumacomsiliconeTXT = (TextView)findViewById(R.id.calculadora_cobertura_primaria_espuma_com_silicone_texto);
        SeekBar barraQuantidaUsadadeespumacomsilicone = (SeekBar)findViewById(R.id.calculadora_cobertura_primaria_espuma_com_silicone_barra);
        barraQuantidaUsadadeespumacomsilicone.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadeespumacomsilicone_1 = progress / 10;
                QuantidaUsadadeespumacomsiliconeTXT.setText(barraQuantidaUsadadeespumacomsilicone_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ///->espumacomsiliconeeprata
        final TextView QuantidaUsadadeespumacomsiliconeeprataTXT = (TextView)findViewById(R.id.calculadora_cobertura_primaria_espuma_com_silicone_prata_texto);
        SeekBar barraQuantidaUsadadeespumacomsiliconeeprata = (SeekBar)findViewById(R.id.calculadora_cobertura_primaria_espuma_com_silicone_prata_barra);
        barraQuantidaUsadadeespumacomsiliconeeprata.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadeespumacomsiliconeeprata_1 = progress / 10;
                QuantidaUsadadeespumacomsiliconeeprataTXT.setText(barraQuantidaUsadadeespumacomsiliconeeprata_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



        ///->espumacomborda
        final TextView QuantidaUsadadeespumacombordaTXT = (TextView)findViewById(R.id.calculadora_cobertura_primaria_espuma_com_silicone_prata_com_borda_texto);
        SeekBar barraQuantidaUsadadeespumacomborda = (SeekBar)findViewById(R.id.calculadora_cobertura_primaria_espuma_com_silicone_prata_com_borda_barra);
        barraQuantidaUsadadeespumacomborda.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadeespumacomborda_1 = progress / 10;
                QuantidaUsadadeespumacombordaTXT.setText(barraQuantidaUsadadeespumacomborda_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


///-> espumacombordasilicone
        final TextView QuantidaUsadadeespumacombordasiliconeTXT = (TextView)findViewById(R.id.calculadora_cobertura_primaria_espuma_com_silicone_prata_com_borda_camada_silicone_texto);
        SeekBar barraQuantidaUsadadeespumacombordasilicone = (SeekBar)findViewById(R.id.calculadora_cobertura_primaria_espuma_com_silicone_prata_com_borda_camada_silicone_barra);
        barraQuantidaUsadadeespumacombordasilicone.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadeespumacombordasilicone_1 = progress / 10;
                QuantidaUsadadeespumacombordasiliconeTXT.setText(barraQuantidaUsadadeespumacombordasilicone_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

///->espumacombordasiliconeprata
        final TextView QuantidaUsadadeespumacombordasiliconeprataTXT = (TextView)findViewById(R.id.calculadora_cobertura_primaria_espuma_borda_camada_silicone_impregnada_prata_texto);
        SeekBar barraQuantidaUsadadeespumacombordasiliconeprata = (SeekBar)findViewById(R.id.calculadora_cobertura_primaria_espuma_borda_camada_silicone_impregnada_prata_barra);
        barraQuantidaUsadadeespumacombordasiliconeprata.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadeespumacombordasiliconeprata_1 = progress / 10;
                QuantidaUsadadeespumacombordasiliconeprataTXT.setText(barraQuantidaUsadadeespumacombordasiliconeprata_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

///->hidrofibra
        final TextView QuantidaUsadadehidrofibraTXT = (TextView)findViewById(R.id.calculadora_cobertura_primaria_hidrofibra_texto);
        SeekBar barraQuantidaUsadadehidrofibra = (SeekBar)findViewById(R.id.calculadora_cobertura_primaria_hidrofibra_barra);
        barraQuantidaUsadadehidrofibra.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadehidrofibra_1 = progress / 10;
                QuantidaUsadadehidrofibraTXT.setText(barraQuantidaUsadadehidrofibra_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


///->hidrofibraprata
        final TextView QuantidaUsadadehidrofibraprataTXT = (TextView)findViewById(R.id.calculadora_cobertura_primaria_hidrofibra_prata_texto);
        SeekBar barraQuantidaUsadadehidrofibraprata = (SeekBar)findViewById(R.id.calculadora_cobertura_primaria_hidrofibra_prata_barra);
        barraQuantidaUsadadehidrofibraprata.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadehidrofibraprata_1 = progress / 10;
                QuantidaUsadadehidrofibraprataTXT.setText(barraQuantidaUsadadehidrofibraprata_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


///->hidrogelb
        final TextView QuantidaUsadadehidrogelbTXT = (TextView)findViewById(R.id.calculadora_cobertura_primaria_hidrogel_texto);
        SeekBar barraQuantidaUsadadehidrogelb = (SeekBar)findViewById(R.id.calculadora_cobertura_primaria_hidrogel_barra);
        barraQuantidaUsadadehidrogelb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadehidrogelb_1 = progress / 10;
                QuantidaUsadadehidrogelbTXT.setText(barraQuantidaUsadadehidrogelb_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

///->papaina
        final TextView QuantidaUsadadepapainaTXT = (TextView)findViewById(R.id.calculadora_cobertura_primaria_papaina_texto);
        SeekBar barraQuantidaUsadadepapaina = (SeekBar)findViewById(R.id.calculadora_cobertura_primaria_papaina_barra);
        barraQuantidaUsadadepapaina.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadepapaina_1 = progress / 10;
                QuantidaUsadadepapainaTXT.setText(barraQuantidaUsadadepapaina_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


///->sulfadiazinaprata
        final TextView QuantidaUsadadesulfadiazinaprataTXT = (TextView)findViewById(R.id.calculadora_cobertura_primaria_sulfadiazina_prata_texto);
        SeekBar barraQuantidaUsadadesulfadiazinaprata = (SeekBar)findViewById(R.id.calculadora_cobertura_primaria_sulfadiazina_prata_barra);
        barraQuantidaUsadadesulfadiazinaprata.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadesulfadiazinaprata_1 = progress / 10;
                QuantidaUsadadesulfadiazinaprataTXT.setText(barraQuantidaUsadadesulfadiazinaprata_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


///-> kolagenase
        final TextView QuantidaUsadadekolagenaseTXT = (TextView)findViewById(R.id.calculadora_cobertura_primaria_kolagenase_texto);
        SeekBar barraQuantidaUsadadekolagenase = (SeekBar)findViewById(R.id.calculadora_cobertura_primaria_kolagenase_barra);
        barraQuantidaUsadadekolagenase.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadekolagenase_1 = progress / 10;
                QuantidaUsadadekolagenaseTXT.setText(barraQuantidaUsadadekolagenase_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

///->telapratananocristalina
        final TextView QuantidaUsadadetelapratananocristalinaTXT = (TextView)findViewById(R.id.calculadora_cobertura_primaria_tela_prata_nanocristalina_texto);
        SeekBar barraQuantidaUsadadetelapratananocristalina = (SeekBar)findViewById(R.id.calculadora_cobertura_primaria_tela_prata_nanocristalina_barra);
        barraQuantidaUsadadetelapratananocristalina.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadetelapratananocristalina_1 = progress / 10;
                QuantidaUsadadetelapratananocristalinaTXT.setText(barraQuantidaUsadadetelapratananocristalina_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



///->rayon
        final TextView QuantidaUsadaderayonTXT = (TextView)findViewById(R.id.calculadora_cobertura_primaria_rayon_texto);
        SeekBar barraQuantidaUsadaderayon = (SeekBar)findViewById(R.id.calculadora_cobertura_primaria_rayon_barra);
        barraQuantidaUsadaderayon.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadaderayon_1 = progress / 10;
                QuantidaUsadaderayonTXT.setText(barraQuantidaUsadaderayon_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


///->telanaderenteimpregnada
        final TextView QuantidaUsadadetelanaderenteimpregnadaTXT = (TextView)findViewById(R.id.calculadora_cobertura_primaria_Tela_nao_aderente_impregnada_texto);
        SeekBar barraQuantidaUsadadetelanaderenteimpregnada = (SeekBar)findViewById(R.id.calculadora_cobertura_primaria_Tela_nao_aderente_impregnada_barra);
        barraQuantidaUsadadetelanaderenteimpregnada.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadetelanaderenteimpregnada_1 = progress / 10;
                QuantidaUsadadetelanaderenteimpregnadaTXT.setText(barraQuantidaUsadadetelanaderenteimpregnada_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


///->carvao
        final TextView QuantidaUsadadecarvaoTXT = (TextView)findViewById(R.id.calculadora_cobertura_primaria_carvao_texto);
        SeekBar barraQuantidaUsadadecarvao = (SeekBar)findViewById(R.id.calculadora_cobertura_primaria_carvao_barra);
        barraQuantidaUsadadecarvao.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadecarvao_1 = progress / 10;
                QuantidaUsadadecarvaoTXT.setText(barraQuantidaUsadadecarvao_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

///->carvaoprata
        final TextView QuantidaUsadadecarvaoprataTXT = (TextView)findViewById(R.id.calculadora_cobertura_primaria_carvao_com_prata_texto);
        SeekBar barraQuantidaUsadadecarvaoprata = (SeekBar)findViewById(R.id.calculadora_cobertura_primaria_carvao_com_prata_barra);
        barraQuantidaUsadadecarvaoprata.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadecarvaoprata_1 = progress / 10;
                QuantidaUsadadecarvaoprataTXT.setText(barraQuantidaUsadadecarvaoprata_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        ///->filmetransparente
        final TextView QuantidaUsadadefilmetransparenteTXT = (TextView)findViewById(R.id.calculadora_cobertura_primaria_filme_transparente_texto);
        SeekBar barraQuantidaUsadadefilmetransparente = (SeekBar)findViewById(R.id.calculadora_cobertura_primaria_filme_transparente_barra);
        barraQuantidaUsadadefilmetransparente.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadefilmetransparente_1 = progress / 10;
                QuantidaUsadadefilmetransparenteTXT.setText(barraQuantidaUsadadefilmetransparente_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


///-> hidrocoloide
        final TextView QuantidaUsadadehidrocoloideTXT = (TextView)findViewById(R.id.calculadora_cobertura_primaria_hidrocoloide_texto);
        SeekBar barraQuantidaUsadadehidrocoloide = (SeekBar)findViewById(R.id.calculadora_cobertura_primaria_hidrocoloide_barra);
        barraQuantidaUsadadehidrocoloide.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadehidrocoloide_1 = progress / 10;
                QuantidaUsadadehidrocoloideTXT.setText(barraQuantidaUsadadehidrocoloide_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ///-> protetorcutaneo
        final TextView QuantidaUsadadeprotetorcutaneoTXT = (TextView)findViewById(R.id.calculadora_cobertura_primaria_protetorcutaneo_texto);
        SeekBar barraQuantidaUsadadeprotetorcutaneo = (SeekBar)findViewById(R.id.calculadora_cobertura_primaria_protetorcutaneo_barra);
        barraQuantidaUsadadeprotetorcutaneo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadeprotetorcutaneo_1 = progress / 10;
                QuantidaUsadadeprotetorcutaneoTXT.setText(barraQuantidaUsadadeprotetorcutaneo_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



///->gazeesteril
        final TextView QuantidaUsadadegazeesterilTXT = (TextView)findViewById(R.id.calculadora_cobertura_secundaria_gaze_esteril_texto);
        SeekBar barraQuantidaUsadadegazeesteril = (SeekBar)findViewById(R.id.calculadora_cobertura_secundaria_gaze_esteril_barra);
        barraQuantidaUsadadegazeesteril.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadegazeesteril_1 = progress / 10;
                QuantidaUsadadegazeesterilTXT.setText(barraQuantidaUsadadegazeesteril_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

///->gazenesteril
        final TextView QuantidaUsadadegazenesterilTXT = (TextView)findViewById(R.id.calculadora_cobertura_secundaria_gaze_nao_esteril_texto);
        SeekBar barraQuantidaUsadadegazenesteril = (SeekBar)findViewById(R.id.calculadora_cobertura_secundaria_gaze_nao_esteril_barra);
        barraQuantidaUsadadegazenesteril.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadegazenesteril_1 = progress / 10;
                QuantidaUsadadegazenesterilTXT.setText(barraQuantidaUsadadegazenesteril_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



///->atadura
        final TextView QuantidaUsadadeataduraTXT = (TextView)findViewById(R.id.calculadora_cobertura_secundaria_atadura_texto);
        SeekBar barraQuantidaUsadadeatadura = (SeekBar)findViewById(R.id.calculadora_cobertura_secundaria_atadura_barra);
        barraQuantidaUsadadeatadura.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadeatadura_1 = progress / 10;
                QuantidaUsadadeataduraTXT.setText(barraQuantidaUsadadeatadura_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

///->fitaadesiva
        final TextView QuantidaUsadadefitaadesivaTXT = (TextView)findViewById(R.id.calculadora_cobertura_secundaria_fita_adesiva_texto);
        SeekBar barraQuantidaUsadadefitaadesiva = (SeekBar)findViewById(R.id.calculadora_cobertura_secundaria_fita_adesiva_barra);
        barraQuantidaUsadadefitaadesiva.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadefitaadesiva_1 = progress / 10;
                QuantidaUsadadefitaadesivaTXT.setText(barraQuantidaUsadadefitaadesiva_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


///->rayon2
        final TextView QuantidaUsadaderayon2TXT = (TextView)findViewById(R.id.calculadora_cobertura_secundaria_rayon_2_texto);
        SeekBar barraQuantidaUsadaderayon2 = (SeekBar)findViewById(R.id.calculadora_cobertura_secundaria_rayon_2_barra);
        barraQuantidaUsadaderayon2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadaderayon2_1 = progress / 10;
                QuantidaUsadaderayon2TXT.setText(barraQuantidaUsadaderayon2_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


///-> chumaco
        final TextView QuantidaUsadadechumacoTXT = (TextView)findViewById(R.id.calculadora_cobertura_secundaria_chumaco_texto);
        SeekBar barraQuantidaUsadadechumaco = (SeekBar)findViewById(R.id.calculadora_cobertura_secundaria_chumaco_barra);
        barraQuantidaUsadadechumaco.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadechumaco_1 = progress / 10;
                QuantidaUsadadechumacoTXT.setText(barraQuantidaUsadadechumaco_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

///->compressaesteril
        final TextView QuantidaUsadadecompressaesterilTXT = (TextView)findViewById(R.id.calculadora_cobertura_secundaria_compressa_esteril_texto);
        SeekBar barraQuantidaUsadadecompressaesteril = (SeekBar)findViewById(R.id.calculadora_cobertura_secundaria_compressa_esteril_barra);
        barraQuantidaUsadadecompressaesteril.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadecompressaesteril_1 = progress / 10;
                QuantidaUsadadecompressaesterilTXT.setText(barraQuantidaUsadadecompressaesteril_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

///->espuma2
        final TextView QuantidaUsadadeespuma2TXT = (TextView)findViewById(R.id.calculadora_cobertura_secundaria_espuma_texto);
        SeekBar barraQuantidaUsadadeespuma2 = (SeekBar)findViewById(R.id.calculadora_cobertura_secundaria_espuma_barra);
        barraQuantidaUsadadeespuma2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadeespuma2_1 = progress / 10;
                QuantidaUsadadeespuma2TXT.setText(barraQuantidaUsadadeespuma2_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


///->filmetransparente2
        final TextView QuantidaUsadadefilmetransparente2TXT = (TextView)findViewById(R.id.calculadora_cobertura_secundaria_filme_transparente_2_texto);
        SeekBar barraQuantidaUsadadefilmetransparente2 = (SeekBar)findViewById(R.id.calculadora_cobertura_secundaria_filme_transparente_2_barra);
        barraQuantidaUsadadefilmetransparente2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadefilmetransparente2_1 = progress / 10;
                QuantidaUsadadefilmetransparente2TXT.setText(barraQuantidaUsadadefilmetransparente2_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


///->pressaonegativacprata
        final TextView QuantidaUsadadepressaonegativacprataTXT = (TextView)findViewById(R.id.calculadora_terapias_adjuvantes_pressao_negativa_prata_texto);
        SeekBar barraQuantidaUsadadepressaonegativacprata = (SeekBar)findViewById(R.id.calculadora_terapias_adjuvantes_pressao_negativa_prata_barra);
        barraQuantidaUsadadepressaonegativacprata.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadepressaonegativacprata_1 = progress / 10;
                QuantidaUsadadepressaonegativacprataTXT.setText(barraQuantidaUsadadepressaonegativacprata_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

///->pressaonegativasprata
        final TextView QuantidaUsadadepressaonegativasprataTXT = (TextView)findViewById(R.id.calculadora_terapias_adjuvantes_pressao_negativa_s_prata_texto);
        SeekBar barraQuantidaUsadadepressaonegativasprata = (SeekBar)findViewById(R.id.calculadora_terapias_adjuvantes_pressao_negativa_s_prata_barra);
        barraQuantidaUsadadepressaonegativasprata.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadepressaonegativasprata_1 = progress / 10;
                QuantidaUsadadepressaonegativasprataTXT.setText(barraQuantidaUsadadepressaonegativasprata_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



///->camahiperbarica
        final TextView QuantidaUsadadecamahiperbaricaTXT = (TextView)findViewById(R.id.calculadora_terapias_adjuvantes_camara_hiprebarica_texto);
        SeekBar barraQuantidaUsadadecamahiperbarica = (SeekBar)findViewById(R.id.calculadora_terapias_adjuvantes_camara_hiprebarica_barra);
        barraQuantidaUsadadecamahiperbarica.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadecamahiperbarica_1 = progress / 10;
                QuantidaUsadadecamahiperbaricaTXT.setText(barraQuantidaUsadadecamahiperbarica_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


///-> laserterapia
        final TextView QuantidaUsadadelaserterapiaTXT = (TextView)findViewById(R.id.calculadora_terapias_adjuvantes_laserterapia_texto);
        SeekBar barraQuantidaUsadadelaserterapia = (SeekBar)findViewById(R.id.calculadora_terapias_adjuvantes_laserterapia_barra);
        barraQuantidaUsadadelaserterapia.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadelaserterapia_1 = progress / 10;
                QuantidaUsadadelaserterapiaTXT.setText(barraQuantidaUsadadelaserterapia_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

///->desbridamentocirurgico
        final TextView QuantidaUsadadedesbridamentocirurgicoTXT = (TextView)findViewById(R.id.calculadora_terapias_adjuvantes_desbridamento_cirurgico_texto);
        SeekBar barraQuantidaUsadadedesbridamentocirurgico = (SeekBar)findViewById(R.id.calculadora_terapias_adjuvantes_desbridamento_cirurgico_barra);
        barraQuantidaUsadadedesbridamentocirurgico.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadedesbridamentocirurgico_1 = progress / 10;
                QuantidaUsadadedesbridamentocirurgicoTXT.setText(barraQuantidaUsadadedesbridamentocirurgico_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

///->taxadesala
        final TextView QuantidaUsadadetaxadesalaTXT = (TextView)findViewById(R.id.calculadora_terapias_adjuvantes_taxa_de_sala_texto);
        SeekBar barraQuantidaUsadadetaxadesala = (SeekBar)findViewById(R.id.calculadora_terapias_adjuvantes_taxa_de_sala_barra);
        barraQuantidaUsadadetaxadesala.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadetaxadesala_1 = progress / 10;
                QuantidaUsadadetaxadesalaTXT.setText(barraQuantidaUsadadetaxadesala_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


///->analgesicoantiinflamatorio
        final TextView QuantidaUsadadeanalgesicoantiinflamatorioTXT = (TextView)findViewById(R.id.calculadora_medicacao_analgesicos_antiinflamatorios_texto);
        SeekBar barraQuantidaUsadadeanalgesicoantiinflamatorio = (SeekBar)findViewById(R.id.calculadora_medicacao_analgesicos_antiinflamatorios_barra);
        barraQuantidaUsadadeanalgesicoantiinflamatorio.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadeanalgesicoantiinflamatorio_1 = progress / 10;
                QuantidaUsadadeanalgesicoantiinflamatorioTXT.setText(barraQuantidaUsadadeanalgesicoantiinflamatorio_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


///->analgesico
        final TextView QuantidaUsadadeanalgesicoTXT = (TextView)findViewById(R.id.calculadora_medicacao_anestesicos_texto);
        SeekBar barraQuantidaUsadadeanalgesico = (SeekBar)findViewById(R.id.calculadora_medicacao_anestesicos_barra);
        barraQuantidaUsadadeanalgesico.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadeanalgesico_1 = progress / 10;
                QuantidaUsadadeanalgesicoTXT.setText(barraQuantidaUsadadeanalgesico_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

///->antibiotico
        final TextView QuantidaUsadadeantibioticoTXT = (TextView)findViewById(R.id.calculadora_medicacao_antibioticos_texto);
        SeekBar barraQuantidaUsadadeantibiotico = (SeekBar)findViewById(R.id.calculadora_medicacao_antibioticos_barra);
        barraQuantidaUsadadeantibiotico.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadeantibiotico_1 = progress / 10;
                QuantidaUsadadeantibioticoTXT.setText(barraQuantidaUsadadeantibiotico_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


///->tecnicoenfermenfermeirom
        final TextView QuantidaUsadadetecnicoenfermenfermeiromTXT = (TextView)findViewById(R.id.calculadora_medicacao_tecnico_de_enfermagem_texto);
        SeekBar barraQuantidaUsadadetecnicoenfermenfermeirom = (SeekBar)findViewById(R.id.calculadora_medicacao_tecnico_de_enfermagem_barra);
        barraQuantidaUsadadetecnicoenfermenfermeirom.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadetecnicoenfermenfermeirom_1 = progress / 10;
                QuantidaUsadadetecnicoenfermenfermeiromTXT.setText(barraQuantidaUsadadetecnicoenfermenfermeirom_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


///-> enfermeiro
        final TextView QuantidaUsadadeenfermeiroTXT = (TextView)findViewById(R.id.calculadora_medicacao_enfermeiro_texto);
        SeekBar barraQuantidaUsadadeenfermeiro = (SeekBar)findViewById(R.id.calculadora_medicacao_enfermeiro_barra);
        barraQuantidaUsadadeenfermeiro.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadeenfermeiro_1 = progress / 10;
                QuantidaUsadadeenfermeiroTXT.setText(barraQuantidaUsadadeenfermeiro_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

///->enfermeiroespecialista
        final TextView QuantidaUsadadeenfermeiroespecialistaTXT = (TextView)findViewById(R.id.calculadora_medicacao_enfermeiro_especialista_texto);
        SeekBar barraQuantidaUsadadeenfermeiroespecialista = (SeekBar)findViewById(R.id.calculadora_medicacao_enfermeiro_especialista_barra);
        barraQuantidaUsadadeenfermeiroespecialista.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadadeenfermeiroespecialista_1 = progress / 10;
                QuantidaUsadadeenfermeiroespecialistaTXT.setText(barraQuantidaUsadadeenfermeiroespecialista_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });





///->medico
        final TextView QuantidaUsadademedicoTXT = (TextView)findViewById(R.id.calculadora_medicacao_medico_texto);
        SeekBar barraQuantidaUsadademedico = (SeekBar)findViewById(R.id.calculadora_medicacao_medico_barra);
        barraQuantidaUsadademedico.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidaUsadademedico_1 = progress / 10;
                QuantidaUsadademedicoTXT.setText(barraQuantidaUsadademedico_1 + " mL");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ///DAO1
        valorsf = (EditText)findViewById(R.id.calculadora_s_d_l_e_r_d_c_a_soro_fisiologico_valor);
        valorrin = (EditText)findViewById(R.id.calculadora_s_d_l_e_r_d_c_a_ringer_lactato_valor);
        valorphmb = (EditText)findViewById(R.id.calculadora_s_d_l_e_r_d_c_a_PHMB_valor);
        valorpvpi = (EditText)findViewById(R.id.calculadora_s_d_l_e_r_d_c_a_PVPI_valor);
        valorclorexidine = (EditText)findViewById(R.id.calculadora_s_d_l_e_r_d_c_a_Clorexidine_valor);

        ///DAO2
        valorremovedorDeAdesivo= (EditText)findViewById(R.id.calculadora_s_d_l_e_r_d_c_a_removedor_de_adesivo_valor);
        valorremovedorDeAdesivoUni= (EditText)findViewById(R.id.calculadora_s_d_l_e_r_d_c_a_removedor_de_adesivo_u_valor);
        valorage= (EditText)findViewById(R.id.calculadora_cobertura_primaria_age_valor);
        valoralginato= (EditText)findViewById(R.id.calculadora_cobertura_primaria_alginato_valor);
        valoralginatocomprata = (EditText)findViewById(R.id.calculadora_cobertura_primaria_alginato_com_prata_valor);

        ///DAO3
        valorespuma = (EditText)findViewById(R.id.calculadora_cobertura_primaria_espuma_valor);
        valorespumacomprata = (EditText)findViewById(R.id.calculadora_cobertura_primaria_espuma_com_prata_valor);
        valorespumacomsilicone= (EditText)findViewById(R.id.calculadora_cobertura_primaria_espuma_com_silicone_valor);
        valorespumacomsiliconeeprata= (EditText)findViewById(R.id.calculadora_cobertura_primaria_espuma_com_silicone_prata_valor);
        valorespumacomborda= (EditText)findViewById(R.id.calculadora_cobertura_primaria_espuma_com_silicone_prata_com_borda_valor);
        valorespumacombordasilicone= (EditText)findViewById(R.id.calculadora_cobertura_primaria_espuma_com_silicone_prata_com_borda_camada_silicone_valor);
        valorespumacombordasiliconeprata= (EditText)findViewById(R.id.calculadora_cobertura_primaria_espuma_borda_camada_silicone_impregnada_prata_valor);
        valorhidrofibra= (EditText)findViewById(R.id.calculadora_cobertura_primaria_hidrofibra_valor);
        valorhidrofibraprata= (EditText)findViewById(R.id.calculadora_cobertura_primaria_hidrofibra_prata_valor);
        valorhidrogelb= (EditText)findViewById(R.id.calculadora_cobertura_primaria_hidrogel_valor);
        valorpapaina= (EditText)findViewById(R.id.calculadora_cobertura_primaria_papaina_valor);
        valorsulfadiazinaprata= (EditText)findViewById(R.id.calculadora_cobertura_primaria_sulfadiazina_prata_valor);
        valorkolagenase= (EditText)findViewById(R.id.calculadora_cobertura_primaria_kolagenase_valor);
        valortelapratananocristalina= (EditText)findViewById(R.id.calculadora_cobertura_primaria_tela_prata_nanocristalina_valor);
        valorrayon= (EditText)findViewById(R.id.calculadora_cobertura_primaria_Tela_nao_aderente_impregnada_valor);
        valortelanaderenteimpregnada= (EditText)findViewById(R.id.calculadora_cobertura_primaria_carvao_valor);
        valorcarvao= (EditText)findViewById(R.id.calculadora_cobertura_primaria_carvao_com_prata_valor);
        valorcarvaoprata= (EditText)findViewById(R.id.calculadora_cobertura_primaria_filme_transparente_valor);
        valorfilmetransparente= (EditText)findViewById(R.id.calculadora_cobertura_primaria_rayon_valor);
        valorhidrocoloide= (EditText)findViewById(R.id.calculadora_cobertura_primaria_hidrocoloide_valor);
        valorprotetorcutaneo= (EditText)findViewById(R.id.calculadora_cobertura_primaria_protetorcutaneo_valor);
        valorgazeesteril= (EditText)findViewById(R.id.calculadora_cobertura_secundaria_gaze_esteril_valor);
        valorgazenesteril= (EditText)findViewById(R.id.calculadora_cobertura_secundaria_gaze_nao_esteril_valor);
        valoratadura= (EditText)findViewById(R.id.calculadora_cobertura_secundaria_atadura_valor);
        valorfitaadesiva= (EditText)findViewById(R.id.calculadora_cobertura_secundaria_fita_adesiva_valor);
        valorrayon2= (EditText)findViewById(R.id.calculadora_cobertura_secundaria_rayon_2_valor);
        valorchumaco= (EditText)findViewById(R.id.calculadora_cobertura_secundaria_chumaco_valor);
        valorcompressaesteril= (EditText)findViewById(R.id.calculadora_cobertura_secundaria_compressa_esteril_valor);
        valorespuma2= (EditText)findViewById(R.id.calculadora_cobertura_secundaria_espuma_valor);
        valorfilmetransparente2= (EditText)findViewById(R.id.calculadora_cobertura_secundaria_filme_transparente_2_valor);
        valorpressaonegativacprata= (EditText)findViewById(R.id.calculadora_terapias_adjuvantes_pressao_negativa_prata_valor);
        valorpressaonegativasprata= (EditText)findViewById(R.id.calculadora_terapias_adjuvantes_pressao_negativa_s_prata_valor);
        valorcamahiperbarica= (EditText)findViewById(R.id.calculadora_terapias_adjuvantes_camara_hiprebarica_valor);
        valorlaserterapia= (EditText)findViewById(R.id.calculadora_terapias_adjuvantes_laserterapia_valor);
        valordesbridamentocirurgico= (EditText)findViewById(R.id.calculadora_terapias_adjuvantes_desbridamento_cirurgico_valor);
        valortaxadesala= (EditText)findViewById(R.id.calculadora_terapias_adjuvantes_taxa_de_sala_valor);
        valoranalgesicoantiinflamatorio= (EditText)findViewById(R.id.calculadora_medicacao_analgesicos_antiinflamatorios_valor);
        valoranalgesico= (EditText)findViewById(R.id.calculadora_medicacao_anestesicos_valor);
        valorantibiotico= (EditText)findViewById(R.id.calculadora_medicacao_antibioticos_valor);
        valortecnicoenfermenfermeirom= (EditText)findViewById(R.id.calculadora_medicacao_tecnico_de_enfermagem_valor);
        valorenfermeiro= (EditText)findViewById(R.id.calculadora_medicacao_enfermeiro_valor);
        valorenfermeiroespecialista= (EditText)findViewById(R.id.calculadora_medicacao_enfermeiro_especialista_valor);
        valormedico= (EditText)findViewById(R.id.calculadora_medicacao_medico_valor);






    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflar = getMenuInflater();
        inflar.inflate(R.menu.menu_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.menu_menu_ok:

                ///-> PEGA O VALOR DO MEDICAMENTO E CONVERTE PARA INT
                String sTextFromET = valorsf.getText().toString();
                int valorsfINT = new Integer(sTextFromET).intValue();
                String rin = valorrin.getText().toString();
                int valorrinINT = new Integer(rin).intValue();
                String phmb = valorphmb.getText().toString();
                int valorphmbINT = new Integer(phmb).intValue();
                String pvpi = valorpvpi.getText().toString();
                int pvpiINT = new Integer(pvpi).intValue();
                String clorexidine = valorclorexidine.getText().toString();
                int clorexidineINT = new Integer(clorexidine).intValue();

                String removedorDeAdesivo = valorremovedorDeAdesivo.getText().toString();
                int removedorDeAdesivoINT = new Integer(removedorDeAdesivo).intValue();
                String removedorDeAdesivoU = valorremovedorDeAdesivoUni.getText().toString();
                int removedorDeAdesivoUINT = new Integer(removedorDeAdesivoU).intValue();
                String age = valorage.getText().toString();
                int ageINT = new Integer(age).intValue();
                String alginato = valoralginato.getText().toString();
                int alginatoINT = new Integer(alginato).intValue();
                String aux2 = valoralginatocomprata.getText().toString();
                int valoralginatocomprataINT = new Integer(aux2).intValue();


                String espuma = valorespuma.getText().toString();
                int espumaINT = new Integer(espuma).intValue();

                String espumacomprata = valorespumacomprata.getText().toString();
                int espumacomprataINT = new Integer(espumacomprata).intValue();
                String espumacomsilicone = valorespumacomsilicone.getText().toString();
                int espumacomsiliconeINT = new Integer(espumacomsilicone).intValue();
                String espumacomsiliconeeprata = valorespumacomsiliconeeprata.getText().toString();
                int espumacomsiliconeeprataINT = new Integer(espumacomsiliconeeprata).intValue();
                String espumacomborda = valorespumacomborda.getText().toString();
                int espumacombordaINT = new Integer(espumacomborda).intValue();

                String espumacombordasilicone = valorespumacombordasilicone.getText().toString();
                int espumacombordasiliconeINT = new Integer(espumacombordasilicone).intValue();
                String espumacombordasiliconeprata = valorespumacombordasiliconeprata.getText().toString();
                int espumacombordasiliconeprataINT = new Integer(espumacombordasiliconeprata).intValue();
                String hidrofibra = valorhidrofibra.getText().toString();
                int hidrofibraINT = new Integer(hidrofibra).intValue();


                String hidrofibraprata = valorhidrofibraprata.getText().toString();
                int hidrofibraprataINT = new Integer(hidrofibraprata).intValue();

                String hidrogelb  = valorhidrogelb.getText().toString();
                int hidrogelbINT = new Integer(hidrogelb).intValue();
                String papaina = valorpapaina.getText().toString();
                int papainaINT = new Integer(papaina).intValue();
                String sulfadiazinaprata = valorsulfadiazinaprata.getText().toString();
                int sulfadiazinaprataINT = new Integer(sulfadiazinaprata).intValue();
                String kolagenase = valorkolagenase.getText().toString();
                int kolagenaseINT = new Integer(kolagenase).intValue();

                String telapratananocristalina = valortelapratananocristalina.getText().toString();
                int telapratananocristalinaINT = new Integer(telapratananocristalina).intValue();
                String rayon = valorrayon.getText().toString();
                int rayonINT = new Integer(rayon).intValue();
                String telanaderenteimpregnada = valortelanaderenteimpregnada.getText().toString();
                int telanaderenteimpregnadaINT = new Integer(telanaderenteimpregnada).intValue();

                String carvao = valorcarvao.getText().toString();
                int carvaoINT = new Integer(carvao).intValue();
                String carvaoprata = valorcarvaoprata.getText().toString();
                int carvaoprataINT = new Integer(carvaoprata).intValue();
                String filmetransparente = valorfilmetransparente.getText().toString();
                int filmetransparenteINT = new Integer(filmetransparente).intValue();


                String hidrocoloide = valorhidrocoloide.getText().toString();
                int hidrocoloideINT = new Integer(hidrocoloide).intValue();

                String protetorcutaneo = valorprotetorcutaneo.getText().toString();
                int protetorcutaneoINT = new Integer(protetorcutaneo).intValue();
                String gazeesteril = valorgazeesteril.getText().toString();
                int gazeesterilINT = new Integer(gazeesteril).intValue();
                String gazenesteril = valorgazenesteril.getText().toString();
                int gazenesterilINT = new Integer(gazenesteril).intValue();
                String atadura = valoratadura.getText().toString();
                int ataduraINT = new Integer(atadura).intValue();

                String fitaadesiva = valorfitaadesiva.getText().toString();
                int fitaadesivaINT = new Integer(fitaadesiva).intValue();
                String rayon2 = valorrayon2.getText().toString();
                int rayon2INT = new Integer(rayon2).intValue();
                String chumaco = valorchumaco.getText().toString();
                int chumacoINT = new Integer(chumaco).intValue();

                String compressaesteril = valorcompressaesteril.getText().toString();
                int compressaesterilINT = new Integer(compressaesteril).intValue();
                String espuma2 = valorespuma2.getText().toString();
                int espuma2INT = new Integer(espuma2).intValue();
                String filmetransparente2 = valorfilmetransparente2.getText().toString();
                int filmetransparente2INT = new Integer(filmetransparente2).intValue();
                String pressaonegativacprata = valorpressaonegativacprata.getText().toString();
                int pressaonegativacprataINT = new Integer(pressaonegativacprata).intValue();

                String pressaonegativasprata = valorpressaonegativasprata.getText().toString();
                int pressaonegativasprataINT = new Integer(pressaonegativasprata).intValue();
                String camahiperbarica = valorcamahiperbarica.getText().toString();
                int camahiperbaricaINT = new Integer(camahiperbarica).intValue();
                String laserterapia = valorlaserterapia.getText().toString();
                int laserterapiaINT = new Integer(laserterapia).intValue();

                String desbridamentocirurgico = valordesbridamentocirurgico.getText().toString();
                int desbridamentocirurgicoINT = new Integer(desbridamentocirurgico).intValue();
                String taxadesala = valortaxadesala.getText().toString();
                int taxadesalaINT = new Integer(taxadesala).intValue();
                String analgesicoantiinflamatorio = valoranalgesicoantiinflamatorio.getText().toString();
                int analgesicoantiinflamatorioINT = new Integer(analgesicoantiinflamatorio).intValue();

                String analgesico = valoranalgesico.getText().toString();
                int analgesicoINT = new Integer(analgesico).intValue();

                String antibiotico = valorantibiotico.getText().toString();
                int antibioticoINT = new Integer(antibiotico).intValue();
                String tecnicoenfermenfermeirom = valortecnicoenfermenfermeirom.getText().toString();
                int tecnicoenfermenfermeiromINT = new Integer(tecnicoenfermenfermeirom).intValue();
                String enfermeiro = valorenfermeiro.getText().toString();
                int enfermeiroINT = new Integer(enfermeiro).intValue();
                String enfermeiroespecialista = valorenfermeiroespecialista.getText().toString();
                int enfermeiroespecialistaINT = new Integer(enfermeiroespecialista).intValue();

                String medico = valormedico.getText().toString();
                int medicoINT = new Integer(medico).intValue();


                Toast.makeText(CalculadoraActivity.this,"usado "+valorphmb.getText().toString(),Toast.LENGTH_LONG).show();

                Calculadora calculadora = new Calculadora();
                CalculadoraDAO dao = new CalculadoraDAO(this);
                CalculadoraDAO2 dao2 = new CalculadoraDAO2(this);
                CalculadoraDAO3 dao3 = new CalculadoraDAO3(this);
                CalculadoraDAO4 dao4 = new CalculadoraDAO4(this);
                CalculadoraDAO5 dao5 = new CalculadoraDAO5(this);
                CalculadoraDAO6 dao6 = new CalculadoraDAO6(this);
                CalculadoraDAO7 dao7 = new CalculadoraDAO7(this);
                CalculadoraDAO8 dao8 = new CalculadoraDAO8(this);
                CalculadoraDAO9 dao9 = new CalculadoraDAO9(this);
                CalculadoraDAO10 dao10 = new CalculadoraDAO10(this);
                CalculadoraDAO11 dao11 = new CalculadoraDAO11(this);


                Paciente paciente = (Paciente)getIntent().getSerializableExtra("paciente");// RECEBENDO O PACIENTE DE OUTRA TELA


                calculadora.setPaciente(paciente.getNome());
                calculadora.setIdPaciente(paciente.getId());

                calculadora = dao.buscaPacientesComCalculadora(calculadora);
                calculadora = dao2.buscaPacientesComCalculadora(calculadora);
                calculadora = dao3.buscaPacientesComCalculadora(calculadora);
                calculadora = dao4.buscaPacientesComCalculadora(calculadora);
                calculadora = dao5.buscaPacientesComCalculadora(calculadora);
                calculadora = dao6.buscaPacientesComCalculadora(calculadora);
                calculadora = dao7.buscaPacientesComCalculadora(calculadora);
                calculadora = dao8.buscaPacientesComCalculadora(calculadora);
                calculadora = dao9.buscaPacientesComCalculadora(calculadora);
                calculadora = dao10.buscaPacientesComCalculadora(calculadora);
                calculadora = dao11.buscaPacientesComCalculadora(calculadora);


                calculadora.setSfprecounitario1(valorsfINT);
                calculadora.setRingerprecounitario1(valorrinINT);
                calculadora.setPhmbprecounitario1(valorphmbINT);

                calculadora.setAlginatocomprataprecounitario1(valoralginatocomprataINT);

                calculadora.setEspumaprecounitario1(espumaINT);

                if (calculadora.getIdCalculadora() == 0){

                    calculadora = joganacalculadora(calculadora);

                    dao.insere(calculadora);
                    dao2.insere(calculadora);
                    dao3.insere(calculadora);
                    dao4.insere(calculadora);
                    dao5.insere(calculadora);
                    dao6.insere(calculadora);
                    dao7.insere(calculadora);
                    dao8.insere(calculadora);
                    dao9.insere(calculadora);
                    dao10.insere(calculadora);
                    dao11.insere(calculadora);
                    //dao.atualizaTodosOsPrecosUnitarios();
                }if (calculadora.getIdCalculadora() == 1){

                calculadora.setIdPaciente(paciente.getId());
                calculadora.setSfdias(calculadora.getSfdias()+1);
                calculadora.setPaciente(paciente.getNome());
                calculadora.setIdPaciente(paciente.getId());

                calculadora = joganacalculadora(calculadora);

                dao.atualizaPaciente(calculadora);
                dao2.atualizaPaciente(calculadora);
                dao3.atualizaPaciente(calculadora);
                dao4.atualizaPaciente(calculadora);
                dao5.atualizaPaciente(calculadora);
                dao6.atualizaPaciente(calculadora);
                dao7.atualizaPaciente(calculadora);
                dao8.atualizaPaciente(calculadora);
                dao9.atualizaPaciente(calculadora);
                dao10.atualizaPaciente(calculadora);
                dao11.atualizaPaciente(calculadora);

                //dao.atualizaTodosOsPrecosUnitarios();
            }if (calculadora.getIdCalculadora() > 0 && calculadora.getIdCalculadora() != 1){

                calculadora = joganacalculadora(calculadora);

                dao.atualizaPaciente(calculadora);
                dao2.atualizaPaciente(calculadora);
                dao3.atualizaPaciente(calculadora);
                dao4.atualizaPaciente(calculadora);
                dao5.atualizaPaciente(calculadora);
                dao6.atualizaPaciente(calculadora);
                dao7.atualizaPaciente(calculadora);
                dao8.atualizaPaciente(calculadora);
                dao9.atualizaPaciente(calculadora);
                dao10.atualizaPaciente(calculadora);
                dao11.atualizaPaciente(calculadora);
               //dao.atualizaTodosOsPrecosUnitarios();
            }
                //Toast.makeText(CalculadoraActivity.this,"usado "+calculadora.getSfusado()+" dias "+calculadora.getSfdias(),Toast.LENGTH_LONG).show();
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

                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
        }

        Calculadora joganacalculadora(Calculadora calculadora){
            ///SORO FISIOLOGICO
            calculadora.setSfquantidadegastanoperiodo(calculadora.getSfquantidadegastanoperiodo() + barraQuantidaUsadadeSF_1);
            calculadora.setSfusado(barraQuantidaUsadadeSF_1);
            calculadora.setSfvalorgastonoperiodo(calculadora.getSfquantidadegastanoperiodo()*calculadora.getSfprecounitario1());

            ///RINGER
            calculadora.setRingerquantidadegastanoperiodo(calculadora.getRingerquantidadegastanoperiodo() + barraQuantidaUsadadeRINGER_1);
            calculadora.setRingerusado(barraQuantidaUsadadeRINGER_1);
            calculadora.setRingervalorgastonoperiodo(calculadora.getRingerquantidadegastanoperiodo()*calculadora.getRingerprecounitario1());

            ///PHMB
            calculadora.setPhmbquantidadegastanoperiodo(calculadora.getPhmbquantidadegastanoperiodo() + barraQuantidaUsadadePHMB_1);
            calculadora.setPhmbusado(barraQuantidaUsadadePHMB_1);
            calculadora.setPhmbvalorgastonoperiodo(calculadora.getPhmbquantidadegastanoperiodo()*calculadora.getPhmbprecounitario1());

            ///->PVPI
            calculadora.setPvpiquantidadegastanoperiodo(calculadora.getPvpiquantidadegastanoperiodo() + barraQuantidaUsadadePVPI_1);
            calculadora.setPvpiusado(barraQuantidaUsadadePVPI_1);
            calculadora.setPvpivalorgastonoperiodo(calculadora.getPvpiquantidadegastanoperiodo()*calculadora.getPvpiprecounitario1());

            ///->CLOREXIDINE
            calculadora.setClorexidinequantidadegastanoperiodo(calculadora.getClorexidinequantidadegastanoperiodo() + barraQuantidaUsadadeCLOREXIDINE_1);
            calculadora.setClorexidineusado(barraQuantidaUsadadeCLOREXIDINE_1);
            calculadora.setClorexidinevalorgastonoperiodo(calculadora.getClorexidinequantidadegastanoperiodo()*calculadora.getClorexidineprecounitario1());

            ///->REMOVEDOR DE ADESIVO
            calculadora.setRemovedorAdesivoquantidadegastanoperiodo(calculadora.getRemovedorAdesivoquantidadegastanoperiodo() + barraQuantidaUsadadeREMOVEDORADESIVO_1);
            calculadora.setRemovedorAdesivousado(barraQuantidaUsadadeREMOVEDORADESIVO_1);
            calculadora.setRemovedorAdesivovalorgastonoperiodo(calculadora.getRemovedorAdesivoquantidadegastanoperiodo()*calculadora.getRemovedorAdesivoprecounitario1());

            ///->REMOVEDOR DE ADESIVO UNIDADE
            calculadora.setRemovedorAdesivoUnidadequantidadegastanoperiodo(calculadora.getRemovedorAdesivoUnidadequantidadegastanoperiodo() + barraQuantidaUsadadeREMOVEDORADESIVOUNIDADE_1);
            calculadora.setRemovedorAdesivoUnidadeusado(barraQuantidaUsadadeREMOVEDORADESIVOUNIDADE_1);
            calculadora.setRemovedorAdesivoUnidadevalorgastonoperiodo(calculadora.getRemovedorAdesivoUnidadequantidadegastanoperiodo()*calculadora.getRemovedorAdesivoUnidadeprecounitario1());

            ///->age
            calculadora.setAgequantidadegastanoperiodo(calculadora.getAgequantidadegastanoperiodo() + barraQuantidaUsadadeage_1);
            calculadora.setAgeusado(barraQuantidaUsadadeage_1);
            calculadora.setAgevalorgastonoperiodo(calculadora.getAgequantidadegastanoperiodo()*calculadora.getAgeprecounitario1());

            ///-> alginato
            calculadora.setAlginatoquantidadegastanoperiodo(calculadora.getAlginatoquantidadegastanoperiodo() + barraQuantidaUsadadealginato_1);
            calculadora.setAlginatousado(barraQuantidaUsadadealginato_1);
            calculadora.setAlginatovalorgastonoperiodo(calculadora.getAlginatoquantidadegastanoperiodo()*calculadora.getAlginatoprecounitario1());

            ///ALGINATO COM PRATA
            calculadora.setAlginatocomprataquantidadegastanoperiodo(calculadora.getAlginatocomprataquantidadegastanoperiodo() + barraQuantidaUsadadealginatocomprata_1);
            calculadora.setAlginatocompratausado(barraQuantidaUsadadealginatocomprata_1);
            calculadora.setAlginatocompratavalorgastonoperiodo(calculadora.getAlginatocomprataquantidadegastanoperiodo()*calculadora.getAlginatocomprataprecounitario1());

            ///ESPUMA
            calculadora.setEspumaquantidadegastanoperiodo(calculadora.getEspumaquantidadegastanoperiodo() + barraQuantidaUsadadeespuma_1);
            calculadora.setEspumausado(barraQuantidaUsadadeespuma_1);
            calculadora.setEspumavalorgastonoperiodo(calculadora.getEspumaquantidadegastanoperiodo()*calculadora.getEspumaprecounitario1());

            ///->espumacomprata
            calculadora.setEspumacomprataquantidadegastanoperiodo(calculadora.getEspumacomprataquantidadegastanoperiodo() + barraQuantidaUsadadeespumacomprata_1);
            calculadora.setEspumacompratausado(barraQuantidaUsadadeespumacomprata_1);
            calculadora.setEspumacompratavalorgastonoperiodo(calculadora.getEspumacomprataquantidadegastanoperiodo()*calculadora.getEspumacomprataprecounitario1());

            ///->espumacomsilicone
            calculadora.setEspumacomsiliconequantidadegastanoperiodo(calculadora.getEspumacomsiliconequantidadegastanoperiodo() + barraQuantidaUsadadeespumacomsilicone_1);
            calculadora.setEspumacomsiliconeusado(barraQuantidaUsadadeespumacomsilicone_1);
            calculadora.setEspumacomsiliconevalorgastonoperiodo(calculadora.getEspumacomsiliconequantidadegastanoperiodo()*calculadora.getEspumacomsiliconeprecounitario1());

            ///->espumacomsiliconeeprata
            calculadora.setEspumacomsiliconeeprataquantidadegastanoperiodo(calculadora.getEspumacomsiliconeeprataquantidadegastanoperiodo() + barraQuantidaUsadadeespumacomsiliconeeprata_1);
            calculadora.setEspumacomsiliconeepratausado(barraQuantidaUsadadeespumacomsiliconeeprata_1);
            calculadora.setEspumacomsiliconeepratavalorgastonoperiodo(calculadora.getEspumacomsiliconeeprataquantidadegastanoperiodo()*calculadora.getEspumacomsiliconeeprataprecounitario1());

            ///->espumacomborda
            calculadora.setEspumacombordaquantidadegastanoperiodo(calculadora.getEspumacombordaquantidadegastanoperiodo() + barraQuantidaUsadadeespumacomborda_1);
            calculadora.setEspumacombordausado(barraQuantidaUsadadeespumacomborda_1);
            calculadora.setEspumacombordavalorgastonoperiodo(calculadora.getEspumacombordaquantidadegastanoperiodo()*calculadora.getEspumacombordaprecounitario1());

            ///->espumacombordasilicone
            calculadora.setEspumacombordasiliconequantidadegastanoperiodo(calculadora.getEspumacombordasiliconequantidadegastanoperiodo() + barraQuantidaUsadadeespumacombordasilicone_1);
            calculadora.setEspumacombordasiliconeusado(barraQuantidaUsadadeespumacombordasilicone_1);
            calculadora.setEspumacombordasiliconevalorgastonoperiodo(calculadora.getEspumacombordasiliconequantidadegastanoperiodo()*calculadora.getEspumacombordasiliconeprecounitario1());

            ///-> espumacombordasiliconeprata
            calculadora.setEspumacombordasiliconeprataquantidadegastanoperiodo(calculadora.getEspumacombordasiliconeprataquantidadegastanoperiodo() + barraQuantidaUsadadeespumacombordasiliconeprata_1);
            calculadora.setEspumacombordasiliconepratausado(barraQuantidaUsadadeespumacombordasiliconeprata_1);
            calculadora.setEspumacombordasiliconepratavalorgastonoperiodo(calculadora.getEspumacombordasiliconeprataquantidadegastanoperiodo()*calculadora.getEspumacombordasiliconeprataprecounitario1());

            ///-> hidrofibra
            calculadora.setHidrofibraquantidadegastanoperiodo(calculadora.getHidrofibraquantidadegastanoperiodo() + barraQuantidaUsadadehidrofibra_1);
            calculadora.setHidrofibrausado(barraQuantidaUsadadehidrofibra_1);
            calculadora.setHidrofibravalorgastonoperiodo(calculadora.getHidrofibraquantidadegastanoperiodo()*calculadora.getHidrofibraprecounitario1());

            ///->hidrofibraprata
            calculadora.setHidrofibraprataquantidadegastanoperiodo(calculadora.getHidrofibraquantidadegastanoperiodo() + barraQuantidaUsadadehidrofibraprata_1);
            calculadora.setHidrofibrapratausado(barraQuantidaUsadadehidrofibraprata_1);
            calculadora.setHidrofibrapratavalorgastonoperiodo(calculadora.getHidrofibraprataquantidadegastanoperiodo()*calculadora.getHidrofibraprataprecounitario1());

            ///->hidrogelb
            calculadora.setHidrogelbquantidadegastanoperiodo(calculadora.getHidrogelbquantidadegastanoperiodo() + barraQuantidaUsadadehidrogelb_1);
            calculadora.setHidrogelbusado(barraQuantidaUsadadehidrogelb_1);
            calculadora.setHidrogelbvalorgastonoperiodo(calculadora.getHidrogelbquantidadegastanoperiodo()*calculadora.getHidrogelbprecounitario1());

            ///->papaina
            calculadora.setPapainaquantidadegastanoperiodo(calculadora.getPapainaquantidadegastanoperiodo() + barraQuantidaUsadadepapaina_1);
            calculadora.setPapainausado(barraQuantidaUsadadepapaina_1);
            calculadora.setPapainavalorgastonoperiodo(calculadora.getPapainaquantidadegastanoperiodo()*calculadora.getPapainaprecounitario1());

            ///->sulfadiazinaprata
            calculadora.setSulfadiazinaprataquantidadegastanoperiodo(calculadora.getSulfadiazinaprataquantidadegastanoperiodo() + barraQuantidaUsadadesulfadiazinaprata_1);
            calculadora.setSulfadiazinapratausado(barraQuantidaUsadadesulfadiazinaprata_1);
            calculadora.setSulfadiazinapratavalorgastonoperiodo(calculadora.getSulfadiazinaprataquantidadegastanoperiodo()*calculadora.getSulfadiazinaprataprecounitario1());

            ///->kolagenase
            calculadora.setKolagenasequantidadegastanoperiodo(calculadora.getKolagenasequantidadegastanoperiodo() + barraQuantidaUsadadekolagenase_1);
            calculadora.setKolagenaseusado(barraQuantidaUsadadekolagenase_1);
            calculadora.setKolagenasevalorgastonoperiodo(calculadora.getKolagenasequantidadegastanoperiodo()*calculadora.getKolagenaseprecounitario1());

            ///->telapratananocristalinagetT
            calculadora.setTelapratananocristalinaquantidadegastanoperiodo(calculadora.getTelapratananocristalinaquantidadegastanoperiodo() + barraQuantidaUsadadetelapratananocristalina_1);
            calculadora.setTelapratananocristalinausado(barraQuantidaUsadadetelapratananocristalina_1);
            calculadora.setTelapratananocristalinavalorgastonoperiodo(calculadora.getTelapratananocristalinaquantidadegastanoperiodo()*calculadora.getTelapratananocristalinaprecounitario1());

            ///-> rayon
            calculadora.setRayonquantidadegastanoperiodo(calculadora.getRayonquantidadegastanoperiodo() + barraQuantidaUsadaderayon_1);
            calculadora.setRayonusado(barraQuantidaUsadaderayon_1);
            calculadora.setRayonvalorgastonoperiodo(calculadora.getRayonquantidadegastanoperiodo()*calculadora.getRayonprecounitario1());

            ///-> telanaderenteimpregnada
            calculadora.setTelanaderenteimpregnadaquantidadegastanoperiodo(calculadora.getTelanaderenteimpregnadaquantidadegastanoperiodo() + barraQuantidaUsadadetelanaderenteimpregnada_1);
            calculadora.setTelanaderenteimpregnadausado(barraQuantidaUsadadetelanaderenteimpregnada_1);
            calculadora.setTelanaderenteimpregnadavalorgastonoperiodo(calculadora.getTelanaderenteimpregnadaquantidadegastanoperiodo()*calculadora.getTelanaderenteimpregnadaprecounitario1());

            ///->carvao
            calculadora.setTelanaderenteimpregnadaquantidadegastanoperiodo(calculadora.getTelanaderenteimpregnadaquantidadegastanoperiodo() + barraQuantidaUsadadetelanaderenteimpregnada_1);
            calculadora.setTelanaderenteimpregnadausado(barraQuantidaUsadadetelanaderenteimpregnada_1);
            calculadora.setTelanaderenteimpregnadavalorgastonoperiodo(calculadora.getTelanaderenteimpregnadaquantidadegastanoperiodo()*calculadora.getTelanaderenteimpregnadaprecounitario1());

            ///->carvaoprata
            calculadora.setCarvaoprataquantidadegastanoperiodo(calculadora.getCarvaoprataquantidadegastanoperiodo() + barraQuantidaUsadadecarvaoprata_1);
            calculadora.setCarvaopratausado(barraQuantidaUsadadecarvaoprata_1);
            calculadora.setCarvaopratavalorgastonoperiodo(calculadora.getCarvaoprataquantidadegastanoperiodo()*calculadora.getCarvaoprataprecounitario1());

            ///->filmetransparente
            calculadora.setFilmetransparentequantidadegastanoperiodo(calculadora.getFilmetransparentequantidadegastanoperiodo() + barraQuantidaUsadadefilmetransparente_1);
            calculadora.setFilmetransparenteusado(barraQuantidaUsadadefilmetransparente_1);
            calculadora.setFilmetransparentevalorgastonoperiodo(calculadora.getFilmetransparentequantidadegastanoperiodo()*calculadora.getFilmetransparenteprecounitario1());

            ///->hidrocoloide
            calculadora.setHidrocoloidequantidadegastanoperiodo(calculadora.getHidrocoloidequantidadegastanoperiodo() + barraQuantidaUsadadehidrocoloide_1);
            calculadora.setHidrocoloideusado(barraQuantidaUsadadehidrocoloide_1);
            calculadora.setHidrocoloidevalorgastonoperiodo(calculadora.getHidrocoloidequantidadegastanoperiodo()*calculadora.getHidrocoloideprecounitario1());

            ///->protetorcutaneo
            calculadora.setProtetorcutaneoquantidadegastanoperiodo(calculadora.getProtetorcutaneoquantidadegastanoperiodo() + barraQuantidaUsadadeprotetorcutaneo_1);
            calculadora.setProtetorcutaneousado(barraQuantidaUsadadeprotetorcutaneo_1);
            calculadora.setProtetorcutaneovalorgastonoperiodo(calculadora.getProtetorcutaneoquantidadegastanoperiodo()*calculadora.getProtetorcutaneoprecounitario1());

            ///->gazeesteril
            calculadora.setGazeesterilquantidadegastanoperiodo(calculadora.getGazeesterilquantidadegastanoperiodo() + barraQuantidaUsadadegazeesteril_1);
            calculadora.setGazeesterilusado(barraQuantidaUsadadegazeesteril_1);
            calculadora.setGazeesterilvalorgastonoperiodo(calculadora.getGazeesterilquantidadegastanoperiodo()*calculadora.getGazeesterilprecounitario1());

            ///-> gazenesteril
            calculadora.setGazenesterilquantidadegastanoperiodo(calculadora.getGazenesterilquantidadegastanoperiodo() + barraQuantidaUsadadegazenesteril_1);
            calculadora.setGazenesterilusado(barraQuantidaUsadadegazenesteril_1);
            calculadora.setGazenesterilvalorgastonoperiodo(calculadora.getGazenesterilquantidadegastanoperiodo()*calculadora.getGazenesterilprecounitario1());

            ///-> atadura
            calculadora.setAtaduraquantidadegastanoperiodo(calculadora.getAtaduraquantidadegastanoperiodo() + barraQuantidaUsadadeatadura_1);
            calculadora.setAtadurausado(barraQuantidaUsadadeatadura_1);
            calculadora.setAtaduravalorgastonoperiodo(calculadora.getAtaduraquantidadegastanoperiodo()*calculadora.getAtaduraprecounitario1());

            ///->fitaadesiva
            calculadora.setFitaadesivaquantidadegastanoperiodo(calculadora.getFitaadesivaquantidadegastanoperiodo() + barraQuantidaUsadadefitaadesiva_1);
            calculadora.setFitaadesivausado(barraQuantidaUsadadefitaadesiva_1);
            calculadora.setFitaadesivavalorgastonoperiodo(calculadora.getFitaadesivaquantidadegastanoperiodo()*calculadora.getFitaadesivaprecounitario1());

            ///->rayon2
            calculadora.setRayon2quantidadegastanoperiodo(calculadora.getRayon2quantidadegastanoperiodo() + barraQuantidaUsadaderayon2_1);
            calculadora.setRayon2usado(barraQuantidaUsadaderayon2_1);
            calculadora.setRayon2valorgastonoperiodo(calculadora.getRayon2quantidadegastanoperiodo()*calculadora.getRayon2precounitario1());

            ///->chumaco
            calculadora.setChumacoquantidadegastanoperiodo(calculadora.getChumacoquantidadegastanoperiodo() + barraQuantidaUsadadechumaco_1);
            calculadora.setChumacousado(barraQuantidaUsadadechumaco_1);
            calculadora.setChumacovalorgastonoperiodo(calculadora.getChumacoquantidadegastanoperiodo()*calculadora.getChumacoprecounitario1());

            ///->compressaesteril
            calculadora.setCompressaesterilquantidadegastanoperiodo(calculadora.getCompressaesterilquantidadegastanoperiodo() + barraQuantidaUsadadecompressaesteril_1);
            calculadora.setCompressaesterilusado(barraQuantidaUsadadecompressaesteril_1);
            calculadora.setCompressaesterilvalorgastonoperiodo(calculadora.getCompressaesterilquantidadegastanoperiodo()*calculadora.getCompressaesterilprecounitario1());


            ///->espuma2
            calculadora.setEspuma2quantidadegastanoperiodo(calculadora.getEspuma2quantidadegastanoperiodo() + barraQuantidaUsadadeespuma2_1);
            calculadora.setEspuma2usado(barraQuantidaUsadadeespuma2_1);
            calculadora.setEspuma2valorgastonoperiodo(calculadora.getEspuma2quantidadegastanoperiodo()*calculadora.getEspuma2precounitario1());

            ///->filmetransparente2
            calculadora.setFilmetransparente2quantidadegastanoperiodo(calculadora.getFilmetransparente2quantidadegastanoperiodo() + barraQuantidaUsadadefilmetransparente2_1);
            calculadora.setFilmetransparente2usado(barraQuantidaUsadadefilmetransparente2_1);
            calculadora.setFilmetransparente2valorgastonoperiodo(calculadora.getFilmetransparente2quantidadegastanoperiodo()*calculadora.getFilmetransparente2precounitario1());


            ///-> pressaonegativacprata
            calculadora.setPressaonegativacprataquantidadegastanoperiodo(calculadora.getPressaonegativacprataquantidadegastanoperiodo() + barraQuantidaUsadadepressaonegativacprata_1);
            calculadora.setPressaonegativacpratausado(barraQuantidaUsadadepressaonegativacprata_1);
            calculadora.setPressaonegativacpratavalorgastonoperiodo(calculadora.getPressaonegativacprataquantidadegastanoperiodo()*calculadora.getPressaonegativacprataprecounitario1());


            ///-> pressaonegativasprata
            calculadora.setPressaonegativasprataquantidadegastanoperiodo(calculadora.getPressaonegativasprataquantidadegastanoperiodo() + barraQuantidaUsadadepressaonegativasprata_1);
            calculadora.setPressaonegativaspratausado(barraQuantidaUsadadepressaonegativasprata_1);
            calculadora.setPressaonegativaspratavalorgastonoperiodo(calculadora.getPressaonegativasprataquantidadegastanoperiodo()*calculadora.getPressaonegativasprataprecounitario1());


            ///->camahiperbarica
            calculadora.setCamahiperbaricaquantidadegastanoperiodo(calculadora.getCamahiperbaricaquantidadegastanoperiodo() + barraQuantidaUsadadecamahiperbarica_1);
            calculadora.setCamahiperbaricausado(barraQuantidaUsadadecamahiperbarica_1);
            calculadora.setCamahiperbaricavalorgastonoperiodo(calculadora.getCamahiperbaricaquantidadegastanoperiodo()*calculadora.getCamahiperbaricaprecounitario1());


            ///->laserterapia
            calculadora.setLaserterapiaquantidadegastanoperiodo(calculadora.getLaserterapiaquantidadegastanoperiodo() + barraQuantidaUsadadelaserterapia_1);
            calculadora.setLaserterapiausado(barraQuantidaUsadadelaserterapia_1);
            calculadora.setLaserterapiavalorgastonoperiodo(calculadora.getLaserterapiaquantidadegastanoperiodo()*calculadora.getLaserterapiaprecounitario1());


            ///->desbridamentocirurgico
            calculadora.setDesbridamentocirurgicoquantidadegastanoperiodo(calculadora.getDesbridamentocirurgicoquantidadegastanoperiodo() + barraQuantidaUsadadedesbridamentocirurgico_1);
            calculadora.setDesbridamentocirurgicousado(barraQuantidaUsadadedesbridamentocirurgico_1);
            calculadora.setDesbridamentocirurgicovalorgastonoperiodo(calculadora.getDesbridamentocirurgicoquantidadegastanoperiodo()*calculadora.getDesbridamentocirurgicoprecounitario1());



            ///->taxadesala
            calculadora.setTaxadesalaquantidadegastanoperiodo(calculadora.getTaxadesalaquantidadegastanoperiodo() + barraQuantidaUsadadetaxadesala_1);
            calculadora.setTaxadesalausado(barraQuantidaUsadadetaxadesala_1);
            calculadora.setTaxadesalavalorgastonoperiodo(calculadora.getTaxadesalaquantidadegastanoperiodo()*calculadora.getTaxadesalaprecounitario1());


            ///->analgesicoantiinflamatorio
            calculadora.setAnalgesicoantiinflamatorioquantidadegastanoperiodo(calculadora.getAnalgesicoantiinflamatorioquantidadegastanoperiodo() + barraQuantidaUsadadeanalgesicoantiinflamatorio_1);
            calculadora.setAnalgesicoantiinflamatoriousado(barraQuantidaUsadadeanalgesicoantiinflamatorio_1);
            calculadora.setAnalgesicoantiinflamatoriovalorgastonoperiodo(calculadora.getAnalgesicoantiinflamatorioquantidadegastanoperiodo()*calculadora.getAnalgesicoantiinflamatorioprecounitario1());



            ///->analgesico
            calculadora.setAnalgesicoquantidadegastanoperiodo(calculadora.getAnalgesicoquantidadegastanoperiodo() + barraQuantidaUsadadeanalgesico_1);
            calculadora.setAnalgesicousado(barraQuantidaUsadadeanalgesico_1);
            calculadora.setAnalgesicovalorgastonoperiodo(calculadora.getAnalgesicoquantidadegastanoperiodo()*calculadora.getAnalgesicoprecounitario1());

            ///-> antibiotico
            calculadora.setAntibioticoquantidadegastanoperiodo(calculadora.getAntibioticoquantidadegastanoperiodo() + barraQuantidaUsadadeantibiotico_1);
            calculadora.setAntibioticousado(barraQuantidaUsadadeantibiotico_1);
            calculadora.setAntibioticovalorgastonoperiodo(calculadora.getAntibioticoquantidadegastanoperiodo()*calculadora.getAntibioticoprecounitario1());


            ///-> tecnicoenfermenfermeirom
            calculadora.setTecnicoenfermenfermeiromquantidadegastanoperiodo(calculadora.getTecnicoenfermenfermeiromquantidadegastanoperiodo() + barraQuantidaUsadadetecnicoenfermenfermeirom_1);
            calculadora.setTecnicoenfermenfermeiromusado(barraQuantidaUsadadetecnicoenfermenfermeirom_1);
            calculadora.setTecnicoenfermenfermeiromvalorgastonoperiodo(calculadora.getTecnicoenfermenfermeiromquantidadegastanoperiodo()*calculadora.getTecnicoenfermenfermeiromprecounitario1());


            ///->enfermeiro
            calculadora.setEnfermeiroquantidadegastanoperiodo(calculadora.getEnfermeiroquantidadegastanoperiodo() + barraQuantidaUsadadeenfermeiro_1);
            calculadora.setEnfermeirousado(barraQuantidaUsadadeenfermeiro_1);
            calculadora.setEnfermeirovalorgastonoperiodo(calculadora.getEnfermeiroquantidadegastanoperiodo()*calculadora.getEnfermeiroprecounitario1());


            ///->enfermeiroespecialista
            calculadora.setEnfermeiroespecialistaquantidadegastanoperiodo(calculadora.getEnfermeiroespecialistaquantidadegastanoperiodo() + barraQuantidaUsadadeenfermeiroespecialista_1);
            calculadora.setEnfermeiroespecialistausado(barraQuantidaUsadadeenfermeiroespecialista_1);
            calculadora.setEnfermeiroespecialistavalorgastonoperiodo(calculadora.getEnfermeiroespecialistaquantidadegastanoperiodo()*calculadora.getEnfermeiroespecialistaprecounitario1());



            ///->medico
            calculadora.setMedicoquantidadegastanoperiodo(calculadora.getMedicoquantidadegastanoperiodo() + barraQuantidaUsadademedico_1);
            calculadora.setMedicousado(barraQuantidaUsadademedico_1);
            calculadora.setMedicovalorgastonoperiodo(calculadora.getMedicoquantidadegastanoperiodo()*calculadora.getMedicoprecounitario1());



            return calculadora;
        }

}


//////////
/*

                ///-> PEGA O VALOR DO MEDICAMENTO E CONVERTE PARA INT
                String sTextFromET = valorsf.getText().toString();
                int valorsfINT = new Integer(sTextFromET).intValue();
                String aux2 = valoralginatocomprata.getText().toString();
                int valoralginatocomprataINT = new Integer(aux2).intValue();


                Calculadora calculadora = new Calculadora();
                CalculadoraDAO dao = new CalculadoraDAO(this);

                Paciente paciente = (Paciente)getIntent().getSerializableExtra("paciente");// RECEBENDO O PACIENTE DE OUTRA TELA


                calculadora.setPaciente(paciente.getNome());
                calculadora.setIdPaciente(paciente.getId());

                calculadora = dao.buscaPacientesComCalculadora(calculadora);
                calculadora.setSfprecounitario1(valorsfINT);

                dao.insere(calculadora);
                Toast.makeText(CalculadoraActivity.this,"usado "+calculadora.getSfusado()+" dias "+calculadora.getSfdias(),Toast.LENGTH_LONG).show();
                dao.close();

                finish();



*////////////////






/*
switch (item.getItemId())
        {
            case R.id.menu_menu_ok:
                Calculadora calculadora = new Calculadora();
                CalculadoraDAO dao = new CalculadoraDAO(this);

                Paciente paciente = (Paciente) getIntent().getSerializableExtra("paciente");// RECEBENDO O PACIENTE DE OUTRA TELA

                calculadora.setIdPaciente(paciente.getId());
                calculadora.setSfdias(calculadora.getSfdias()+1);

                calculadora.setPaciente(paciente.getNome());
                calculadora.setIdPaciente(paciente.getId());

                calculadora = dao.buscaPacientesComCalculadora(calculadora);

                if (calculadora.getIdCalculadora() == 0){

                    calculadora.setSfquantidadegastanoperiodo(calculadora.getSfquantidadegastanoperiodo()+barraQuantidaUsadadeSF_1);
                    calculadora.setSfusado(barraQuantidaUsadadeSF_1);

                    calculadora.setSfvalorgastonoperiodo(calculadora.getSfquantidadegastanoperiodo()*calculadora.getSfprecounitario1());

                    dao.insere(calculadora);
                    dao.atualizaTodosOsPrecosUnitarios();
                }if (calculadora.getIdCalculadora() == 1){

                    calculadora.setIdPaciente(paciente.getId());
                    calculadora.setSfdias(calculadora.getSfdias()+1);
                    calculadora.setPaciente(paciente.getNome());
                    calculadora.setIdPaciente(paciente.getId());

                    calculadora.setSfquantidadegastanoperiodo(calculadora.getSfquantidadegastanoperiodo()+barraQuantidaUsadadeSF_1);
                    calculadora.setSfusado(barraQuantidaUsadadeSF_1);

                    calculadora.setSfvalorgastonoperiodo(calculadora.getSfquantidadegastanoperiodo()*calculadora.getSfprecounitario1());

                    dao.atualizaPaciente(calculadora);
                    dao.atualizaTodosOsPrecosUnitarios();
                }if (calculadora.getIdCalculadora() > 0 && calculadora.getIdCalculadora() != 1){

                    calculadora.setSfquantidadegastanoperiodo(calculadora.getSfquantidadegastanoperiodo()+barraQuantidaUsadadeSF_1);
                    calculadora.setSfusado(barraQuantidaUsadadeSF_1);

                    calculadora.setSfvalorgastonoperiodo(calculadora.getSfquantidadegastanoperiodo()*calculadora.getSfprecounitario1());

                    dao.atualizaPaciente(calculadora);
                    dao.atualizaTodosOsPrecosUnitarios();
                }
                //Toast.makeText(CalculadoraActivity.this,"usado "+calculadora.getSfusado()+" dias "+calculadora.getSfdias(),Toast.LENGTH_LONG).show();
                dao.close();
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
/////////////////////////////////////////////////////////////////////////////////

  switch (item.getItemId())
        {
            case R.id.menu_menu_ok:

                String sTextFromET = valorsf.getText().toString();
                int valorsfINT = new Integer(sTextFromET).intValue();

                Calculadora calculadora = new Calculadora();
                CalculadoraDAO dao = new CalculadoraDAO(this);

                Paciente paciente = (Paciente)getIntent().getSerializableExtra("paciente");// RECEBENDO O PACIENTE DE OUTRA TELA

                calculadora.setIdPaciente(paciente.getId());
                calculadora.setSfdias(calculadora.getSfdias() + 1);

                calculadora.setPaciente(paciente.getNome());
                calculadora.setIdPaciente(paciente.getId());

                calculadora = dao.buscaPacientesComCalculadora(calculadora);

                if (calculadora.getIdCalculadora() == 0) {

                    calculadora.setSfquantidadegastanoperiodo(calculadora.getSfquantidadegastanoperiodo() + barraQuantidaUsadadeSF_1);
                    calculadora.setSfusado(barraQuantidaUsadadeSF_1);

                    calculadora.setSfvalorgastonoperiodo(calculadora.getSfquantidadegastanoperiodo()*valorsfINT);
                    calculadora.setSfprecounitario1(valorsfINT);
                    dao.insere(calculadora);
                    Toast.makeText(CalculadoraActivity.this,"Paciente INSERE "+calculadora.getSfprecounitario1(),Toast.LENGTH_LONG).show();
                    //dao.atualizaTodosOsPrecosUnitarios();
                }if (calculadora.getIdCalculadora() == 1) {

                calculadora.setIdPaciente(paciente.getId());
                calculadora.setSfdias(calculadora.getSfdias() + 1);
                calculadora.setPaciente(paciente.getNome());
                calculadora.setIdPaciente(paciente.getId());

                calculadora.setSfquantidadegastanoperiodo(calculadora.getSfquantidadegastanoperiodo() + barraQuantidaUsadadeSF_1);
                calculadora.setSfusado(barraQuantidaUsadadeSF_1);

                calculadora.setSfvalorgastonoperiodo(calculadora.getSfquantidadegastanoperiodo()*valorsfINT);
                calculadora.setSfprecounitario1(valorsfINT);
                dao.atualizaPaciente(calculadora);
                Toast.makeText(CalculadoraActivity.this,"Paciente ATUALIZA1111 "+calculadora.getSfprecounitario1(),Toast.LENGTH_LONG).show();
                //dao.atualizaTodosOsPrecosUnitarios();
            }if (calculadora.getIdCalculadora() > 0 && calculadora.getIdCalculadora() != 1) {

                calculadora.setSfquantidadegastanoperiodo(calculadora.getSfquantidadegastanoperiodo() + barraQuantidaUsadadeSF_1);
                calculadora.setSfusado(barraQuantidaUsadadeSF_1);

                calculadora.setSfvalorgastonoperiodo(calculadora.getSfquantidadegastanoperiodo()*valorsfINT);
                calculadora.setSfprecounitario1(valorsfINT);
                dao.atualizaPaciente(calculadora);
                Toast.makeText(CalculadoraActivity.this,"Paciente ATUALIZA2222 "+calculadora.getSfprecounitario1(),Toast.LENGTH_LONG).show();
                //dao.atualizaTodosOsPrecosUnitarios();
            }
                //Toast.makeText(CalculadoraActivity.this,"usado "+calculadora.getSfusado()+" dias "+calculadora.getSfdias(),Toast.LENGTH_LONG).show();
                dao.close();
                //Toast.makeText(CalculadoraActivity.this,"Paciente "+calculadora.getSfprecounitario1(),Toast.LENGTH_LONG).show();

                finish();
                   break;
        }
        return super.onOptionsItemSelected(item);
 */