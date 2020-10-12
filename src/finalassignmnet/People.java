package finalassignmnet;

import java.util.ArrayList;

public class People {

    protected String firstName;
    protected String lastName;
    protected int id;
    protected double accountBalance;
    protected int numOfBooks;
    protected ArrayList<Book> borrowedBooks = new ArrayList<Book>(0);
    protected boolean canCheckOut;
    protected boolean laptopCheckOut;
    protected Laptops laptop;
    

    /**
     * Abstraction Function: represents the characteristics of a person The rep
     * invariant is: firstName!=null,lastName!=null,id!=null id>=0
     *
     * @param firstN
     * @param lastN
     * @param ID
     */
    
    public boolean repOk(){
        if(id!= (int)id ||firstName==null||lastName==null||id<0){
            return false;
        }
        return true;
    }
    public People(String firstN, String lastN, int ID) {
        firstName = firstN;
        lastName = lastN;
        id = ID;
        accountBalance = 0;
        numOfBooks = 0;
        borrowedBooks = new ArrayList<Book>(0);
        canCheckOut = true;
        laptopCheckOut = false;
        laptop=null;
    }

    /*
        *Requires: 
        *Effects: returns first name
        *Modifies:
     */
    public String getFirstN() {
        return firstName;
    }
    
    
    /*
        *Requires: 
        *Effects: returns last name
        *Modifies:
     */
    public String getLastN() {
        return lastName;
    }

    /*
        *Requires: 
        *Effects: returns id
        *Modifies:
     */
    public int getId() {
        return id;
    }
    public Laptops getLaptop() {
        return laptop;
    }
    

    /*
        *Requires: 
        *Effects: returns account balance
        *Modifies:
     */
    public double getBalance() {
        return accountBalance;
    }

    /*
        *Requires: 
        *Effects: returns number of books
        *Modifies:
     */
    public int getNumOfCheckOuts() {
        return numOfBooks;
    }

    /*
        *Requires: 
        *Effects: returns laptops checked out
        *Modifies:
     */
    public boolean getlaptopCheckOut() {
        return laptopCheckOut;
    }

    /*
        *Requires: 
        *Effects: returns <Book> arrayList
        *Modifies:
     */
    public void setLaptop(Laptops l) {
        laptop=l;
    }
    public ArrayList<Book> getBooksBorrowed() {
        return borrowedBooks;
    }

    /*
        *Requires: 
        *Effects: returns to see if you can checkout
        *Modifies:
     */
    public boolean canBorrowBook() {
        if (accountBalance > 5.00 || numOfBooks == 3) {
            canCheckOut = false;
        } else {
            canCheckOut = true;
        }
        return canCheckOut;
    }

    /*
        *Requires: newAccountBalance>=0
        *Effects: changes the account balance
        *Modifies:
     */
    public void changeBalance(double newAccoutBalance) {
        accountBalance = newAccoutBalance;
    }

    /*
        *Requires: newNumBook>=0
        *Effects: changes the number of books
        *Modifies:
     */
    public void changeNumberOfCheckOuts(int newNumBooks) {
        numOfBooks = newNumBooks;
    }

    /*
        *Requires: non null boolean c 
        *Effects: changes the state of laptopCheckOut
        *Modifies:
     */
    public void setlaptopCheckOut(boolean c) {
        c = laptopCheckOut;
    }

}
