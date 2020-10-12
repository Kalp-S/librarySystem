/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarySystem;

import librarySystem.Book;
import librarySystem.Student;
import librarySystem.People;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PeopleTest {
    
    public PeopleTest() {
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
     * Test of getFirstN method, of class People.
     */
    @Test
    public void testGetFirstN() {
        System.out.println("getFirstN");
        People instance = new Student ("Iyvan", "Chandran",11111);
        String expResult = "Iyvan";
        String result = instance.getFirstN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getLastN method, of class People.
     */
    @Test
    public void testGetLastN() {
        System.out.println("getLastN");
        People instance = new Student ("Iyvan", "Chandran",11111);
        String expResult = "Chandran";
        String result = instance.getLastN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getId method, of class People.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        People instance = new Student ("Iyvan", "Chandran",11111);
        int expResult = 11111;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
 
    }

    /**
     * Test of getBalance method, of class People.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        People instance = new Student ("Iyvan", "Chandran",11111);
        double expResult = 0.0;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getNumOfCheckOuts method, of class People.
     */
    @Test
    public void testGetNumOfCheckOuts() {
        System.out.println("getNumOfCheckOuts");
        People instance = new Student ("Iyvan", "Chandran",11111);
        int expResult = 0;
        int result = instance.getNumOfCheckOuts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getlaptopCheckOut method, of class People.
     */
    @Test
    public void testGetlaptopCheckOut() {
        System.out.println("getlaptopCheckOut");
        People instance = new Student ("Iyvan", "Chandran",11111);
        boolean expResult = false;
        boolean result = instance.getlaptopCheckOut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
  
    }

    /**
     * Test of getBooksBorrowed method, of class People.
     */
    @Test
    public void testGetBooksBorrowed() {
        System.out.println("getBooksBorrowed");
        People instance = new Student ("Iyvan", "Chandran",11111);
        ArrayList<Book> expResult = new ArrayList <Book>(0);
        ArrayList<Book> result = instance.getBooksBorrowed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of canBorrowBook method, of class People.
     */
    @Test
    public void testCanBorrowBook() {
        System.out.println("canBorrowBook");
        People instance = new Student ("Iyvan", "Chandran",11111);
        boolean expResult = true;
        boolean result = instance.canBorrowBook();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of changeBalance method, of class People.
     */
    @Test
    public void testChangeBalance() {
        System.out.println("changeBalance");
        double newAccoutBalance = 0.0;
        People instance = new Student ("Iyvan", "Chandran",11111);
        instance.changeBalance(newAccoutBalance);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of changeNumberOfCheckOuts method, of class People.
     */
    @Test
    public void testChangeNumberOfCheckOuts() {
        System.out.println("changeNumberOfCheckOuts");
        int newNumBooks = 0;
        People instance = new Student ("Iyvan", "Chandran",11111);
        instance.changeNumberOfCheckOuts(newNumBooks);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setlaptopCheckOut method, of class People.
     */
    @Test
    public void testSetlaptopCheckOut() {
        System.out.println("setlaptopCheckOut");
        boolean c = false;
        People instance = new Student ("Iyvan", "Chandran",11111);
        instance.setlaptopCheckOut(c);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
