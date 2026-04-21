package service;

import model.Pessoa;

public class SenhaService {

    public void validarSenha(Pessoa pessoa, String senhaDigitada){
        if(!pessoa.getSenha().validar(senhaDigitada)){
            throw new IllegalArgumentException("Senha incorreta!");
        }
    }
}
