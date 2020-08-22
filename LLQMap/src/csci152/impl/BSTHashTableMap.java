/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci152.impl;

import csci152.adt.HashTableMap;


 public class BSTHashTableMap<K, V> implements HashTableMap<K, V>{
    
    private TreeNode<KeyValuePair<K, V>>[] buckets;
    private int size;
    
    public BSTHashTableMap(int length){
        buckets = new TreeNode[length];
        size = 0;
    }
    
    private int helper(TreeNode<KeyValuePair<K, V>> pair){
        
        int index = Math.abs(pair.getValue().hashCode())% buckets.length;
         
        return index;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        int length = buckets.length;        
        buckets = new TreeNode[length];
        size = 0;
    }
    
    public String toString(){
        String line = "";
        
        for (int i = 0; i < buckets.length; i++){
            if (buckets[i] != null){
                line = line + buckets[i].toString();
            }
        }
        
        return line;
    }

    @Override
    public int getNumberOfBuckets() {
        return buckets.length;
    }

    @Override
    public int getBucketSize(int index) throws Exception {
        return gbsHelp(buckets[index]);
    }
    
    private int gbsHelp(TreeNode<KeyValuePair<K, V>> tkvp){
        if (tkvp == null){
            return 0;
        }
        return gbsHelp(tkvp.getLeft()) + 1 + gbsHelp(tkvp.getRight());
    }

    @Override
    public double getLoadFactor() {
        return getSize()/getNumberOfBuckets();
    }

    public double getBucketSizeStandeardDev() {
        double mean = 0;
        
        for (int i = 0; i < buckets.length; i++){
            if (buckets != null && buckets[i] != null){
                try{
                mean = mean + getBucketSize(i);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        
        mean = mean / getNumberOfBuckets();
        
        double sum = 0;
        
        for (int i = 0; i < buckets.length; i++){
            if (buckets != null && buckets[i] != null){
                try{
                sum = sum + Math.pow(Math.abs(getBucketSize(i) - mean), 2);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        
        return Math.sqrt(sum/buckets.length);
    }

    @Override
    public String bucketsToString() {
        String result = "";
        
        for (int i = 0; i < buckets.length; i++){
            result = result + "bucket #" + i+1 + ": " + buckets[i].toString() + "\n";
        }
        
        return result;
    }

    @Override
    public void define(K key, V value) {
        TreeNode<KeyValuePair<K, V>> add = new TreeNode(new KeyValuePair(key, value));
        try{
        if (buckets[helper(add)] == null){
            
            buckets[helper(add)] = add;
            
        } else if (add.getValue().getKey().equals(buckets[helper(add)].getValue().getKey())){
            
            buckets[helper(add)].setLeft(add);
            }
        
        } catch (Exception ex){
            System.out.println();
        }
    }

    @Override
    public V getValue(K key) {
        TreeNode<KeyValuePair<K, V>> check = new TreeNode(new KeyValuePair(key, null));
        
        if (buckets[helper(check)] == null){
            return null;
        } else {
            V result = recuriveFinder(buckets[helper(check)], key);
        }
        
        return null;
    }
    
    private V recuriveFinder(TreeNode<KeyValuePair<K, V>> root, K key){
        TreeNode<KeyValuePair<K, V>> check = new TreeNode(new KeyValuePair(key, null));
        
        if (check.getValue().compareTo(root.getValue()) < 0){
            return recuriveFinder(root.getLeft(), key);
        } else if (root.getValue().getKey().equals(key)){
            return root.getValue().getValue();
        } else {
            return recuriveFinder(root.getRight(), key);
        }
    }

    @Override
    public V remove(K key) {
        if (size == 0){
            return null;
        }
        
        TreeNode<KeyValuePair<K, V>> check = new TreeNode(new KeyValuePair(key, null));
        
        if (buckets[helper(check)] == null){
            return null;
        }
        return null;
    }

    @Override
    public KeyValuePair<K, V> removeAny() throws Exception {
        if (size == 0){
            throw new Exception("The set is empty! Add some values first");
        }
        
        KeyValuePair<K, V> result = null;
        
        for (int i = 0; i < buckets.length; i++){
            if (buckets[i] != null){
                result = buckets[i].getValue();
                getReplacementNode(buckets[i]);
                break;
            }             
        }
        size--;
        return result;
    }
    
    private TreeNode<KeyValuePair<K, V>> getReplacementNode(TreeNode<KeyValuePair<K, V>> replacedNode){
        
        TreeNode<KeyValuePair<K, V>> replacementParent = replacedNode;
        TreeNode<KeyValuePair<K, V>> replacement = replacedNode;
        
        TreeNode<KeyValuePair<K, V>> focusNode = replacedNode.getRight();
        
        while (focusNode != null){
            
            replacementParent = replacement;
            
            replacement = focusNode;
            
            focusNode = focusNode.getLeft();
        }
        
        if(replacement != replacedNode.getRight()){
            
            replacementParent.setLeft(replacement.getRight());
            replacement.setRight(replacedNode.getRight());
        }
        
        return replacement;
    } 

    @Override
    public double getBucketSizeStandardDev() {
    return 2;
    }





}  

