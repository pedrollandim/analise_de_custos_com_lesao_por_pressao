package com.example.pedro.prottipo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.pedro.prottipo1.modelo.Paciente;



public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button novoPaciente =(Button)findViewById(R.id.menu_novo_paciente);
        novoPaciente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaTelaNovoPaciente = new Intent(MenuActivity.this,cadastroPacienteActivity.class);
                startActivity(irParaTelaNovoPaciente);
            }
        });

        Button listaPA =(Button)findViewById(R.id.menu_pacientes_lista);
        listaPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaTelaListaPaciente = new Intent(MenuActivity.this,ListaPacientesActivity.class);
                startActivity(irParaTelaListaPaciente);
            }
        });

        Button escalaBraden = (Button)findViewById(R.id.menu_avaliacao);
        escalaBraden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Paciente paciente = (Paciente) new Paciente();
                Intent intentVaiParaCadastroPA = new Intent(MenuActivity.this,EscalaBradenActivity.class);
                intentVaiParaCadastroPA.putExtra("paciente",paciente );
                startActivity(intentVaiParaCadastroPA);
            }
        });



        Button resultado =(Button)findViewById(R.id.menu_resultados);
        resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaResultado = new Intent(MenuActivity.this,ResultadosActivity.class);
                startActivity(irParaResultado);
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
                //Paciente teste = new Paciente();
                //Toast.makeText(MenuActivity.this,"coren: "+teste.getCorenPA(),Toast.LENGTH_LONG).show();

                //Toast.makeText(MenuActivity.this,"Saindo.",Toast.LENGTH_LONG).show();
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
