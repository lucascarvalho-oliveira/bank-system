package model;

public class Conta {
    protected double saldo;

    public Conta(){}

    public void deposito(double valor){
        if(valor <= 0) throw new IllegalArgumentException("O valor do deposito deve ser positivo.");
        else saldo += valor;
    }

    public void saque(double valor){
        if(valor <= 0) throw new IllegalArgumentException("valor incorreto para realizar a operação.");
        if(valor > saldo)throw new IllegalArgumentException("Saldo insuficiente para realizar a operação.");

        saldo -= valor;
    }

    public double getSaldo(){
        return saldo;
    }
}
