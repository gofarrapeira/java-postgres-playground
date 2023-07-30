package com.example;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        cliente cliente1 = new cliente();
        
        cliente1.setAnoNascimento(1990);
        cliente1.setCidade("Roma");
        cliente1.setCPF("99944455596");
        cliente1.setNome("Ana");
        cliente1.setSalario(32000);
        cliente1.setSexo('F');

        cliente cliente2 = new cliente();
        cliente2.setAnoNascimento(1980);            
        cliente2.setCidade("Paris");
        cliente2.setCPF("22288844455");
        cliente2.setNome("João");
        cliente2.setSalario(31000);
        cliente2.setSexo('M');
        
        boolean cliente1MaisNovo =cliente1.getAnoNascimento() > cliente2.getAnoNascimento(); 
        boolean cliente1MaisVelho =cliente1.getAnoNascimento() < cliente2.getAnoNascimento(); 

        if (cliente1MaisNovo)
            System.out.println("O cliente 2 é mais velho");
        else if (cliente1MaisVelho)
            System.out.println("O cliente 1 é mais velho");
            else         
            System.out.println("Os clientes têm a mesma idade");
    }
}
