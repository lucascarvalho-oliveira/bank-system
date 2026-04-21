package service;

import model.Conta;

public class ContaService {

    public void depositar(Conta conta, double valor){
        conta.deposito(valor);
    }

    public void saque(Conta conta, double valor){
        conta.saque(valor);
    }
}
