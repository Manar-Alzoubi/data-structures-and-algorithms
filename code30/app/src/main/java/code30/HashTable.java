package code30;

import java.util.*;

public class HashTable <K,V>{
    private ArrayList<HashNode<K, V>> bucketArray;
    private int buckets;
    private int size;

    public HashTable() {
        bucketArray = new ArrayList<>();
        buckets = 10;
        for (int index = 0; index < buckets; index++) {
            bucketArray.add(null);
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int hashCode(K key) {
        return Objects.hashCode(key);
    }



    public void set(K key, V value) {
        // find the index of where we should put the value in
        // the bucket array
        int index = hash(key);
        int hashcode = hashCode(key);

        // create head and make it point to where the index is
        HashNode<K, V> head = bucketArray.get(index);

        HashNode<K, V> newNode = new HashNode<>(key, value, hashcode);

        // head could be pointing to a list, so we need
        // to loop over the potential list and insert a
        // new node at the end.
        if (head == null) {
            bucketArray.set(index, newNode);
            size++;
        } else {
            newNode.setNext(head.getNext());
            head.setNext(newNode);
            size++;
        }

        // If load factor goes beyond threshold, then
        // double hash table size
        if ((1.0 * size) / buckets >= 0.7) {
            ArrayList<HashNode<K, V> > temp = bucketArray;
            bucketArray = new ArrayList<>();
            buckets = 2 * buckets;
            size = 0;
            for (int i = 0; i < buckets; i++)
                bucketArray.add(null);

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    set(headNode.getKey(), headNode.getValue());
                    headNode = headNode.getNext();
                }
            }
        }
    }

    //Returns: Value associated with that key in the table
    public V get(K key) {
        int index = hash(key);
        int hashcode = hashCode(key);
        HashNode<K, V> head = bucketArray.get(index);

            while (head != null) {
                if (head.getKey().equals(key) && head.getHashCode().equals(hashcode))
                    return head.getValue();
                head = head.getNext();
            }
        return null;
    }

    // Returns: Boolean, indicating if the key exists in the table already.
    public boolean contains(K key) {
        int index = hash(key);
        int hashcode = hashCode(key);
        HashNode<K, V> head = bucketArray.get(index);
        if (key == null) {
            throw new IllegalArgumentException("error occured !");
        }
        while(head != null) {
            if (head.getKey().equals(key) && head.getHashCode().equals(hashcode))
                return true;
            head = head.getNext();
        }
        return false;
    }

    //    //Returns: Collection of keys
    public ArrayList<K> keys() {
        ArrayList<K> arrOfKeys = new ArrayList<>();
        for (int i = 0; i < bucketArray.size(); i++) {
            HashNode<K, V> head = bucketArray.get(i);
            while(head != null){
                arrOfKeys.add(head.getKey());
                head = head.getNext();
            }
        }
        return arrOfKeys;
    }


    // Returns: Index in the collection for that key
    int hash(K key) {
        int hashCode = hashCode(key);
        int arrayIndex = hashCode % buckets;
        arrayIndex = arrayIndex < 0 ? arrayIndex * -1 : arrayIndex;
//        System.out.println("The index of => " + key + " is => " + arrayIndex);
        return arrayIndex;
    }


    ////////////////// code challenge 31 /////////////////

    public String repeatedWord(String str){
        String replaceComma = str.replace(",","");
        String[] arr = replaceComma.split(" ");
        Map<String,Integer> wordsList =new HashMap<>();
        for (String subStr : arr){
            Integer count = wordsList.get(subStr.toLowerCase());
            if(count != null){
                wordsList.put(subStr.toLowerCase(), count +1);
                return subStr.toLowerCase();
            }else {
                wordsList.put(subStr.toLowerCase(), 0);
            }
        }
        return "no repeated : str is empty ";
    }



}

