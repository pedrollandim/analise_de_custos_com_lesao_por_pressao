package com.example.pedro.prottipo1.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;


import com.example.pedro.prottipo1.R;
import com.example.pedro.prottipo1.modelo.Tipos;

import java.util.List;

public class ListaTiposAdapter extends BaseAdapter {

    private final List<Tipos> tipos;
    private Context context;

    public ListaTiposAdapter(List<Tipos> tipos, Context context){

        this.tipos = tipos;
        this.context = context;
    }

    @Override
    public int getCount() {
        return tipos.size();
    }

    @Override
    public Tipos getItem(int posicao) {
        return tipos.get(posicao);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int posicao, View convertView, ViewGroup parent) {
        View viewCriada = LayoutInflater.from(context).inflate(R.layout.item_tipos,parent,false);
        Tipos tipo = this.tipos.get(posicao);

        TextView tipox = viewCriada.findViewById(R.id.tipos_machucados_tipo);
        tipox.setText(tipo.getTipo());

        TextView descricao = viewCriada.findViewById(R.id.tipos_machucados_tipo_descricao);
        descricao.setText(tipo.getDescricao());

        ImageView imagem = viewCriada.findViewById(R.id.tipos_machucados_imagem);
        Resources resources = context.getResources();
        int idDoDrawable = resources.getIdentifier(tipo.getImagem(), "drawable", context.getPackageName());
        Drawable drawableTipo = resources.getDrawable(idDoDrawable);
        imagem.setImageDrawable(drawableTipo);
        return viewCriada;
    }
}
