import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryTreeLeftView {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Node root = createTree();
        List<Integer> list = new ArrayList<>();
        while (root != null) {
            list.add(root.data);
            if (root.left != null)
                root = root.left;
            else if (root.right != null)
                root = root.right;
            else
                root = null;
        }
        System.out.println(list);
    }

    static Node createTree() {
        Node root = null;

        System.out.println("Enter data: ");
        int data = sc.nextInt();

        if (data == -1)
            return root;

        root = new Node(data);
        System.out.println("Left subtree data for " + data + ": ");
        root.left = createTree();

        System.out.println("Right subtree data for " + data + ": ");
        root.right = createTree();

        return root;
    }
}
