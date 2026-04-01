package app;

import model.Pessoa;
import model.PessoaPF;
import model.PessoaPJ;
import service.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PessoaRepository pr = new PessoaRepository();

        boolean finalizar = false;

        do {
            System.out.println("--------------Banco Lucas--------------");
            System.out.println("1 - Novo cadastro.");
            System.out.println("2 - Operação bancaria.");
            System.out.println("3 - Sair");
            System.out.println("Para começar escolha uma das opções.");
            int menu = sc.nextInt();

            try {
                switch (menu) {
                    case 1:
                        sc.nextLine();
                        System.out.println();
                        System.out.println("Informe o seu nome:");
                        String nome = sc.nextLine();
                        System.out.println("Crie uma senha:");
                        String senha = sc.nextLine();
                        System.out.println("1 - Pessoa Física | 2 - Pessoa Jurídica");
                        int menu_2 = Integer.parseInt(sc.nextLine());

                        ValidadorSenha VS = new ValidadorSenha(senha);

                        System.out.println();
                        if (menu_2 == 1) {
                            System.out.println("Informe seu CPF:");
                            String cpf = sc.nextLine();

                            PessoaPF pf = new PessoaPF(nome, senha, new Conta(), new CPF(cpf));
                            pr.adicional(pf);
                        } else {
                            System.out.println("Informe o CNPJ");
                            String cnpj = sc.nextLine();

                            PessoaPJ pj = new PessoaPJ(nome, senha, new Conta(), new CNPJ(cnpj));
                            pr.adicional(pj);
                        }
                        System.out.println();
                        break;

                    case 2:
                        sc.nextLine();
                        System.out.println();
                        System.out.println("informe o CPF ou CNPJ");
                        String busca = sc.nextLine();

                        try {
                            Pessoa pessoa = pr.buscarPessoa(busca);
                            Conta conta = pessoa.getConta();

                            System.out.println();

                            boolean sair = false;
                            do {
                                System.out.println("Saldo atual = R$ " + conta.getSaldo());
                                System.out.println("Escolha a operação:");
                                System.out.println("1 - Saque | 2 - Deposito | 3 - Voltar ao menu");
                                int menu_3 = sc.nextInt();

                                switch (menu_3) {
                                    case 1:
                                        System.out.println();
                                        System.out.println("Qual valor deseja sacar:");
                                        double valorSaque = sc.nextDouble();

                                        conta.saque(valorSaque);

                                        System.out.println("Operação realizado com sucesso!");
                                        System.out.println();
                                        break;

                                    case 2:
                                        System.out.println();
                                        System.out.println("Qual Valor deseja depositar:");
                                        double valorDeposito = sc.nextDouble();

                                        conta.deposito(valorDeposito);

                                        System.out.println("Operação realizado com sucesso!");
                                        System.out.println();
                                        break;

                                    case 3:
                                        System.out.println();
                                        sair = true;

                                    default:
                                        System.out.println();
                                        System.out.println("Erro: Opção inválida! Tente novamente.");
                                        System.out.println();
                                        break;
                                }
                            } while (!sair);

                        } catch (IllegalArgumentException e) {
                            System.out.println();
                            System.out.println(e.getMessage());
                            System.out.println();
                        }
                        break;

                    case 3:
                        sc.nextLine();
                        System.out.println();
                        System.out.println("Sistema finalizado!");
                        finalizar = true;
                        break;

                    default:
                        System.out.println();
                        System.out.println("Erro: Opção inválida! Tente novamente.");
                        System.out.println();
                        break;
                }
            }catch (IllegalArgumentException e) {
                System.out.println();
                System.out.println(e.getMessage());
                System.out.println();
            }
        } while (!finalizar);
        sc.close();
    }
}
