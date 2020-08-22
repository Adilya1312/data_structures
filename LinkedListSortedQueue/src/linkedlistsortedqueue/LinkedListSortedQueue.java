
package linkedlistsortedqueue;



public class LinkedListSortedQueue <T extends Comparable> implements SortedQueue <T>{
private int size;
private Node <T> front;
public LinkedListSortedQueue(){
    front=null;
    size=0;
}
    @Override
    public void insert(T value) {
        Node <T> newNode=new Node(value);
        
       if(size==0){
  
           front=newNode;
       }
       else{
           if(value.compareTo(front.getValue())<=0){
               newNode.setLink(front);
               front=newNode;
           }
       
       
      else{
               Node<T> current = front;
               Node<T> before = null;
               while(current !=null){
                   if(value.compareTo(current.getValue()) <=0){
                       newNode.setLink(current);
                       before.setLink(newNode);                       
                       break;
                   }
                   before = current;
                   current = current.getLink();
               }
               
               //execute if "while" looped until the end
               if(current == null){
                   before.setLink(newNode);
               }
               
           }
        }
        size++;
    }
    @Override
    public int getSize() {
      return size;
    }

    @Override
    public void clear() {
       front=null;
       size=0;
    }

    
   

    @Override
    public T dequeue() throws Exception {
        if(size==0){
            throw new Exception(" Queue is empty");
        }
          T value=front.getValue();
       if(size==1){
           front=null;
      
       }
       else{
   
    front.setValue(front.getLink().getValue());
      front.setLink(front.getLink().getLink());
      
       
        }
       size--;
       return value;
    }
    
public String toString(){
    String result=" front [";
    Node <T> temp=front;
    while(temp!=null){
    result=result+ " " +temp;
    temp=temp.getLink();
    }
    result=result +" ] back";
    return result;
}
  
    
}
