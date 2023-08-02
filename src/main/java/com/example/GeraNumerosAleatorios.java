package com.example;
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class GeraNumerosAleatorios {
    public static void main(String[] args) {
        Random aleatorio = new Random ();
        Scanner scanner = new Scanner(System.in);

        int x= aleatorio.nextInt(5);
        System.out.println("Digite um numero até 5");
        System.out.println();
        int numeroDigitado = scanner.nextInt();
            if (numeroDigitado>5)
            System.out.println("Digite um numero ate 5");
            else if (x==numeroDigitado)
            System.out.println("Acertou o palpite" +x);
            else
            System.out.println("Errrou! O numero era:" +x );
        }
        
        }
                
        

