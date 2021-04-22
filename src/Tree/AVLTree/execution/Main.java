/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 22/04/21
 *   Time: 6:38 PM
 *   File: Main.java
 */

package Tree.AVLTree.execution;

import Tree.AVLTree.implementation.AVLTree;

public class Main {
    public static void main(String[] args) {
        AVLTree<Integer> avlTree = new AVLTree<>();
        avlTree.setRoot(avlTree.insert(15, avlTree.getRoot()));
        avlTree.setRoot(avlTree.insert(20, avlTree.getRoot()));
        avlTree.setRoot(avlTree.insert(11, avlTree.getRoot()));
        avlTree.setRoot(avlTree.insert(5, avlTree.getRoot()));
        avlTree.setRoot(avlTree.insert(50, avlTree.getRoot()));
        avlTree.setRoot(avlTree.insert(4, avlTree.getRoot()));
        avlTree.setRoot(avlTree.insert(13, avlTree.getRoot()));
        avlTree.setRoot(avlTree.insert(12, avlTree.getRoot()));
        avlTree.inOrderTraversal(avlTree.getRoot());
    }
}
