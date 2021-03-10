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
public class ArrSet<T> implements SetInterface<T>{
    // define an array as attribute -> initialize in the constructor
    T[] array; // single dimension array -> fix size during initialization
    int numberOfElement; // keep track (number of added or removed) or (index position from the array)
    private static final int DEFAULT_CAPACITY = 25; // const
    
    public ArrSet(){ // default constructor 
        this(DEFAULT_CAPACITY); // trigger line 22 (parameterized constructor)
    }
    
    // int[] aArray = new int[5]
    public ArrSet(int capacity){
        numberOfElement = 0; // storing process start at index 0
        //          Object class -> SUPER class
        array = (T[])new Object[capacity]; // casting back to T[] -> generic type
    }
    
    @Override
    public boolean add(T newElement){
        // checking duplication
        for(int i = 0; i < numberOfElement; i++){
            if(array[i].equals(newElement)){
                return false;
            }
        }
        
        if(isFull()){
            doubleArray();
        }
        
        // add on
        array[numberOfElement] = newElement;
        numberOfElement++;
        return true;
    }
    
    @Override
    public boolean remove(T anElement){
        for(int i = 0; i < numberOfElement; i ++){
            if(array[i].equals(anElement)){
                removeGap(i);  // utility method
                numberOfElement--;
                return false;
            }
        }
        return false;
    }
    
    public void removeGap(int index){
        for(int i = 0; i < numberOfElement; i++){
            array[i] = array[i + 1];
        }
    }
    
    private boolean isFull(){
        return numberOfElement == array.length;
    }
    
    private void doubleArray(){
        // create a new array pointer to reference the current array
        T[] originalArray = array;
        int originalArraySize = originalArray.length;
        
        // current array required to re-initial to larger size (double the previous array size)
        array = (T[]) new Object[originalArraySize * 2];
        
        // copy from the previous array to the current array
        for(int i = 0; i < originalArraySize; i++){
            array[i] = originalArray[i];
        }
    }

    @Override
    public boolean checkSubset(SetInterface anotherSet) {
        if(anotherSet instanceof ArrSet){
            ArrSet passIntSet = (ArrSet)anotherSet;
            
            // check the capacity for current and pass in set
            if(passIntSet.numberOfElement > this.numberOfElement){
                return false;
            }
            
            // checking subset -> two for -> i loop for passIntSet, j loop for currentSet
            for(int i = 0; i < passIntSet.numberOfElement; i++){
                boolean found = false;
                for(int j = 0; j < this.numberOfElement  && !found; j++){
                    if(passIntSet.array[i].equals(this.array[j])){
                        found = true;
                    }
                }
                if(!found){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void union(SetInterface anotherSet) {
        // check instanceOf
        if(anotherSet instanceof ArrSet){
            // casting - cast super interface class type to subclass type (ArraySet)
            ArrSet passIntSet = (ArrSet)anotherSet;
            // check
            for(int i = 0; i < passIntSet.numberOfElement; i++){
                this.add((T)passIntSet.array[i]);
            }
         }
    }

    @Override
    public SetInterface intersection(SetInterface anotherSet) {
        SetInterface tempSet = new ArrSet();
        if(anotherSet instanceof ArrSet){
            ArrSet passIntSet = (ArrSet)anotherSet;
            
            // checking subset -> two for -> i loop for passIntSet, j loop for currentSet
            for(int i = 0; i < passIntSet.numberOfElement; i++){
                boolean found = false;
                for(int j = 0; j < this.numberOfElement  && !found; j++){
                    if(passIntSet.array[i].equals(this.array[j])){
                        found = true;
                    }
                }
                if(found){
                    // add
                    tempSet.add((T) passIntSet.array[i]);
                }
            }
        }
        return tempSet;
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString(){
        String output = " ";
        for(int i = 0; i < numberOfElement; i++){
            output += array[i] + " ";
        }
        return output + "\n";
    }
}



