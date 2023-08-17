package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathUtilTest {
    @Test
    public void mdcProprieade1Impar(){
        int a = 6; 
        int b= 3;

       int esperado  =3;
       int obtido = MathUtil.mdc(a,b);

        assertEquals(esperado,obtido);

    }
    @Test
    public void mdcProprieade1Par(){
        int a = 6; 
        int b= 2;

       int esperado  =2;
       int obtido = MathUtil.mdc(a,b);

        assertEquals(esperado,obtido);

}
@Test
public void mdcProprieade2(){
int a = -6; 
int b= 0;

int esperado  =6;
int obtido = MathUtil.mdc(a,b);

assertEquals(esperado,obtido);

}
@Test
public void mdcProprieade2NumeroPos(){
int a = 6; 
int b= 0;

int esperado  =6;
int obtido = MathUtil.mdc(a,b);

assertEquals(esperado,obtido);

}

}
