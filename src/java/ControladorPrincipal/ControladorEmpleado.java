/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorPrincipal;

import java.util.ArrayList;
import modelo.dao.EmpleadoDAO;
import modelo.entidades.Empleado;
import modelo.interfaz.Operaciones;

/**
 *
 * @author usuario
 */
public class ControladorEmpleado implements Operaciones {
    EmpleadoDAO modelo = new EmpleadoDAO();
    
    public double DimeDescuento(double des){
        double descuento =0;
        if (des>500000 && des<1000000  ) {
            descuento = 10.0;
        }
        else if (des>1000000){
            descuento = 20.0;
        }
        else {
            descuento = 0.0;
        }
        return descuento;
    }
   
    public double CalculaDescuento(double des){
         double descuento =0;
        if (des>500000 && des<1000000  ) {
            descuento = des - (des * 0.10) ;
        }
        else if (des>1000000){
            descuento = des - (des * 0.20);
        }
        else {
            descuento = des;
        }
        return descuento;
     
    }
    
        public boolean insertarEmpleado(Empleado e) {
        return modelo.insertarEmpleado(e);
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
