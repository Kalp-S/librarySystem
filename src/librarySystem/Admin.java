/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarySystem;


import java.util.ArrayList;
import java.util.Scanner;

public class Admin {

    private ArrayList<People> peopleList = new ArrayList<People>(0); //list of all existing people
    private ArrayList<Book> bookList = new ArrayList<Book>(0); // list of all existing books
    private ArrayList<Laptops> laptopList = new ArrayList<Laptops>(0); // list of all existing books
    Scanner reader = new Scanner(System.in);

    /**
     *
     * Abstraction Function: represents the characteristics of the admin The rep
     * invariant is: peopleList.size>=0 bookList.size>=0 laptopList.size>=0
     *
     * @param pList
     * @param bList
     * @param LList
     */
    public boolean repOk(){
        if(peopleList.size()<0||bookList.size()<0||laptopList.size()<0){
            return false;
        }
        
        return true;
    }
    
    public Admin(ArrayList<People> pList, ArrayList<Book> bList, ArrayList<Laptops> LList) {
        peopleList = pList;
        bookList = bList;
        laptopList = LList;
    }

    /*
        *Requires: s1,s2 non null people objects
        *Effects:This method contains list of all people currently using the library
        *Modifies:<peopleList> arraylist
     */
    public void addHardPeople(People s1, People s2) {
        peopleList.add(s1);
        peopleList.add(s2);
    }
    
    /*
        *Requires: l1,l2 non null people objects
        *Effects:This method contains list of all laptops in the library
        *Modifies:<laptopeList> arraylist
     */
    
    public void addHardLaptop(Laptops l1, Laptops l2) {
        laptopList.add(l1);
        laptopList.add(l2);
    }


    /*
        *Requires:b1,b2,b3,b4 non null book objects
        *Effects: This method contains list of all books the library currently owns
        *Modifies: <bookList> arraylist
     */
    public void addHardBook(Book b1, Book b2, Book b3, Book b4) {
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
    }

    /*
        *Requires: 
        *Effects:returns the <Book> arraylist
        *Modifies:
     */
    public ArrayList<Book> returnBookList() {
        return bookList;
    }

    /*
        *Requires:
        *Effects:returns the <People> arraylist
        *Modifies:
     */
    public ArrayList<People> returnPeopleList() {
        return peopleList;
    }
      /*
        *Requires:
        *Effects:returns the <Laptop> arraylist
        *Modifies:
     */
    public ArrayList<Laptops> returnLaptopList() {
        return laptopList;
    }

    /*
        *Requires: title non null string
        *Effects: runs through <bookList> arraylist and looks for title and returns specified book
        *Modifies:
     */
    public Book getBookByTitle(String title) {
        Book foundBook = null;
        for (int i = 0; i < bookList.size(); i++) {
            if (title == bookList.get(i).getTitle()) {
                foundBook = bookList.get(i);
            }
        }
        return foundBook;
    }
     
    /*
        *Requires: isbn>=0
        *Effects: runs through <bookList> arraylist and looks for isbn and returns specified book
        *Modifies:
     */
    public Book getBookByISBN(int isbn) {
        Book foundBook = null;
        for (int i = 0; i < bookList.size(); i++) {
            if (isbn == bookList.get(i).getISBN()) {
                foundBook = bookList.get(i);
            }
        }
        return foundBook;
    }

    /*
        *Requires: id>=0
        *Effects: runs through <laptopListt> arraylist and looks for id and returns specified book
        *Modifies:
     */
    public Laptops getLaptop(int id) {
        Laptops foundLaptop = null;
        for (int i = 0; i < laptopList.size(); i++) {
            if (id == laptopList.get(i).getId()) {
                foundLaptop = laptopList.get(i);
            }
        }
        return foundLaptop;
    }

    /*
        *Requires: number>=0
        *Effects: runs through <peopleList> arraylist and looks for number to see if it exists
        *Modifies:
     */
    public boolean searchPerson(int number) // assures no 2 numbers are the same
    {
        boolean foundPeople = false;
        for (int i = 0; i < peopleList.size(); i++) {
            if (number == peopleList.get(i).getId()) {
                foundPeople = true;
            }
        }
        return foundPeople;
    }

    /*
        *Requires: name non null, number>=0
        *Effects: checks to see whether person can login or not
        *Modifies:
     */
    public boolean canLoginPerson(String name, int number) {
        boolean foundPerson = false;
        for (int i = 0; i < peopleList.size(); i++) {
            if (number == peopleList.get(i).getId()) {
                foundPerson = true;
            }
        }
        return foundPerson;
    }

    /*
        *Requires: number>=0
        *Effects: runs through <peopleList> arraylist and looks for name and number and returns the specified person
        *Modifies:
     */
    public People getPerson( int number) {
        People foundPerson = null;
        for (int i = 0; i < peopleList.size(); i++) {
            if (number == peopleList.get(i).getId()) {
                foundPerson = peopleList.get(i);
            }
        }
        return foundPerson;
    }

    /*
        *Requires: name non null
        *Effects: searches <bookList> arraylist and returns book if found
        *Modifies:
     */
    public boolean searchBook(String title) //searching book
    {
        boolean existingBook = false;
        for (int i = 0; i < bookList.size(); i++) {
            if (title.equalsIgnoreCase(bookList.get(i).getTitle())) {
                existingBook = true;
            }
        }
        return existingBook;
    }
    
     /*
        *Requires: id > 0
        *Effects: searches <laptopList> arraylist and returns laptop if found
        *Modifies:
     */
     public boolean searchLaptop(int id) //searching laptop
    {
        boolean existingLaptop = false;
        for (int i = 0; i < laptopList.size(); i++) {
            if (id == laptopList.get(i).getId()) {
                existingLaptop = true;
            }
        }
        return existingLaptop;
    }

    /*
        *Requires: id>=0,cost>=0,copis>=0
        *Effects: adds laptop to the <laptopList> arrayList
        *Modifies:<laptopList> arraylist
     */
    public void addLaptop(int id, double cost, int copies) {
       if (cost<=0 || id<=0 || copies<=0 )
       {
           System.out.println("the id, cost or copies cannot be negative or 0 try again.");
           System.out.println("Please Enter in the id");
           id = reader.nextInt();
           System.out.println("Please Enter in the cost");
           cost = reader.nextDouble();
           System.out.println("Please Enter in the amount of laptops");
           copies = reader.nextInt();
                                
           addLaptop(id, cost, copies);
       }
       else
       {
        
        for(int i=0; i<laptopList.size();i++)
        {
            if(laptopList.get(i).getId()==id)
            {
                addLaptopCopies(id,copies);
            }
            else 
            {
                 Laptops newLaptop = new Laptops(id, cost, copies);
                 laptopList.add(newLaptop);
                 System.out.println("Laptop added");
            }
        }
       }
        
    }

    /*
        *Requires: firstN non null, lastN non null, sudentNum>=0
        *Effects:  adds a student to the <peopleList> arrayList
        *Modifies:adds student to the <peopleList>
     */
    public void addStudent(String firstN, String lastN, int studentNum) {
        if(studentNum<=0)
        {
           System.out.println("Id cannot be negative or 0. try again");
           System.out.println("You want to add a student");
           System.out.println("Please Enter in the first name");
           firstN = reader.nextLine();
           System.out.println("Please Enter in the last name");
           lastN = reader.nextLine();
           System.out.println("Please Enter in the id name");
           studentNum = reader.nextInt();
                                
           addStudent(firstN, lastN, studentNum);
            
        }
        else
        {
        boolean k=true;
        for (int i=0;i<peopleList.size();i++)
        {
          if (peopleList.get(i).getId()==studentNum)
          {
              k=false;
          }
          else if (studentNum==0)
          {
              k=false;
          }
        }
        if (k==false)
        {
            System.out.println("student cannot be added as this id exists");
        }
        else
        {
        ArrayList<Book> bookList = new ArrayList<Book>(0);
        Student newStu = new Student(firstN, lastN, studentNum);
        peopleList.add(newStu);
        System.out.println("Student added");
        }
                }
        
    }

    /*
        *Requires:firstN non null, lastN non null, profNum>=0
        *Effects: adds prof to the <peopleList> arraylist
        *Modifies:<peopleList> arrayList
     */
    public void addProf(String firstN, String lastN, int profNum) {
         if(profNum<=0)
        {
           System.out.println("Id cannot be negative or  0. try again");
           System.out.println("You want to add a Prof");
           System.out.println("Please Enter in the first name");
           firstN = reader.nextLine();
           System.out.println("Please Enter in the last name");
           lastN = reader.nextLine();
           System.out.println("Please Enter in the id name");
           profNum = reader.nextInt();
                                
           addStudent(firstN, lastN, profNum);
            
        }
        else
        {
        boolean k=true;
        for (int i=0;i<peopleList.size();i++)
        {
          if (peopleList.get(i).getId()==profNum)
          {
              k=false;
          }
          else if (profNum==0)
          {
              k=false;
          }
        }
        if (k==false)
        {
            System.out.println("student cannot be added as this id exists");
        }
        else
        {
        ArrayList<Book> bookList = new ArrayList<Book>(0);
        Prof newProf = new Prof(firstN, lastN, profNum);
        peopleList.add(newProf);
        System.out.println("Prof added");
        }
        }
    }

    /*
        *Requires: id>=0
        *Effects: deletes person from <peopleList> arraylist
        *Modifies:<peopleList> arrayList
     */
    public void deletePerson(int id) //removing person
    {
        boolean k=false;
        for (int i = 0; i < peopleList.size(); i++) {
            if (id == (peopleList.get(i).getId())) {
                peopleList.remove(i);
                k=true;
                System.out.println("Person removed");
            }

        }
        if (k==false)
        {
            System.out.println("Person does not exist");
        }
    }

    /*
        *Requires:title non null, addBooks>=0
        *Effects: add a number of copies books to the library
        *Modifies: <bookList> arrayList
     */
    public void addBookCopies(String title, int addBooks) //adding book copies
    {
        if(addBooks<=0)
        {
            System.out.println("You cannot add 0 or negative copies of a book");
             System.out.println("You want to add more copies of a book");
             System.out.println("List of Books:");
             for(int i = 0; i < returnBookList().size(); i++) 
              {
               System.out.println(returnBookList().get(i).getTitle()+ " " +returnBookList().get(i).getAuthor() + "   " +returnBookList().get(i).getISBN() + "   " +returnBookList().get(i).getCategory() );
              }
             System.out.println("Please Enter in the Title");
             title = reader.nextLine();
             System.out.println("Please Enter in the amount of copies");
             addBooks = reader.nextInt();
                                
            addBookCopies(title, addBooks);
        }
        else
        {
        boolean k=false;
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(title)) {
                int bookCopy = bookList.get(i).getTotalCopies() + addBooks;
                int bookCopy2 = bookList.get(i).getAvailableCopies() + addBooks;
                bookList.get(i).changeTotalCopies(bookCopy);
                bookList.get(i).changeAvailableCopies(bookCopy2);
                k=true;
                System.out.println("Copies added");
            }

        }
        if (k==false)
        {
            System.out.println("Book does not exist");
        }
        }
    }

    /*
        *Requires: id>=0, addBooks>=0
        *Effects: add a number of copies of laptops to the library
        *Modifies: <bookList> arraylist
     */
    public void addLaptopCopies(int id, int numCopies) {
        if(numCopies<=0)
        {
            System.out.println("You cannot have 0 or negative copies");
            System.out.println("You want to add a laptop copy");
            System.out.println("List of Laptops:");
            for(int i = 0; i < returnLaptopList().size(); i++) 
            {
                System.out.println(returnLaptopList().get(i).getId()+ " " + returnLaptopList().get(i).getCost());

            }
            System.out.println("Please Enter in the id");
            id = reader.nextInt();
            System.out.println("Please Enter in the amount of laptops");
            numCopies = reader.nextInt();
                                
            addLaptopCopies(id, numCopies);
            
        }
        else
        {
        boolean k=false;
        for (int i = 0; i < laptopList.size(); i++) {
            if (laptopList.get(i).getId() == id) {
                int laptopcopy = laptopList.get(i).getTotalLaptop() + numCopies;
                int laptopCopy2 = laptopList.get(i).getAvailableLaptop() + numCopies;
                bookList.get(i).changeTotalCopies(laptopcopy);
                bookList.get(i).changeAvailableCopies(laptopCopy2);
                k=true;;
                System.out.println("Copies added");
            }
        }
        if (k==false)
        {
            System.out.println("Laptop does not exist");
        }
        }
    }

    /*
        *Requires: non null bookTitle, non null bookAuthor, bookISBN>=0, non null bookCategory, bookRating>=0, bookCost>=0, nonProf non null
        *Effects: this method allows books to be added onto the current existing bookList
        *Modifies: <bookList> arrayList
     */
    public void addNewBook(String bookTitle, String bookAuthor, int bookISBN, String bookCategory, int TotalBookCopies, double bookCost, boolean canProf) // 
    {
        if (bookISBN<=0 || TotalBookCopies <=0 || bookCost<=0)
        {
            System.out.println("The isbn, cost or copies cannot be negative or 0. Try again.");
            System.out.println("You want to add a Book");
                                System.out.println("Please Enter in the title");
                                String title = reader.nextLine();
                                System.out.println("Please Enter in the Author");
                                String author = reader.nextLine();
                                System.out.println("Please Enter in the isbn");
                                int isbn = reader.nextInt();
                                System.out.println("Please Enter in the genre/category");
                                String genre = reader.nextLine();
                                System.out.println("Please Enter in the cost");
                                double cost = reader.nextDouble();
                                System.out.println("Please Enter in the amount of book copies");
                                int tc = reader.nextInt();
                                System.out.println("Please type 1 for prof only. If this book is for anyone type in any number.");
                                int po = reader.nextInt();
                                boolean profO=false; 
                                
                                if(po==1)
                                {
                                 profO=true;   
                                }
                                
                               addNewBook(title, author, isbn, author, tc, cost, profO);
        }
        else
        {
        for(int i=0; i<bookList.size();i++)
        {
            if(bookList.get(i).getTitle().equals(bookTitle))
            {
                addBookCopies(bookTitle,TotalBookCopies);
            }
            else 
            {
                 Book newBook = new Book(bookTitle, bookAuthor, bookISBN, bookCategory, bookCost,TotalBookCopies , canProf);
                    bookList.add(newBook);
                    System.out.println("Book added");

            }
        }
        }
           }

    /*
        *Requires: non null title,  deductBooks>=0
        *Effects: removes book copies
        *Modifies: <bookList> arrayList
     */
    public void deleteBookCopies(String title, int deductBooks) {
        boolean k=false;
        for (int i = 0; i < bookList.size(); i++) {
            if (title.equals(bookList.get(i).getTitle())) {
                if (bookList.get(i).getTotalCopies() <= deductBooks) {
                    bookList.remove(i);
                    k=true;
                } else {
                    int bookCopy = bookList.get(i).getTotalCopies() - deductBooks;
                    bookList.get(i).changeTotalCopies(bookCopy);
                    int bookCopy2 = bookList.get(i).getAvailableCopies() - deductBooks;
                    bookList.get(i).changeAvailableCopies(bookCopy2);
                    k=true;
                    System.out.println("Book copies removed");

                }
            }
        }
        if (k==false)
        {
            System.out.println("Book does not exist");
        }
    }

    /*
        *Requires:  non null id,  deductLaptops>=0
        *Effects: removes book copies
        *Modifies: <laptopList> arrayList
     */
    public void deleteLaptopCopies(int id, int deductLaptop) {
        boolean k=false;
        for (int i = 0; i < laptopList.size(); i++) {
            if (laptopList.get(i).getId() == id) {
                if (laptopList.get(i).getTotalLaptop() <= deductLaptop) {
                    laptopList.remove(i);
                    k=true;
                } else {
                    int laptopCopy = laptopList.get(i).getTotalLaptop() - deductLaptop;
                    laptopList.get(i).setTotalLaptop(laptopCopy);
                    int laptopCopy2 = laptopList.get(i).getAvailableLaptop() - deductLaptop;
                    laptopList.get(i).setAvailableLaptop(laptopCopy2);
                    k=true;
                    System.out.println("Laptop copies removed");

                }
            }
        }
        if (k==false)
        {
            System.out.println("Laptop does not exist");
        }
    }

    /*
        *Requires: non null Book deleteBook
        *Effects: allows books to be deleted from the current existing bookList
        *Modifies: <bookList> arraylist
     */
    public void deleteTheBook(Book deleteBook) {
        boolean k=false;
        for (int i = 0; i < bookList.size(); i++) {
            if (deleteBook == (bookList.get(i))) {
                bookList.remove(i);
                k=true;
            }
        }
        
        if (k==false)
        {
            System.out.println("Book does not exist");
        }
    }

    /*
        *Requires: non null Laptop l
        *Effects: deletes laptop
        *Modifies: <laptopList> arrayList
     */
    public void deleteLaptop(Laptops l) {
        boolean k=false;
        for (int i = 0; i < laptopList.size(); i++) {
            if (l == (laptopList.get(i))) {
                laptopList.remove(i);
                k=true;
                System.out.println("Laptop removed");
            }
        }
        if (k==false)
        {
            System.out.println("Laptop does not exist");
        }
    }

    /*
        *Requires: id>=0, fine>=0
        *Effects: removes fines
        *Modifies: <peopleList> arrayList
     */
    public void deleteFines(int id, double fine) {
        for (int i = 0; i < peopleList.size(); i++) {
            if (id == (peopleList.get(i).getId())) {
                double deleteFine = peopleList.get(i).getBalance() - fine;
                if (deleteFine <= 0) {
                    deleteFine = 0;
                    peopleList.get(i).changeBalance(deleteFine);
                } else {
                    peopleList.get(i).changeBalance(deleteFine);
                }
            }
        }
    }

    /*
        *Requires:non null People p, null String title
        *Effects:allows books to be checked out
        *Modifies: p
     */
    public void checkOutBook(People p, String title) {
        boolean c = false;
        for (int i = 0; i < bookList.size(); i++) {
            if (title.equalsIgnoreCase(bookList.get(i).getTitle())) {
                c = bookList.get(i).getprofOnly();
            }
        }
        if (c == true && (p instanceof Student)) {
            System.out.println("this book can be only checked out by profs");
        } else {
            Book b = getBookByTitle(title);
            p.changeNumberOfCheckOuts(p.getNumOfCheckOuts() + 1);
            p.getBooksBorrowed().add(b);
            b.changeAvailableCopies((b.getAvailableCopies()) - 1);
        }
    }

    /*
        *Requires: non null People p, id>=0
        *Effects:allows laptop to be checked out
        *Modifies:
     */
    public void checkOutLaptop(People p, int id) {
        boolean c = false;
        for (int i = 0; i < laptopList.size(); i++) {
            if (laptopList.get(i).getId() == id) {
                c = peopleList.get(i).getlaptopCheckOut();
            }
        }
        if (c == true) {
            System.out.println("Laptop is already checked out");
        } else {
            Laptops l = getLaptop(id);
            p.setlaptopCheckOut(true);
            p.setLaptop(l); 
            l.setAvailableLaptop((l.getAvailableLaptop()) - 1);
        }
    }

    /*
        *Requires: non null People p, non null String title, non null String duration
        *Effects:allows books to be returned
        *Modifies: p
     */
    public void returnBook(People p, String title, String duration) {
        Book b = getBookByTitle(title);
        p.changeNumberOfCheckOuts(p.getNumOfCheckOuts() - 1);
        if (p.getNumOfCheckOuts() <= 0) //checkouts cannot be less then 0
        {
            p.changeNumberOfCheckOuts(0);
        }
        p.getBooksBorrowed().remove(b);
        if (duration.equalsIgnoreCase("lost")) // if lost is typed into the textField book is considered lost, cost added to student Balance
        {
            b.changeTotalCopies(b.getTotalCopies() - 1);
            b.changeAvailableCopies(b.getAvailableCopies() - 1);
            p.changeBalance(b.getCost());
        } else {
            b.changeAvailableCopies(b.getAvailableCopies() + 1);

            int days = Integer.parseInt(duration);
            if ((days > 14) && (p instanceof Student)) //Fine is added after 14 days of checkout
            {
                double newFine = p.getBalance() + ((days - 14) * 0.10);
                p.changeBalance(newFine);
            } else if ((days > 24) && (p instanceof Prof)) //Fine is added after 14 days of checkout
            {
                double newFine = p.getBalance() + ((days - 24) * 0.10);
                p.changeBalance(newFine);
            }
        }
    }

    /*
        *Requires: non null People p, id>=0, non null String duration
        *Effects:allows books to be returned
        *Modifies: p
     */
    public void returnLaptop(People p, Laptops l , String duration) {
        
        if (duration.equalsIgnoreCase("lost")) // if lost is typed into the textField book is considered lost, cost added to student Balance
        {
            l.setTotalLaptop(l.getTotalLaptop() - 1);
            l.setAvailableLaptop(l.getAvailableLaptop() - 1);
            p.changeBalance(l.getCost());
            p.setLaptop(null);
            p.setlaptopCheckOut(false);
        } else {
            l.setAvailableLaptop(l.getAvailableLaptop() + 1);
            p.setlaptopCheckOut(false);
            p.setLaptop(null); 

            int days = Integer.parseInt(duration);
            if ((days > 1) && (p instanceof Student)) //Fine is added after 14 days of checkout
            {
                double newFine = p.getBalance() + ((days - 1) * 0.10);
                p.changeBalance(newFine);
            } else if ((days > 3) && (p instanceof Prof)) //Fine is added after 14 days of checkout
            {
                double newFine = p.getBalance() + ((days - 3) * 0.10);
                p.changeBalance(newFine);
            }
        }
    }
}
