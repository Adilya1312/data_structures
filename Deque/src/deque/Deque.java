/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deque;

/**
 *
 * @author Админ
 * @param <T>
 */
public interface Deque <T>{
     /**
     *adds elements to the front of the queue
     * @param value element to be added to the front of the queue
     */
    public void pushToFront(T value);
    
    /**
     * *adds elements to the back of the queue
     * @param value element to be added to the back of the queue
     * 
     */
    public void pushToBack(T value);
    /**
     *returns and removes the front most element of the queue 
     * @return the front most element of the queue
     * @throws Exception if queue is empty
     */
    public T popFromFront() throws Exception;
    
    /**
     *returns and removes the back most element of the queue 
     * @return the front most element of the queue
     * @throws Exception if queue is empty
     * 
     */
    public T popFromBack()throws Exception;
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
