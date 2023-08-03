package com.example;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = teclado.nextInt();
        int fatorial=1;
        int variavelControle= numero;
        while(variavelControle>0){
            fatorial = fatorial*variavelControle;
            variavelControle--;
        }
        System.out.println("O fatorial de " + numero + " é " +fatorial);
            }

        
    }

