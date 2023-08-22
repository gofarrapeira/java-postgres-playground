package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AppDB {

    private static final String PASSWORD = "";
    private static final String GITPOD = "gitpod";
    private static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";


    public static void main(String[] args) {
        new AppBD();

    }
       public AppBD(){
        try(var conn = getConnection()){
            listarEstados(conn);
            carregarDriverJDBC();
            listarEstados(getConnection());
            localizarEstado(getConnection(), GITPOD);
        }catch(SQLException e){
            System.err.println("Não foi possivel conecar ao banco de dados");
        }
       }
       private void localizarEstado(Connection conn, String uf){
        try{
            var sql  = "select * from estado where uf = ? ";
            var statement = conn.prepareStatement(sql);
            statement.setString(1, uf);
            var result= statement.executeQuery();
            if(result.next()){
                System.out.printf("ID: %d Nome: %s UF: %s \n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
            }}
            catch(SQLException e){
                System.err.println("Erro ao executar consulta SQL: " +e.getMessage());

            }}
        
    private static void listarEstados(Connection conn) {
            try{
                System.out.println("Conexao realidada com suceso");

                var statement = conn.createStatement();
                var result= statement.executeQuery("Select * from estado");
                while(result.next()){
                    System.out.printf("Id: %d  Nome: %s  UF: %s \n" , result.getInt("id"),result.getString("nome"),result.getString("UF"));
                 }
            catch(SQLException e){
                System.err.println("Erro ao executar a consulta sql");
                }
    }

    private static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL,GITPOD,PASSWORD);
    }

    private static void carregarDriverJDBC() {
    }


    private static void extracted() {
        try {
                Class.forName("org.postgresql.Driver");}
        catch (ClassNotFoundException e) {
                    System.err.println("Não conseguiu conectar ao banco de dados");
                 }
    }}
    
