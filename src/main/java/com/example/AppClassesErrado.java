package com.example;


class cliente {
    private int AnoNascimento;
    private double Salario;
    private char Sexo;

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
}

public class AppClassesErrado {

    public static void main(String[] args) {
        System.out.println("Criando uma classe");
        cliente Cliente = new cliente();
        Cliente.setAnoNascimento(1983);
        Cliente.setSalario(-2000);
        Cliente.setSexo('D');
        System.out.println("O ano de nascimento do cliente é:" + Cliente.getAnoNascimento());
        System.out.println("O salario do cliente é:" + Cliente.getSalario());
        System.out.println("O sexo do cliente é:" + Cliente.getSexo());

        cliente Cliente2 = new cliente();
        Cliente2.setAnoNascimento(1968);
        Cliente2.setSalario(140000);
        Cliente2.setSexo('F');

    System.out.println("O ano de nascimento do cliente2 é:" + Cliente2.getAnoNascimento());
    System.out.println("O salario do cliente2 é:" + Cliente2.getSalario());
    System.out.println("O sexo do cliente2 é:" + Cliente2.getSexo());
 
    } 
}

