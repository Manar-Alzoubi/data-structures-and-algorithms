/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package TreeIntersection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    //////////////////// test if 2 trees have many common nodes //////////////////
    @Test void test1() {
        TreeIntersection treeIntersection=new TreeIntersection();
        BinaryTree<Integer> binaryTree1=new BinaryTree<Integer>();
        binaryTree1.root = new Node(150);

        binaryTree1.root.left = new Node(100);
        binaryTree1.root.right = new Node(250);

        binaryTree1.root.left.left = new Node(75);
        binaryTree1.root.left.right = new Node(160);
        binaryTree1.root.right.left = new Node(200);
        binaryTree1.root.right.right = new Node(350);

        binaryTree1.root.left.right.left = new Node(125);
        binaryTree1.root.left.right.right = new Node(175);
        binaryTree1.root.right.right.left = new Node(300);
        binaryTree1.root.right.right.right = new Node(500);

        /////////////////  tree 2 //////////////////////
        BinaryTree<Integer> binaryTree2 =new BinaryTree<Integer>();
        binaryTree2.root = new Node(42);
        binaryTree2.root.left = new Node(100);
        binaryTree2.root.right = new Node(600);

        binaryTree2.root.left.left = new Node(15);
        binaryTree2.root.left.right = new Node(160);
        binaryTree2.root.right.left = new Node(200);
        binaryTree2.root.right.right = new Node(350);

        binaryTree2.root.left.right.left = new Node(125);
        binaryTree2.root.left.right.right = new Node(175);
        binaryTree2.root.right.right.left = new Node(4);
        binaryTree2.root.right.right.right = new Node(500);


        binaryTree2.InOrder(binaryTree1.getRoot());

        binaryTree1.preOrder(binaryTree2.getRoot());

        ArrayList<Integer> arr =new ArrayList<>();
        ArrayList<Integer> newArray = treeIntersection.IntersectionTwoTrees(binaryTree1, binaryTree2);
        arr.add(100);
        arr.add(160);
        arr.add(200);
        arr.add(500);
        arr.add(125);
        arr.add(350);
        arr.add(175);
        assertEquals(newArray, arr);
    }
 //////////////// 2 trees has one node in intersection /////////////
    @Test void test2() {
        TreeIntersection treeIntersection=new TreeIntersection();
        BinaryTree<Integer> binaryTree1=new BinaryTree<Integer>();
        binaryTree1.root = new Node(4);
        binaryTree1.root.left = new Node(25);
        binaryTree1.root.right = new Node(2);
        binaryTree1.root.left.left = new Node(7);
        binaryTree1.root.left.right = new Node(16);
        BinaryTree<Integer> binaryTree2 =new BinaryTree<Integer>();
        binaryTree2.root = new Node(42);
        binaryTree2.root.left = new Node(3);
        binaryTree2.root.right = new Node(2);
        binaryTree2.root.left.left = new Node(15);
        binaryTree2.root.left.right = new Node(26);

        binaryTree2.InOrder(binaryTree1.getRoot());

        binaryTree1.preOrder(binaryTree2.getRoot());

        ArrayList<Integer> arr =new ArrayList<>();
        ArrayList<Integer> newArray = treeIntersection.IntersectionTwoTrees(binaryTree1, binaryTree2);
        arr.add(2);

        assertEquals(newArray, arr);
    }
    ////////// test if there is no common nodes in trees intersection is empty ////////////
    @Test void test3() {
        TreeIntersection treeIntersection=new TreeIntersection();
        BinaryTree<Integer> binaryTree1=new BinaryTree<Integer>();
        binaryTree1.root = new Node(4);
        binaryTree1.root.left = new Node(25);
        binaryTree1.root.right = new Node(2);

        BinaryTree<Integer> binaryTree2 =new BinaryTree<Integer>();
        binaryTree2.root = new Node(42);
        binaryTree2.root.left = new Node(3);
        binaryTree2.root.right = new Node(5);

        binaryTree2.InOrder(binaryTree1.getRoot());
        binaryTree1.preOrder(binaryTree2.getRoot());
        ArrayList<Integer> arr =new ArrayList<>();
        ArrayList<Integer> newArray = treeIntersection.IntersectionTwoTrees(binaryTree1, binaryTree2);
        assertEquals(newArray, arr);
    }
    ////////// test if all nodes of tree1 the same as all nodes of tree2 ////////////
    @Test void test4() {
        TreeIntersection treeIntersection=new TreeIntersection();
        BinaryTree<Integer> binaryTree1=new BinaryTree<Integer>();
        binaryTree1.root = new Node(10);
        binaryTree1.root.left = new Node(3);
        binaryTree1.root.right = new Node(2);

        BinaryTree<Integer> binaryTree2 =new BinaryTree<Integer>();
        binaryTree2.root = new Node(2);
        binaryTree2.root.left = new Node(3);
        binaryTree2.root.right = new Node(10);

        binaryTree2.InOrder(binaryTree1.getRoot());
        binaryTree1.preOrder(binaryTree2.getRoot());
        ArrayList<Integer> arr =new ArrayList<>();
        ArrayList<Integer> newArray = treeIntersection.IntersectionTwoTrees(binaryTree1, binaryTree2);
        arr.add(10);
        arr.add(2);
        arr.add(3);
        assertEquals(newArray, arr);
    }
    ////////// test if two trees are empty ////////////
    @Test void test5() {
        TreeIntersection treeIntersection=new TreeIntersection();
        BinaryTree<Integer> binaryTree1=new BinaryTree<Integer>();
        BinaryTree<Integer> binaryTree2 =new BinaryTree<Integer>();
        binaryTree2.InOrder(binaryTree1.getRoot());
        binaryTree1.preOrder(binaryTree2.getRoot());
        ArrayList<Integer> arr =new ArrayList<>();
        ArrayList<Integer> newArray = treeIntersection.IntersectionTwoTrees(binaryTree1, binaryTree2);
        assertEquals(newArray, arr);
    }
}
