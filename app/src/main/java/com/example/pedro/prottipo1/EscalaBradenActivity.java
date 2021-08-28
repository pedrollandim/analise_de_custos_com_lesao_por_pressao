package com.example.pedro.prottipo1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.example.pedro.prottipo1.dao.PacienteDAO;
import com.example.pedro.prottipo1.modelo.Paciente;


public class EscalaBradenActivity extends AppCompatActivity {

    Paciente paciente2 = (Paciente) new Paciente();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escala_braden);

        final Paciente paciente = (Paciente) getIntent().getSerializableExtra("paciente");// RECEBENDO O PACIENTE DE OUTRA TELA
        paciente2=paciente;
       // if(paciente.getId()!=0)
        //Toast.makeText(EscalaBradenActivity.this," "+paciente.getNome()+" "+paciente.getId(),Toast.LENGTH_LONG).show();


        final Switch escala_braden_ps_1= (Switch) findViewById(R.id.escala_braden_ps_1);
        final Switch escala_braden_ps_2= (Switch) findViewById(R.id.escala_braden_ps_2);
        final Switch escala_braden_ps_3= (Switch) findViewById(R.id.escala_braden_ps_3);
        final Switch escala_braden_ps_4= (Switch) findViewById(R.id.escala_braden_ps_4);


        escala_braden_ps_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    escala_braden_ps_2.setChecked(false);
                    escala_braden_ps_3.setChecked(false);
                    escala_braden_ps_4.setChecked(false);

                }
            }
        });

        escala_braden_ps_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    escala_braden_ps_1.setChecked(false);
                    escala_braden_ps_3.setChecked(false);
                    escala_braden_ps_4.setChecked(false);
                }
            }
        });

        escala_braden_ps_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    escala_braden_ps_1.setChecked(false);
                    escala_braden_ps_2.setChecked(false);
                    escala_braden_ps_4.setChecked(false);
                }
            }
        });

        escala_braden_ps_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    escala_braden_ps_1.setChecked(false);
                    escala_braden_ps_2.setChecked(false);
                    escala_braden_ps_3.setChecked(false);
                }
            }
        });


        final Switch escala_braden_u_1= (Switch) findViewById(R.id.escala_braden_u_1);
        final Switch escala_braden_u_2= (Switch) findViewById(R.id.escala_braden_u_2);
        final Switch escala_braden_u_3= (Switch) findViewById(R.id.escala_braden_u_3);
        final Switch escala_braden_u_4= (Switch) findViewById(R.id.escala_braden_u_4);


        escala_braden_u_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    escala_braden_u_2.setChecked(false);
                    escala_braden_u_3.setChecked(false);
                    escala_braden_u_4.setChecked(false);

                }
            }
        });

        escala_braden_u_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    escala_braden_u_1.setChecked(false);
                    escala_braden_u_3.setChecked(false);
                    escala_braden_u_4.setChecked(false);
                }
            }
        });

        escala_braden_u_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    escala_braden_u_1.setChecked(false);
                    escala_braden_u_2.setChecked(false);
                    escala_braden_u_4.setChecked(false);
                }
            }
        });

        escala_braden_u_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    escala_braden_u_1.setChecked(false);
                    escala_braden_u_2.setChecked(false);
                    escala_braden_u_3.setChecked(false);
                }
            }
        });


        final Switch escala_braden_at_1= (Switch) findViewById(R.id.escala_braden_at_1);
        final Switch escala_braden_at_2= (Switch) findViewById(R.id.escala_braden_at_2);
        final Switch escala_braden_at_3= (Switch) findViewById(R.id.escala_braden_at_3);
        final Switch escala_braden_at_4= (Switch) findViewById(R.id.escala_braden_at_4);

        escala_braden_at_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    escala_braden_at_2.setChecked(false);
                    escala_braden_at_3.setChecked(false);
                    escala_braden_at_4.setChecked(false);
                }
            }
        });

        escala_braden_at_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    escala_braden_at_1.setChecked(false);
                    escala_braden_at_3.setChecked(false);
                    escala_braden_at_4.setChecked(false);
                }
            }
        });

        escala_braden_at_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    escala_braden_at_1.setChecked(false);
                    escala_braden_at_2.setChecked(false);
                    escala_braden_at_4.setChecked(false);
                }
            }
        });

        escala_braden_at_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    escala_braden_at_1.setChecked(false);
                    escala_braden_at_2.setChecked(false);
                    escala_braden_at_3.setChecked(false);
                }
            }
        });

        final Switch escala_braden_m_1= (Switch) findViewById(R.id.escala_braden_m_1);
        final Switch escala_braden_m_2= (Switch) findViewById(R.id.escala_braden_m_2);
        final Switch escala_braden_m_3= (Switch) findViewById(R.id.escala_braden_m_3);
        final Switch escala_braden_m_4= (Switch) findViewById(R.id.escala_braden_m_4);

        escala_braden_m_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    escala_braden_m_2.setChecked(false);
                    escala_braden_m_3.setChecked(false);
                    escala_braden_m_4.setChecked(false);
                }
            }
        });

        escala_braden_m_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    escala_braden_m_1.setChecked(false);
                    escala_braden_m_3.setChecked(false);
                    escala_braden_m_4.setChecked(false);
                }
            }
        });

        escala_braden_m_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    escala_braden_m_1.setChecked(false);
                    escala_braden_m_2.setChecked(false);
                    escala_braden_m_4.setChecked(false);
                }
            }
        });

        escala_braden_m_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    escala_braden_m_1.setChecked(false);
                    escala_braden_m_2.setChecked(false);
                    escala_braden_m_3.setChecked(false);
                }
            }
        });



        final Switch escala_braden_n_1= (Switch) findViewById(R.id.escala_braden_n_1);
        final Switch escala_braden_n_2= (Switch) findViewById(R.id.escala_braden_n_2);
        final Switch escala_braden_n_3= (Switch) findViewById(R.id.escala_braden_n_3);
        final Switch escala_braden_n_4= (Switch) findViewById(R.id.escala_braden_n_4);



        escala_braden_n_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    escala_braden_n_2.setChecked(false);
                    escala_braden_n_3.setChecked(false);
                    escala_braden_n_4.setChecked(false);
                }
            }
        });

        escala_braden_n_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    escala_braden_n_1.setChecked(false);
                    escala_braden_n_3.setChecked(false);
                    escala_braden_n_4.setChecked(false);
                }
            }
        });

        escala_braden_n_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    escala_braden_n_1.setChecked(false);
                    escala_braden_n_2.setChecked(false);
                    escala_braden_n_4.setChecked(false);
                }
            }
        });

        escala_braden_n_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    escala_braden_n_1.setChecked(false);
                    escala_braden_n_2.setChecked(false);
                    escala_braden_n_3.setChecked(false);
                }
            }
        });

        final Switch escala_braden_fc_1= (Switch) findViewById(R.id.escala_braden_fc_1);
        final Switch escala_braden_fc_2= (Switch) findViewById(R.id.escala_braden_fc_2);
        final Switch escala_braden_fc_3= (Switch) findViewById(R.id.escala_braden_fc_3);

        escala_braden_fc_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    escala_braden_fc_2.setChecked(false);
                    escala_braden_fc_3.setChecked(false);
                }
            }
        });

        escala_braden_fc_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    escala_braden_fc_1.setChecked(false);
                    escala_braden_fc_3.setChecked(false);
                }
            }
        });

        escala_braden_fc_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    escala_braden_fc_1.setChecked(false);
                    escala_braden_fc_2.setChecked(false);
                }
            }
        });


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
                //Toast.makeText(EscalaBradenActivity.this,"Saindo.",Toast.LENGTH_LONG).show();
                final Switch escala_braden_ps_1= (Switch) findViewById(R.id.escala_braden_ps_1);
                final Switch escala_braden_ps_2= (Switch) findViewById(R.id.escala_braden_ps_2);
                final Switch escala_braden_ps_3= (Switch) findViewById(R.id.escala_braden_ps_3);
                final Switch escala_braden_ps_4= (Switch) findViewById(R.id.escala_braden_ps_4);

                final Switch escala_braden_u_1= (Switch) findViewById(R.id.escala_braden_u_1);
                final Switch escala_braden_u_2= (Switch) findViewById(R.id.escala_braden_u_2);
                final Switch escala_braden_u_3= (Switch) findViewById(R.id.escala_braden_u_3);
                final Switch escala_braden_u_4= (Switch) findViewById(R.id.escala_braden_u_4);

                final Switch escala_braden_at_1= (Switch) findViewById(R.id.escala_braden_at_1);
                final Switch escala_braden_at_2= (Switch) findViewById(R.id.escala_braden_at_2);
                final Switch escala_braden_at_3= (Switch) findViewById(R.id.escala_braden_at_3);
                final Switch escala_braden_at_4= (Switch) findViewById(R.id.escala_braden_at_4);

                final Switch escala_braden_m_1= (Switch) findViewById(R.id.escala_braden_m_1);
                final Switch escala_braden_m_2= (Switch) findViewById(R.id.escala_braden_m_2);
                final Switch escala_braden_m_3= (Switch) findViewById(R.id.escala_braden_m_3);
                final Switch escala_braden_m_4= (Switch) findViewById(R.id.escala_braden_m_4);

                final Switch escala_braden_n_1= (Switch) findViewById(R.id.escala_braden_n_1);
                final Switch escala_braden_n_2= (Switch) findViewById(R.id.escala_braden_n_2);
                final Switch escala_braden_n_3= (Switch) findViewById(R.id.escala_braden_n_3);
                final Switch escala_braden_n_4= (Switch) findViewById(R.id.escala_braden_n_4);

                final Switch escala_braden_fc_1= (Switch) findViewById(R.id.escala_braden_fc_1);
                final Switch escala_braden_fc_2= (Switch) findViewById(R.id.escala_braden_fc_2);
                final Switch escala_braden_fc_3= (Switch) findViewById(R.id.escala_braden_fc_3);

                int escala_braden_soma=0;

                if(escala_braden_ps_1.isChecked()==true){ escala_braden_soma=1;}
                if(escala_braden_ps_2.isChecked()==true){ escala_braden_soma=2;}
                if(escala_braden_ps_3.isChecked()==true){ escala_braden_soma=3;}
                if(escala_braden_ps_4.isChecked()==true){ escala_braden_soma=4;}

                if(escala_braden_u_1.isChecked()==true){ escala_braden_soma=escala_braden_soma+1;}
                if(escala_braden_u_2.isChecked()==true){ escala_braden_soma=escala_braden_soma+2;}
                if(escala_braden_u_3.isChecked()==true){ escala_braden_soma=escala_braden_soma+3;}
                if(escala_braden_u_4.isChecked()==true){ escala_braden_soma=escala_braden_soma+4;}

                if(escala_braden_at_1.isChecked()==true){ escala_braden_soma=escala_braden_soma+1;}
                if(escala_braden_at_2.isChecked()==true){ escala_braden_soma=escala_braden_soma+2;}
                if(escala_braden_at_3.isChecked()==true){ escala_braden_soma=escala_braden_soma+3;}
                if(escala_braden_at_4.isChecked()==true){ escala_braden_soma=escala_braden_soma+4;}

                if(escala_braden_m_1.isChecked()==true){ escala_braden_soma=escala_braden_soma+1;}
                if(escala_braden_m_2.isChecked()==true){ escala_braden_soma=escala_braden_soma+2;}
                if(escala_braden_m_3.isChecked()==true){ escala_braden_soma=escala_braden_soma+3;}
                if(escala_braden_m_4.isChecked()==true){ escala_braden_soma=escala_braden_soma+4;}

                if(escala_braden_n_1.isChecked()==true){ escala_braden_soma=escala_braden_soma+1;}
                if(escala_braden_n_2.isChecked()==true){ escala_braden_soma=escala_braden_soma+2;}
                if(escala_braden_n_3.isChecked()==true){ escala_braden_soma=escala_braden_soma+3;}
                if(escala_braden_n_4.isChecked()==true){ escala_braden_soma=escala_braden_soma+4;}

                if(escala_braden_fc_1.isChecked()==true){ escala_braden_soma=escala_braden_soma+1;}
                if(escala_braden_fc_2.isChecked()==true){ escala_braden_soma=escala_braden_soma+2;}
                if(escala_braden_fc_3.isChecked()==true){ escala_braden_soma=escala_braden_soma+3;}

                paciente2.setRiscobraden(String.valueOf(escala_braden_soma));
                if (paciente2.getId()!=0){
                    Toast.makeText(EscalaBradenActivity.this," "+paciente2.getNome()+" "+paciente2.getRiscobraden(),Toast.LENGTH_LONG).show();
                    Intent resultado = new Intent();
                    //resultado.putExtra("resultadobraden", paciente2.getRiscobraden());
                    /*
                    PacienteDAO dao = new PacienteDAO(EscalaBradenActivity.this);
                    dao.altera(paciente2);
                    dao.close();
                    */
                    resultado.putExtra("resultadobraden", paciente2.getRiscobraden());
                    setResult(4, resultado);
                    //break;
                    finish();
                    break;
                }
                if(paciente2.getId()==0) {
                    if (escala_braden_soma <= 9) {/*Risco severo*/
                        Intent RiscoAlto = new Intent(EscalaBradenActivity.this, RiscoAltoActivity.class);
                        startActivity(RiscoAlto);
                        //Intent RiscoSevero = new Intent(EscalaBradenActivity.this, RiscoSeveroActivity.class);
                        //startActivity(RiscoSevero);
                    }
                    if (escala_braden_soma >= 10 && escala_braden_soma <= 12) {/*Risco alto*/
                        Intent RiscoAlto = new Intent(EscalaBradenActivity.this, RiscoAltoActivity.class);
                        startActivity(RiscoAlto);
                    }
                    if (escala_braden_soma >= 13 && escala_braden_soma <= 14) {/*Risco moderado*/
                        Intent RiscoModerado = new Intent(EscalaBradenActivity.this, RiscoModeradoActivity.class);
                        startActivity(RiscoModerado);
                    }
                    if (escala_braden_soma >= 15 && escala_braden_soma <= 18) {/*Risco leve*/
                        Intent RiscoLeve = new Intent(EscalaBradenActivity.this, RiscoLeveActivity.class);
                        startActivity(RiscoLeve);
                    }
                    //Toast.makeText(EscalaBradenActivity.this,""+escala_braden_soma,Toast.LENGTH_LONG).show();
                    //finish();
                }
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}
