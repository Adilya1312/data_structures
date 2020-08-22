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
 */
public class TestClass {
    
    public static void main(String []args){
        queueSet();
        stackSet();
       Methods();
    }
    
    
    
    
    public static void queueSet(){
Set <Student> set=new LLQueueSet();



 //First tries to removeAny from the empty set — catch the exception,
// and print the set’s contents and size afterwards to make sure you didn’t break it.
try{
    set.removeAny();
}
 catch(Exception ex){
     System.out.println(ex.getMessage());
 }
 System.out.println(set+ " size : "+ set.getSize());
    
  //  Add 5 unique Students to the set, and print its contents and size
  
     Student student2=new Student(98765, " Saadat");
     Student student1=new Student(12345, " Sarah");
     Student student3=new Student(56789, " Ardak");
      Student student4=new Student(91234, " Aya");
       Student student5=new Student(65432, " Assem");
      set.add(student1);
   
    set.add(student2);
  
      set.add(student3);
    
      set.add(student4);

      set.add(student5);
     System.out.println(set+ " size : "+ set.getSize());
     //Remove a specific Student from the set using a different
     //object with the same values as the Student to be removed, and print the set’s contents and size
        Student student6=new Student(98765, " Saadat");
       System.out.println( set.remove(student6));
        System.out.println(set+ " size : "+ set.getSize());
     //Try to remove a Student from the set whose value is not there, 
     //and print the set’s contents and size
Student student7=new Student(98765, " Adilya");
 System.out.println( set.remove(student7));
  System.out.println(set+ " size : "+ set.getSize());
 // Attempt to add 2 new Student objects that have the same values as
         // those already in the set, and print the set’s contents and size afterwards
       Student student8=new Student(12345, " Sarah");
     Student student9=new Student(56789, " Ardak");   
set.add(student8);
      set.add(student9);
      System.out.println(set+ " size : "+ set.getSize());
      //Add 3 new Students to the set whose values are not already present,
      //and print the set’s contents and size
      
      Student student10=new Student(12345, " Alina");
     Student student11=new Student(56489, " Zhanat");   
     Student student12=new Student(12645, " Ayan");
    
     set.add(student10);
      set.add(student11);
       set.add(student12);
       System.out.println(set+ " size : "+ set.getSize());
      // Call removeAny twice on the set, and output the values of those
      //Students who were removed, as well as the resulting contents and size of the set
      try{
          set.removeAny();
      }
      catch(Exception ex){
          
      }
      try{
          set.removeAny();
      }
      catch(Exception ex){
          
      }
      System.out.println(set+ " size : "+ set.getSize());
     // Clear the set, and print its contents and resulting size
     set.clear();
     System.out.println(set+ " size : "+ set.getSize());
     //Finally, add 2 new Students to the set, and print the set’s contents and size
     Student student13=new Student(56489, "Adilbek");   
     Student student14=new Student(12645, "Aida");
     set.add(student13);
     set.add(student14);
       System.out.println(set+ " size : "+ set.getSize());
}
    public static void stackSet(){
        
      Set <Student> set=new LLStackSet();



 //First tries to removeAny from the empty set — catch the exception,
// and print the set’s contents and size afterwards to make sure you didn’t break it.
try{
    set.removeAny();
}
 catch(Exception ex){
     System.out.println(ex.getMessage());
 }
 System.out.println(set+ " size : "+ set.getSize());
    
  //  Add 5 unique Students to the set, and print its contents and size
  
     Student student2=new Student(98765, " Saadat");
     Student student1=new Student(12345, " Sarah");
     Student student3=new Student(56789, " Ardak");
      Student student4=new Student(91234, " Aya");
       Student student5=new Student(65432, " Assem");
      set.add(student1);
   
    set.add(student2);
  
      set.add(student3);
    
      set.add(student4);

      set.add(student5);
     System.out.println(set+ " size : "+ set.getSize());
     //Remove a specific Student from the set using a different
     //object with the same values as the Student to be removed, and print the set’s contents and size
        Student student6=new Student(98765, " Saadat");
       System.out.println( set.remove(student6));
        System.out.println(set+ " size : "+ set.getSize());
     //Try to remove a Student from the set whose value is not there, 
     //and print the set’s contents and size
Student student7=new Student(98765, " Adilya");
 System.out.println( set.remove(student7));
  System.out.println(set+ " size : "+ set.getSize());
 // Attempt to add 2 new Student objects that have the same values as
         // those already in the set, and print the set’s contents and size afterwards
       Student student8=new Student(12345, " Sarah");
     Student student9=new Student(56789, " Ardak");   
set.add(student8);
      set.add(student9);
      System.out.println(set+ " size : "+ set.getSize());
      //Add 3 new Students to the set whose values are not already present,
      //and print the set’s contents and size
      
      Student student10=new Student(12345, " Alina");
     Student student11=new Student(56489, " Zhanat");   
     Student student12=new Student(12645, " Ayan");
    
     set.add(student10);
      set.add(student11);
       set.add(student12);
       System.out.println(set+ " size : "+ set.getSize());
      // Call removeAny twice on the set, and output the values of those
      //Students who were removed, as well as the resulting contents and size of the set
      try{
          set.removeAny();
      }
      catch(Exception ex){
          
      }
      try{
          set.removeAny();
      }
      catch(Exception ex){
          
      }
      System.out.println(set+ " size : "+ set.getSize());
     // Clear the set, and print its contents and resulting size
     set.clear();
     System.out.println(set+ " size : "+ set.getSize());
     //Finally, add 2 new Students to the set, and print the set’s contents and size
     Student student13=new Student(56489, "Adilbek");   
     Student student14=new Student(12645, "Aida");
     set.add(student13);
     set.add(student14);
       System.out.println(set+ " size : "+ set.getSize());
        
    } 
  public static void Methods(){
         LLQueueSet <Integer> set1=new LLQueueSet();
          set1.add(18);
          
    set1.add(21);
       set1.add(44);
          
    set1.add(23);
       set1.add(35);
          
    set1.add(89);
           LLQueueSet <Integer> set2=new LLQueueSet();
         set2.add(44);
          set2.add(23);
          set2.add(21);
           set2.add(207);
          set2.add(232);
          set2.add(321);
          LLQueueSet <Integer> set3=new LLQueueSet();
          set3.add(44);
          set3.add(23);
          set3.add(21);
           System.out.println("set1: "+set1);
            System.out.println("set2: "+set2);
     System.out.println("intersection: "+ intersection(set1,set2));
     System.out.println("set1: "+set1);
            System.out.println("set3: "+set3);
 System.out.println("is subset:"+isSubset(set3,set2));
 System.out.println("set1: "+set1);
            System.out.println("set2: "+set2);
           System.out.println("is subset:"+isSubset(set1,set2)); 
     LLQueueSet <String> string1 =new LLQueueSet();
          LLQueueSet <String> string2=new LLQueueSet();
               LLQueueSet <String> string3=new LLQueueSet();
               string1.add("book");
               string1.add("food");
               string1.add("flowers");
               string2.add("water");
               string2.add("flowers");
            string3.add("banana");
             string3.add("apple");
              string3.add("food");
                  System.out.println("sting1: "+string1);
                      System.out.println("string3: "+string3);
                       System.out.println("union: "+union(string1,string3));
               System.out.println("sting1: "+string1);
                      System.out.println("string2: "+string2);
                       System.out.println("union: "+union(string1,string2));
              System.out.println("union: "+union(string1,string1)); 
  }
     public static boolean isSubset(Set<Integer> set1, Set<Integer> set2){
        int size1=set1.getSize();

     for(int i=0;i<size1;i++){
                try{
           int number=set1.removeAny();
       
                set1.add(number);
        if(!set2.contains(number))
      return false;
        
        
            }
                 catch(Exception ex){
              System.out.println(ex.getMessage());
        }
            }
  
     return true;
    }
    public static Set<String> union(Set<String> set1, Set<String> set2){
             int size1=set1.getSize();
             int size2=set2.getSize();
              
         LLQueueSet <String> temp=new LLQueueSet();
      for(int i=0;i<size1;i++){
          try{
              String word1=set1.removeAny();
              set1.add(word1);
              temp.add(word1);
             
           
          }
          catch(Exception ex){
              
          }
      }
for(int i=0;i<size2;i++){
    try{
     String word2=set2.removeAny();
              set2.add(word2);
              temp.add(word2);
    }
    catch(Exception ex){
        
    }
    
}
        return temp;
    }
    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2){
         Set <Integer> result=new LLQueueSet();
          
            int size1=set1.getSize();
   
        for(int i=0;i<size1;i++){
           try{
                int number=set1.removeAny();
                set1.add(number);
                if(set2.contains(number)){
                    result.add(number);
                }
            
        }
            catch(Exception ex){
                
            }
        }
    
        return result;
       
        
    }  
    
}