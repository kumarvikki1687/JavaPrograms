package Problems;
import java.util.*;

class QueueObj {
    TreeNode first;
    int level;

    QueueObj(TreeNode first, int level) {
        this.first = first;
        this.level = level;
    }
}

class TopView_BT {

    TreeNode root;
    TreeMap<Integer,TreeNode> treeMap = new TreeMap<>();


    private void getTopView(TreeNode root) {
        Queue<QueueObj> que = new LinkedList<>();
        que.add(new QueueObj(root, 0));
        while(!que.isEmpty()) {
            QueueObj curr = que.poll();
            TreeNode node = curr.first;
            int hd = curr.level;
            if(treeMap.get(hd)==null) {
                treeMap.put(hd, node);
            }
            if(node.left!=null) {
                que.add(new QueueObj(node.left, hd-1));
            }
            if(node.right!=null) {
                que.add(new QueueObj(node.right, hd+1));
            }
        }
    }

    void displayTopView() {
        for(Map.Entry<Integer, TreeNode> it: treeMap.entrySet()) {
            System.out.print(it.getValue().data + " ");
        }
    }

    public static void main(String[] args) {

        TopView_BT ob = new TopView_BT();

        ob.root = new TreeNode(1);
        ob.root.left = new TreeNode(2);
        ob.root.right = new TreeNode(3);
        ob.root.left.right = new TreeNode(4);
        ob.root.left.right.right = new TreeNode(5);
        ob.root.left.right.right.right = new TreeNode(6);

        ob.getTopView(ob.root);
        ob.displayTopView();

    }
}