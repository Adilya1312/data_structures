
package linkedlistsortedqueue;


public class TestClass {
    public static void main(String[]args){
   
SortedQueue();
Student();
    }
    public static void SortedQueue (){
         LinkedListSortedQueue <Integer> queue=new LinkedListSortedQueue();
      
        //Inserts the integers 90, 80, 70, …, 10 
        //in that order, and then prints its contents and size afterwards
      
        
              queue.insert(90);
                
            queue.insert(80);
            queue.insert(70);   
            queue.insert(60);
            queue.insert(50);
           queue.insert(40);
                queue.insert(30);
                
            queue.insert(20);
            queue.insert(10);   
              queue.insert(100);
           System.out.println(queue+ " size is "+ queue.getSize());
            
        
        
        //Dequeue 3 items from the queue, and print its contents and resulting size
        for(int i=0;i<3;i++){
            try{
            queue.dequeue();
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        System.out.println(queue+ " size is "+ queue.getSize());
        //inserts the integers 
          //      100, 200, 300, …, 900 in that order, and then prints its contents and size afterwards
          for(int i=100;i<1000;i=i+100){
              queue.insert(i);
                
          }
           System.out.println(queue+ " size is "+ queue.getSize());
          //Dequeue 4 items from the queue, and print its contents and resulting size
           for(int i=0;i<3;i++){
            try{
            queue.dequeue();
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
              System.out.println(queue+ " size is "+ queue.getSize());
              //Inserts the integers 5, 15, 25, 35, …, 905, 915 
              //in that order, and then prints its contents and size afterwards
              for(int i=5;i<920;i=i+5){
                  queue.insert(i);
              }
              System.out.println(queue+ " size is "+ queue.getSize());
            //  Create a for loop the dequeue’s all of the items from the queue, 
                     // and then print its contents and resulting size
                     int x=queue.getSize();
for(int i=0;i<x;i++){
    try{
        queue.dequeue();
    }
    catch(Exception ex){
        System.out.println(ex.getMessage());
    }
}
 System.out.println(queue+ " size is "+ queue.getSize());
//Insert three integers (your choice), and print its contents and resulting size

queue.insert(6);
queue.insert(3);
queue.insert(2);
 System.out.println(queue+ " size is "+ queue.getSize());
 //Clear the queue, and print its contents and resulting size
 queue.clear();
 System.out.println(queue+ " size is "+ queue.getSize());
 //Insert four more integers (your choice) to the 
 //queue and finally print its contents and resulting size
 queue.insert(25);
queue.insert(37);
queue.insert(98);
queue.insert(62);
 System.out.println(queue+ " size is "+ queue.getSize());
}
    public static void Student(){
        LinkedListSortedQueue <Student> Student=new LinkedListSortedQueue();
        Student student1=new Student(123,"Aslan");
         Student student2=new Student(456,"Samal");
         Student student3=new Student(463,"Baibek");
         Student student4=new Student(453,"Baibek");
         System.out.println(student1.compareTo(student2));
          System.out.println(student2.compareTo(student1));
           System.out.println(student4.compareTo(student3));
           Student.insert(student3);
           Student.insert(student1);
           Student.insert(student2);
           
          System.out.println(Student);
    }
}
