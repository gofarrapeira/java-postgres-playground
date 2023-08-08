package com.example;

public class UltraFighterEmoji {
    public static void main(String[] args) {
        Lutador lutador1[] = new Lutador[3];
        lutador1[0] = new Lutador("Boy", "França", 31, 1.75f, 68.9f,11, 2, 1); 
        lutador1[1] = new Lutador("SnapShadow", "Brasil", 29, 1.65f, 70.9f,12, 2, 3); 
        lutador1[2] = new Lutador("PutScript", "Angola", 20, 1.87f, 120.1f,9, 3, 5); 
       // lutador1[0].apresentar();
       // lutador1[1].apresentar();
//lutador1[2].apresentar();
   //     lutador1[1].setDerrotas(2);
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(lutador1[0], lutador1[1]);
       // UEC01.lutar();
    }
}
