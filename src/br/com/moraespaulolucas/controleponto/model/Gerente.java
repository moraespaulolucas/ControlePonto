package br.com.moraespaulolucas.controleponto.model;

public class Gerente extends Funcionario{
    private String login;
    private String senha;

    public Gerente() {
        this.login = "";
        this.senha = "";
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
