package com.example;

public class cliente {
    private int AnoNascimento;
    private double Salario;
    private char Sexo;
    private boolean Especial;
    private String Nome;
    private String CPF;
    
    public cliente(){
        System.out.println("Criando um cliente sem parâmetros");
        double aleatorio = Math.random();
        if (aleatorio >0.5)
        Especial=true;
    }

    public cliente(double renda, char sexo){
        this();
        this.Salario=200000;
        this.Sexo='M';
    }    

    public String getNome(){
        return Nome;
    }

    public void setNome(String nome){
        Nome=nome;
    }

    public boolean isEspecial() {
        return Especial;
    }

    public void setEspecial(boolean especial) {
        Especial = especial;
    }
    public double getSalario(){
        return Salario;
    }

        void setSalario(double Salario){
        if(Salario>=0)
        this.Salario= Salario;
        else
        System.out.println("O valor do salario deve ser maior  que zero");
    }

    public int getAnoNascimento(){
        return AnoNascimento;
    }
    void setAnoNascimento(int AnoNascimento){
        if (AnoNascimento>=1900)
        this.AnoNascimento=AnoNascimento;
        else
        System.out.println("O ano de nascimento deve ser maoir que 1900");
    }

    public char getSexo(){
        return Sexo;
    }

    void setSexo(char Sexo){
        if (Sexo != 'M' &&  Sexo !='F')
        System.out.println("So existem dois sexos: Feminino e Masculino");
        else 
        this.Sexo=Sexo;
    }

    public String getCPF(){
        return CPF;
    }

    void setCPF(String cpf){
        CPF=cpf;
    }
}