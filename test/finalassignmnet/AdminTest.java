/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalassignmnet;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdminTest {
    
    public AdminTest() {
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
     * Test of addHardPeople method, of class Admin.
     */
    ArrayList<People> peopleList= new ArrayList <People>();	//list of all existing students
    ArrayList<Book> bookList= new ArrayList <Book>(); 
    ArrayList<Laptops> laptopList= new ArrayList <Laptops>();

    Book book1= new Book ("The Sorcerer's Stone", "J.K.Rowling",1001,"Fantasy", 10.99, 3, false );
    Book book2= new Book ("The Chamber of Secrets", "J.K.Rowling",1002,"Fantasy", 10.99, 4,false );
    Book book3= new Book ("Sherlock Holmes", "Arthur Conan Doyle",1100,"Mystery", 8.99, 2, false);
    Book book4= new Book ("Fault in our Stars", "John Green",1200,"Romance", 15.99, 4, false);

    Student student1= new Student ("Iyvan", "Chandran",11111);
    Student student2= new Student ("Aleeza", "Hashmi",500);
    
    Laptops laptop1 = new Laptops(1, 500.00, 5);        
                
                
                
		
    @Test
    public void testAddHardPeople() {
        System.out.println("addHardPeople");
        People s1 = student1;
        People s2 = student2;
        Admin instance = new Admin (peopleList, bookList, laptopList);
        instance.addHardPeople(s1, s2);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addHardBook method, of class Admin.
     */
    @Test
    public void testAddHardBook() {
        System.out.println("addHardBook");
        Book b1 = book1;
        Book b2 = book2;
        Book b3 = book3;
        Book b4 = book4;
        Admin instance = new Admin (peopleList, bookList, laptopList);
        instance.addHardBook(b1, b2, b3, b4);
        // TODO review the generated test code and remove the default call to fail.
   }

    /**
     * Test of returnBookList method, of class Admin.
     */
    @Test
    public void testReturnBookList() {
        System.out.println("returnBookList");
        Admin instance = new Admin (peopleList, bookList, laptopList);
        ArrayList<Book> expResult = bookList;
        ArrayList<Book> result = instance.returnBookList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of returnPeopleList method, of class Admin.
     */
    @Test
    public void testReturnPeopleList() {
        System.out.println("returnPeopleList");
        Admin instance = new Admin (peopleList, bookList, laptopList);
        ArrayList<People> expResult = peopleList;
        ArrayList<People> result = instance.returnPeopleList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of getBookByTitle method, of class Admin.
     */
    @Test
    public void testGetBookByTitle() {
        System.out.println("getBookByTitle");
        String title = "Fault in our Stars";
        bookList.add(book4);
        Admin instance = new Admin (peopleList, bookList, laptopList);
        Book expResult = book4;
        Book result = instance.getBookByTitle(title);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getBookByISBN method, of class Admin.
     */
    @Test
    public void testGetBookByISBN() {
        System.out.println("getBookByISBN");
        int isbn = 1001;
        Admin instance = new Admin (peopleList, bookList, laptopList);
        Book expResult = book1;
        bookList.add(book1);
        Book result = instance.getBookByISBN(isbn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getLaptop method, of class Admin.
     */
    @Test
    public void testGetLaptop() {
        System.out.println("getLaptop");
        int id = 1;
        Admin instance = new Admin (peopleList, bookList, laptopList);
        Laptops expResult = laptop1;
        laptopList.add(laptop1);
        Laptops result = instance.getLaptop(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of searchPerson method, of class Admin.
     */
    @Test
    public void testSearchPerson() {
        System.out.println("searchPerson");
        int number = 500;
        Admin instance = new Admin (peopleList, bookList, laptopList);
        peopleList.add(student2);
        boolean expResult = true;
        boolean result = instance.searchPerson(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of canLoginPerson method, of class Admin.
     */
    @Test
    public void testCanLoginPerson() {
        System.out.println("canLoginPerson");
        String name = "Iyvan";
        int number = 11111;
        peopleList.add(student1);
        Admin instance = new Admin (peopleList, bookList, laptopList);
        boolean expResult = true;
        boolean result = instance.canLoginPerson(name, number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getPerson method, of class Admin.
     */
    @Test
    public void testGetPerson() {
        System.out.println("getPerson");
        String name = "Iyvan";
        int number = 11111;
        peopleList.add(student1);
        Admin instance = new Admin (peopleList, bookList, laptopList);
        People expResult = student1;
        People result = instance.getPerson(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of searchBook method, of class Admin.
     */
    @Test
    public void testSearchBook() {
        System.out.println("searchBook");
        String title = "Fault in our Stars";
        int ISBN = 1200;
        bookList.add(book4);
        Admin instance = new Admin (peopleList, bookList, laptopList);
        boolean expResult = true;
        boolean result = instance.searchBook(title);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addLaptop method, of class Admin.
     */
    @Test
    public void testAddLaptop() {
        System.out.println("addLaptop");
        int id = 1;
        double cost = 500.0;
        int copies = 5;
        Admin instance = new Admin (peopleList, bookList, laptopList);
        instance.addLaptop(id, cost, copies);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addStudent method, of class Admin.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        String firstN = "";
        String lastN = "";
        int studentNum = 0;
        Admin instance = new Admin (peopleList, bookList, laptopList);
        instance.addStudent(firstN, lastN, studentNum);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of addProf method, of class Admin.
     */
    @Test
    public void testAddProf() {
        System.out.println("addProf");
        String firstN = "";
        String lastN = "";
        int profNum = 0;
        Admin instance = new Admin (peopleList, bookList, laptopList);
        instance.addProf(firstN, lastN, profNum);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of deletePerson method, of class Admin.
     */
    @Test
    public void testDeletePerson() {
        System.out.println("deletePerson");
        int id = 0;
        Admin instance = new Admin (peopleList, bookList, laptopList);
        instance.deletePerson(id);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of addBookCopies method, of class Admin.
     */
    @Test
    public void testAddBookCopies() {
        System.out.println("addBookCopies");
        String title = "";
        int addBooks = 0;
        Admin instance = new Admin (peopleList, bookList, laptopList);
        instance.addBookCopies(title, addBooks);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of addLaptopCopies method, of class Admin.
     */
    @Test
    public void testAddLaptopCopies() {
        System.out.println("addLaptopCopies");
        int id = 0;
        int numCopies = 0;
        Admin instance = new Admin (peopleList, bookList, laptopList);
        instance.addLaptopCopies(id, numCopies);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of addNewBook method, of class Admin.
     */
    @Test
    public void testAddNewBook() {
        System.out.println("addNewBook");
        String bookTitle = "";
        String bookAuthor = "";
        int bookISBN = 0;
        String bookCategory = "";
        int bookRating = 0;
        double bookCost = 0.0;
        boolean canProf = false;
        Admin instance = new Admin (peopleList, bookList, laptopList);
        instance.addNewBook(bookTitle, bookAuthor, bookISBN, bookCategory, bookRating, bookCost, canProf);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of deleteBookCopies method, of class Admin.
     */
    @Test
    public void testDeleteBookCopies() {
        System.out.println("deleteBookCopies");
        String title = "";
        int deductBooks = 0;
        Admin instance = new Admin (peopleList, bookList, laptopList);
        instance.deleteBookCopies(title, deductBooks);
        // TODO review the generated test code and remove the default call to fail.
 
    }

    /**
     * Test of deleteLaptopCopies method, of class Admin.
     */
    @Test
    public void testDeleteLaptopCopies() {
        System.out.println("deleteLaptopCopies");
        int id = 0;
        int deductLaptop = 0;
        Admin instance = new Admin (peopleList, bookList, laptopList);
        instance.deleteLaptopCopies(id, deductLaptop);
        // TODO review the generated test code and remove the default call to fail.
 
    }

    /**
     * Test of deleteTheBook method, of class Admin.
     */
    @Test
    public void testDeleteTheBook() {
        System.out.println("deleteTheBook");
        Book deleteBook = null;
        Admin instance = new Admin (peopleList, bookList, laptopList);
        instance.deleteTheBook(deleteBook);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of deleteLaptop method, of class Admin.
     */
    @Test
    public void testDeleteLaptop() {
        System.out.println("deleteLaptop");
        Laptops l = null;
        Admin instance = new Admin (peopleList, bookList, laptopList);
        instance.deleteLaptop(l);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of deleteFines method, of class Admin.
     */
    @Test
    public void testDeleteFines() {
        System.out.println("deleteFines");
        int id = 0;
        double fine = 0.0;
        Admin instance = new Admin (peopleList, bookList, laptopList);
        instance.deleteFines(id, fine);
        // TODO review the generated test code and remove the default call to fail.
 
    }

    /**
     * Test of checkOutBook method, of class Admin.
     */
    @Test
    public void testCheckOutBook() {
        System.out.println("checkOutBook");
        People p = student1;
        String title = "Fault in our Stars";
        Admin instance = new Admin (peopleList, bookList, laptopList);
        bookList.add(book4);
        instance.checkOutBook(p, title);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of checkOutLaptop method, of class Admin.
     */
    @Test
    public void testCheckOutLaptop() {
        System.out.println("checkOutLaptop");
        People p = student1;
        int id = 1;
        peopleList.add(student1);
        laptopList.add(laptop1);
        Admin instance = new Admin (peopleList, bookList, laptopList);
        instance.checkOutLaptop(p, id);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of returnBook method, of class Admin.
     */
    @Test
    public void testReturnBook() {
        System.out.println("returnBook");
        People p = student1;
        String title = "Fault in our Stars";
        String duration = "lost";
        bookList.add(book4);
        Admin instance = new Admin (peopleList, bookList, laptopList);
        instance.returnBook(p, title, duration);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of returnLaptop method, of class Admin.
     */
    @Test
    public void testReturnLaptop() {
        System.out.println("returnLaptop");
        People p = student1;
        int id = 1;
        String duration = "lost";
        peopleList.add(student1);
        laptopList.add(laptop1);
        Admin instance = new Admin (peopleList, bookList, laptopList);
        instance.returnLaptop(p, laptopList.get(0), duration);

    }
    
}
