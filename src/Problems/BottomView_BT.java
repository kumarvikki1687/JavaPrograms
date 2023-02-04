package Problems;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class BottomView_BT {

    TreeNode root;
    TreeMap<Integer,TreeNode> treeMap = new TreeMap<>();

    private void getBottomView(TreeNode root) {
        Queue<QueueObj> que = new LinkedList<>();
        que.add(new QueueObj(root, 0));
        while(!que.isEmpty()) {
            QueueObj curr = que.poll();
            TreeNode node = curr.first;
            int hd = curr.level;
            treeMap.put(hd, node);
            if(node.left!=null) {
                que.add(new QueueObj(node.left, hd-1));
            }
            if(node.right!=null) {
                que.add(new QueueObj(node.right, hd+1));
            }
        }
    }

    void displayBottomView() {
        for(Map.Entry<Integer, TreeNode> it: treeMap.entrySet()) {
            System.out.print(it.getValue().data + " ");
        }
    }

    public static void main(String[] args) {

        BottomView_BT ob = new BottomView_BT();

        ob.root = new TreeNode(20);
        ob.root.left = new TreeNode(8);
        ob.root.right = new TreeNode(22);
        ob.root.left.left = new TreeNode(5);
        ob.root.left.right = new TreeNode(3);
        ob.root.right.left = new TreeNode(4);
        ob.root.right.right = new TreeNode(25);
        ob.root.left.right.left = new TreeNode(10);
        ob.root.left.right.right = new TreeNode(14);

        ob.getBottomView(ob.root);
        ob.displayBottomView();
    }
}
