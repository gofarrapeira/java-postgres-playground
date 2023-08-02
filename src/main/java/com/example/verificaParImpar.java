package com.example;

import java.util.Scanner;

public class verificaParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero 1:");
        int numero1 = teclado.nextInt();
        if (numero1%2==0){
            System.out.println("O numero é par");}
            else 
            System.out.println("Numero impar");
        }


    }

