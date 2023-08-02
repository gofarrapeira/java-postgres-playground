package com.example;

import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {
        Scanner leNota = new Scanner(System.in);
        System.out.println("Digite a nota 1:");
        float nota1= leNota.nextFloat();
        System.out.println("Digite a nota2:");
        float nota2=leNota.nextFloat();
        float media = (nota1+nota2)/2;
        if (media>=9)
        System.out.println("Aluno aprovado com media: " +media);
        else
        System.out.println("Aluno reprovado com media:" +media);
    }
}
