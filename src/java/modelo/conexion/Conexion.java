/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Conexion {
    String url;
    String user;
    String pass;
    String driver;
    Connection con;

    public Conexion() {
        url="jdbc:mysql://localhost/descuento";
        user="root";
        pass="";
        driver="org.gjt.mm.mysql.Driver";
        con= null;
        


    }
    
    public Connection conectar(){
        try {
            
           Class.forName(driver);
           con=DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Ingreso Fallido "+e.getMessage());
        }
        return con;
    }
    
    
    
}
