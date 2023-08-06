package com.example;

public class controleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    controleRemoto(){
        this.volume=50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getvolume(){
        return this.volume;
    }

    public void setvolume(int v){
        this.volume = v;
    }

    public boolean getligado(){
        return this.ligado;
    }
    public void setligado(boolean l){
        this.ligado=l;
    }

    public boolean gettocando(){
        return this.tocando;
    }

    public void settocando(boolean t){
        this.tocando = t;
    }

    public void ligar(){
            this.setligado(true);
        }

    public void desligar(){
        this.setligado(false);
    }    
    public void abrirMenu(){
        System.out.println("MENU");
        System.out.println("Esta ligado?" + this.getligado());
        System.out.println("Esta tocando?" + this.getvolume());
        for (int i = 0; i < this.getvolume(); i++) {
            System.out.print("|");
        }
    }

    public void fecharMenu(){
        System.out.println("Fechando menu");
    }    

    public void aumentarVolume(){
        if (this.getligado() ==true){
            this.setvolume(this.getvolume() + 5); 
        }
    }
    public void diminuirVolume(){
        if ((this.getligado() ==true)&&(this.gettocando()==true)&&(this.getvolume()>5)){
            this.setvolume(this.getvolume() -5); 
        }
    }
    public void ligarMudo(){
        if (this.getligado() && this.getvolume()>0){
            this.setvolume(0);
        }
    }

    public void desligarMudo(){
        if(!this.getligado() && this.getvolume()==0){
            this.setvolume(5);
        }
    }   
    public void play(){
        if(this.getligado() && !this.gettocando()){
            this.settocando(true);
        }
    } 
    public void pause(){
        if (this.gettocando() && this.getligado()){
            this.settocando(false);
        }
    }

    


    


    }

