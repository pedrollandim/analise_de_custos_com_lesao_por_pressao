package com.example.pedro.prottipo1;

import android.widget.EditText;
import android.widget.Spinner;

import com.example.pedro.prottipo1.modelo.Paciente;

public class CadastroPacienteHelper {
    private final EditText campoNomePaciente;
    private final EditText campoTelefonePA;
    private final EditText campoEmailPA;
    private final Spinner campoSexoPA;
    private final EditText campoDataNascimentoPA;
    private final EditText campoTipoLP;
    private final EditText campoQuantidadeLP;
    private final EditText campoRisco;

    private Paciente paciente;

    public CadastroPacienteHelper(cadastroPacienteActivity cadastroPacienteActivity){
        //dica aperta alt+enter depois creadt field para criar a variavel
        campoNomePaciente= (EditText) cadastroPacienteActivity.findViewById(R.id.cadastro_paciente_nome);
        campoTelefonePA   = (EditText) cadastroPacienteActivity.findViewById(R.id.cadastro_paciente_telefone);
        campoEmailPA= (EditText) cadastroPacienteActivity.findViewById(R.id.cadastro_paciente_email);
        campoSexoPA   = (Spinner) cadastroPacienteActivity.findViewById(R.id.cadastro_paciente_sexo);
        campoDataNascimentoPA   = (EditText) cadastroPacienteActivity.findViewById(R.id.cadastro_paciente_data);
        campoTipoLP = (EditText)cadastroPacienteActivity.findViewById(R.id.cadastro_paciente_tipo);
        campoQuantidadeLP = (EditText)cadastroPacienteActivity.findViewById(R.id.cadastro_paciente_quantidade_de_lp);
        campoRisco = (EditText)cadastroPacienteActivity.findViewById(R.id.cadastro_paciente_risco);
        paciente = new Paciente();
    }

    public Paciente pegaPaciente(){
        paciente.setNome(campoNomePaciente.getText().toString());
        paciente.setTelefone(campoTelefonePA.getText().toString());
        paciente.setEmail(campoEmailPA.getText().toString());
        paciente.setEstagiolp(campoTipoLP.getText().toString());
        //paciente.setSexo(campoSexoPA.getText().toString());
        //paciente.setDatadenascimento(campoDataNascimentoPA.getText().toString());
        paciente.setQuantidadeLP(campoQuantidadeLP.getText().toString());
        paciente.setRiscobraden(campoRisco.getText().toString());
        return paciente;
    }

    public void preencheFormulario(Paciente paciente) {
        campoNomePaciente.setText(paciente.getNome());
        campoTelefonePA.setText(paciente.getTelefone());
        campoEmailPA.setText(paciente.getEmail());
        //
        campoSexoPA.setAdapter(paciente.getSexoSP());
        //campoSexoPA.setText(paciente.getSexo());
        //campoSexoPA.setAdapter(paciente.getSexoSP());
        campoDataNascimentoPA.setText(paciente.getDatadenascimento());
        campoTipoLP.setText(paciente.getEstagiolp());
       campoQuantidadeLP.setText(paciente.getQuantidadeLP());
        campoRisco.setText(paciente.getRiscobraden());
        this.paciente = paciente;
    }
}
