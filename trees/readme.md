# Trees
<!-- Short summary or background information -->

* tree : id a data structure 
* it has common concepts (terminologies) :
  * Root 
  * Parent node
  * child node 
  * leaf node
  * sub tree
  * siblings
  * level (number of edges)
  
* tree has the following traversals : 
  * Depth First: There are multiple ways to carry out depth first traversal, and each method changes the order in which we search/print the root
  * Breadth First: iterates through the tree by going through each level of the tree node-by-node.

* we have a binary tree 
* and also binary search tree :
  * is a type of tree that does have some structure attached to it.
  * In a BST, nodes are organized in a manner where all values that are smaller than the root are placed to the left, and all values that are larger than the root are placed to the right.

* (Links to an external site.)Searching a BST
  * Searching a BST can be done quickly because all you do is compare the node you are searching for against the root of the tree or sub-tree
  * If the value is smaller, you only traverse the left side. If the value is larger, you only traverse the right side.


## Challenge
<!-- Description of the challenge -->
* Create a Binary Tree class:
  * Define a method for each of the depth first traversals:
    * pre order
    * in order
    * post order which returns an array of the values, ordered appropriately.
* Create a Binary Search Tree class contains : 
  * Add method accepts value and add it to the tree in correct place
  * Contains method accepts value and return true if it exist in tree and false if not exist 


## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
* Binary tree 
* pre order method: it arrange and returns tree as ( Root - Lift - Right)
  * space :O(n) , time O(n)
* in order method: it arrange and returns tree as (Lift - Root - Right)
  * space :O(n) , time O(n)
* post order method: it arrange and returns tree as (Lift - Right -  Root)
  * space :O(n) , time O(n)

Binary Search tree 
* Add : add a value that recived into it's place 
  * space :O(1) , time O(n)
* contains: search about value that recived in a tree if exist returns true else false 
  * space :O(1) , time O(n)

## API
<!-- Description of each method publicly available in each of your trees -->
* pre order method: it arrange and returns tree as ( Root - Lift - Right)
    
* in order method: it arrange and returns tree as (Lift - Root - Right)
    
* post order method: it arrange and returns tree as (Lift - Right -  Root)
    

Binary Search tree
* Add : add a value that recived into it's place
   ex : add (20);
* contains: search about value that recived in a tree if exist returns true else false
  * ex : contains (30)
    
link to code : [Link to BinaryTree](./app/src/main/java/trees/BinaryTree.java)

[Link to BinarySearchTree](./app/src/main/java/trees/BinarySearchTree.java)
    