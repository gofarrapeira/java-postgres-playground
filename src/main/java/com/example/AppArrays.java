package com.example;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);

       // int x= 20;
       // System.out.println(x);

        double vetor[] = {10, 20, 30, 40};
        System.out.println(Arrays.toString(vetor));

        System.out.println("O valor da posicao 1 é " + vetor[0]);
        System.out.println("O valor da posicao 2 é " + vetor[1]);
        System.out.println("O valor da posicao 3 é " + vetor[2]);
        System.out.println("O valor da posicao 4 é " + vetor[3]);

        vetor[2]=60;
        System.out.println(vetor[2]);

        //Criar o vetor sem inicializar
        int vetorNaoInicializado[] = new int [3];
        //vetorNaoInicializado[0]=22;
        //vetorNaoInicializado[1]=44;
        //vetorNaoInicializado[2]=88;
        for (int i = 0; i < vetorNaoInicializado.length; i++) {
            vetorNaoInicializado[i] = 22 * (i+1);
        }
           System.out.println(Arrays.toString(vetorNaoInicializado));
        ;
        //definindo uma matriz 2x3
        double matriz[][]={{10,20,30},{40,50,60}};
        //alterando a primeira linha da matriz 
        matriz[0]= new double[]{1,2,3,4};

        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));





        

    }
}
