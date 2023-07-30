package com.example;


public class AppClasses {

    public static void main(String[] args) {
        System.out.println("Criando uma classe");
        cliente Cliente = new cliente();
        Cliente.setAnoNascimento(1983);
        Cliente.setSalario(-2000);
        Cliente.setSexo('D');
        Cliente.setNome("");
        Cliente.setCPF("04972177403");
        Cliente.setCidade("Recife");
        System.out.println("O ano de nascimento do cliente é:" + Cliente.getAnoNascimento());
        System.out.println("O salario do cliente é:" + Cliente.getSalario());
        System.out.println("O sexo do cliente é:" + Cliente.getSexo());
        System.out.println("O nome do cliente 1 é:" +Cliente.getNome());
        System.out.println("O CPF do cliente é:" +Cliente.getCPF());

        cliente Cliente2 = new cliente();
        Cliente2.setAnoNascimento(1968);
        Cliente2.setSalario(140000);
        Cliente2.setSexo('F');
        Cliente2.setNome("    Gloria");
        Cliente2.setCPF("04972177403");
        Cliente2.setCidade("RECIFE");


    System.out.println("O ano de nascimento do cliente2 é:" + Cliente2.getAnoNascimento());
    System.out.println("O salario do cliente2 é:" + Cliente2.getSalario());
    System.out.println("O sexo do cliente2 é:" + Cliente2.getSexo());
    System.out.println("O cliente é especial?" + Cliente2.isEspecial());
    System.out.println("O nome do cliente2 é:" + Cliente2.getNome());
    System.out.println("O CPF do cliente2 é:" +Cliente2.getCPF());
 

    if (Cliente.getCPF().equals(Cliente2.getCPF()))
    System.out.println("Os CFPs são giuais");
    else
    System.out.println("Os CPFs são diferentes");

    if (Cliente.getCidade().equalsIgnoreCase(Cliente2.getCidade()))
    System.out.println("Os clientes moram na mesma cidade");
    else
    System.out.println("Os clientes moram em cidades diferentes");

    } 
}

