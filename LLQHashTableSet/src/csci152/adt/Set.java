/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci152.adt;

/**
 *
 * @author Админ
 * @param <T>
 */
public interface Set<T> {
    
    /**adds the given element to the set, if another element with the same value 
     * is not already there
     *
     * @param value element to be added to the set
     */
    public void add(T value);
    
    /**
     *returns whether or not an element with the same value is in the set
     * @param value that is checked for in the set 
     * @return whether or not the value is contained in the set
     */
    public boolean contains(T value);
    
    /**removes the element with the given value from the set and return true, if it is there, 
     * otherwise the set remains unchanged and false is returned
     *
     * @param value to be remved from the set
     * @return whrther or not the value is in the set
     */
    public boolean remove(T value);
    
    /**removes some element from the set, if the set is not empty, if it is empty it throws an Exception
     *
     * @return the value which is removed
     * @throws java.lang.Exception  if the set is empty 
     */
    public T removeAny() throws Exception;

    /**
     *
     * @return the number of elements in the set
     */
    public int getSize();

    /**
     *removes all the elements from the set
     */
    public void clear();
    
    /**
     *
     * @return the String representation of the set
     */
    @Override
    public String toString();
}
