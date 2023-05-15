package testeDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        
        String strCon = "jdbc:mysql://localhost:3306/bancotestesjava?autoReconnect=true&useSSL=false";
        
        try{
            System.out.println("Testando driver...");
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver ok!");
            
            
            Connection c = DriverManager.getConnection(strCon,
                    "root", "andreza");
            System.out.println("Conectado");
            
            
        }catch(ClassNotFoundException ex){
            System.out.println("Driver bichado >>>");
        }catch(SQLException e){
            e.setNextException(e);
            System.out.println("String de coneccao bixada");
        }
    }
}
