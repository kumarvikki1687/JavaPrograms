package LinkList_Single;

public class ReverseLinkListSizeK {
    Node root;
    int size = 3;

    private void addNode(int data) {        // add new node at starting
        Node tmp = new Node(data);
        if(root==null) {
            root = tmp;
        } else {
            tmp.next = root;
            root = tmp;
        }
    }

    private void printLinkList() {          // print listList
        Node tmp = root;
        while(tmp!=null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    private Node reverseInSizeK(Node root) {    // reverse listList in size K
        Node curr = root;
        Node prev = null;
        Node next = null;

        int count = 0;
        while (curr!=null && count<size) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if (curr!=null) {
            root.next = reverseInSizeK(curr);
        }
        return prev;
    }

    public static void main(String[] args) {
        ReverseLinkListSizeK ob = new ReverseLinkListSizeK();
        ob.addNode(1);
        ob.addNode(2);
        ob.addNode(3);
        ob.addNode(4);
        ob.addNode(5);
        ob.addNode(6);
        ob.addNode(7);
        ob.addNode(8);
        ob.addNode(9);
        ob.addNode(10);

        ob.printLinkList();
        ob.root = ob.reverseInSizeK(ob.root);
        ob.printLinkList();
    }
}
