package com.example;

import java.util.Scanner;

public class AppScanner {

    public static void main(String[] args) {
        System.out.println("Criando uma classe");
        cliente Cliente = new cliente();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        Cliente.setNome(scanner.nextLine());

        System.out.println("Digite seu CPF");
        Cliente.setCPF(scanner.nextLine());

        System.out.println("Digite sua cidade");
        Cliente.setCidade(scanner.nextLine());

        System.out.println("Digite seu salario");
        Cliente.setSalario(scanner.nextDouble());
      
        scanner.nextLine();
        System.out.println("Digite seu sexo");
        String sexo = scanner.nextLine();
         Cliente.setSexo(sexo.charAt(0));


       // Cliente.setAnoNascimento(1983);
      //  Cliente.setSalario(-2000);
      //  Cliente.setSexo('D');
      //  Cliente.setNome("");
      //  Cliente.setCPF("04972177403");
      //  Cliente.setCidade("Recife");
        System.out.println("O ano de nascimento do cliente é:" + Cliente.getAnoNascimento());
        System.out.println("O salario do cliente é:" + Cliente.getSalario());
        System.out.println("O sexo do cliente é:" + Cliente.getSexo());
        System.out.println("O nome do cliente 1 é:" +Cliente.getNome());
        System.out.println("O CPF do cliente é:" +Cliente.getCPF());

       

    } 
}

