package DataStructure.LinkedList_Double;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class PrintLinkListInReverse {
    Node root;

    private void addNode(int data) {        // add new node at starting
        Node tmp = new Node(data);
        if (root==null) {
            root = tmp;
        } else {
            tmp.next = root;
            root = tmp;
        }
    }

    private void printLinkList() {      // print linkList
        Node tmp = root;
        while (tmp!=null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    private void printListInReverse(Node root) {    // print linkList in reverse
        if(root==null) {
            return;
        }
        printListInReverse(root.next);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        PrintLinkListInReverse ob = new PrintLinkListInReverse();
        ob.addNode(10);
        ob.addNode(20);
        ob.addNode(30);

        ob.printLinkList();
        ob.printListInReverse(ob.root);
        System.out.println();
        ob.printLinkList();
    }
}
