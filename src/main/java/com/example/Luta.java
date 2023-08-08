package com.example;

import java.util.Random;

public class Luta {
   private Lutador desafiado;
   private Lutador desafiante;
   private int rounds;
   private boolean aprovar;

   public Lutador getDesafiado(){
    return this.desafiado;
   }
   public void setDesafiado(Lutador d1){
    this.desafiado=d1;
   }
   public Lutador getDesafiante(){
    return this.desafiante;
   }
   public void setDesafiante(Lutador d2){
    this.desafiado=d2;
   }
   public int getRounds(){
    return this.rounds;
   }
    public void setRounds(int r){
    this.rounds=r;
   }
   public boolean getAprovar(){
    return this.aprovar;
   }
   public void setAprovar(boolean a){
    this.aprovar=a;
   }
   public void marcarLuta(Lutador l1,Lutador l2){
    if (l1.getCategoria().equals(l2.getCategoria()) && (l1 !=l2)) {
        this.aprovar=true;
        this.desafiado=l1;
        this.desafiante=l2; }
        else {
            this.aprovar=false;
            this.desafiado=null;
            this.desafiante=null;
        }}
    public void lutar(){
        if (this.aprovar=true){
           System.out.println("###Apresentando o desafiado###"); 
           this.desafiado.apresentar();
           System.out.println("###Apresentando o desafiante###"); 
            desafiante.apresentar();
            Random aleatorio = new Random();
            int x= aleatorio.nextInt(2);
            System.out.println(x);
            if(x==0){
                System.out.println("EMPATOU");}
            else if(x==1){
                System.out.println("O desafiado ganhou a luta");
                        }
            else if (x==2){
                System.out.println("O desafiante ganhou a luta");
            }

            }
            else {
            System.out.println("A luta não pode acontecer, pois não foi aprovada");
        }
    }
}
        
   


