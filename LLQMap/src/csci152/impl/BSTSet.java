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
     if(contains(value)) {
  return;
     }
     else{
        if(size==0){
            root = node;
               size++;
        }
        else{  
       addHelper(root, value);
        }
    }
    }
    private void addHelper(TreeNode <T> newNode, T newVal){
        
        if(newNode.getValue().compareTo(newVal)>0){
            if(newNode.getLeft()==null){
         newNode.setLeft(new TreeNode(newVal));
         size++;
            }
            else{
                addHelper(newNode.getLeft(), newVal);
            }
    
}
        
        else{
            if(newNode.getValue().compareTo(newVal)<0){
            if(newNode.getRight()==null){
         newNode.setRight(new TreeNode(newVal));
         size++;
            }
            else{
                addHelper(newNode.getRight(), newVal);
            }
    
}  
    }
        
    }
    @Override
    public boolean contains(T value) {
      /*  return containsHelper(root, value);
    }
        */
     TreeNode <T>node=root;
     while(node!=null){
         if(node.getValue().compareTo(value)>0){
          node=node.getLeft();
         }
         else if(node.getValue().compareTo(value)<0){
             node=node.getRight();
         }
         else
             return true;
     }
         return false;
     }
    
   
   /*   public boolean containsHelper(TreeNode<T> node, T value) {
    
    if(node==null){
    return false;
    }
    else{
    if(node.getValue().compareTo(value)==0){
    return true;
    }
    else if(node.getValue().compareTo(value)>0){
    
   return  containsHelper(node.getLeft(), value);
    
    }
    else if(node.getValue().compareTo(value)<0){
      return containsHelper(node.getRight(), value);
    
    }
   
    }
    return false;
    }
   */

    @Override
 
      /*TreeNode <T>parent=null;
      TreeNode <T> current=root;
      while(current!=null){
          if(current.getValue().compareTo(value)>0){
             parent=current;
             current=current.getLeft();
          }
          else if(current.getValue().compareTo(value)<0){
              parent=current;
              current=current.getRight();
          }
          else{
              break;
          }
          
      }
      // element is not in the tree
      if(current==null){
          return false;
      }
      // current node has one or no child
      if(current.getRight()==null){
          if(parent==null){
              root=current.getLeft();
          }
          else {
              if(parent.getValue().compareTo(value)<0){
                  parent.setLeft(current.getLeft());
              }
                  else{
                          parent.setRight(current.getLeft());
                          }
              }
          }
      // current node has two childs
      else{
          
          
          
        */  
          
         public boolean remove(T value){
        if (contains(value)){
      
                   
            TreeNode curr = root;
            TreeNode parent = root;
            
            boolean isItALeftChild = true;
            
            while (curr.getValue() != value){ 
                
                parent = curr;
                
                if (value.compareTo(curr.getValue()) < 0){
                    
                    isItALeftChild = true;
                    
                    curr = curr.getLeft();
                } else {
                    
                    isItALeftChild = false;
                    
                    curr=curr.getRight();
                }
                
                if (curr == null){
                    return false;
                }
            }
                
                if (curr.getLeft() == null && curr.getRight() == null){
                    
                    if (curr == root){
                        
                        root = null;
                        
                    } else if (isItALeftChild){
                        
                        parent.setLeft(null);
                        
                    } else {
                        
                        parent.setRight(null);
                        
                    }
                } 
                
                else if(curr.getRight() == null){
                    
                    if (curr == root){
                        root = curr.getLeft();
                        
                    } else if (isItALeftChild){
                        parent.setLeft(curr.getLeft());
                        
                    } else {
                        parent.setRight(curr.getLeft());
                    }
                    
                }
                
                else if(curr.getLeft() == null){
                    
                    if(curr == root){
                        root = curr.getRight();
                        
                    } else if (isItALeftChild){
                        parent.setLeft(curr.getRight());
                        
                    } else {
                        parent.setRight(curr.getRight());
                    }                   
                    
                }
                
                else {
                    
                    TreeNode replace = helper(curr);
                    
                    if(curr == root){
                        root = replace;
                        
                    } else if (isItALeftChild){
                        parent.setLeft(replace);
                        
                    } else {
                        parent.setRight(replace);
                    }
                    
                    replace.setLeft(curr.getLeft());
                } 
    size --;   
    return true;            
} 
         
         return false;
}
        
    
    private TreeNode helper(TreeNode<T> replacedNode){
        
        TreeNode Parent = replacedNode;
        TreeNode replaced = replacedNode;
        
        TreeNode curr = replacedNode.getRight();
        
        while (curr != null){
            
            Parent = replaced;
            
            replaced = curr;
            
            curr = curr.getLeft();
        }
        
        if(replaced!= replacedNode.getRight()){
            
            Parent.setLeft(replaced.getRight());
            replaced.setRight(replacedNode.getRight());
        }
        
        return replaced;
    } 
    
        @Override
 public T removeAny() throws Exception {
        if (size == 0){
            throw new Exception ("The set is empty ");
        }
        
        T value = root.getValue();
        
        remove(value);
        
        return value;
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
        return toStringHelper(node.getLeft())+" "+  node.getValue()+  " "+ toStringHelper(node.getRight());
        
    }
    
}
