package LinkList_Single;

public class ReverseLinkList {
    Node root;

    private void addNode(int data) {       // add new node at starting
        Node tmp = new Node(data);
        if(root==null) {
            root = tmp;
        } else {
            tmp.next = root;
            root = tmp;
        }
    }

    private void reverseListList() {       // reverse listList
        Node curr = root;
        Node prev = null;
        Node next = null;

        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        root = prev;
    }

    private void printListList() {      // print listList
        Node tmp = root;
        while(tmp!=null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkList ob = new ReverseLinkList();
        ob.addNode(10);
        ob.addNode(20);
        ob.addNode(30);

        ob.printListList();
        ob.reverseListList();
        ob.printListList();
    }
}
