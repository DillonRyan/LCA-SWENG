import java.util.ArrayList;
import java.util.List;

public class LCA {
    // A Binary Tree node
    public static class Node { //creating the BST
        int data;
        Node left, right;

        Node(int value) {	//initializing
            data = value;
            left = right = null;
        }
    }

    public static class BT_NoParentPtr_Solution1 {

        Node root;
        private List<Integer> path1 = new ArrayList<>();
        private List<Integer> path2 = new ArrayList<>();

        int findLCA(int n1, int n2) {
            path1.clear();
            path2.clear();
            return findLCAInternal(root, n1, n2);
        }

        private int findLCAInternal(Node root, int n1, int n2) {

            if (!findPath(root, n1, path1) || !findPath(root, n2, path2)) {
                return -1;
            }

            int i;
            for (i = 0; i < path1.size() && i < path2.size(); i++) {
                if (!path1.get(i).equals(path2.get(i)))
                    break;
            }

            return path1.get(i - 1);
        }

        private boolean findPath(Node root, int n, List<Integer> path) {
            path.add(root.data);

            if (root.data == n) {
                return true;
            }
            if (root.left != null && findPath(root.left, n, path)) {
                return true;
            }
            if (root.right != null && findPath(root.right, n, path)) {
                return true;
            }
            path.remove(path.size() - 1);
            return false;
        }
    }
}
