/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci152.impl;

import csci152.adt.Stack;

/**
 *
 * @author Админ
 */
public  class LinkedListStack<T> implements Stack<T>{
    private int size;
    private Node<T> top; 
    
    
    
public LinkedListStack(){
   top=null;
   size=0;
    
}
    @Override
    public void push(T value) {
          Node<T> newTop = new Node(value);
        if(size>0)
            newTop.setLink(top);
        
        top = newTop; 
        size++;
      
        
    }

    @Override
    public T pop() throws Exception {
       if(size==0){
            throw new Exception("The stack is empty");
        }
            T result=top.getValue();
     
        if(size==1) {
            top=null;
        }
        else{
            top.setValue(top.getLink().getValue());
        top.setLink(top.getLink().getLink());
        
        
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
        top=null;
        size=0;
        
    }
    public String toString(){
           String result = "";
        Node cur = top;
        while(cur!=null){
            result += cur+",";
            cur = cur.getLink();
        }
        return result;
    }
    
}
