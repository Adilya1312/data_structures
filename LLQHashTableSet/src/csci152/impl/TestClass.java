//*


package csci152.impl;

import csci152.adt.Set;

/**
 *
 * @author Админ
 */
public class TestClass {
    public static void main(String []args){
        
        intSet();
       
        hashingWithBST();
     
    }
    public static void intSet(){
        LLQHashTableSet set=new LLQHashTableSet(10);
       // First tries to removeAny from the empty set — catch the exception, and print the set’s contents and size afterwards
       try{
           System.out.println(set.removeAny());
       }
       catch(Exception ex){
           System.out.println(ex.getMessage());
       }
       System.out.println("content: "+ set.toString()+ "size: "+ set.getSize());
     
//Add the integers 1 through 20 to the set, and print its contents and size
for(int i=1;i<=20;i++){
    set.add(i);
}
 System.out.println("content: "+ set.toString()+ "size: "+ set.getSize());

       
 //Remove the even integers 2, 4, 6,…, 20, from the set and print the set’s contents and size
 for(int i=2;i<=20;i=i+2){
     System.out.println(set.remove(i));
 }
 System.out.println("content: "+ set.toString()+ "size: "+ set.getSize());
//Try to remove the values 10 and 100 from the set, and verify that remove returns a false in both cases.  Print the set’s contents and size afterwards
System.out.println(set.remove(10));
System.out.println("content: "+ set.toString()+ "size: "+ set.getSize());
System.out.println(set.remove(100));
System.out.println("content: "+ set.toString()+ "size: "+ set.getSize());

//Now add the integers 1 to 30 to the set, and print the set’s contents and size afterwards
for(int i=1;i<=30;i++){
     set.add(i);
 }
 System.out.println("content: "+ set.toString()+ "size: "+ set.getSize());
 
//Call removeAny 10 times on the set, and output the values that were removed, as well as the resulting contents and size of the set
for(int i=0;i<10;i++){
    try{
     System.out.println(set.removeAny())
             ;
     System.out.println("content: "+ set.toString()+ "size: "+ set.getSize());
    }
    catch(Exception ex){
        
    }
 }

//Clear the set, and print its contents and resulting size
set.clear();
 System.out.println("content: "+ set.toString()+ "size: "+ set.getSize());
//Finally, add the odd values 51, 53,…, 79 to the set, and print the set’s contents and size

      for(int i=51;i<=79;i=i+2){
     set.add(i);
 }
 System.out.println("content: "+ set.toString()+ "size: "+ set.getSize());  
        
        
        
        
    }
public static void test(){
     
     Set<Integer> set = new LLQHashTableSet(10);

     System.out.println("Starting timing tests...");
     long time1, time2, duration;
     time1 = System.currentTimeMillis();
     
     for (int i = 0; i < 500000; i++) {
          set.add(i);
     }
   
     time2 = System.currentTimeMillis();
     duration = time2 - time1;

     System.out.println("Time taken in ms: " + duration);
}
  public static void hashingWithLLQ(){
    


//a)  Next, create (or use your previous version of) the class Student which has the fields id,
//which should be an int, and name, which should be of type String. 
//Be sure to implement equals in Student so that it checks for equality of both the id’s and name’s of two Students. 
//Also implement a reasonable toString method, as well as a hashCode that simply returns the value 42.  
//(This is a legal hash function, though not a good one.)


//Now, write a separate testing class which instantiates a LLQHashTableSet  with 10 buckets to
//store Student objects, and then add 200 Students to it, with the id’s 100, 101, 102, 103,…,299 
//but all with the name of “Bob”. 🙂  Print out the resulting load factor, and bucket size standard deviation 
//for the hash table set, and record them on a separate sheet of paper
//which you will need to bring in during live grading.
  LLQHashTableSet<Student> set1=new LLQHashTableSet(10);
      for(int i=100;i<300;i++){
          set1.add(new Student(i,"Bob"));
      }
       System.out.println("a.content: "+ set1.toString()+ "size: "+ set1.getSize());  
      System.out.println("load factor: "+ set1.getLoadFactor()+ "stdev: "+ set1.getBucketSizeStandardDev());
      
      
      
      
//b)  Increase the number of buckets to 100, repeat the same tests as before, 
//and record the resulting statistics on your paper.
 LLQHashTableSet<Student> set2=new LLQHashTableSet(100);
      for(int i=100;i<300;i++){
          set2.add(new Student(i,"Bob"));
      }
       System.out.println("b.content: "+ set2.toString()+ "size: "+ set2.getSize());  
       System.out.println("load factor: "+ set2.getLoadFactor()+ "stdev: "+ set2.getBucketSizeStandardDev()); 
      
//c) Now, change your hashCode method in Student to something more reasonable, where it outputs the id of the given Student.  
//Using 10 buckets in your hash table set, repeat the same tests as above, and record your results.
 LLQHashTableSet<Student> set3=new LLQHashTableSet(10);
      for(int i=100;i<300;i++){
          set3.add(new Student(i,"Bob"));
      }
       System.out.println("c.content: "+ set3.toString()+ "size: "+ set2.getSize()); 
  System.out.println("load factor: "+ set3.getLoadFactor()+ "stdev: "+ set3.getBucketSizeStandardDev());
//d)  Using the same hashCode as in c), but increasing the number of buckets to 100, repeat the tests and record your results.
 LLQHashTableSet<Student> set4=new LLQHashTableSet(100);
      for(int i=100;i<300;i++){
          set4.add(new Student(i,"Bob"));
      }
       System.out.println("d.content: "+ set4.toString()+ "size: "+ set4.getSize()); 
  System.out.println("load factor: "+ set4.getLoadFactor()+ "stdev: "+ set4.getBucketSizeStandardDev());
//e)  Answer the following questions on your sheet of paper:  Did any of the results surprise you? 
//What statistic is mainly impacted by the number of buckets in the hash table?
//What statistic is mainly impacted by the hash function?

 
    
  }  
  public static void hashingWithBST(){
      //a)  Next, create (or use your previous version of) the class Student which has the fields id,
//which should be an int, and name, which should be of type String. 
//Be sure to implement equals in Student so that it checks for equality of both the id’s and name’s of two Students. 
//Also implement a reasonable toString method, as well as a hashCode that simply returns the value 42.  
//(This is a legal hash function, though not a good one.)

      //Now, write a separate testing class which instantiates a LLQHashTableSet  with 10 buckets to
//store Student objects, and then add 200 Students to it, with the id’s 100, 101, 102, 103,…,299 
//but all with the name of “Bob”. 🙂  Print out the resulting load factor, and bucket size standard deviation 
//for the hash table set, and record them on a separate sheet of paper
//which you will need to bring in during live grading.
  BSTHashTableSet<Student> set1=new BSTHashTableSet(10);
      for(int i=100;i<300;i++){
          set1.add(new Student(i,"Bob"));
      }
       System.out.println("content: "+ set1.toString()+ "size: "+ set1.getSize());  
      
        System.out.println("load factor: "+ set1.getLoadFactor()+ "stdev: "+ set1.getBucketSizeStandardDev());
      
      
//b)  Increase the number of buckets to 100, repeat the same tests as before, 
//and record the resulting statistics on your paper.
 BSTHashTableSet<Student> set2=new BSTHashTableSet(100);
      for(int i=100;i<300;i++){
          set2.add(new Student(i,"Bob"));
      }
       System.out.println("content: "+ set2.toString()+ "size: "+ set2.getSize());  
        System.out.println("load factor: "+ set2.getLoadFactor()+ "stdev: "+ set2.getBucketSizeStandardDev());
      
//c) Now, change your hashCode method in Student to something more reasonable, where it outputs the id of the given Student.  
//Using 10 buckets in your hash table set, repeat the same tests as above, and record your results.
 BSTHashTableSet<Student> set3=new BSTHashTableSet(10);
      for(int i=100;i<300;i++){
          set2.add(new Student(i,"Bob"));
      }
       System.out.println("content: "+ set3.toString()+ "size: "+ set2.getSize()); 
  System.out.println("load factor: "+ set3.getLoadFactor()+ "stdev: "+ set3.getBucketSizeStandardDev());
//d)  Using the same hashCode as in c), but increasing the number of buckets to 100, repeat the tests and record your results.
 BSTHashTableSet<Student> set4=new BSTHashTableSet(100);
      for(int i=100;i<300;i++){
          set2.add(new Student(i,"Bob"));
      }
       System.out.println("content: "+ set3.toString()+ "size: "+ set2.getSize()); 
  System.out.println("load factor: "+ set4.getLoadFactor()+ "stdev: "+ set4.getBucketSizeStandardDev());

//e)  Answer the following questions on your sheet of paper:  Did any of the results surprise you? 
//What statistic is mainly impacted by the number of buckets in the hash table?
//What statistic is mainly impacted by the hash function?
 
  }
  public static void TimingTest1(){
        LLQHashTableSet<Integer> set = new LLQHashTableSet(10);

     System.out.println("Starting timing tests...");
     long time1, time2, duration;
     time1 = System.currentTimeMillis();
     
     for (int i = 0; i < 50000; i++) {
          set.add(i);
     }
   
     time2 = System.currentTimeMillis();
     duration = time2 - time1;

     System.out.println("Time taken in ms: " + duration);
     System.out.println("load factor: "+ set.getLoadFactor()+ "stdev: "+ set.getBucketSizeStandardDev());
  }
  public static void TimingTest2(){
        LLQHashTableSet<Integer> set = new LLQHashTableSet(10);

     System.out.println("Starting timing tests...");
     long time1, time2, duration;
     time1 = System.currentTimeMillis();
     
     for (int i = 0; i < 500000; i++) {
          //set.add((int)(Math.random()*100);
     }
   
     time2 = System.currentTimeMillis();
     duration = time2 - time1;

     System.out.println("Time taken in ms: " + duration);
     System.out.println("load factor: "+ set.getLoadFactor()+ "stdev: "+ set.getBucketSizeStandardDev());
  }
}