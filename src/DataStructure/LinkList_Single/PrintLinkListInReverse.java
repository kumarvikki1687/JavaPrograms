package DataStructure.LinkList_Single;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class PrintLinkListInReverse {
    Node root;
    private void addNode(int data) {    // add node at starting
        Node tmp = new Node(data);
        if (root==null) {
            root = tmp;
        } else {
            tmp.next = root;
            root = tmp;
        }
    }

    private void printLinkList() {      // print listList
        Node tmp = root;
        while(tmp!=null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    private void printLinkListInReverse(Node root) {        // print listList in reverse
        if(root==null) {
            return;
        }
        printLinkListInReverse(root.next);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        PrintLinkListInReverse ob = new PrintLinkListInReverse();
        ob.addNode(10);
        ob.addNode(20);
        ob.addNode(30);

        ob.printLinkList();
        ob.printLinkListInReverse(ob.root);
        System.out.println();
        ob.printLinkList();
    }
}