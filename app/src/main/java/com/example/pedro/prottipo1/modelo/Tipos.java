package com.example.pedro.prottipo1.modelo;

public class Tipos {

    private final String imagem;
    private final String tipo;
    private final String descricao;



    public Tipos(String imagem,String tipo, String descricao){
        this.imagem = imagem;
        this.tipo = tipo;
        this.descricao=descricao;

    }

    public String getImagem() { return imagem;   }

    public String getTipo() { return tipo; }

    public String getDescricao() { return descricao; }


}
