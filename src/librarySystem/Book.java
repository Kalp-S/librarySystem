/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarySystem;

public class Book {
//All attributes for books

    private String title;
    private String author;
    private int isbn;
    private String category;
    private double cost;
    private int totalCopies;
    private int availableCopies;
    private boolean profOnly;

    /**
     *
     * Abstraction Function: represents the characteristics of the book The rep
     * invariant is: for title != null, author!=null, isbn!= null, category!=
     * null, cost!= null, totalCopies != null, availableCopies!= null,
     * pOnly!=null isbn>=0 totalCopies>=0 availableCopies>=0
     *
     * @param bookTitle
     * @param bookAuthor
     * @param bookISBN
     * @param bookCategory
     * @param bookCost
     * @param TotalBookCopies
     * @param pOnly
     */
    public boolean repOk(){
        if(title==null||author==null||category==null|| isbn!= (int)isbn ||cost!=(double)cost||totalCopies!=(int)totalCopies||availableCopies!=(int)availableCopies){
            return false;
        }
        
        return true;
    }
    
    public Book(String bookTitle, String bookAuthor, int bookISBN, String bookCategory, double bookCost, int TotalBookCopies, boolean pOnly) {
        title = bookTitle;
        author = bookAuthor;
        isbn = bookISBN;
        category = bookCategory;
        cost = bookCost;
        totalCopies = TotalBookCopies;
        availableCopies = TotalBookCopies;
        profOnly = pOnly;
    }

    /*
        *Requires:
        *Effects: returns title
        *Modifies:
     */
    public String getTitle() {
        return title;
    }

    /*
        *Requires:
        *Effects:return author
        *Modifies:
     */
    public String getAuthor() {
        return author;
    }

    /*
        *Requires:
        *Effects: returns isbn
        *Modifies:
     */
    public int getISBN() {
        return isbn;
    }

    /*
        *Requires:
        *Effects: returns category
        *Modifies:
     */
    public String getCategory() {
        return category;
    }

    /*
        *Requires:
        *Effects: returns cost
        *Modifies:
     */
    public double getCost() {
        return cost;
    }

    /*
        *Requires:
        *Effects: returns totalCopies
        *Modifies:
     */
    public int getTotalCopies() {
        return totalCopies;
    }

    /*
        *Requires:
        *Effects: returns available copies
        *Modifies:
     */
    public int getAvailableCopies() {
        return availableCopies;
    }

    /*
        *Requires:
        *Effects: checks to see if book is available
        *Modifies:
     */
    public boolean isAvailable() {
        if (availableCopies == 0) {
            return false;
        } else {
            return true;
        }
    }

    /*
        *Requires:
        *Effects: returns prof only
        *Modifies:
     */
    public boolean getprofOnly() {
        return profOnly;
    }

    /*
        *Requires:newBookCopies>=0
        *Effects: changes the number of copies
        *Modifies:
     */
    public void changeTotalCopies(int newBookCopies) {
        totalCopies = newBookCopies;
    }

    /*
        *Requires: newBookCopies>=0
        *Effects: changes the numebrs of available copies
        *Modifies:
     */
    public void changeAvailableCopies(int newBookCopies) {
        availableCopies = newBookCopies;
    }

    /*
        *Requires: non null p
        *Effects: changes the state of profOnly
        *Modifies:
     */
    public void setGetprofOnly(boolean p) {
        profOnly = p;
    }

}
