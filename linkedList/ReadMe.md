# Singly Linked List
<!-- Short summary or background information -->
a linked-list is an approach to save some nodes, the node has a value and pointer to the next element, it has a head pointer to point to the first node, next pointer to point to the next node
this approach is better than array because can add nodes any time ( can change the size if add or delete ) without declare new linked-list as in array

## Challenge

* in this challenge an implementation of a linked-list is required 

* implementing a Node class: declared a Node & and a value of this node 

* implementation of linked-list class including Head

* linked-list class contains 3 methods:

    * insert: add node to the head 

    * includes: takes a value as parameter & return true if the value axist in linked-list and false if not

    * toString: returns all values exist in the linked-list as string, if the values are : A, B,C it will return "{ a } -> { b } -> { c } -> NULL"

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
* insert:

    * the approach is add-to-the head , make the head point to new value
    * why? this is the direct and easy way to do that
    *  Big O space: O(1)
    * Big O time: O(1)

* includes: 

    * the approach is loop through linked-list and search about the value, return true if exist and false if not
    * why? it is an easy way and direct
    *  Big O space: O(1)
    * Big O time: O(n)

* to string:

    * the approach is declare String str then loop through linked-list and concatinate the value of node with str for all nodes 
    * why? it is an easy way and direct
    *  Big O space: O(1)
    * Big O time: O(n)


## API
<!-- Description of each method publicly available to your Linked List -->
*  insert:
     * if you want to add value to the linked list call the methode insert and pass the value through parameter
     * example : insert ("X);

* includes:
    * to search about value in the linked list call the methode includes and pass the value through parameter
    * example : includes("A)
    * if there is a node it's value ="A" it will return true , else will return false

* to string:
    * when call toString(), it will print to you all nodes as string 
    * example: "{ a } -> { b } -> { c } -> NULL"