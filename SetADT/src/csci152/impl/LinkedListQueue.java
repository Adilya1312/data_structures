
package csci152.impl;

import csci152.adt.Queue;

/**
 *
 * @author Админ
 * @param <T>
 */
public class LinkedListQueue <T> implements Queue<T> {
    int size;
    private Node<T> back; 
    private Node<T> front;
    
    
    public LinkedListQueue(){
        size=0;
        back=null;
        front=null;
    }
    @Override
    public void enqueue(T value) {
     Node <T> node = new Node(value);
     if(size>0){
       back.setLink(node);
       back=node;
     }  
     else{
     back=node;
     front=back;
   
     }
       size++;
    }

    @Override
    public T dequeue() throws Exception {
          if(size==0){
            throw new Exception("The queue is empty");
        }
          T result=front.getValue();
           if(size==1) {
            front=null;
            back=null;
        }
        else{
      front=front.getLink();
        }
            size--; 

          return result;
    }
    public int getSize() {
      return size;
    }

    @Override
    public void clear() {
    back=null;
    front=null;
    size=0;
    }
    public String toString(){
          String result ="front[";
        Node temp=front;
        
        while(temp!=null){
            
            result=result+ " " +temp.getValue();
            temp=temp.getLink();
                    
        }
        result=result+ " ] bottom";
        
        return result;
    }
    
}
