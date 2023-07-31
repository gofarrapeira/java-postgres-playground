package com.example;

import java.time.LocalDate;

public class Cidadao {
   private LocalDate DataNascimento;

    public LocalDate getDataNascimento(){
        return DataNascimento;
    }

    public void setDataNascimento(LocalDate DataNascimento){
        this.DataNascimento= DataNascimento;
    }
    public int idade(){
      return LocalDate.now().getYear() - DataNascimento.getYear();
    }

    public String eleitor() {

        int idade = idade();

        if (idade<16)
            return "Não é eleitor";

        if (idade>15 && idade<18 || idade>70)
            return "Eleitor facultativo";

        return "Obrigado  a votar";
     }
    }