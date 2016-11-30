/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josue
 */
public class Conexion {
    
    public static Connection DB(){
    
        String driver = "com.mysql.jdbc.Driver";
        String url ="jdbc:mysql://localhost/mercadeodb";
        Connection c = null;
        
        try {
            Class.forName(driver);
            c = DriverManager.getConnection(url, "root", "kamalkalaf");
            
        } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);

        }catch(SQLException ex)
        {
           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
        
}
    
}
