# Hashtables
<!-- Short summary or background information -->

A hash table is a data structure that is used to store keys/value pairs. It uses a hash function to compute an index into an array in which an element will be inserted or searched. By using a good hash function, hashing can work well.

## Challenge
<!-- Description of the challenge -->
* Implement a Hashtable Class with the following methods:
  * set()
  * get()
  * contains()
  * keys()
  * hash()


## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

* set()
  * should hash the key, and set the key and value pair in the table, handling collisions as needed.
  * Should a given key already exist, replace its value from the value argument given to this method.
  * Time complixity : O(n)
  * space complixity : O(1)
  
* get()
  * Returns: Value associated with that key in the table
  * Time complixity :O(n)
  * space complixity :O(1)
  
* contains()
  * Returns: Boolean, indicating if the key exists in the table already.
  * Time complixity :O(n)
  * space complixity :O(1)
  
* keys()
    * Returns: Collection of keys
    * Time complixity :O(n)
    * space complixity :O(n)
  
* hash()
  * Returns Index in the collection for specific key
  * Time complixity : O(1)
  * space complixity :O(1)

## API
<!-- Description of each method publicly available in each of your hashtable -->
   * set
      * This method should hash the key, and set the key and value pair in the table, handling collisions as needed.
      * Should a given key already exist, replace its value from the value argument given to this method.
     
   * get
      * Returns: Value associated with that key in the table

   * contains
      * Returns: Boolean, indicating if the key exists in the table already.

   * keys
        * Returns: Collection of keys

   * hash
         * Returns: Index in the collection for that key

 [Link to code ](app/src/main/java/code30/HashTable.java)