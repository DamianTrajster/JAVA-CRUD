/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author damia
 */
public class conexionSQL {
    
        Connection conectar= null;

    
    public Connection conexion() {
                   
            try {
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/prueba","root","");
                 
                 JOptionPane.showMessageDialog(null,"conexion exitosa");
            } catch (Exception e) {
                
                System.out.println(e.getMessage());
            }
            
            return conectar;
    }
 
    
}
