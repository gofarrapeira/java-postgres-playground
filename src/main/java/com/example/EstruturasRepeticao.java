package com.example;

import java.util.Scanner;

public class EstruturasRepeticao {
    public static void main(String[] args) {
      //Usando while
        // int cc=0;
      //  while(cc<=20){
      //      cc++;
      //      if (cc==3 || cc==7){
//continue;
       //     }
       //     System.out.println("Cambalhota " +cc);

        //usando do...while
       // int cc=1;
//do{
     //       System.out.println("Cambalhota " + cc );
     //       cc=cc+1;
//            while(cc<=4);
Scanner teclado = new Scanner(System.in);
int numeroEscolhido;
int soma=0;
String desejaContinuar;
    do{
    System.out.println("Digite um numero");
    numeroEscolhido = teclado.nextInt();
    System.out.println("Voce deseja continuar? Digite S ou N");
    desejaContinuar = teclado.next();
    soma=soma+numeroEscolhido;}
     while (desejaContinuar.equals("S")); 
    System.out.println("A soma dos numeros escolhidos é: " +soma);
}
}

    

