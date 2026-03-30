package model;

import service.Conta;
import service.CNPJ;

public class PessoaPJ extends Pessoa{
    protected final CNPJ cnpj;

    public PessoaPJ(String nome, String senha, Conta conta, CNPJ cnpj){
        super(nome, senha, conta);

        this.cnpj = cnpj;
    }

    @Override
    public String getDocumento(){
        return cnpj.toString();
    }
}
