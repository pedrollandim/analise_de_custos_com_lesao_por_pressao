package com.example.pedro.prottipo1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.pedro.prottipo1.dao.CalculadoraDAO;
import com.example.pedro.prottipo1.dao.LoginDAO;
import com.example.pedro.prottipo1.dao.PacienteDAO;
import com.example.pedro.prottipo1.modelo.Calculadora;
import com.example.pedro.prottipo1.modelo.Paciente;

import java.util.List;


public class ListaPacientesActivity extends AppCompatActivity {

    private ListView listaPacientes;
    Paciente pacientef = new Paciente();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacientes);

        listaPacientes =(ListView)findViewById(R.id.lista_pacientes);
        listaPacientes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> lista, View item, int position, long id) {
                Paciente paciente = (Paciente) listaPacientes.getItemAtPosition(position);
                Intent calculadora = new Intent(ListaPacientesActivity.this,CalculadoraActivity.class);
                //***
                // MOVENDO OBJETO ENTRE TELAS
                calculadora.putExtra("paciente",paciente );
                //***
                startActivity(calculadora);

            }
        });



        registerForContextMenu(listaPacientes);
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
                Toast.makeText(ListaPacientesActivity.this,"Saindo.",Toast.LENGTH_LONG).show();
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void carregaLista() {
        PacienteDAO dao = new PacienteDAO(ListaPacientesActivity.this);
        LoginDAO corenaux = new LoginDAO(ListaPacientesActivity.this);
        String corenaux2=corenaux.buscaCOREN();

        List<Paciente> pacientes = dao.buscaPacientesCOREN(corenaux2);

        dao.close();
        corenaux.close();
        ListView listaAlunos = (ListView) findViewById(R.id.lista_pacientes);
        ArrayAdapter<Paciente> adapter = new ArrayAdapter<Paciente>(this, android.R.layout.simple_list_item_1,pacientes);
        listaAlunos.setAdapter(adapter);
    }
    private void carregaListaCompleta() {
        PacienteDAO dao = new PacienteDAO(ListaPacientesActivity.this);
        List<Paciente> pacientes = dao.buscaPacientes();
        dao.close();
        ListView listaAlunos = (ListView) findViewById(R.id.lista_pacientes);
        ArrayAdapter<Paciente> adapter = new ArrayAdapter<Paciente>(this, android.R.layout.simple_list_item_1,pacientes);
        listaAlunos.setAdapter(adapter);
    }



    @Override
    protected void onResume() {
        super.onResume();
        carregaLista();
        //carregaListaCompleta();
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, final View v, final ContextMenu.ContextMenuInfo menuInfo) {


        MenuItem escalabraden = menu.add("Escala braden");
        escalabraden.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuInfo;
                Paciente paciente = (Paciente) listaPacientes.getItemAtPosition(info.position);
                Intent intentVaiParaCadastroPA = new Intent(ListaPacientesActivity.this,EscalaBradenActivity.class);
                intentVaiParaCadastroPA.putExtra("paciente",paciente );
                startActivityForResult(intentVaiParaCadastroPA,1);
                //Toast.makeText(ListaPacientesActivity.this," "+aux.getIdPaciente()+" "+aux.getPaciente(),Toast.LENGTH_LONG).show();
                pacientef=paciente;
                carregaListaCompleta();
                return false;
            }
        });

        MenuItem deletarPA = menu.add("Deletar");
        deletarPA.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuInfo;
                Paciente paciente = (Paciente) listaPacientes.getItemAtPosition(info.position);
                PacienteDAO dao = new PacienteDAO(ListaPacientesActivity.this);
                dao.deletaPA(paciente);
                dao.close();

                CalculadoraDAO daoca = new CalculadoraDAO(ListaPacientesActivity.this);
                Calculadora calculadora = new Calculadora();
                calculadora.setIdPaciente(paciente.getId());
                daoca.deletaPAResultados(daoca.buscaPacientesComCalculadora(calculadora));
                daoca.close();
                //Toast.makeText(ListaPacientesActivity.this," "+aux.getIdPaciente()+" "+aux.getPaciente(),Toast.LENGTH_LONG).show();

                carregaLista();
                return false;
            }
        });

        MenuItem deletarPAll = menu.add("Deletar todos os usuarios");
        deletarPAll.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuInfo;
                PacienteDAO dao = new PacienteDAO(ListaPacientesActivity.this);
                dao.deletaPAll();
                dao.close();

                CalculadoraDAO daoca = new CalculadoraDAO(ListaPacientesActivity.this);
                daoca.deletaPAllResultados();
                daoca.close();

                carregaLista();
                return false;
            }
        });

        MenuItem mostrartodosPA = menu.add("Exibir todos os pacientes");
        mostrartodosPA.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                carregaListaCompleta();
                return false;
            }
        });

        MenuItem mostrarMeusPA = menu.add("Exibir seus pacientes");
        mostrarMeusPA.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                carregaLista();
                return false;
            }
        });
        MenuItem medicamentos = menu.add("Alterar dados");
        medicamentos.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuInfo;
                Paciente paciente = (Paciente) listaPacientes.getItemAtPosition(info.position);
                Intent intentVaiParaCadastroPA = new Intent(ListaPacientesActivity.this,cadastroPacienteActivity.class);
                intentVaiParaCadastroPA.putExtra("paciente",paciente );
                startActivity(intentVaiParaCadastroPA);

                return false;
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //EditText aux13 = (EditText) findViewById(R.id.cadastro_paciente_tipo);
        //EditText aux14 = (EditText) findViewById(R.id.cadastro_paciente_localização_da_lp);
       // Toast.makeText(ListaPacientesActivity.this,"pizzaaa",Toast.LENGTH_LONG).show();
        if (requestCode == 1){
            if (resultCode == 4){
               /////-> data.getStringExtra("resultadobraden");
                //aux14.setText(data.getStringExtra("resultadolocal"));
                //Toast.makeText(ListaPacientesActivity.this,"PIZZAAAA:  "+data.getStringExtra("resultadobraden"),Toast.LENGTH_LONG).show();
                //data.getStringExtra("resultadobraden");
                pacientef.setRiscobraden(data.getStringExtra("resultadobraden"));
                PacienteDAO daof = new PacienteDAO(ListaPacientesActivity.this);
                daof.altera(pacientef);
                daof.close();
                carregaListaCompleta();
                Toast.makeText(ListaPacientesActivity.this,"PIZZAAAA:  "+data.getStringExtra("resultadobraden"),Toast.LENGTH_LONG).show();

                /*data.getStringExtra("resultadobraden");
                Paciente paciente = (Paciente) data;
                PacienteDAO dao = new PacienteDAO(ListaPacientesActivity.this);
                dao.deletaPA(paciente);
                dao.close();*/
                //carregaListaCompleta();
                //carregaLista();
                //carregaListaCompleta();

            }
        }

    }
}
