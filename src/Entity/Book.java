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
    private String bookStatus;

    public Book(String bookTitle, String bookAuthor, int bookYear, String bookStatus) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        this.bookStatus = bookStatus;
    }

    public Book(String bookID, String bookTitle, String bookAuthor, int bookYear, String bookStatus) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        this.bookStatus = bookStatus;
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

    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public String toString() {
        return "Book{" + "bookID=" + bookID + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", bookYear=" + bookYear + ", bookStatus=" + bookStatus + '}';
    }
    
    
}
