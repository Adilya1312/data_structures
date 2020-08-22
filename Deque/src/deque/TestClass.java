/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deque;



public class TestClass {
public static void main (String []args){
    LinkedListDeque<Integer> deque=new LinkedListDeque();
     LinkedListDeque<Integer> deque2=new LinkedListDeque();
    //Tries to pop from both the front and the back of the empty deque (an exception should be thrown in both cases.)  
    //Be sure to print the contents and size afterwards to make sure everything is as expected.
    try{
        deque.popFromBack();
    }
    catch(Exception ex){
        System.out.println(ex.getMessage());
    }
    System.out.println(deque+ " size: "+deque.getSize());
     try{
        deque.popFromFront();
    }
    catch(Exception ex){
        System.out.println(ex.getMessage());
    }
     System.out.println(deque+ " size: "+deque.getSize());
    //Pushes 5 items to the front of the deque,
    //and print its contents and resulting size after each push.
    for(int i=0;i<5;i++){
        deque.pushToFront((int)(Math.random()*100));
          System.out.println(deque+ " size: "+deque.getSize());
    }
  
//Pops the 5 items from the front of the deque, 
//and print its contents and resulting size after each pop.
for(int i=0;i<5;i++){
      try{
        deque.popFromFront();
    }
    catch(Exception ex){
        System.out.println(ex.getMessage());
    }
     System.out.println(deque+ " size: "+deque.getSize());
}
   
    
//Pushes 6 items to the front of the deque,
//and print its contents and resulting size after each push.
  for(int i=0;i<6;i++){
        deque.pushToFront((int)(Math.random()*100));
        System.out.println(deque+ " size: "+deque.getSize());
    }
    
//Pops the 6 items from the back of the deque, 
//and print its contents and resulting size after each pop.
for(int i=0;i<6;i++){
      try{
        deque.popFromBack();
    }
    catch(Exception ex){
        System.out.println(ex.getMessage());
    }
     System.out.println(deque+ " size: "+deque.getSize());
}
   
    
//Pushes 7 items to the back of the deque,
//and print its contents and resulting size after each push.
for(int i=0;i<7;i++){
        deque.pushToBack((int)(Math.random()*100));
        System.out.println(deque+ " size: "+deque.getSize());
    }
    
    
//Pops the 7 items from the back of the deque, 
//and print its contents and resulting size after each pop.
for(int i=0;i<7;i++){
      try{
        deque.popFromBack();
    }
    catch(Exception ex){
        System.out.println(ex.getMessage());
    }
   System.out.println(deque+ " size: "+deque.getSize()); 
}
    
    
//Pushes 8 items to the back of the deque, 
//and print its contents and resulting size after each push.
for(int i=0;i<8;i++){
        deque.pushToBack((int)(Math.random()*100));
        System.out.println(deque+ " size: "+deque.getSize());
    }

//Pops the 8 items from the front of the deque, 
//and print its contents and resulting size after each pop.
for(int i=0;i<8;i++){
      try{
        deque.popFromFront();
    }
    catch(Exception ex){
        System.out.println(ex.getMessage());
    }
   System.out.println(deque+ " size: "+deque.getSize()); 
}
//Repeat the following 10 times using a loop:
//Pushes an item to the front, and then to the back, and print the contents and resulting size
for(int i=0;i<10;i++){
    deque.pushToBack((int)(Math.random()*100));
    deque.pushToFront((int)(Math.random()*100));
}
System.out.println(deque+ " size: "+deque.getSize()); 
//Repeat the following 8 times using a loop:
//Pops an item from the front, and then from the back, and print the contents and resulting size
for(int i=0;i<8;i++){
    try{
        deque.popFromBack();
    }
     catch(Exception ex){
         System.out.println(ex.getMessage());
     }
      try{
        deque.popFromFront();
    }
     catch(Exception ex){
         System.out.println(ex.getMessage());
     }
}
System.out.println(deque+ " size: "+deque.getSize()); 

//Clear the remaining elements from the deque, and print its contents and resulting size
deque.clear();
System.out.println(deque+ " size: "+deque.getSize()); 
//Push some more items to the deque from either end, and print its contents and resulting size
deque.pushToFront(1);
deque.pushToFront(2);
deque.pushToFront(3);
deque.pushToFront(4);
deque2.pushToFront(7);
deque2.pushToFront(8);
deque2.pushToFront(9);
deque2.pushToFront(10);
merge(deque,deque2);


System.out.println(deque+ " size: "+deque.getSize()); 
}  
public static Deque<Integer> merge(Deque<Integer> d1, Deque<Integer> d2) {
 /* assuming d1 and d2 are sorted, merge their contents
       into a single sorted Deque, and return it */
 int size1=d1.getSize();
 int size2=d2.getSize();
 LinkedListDeque<Integer> deque=new LinkedListDeque();

     int count1 =0, count2=0;
     
     int length = size1+size2;
     
    
     
     int temp1=0;
        int temp2=0;
     
   
     
     for(int i=0; i<length; i++){
         
         try {
            temp1 = d1.popFromFront();
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
         }
         
         try {
            temp2 = d2.popFromFront();
         } catch (Exception ex) {
                   System.out.println(ex.getMessage());
         }
         
         if(count1==size1){
             deque.pushToBack(temp2);
             count2++;
         }else if(count2 == size2){
             deque.pushToBack(temp1);
             count1++;
         }
         else if(temp1<temp2){
             deque.pushToBack(temp1);
             count1++;
             d2.pushToFront(temp2);
         } else{
            deque.pushToBack(temp2);
            d1.pushToFront(temp1);
             count2++; 
         }
         
     }
     
 

return deque;
}
public static Deque<Integer> mergeSort(Deque<Integer> deq) {
    Deque<Integer> temp1 = new LinkedListDeque();
     Deque<Integer> temp2 = new LinkedListDeque();
     int num = (deq.getSize()/ 2);
         int size = deq.getSize();
         if(size <= 1){
             return deq;
         }
         else{
             
             
             for (int i = 0; i < num; i++) {
                try {
                    temp1.pushToBack(deq.popFromFront());
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
             }
             
            
             for (int i = num; i < size; i++) {
                try {
                    temp2.pushToBack(deq.popFromFront());
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
             }
             
             temp1 = mergeSort(temp1);
             temp2 = mergeSort(temp2);
             
             return merge(temp1, temp2);
             
             
         }

         
    } 
}