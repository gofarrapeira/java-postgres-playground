package com.example;

import java.sql.DriverManager;
import java.sql.SQLException;

public class AppDB {
    public static void main(String[] args) {
    try {
            Class.forName("org.postgresql.Driver");
       var conn= DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "gitpod", "");
        System.out.println("Conexao realidada com suceso");

       var statement = conn.createStatement();
       var result = statement.executeQuery("select * from estado");
       while(result.next()){
           System.out.printf("UF: %d  Nome: %S  UF: %s \n" , result.getInt("id"),result.getString("nome"),result.getString("UF"));
        }
    } catch (ClassNotFoundException e) {
        System.err.println("Não conseguiu conectar ao banco de dados");
     } catch (SQLException e) {
        System.err.println("Nao foi possivel fazer conexao com o BD");
    }
      
}
}

