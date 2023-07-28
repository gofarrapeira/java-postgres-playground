package com.example;

class cliente {
    int AnoNascimento;
    double Salario;
    char Sexo;
}

    double getSalario(){
        return Salario;
    }

    void setSalario(double Salario){
        if(Salario>=0){
        this.Salario= Salario;
    }   else{
        System.out.println("O valor do salario deve ser maior  que zero");
    }
    }

public class AppClasses {
   public static void main(String[] args) {
        System.out.println("Criando uma classe");
        cliente Cliente = new cliente();
        Cliente.AnoNascimento=1983;
        //Cliente.Salario= 12000;
        Cliente.setSalario(-2000);
        Cliente.Sexo='F';
        System.out.println("O ano de nascimento do cliente é:" + Cliente.AnoNascimento);
        System.out.println("O salario do cliente é:" + Cliente.Salario);
        System.out.println("O sexo do cliente é:" + Cliente.Sexo);

        cliente Cliente2 = new cliente();
        cliente2.AnoNascimento=1968;
  // Cliente2.Salario= 120000;
         Cliente2.setSalario(140000);
         Cliente2.Sexo='F';

    System.out.println("O ano de nascimento do cliente é:" + Cliente2.AnoNascimento);
    System.out.println("O salario do cliente é:" + Cliente2.Salario);
    System.out.println("O sexo do cliente é:" + Cliente2.Sexo);
 
    } 
}

