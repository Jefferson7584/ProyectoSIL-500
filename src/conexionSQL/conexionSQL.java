/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionSQL;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author JEFFERSON
 */
public class conexionSQL {
    
      Connection conectar = null;
      
      public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/db_carnet_propiedad", "root", "");
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexion ERROR" + e.getMessage());
        }
        return conectar;
    }

    
}
