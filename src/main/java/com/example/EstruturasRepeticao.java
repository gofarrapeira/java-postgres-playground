package com.example;

public class EstruturasRepeticao {
    public static void main(String[] args) {
        int cc=0;
        while(cc<=20){
            cc++;
            if (cc==3 || cc==7){
                continue;
            }
            System.out.println("Cambalhota " +cc);
        }
        
    }
}
