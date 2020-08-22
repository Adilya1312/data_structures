/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci152.impl;

import csci152.adt.Set;



/**
 *
 * @author Админ
 * @param <T>
 */
public class LLStackSet <T> implements Set<T>{
  LinkedListStack<T> stack;
  
public LLStackSet(){
    this.stack=new LinkedListStack<>();
}
    @Override
    public void add(T value) {
     if(!contains(value)){
         stack.push(value);
     }
          
    }

    @Override
    public boolean contains(T value) {
        int size=stack.getSize();
        LinkedListStack<T> temp=new LinkedListStack();
    for(int i=0; i<size; i++){
            try {
                T res =stack.pop();
                temp.push(res);
                
                if(res.equals(value)){
                    int size2=temp.getSize();
                for(int j=0;j<size2;j++){
                    stack.push(temp.pop());
                }
                    return true;
                }
                else if(stack.getSize()==0){
                    int size3=temp.getSize();
                    for(int k=0;k<size3;k++){
                        stack.push(temp.pop());
                    }
                }
                        
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            
        }
        
        return false;
                
    }

    @Override
    public boolean remove(T value) {
    int size=stack.getSize();
     LinkedListStack<T> temp=new LinkedListStack();
   for(int i=0;i<size;i++){
       try{
       T res=stack.pop();
     
       if(res.equals(value)){
           int size1=temp.getSize();
           for(i=0;i<size1;i++){
               stack.push(temp.pop());
           }
         return true;
       }
       else{
       temp.push(res);
       }
       if(stack.getSize()==0){
               int size1=temp.getSize();
           for(i=0;i<size1;i++){
       stack.push(temp.pop());
           }
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
       if(stack.getSize()==0){
            throw new Exception("The set is empty");
        }
        T result=stack.pop();
        return result;
    }

    @Override
    public int getSize() {
return stack.getSize();
    }

    @Override
    public void clear() {
   stack.clear();
    }
     @Override
    public String toString(){
       return stack.toString();
    }

}
