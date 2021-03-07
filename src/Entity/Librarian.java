/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Objects;

/**
 *
 * @author My Pc
 */
public class Librarian extends User{
    private int librarianID;
    private static int nextlibrarianID = 1000;

    public Librarian(int librarianID, String userName, String userPassword) {
        super(userName, userPassword);
        this.librarianID = librarianID;
    }
    
     public Librarian(String userName, String userPassword) {
        super(userName, userPassword);
        this.librarianID = nextlibrarianID++;
    }

    public int getLibrarianID() {
        return librarianID;
    }

    public void setLibrarianID(int librarianID) {
        this.librarianID = librarianID;
    }

    public static int getNextlibrarianID() {
        return nextlibrarianID;
    }

    public static void setNextlibrarianID(int nextlibrarianID) {
        Librarian.nextlibrarianID = nextlibrarianID;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.librarianID);
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
        final Librarian other = (Librarian) obj;
        if (!Objects.equals(this.librarianID, other.librarianID)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Librarian{librarianID=").append(librarianID);
        sb.append('}');
        return sb.toString();
    }
}
