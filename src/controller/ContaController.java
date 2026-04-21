package controller;

import model.Conta;
import model.Pessoa;
import repository.PessoaRepository;
import service.ContaService;
import service.PessoaService;
import service.SenhaService;

import java.util.Scanner;

public class ContaController {
    private PessoaService pessoaservice;
    private PessoaRepository pessoarepository;
    private ContaService contaservice;
    private SenhaService senhaservice;

    public ContaController(PessoaService pessoaservice, PessoaRepository pessoarepository, ContaService contaservice, SenhaService senhaservice){
        this.pessoaservice = pessoaservice;
        this.pessoarepository = pessoarepository;
        this.contaservice = contaservice;
        this.senhaservice = senhaservice;
    }

    public void SistemaConta(Scanner sc){
        sc.nextLine();
        System.out.println();
        System.out.println("Informe CPF ou CNPJ cadastrado:");
        String busca = sc.nextLine();

        try {
            pessoaservice.buscarPessoa(busca);
            Pessoa pessoa = pessoarepository.buscarPessoa(busca);

            System.out.println("Informe a senha cadastrada na conta:");
            String senhaDigitada = sc.nextLine();

            senhaservice.validarSenha(pessoa, senhaDigitada);

            Conta conta = pessoa.getConta();

            System.out.println();
            boolean sair = false;
            do {
                System.out.println("Saldo atual = R$ " + conta.getSaldo());
                System.out.println("Escolha a operação:");
                System.out.println("1 - Saque | 2 - Deposito | 3 - Voltar ao menu");
                int menu_3 = sc.nextInt();

                try {
                    switch (menu_3) {
                        case 1:
                            System.out.println();
                            System.out.println("Qual valor deseja sacar:");
                            double valorSaque = sc.nextDouble();

                            contaservice.saque(conta, valorSaque);

                            System.out.println("Operação realizado com sucesso!");
                            System.out.println();
                            break;

                        case 2:
                            System.out.println();
                            System.out.println("Qual Valor deseja depositar:");
                            double valorDeposito = sc.nextDouble();

                            contaservice.depositar(conta, valorDeposito);

                            System.out.println("Operação realizado com sucesso!");
                            System.out.println();
                            break;

                        case 3:
                            System.out.println();
                            sair = true;
                            break;

                        default:
                            System.out.println();
                            System.out.println("Erro: Opção inválida! Tente novamente.");
                            System.out.println();
                            break;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println();
                    System.out.println(e.getMessage());
                    System.out.println();
                }
            } while (!sair);

        } catch (IllegalArgumentException e) {
            System.out.println();
            System.out.println(e.getMessage());
            System.out.println();
        }
    }
}
