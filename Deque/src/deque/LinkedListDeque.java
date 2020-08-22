
package deque;


public  class LinkedListDeque <T> implements Deque<T> {
private int size;
private DoublyLinkedNode <T>back;
private DoublyLinkedNode<T> front;

public LinkedListDeque(){
    front=null;
    back=null;
    size=0;
}
    @Override
    public void pushToFront(T value) {
         DoublyLinkedNode <T> node = new DoublyLinkedNode(value);
   if(size==0){
       back=node;
       front=back;
   }
   else{
       node.setNext(front);
   front.setPrevious(node);
   front=node;
   }
 size++;
    }
    @Override
    public void pushToBack(T value) {
   DoublyLinkedNode <T> node = new DoublyLinkedNode(value);
     if(size==0){
       back=node;
       front=back;
     }  
     else{
     node.setPrevious(back);
     back.setNext(node);
     back=node;
   
     }
       size++;
    }
    
    @Override
    public T popFromFront() throws Exception {
     if(size==0){
            throw new Exception("The queue is empty");
        }
          T result=front.getValue();
           if(size==1) {
            front=null;
            back=null;
        }
        else{
                 front=front.getNext();
      front.setPrevious(null);
      
    
      
      
        }
            size--; 

          return result;
    }
    

    @Override
    public T popFromBack() throws Exception {
     if(size==0){
            throw new Exception("The queue is empty");
        }
          T result=front.getValue();
           if(size==1) {
            front=null;
            back=null;
        }
        else{
                 back=back.getPrevious();
      back.setNext(null);
  
        }
            size--; 

          return result;
    }

    @Override
    public int getSize() {
      return size;
    }

    @Override
    public void clear() {
      front=null;
      back=null;
      size=0;
    }
    public String toString(){
             String result ="front[";
        DoublyLinkedNode temp=front;
        
        while(temp!=null){
            
            result=result+ " " +temp;
            temp=temp.getNext();
                    
        }
        result=result+ " ] bottom";
        
        return result;
    }
    
}
