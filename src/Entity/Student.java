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
public class Student extends User{
    private String studentID;
    private int borrowLimit = 5;
    private String facultyID;

    public Student(String studentID, String userName, String facultyID, String userPassword) {
        super(userName, userPassword);
        this.studentID = studentID;
//        this.borrowLimit = borrowLimit;
        this.facultyID = facultyID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    public int getBorrowLimit() {
        return borrowLimit;
    }

    public void setBorrowLimit(int borrowLimit) {
        this.borrowLimit = borrowLimit;
    }

    public String getFacultyID() {
        return facultyID;
    }

    public void setFacultyID(String facultyID) {
        this.facultyID = facultyID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Student other = (Student) obj;
        if (this.studentID != other.studentID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", borrowLimit=" + borrowLimit + ", facultyID=" + facultyID + '}';
    }
}
