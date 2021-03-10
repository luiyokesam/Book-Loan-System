/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import ADT.ArrList;
import ADT.LList;
import ADT.ListInterface;
import Entity.Book;
import Entity.BookLoanDetails;
import Entity.Librarian;
import Entity.Student;
import javax.swing.JFrame;

/**
 *
 * @author Lui Yoke Sam
 */
public class Data {
    public static ListInterface<Librarian> librarianArrList = new ArrList<>();  
    public static ListInterface<Student> studentArrList = new ArrList<>();
    private static ListInterface<BookLoanDetails> bookloanList = new LList<>(); 
//    private static ListInterface<Book> bookList = new SetList<>(); 
    
    public static void main(String[] args){
        InitialRecord();
        JFrame login = new Login();
        login.setVisible(true);
    }
    
    private static void InitialRecord(){
        Librarian librarian1 = new Librarian(1000, "admin", "admin");
        
        librarianArrList.add(librarian1);
        
        Student student1 = new Student("20WMR08935", "Lui Yoke Sam", "FOCS", "admin");
        Student student2 = new Student("1002", "Jason", "FOCS", "admin");
        Student student3 = new Student("1003", "Sor", "FOCS", "admin");
        Student student4 = new Student("1004", "Wong", "FOCS", "admin");
        
        studentArrList.add(student1);
        studentArrList.add(student2);
        studentArrList.add(student3);
        studentArrList.add(student4);
    }
}
