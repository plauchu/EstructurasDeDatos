/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Plauchu
 */
public class RectanguloTest {
    
    public RectanguloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBase method, of class Rectangulo.
     */
    @Test
    public void testGetBase() {
        System.out.println("getBase");
        Rectangulo instance = new Rectangulo();
        double expResult = 0.0;
        double result = instance.getBase();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAltura method, of class Rectangulo.
     */
    @Test
    public void testGetAltura() {
        System.out.println("getAltura");
        Rectangulo instance = new Rectangulo();
        double expResult = 0.0;
        double result = instance.getAltura();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBase method, of class Rectangulo.
     */
    @Test
    public void testSetBase() {
        System.out.println("setBase");
        double base = 0.0;
        Rectangulo instance = new Rectangulo();
        instance.setBase(base);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAltura method, of class Rectangulo.
     */
    @Test
    public void testSetAltura() {
        System.out.println("setAltura");
        double altura = 0.0;
        Rectangulo instance = new Rectangulo();
        instance.setAltura(altura);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculaArea method, of class Rectangulo.
     */
    @Test
    public void testCalculaArea() {
        System.out.println("calculaArea");
        Rectangulo instance = new Rectangulo(6,2);
        double expResult = 12.0;
        double result = instance.calculaArea();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculaPerimetro method, of class Rectangulo.
     */
    @Test
    public void testCalculaPerimetro() {
        System.out.println("calculaPerimetro");
        Rectangulo instance = new Rectangulo(8,3);
        double expResult = 22.0;
        double result = instance.calculaPerimetro();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Rectangulo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Rectangulo instance = new Rectangulo();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Rectangulo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Rectangulo instance = new Rectangulo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
