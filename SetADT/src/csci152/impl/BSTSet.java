
package csci152.impl;

import csci152.adt.Set;


public class BSTSet<T extends Comparable> implements Set<T> {

    private TreeNode<T> root;
    private int size;


    public BSTSet() {
        root = null;
        size = 0;
    }

    @Override
    public void add(T value) {
        TreeNode<T> node = new TreeNode(value);
        if(size==0){
            root = node;
        }else if(!contains(value)){
            TreeNode<T> temp = root;    
        
            while(temp!=null){
                if(temp.getValue().compareTo(node.getValue()) > 0){
                    
                    if(temp.getLeft() == null) {
                        temp.setLeft(node);
                        return;
                    }
                    temp = temp.getLeft();
                }
                else if(temp.getValue().compareTo(node.getValue()) <= 0){
                   
                    if(temp.getRight() == null) {
                        temp.setRight(node);
                        return;
                    }
                    temp = temp.getRight();
                }
            }
        }
        
    }

    @Override
    public boolean contains(T value) {
        if(size==0){ 
            return false;
        }
        TreeNode<T> temp = root;
        while(true){
            int num = temp.getValue().compareTo(value);
            
            if(num>0){
               
                if(temp.getLeft() == null) return false;
                temp  = temp.getLeft();
            }else if(num<0){
          
                if(temp.getRight() == null) return false;
                temp  = temp.getRight();
            }else
           
                return true;
        }
    }

    @Override
    public boolean remove(T value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T removeAny() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }
    
    public String toString(){
        return toStringHelper(root);
    }
    
    public String toStringHelper(TreeNode node){
        if(node == null){
            return "";
        }
        return toStringHelper(node.getLeft())+" "+node.getValue()+" "+ 
                toStringHelper(node.getRight());
        
    }
    
    
}