/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidades;

/**
 *
 * @author usuario
 */
public class Empleado {
    
    int idEmpleado;
    int numeroDocumento;
    String tipoDocumento;
    String nombre;
    double sueldoAsignado;
    double descuento;
    double sueldoFinal;

    public Empleado() {
    }

    public Empleado(int idEmpleado, int numeroDocumento, String tipoDocumento, String nombre, double sueldoAsignado, double descuento, double sueldoFinal) {
        this.idEmpleado = idEmpleado;
        this.numeroDocumento = numeroDocumento;
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
        this.sueldoAsignado = sueldoAsignado;
        this.descuento = descuento;
        this.sueldoFinal = sueldoFinal;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoAsignado() {
        return sueldoAsignado;
    }

    public void setSueldoAsignado(double sueldoAsignado) {
        this.sueldoAsignado = sueldoAsignado;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getSueldoFinal() {
        return sueldoFinal;
    }

    public void setSueldoFinal(double sueldoFinal) {
        this.sueldoFinal = sueldoFinal;
    }

   
    
}
