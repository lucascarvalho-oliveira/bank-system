package service;

import model.Pessoa;
import repository.PessoaRepository;

public class PessoaService {

    private PessoaRepository repository;

    public PessoaService(PessoaRepository repository){
        this.repository = repository;
    }

    public void adicionar(Pessoa pessoa) {
        String documento = pessoa.getDocumento().replaceAll("\\D", "");

        if(repository.existe(documento)){
            throw new IllegalArgumentException("pessoa ja cadastrada");
        }
        repository.adicionar(pessoa);
    }

    public void buscarPessoa(String documento){
        documento = documento.replaceAll("\\D", "");

        if(!repository.existe(documento)){
            throw new IllegalArgumentException("Pessoa não encontrada");
        }

        repository.buscarPessoa(documento);
    }
}
