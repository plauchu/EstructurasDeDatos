/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Plauchu
 */
public class Empleado {
    
    private static int serie=100;
    private int claveEmpleado;
    private String nombreEmpleado;
    private double sueldoBase;

    public Empleado() {
        claveEmpleado=serie;
        serie++;
    }
    
    public Empleado(String nombreEmpleado, double sueldoBase) {
        this();
        this.nombreEmpleado = nombreEmpleado;
        this.sueldoBase = sueldoBase;
    }
    
    public Empleado(int clave) {
        this.claveEmpleado=clave;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getClaveEmpleado() {
        return claveEmpleado;
    }
    
    
    public String toString(){
        StringBuilder res= new StringBuilder();
        
        res.append("Empleado: "+nombreEmpleado);
        res.append("\nClave: "+claveEmpleado);
        res.append("\nSueldo: "+sueldoBase);
        
        return res.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (this.claveEmpleado != other.claveEmpleado) {
            return false;
        }
        return true;
    }
    
    public double calculaSalario(double prestac, double deduc){
        return sueldoBase+prestac-deduc;
    }
}
