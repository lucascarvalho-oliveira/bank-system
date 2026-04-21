package repository;

import model.Pessoa;

import java.util.HashMap;
import java.util.Map;

public class PessoaRepository {

    private Map<String, Pessoa> pessoas = new HashMap<>();

    public boolean existe(String documento){
        documento = documento.replaceAll("\\D", "");
        return pessoas.containsKey(documento);
    }

    public void adicionar(Pessoa pessoa){
        String documento = pessoa.getDocumento().replaceAll("\\D", "");

        pessoas.put(documento, pessoa);
    }

    public Pessoa buscarPessoa(String documento){
        documento = documento.replaceAll("\\D", "");

        return pessoas.get(documento);
    }

}
