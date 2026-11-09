public class BalancedBST2 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        /*
            GIVEN BST
                            8
                         /     \
                        6       10
                      /           \
                     5            11
                    /              \
                   3               12
    */

    }
}
