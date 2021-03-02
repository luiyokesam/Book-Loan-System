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
public class Librarian {
    private String librarianID;

    public Librarian() {
    }

    public Librarian(String librarianID) {
        this.librarianID = librarianID;
    }

    public String getLibrarianID() {
        return librarianID;
    }

    public void setLibrarianID(String librarianID) {
        this.librarianID = librarianID;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        return "Librarian{" + "librarianID=" + librarianID + '}';
    }
    
}
