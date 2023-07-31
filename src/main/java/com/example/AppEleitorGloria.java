package com.example;

import java.util.Scanner;

public class AppEleitorGloria {
    int idade;

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
        if (idade<16){
            System.out.println("Não é eleitor");}
            else if (idade >15 && idade<18){
                System.out.println("Eleitor facultativo");}
            else if (idade>=18 && idade<=70){
                System.out.println("Eleitor obrigado a votar");
            }    
            }
    
    public static void main(String[] args) {
        AppEleitorGloria Eleitor = new AppEleitorGloria();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        Eleitor.setIdade(scanner.nextInt());

    }
}
