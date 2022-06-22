/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Plauchu
 */
public class PruebaFiguraGeom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AplicacionGeometrica aplicacion= new AplicacionGeometrica();
        
        aplicacion.altaCirculo(5);
        aplicacion.altaCirculo(10);
        aplicacion.altaCirculo(15);
        aplicacion.altaCuadrilatero(2);
        aplicacion.altaCuadrilatero(3);
        aplicacion.altaCuadrilatero(4);
        aplicacion.altaCuadrilatero(4, 8);
        aplicacion.altaTriangulo(7, 2, 1, "Equilátero");
        
        //System.out.println(aplicacion.toString());
        //System.out.println(aplicacion.datosCircGrand());
        //System.out.println(aplicacion.totCuadrados());
        //System.out.println(aplicacion.eliminaTrianEquila());
        //System.out.println(aplicacion.areaFiguras());
        System.out.println(aplicacion.toString());
    }
    
}
