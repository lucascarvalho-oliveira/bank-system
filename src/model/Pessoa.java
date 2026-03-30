package model;

import service.Conta;

public abstract class Pessoa {
    protected String nome;
    protected String senha;
    protected Conta conta;

    public Pessoa(String nome, String senha, Conta conta){
        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome invalido.");
        }

        this.nome = nome;
        this.senha = senha;
        this.conta = conta;
    }

    public Conta getConta(){
        return conta;
    }

    public abstract String getDocumento();
}
