package br.com.clinica.dal;

import java.sql.*;

/**
 * Escola Técnica de Brasília Curso Técnico de Informática/2024 Alunos: Célio
 * Rodrigues, Gustavo Peixoto, Lucas Pereira, Mônica Caetano e Lucas Pronto
 * Turma: 3º "A" - Matutino
 */
public class ModuloConexao {

    //Método responsável por  estabelecer a conexão com o banco
    public static Connection conector() {
        Connection conexao = null;
        
        // a linha abaixo "chama" o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        
        //Armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbclinica";
        String user = "root";
        String password = "";
        
        //Estabelecendo a conexão com o banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
             System.out.println(e);
            
            return null;
        }
    }

}
