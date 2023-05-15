
package exemplo.swing.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/*
CLASS DAO - OBJETO DE ACESSO AOS DADOS
UMA CLASS QUE VAI FAZER INTERAÇÃO COM O BANCO DE DADOS PARA MANIPULAR
INFORMAÇÕES DIRETO NO BANCO
*/
public class ValetDAO {
    public Connection conectar(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancotestesjava?zeroDateTimeBehavior=CONVERT_TO_NULL", 
                    "root", "andreza");
            System.out.println("Conectou");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("Erro");
        } catch(SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
    
    public void desconectar(Connection conn){
        try {
            if(conn != null){
                conn.close();
                System.out.println("desconectou");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        ValetDAO dao = new ValetDAO();
        dao.desconectar(dao.conectar());
    }
}

