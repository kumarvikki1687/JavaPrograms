package Problems;

class RightView_BT {

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
        printLeftView(root.right, level+1);
        printLeftView(root.left, level+1);
    }

    public static void main(String[] args) {

        RightView_BT ob = new RightView_BT();

        ob.root = new TreeNode(1);
        ob.root.left = new TreeNode(2);
        ob.root.right = new TreeNode(3);
        ob.root.left.left = new TreeNode(4);
        ob.root.left.right = new TreeNode(5);
        ob.root.right.left = new TreeNode(6);
        ob.root.right.right = new TreeNode(7);
        ob.root.right.left.right = new TreeNode(8);

        ob.printLeftView(ob.root, 0);

    }
}