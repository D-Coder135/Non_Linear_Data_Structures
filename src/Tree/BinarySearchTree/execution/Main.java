/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 18/04/21
 *   Time: 1:42 PM
 *   File: Main.java
 */

package Tree.BinarySearchTree.execution;

import Tree.BinarySearchTree.implementation.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert(75);
        binarySearchTree.insert(23);
        binarySearchTree.insert(55);
        binarySearchTree.insert(50);
        binarySearchTree.insert(42);
    }
}
