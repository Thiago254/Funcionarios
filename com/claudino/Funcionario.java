package com.claudino;

import java.time.LocalDate;

public class Funcionario {
    public String nomeFunc;
    public String idFunc;
    public String departamento;
    public String dataContratacao;
    public String salario;
    public String documento;
    public String ativo;


    public String getNomeFunc() {
        return nomeFunc;
    }
    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }
    public String getIdFunc(){
        return idFunc;
    }
    public void setIdFunc(String idFunc){
        this.idFunc = idFunc;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getSalario(){
        return salario;
    }
    public void setSalario(String salario){
    }
    public String getativo(){
        return ativo;
    }
    public void setativo(String ativo){
        if (true) {
            System.out.println("Funcionario Ativo");
        } else {
            System.out.println("Funcionario Demitido");
        }
    }
    public String getDataContratacao(){
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public void imprimir(){
        System.out.println("Admição em jan de 2020 " + dataContratacao);
    }

}
