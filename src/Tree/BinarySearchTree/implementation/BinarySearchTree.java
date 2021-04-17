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
        }
    }

    private boolean isEmpty() {
        if (root == null) {
            return true;
        }
        return false;
    }
}
