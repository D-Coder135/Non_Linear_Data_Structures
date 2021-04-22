/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 22/04/21
 *   Time: 9:52 AM
 *   File: Node.java
 */

package Tree.AVLTree.implementation;

public class Node<E> {
    private int data;
    private int height;
    private Node<E> left;
    private Node<E> right;

    public Node(int data) {
        this.data = data;
        height = 0;
        left = null;
        right = null;
    }
}
