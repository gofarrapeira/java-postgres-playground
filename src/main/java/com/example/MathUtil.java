package com.example;

public class MathUtil {
   public static int mdc(int a, int b){
    //propriedade 1
    if(b>0 && a%b==0) {
        return  b;}
    //propriedade2
        if (b==0){
            return Math.abs(a);
        }
    
    
    return -1;}
}
