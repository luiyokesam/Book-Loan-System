/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import ADT.ArrList;
import ADT.ListInterface;
import static Client.Data.studentLList;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Lui Yoke Sam
 */
public class BookLoanDetails{
     private String loanID;
    private String studentID;
    private String borrowDate;
    private ListInterface<Book> books = new ArrList<>();
    private double totalprice = 0.00;
    private String dueDate;
    private String returnDate;
    private String loanStatus = "Pending";
    private static String latestloanid = "L000000";

    public BookLoanDetails(String studentID, ListInterface<Book> books) {
        this.loanID = getnewloanid();
        this.studentID = studentID;
        this.borrowDate = setTodayDate();
        this.books = books;
        this.dueDate = setTomorrowDate();
        this.returnDate = null;
        this.totalprice = calculatetotalprice();
    }

    public BookLoanDetails(ListInterface<Book> books) {
        this.books = books;
        this.totalprice = calculatetotalprice();
    }

    public String getLoanID() {
        return loanID;
    }

    public void setLoanID(String loanID) {
        this.loanID = loanID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public ListInterface<Book> getBook() {
        return books;
    }

    public void setBook(ListInterface<Book> books) {
        this.books = books;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public static String getLatestloanid() {
        return latestloanid;
    }

    public static void setLatestloanid(String latestloanid) {
        BookLoanDetails.latestloanid = latestloanid;
    }

    private double calculatetotalprice(){
        double total = 0;
        
        for(int i = 0; i < books.getLength(); i++){
            total += books.getEntry(i).getBookPrice();
        }
        return Math.round(total);
    }
    
    private String setTodayDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 0);
        Date today = calendar.getTime();
        
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        
        String borrowdate = null;
        
        borrowdate = dateformat.format(today);
//        txtBorrowDate.setText(borrowdate);

        return borrowdate;
    }
    
    private String setTomorrowDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 3);
        Date tomorrow = calendar.getTime();
        
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        
        String duedate = null;
        
        duedate = dateformat.format(tomorrow);
//        txtDueDate.setText(duedate);

        return duedate;
    }
    
    private String getnewloanid() {
        String newloanid = null;
        int number = Integer.parseInt(latestloanid.substring(2)) + 1;

        if (number < 10) {
            newloanid = "L00000" + String.valueOf(number);
        } else if (number < 100) {
            newloanid = "L0000" + String.valueOf(number);
        } else if (number < 1000) {
            newloanid = "L000" + String.valueOf(number);
        } else if (number < 1000) {
            newloanid = "L00" + String.valueOf(number);
        } else if (number < 10000) {
            newloanid = "L0" + String.valueOf(number);
        } else if (number < 100000) {
            newloanid = "L" + String.valueOf(number);
        }
        return newloanid;
    }

    @Override
    public String toString() {
        return "BookLoanDetails{" + "loanID=" + loanID + ", studentID=" + studentID + ", borrowDate=" + borrowDate + ", books=" + books + ", totalprice=" + totalprice + ", dueDate=" + dueDate + ", returnDate=" + returnDate + ", loanStatus=" + loanStatus + '}';
    }
}
