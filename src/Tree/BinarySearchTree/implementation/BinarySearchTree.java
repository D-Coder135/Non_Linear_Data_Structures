/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 17/04/21
 *   Time: 7:25 PM
 *   File: BinarySearchTree.java
 */

package Tree.BinarySearchTree.implementation;

public class BinarySearchTree<E extends Comparable<E>> {
    private Node<E> root;

    public Node<E> getRoot() {
        return root;
    }

    public void insert(E element) {
        Node<E> node = new Node<>(element);
        if (isEmpty()) {
            root = node;
        } else {
            Node<E> temp = root;
            Node<E> parent = null;
            while (temp != null) {
                parent = temp;
                if (element.compareTo(temp.getData()) <= 0) {
                    temp = temp.getLeft();
                }
            }
        }
    }

    private boolean isEmpty() {
        return root == null;
    }
}
