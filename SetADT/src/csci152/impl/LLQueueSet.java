/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci152.impl;

import csci152.adt.Queue;
import csci152.adt.Set;

/**
 *
 * @author Админ
 * @param <T>
 */
public class LLQueueSet<T> implements Set<T> {
    
 private  LinkedListQueue <T> queue;
    
    LLQueueSet(){
     
      this.queue=new LinkedListQueue<>();
    }
    
    @Override
    public void add(T value) {
      if(!contains(value)){
            queue.enqueue(value);
        }

       }

   
    @Override
    public boolean contains(T value) {
   
   for(int i=0; i<queue.getSize(); i++){
            try {
                T res = queue.dequeue();
                queue.enqueue(res);
                if(res.equals(value))
                    return true;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            
        }
        
        return false;
    }
/*public boolean contains(T value){
  int x=queue.getSize();
    for(int i=0;i<x;i++){
    try{
    T num=queue.dequeue();
    queue.enqueue(num);
    if(num.equals(value)){
    return true;
    
    }
    }
    catch(Exception ex){
    
    
    }
    
    }
      return false;
}*/
    @Override
    public boolean remove(T value) {
   int size=queue.getSize();
   for(int i=0;i<size;i++){
       try{
       T res=queue.dequeue();
     
       if(res.equals(value)){
         return true;
       }
       else{
       queue.enqueue(res);
       }
       }
           catch(Exception ex){
                   System.out.println(ex.getMessage());
                   }
       }
     return false;
   
   }
   
    @Override
    public T removeAny() throws Exception {
         if(queue.getSize()==0){
            throw new Exception("The set is empty");
        }
         T result=queue.dequeue();
          

          return result;

    }

    @Override
    public int getSize() {
    return queue.getSize();
    }

    @Override
    public void clear() {
     queue.clear();
     
    }
@Override
    public String toString(){
            return  queue.toString();
       
    }
}
