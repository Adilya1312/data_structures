
package csci152.adt;


public interface Queue <T> {
    
    /**
     *adds elements to the end of the queue
     * @param value element to be added to the end of the queue
     */
    public void enqueue(T value);

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
