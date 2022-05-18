/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package TreeIntersection;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        TreeIntersection treeIntersection=new TreeIntersection();

       ////////////// tree  1 ////////////////////
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
        System.out.println( "intersection   "+treeIntersection.IntersectionTwoTrees(binaryTree1, binaryTree2));
        System.out.println("\n**********************************");

    }

}
