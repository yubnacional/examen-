/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.interfaz;

import java.util.ArrayList;
import modelo.entidades.Empleado;

/**
 *
 * @author usuario
 */
public interface Operaciones {
    public boolean insertarEmpleado(Empleado e);
    public ArrayList<Empleado> verEmpleado ();
    public boolean actualizarEmpleado (Empleado e);
    public boolean borrarEmpleado (Empleado e);
    public ArrayList<Empleado> filtrarEmpleado (String campo, String valor);
}