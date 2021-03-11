/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Lui Yoke Sam
 */
public class Book {
    private String bookID;
    private String bookTitle;
    private String bookAuthor;
    private int bookYear;
    private int bookQuantity;
    private double bookPrice;

    public Book(String bookID, String bookTitle, String bookAuthor, int bookYear, int bookQuantity, double bookPrice) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        this.bookQuantity = bookQuantity;
        this.bookPrice = bookPrice;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "Book{" + "bookID=" + bookID + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", bookYear=" + bookYear + ", bookQuantity=" + bookQuantity + ", bookPrice=" + bookPrice + '}';
    }
    
   
}
