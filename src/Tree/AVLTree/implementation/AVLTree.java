/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 22/04/21
 *   Time: 10:00 AM
 *   File: AVLTree.java
 */

package Tree.AVLTree.implementation;

public class AVLTree<E extends Comparable<E>> {
    private Node<E> root;

    public Node<E> getRoot() {
        return root;
    }

    public E maxHeight(E leftSubtree, E rightSubtree) {
        return leftSubtree.compareTo(rightSubtree) >= 0 ? leftSubtree : rightSubtree;
    }

    public Node<E> insert(E data, Node<E> tempRoot) {
        if (tempRoot == null) {
            tempRoot = new Node<>(data);
        } else if (data.compareTo(tempRoot.getData()) <= 0) {
        }
    }
}
