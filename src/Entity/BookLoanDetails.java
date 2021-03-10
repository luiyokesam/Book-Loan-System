/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import static Client.PasswordRecovery.studentArrList;
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
    // bookID, bookTitle, bookPrice
    Book[] book;
    private String dueDate;
    private String returnDate;
    private String loanStatus = "Pending";
    
    private static String latestloanid = "L000000";
    
//    private String set_current_date() {
//        LocalDateTime currentDate = LocalDateTime.now();
//        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        return currentDate.format(format);
//    }
    
    private String setBorrowDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 0);
        Date today = calendar.getTime();
        
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        
        String borrowdate = null;
        
        borrowdate = dateformat.format(today);
//        txtBorrowDate.setText(borrowdate);

        return borrowdate;
    }
    
    private String setDueDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 3);
        Date tomorrow = calendar.getTime();
        
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        
        String duedate = null;
        
        duedate = dateformat.format(tomorrow);
//        txtDueDate.setText(duedate);

        return duedate;
    }

    public boolean BookLoanDetails(String loanID, String studentID, String borrowDate, Book[] book, String dueDate, String returnDate, String loanStatus) {
        this.loanID = getnewloanid();
        this.studentID = studentID;
        this.borrowDate = setBorrowDate();
        this.book = book;
        this.dueDate = setDueDate();
        this.returnDate = returnDate;
        this.loanStatus = loanStatus;
        
        // put in payment
        for(int i = 0; i < studentArrList.getLength(); i++){
            if(studentArrList.getEntry(i).getStudentID().equals(studentID)){
                if(book.length > studentArrList.getEntry(i).getBorrowLimit()){
                    return false;
                }
                else{
                    studentArrList.getEntry(i).setBorrowLimit(studentArrList.getEntry(i).getBorrowLimit() - book.length);
                    break;
                }
            }
        }
        return true;
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

    public Book[] getBook() {
        return book;
    }

    public void setBook(Book[] book) {
        this.book = book;
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
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BookLoanDetails other = (BookLoanDetails) obj;
        if (!Objects.equals(this.loanID, other.loanID)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BookLoanDetails{" + "loanID=" + loanID + ", studentID=" + studentID + ", borrowDate=" + borrowDate + ", book=" + book + ", dueDate=" + dueDate + ", returnDate=" + returnDate + ", loanStatus=" + loanStatus + '}';
    }
}
