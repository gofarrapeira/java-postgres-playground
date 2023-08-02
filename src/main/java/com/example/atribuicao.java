package com.example;
import java.lang.Math;

public class atribuicao {
        public static void main(String[] args) {
            int a=1;
            int b=2;
            System.out.println("Valor inicial a = " + a);
            System.out.println("Valor inicial b = " + b);
            System.out.println("Fazendo a +=b");
            a +=b;
            System.out.println("Agora a = " + a);
            System.out.println();
            
            System.out.println("Fazendo a -=b");
            a -=b;
            System.out.println("Agora a = " + a);
            System.out.println("Fazendo a *=b");
            a *=b;
            System.out.println("Agora a = " + a);
            System.out.println("Fazendo a +=2 ");
            a +=2;
            System.out.println("Agora a = " + a);
            System.out.println();
            
            System.out.println("Fazendo a /=b");
            a /=b;
            System.out.println("Agora a = " + a);
            System.out.println();

            float v = 8.3f;
            int arredondado = (int)Math.round(v);
            System.out.println(arredondado);

            double aleatorio = Math.random();
            System.out.println(aleatorio);
        }
    
    }
    

