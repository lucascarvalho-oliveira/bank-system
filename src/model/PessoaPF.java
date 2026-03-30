package model;

import service.Conta;
import service.CPF;

public class PessoaPF extends Pessoa{
    protected final CPF cpf;

    public PessoaPF(String nome, String senha, Conta conta, CPF cpf){
        super(nome, senha, conta);

        this.cpf = cpf;
    }

    @Override
    public String getDocumento(){
        return cpf.toString();
    }
}
