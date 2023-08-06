package com.example;

import java.net.ContentHandler;

public class AppOperacoesBancarias {
    public static void main(String[] args) {
       Conta conta1= new Conta();
conta1.setNomeCliente("Maria");;
conta1.setnumeroConta(22);
conta1.setsaldoConta(32000f);
conta1.settipoConta("CC");
conta1.setstatusConta(false);

conta1.abrirConta("CC");
conta1.depositar(2400);
conta1.pagarMensalidade();
    }
}
