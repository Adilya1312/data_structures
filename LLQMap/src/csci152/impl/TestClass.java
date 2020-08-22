/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci152.impl;

/**
 *
 * @author Админ
 */
public class TestClass {
    public static void main(String []args){
        //System.out.println("Testing for LLQMap");
        LLQueueMapTest();
       // System.out.println("Testing for LLStackMap");
        // LLStackMapTest();
    }
    public static void LLQueueMapTest(){
        BSTMap <Integer,String> map=new BSTMap();
    //First tries to removeAny from the empty map — catch the exception, and print the map’s contents and size afterwards
    /*try{
        System.out.println(map.removeAny());
    }
    catch(Exception ex){
    System.out.println("map is empty");
    }
    System.out.println("content: "+ map+" size: "+ map.getSize());
    */
  //Define five unique mappings, and then print out the contents and size of the map
  map.define(136, "Sarah");
  map.define(679, "Zhanat");
  map.define(456, "Saadat");
  map.define(345, "Aliya");
   map.define(875, "Ayan");
    System.out.println("content: "+ map+" size: "+ map.getSize());
/*//Remove a specific mapping that is currently in the map, and print the resulting contents and size
System.out.println(map.remove(345));
System.out.println("content: "+ map+" size: "+ map.getSize());
//Try to remove a mapping where the key is not actually in the map, and print the resulting contents and size
System.out.println(map.remove(945));
System.out.println("content: "+ map+" size: "+ map.getSize());

//Define 2 new mappings that have the same keys but different values 
//from those that are currently in the map; print the map’s contents and size afterwards
map.define(679, "Madina");
  map.define(456, "Askar");
  System.out.println("content: "+ map+" size: "+ map.getSize());
//Define 3 new mappings whose keys are not already present in the map, and print the resulting contents and size
map.define(748, "Sanzhar");
  map.define(956, "Zhansaya");
  map.define(236, "Farhad");
  System.out.println("content: "+ map+" size: "+ map.getSize());
//Call removeAny twice, and print the key-value pairs that were removed, 
//as well as the resulting contents and size of the 
  try{
        System.out.println(map.removeAny());
    }
    catch(Exception ex){
    System.out.println(ex.getMessage());
    }
    System.out.println("content: "+ map+" size: "+ map.getSize());
    
//Clear the map, and print its contents and resulting size
map.clear();
  System.out.println("content: "+ map+" size: "+ map.getSize());
//Finally, add 2 new unique mappings to the map, and print it’s contents and size
      map.define(212, "Zhan");
  map.define(555, "Zhanna");    
         System.out.println("content: "+ map+" size: "+ map.getSize()); 
}
 */   

    }
    public static void LLStackMapTest(){
           LLStackMap <Integer,String> map=new LLStackMap();
    //First tries to removeAny from the empty map — catch the exception, and print the map’s contents and size afterwards
    try{
        System.out.println(map.removeAny());
    }
    catch(Exception ex){
    System.out.println("map is empty");
    }
    System.out.println("content: "+ map+" size: "+ map.getSize());
    
  //Define five unique mappings, and then print out the contents and size of the map
  map.define(136, "Sarah");
  map.define(679, "Zhanat");
  map.define(456, "Saadat");
  map.define(345, "Aliya");
   map.define(875, "Ayan");
    System.out.println("content: "+ map+" size: "+ map.getSize());
//Remove a specific mapping that is currently in the map, and print the resulting contents and size
System.out.println(map.remove(345));
System.out.println("content: "+ map+" size: "+ map.getSize());
//Try to remove a mapping where the key is not actually in the map, and print the resulting contents and size
System.out.println(map.remove(789));
System.out.println("content: "+ map+" size: "+ map.getSize());

//Define 2 new mappings that have the same keys but different values 
//from those that are currently in the map; print the map’s contents and size afterwards
map.define(679, "Madina");
  map.define(456, "Askar");
  System.out.println("content: "+ map+" size: "+ map.getSize());
//Define 3 new mappings whose keys are not already present in the map, and print the resulting contents and size
map.define(748, "Sanzhar");
  map.define(956, "Zhansaya");
  map.define(236, "Farhad");
  System.out.println("content: "+ map+" size: "+ map.getSize());
//Call removeAny twice, and print the key-value pairs that were removed, 
//as well as the resulting contents and size of the 
  try{
        System.out.println(map.removeAny());
    }
    catch(Exception ex){
    System.out.println(ex.getMessage());
    }
    System.out.println("content: "+ map+" size: "+ map.getSize());
    
//Clear the map, and print its contents and resulting size
map.clear();
  System.out.println("content: "+ map+" size: "+ map.getSize());
//Finally, add 2 new unique mappings to the map, and print it’s contents and size
      map.define(212, "Zhan");
  map.define(555, "Zhanna");    
         System.out.println("content: "+ map+" size: "+ map.getSize()); 
    }
    
}
