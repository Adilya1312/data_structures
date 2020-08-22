/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci152.impl;

import csci152.adt.Map;
public class LLQMap <K,V> implements Map<K,V>{ 
    

private LinkedListQueue<KeyValuePair<K,V>> pairs;


public LLQMap(){
    this.pairs=new LinkedListQueue();
}

    @Override
   public void define(K key, V value) {
   int x=pairs.getSize();
        
        if(pairs==null){
            pairs.enqueue(new KeyValuePair(key,value));
            return;
        }     
 
      for(int j=0;j<x;j++){
          try{
           KeyValuePair<K,V> map= pairs.dequeue();
           
           if(key.equals(map.getKey())){
               pairs.enqueue(new KeyValuePair(key,value));
               return;
           }
           else{
               pairs.enqueue(map);

           }
          }
          catch(Exception e){
              System.out.println("error is occured");
          }
          
      }
        pairs.enqueue(new KeyValuePair(key,value));
        
    }
    /*public void define(K key, V value) {
        KeyValuePair<K,V> temp=new KeyValuePair(key,value);
        
        if(pairs.getSize()==0){
            pairs.enqueue(temp);
            return;
        
        }
        
  
      for(int i=0;i<pairs.getSize();i++){
          try{
           KeyValuePair<K,V> res= pairs.dequeue();
           
           if(res.getKey().equals(key)){
               pairs.enqueue(temp);
               return;
           }
           else{
               pairs.enqueue(res);
           }
          }
          catch(Exception ex){
              System.out.println(ex.getMessage());
          }
          
          
      }
        pairs.enqueue(temp);
        
    }
*/
    @Override
    public V getValue(K key) {
        
  V value=null;
  
  if(pairs==null){
      return value;
  }
 int x=pairs.getSize();
      for(int j=0;j<x;j++){
          
          try{
           KeyValuePair <K,V>map= pairs.dequeue();
           
           pairs.enqueue(map);
           
           if(key.equals(map.getKey())){
               
                value=map.getValue();
                return value;
           }
           
          }
          catch(Exception ex){
              System.out.println(ex.getMessage());
          }
      }
      
  
  return value;
    }
   /*  public V getValue(K key) {
 
  if(pairs.getSize()==0){
      return null;
  }
  V val=null;
      for(int i=0;i<pairs.getSize();i++){
          try{
           KeyValuePair <K,V>res= pairs.dequeue();
           pairs.enqueue(res);
           if(res.getKey().equals(key)){
               return val=res.getValue();
           }
           
          }
          catch(Exception ex){
              System.out.println(ex.getMessage());
          }
      }
      
  
  return null;
    }
*/
    @Override
    public V remove(K key) {
        
        V value=null;

 if(pairs==null) return value;
 int x=pairs.getSize();
 for(int j=0;j<x;j++){
     
     try{
         KeyValuePair<K,V> map=pairs.dequeue();
         if(!key.equals(map.getKey())){
                  pairs.enqueue(map);
                
         }
         else{
        value=map.getValue();
                 return value;
             
         }
         
     }
     catch(Exception ex){
         System.out.println(ex.getMessage());
     }
     
 }
 return value;
 
    }
 /*public V remove(K key) {
        
        V val=null;

 if(pairs.getSize()==0){
     return null;
 }
 for(int i=0;i<pairs.getSize();i++){
     try{
         KeyValuePair<K,V> res=pairs.dequeue();
         if(res.getKey().equals(key)){
                 val=res.getValue();
         }
         else{
             pairs.enqueue(res);
         }
         
     }
     catch(Exception ex){
         System.out.println(ex.getMessage());
     }
     
 }
 return val;
 
    }
*/
    @Override
    public KeyValuePair<K, V> removeAny() throws Exception {
        if(pairs==null){
            throw new Exception("there");
        }
      KeyValuePair<K,V> res=pairs.dequeue();
      return res;
    }

    @Override
    public int getSize() {
      return pairs.getSize();
    }

    @Override
    public void clear() {
    pairs.clear();
    }
public String toString(){
    return pairs.toString();
}
    
    
}
