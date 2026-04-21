package controller;

import model.*;
import repository.PessoaRepository;
import service.PessoaService;

import java.util.Scanner;

public class PessoaController {

    private PessoaService pessoaservice;

    public PessoaController(PessoaService pessoaservice){
        this.pessoaservice = pessoaservice;
    }

    public void cadastrarPessoa(Scanner sc){
        sc.nextLine();
        System.out.println();
        System.out.println("Informe o seu nome:");
        String nome = sc.nextLine();
        System.out.println("Crie uma senha:");
        String senha = sc.nextLine();
        System.out.println("1 - Pessoa Física | 2 - Pessoa Jurídica");
        int menu_2 = Integer.parseInt(sc.nextLine());

        Senha senhaObjeto = new Senha(senha);

        System.out.println();
        if (menu_2 == 1) {
            System.out.println("Informe seu CPF:");
            String cpf = sc.nextLine();

            PessoaPF pf = new PessoaPF(nome, senhaObjeto, new Conta(), new CPF(cpf));
            pessoaservice.adicionar(pf);
        } else {
            System.out.println("Informe o CNPJ");
            String cnpj = sc.nextLine();

            PessoaPJ pj = new PessoaPJ(nome, senhaObjeto, new Conta(), new CNPJ(cnpj));
            pessoaservice.adicionar(pj);
        }
        System.out.println();
    }
}
