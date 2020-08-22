/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistsortedqueue;


public interface SortedQueue<T extends Comparable> {
    
       /**
     *adds elements to the queue in sorted order
     * @param value element to be inserted into the queue
     */
    public void insert(T value);

    /**
     *returns and removes the front most element of the queue 
     * @return the front most element of the queue
     * @throws Exception if queue is empty
     */
    public T dequeue() throws Exception;

    /**
     *
     * @return the size of the queue 
     */
    public int getSize();

    /**
     *remobes all the elements from the queue 
     */
    public void clear();

    /**
     *
     * @return a String representatio of the queue 
     */
    @Override
   public String toString();
    
    
    
}
