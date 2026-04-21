package model;

public class PessoaPF extends Pessoa{
    protected final CPF cpf;
    protected Senha senha;

    public PessoaPF(String nome, Senha senha, Conta conta, CPF cpf){
        super(nome, conta);

        this.cpf = cpf;
        this.senha = senha;
    }

    @Override
    public String getDocumento(){
        return cpf.toString();
    }

    @Override
    public Senha getSenha(){
        return senha;
    }
}
