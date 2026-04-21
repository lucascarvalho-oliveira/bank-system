package app;

import controller.ContaController;
import controller.PessoaController;
import model.*;
import repository.PessoaRepository;
import service.ContaService;
import service.PessoaService;
import service.SenhaService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Instanciando repository e service.
        PessoaRepository pessoaRepository = new PessoaRepository();
        PessoaService pessoaservice = new PessoaService(pessoaRepository);
        ContaService contaservice = new ContaService();
        SenhaService senhaservice = new SenhaService();

        // Instanciando controller.
        PessoaController pessoacontroller = new PessoaController(pessoaservice);
        ContaController contacontroller  = new ContaController(pessoaservice, pessoaRepository, contaservice, senhaservice);

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
                        pessoacontroller.cadastrarPessoa(sc);
                        break;

                    case 2:
                        contacontroller.SistemaConta(sc);
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
