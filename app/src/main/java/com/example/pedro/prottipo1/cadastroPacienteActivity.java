package com.example.pedro.prottipo1;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pedro.prottipo1.dao.CalculadoraDAO;
import com.example.pedro.prottipo1.dao.LoginDAO;
import com.example.pedro.prottipo1.dao.PacienteDAO;
import com.example.pedro.prottipo1.modelo.Calculadora;
import com.example.pedro.prottipo1.modelo.Paciente;

import java.util.Calendar;


public class cadastroPacienteActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener {

    private CadastroPacienteHelper ajudaPA;

    Calendar c;
    DatePickerDialog pegaData;
    TextView data;
    TextView data2;

    Spinner spSexo;


    String sexoAUX;
    String dataAUX;


    TextView tipo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_paciente);

        ajudaPA = new CadastroPacienteHelper(this);

        Intent intent  = getIntent();
        final Paciente paciente = (Paciente) intent.getSerializableExtra("paciente");// RECEBENDO O PACIENTE DE OUTRA TELA
        if (paciente != null){
            ajudaPA.preencheFormulario(paciente);

            data2 = (EditText)findViewById(R.id.cadastro_paciente_data);
            data2.setText(paciente.getDatadenascimento());
        }


        spSexo =(Spinner)findViewById(R.id.cadastro_paciente_sexo);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.sexo, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spSexo.setAdapter(adapter2);
        spSexo.setOnItemSelectedListener(this);




        data = (EditText)findViewById(R.id.cadastro_paciente_data);
        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c= Calendar.getInstance();

                int dia= c.get(Calendar.DAY_OF_MONTH);
                int mes= c.get(Calendar.MONTH);
                int ano= c.get(Calendar.YEAR);

                pegaData = new DatePickerDialog(cadastroPacienteActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int plyear, int plmonth, int pldayOfMonth) {
                        int mesaux;
                        mesaux = plmonth+1;
                        data.setText(pldayOfMonth+"/"+mesaux+"/"+plyear);
                        dataAUX= pldayOfMonth+"/"+mesaux+"/"+plyear;
                    }
                },dia,mes,ano);
                pegaData.show();
            }
        });


        tipo = (EditText)findViewById(R.id.cadastro_paciente_tipo);
        tipo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Paciente paciente =ajudaPA.pegaPaciente();
                //paciente.setQuantidadeLP(verificaquantidadeLP());
                //***
                //MANDDANDO E RECENDO DADOS DA 2 TELA ABERTA
                //Toast.makeText(cadastroPacienteActivity.this,""+paciente.getNome(),Toast.LENGTH_LONG).show();
                //Intent irParaTelaDosTipos = new Intent(cadastroPacienteActivity.this,TiposEscolhaActivity.class);
                //Intent getTipoLP = new Intent(cadastroPacienteActivity.this,TiposEscolhaActivity.class);
                Intent TipoLP = new Intent(cadastroPacienteActivity.this,TiposEscolhaActivity.class);
                TipoLP.putExtra("paciente",paciente);
                startActivityForResult(TipoLP,1);
                //***
                // ***

            }
        });

        EditText localizacaoLP = (EditText)findViewById(R.id.cadastro_paciente_localização_da_lp);

        localizacaoLP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Paciente paciente =ajudaPA.pegaPaciente();
                Intent localizacaoLP_1 = new Intent(cadastroPacienteActivity.this,LocalizacaoDaLPActivity.class);
                localizacaoLP_1.putExtra("paciente",paciente);
                startActivityForResult(localizacaoLP_1,1);

            }
        });

        EditText risco = (EditText)findViewById(R.id.cadastro_paciente_risco);
        risco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Paciente paciente =ajudaPA.pegaPaciente();
                Intent risco1 = new Intent(cadastroPacienteActivity.this,EscalaBradenActivity.class);
                risco1.putExtra("paciente",paciente);
                startActivityForResult(risco1,1);

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
                salvar();
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
       // String text = parent.getItemAtPosition(position).toString();
        //Toast.makeText(parent.getContext(),text,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        //Toast.makeText(parent.getContext(),text,Toast.LENGTH_LONG).show();

        sexoAUX= text;

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    Paciente salvar(){
        Paciente paciente =ajudaPA.pegaPaciente();
        PacienteDAO dao = new PacienteDAO(cadastroPacienteActivity.this);//this);
        CalculadoraDAO daoCalculadora = new CalculadoraDAO(cadastroPacienteActivity.this);
       // EditText campoNomePaciente_2= (EditText) findViewById(R.id.cadastro_paciente_nome);

        EditText quantidadeLP = (EditText)findViewById(R.id.cadastro_paciente_quantidade_de_lp);
        paciente.setQuantidadeLP(quantidadeLP.getText().toString());

        if(paciente.getId() != 0) {
            paciente.setSexo(sexoAUX);

            EditText dataaux2 = (EditText)findViewById(R.id.cadastro_paciente_data);
            dataAUX = dataaux2.getText().toString();
            paciente.setDatadenascimento(dataAUX);

            dao.altera(paciente);

            Calculadora calculadora = new Calculadora();
            calculadora.setIdPaciente(paciente.getId());
            calculadora=daoCalculadora.buscaPacientesComCalculadora(calculadora);
            //Toast.makeText(cadastroPacienteActivity.this," "+calculadora.getPaciente(),Toast.LENGTH_LONG).show();
            //daocalculadora.atualizaPaciente(calculadora);
            ///***
            if (calculadora.getIdCalculadora() == 0){
                daoCalculadora.insere(calculadora);
                daoCalculadora.atualizaTodosOsPrecosUnitarios();
            }if (calculadora.getIdCalculadora() == 1){

                calculadora.setIdPaciente(paciente.getId());
                calculadora.setSfdias(calculadora.getSfdias()+1);
                calculadora.setPaciente(paciente.getNome());
                calculadora.setIdPaciente(paciente.getId());
                daoCalculadora.atualizaPaciente(calculadora);
                daoCalculadora.atualizaTodosOsPrecosUnitarios();
            }if (calculadora.getIdCalculadora() > 0 && calculadora.getIdCalculadora() != 1){
                daoCalculadora.atualizaPaciente(calculadora);
                daoCalculadora.atualizaTodosOsPrecosUnitarios();
            }
            ///***
            daoCalculadora.close();

        }else {
            ////////
            LoginDAO daoEN = new LoginDAO(this);
            String enfermeiroCoren= daoEN.buscaCOREN();
            String enfermeiroNome= daoEN.buscaNOME();
            daoEN.close();

            /////////
            paciente.setCorenPA(enfermeiroCoren);
            paciente.setNomeEnfermeiro(enfermeiroNome);
            paciente.setSexo(sexoAUX);
            paciente.setDatadenascimento(dataAUX);
            dao.insere(paciente);
            //Toast.makeText(cadastroPacienteActivity.this,"Paciente salvo."+paciente.getNomeEnfermeiro(),Toast.LENGTH_LONG).show();

        }
        dao.close();

        Toast.makeText(cadastroPacienteActivity.this,"XIMIRA "+paciente.getQuantidadeLP()+" "+quantidadeLP.getText().toString(),Toast.LENGTH_LONG).show();
        return paciente;
        //Toast.makeText(cadastroPacienteActivity.this,"Paciente "+ paciente.getCorenPA() +" salvo.",Toast.LENGTH_LONG).show();
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        EditText aux13 = (EditText) findViewById(R.id.cadastro_paciente_tipo);
        EditText aux14 = (EditText) findViewById(R.id.cadastro_paciente_localização_da_lp);
        EditText aux15 = (EditText) findViewById(R.id.cadastro_paciente_risco);
        if (requestCode == 1){
        if (resultCode == 2){
            data.getStringExtra("resultado");
              aux13.setText(data.getStringExtra("resultado"));

        }
            if (resultCode == 3){
                data.getStringExtra("resultadolocal");
                aux14.setText(data.getStringExtra("resultadolocal"));

            }
            if (resultCode == 4){
                data.getStringExtra("resultadobraden");
                aux15.setText(data.getStringExtra("resultadobraden"));

            }
        }

    }
}
