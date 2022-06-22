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
public class PruebaAplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Aplicacion objeto= new Aplicacion();
        
        objeto.altaAvion("Aeromexico", 70);
        objeto.altaPajaro("Polinizador", "Jungla");
        objeto.altaPajaro("Carnivoro", "Jungla");
        objeto.actualizaHabitat(2, "Desierto");
        
        //System.out.println(objeto.datosPajaro(1));
        //System.out.println(objeto.cuantosPasajeros(1));
        System.out.println(objeto.toString());
        
    }
    
}
