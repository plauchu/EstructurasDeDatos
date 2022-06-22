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
public class Administrativo extends Empleado {
    
    private String departamento;
    private String telefono;

    public Administrativo() {
        
    }

    public Administrativo(String departamento, String telefono, String nombreEmpleado, double sueldoBase) {
        super(nombreEmpleado, sueldoBase);
        this.departamento = departamento;
        this.telefono = telefono;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
    public String toString (){
        StringBuilder res= new StringBuilder();
        
        res.append(super.toString());
        res.append("\nDepartamento: "+departamento);
        res.append("\nTelefono: "+telefono);
        
        return res.toString();
    }
   

    
}
