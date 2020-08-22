
package csci152.impl;

import csci152.adt.Map;


public class BSTMap <K extends Comparable,V > implements Map<K,V>{
private TreeNode <KeyValuePair <K,V>> root;
private int size;

public BSTMap(){
    root=null;
    size=0;
}
@Override
    public void define(K key, V value) {
       KeyValuePair<K,V> pair=new KeyValuePair(key,value);
       TreeNode<KeyValuePair<K,V>> temp=new TreeNode(pair);
       if(root==null){
           
           root=temp;
       }
       else{
            TreeNode<KeyValuePair<K,V>>  parent=root;
             TreeNode<KeyValuePair<K,V>>  current=root;
           while(current!=null){
               if(current.getValue().getKey().compareTo(key)>0){
                   parent=current;
                   current=current.getLeft();
               }
               else if(current.getValue().getKey().compareTo(key)>0){
                   parent=current;
                   current=current.getRight();
               }
               else if(current.getValue().getKey().compareTo(key)==0){
                  return; 
               }

           }
           if(parent.getLeft().getValue().getKey().compareTo(key)>0){
               parent.setLeft(temp);
           }
           else if(parent.getRight().getValue().getKey().compareTo(key)<0){
               parent.setRight(temp);
           }
           else if(current.getValue().getKey().compareTo(key)==0){
               if(parent.getValue().getKey().compareTo(key)<0){
                   parent.setRight(temp);
               }
               else{
                   parent.setLeft(temp);
               }
           }
           
           
       }       
}

    @Override
    public V getValue(K key) {
     return null;
    }

    @Override
    public V remove(K key) {
    return null;
}
        
    
    
    

    @Override
    public KeyValuePair<K, V> removeAny() throws Exception {
      if (size == 0){
            throw new Exception ("The map is empty ");
        }
    KeyValuePair<K,V> val=root.getValue();
    remove(root.getValue().getKey());
    return val;
    }

    @Override
    public int getSize() {
     return size;
    }

    @Override
    public void clear() {
        root=null;
        size=0;
    }
    public String toString(){
        return toStringHelper(root);
    }
    public String toStringHelper(TreeNode<KeyValuePair<K,V>> node){
        if(node==null){
            return " ";
        }
        else{
        return toStringHelper(node.getLeft())+" "+node.getValue()+" "+ 
                toStringHelper(node.getRight());
    }
    }
}
