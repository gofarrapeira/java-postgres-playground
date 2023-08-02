/*escreva um programa que recebe gera um numero aleatorio e para ele, calcula os valores: resto da divisao por dois,
*numero elevado a 3, raiz quadrada, valor absoluto, arredondamento pra cima, pra baixo e aritmetico
 */
package com.example;

import java.util.Random;

public class Calculadora {
     
    public static void main(String[] args) {
        Random numeroGerado = new Random();
        //usar o ramdom para gerar um numero entre 1 e 50
        int numero= numeroGerado.nextInt(50) + 1;
         System.out.println(numero);   
   // int y = numero%2;
   // System.out.println("O resto da divisao do numero gerado por 2 é" +y);   
  //  double a = Math.pow(numero, 3);
  //  System.out.println("Numero gerado elevado ao cubo é" +a);


    }
}
