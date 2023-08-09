package com.example;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, float al,float pe, int vi, int de, int emp){
        this.nome =no;
        this.nacionalidade=na;
        this.idade=id;
        this.altura=al;
        this.setPeso(pe);
        this.vitorias=vi;
        this.derrotas=de;
        this.empates=emp;
        }

    public String getNome(){
         return this.nome;
    }
    public void setNome(String n){
        this.nome=n;
    }
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    public void setNacionalidade(String a){
        this.nacionalidade=a;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int i){
        this.idade=i;
    }
    public float getAltura(){
        return this.altura;
    }
    public void setAltura(int al){
        this.altura=al;
    }
    public float getPeso(){
        return this.peso;
            }
    public void setPeso(float p){
        this.peso=p;
        this.setCategoria();
    }
    public String getCategoria(){
        return this.categoria;
    }
    public void setCategoria(){
        if(this.getPeso()<52.2f){
            System.out.println("Lutador" +getNome() + "está fora faixa");
            this.categoria="Lutador fora de faixa";
        }
        else if (this.getPeso()>52.2 && this.getPeso()<70.3f){
            System.out.println("O lutador " +getNome() + "é peso leve");
            this.categoria="Lutador é peso leve";}
        else if(this.getPeso()>70.3f && this.getPeso()<83.9f){
            System.out.println("O lutador " +getNome() + "é peso medio");
            this.categoria="Lutador é peso médio";}
        else if(this.getPeso()>80.3f && this.getPeso()<120.2f){
                System.out.println("O lutador " +getNome() + "é peso pesado");
                this.categoria="Lutador é peso pesado";}
                else{
                    this.categoria="Lutador está fora de faixa";
                    System.out.println("Lutador" +getNome() + "está fora faixa");}
    }

    public int getVitorias(){
        return this.vitorias;
    }            
    public void setVitorias(){
        System.out.println("O numero de vitorias era" +getVitorias());
        this.vitorias= getVitorias() +1;
        System.out.println("O numero de vitorias agora é" +getVitorias());
    }
    public int getDerrotas(){
        return this.derrotas;
    }            
    public void setDerrotas(){
        System.out.println("O numero de derrotas era" + getDerrotas());
        this.derrotas= getDerrotas() +1;
        System.out.println("O numero de derrotas agora é" + getDerrotas());
    }
    public int getEmpates(){
        return this.empates;
    }            
    public void setEmpates(){
        System.out.println("O numero de empates era" + getEmpates());
        this.empates= getEmpates() +1;
        System.out.println("O numero de derrotas agora é" + getEmpates());
    }
    
    public void apresentar(){
        System.out.println("CHEGOU A HORA!!! APRESENTAMOS O LUTADOR: " + getNome());
        System.out.println("O lutador é de: " + getNacionalidade());
        System.out.println("PESO: " + getPeso());
        System.out.println("IDADE: " + getIdade());
        System.out.println("Sua categoria é " + getCategoria());
        System.out.println("Vitorias: " + getVitorias());
    }
    }

