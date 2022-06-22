/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractos;

/**
 *
 * @author Plauchu
 */
public class Operario extends Empleado{
    
    private int horasExtras;

    public Operario() {
        
    }
    
    public Operario(int clave) {
        super(clave);
    }

    public Operario(int horasExtras, String nombreEmpleado, double sueldoBase) {
        super(nombreEmpleado, sueldoBase);
        this.horasExtras = horasExtras;
    }
    
    public String toString(){
        StringBuilder res= new StringBuilder();
        
        res.append(super.toString());
        res.append("\nHoras Extras: "+horasExtras);
        
        return res.toString();
    }
    
    public double calculaSalario(double prestac, double deduc) {
        return sueldoBase+prestac-deduc;
    }
    
    public double calculaSalario (double prestac, double deduc, double precioHE){
        return getSueldoBase()+prestac+(horasExtras*precioHE)-deduc;
    }   
    
}

