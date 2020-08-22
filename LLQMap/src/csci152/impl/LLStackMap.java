/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci152.impl;

import csci152.adt.Map;

/**
 *
 * @author Админ
 */
public class LLStackMap<K,V>implements Map <K,V> {
private LinkedListStack<KeyValuePair<K,V>> pairs;
public LLStackMap(){
 pairs=new LinkedListStack();
}
    @Override
    
    public void define(K key, V value) {
      
       LinkedListStack<KeyValuePair<K,V>> newPairs=new LinkedListStack();
       
        if(pairs.getSize()==0){
            pairs.push(new KeyValuePair(key,value));
    
        }
        else{
        int x=pairs.getSize();
       for(int j=0;j<x;j++){
           
            try {
                KeyValuePair<K,V> map =pairs.pop();
                
                if(!map.getKey().equals(key)){
                    newPairs.push(map);
                }
                else{
                newPairs.push(new KeyValuePair(key,value));
                    int s=newPairs.getSize();
                    
                    for(int k=0;k<s;k++){
                        pairs.push(newPairs.pop());
                    }
                    return;
            }
                if(pairs.getSize()==0){
                      int s=newPairs.getSize();
                    for(int k=0;k<s;k++){
                        pairs.push(newPairs.pop());
                    }
                  pairs.push(new KeyValuePair(key,value));
                }
                
                
             
   } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            
           
       }
    }

    }

    @Override
    public V getValue(K key) {
          V value=null;
       LinkedListStack<KeyValuePair<K,V>> newPairs=new LinkedListStack();
       if(pairs.getSize()==0){
            return value;
        }
        
        int x=pairs.getSize();
       for(int j=0;j<x;j++){
            try {
                KeyValuePair<K,V> map =pairs.pop();
                newPairs.push(map);
                
                if(key.equals(map.getKey())){
                 value=map.getValue();   
                 int s=newPairs.getSize();
                for(int k=0;k<s;k++){
                    pairs.push(newPairs.pop());
                }
                return value;
                }
                else if(pairs.getSize()==0){
                    int s=newPairs.getSize();
                    for(int k=0;k<s;k++){
                        pairs.push(newPairs.pop());
                    }
                    return value;
                }
                        
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            
           
       }  
       
       return value;
    }

    @Override
    public V remove(K key) {

  V value=null;
       LinkedListStack<KeyValuePair<K,V>> newPairs=new LinkedListStack();  
        if(pairs.getSize()==0){
            return value;
        }
    
      
     int x= pairs.getSize();               // надо узнать сайз стака
     
       for(int j=0;j<x ;j++){   // начинаем проверку
           
           try{
               
           KeyValuePair <K,V> map=pairs.pop(); //попаем
           
           if(map.getKey().equals(key)){   // если равно значит мы должны этот элемент убрать
                     value=map.getValue(); // надо заретернить value элемента который убираем
                     
             int size1=newPairs.getSize();  // до этого когда не было равно мы закидывали в новый стак теперь надо все перекинуть в начальный
           for(int i=0;i<size1;i++){
               pairs.push(newPairs.pop());
               return value; // ретерним
           } 
              
           }
           else{  // если не равно мы его закидываем в новый стак 
          newPairs.push(map);
           
           }
   
           if(pairs.getSize()==0){ // если вообще не встречался такой элемент то мы с нового перекидываем все в начальный 
                 int s=newPairs.getSize();
           for(j=0;j<s;j++){
       pairs.push(newPairs.pop());
           }
           return value; // тут будет нал 
               }
           }
                   
           catch(Exception e){
               
           }
       }
       return value;
    }

    @Override
    public KeyValuePair<K, V> removeAny() throws Exception {
      if(pairs.getSize()==0){
            throw new Exception("map is empty");
        }
      KeyValuePair<K,V> res=pairs.pop();
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
