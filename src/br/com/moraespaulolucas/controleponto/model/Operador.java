package br.com.moraespaulolucas.controleponto.model;

public class Operador extends Funcionario{
    private double valorHora;

    public Operador() {
        this.valorHora = 0.0;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
