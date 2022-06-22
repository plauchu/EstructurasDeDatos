/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialfebrero2019_g4;

import java.util.ArrayList;
/**
 *
 * @author RodrigoPlauchú
 */
public class PrimerParcialFebrero2019_G4 {

    // EJERCICIO 1
    public static <T> boolean esEspejoDe(PilaADT<T> pila1, PilaADT<T> pila2) {
        boolean res = false;
        Pila aux = new Pila();
        Pila aux2 = new Pila();

        if (pila1.isEmpty() || pila2.isEmpty()) {
            throw new EmptyCollectionException();
        }

        while (!pila1.isEmpty()) {
            aux.push(pila1.pop());
        }
        while (!aux.isEmpty() && !pila2.isEmpty()) {
            if (aux.peek().equals(pila2.peek())) {
                pila1.push((T) aux.pop());
                aux2.push(pila2.pop());
            } else {
                while (!aux.isEmpty() && !pila2.isEmpty()) {
                    pila1.push((T) aux.pop());
                    aux2.push(pila2.pop());
                }
            }
        }
        if (pila2.isEmpty() && aux.isEmpty()) {
            res = true;
        }
        while (!aux2.isEmpty()) {
            pila2.push((T) aux2.pop());
        }

        return res;
    }

    // EJERCICIO 3
    public static <T> ArrayList<T> analizaObjs(ArrayList<T> array) {
        ArrayList<T> lista = new ArrayList<T>();
        T elemento;
        String suma = null;
        double sum=0;
        int j = 0;
        String cadenas = null;
        String DePas = null;
        String DeProd = null;

        if (array.isEmpty()) {
            lista.add((T) "Arrray vacío");
        }

        for (int i = 0; i < array.size(); i++) {
            elemento = array.get(i);
            if (elemento instanceof Double) {
                sum+=(Double)elemento;
                suma += "\nLa suma de los números es: "+ sum;
            }
             if (elemento instanceof Integer) {
                sum+=(Integer)elemento;
                suma += "\nLa suma de los números es: "+ sum;
            }
            if (elemento instanceof String) {
                cadenas += "\nLa concatenación de las cadenas es: " + (String) elemento;
            }
            if (elemento instanceof DePasajeros) {
                DePas += "\nEl total de pasajeros que se pueden transportar: " + ((DePasajeros) elemento).getTotalPasaj();
            }
            if (elemento instanceof DeProductos) {
                j++;
                DeProd += "\nEl total de camiones de productos recibido es: " + j;
            }
        }
        lista.add((T) suma);
        lista.add((T) cadenas);
        lista.add((T) DePas);
        lista.add((T) DeProd);

        return lista;
    }

    public static void main(String[] args) {
        
        Pila p1= new Pila();
        p1.push(1);
        p1.push(2);
        p1.push(3);
        p1.push(4);
        Pila p2= new Pila();
        p2.push(4);
        p2.push(3);
        p2.push(2);
        p2.push(1);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(PrimerParcialFebrero2019_G4.esEspejoDe(p1, p2));
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
        Fabrica fab= new Fabrica();
        
        fab.alta(true, 25, "Grande", "4T", "4RT-RES", 1000, true);
        fab.alta(false, 15, "Grande", "5C", "5T1-OPE", 500, true);
        fab.alta(true, true, "Grande", "2A", "3Q1-PYT", 2000, true, 12);
        
        System.out.println(fab.determinaExistenciaCamionesPerecederos(20));
         
        ArrayList array= new ArrayList();
        DePasajeros c1= new DePasajeros("Grande", "4T", "4RT-RES",100, true, 45) {};
        DeProductos c2 = new DeProductos(true, 25, "Grande", "4T", "4RT-RES", 1000, true);
        
        array.add(23);
        array.add("hola");
        array.add(45.5);
        array.add(c1);
        array.add(c2);
        array.add("Jacinta");
        
        System.out.println(PrimerParcialFebrero2019_G4.analizaObjs(array));
    }

}
