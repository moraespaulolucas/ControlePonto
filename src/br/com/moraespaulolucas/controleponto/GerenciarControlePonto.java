package br.com.moraespaulolucas.controleponto;

import br.com.moraespaulolucas.controleponto.model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setIdFunc(1);
        gerente.setNome("João");
        gerente.setDocumento("512.345.678-99");
        gerente.setEmail("joao@gmail.com");
        gerente.setLogin("gerente_joao");
        gerente.setSenha("joao1234");

        Operador operador = new Operador();
        operador.setIdFunc(1);
        operador.setNome("Pedro");
        operador.setDocumento("543.219.876-55");
        operador.setEmail("pedro@hotmail.com");
        operador.setValorHora(20.0);

        Secretaria secretaria = new Secretaria();
        secretaria.setIdFunc(1);
        secretaria.setNome("Beatriz");
        secretaria.setDocumento("492.153.478-66");
        secretaria.setEmail("beatriz@yahoo.com");
        secretaria.setTelefone("(11) 2045-1269");
        secretaria.setRamal("3");

        RegistroPonto ponto = new RegistroPonto();
        ponto.setIdRegPonto(123);
        ponto.setFunc(gerente);
        ponto.setDataRegistro(LocalDate.now());
        //ponto.setHoraEntrada(LocalTI.);
    }
}
