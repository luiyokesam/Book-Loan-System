/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

/**
 *
 * @author My Pc
 */
public interface SetInterface<T>{
    public boolean add(T element);
    public boolean remove(T element);
    public boolean checkSubset(SetInterface anotherSet);
    public void union(SetInterface anotherSet);
    public SetInterface intersection(SetInterface anotherSet);
    public boolean isEmpty();
    public int getLength();
    public T getEntry(int givenPosition);
    public boolean replace(int givenPosition, T newEntry);
    
}
