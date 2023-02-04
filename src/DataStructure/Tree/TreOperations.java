package DataStructure.Tree;
import java.util.*;
import java.util.stream.StreamSupport;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class TreeOperations {

    Node root;

    void printInOrder(Node root) {      // root not modify since not reassignment, only passing
        if(root==null) {
            return;
        }
        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }

    void preOrder(Node root) {          // root not modify since not reassignment, only passing
        if(root==null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void postOrder(Node root) {         // root not modify since not reassignment, only passing
        if(root==null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        TreeOperations ob = new TreeOperations();
        ob.root = new Node(1);
        ob.root.left = new Node(2);
        ob.root.right = new Node(3);
        ob.root.left.left = new Node(4);
        ob.root.left.right = new Node(5);

        System.out.println("Inorder:");
        ob.printInOrder(ob.root);

        System.out.println("\n");
        System.out.println("Preorder:");
        ob.preOrder(ob.root);

        System.out.println("\n");
        System.out.println("Postorder:");
        ob.postOrder(ob.root);
    }
}