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
public class PruebaEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empresa itam= new Empresa("ITAM", "Río hondo", "Bailleres");
        
        itam.altaAdministrativo("Becas", "5510 2020", "Luis", 5000);
        itam.altaAdministrativo("Deportes", "5510 3020", "Jose", 6000);
        itam.altaAdministrativo("Caja", "5510 2030", "Ernesto", 7000);
        itam.altaOperario(8, "Roberto", 1000);
        itam.actualizaSueldoAdmin(100, 1.1);
        itam.cambioDeptoAdmin(101, "Matemáticas");
        
        //System.out.println("Sueldo calculado operario: "+itam.datosOperario(103, 100, 10, 100));
        //System.out.println(itam.reporteSueldoMenorA(7000));
        //System.out.println(itam.nomYsueldoAdmin());
        //System.out.println(itam.toString());
        
    }
    
}
