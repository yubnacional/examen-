/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.conexion.Conexion;
import modelo.entidades.Empleado;
import modelo.interfaz.Operaciones;

/**
 *
 * @author usuario
 */
public class EmpleadoDAO extends Conexion implements Operaciones{

     private PreparedStatement ps;
     private ResultSet rs;
     private String sql;
     
    @Override
    public boolean insertarEmpleado(Empleado e) {
        boolean rptaInsertar=false;
        
        sql="insert into empleado(idEmpleado, numeroDocumento, tipoDocumento, nombre, sueldoAsignado, descuento, sueldoFinal) values (?,?,?,?,?,?,?)";
        try {
            ps=conectar().prepareStatement(sql);
            ps.setInt(1, e.getIdEmpleado());
            ps.setInt(2, e.getNumeroDocumento());
            ps.setString(3, e.getTipoDocumento());
            ps.setString(4, e.getNombre());
            ps.setDouble(5, e.getSueldoAsignado());
            ps.setDouble(6, e.getDescuento());
            ps.setDouble(7, e.getSueldoFinal());
            
            if (ps.executeUpdate()==1) {
                rptaInsertar=true;
            }
        } catch (Exception sqle) {
            JOptionPane.showMessageDialog(null, " Ingreso Fallido "+sqle.getMessage());
        }
        return rptaInsertar;
        
    }
   // prueba metodo insertar
    public static void main(String[] args) {
        EmpleadoDAO d=new EmpleadoDAO();
        System.out.println(d.insertarEmpleado(new Empleado(0, 100000, "cedula", "yuber", 450000.0, 0.0, 450000.0)));   
        
    }
    @Override
    public ArrayList<Empleado> verEmpleado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarEmpleado(Empleado e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean borrarEmpleado(Empleado e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Empleado> filtrarEmpleado(String campo, String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
