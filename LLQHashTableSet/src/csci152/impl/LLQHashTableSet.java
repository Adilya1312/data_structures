/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci152.impl;


import csci152.adt.HashTableSet;




/**
 *
 * @author Админ
 * @param <T>
 */
public class LLQHashTableSet <T> implements HashTableSet <T>{
    

private LinkedListQueue <T>  [] buckets;
int size;
public LLQHashTableSet(int num){
    buckets=new LinkedListQueue[num];
    size=0;
}
    public void add(T value) {

        int index=Math.abs(value.hashCode())%buckets.length;
        
        if(!contains(value)){
            if(buckets[index]==null){
            
                 buckets[index]=new LinkedListQueue();
            }
           
               
                buckets[index].enqueue(value);
            
            size++;
        }
        
    }
/*public void add(T value){
 int index=value.Hashcode()%buckets.length;
    int in=Math.abs(index);
    if(!contains(value)){
    if(bucket[in]==null){
    buckets[in]=new LinkedListQueue();
    
    }
    else{
    bcukets[index].enqueue(value);
    
  

}
*/
    @Override
    public boolean contains(T value) {


    int index=Math.abs(value.hashCode())%buckets.length;
     
     if(buckets[index]==null){
         return false;
     }
    
  
              
              for(int i=0; i<buckets[index].getSize(); i++){
            try {
                T res = buckets[index].dequeue();
                buckets[index].enqueue(res);
                if(res.equals(value)){
                    return true;
                }
                    
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            
        }
        
    
    return false;    
   
    }

    @Override
    public boolean remove(T value) {

       if(size==0){
            return false;
        }
  int in=value.hashCode()%buckets.length;
        int index=Math.abs(in);
        
   if(contains(value)){
     for(int i=0;i<buckets[index].getSize();i++){
         try{
            T res=buckets[index].dequeue();
            if(res==value){
              return true;  
         }
            buckets[index].enqueue(res);
         }
         catch(Exception ex){
             
         }
         
             
         }
     size--;
     }
       
   return false;
    }
    
    public T removeAny() throws Exception {

  if(size==0){
      throw new Exception("buckets are empty");
  }

  
  T res=null;
 for(int i=0;i<buckets.length;i++){
     if(buckets[i].getSize()!=0){
          res=buckets[i].dequeue();
         break;
        
     }
   
  
 
 }
 size--;
    return res;
   
}

    
    @Override
    public int getSize() {
     return size;
    }

    @Override
    public void clear() {
        for(int i=0;i<buckets.length;i++){
            buckets[i].clear();
        }
size=0;
    
 
    }  
public String toString(){

  String res="";
    for(int i=0;i<buckets.length;i++){
        if(buckets[i]!=null){
        res=res+ buckets[i].toString()+" ";
        }
    }
    return res;
}

    @Override
    public int getNumberOfBuckets() {
    return buckets.length;
    }

    @Override
    public int getBucketSize(int index) throws Exception {
       if(buckets[index]==null){
           throw new Exception(" index out of bounds ");
       }
       return buckets[index].getSize();
    }

    @Override
    public double getLoadFactor() {
        double load=size/buckets.length;
      return load;
    }

    @Override
    public double getBucketSizeStandardDev() {
        double sum=0;
        double sumOfSquares=0;
     for(int i=0;i<buckets.length;i++){
         if(buckets[i]!=null){
             sum=sum+buckets[i].getSize();
            
             
         }
     }
     double mean=sum/buckets.length;
     
     for(int i=0;i<buckets.length;i++){
         if(buckets[i]!=null){
             sumOfSquares=sumOfSquares+Math.pow(buckets[i].getSize()-mean, 2);
         }
     }
   double stdv=Math.pow(sumOfSquares/buckets.length,1/2);
   return stdv;
    }
    @Override
    public String bucketsToString() {
 return toString();
    }
   
}
