/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
///////////////// code for lab 19 ////////////
        BinarySearchTree<Integer> binSearchT = new BinarySearchTree();
        binSearchT.add(50);
        binSearchT.add(30);
        binSearchT.add(11);
        binSearchT.add(20);
        binSearchT.add(21);
        binSearchT.add(5);

        System.out.println("\n Sum of odd numbers in binary search tree = "+ binSearchT.sumOfOdds( binSearchT.getRoot()));
//        System.out.println(binSearchT.sumOfOdds( binSearchT.getRoot()));





//        System.out.println(new App().getGreeting());
//        System.out.println("///////// code 17 /////// \n");
//        BinaryTree <Integer> biTree = new BinaryTree<>();
//        ///////lab 18 /////
//        biTree.setRoot(new Node<>(3));
//
//        biTree.getRoot().setLeft(new Node<>(7));
//        biTree.getRoot().setRight( new Node<>(5));
//
//        biTree.getRoot().getLeft().setLeft(new Node<>(15));
//        biTree.getRoot().getLeft().setRight(new Node<>(25));
//        biTree.getRoot().getRight().setRight(new Node<>(9));
//
//        biTree.getRoot().getLeft().getRight().setLeft(new Node<>(13));
//        biTree.getRoot().getLeft().getRight().setRight(new Node<>(30));
//        biTree.getRoot().getRight().getRight().setLeft(new Node<>(2));
//
//        System.out.println(" origin tree-->   "+ biTree.preOrder(biTree.getRoot()));
//        System.out.println("fizzBuzz tree -- > "+biTree.fizzBuzzTree(biTree));

//        biTree.setRoot(new Node<>(2));
//
//        biTree.getRoot().setLeft(new Node<>(7));
//        biTree.getRoot().setRight( new Node<>(5));
//
//        biTree.getRoot().getLeft().setLeft(new Node<>(2));
//        biTree.getRoot().getLeft().setRight(new Node<>(6));
//        biTree.getRoot().getRight().setRight(new Node<>(9));

//        biTree.getRoot().getLeft().getRight().setLeft(new Node<>(5));
//        biTree.getRoot().getLeft().getRight().setRight(new Node<>(11));
//        biTree.getRoot().getRight().getRight().setLeft(new Node<>(4));

//        System.out.println( biTree.breadthFirst(biTree.getRoot()));



//        System.out.println("max value of first tree -> "+ biTree.maximumValue());



//        System.out.println("//////////// here is binary tree /////////////");
//        BinaryTree <Integer> biTree1 = new BinaryTree<>();
//
//        biTree1.setRoot(new Node<>(15));
//
//        biTree1.getRoot().setLeft(new Node<>(30));
//        biTree1.getRoot().setRight( new Node<>(25));
//
//        biTree1.getRoot().getLeft().setLeft(new Node<>(35));
//        biTree1.getRoot().getLeft().setRight(new Node<>(40));
//        biTree1.getRoot().getRight().setLeft(new Node<>(45));
//        biTree1.getRoot().getRight().setRight(new Node<>(50));
//        System.out.println("max value of second tree -> "+ biTree1.maximumValue());
//        System.out.println(biTree);
//        System.out.println("\n pre order ==>  "+biTree.preOrder(biTree.getRoot()));
//        System.out.println("\n in order ==>  "+biTree.inOrder(biTree.getRoot()));
//        System.out.println("\n post order ==>  "+biTree.postOrder(biTree.getRoot()));
//
//        System.out.println("\n//////////// here is binary search tree /////////////\n");
//        BinarySearchTree<Integer> binSearchT = new BinarySearchTree();
//        binSearchT.add(50);
//        binSearchT.add(30);
//        binSearchT.add(40);
//        binSearchT.add(20);
//        binSearchT.add(60);
//        System.out.println(binSearchT);
//
//        System.out.println("\nis tree contains 40 ? "+ binSearchT.contains(40));
//        System.out.println("is tree contains 50 ? "+ binSearchT.contains(50));
//        System.out.println("is tree contains 20 ? "+ binSearchT.contains(20));
//        System.out.println("is tree contains 10 ? "+ binSearchT.contains(10));
//        System.out.println("is tree contains 4  ? "+ binSearchT.contains(4));
//        System.out.println("is tree contains 85 ? "+ binSearchT.contains(85));

        }

    }

