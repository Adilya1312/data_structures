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
public class Student implements Comparable {
     private int ID;
    private String name;

    public Student(int ID, String name){
        this.ID=ID;
        this.name=name;
    }
    public int compareTo(Object o) {
        Student newStudent=(Student)o;
        int newID=newStudent.getID();
        if(ID>newID){
            return 1;
        }
        else if(ID==newID){
            return 0;
        }
        else {
            return -1;
        }
        
        /*return name.compareTo(newStudent.getName());*/
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return name+ " "+ ID;
    }
    public int HashCode(){
        return ID;
        //retutn 42
    }
}
