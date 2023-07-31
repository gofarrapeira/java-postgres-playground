package com.example;

import java.time.LocalDate;

public class AppEleitor {
    public static void main(String[] args) {
        var cidadao = new Cidadao();
        cidadao.setDataNascimento(LocalDate.of(1983, 7, 22));
        System.out.println(cidadao.eleitor());
        System.out.println(cidadao.idade());

    }
    }

