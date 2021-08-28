package com.example.pedro.prottipo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.pedro.prottipo1.modelo.Paciente;

public class LocalizacaoDaLPActivity extends AppCompatActivity {

    boolean auxb=false;
    boolean auxb2=false;
    boolean auxb3=false;
    boolean auxb4=false;
    boolean auxb5=false;
    boolean auxb6=false;
    boolean auxb7=false;
    boolean auxb8=false;
    boolean auxb9=false;
    boolean auxb10=false;

    boolean auxb11=false;
    boolean auxb12=false;
    boolean auxb13=false;
    boolean auxb14=false;
    boolean auxb15=false;
    boolean auxb16=false;
    boolean auxb17=false;
    boolean auxb18=false;
    boolean auxb19=false;
    boolean auxb20=false;

    boolean auxb21=false;
    boolean auxb22=false;
    boolean auxb23=false;
    boolean auxb24=false;
    boolean auxb25=false;
    boolean auxb26=false;
    boolean auxb27=false;
    boolean auxb28=false;
    boolean auxb29=false;
    boolean auxb30=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localizacao_da_lp);

        final RadioButton aux=(RadioButton)findViewById(R.id.radioButton);
        final RadioButton aux2=(RadioButton)findViewById(R.id.radioButton2);
        final RadioButton aux3=(RadioButton)findViewById(R.id.radioButton3);
        final RadioButton aux4=(RadioButton)findViewById(R.id.radioButton4);
        final RadioButton aux5=(RadioButton)findViewById(R.id.radioButton5);
        final RadioButton aux6=(RadioButton)findViewById(R.id.radioButton6);
        final RadioButton aux7=(RadioButton)findViewById(R.id.radioButton7);
        final RadioButton aux8=(RadioButton)findViewById(R.id.radioButton8);
        final RadioButton aux9=(RadioButton)findViewById(R.id.radioButton9);
        final RadioButton aux10=(RadioButton)findViewById(R.id.radioButton10);

        final RadioButton aux11=(RadioButton)findViewById(R.id.radioButton11);
        final RadioButton aux12=(RadioButton)findViewById(R.id.radioButton12);
        final RadioButton aux13=(RadioButton)findViewById(R.id.radioButton13);
        final RadioButton aux14=(RadioButton)findViewById(R.id.radioButton14);
        final RadioButton aux15=(RadioButton)findViewById(R.id.radioButton15);
        final RadioButton aux16=(RadioButton)findViewById(R.id.radioButton16);
        final RadioButton aux17=(RadioButton)findViewById(R.id.radioButton17);
        final RadioButton aux18=(RadioButton)findViewById(R.id.radioButton18);
        final RadioButton aux19=(RadioButton)findViewById(R.id.radioButton19);
        final RadioButton aux20=(RadioButton)findViewById(R.id.radioButton20);

        final RadioButton aux21=(RadioButton)findViewById(R.id.radioButton21);
        final RadioButton aux22=(RadioButton)findViewById(R.id.radioButton22);
        final RadioButton aux23=(RadioButton)findViewById(R.id.radioButton23);
        final RadioButton aux24=(RadioButton)findViewById(R.id.radioButton24);
        final RadioButton aux25=(RadioButton)findViewById(R.id.radioButton25);
        final RadioButton aux26=(RadioButton)findViewById(R.id.radioButton26);
        final RadioButton aux27=(RadioButton)findViewById(R.id.radioButton27);
        final RadioButton aux28=(RadioButton)findViewById(R.id.radioButton28);
        final RadioButton aux29=(RadioButton)findViewById(R.id.radioButton29);
        final RadioButton aux30=(RadioButton)findViewById(R.id.radioButton30);

        final Button exitbtn=(Button)findViewById(R.id.exitbtn);

        final Paciente paciente = (Paciente) getIntent().getSerializableExtra("paciente");// RECEBENDO O PACIENTE DE OUTRA TELA
        final int[] i = {Integer.parseInt(paciente.getQuantidadeLP())};


        aux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(auxb)
               {
                   auxb=false;
                   aux.setChecked(false);
               }else {auxb=true;}
                i[0] = i[0] -1;
                //Toast.makeText(LocalizacaoDaLPActivity.this,"xablau "+paciente.getQuantidadeLP()+" - "+i[0],Toast.LENGTH_LONG).show();
                // aux2.setChecked(false);
                //Toast.makeText(LocalizacaoDaLPActivity.this,"OK "+aux2.isChecked(),Toast.LENGTH_LONG).show();
            }
        });

        aux2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(auxb2)
                {
                    auxb2=false;
                    aux2.setChecked(false);
                }else {auxb2=true;}
                i[0] = i[0] -1;
             }
        });

        aux3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(auxb3)
                {
                    auxb3=false;
                    aux3.setChecked(false);
                }else {auxb3=true;}
                i[0] = i[0] -1;
            }
        });
        aux4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(auxb4)
                {
                    auxb4=false;
                    aux4.setChecked(false);
                }else {auxb4=true;}
                i[0] = i[0] -1;
            }
        });

        aux5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb5)
                {
                    auxb5 = false;
                    aux5.setChecked(false);
                }
                else { auxb5 = true; }
                i[0] = i[0] -1;
            }
        });

        aux6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb6)
                {
                    auxb6 = false;
                    aux6.setChecked(false);
                }
                else { auxb6 = true; }
                i[0] = i[0] -1;
            }
        });
        aux7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb7)
                {
                    auxb7 = false;
                    aux7.setChecked(false);
                }
                else { auxb7 = true; }
            }
        });
        aux8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb8)
                {
                    auxb8 = false;
                    aux8.setChecked(false);
                }
                else { auxb8 = true; }
            }
        });

        aux9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb9)
                {
                    auxb9 = false;
                    aux9.setChecked(false);
                }
                else { auxb9 = true; }
            }
        });
        aux10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb10)
                {
                    auxb10 = false;
                    aux10.setChecked(false);
                }
                else { auxb10 = true; }
            }
        });

        aux11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb11)
                {
                    auxb11 = false;
                    aux11.setChecked(false);
                }
                else { auxb11 = true; }
            }
        });

        aux12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb12)
                {
                    auxb12 = false;
                    aux12.setChecked(false);
                }
                else { auxb12 = true; }
            }
        });
        aux13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb13)
                {
                    auxb13 = false;
                    aux13.setChecked(false);
                }
                else { auxb13 = true; }
            }
        });
        aux14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb14)
                {
                    auxb14 = false;
                    aux14.setChecked(false);
                }
                else { auxb14 = true; }
            }
        });

        aux15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb15)
                {
                    auxb15 = false;
                    aux15.setChecked(false);
                }
                else { auxb15 = true; }
            }
        });
        aux16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb16)
                {
                    auxb16 = false;
                    aux16.setChecked(false);
                }
                else { auxb16 = true; }
            }
        });

        aux17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb17)
                {
                    auxb17 = false;
                    aux17.setChecked(false);
                }
                else { auxb17 = true; }
            }
        });

        aux18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb18)
                {
                    auxb18 = false;
                    aux18.setChecked(false);
                }
                else { auxb18 = true; }
            }
        });
        aux19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb19)
                {
                    auxb19 = false;
                    aux19.setChecked(false);
                }
                else { auxb19 = true; }
            }
        });
        aux20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb20)
                {
                    auxb20 = false;
                    aux20.setChecked(false);
                }
                else { auxb20 = true; }
            }
        });

        aux21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb21)
                {
                    auxb21 = false;
                    aux21.setChecked(false);
                }
                else { auxb21 = true; }
            }
        });
        aux22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb22)
                {
                    auxb22 = false;
                    aux22.setChecked(false);
                }
                else { auxb22 = true; }
            }
        });

        aux23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb23)
                {
                    auxb23 = false;
                    aux23.setChecked(false);
                }
                else { auxb23 = true; }
            }
        });

        aux24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb24)
                {
                    auxb24 = false;
                    aux24.setChecked(false);
                }
                else { auxb24 = true; }
            }
        });
        aux25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb25)
                {
                    auxb25 = false;
                    aux25.setChecked(false);
                }
                else { auxb25 = true; }
            }
        });
        aux26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb26)
                {
                    auxb26 = false;
                    aux26.setChecked(false);
                }
                else { auxb26 = true; }
            }
        });

        aux27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb27)
                {
                    auxb27 = false;
                    aux27.setChecked(false);
                }
                else { auxb27 = true; }
            }
        });
        aux28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb28)
                {
                    auxb28 = false;
                    aux28.setChecked(false);
                }
                else { auxb28 = true; }
            }
        });

        aux29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb29)
                {
                    auxb29 = false;
                    aux29.setChecked(false);
                }
                else { auxb29 = true; }
            }
        });

        aux30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (auxb30)
                {
                    auxb30 = false;
                    aux30.setChecked(false);
                }
                else { auxb30 = true; }
            }
        });

exitbtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        final String[] locais = new String[1];
        //if (i[0]<=0){
            if(aux.isChecked())
                locais[0]=locais[0]+"-posicao1-";
            ///-> colocar os outros AUX:
            if(aux2.isChecked())
                locais[0]=locais[0]+"-posicao2-";
            if(aux3.isChecked())
                locais[0]=locais[0]+"-posicao3-";
            if(aux4.isChecked())
                locais[0]=locais[0]+"-posicao4-";
            if(aux5.isChecked())
                locais[0]=locais[0]+"-posicao5-";
            if(aux6.isChecked())
                locais[0]=locais[0]+"-posicao6-";
            if(aux7.isChecked())
                locais[0]=locais[0]+"-posicao7-";
            if(aux8.isChecked())
                locais[0]=locais[0]+"-posicao8-";
            if(aux9.isChecked())
                locais[0]=locais[0]+"-posicao9-";
            if(aux10.isChecked())
                locais[0]=locais[0]+"-posicao10-";
            if (aux11.isChecked())
                locais[0] = locais[0] + "-posicao11-";
            if (aux12.isChecked())
                locais[0] = locais[0] + "-posicao12-";
            if (aux13.isChecked())
                locais[0] = locais[0] + "-posicao13-";
            if (aux14.isChecked())
                locais[0] = locais[0] + "-posicao14-";
            if (aux15.isChecked())
                locais[0] = locais[0] + "-posicao15-";
            if (aux16.isChecked())
                locais[0] = locais[0] + "-posicao16-";
            if (aux17.isChecked())
                locais[0] = locais[0] + "-posicao17-";
            if (aux18.isChecked())
                locais[0] = locais[0] + "-posicao18-";
            if (aux19.isChecked())
                locais[0] = locais[0] + "-posicao19-";
            if (aux20.isChecked())
                locais[0] = locais[0] + "-posicao20-";
            if (aux21.isChecked())
                locais[0] = locais[0] + "-posicao21-";
            if (aux22.isChecked())
                locais[0] = locais[0] + "-posicao22-";
            if (aux23.isChecked())
                locais[0] = locais[0] + "-posicao23-";
            if (aux24.isChecked())
                locais[0] = locais[0] + "-posicao24-";
            if (aux25.isChecked())
                locais[0] = locais[0] + "-posicao25-";
            if (aux26.isChecked())
                locais[0] = locais[0] + "-posicao26-";
            if (aux27.isChecked())
                locais[0] = locais[0] + "-posicao27-";
            if (aux28.isChecked())
                locais[0] = locais[0] + "-posicao28-";
            if (aux29.isChecked())
                locais[0] = locais[0] + "-posicao29-";
            if (aux30.isChecked())
                locais[0] = locais[0] + "-posicao30-";
       // }
        Intent resultado = new Intent();
        resultado.putExtra("resultadolocal", locais[0]);
        //Toast.makeText(LocalizacaoDaLPActivity.this,"nutela "+i[0],Toast.LENGTH_LONG).show();
        setResult(3, resultado);
        finish();
    }
});


    }
}
