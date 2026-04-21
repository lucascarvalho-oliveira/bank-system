package model;

public class PessoaPJ extends Pessoa{
    protected final CNPJ cnpj;
    protected Senha senha;

    public PessoaPJ(String nome, Senha senha, Conta conta, CNPJ cnpj){
        super(nome, conta);

        this.cnpj = cnpj;
        this.senha = senha;
    }

    @Override
    public String getDocumento(){
        return cnpj.toString();
    }

    @Override
    public Senha getSenha(){
        return senha;
    }
}
