/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Junior
 */
public class conexion {
        public  Connection abrir(){
        
        Connection c=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
           
                c=DriverManager.getConnection("jdbc:mysql://localhost/planillas","root","root");
                
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "error en la conexion");           
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "error en el driver");
        }
        
        
        
         return  c;
        
        
    }
     
}
