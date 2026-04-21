package model;

public class Senha {
    protected String senha;

    public Senha(String senha){
        if(!ehvalido(senha)) throw new IllegalArgumentException("Senha tem que ter no mínimo 8 caracteres.");
        if(!validarSimbolos(senha)) throw new IllegalArgumentException("Senha tem que ter no mínimo 1 simbolo.");

        this.senha = senha;
    }

    public boolean ehvalido(String senha){
        return senha != null && senha.length() >= 8;
    }

    public boolean validarSimbolos(String senha){
        String simbolos = ".*[^a-zA-Z0-9].*";

        return senha.matches(simbolos);
    }

    public boolean validar(String senhaDigitada){
        return senha.equals(senhaDigitada);
    }
}
