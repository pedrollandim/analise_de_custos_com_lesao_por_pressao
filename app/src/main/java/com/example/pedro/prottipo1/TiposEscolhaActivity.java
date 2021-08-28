package com.example.pedro.prottipo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.pedro.prottipo1.adapter.ListaTiposAdapter;
import com.example.pedro.prottipo1.dao.LoginDAO;
import com.example.pedro.prottipo1.dao.PacienteDAO;
import com.example.pedro.prottipo1.dao.TiposDAO;
import com.example.pedro.prottipo1.modelo.Paciente;
import com.example.pedro.prottipo1.modelo.Tipos;

import java.util.List;

public class TiposEscolhaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos_escolha);


        final List<Tipos> tipos = new TiposDAO().lista();

        final ListView listaDeTipos = findViewById(R.id.pacotes_viagens_lista_tipos);
        listaDeTipos.setAdapter(new ListaTiposAdapter(tipos,this));


        Paciente paciente = (Paciente) getIntent().getSerializableExtra("paciente");// RECEBENDO O PACIENTE DE OUTRA TELA
        //PacienteDAO pacientedao = new PacienteDAO(TiposEscolhaActivity.this);
        //pacientedao.close();
        final int[] i = {Integer.parseInt(paciente.getQuantidadeLP())};
        //Toast.makeText(TiposEscolhaActivity.this,"xablau "+paciente.getQuantidadeLP() +" "+ i[0],Toast.LENGTH_LONG).show();
        final String[] tipos2 = new String[1];


        //////////////////////////
        /*

        listaDeTipos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> lista, View item, int position, long id) {
                Tipos tipo =(Tipos)listaDeTipos.getItemAtPosition(position);
                tipos2[0] =tipo.getTipo()+"-"+ tipos2[0];
                ///Paciente paciente = (Paciente) getIntent().getSerializableExtra("paciente");
                i[0] = i[0] -1;
                if(i[0] <=0) {
                    //paciente.setEstagiolp(tipo.getTipo());
                    Intent resultado = new Intent();
                    resultado.putExtra("resultado", tipos2[0]);
                    Toast.makeText(TiposEscolhaActivity.this,"xablau "+tipos2[0],Toast.LENGTH_LONG).show();
                    setResult(2, resultado);
                    finish();
                }
            }
        });

         */
        ////////////////////


    }


}

/**
 * int quantidadeLP = Integer.parseInt(paciente.getQuantidadeLP()) ;
 */


/**
 package com.example.pedro.prottipo1;

 import android.content.Intent;
 import android.support.v7.app.AppCompatActivity;
 import android.os.Bundle;
 import android.view.View;
 import android.widget.AdapterView;
 import android.widget.EditText;
 import android.widget.ListView;
 import android.widget.Toast;

 import com.example.pedro.prottipo1.adapter.ListaTiposAdapter;
 import com.example.pedro.prottipo1.dao.LoginDAO;
 import com.example.pedro.prottipo1.dao.PacienteDAO;
 import com.example.pedro.prottipo1.dao.TiposDAO;
 import com.example.pedro.prottipo1.modelo.Paciente;
 import com.example.pedro.prottipo1.modelo.Tipos;

 import java.util.List;

     public class TiposEscolhaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_tipos_escolha);

    List<Tipos> tipos = new TiposDAO().lista();

    final ListView listaDeTipos = findViewById(R.id.pacotes_viagens_lista_tipos);
    listaDeTipos.setAdapter(new ListaTiposAdapter(tipos,this));


    Paciente paciente = (Paciente) getIntent().getSerializableExtra("paciente");// RECEBENDO O PACIENTE DE OUTRA TELA
    //PacienteDAO pacientedao = new PacienteDAO(TiposEscolhaActivity.this);
    //pacientedao.close();



        listaDeTipos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> lista, View item, int position, long id) {
    Tipos tipo =(Tipos)listaDeTipos.getItemAtPosition(position);
    ///Paciente paciente = (Paciente) getIntent().getSerializableExtra("paciente");

    //paciente.setEstagiolp(tipo.getTipo());
    Intent resultado = new Intent();
    resultado.putExtra("resultado",tipo.getTipo());
    setResult(2,resultado);
    finish();

    }
    });


    }


}

**/