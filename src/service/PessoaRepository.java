package service;

import model.Pessoa;

import java.util.HashMap;
import java.util.Map;

public class PessoaRepository {
    private Map<String, Pessoa> pessoas = new HashMap<>();

    public void adicional(Pessoa pessoa){
        String documento = pessoa.getDocumento().replaceAll("\\D", "");

        if(pessoas.containsKey(documento)){
            throw new IllegalArgumentException("pessoa ja cadastrada");
        }
        pessoas.put(documento, pessoa);
    }

    public Pessoa buscarPessoa(String documento){
        documento = documento.replaceAll("\\D", "");

        if (!pessoas.containsKey(documento)) {
            throw new IllegalArgumentException("Pessoa não encontrada");
        }

        return pessoas.get(documento);
    }

}
