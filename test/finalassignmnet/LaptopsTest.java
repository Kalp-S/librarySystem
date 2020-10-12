/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalassignmnet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LaptopsTest {
    
    public LaptopsTest() {
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
     * Test of setCost method, of class Laptops.
     */
    @Test
    public void testSetCost() {
        System.out.println("setCost");
        double p = 0.0;
        Laptops instance = new Laptops(1, 500.00, 5);
        instance.setCost(p);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTotalLaptop method, of class Laptops.
     */
    @Test
    public void testSetTotalLaptop() {
        System.out.println("setTotalLaptop");
        int t = 0;
        Laptops instance = new Laptops(1, 500.00, 5);
        instance.setTotalLaptop(t);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setAvailableLaptop method, of class Laptops.
     */
    @Test
    public void testSetAvailableLaptop() {
        System.out.println("setAvailableLaptop");
        int t = 0;
        Laptops instance = new Laptops(1, 500.00, 5);
        instance.setAvailableLaptop(t);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getCost method, of class Laptops.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        Laptops instance = new Laptops(1, 500.00, 5);
        double expResult = 500.00;
        double result = instance.getCost();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getTotalLaptop method, of class Laptops.
     */
    @Test
    public void testGetTotalLaptop() {
        System.out.println("getTotalLaptop");
        Laptops instance = new Laptops(1, 500.00, 5);
        int expResult = 5;
        int result = instance.getTotalLaptop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getId method, of class Laptops.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Laptops instance = new Laptops(1, 500.00, 5);
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of getAvailableLaptop method, of class Laptops.
     */
    @Test
    public void testGetAvailableLaptop() {
        System.out.println("getAvailableLaptop");
        Laptops instance = new Laptops(1, 500.00, 5);
        int expResult = 5;
        int result = instance.getAvailableLaptop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of isAvailable method, of class Laptops.
     */
    @Test
    public void testIsAvailable() {
        System.out.println("isAvailable");
        Laptops instance = new Laptops(1, 500.00, 5);
        boolean expResult = true;
        boolean result = instance.isAvailable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }
    
}
