package com.example.pedro.prottipo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pedro.prottipo1.dao.CalculadoraDAO;
import com.example.pedro.prottipo1.dao.PacienteDAO;
import com.example.pedro.prottipo1.modelo.Calculadora;

import java.util.ArrayList;
import java.util.List;

public class EstoqueActivity extends AppCompatActivity {
float barraPrecoSF_1;
float barraQuantidadeSF_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estoque);



        SeekBar barraPrecoSF = (SeekBar) findViewById(R.id.estoque_s_d_l_e_r_d_c_a_soro_fisiologico_barra_pre);
        SeekBar barraQuantidadeSF= (SeekBar) findViewById(R.id.estoque_s_d_l_e_r_d_c_a_soro_fisiologico_barra_qua);
        final TextView barraPrecoSFTXT=(TextView) findViewById(R.id.estoque_s_d_l_e_r_d_c_a_soro_fisiologico_pre_texto);
        final TextView barraQuantidadeSFTXT=(TextView) findViewById(R.id.estoque_s_d_l_e_r_d_c_a_soro_fisiologico_qua_texto);
        barraPrecoSF.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraPrecoSF_1= progress/10;
                barraPrecoSFTXT.setText("R$ "+barraPrecoSF_1);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        barraQuantidadeSF.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                barraQuantidadeSF_1 = progress/10;
                barraQuantidadeSFTXT.setText(""+barraQuantidadeSF_1);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

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
                Calculadora calculadora = new Calculadora();
                CalculadoraDAO dao = new CalculadoraDAO(this);
                calculadora.setIdPaciente(1);
                dao.buscaPacientesComCalculadora(calculadora);
                calculadora.setSfprecounitario1(barraPrecoSF_1);

                ///***
                calculadora.setSfvalorgastonoperiodo(calculadora.getSfquantidadegastanoperiodo()*calculadora.getSfprecounitario1());
                ///***

                if (calculadora.getIdCalculadora() == 0){dao.insere(calculadora);
                    Toast.makeText(EstoqueActivity.this,"INSERE "+calculadora.getSfprecounitario1(),Toast.LENGTH_LONG).show();
                }if (calculadora.getIdCalculadora() > 0){dao.atualizaPaciente(calculadora);
                //Toast.makeText(EstoqueActivity.this,"ATUALIZA "+calculadora.getSfprecounitario1(),Toast.LENGTH_LONG).show();
                }

                dao.atualizaTodosOsPrecosUnitarios();
                dao.close();
                //Toast.makeText(EstoqueActivity.this," "+calculadora.getSfpreco(),Toast.LENGTH_LONG).show();
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
