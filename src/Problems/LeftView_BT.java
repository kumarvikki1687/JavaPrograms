package Problems;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class LeftView_BT {

    TreeNode root;
    int maxi=-1;

    private void printLeftView(TreeNode root, int level) {
        if(root==null) {
            return;
        }
        if(level>maxi) {
            System.out.print(root.data + " ");
            maxi = level;
        }
        printLeftView(root.left, level+1);
        printLeftView(root.right, level+1);
    }

    public static void main(String[] args) {

        LeftView_BT ob = new LeftView_BT();

        ob.root = new TreeNode(10);
        ob.root.left = new TreeNode(2);
        ob.root.right = new TreeNode(3);
        ob.root.left.left = new TreeNode(7);
        ob.root.left.right = new TreeNode(8);
        ob.root.right.right = new TreeNode(15);
        ob.root.right.left = new TreeNode(12);
        ob.root.right.right.left = new TreeNode(14);

        ob.printLeftView(ob.root, 0);

    }
}
