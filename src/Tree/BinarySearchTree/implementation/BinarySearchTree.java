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
        } else { // Traverse and reach to that node where the new node will be added and also keep the reference of the
            // parent node.
            Node<E> temp = root;
            Node<E> parent = null;
            while (temp != null) {
                parent = temp;
                if (element.compareTo(temp.getData()) <= 0) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
            // Now, check weather the value of the element is less or greater than the value of the parent node.
            // As per that, add the new node to the left or right respectively.
            if (element.compareTo(parent.getData()) <= 0) {
                parent.setLeft(node);
            } else {
                parent.setRight(node);
            }
        }
    }

    private boolean isEmpty() {
        return root == null;
    }

    public void inOrderTraversal(Node<E> node) {
        if (node != null) {
            inOrderTraversal(node.getLeft()); // process the left subtree
            System.out.println(node.getData() + ", "); // printA the node data
            inOrderTraversal(node.getRight()); // then process the right subtree
        }
    }

    public boolean searchElement(E element) {
        boolean response = false;
        Node<E> temp = root;
        while (temp != null) {
            if (element.compareTo(temp.getData()) == 0) {
                response = true;
                break;
            } else if (element.compareTo(temp.getData()) < 0) {
                temp = temp.getLeft();
            } else {
                temp = temp.getRight();
            }
        }
        return response;
    }

    public void delete(E deletingElement) {
        Node<E> temp = root;
        Node<E> parent = null;
        while (temp != null) {
            if (deletingElement.compareTo(temp.getData()) == 0) {
                break;
            } else {
                parent = temp;
                if (deletingElement.compareTo(temp.getData()) < 0) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
        }
        if (temp != null) {
            if (isLeafNode(temp)) {
                if (parent == null) {
                    root = null;
                } else {
                    if (deletingElement.compareTo(parent.getData()) < 0) {
                        parent.setLeft(null);
                    } else {
                        parent.setRight(null);
                    }
                }
            } else if (hasLeftSubTree(temp)) {
                if (parent == null) {
                    root = root.getLeft();
                } else {
                    if (deletingElement.compareTo(parent.getData()) < 0) {
                        parent.setLeft(temp.getLeft());
                    } else {
                        parent.setRight(temp.getLeft());
                    }
                }
            } else if (hasRightSubTree(temp)) {
                if (parent == null) {
                    root = root.getRight();
                } else {
                    if (deletingElement.compareTo(parent.getData()) < 0) {
                        parent.setLeft(temp.getRight());
                    } else {
                        parent.setRight(temp.getRight());
                    }
                }
            } else {
                Node<E> successor = getSuccessor(temp);
                delete(successor.getData());
                successor.setLeft(temp.getLeft());
                successor.setRight(temp.getRight());
                if (parent == null) {
                    root = successor;
                } else {
                    if (deletingElement.compareTo(parent.getData()) < 0) {
                        parent.setLeft(successor);
                    } else {
                        parent.setRight(successor);
                    }
                }
            }
        } else {
            System.err.println("Cannot delete the element!");
        }
    }
}
