
package exemplo.swing.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
     public Connection getConnection() {
        try {
            return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/bancotestesjava?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "andreza");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
     }
}
