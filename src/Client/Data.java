/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import ADT.ArrList; // 
import ADT.ArrSet;
import ADT.LList;
import ADT.LinkedQueue;

import ADT.ListInterface;
import ADT.QueueInterface;
import ADT.SetInterface;

import Entity.Book;
import Entity.BookLoanDetails;
import Entity.Librarian; //
import Entity.Student;

import javax.swing.JFrame;

/**
 *
 * @author Lui Yoke Sam
 */
public class Data {
//    public static ListInterface<Librarian> librarianArrList = new ArrList<>();  
    public static ListInterface<Student> studentLList = new LList<>();
    public static SetInterface<Book> bookSetList = new ArrSet<>(); 
    public static ListInterface<BookLoanDetails> bookloanArrList = new ArrList<>();
    
    public static void main(String[] args){
        InitialRecord();
        JFrame login = new Login();
        login.setVisible(true);
    }
    
    private static void InitialRecord(){
//        Librarian librarian1 = new Librarian(1000, "admin", "admin");
        
//        librarianArrList.add(librarian1);
        
        Student student1 = new Student("1001", "Lui", "FOCS", "admin");
        Student student2 = new Student("1002", "Jason", "FOCS", "admin");
        Student student3 = new Student("1003", "Sor", "FOCS", "admin");
        Student student4 = new Student("1004", "Wong", "FOCS", "admin");
        
       studentLList.add(student1);
        studentLList.add(student2);
        studentLList.add(student3);
        studentLList.add(student4);
        
        Book book1 = new Book("B001", "The Midnight Library", "Matt Haig", 2010, 3, 5.00);
        Book book2 = new Book("B002", "Where the Crawdads Sing", "Delia Owens", 2019, 3, 4.50);
        Book book3 = new Book("B003", "They Both Die at the End", "Adam Silvera", 2012, 3, 5.80);
        Book book4 = new Book("B004", "Breach of Peace", "Daniel B Greene", 2017, 3, 3.10);
        Book book5 = new Book("B005", "test5", "Daniel B Greene", 2017, 3, 3.10);
        Book book6 = new Book("B006", "test6", "Daniel B Greene", 2017, 3, 3.10);
        Book book7 = new Book("B007", "test7", "Daniel B Greene", 2017, 3, 3.10);
        
        bookSetList.add(book1);
        bookSetList.add(book2);
        bookSetList.add(book3);
        bookSetList.add(book4);
        bookSetList.add(book5);
        bookSetList.add(book6);
        bookSetList.add(book7);
        
//        System.out.println(studentArrList.getLength());
    }
}















