package br.com.moraespaulolucas.controleponto.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroPonto {
    private long idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    private DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("HH:mm - dd/MM/yyyy");

    public RegistroPonto() {
        this.idRegPonto = 0;
        this.func = null;
        this.dataRegistro = null;
        this.horaEntrada = null;
        this.horaSaida = null;
    }

    public long getIdRegPonto() {
        return idRegPonto;
    }

    public void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public void apresentarRegistroPonto() {
        System.out.println("====================================");
        System.out.println("Funcionário: "+this.func.getNome());
        System.out.println("Data: "+this.getDataRegistro().format(this.formatoData));
        System.out.println("Horário de entrada: "+this.getHoraEntrada().format(this.formatoDataHora));
        System.out.println("Horário de saída: "+this.getHoraSaida().format(this.formatoDataHora));
        System.out.println("====================================");
    }
}
