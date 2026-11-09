package org.example;

public class Beneficio {

    private String nomeFuncionario;
    private String nomeBeneficio;
    private boolean ativo;

    public Beneficio(String nomeFuncionario, String nomeBeneficio, boolean ativo) {
        this.nomeFuncionario = nomeFuncionario;
        this.nomeBeneficio = nomeBeneficio;
        this.ativo = ativo;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getNomeBeneficio() {
        return nomeBeneficio;
    }

    public void setNomeBeneficio(String nomeBeneficio) {
        this.nomeBeneficio = nomeBeneficio;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}