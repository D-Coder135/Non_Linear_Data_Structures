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

    public int maxHeight(int leftSubtree, int rightSubtree) {
        return leftSubtree > 0 ? leftSubtree : rightSubtree;
    }

    public Node<E> insert(E data, Node<E> tempRoot) {
        if (tempRoot == null) {
            tempRoot = new Node<>(data);
        } else if (data.compareTo(tempRoot.getData()) < 0) {
            tempRoot.setLeft(insert(data, tempRoot.getLeft()));
            if (calculateHeight(tempRoot.getLeft()) - calculateHeight(tempRoot.getRight()) == 2) {
                if (data.compareTo(tempRoot.getLeft().getData()) < 0) {
                    tempRoot = rightRightRotation(tempRoot);
                } else {
                    tempRoot = doubleRotationWithLeftChild(tempRoot);
                }
            }
        } else {
            tempRoot.setRight(insert(data, tempRoot.getRight()));
            if (calculateHeight(tempRoot.getRight()) - calculateHeight(tempRoot.getLeft()) == 2) {
                if (data.compareTo(tempRoot.getRight().getData()) < 0) {
                    tempRoot = leftLeftRotation(tempRoot);
                } else {
                    tempRoot = doubleRotationWithRightChild(tempRoot);
                }
            }
        }
        tempRoot.setHeight(maxHeight(calculateHeight(tempRoot.getLeft()), calculateHeight(tempRoot.getRight())) + 1);
        return tempRoot;
    }

    private Node<E> doubleRotationWithRightChild(Node<E> currentDisabledNode) {
        currentDisabledNode.setRight(rightRightRotation(currentDisabledNode.getRight()));
        return leftLeftRotation(currentDisabledNode);
    }

    private Node<E> leftLeftRotation(Node<E> currentDisabledNode) {
        Node<E> newRoot = currentDisabledNode.getRight();
        currentDisabledNode.setRight(newRoot.getLeft());
        newRoot.setLeft(currentDisabledNode);
        currentDisabledNode.setHeight(maxHeight(calculateHeight(currentDisabledNode.getLeft()), calculateHeight(currentDisabledNode.getRight())) + 1);
        newRoot.setHeight(maxHeight(calculateHeight(newRoot.getLeft()), currentDisabledNode.getHeight()) + 1);
        return newRoot;
    }

    private Node<E> doubleRotationWithLeftChild(Node<E> currentDisabledNode) {
        currentDisabledNode.setLeft(leftLeftRotation(currentDisabledNode.getLeft()));
        return rightRightRotation(currentDisabledNode);
    }

    private Node<E> rightRightRotation(Node<E> currentDisabledNode) {
        Node<E> newRoot = currentDisabledNode.getLeft();
        currentDisabledNode.setLeft(newRoot.getRight());
        newRoot.setRight(currentDisabledNode);
        currentDisabledNode.setHeight(maxHeight(calculateHeight(currentDisabledNode.getLeft()), calculateHeight(currentDisabledNode.getRight())) + 1);
        newRoot.setHeight(maxHeight(calculateHeight(newRoot.getLeft()), currentDisabledNode.getHeight()) + 1);
        return newRoot;
    }

    private int calculateHeight(Node<E> node) {
        return node == null ? -1 : node.getHeight();
    }

    public void inOrderTraversal(Node<E> tempRoot) {
        if (tempRoot != null) {

        }
    }
}
