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
public class PruebaAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Escuela ITAM = new Escuela ("ITAM","Rio hondo",6);
        
        ITAM.altaAlum("Rodrigo");
        ITAM.altaCali(100, 9);
        ITAM.altaCali(100, 8);
        ITAM.altaCali(100, 8);
        ITAM.altaAlum("Santiago");
        ITAM.altaCali(101, 7);
        ITAM.altaCali(101, 7);
        ITAM.altaCali(101, 8);
        ITAM.altaAlum("Mauricio");
        ITAM.altaCali(102, 9);
        ITAM.altaCali(102, 8);
        ITAM.altaCali(102, 8);
        
        System.out.println(ITAM.toString());
        System.out.println(ITAM.nomYprom());
        System.out.println("Mejor Alumno: "+ITAM.mejorAlumno());
        System.out.println("Mejores Alumnos: "+ITAM.mejoresAlumnos());
        //System.out.println(ITAM.getDatosAlumno(100));
    }
    
}
