package com.example;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(String no, int id, char se){
        this.nome = no;
        this.idade= id;
        this.sexo=se;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome=n;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int i){
        this.idade=i;
    }
    public char getSexo(){
        return this.sexo;
    }
    public void setSexo(char s){
        this.sexo=s;
    }

    public void fazerAniversario(){
        this.idade = this.getIdade() + 1;
        System.out.println("Parabens, agora voce tem: " + this.getIdade());
        
    }



}
