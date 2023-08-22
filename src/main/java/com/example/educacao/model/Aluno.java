package com.example.educacao.model;

public class Aluno {
    private String nome;
    private Integer matricula;
    private double nota1, nota2, nota3;

    public  String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public Integer getMatricula(){
        return this.matricula;
    }
    public void setMatricula(Integer matricula){
        this.matricula = matricula;
    }
    public double getNota1(){
        return this.nota1;
    }
    public void setNota1(double n1){
        this.nota1=n1;
    }
    public double getNota2(){
        return this.nota2;
    }
    public void setNota2(double n2){
        this.nota2=n2;
    }
    public double getNota3(){
        return this.nota3;
    }
    public void setNota3(double n3){
        this.nota3=n3;
    }
    public void calculaMedia(double nota1, double nota2, double nota3){
        double media = (nota1 + nota2 + nota3)/3;

    }
}
