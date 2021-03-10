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
    private int bookQuantity;
    
    private static String newBookID = "BOOK0000";

    public Book(String bookID, String bookTitle, String bookAuthor, int bookYear, String bookStatus, int bookQuantity) {
        this.bookID = getNewBookID();
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        this.bookStatus = bookStatus;
        this.bookQuantity = bookQuantity;
        newBookID = bookID;
    }

    public Book(String bookTitle, String bookAuthor, int bookYear, String bookStatus, int bookQuantity) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        this.bookStatus = bookStatus;
        this.bookQuantity = bookQuantity;
        newBookID = generateNewBookID();
    }

    public String getBookID() {
        return generateNewBookID();
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

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }
    
    public static String getNewBookID() {
        return newBookID;
    }

    public static void setNewBookID(String newBookID) {
        Book.newBookID = newBookID;
    }
    
    private String generateNewBookID() {
        String newid = null;
        int number = Integer.parseInt(newBookID.substring(2)) + 1;

        if (number < 10) {
            newid = "OR00000" + String.valueOf(number);
        } else if (number < 100) {
            newid = "OR0000" + String.valueOf(number);
        } else if (number < 1000) {
            newid = "OR000" + String.valueOf(number);
        } else if (number < 1000) {
            newid = "OR00" + String.valueOf(number);
        } else if (number < 10000) {
            newid = "OR0" + String.valueOf(number);
        } else if (number < 100000) {
            newid = "OR" + String.valueOf(number);
        }
        return newid;
    }

    @Override
    public String toString() {
        return "Book{" + "bookID=" + bookID + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", bookYear=" + bookYear + ", bookStatus=" + bookStatus + '}';
    }
}
