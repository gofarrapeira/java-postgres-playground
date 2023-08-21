package com.example;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AppDB {
    public static void main(String[] args) {
    try {
            Class.forName("org.postgresql.Driver");}
    catch (ClassNotFoundException e) {
                System.err.println("Não conseguiu conectar ao banco de dados");
             }
    Statement statement =null;
    try(var conn= DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "gitpod", "")){
        System.out.println("Conexao realidada com suceso");

       statement = conn.createStatement();
       var result = statement.executeQuery("select * from estado");
       while(result.next()){
           System.out.printf("Id: %d  Nome: %s  UF: %s \n" , result.getInt("id"),result.getString("nome"),result.getString("UF"));
        }
    }  catch (SQLException e) {
        if(statement==null){
            System.err.println("Nao foi possivel fazer conexao com o BD");}
        else{
             System.err.println("Erro na consulta ao banco de dados");}
    }
      
    }}
    
