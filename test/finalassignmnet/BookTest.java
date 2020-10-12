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

public class BookTest {
    
    public BookTest() {
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
     * Test of getTitle method, of class Book.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Book instance = new Book ("The Sorcerer's Stone", "J.K.Rowling",1001,"Fantasy", 10.99, 3, false );
        String expResult = "The Sorcerer's Stone";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getAuthor method, of class Book.
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        Book instance = new Book ("The Sorcerer's Stone", "J.K.Rowling",1001,"Fantasy", 10.99, 3, false );
        String expResult = "J.K.Rowling";
        String result = instance.getAuthor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getISBN method, of class Book.
     */
    @Test
    public void testGetISBN() {
        System.out.println("getISBN");
        Book instance = new Book ("The Sorcerer's Stone", "J.K.Rowling",1001,"Fantasy", 10.99, 3, false );
        int expResult = 1001;
        int result = instance.getISBN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getCategory method, of class Book.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        Book instance = new Book ("The Sorcerer's Stone", "J.K.Rowling",1001,"Fantasy", 10.99, 3, false );
        String expResult = "Fantasy";
        String result = instance.getCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getCost method, of class Book.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        Book instance = new Book ("The Sorcerer's Stone", "J.K.Rowling",1001,"Fantasy", 10.99, 3, false );
        double expResult = 10.99;
        double result = instance.getCost();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getTotalCopies method, of class Book.
     */
    @Test
    public void testGetTotalCopies() {
        System.out.println("getTotalCopies");
        Book instance = new Book ("The Sorcerer's Stone", "J.K.Rowling",1001,"Fantasy", 10.99, 3, false );
        int expResult = 3;
        int result = instance.getTotalCopies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getAvailableCopies method, of class Book.
     */
    @Test
    public void testGetAvailableCopies() {
        System.out.println("getAvailableCopies");
        Book instance = new Book ("The Sorcerer's Stone", "J.K.Rowling",1001,"Fantasy", 10.99, 3, false );
        int expResult = 3;
        int result = instance.getAvailableCopies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of isAvailable method, of class Book.
     */
    @Test
    public void testIsAvailable() {
        System.out.println("isAvailable");
        Book instance = new Book ("The Sorcerer's Stone", "J.K.Rowling",1001,"Fantasy", 10.99, 3, false );
        boolean expResult = true;
        boolean result = instance.isAvailable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getprofOnly method, of class Book.
     */
    @Test
    public void testGetprofOnly() {
        System.out.println("getprofOnly");
        Book instance = new Book ("The Sorcerer's Stone", "J.K.Rowling",1001,"Fantasy", 10.99, 3, false );
        boolean expResult = false;
        boolean result = instance.getprofOnly();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of changeTotalCopies method, of class Book.
     */
    @Test
    public void testChangeTotalCopies() {
        System.out.println("changeTotalCopies");
        int newBookCopies = 0;
        Book instance = new Book ("The Sorcerer's Stone", "J.K.Rowling",1001,"Fantasy", 10.99, 3, false );
        instance.changeTotalCopies(newBookCopies);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of changeAvailableCopies method, of class Book.
     */
    @Test
    public void testChangeAvailableCopies() {
        System.out.println("changeAvailableCopies");
        int newBookCopies = 0;
        Book instance = new Book ("The Sorcerer's Stone", "J.K.Rowling",1001,"Fantasy", 10.99, 3, false );
        instance.changeAvailableCopies(newBookCopies);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setGetprofOnly method, of class Book.
     */
    @Test
    public void testSetGetprofOnly() {
        System.out.println("setGetprofOnly");
        boolean p = false;
        Book instance = new Book ("The Sorcerer's Stone", "J.K.Rowling",1001,"Fantasy", 10.99, 3, false );
        instance.setGetprofOnly(p);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
