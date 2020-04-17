import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class myBinarySearchTreeTester {
    @Test
    void mBST0(){  //This test case helps identify if my insert method works and if a tree is actually being formed.
        int[] a = {4, 2, 5}; //These two arrays are equal to see if they both form identical trees.
        int[] b = {4, 2, 5};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(a);
        myBinarySearchTreeNode ex = new myBinarySearchTreeNode(b);

        assertEquals(ex.myValue , tree.myValue); //As expected the roots are equal
        assertEquals(ex.left.myValue , tree.left.myValue); //As expected the right sides are equal
        assertEquals(ex.right.myValue , tree.right.myValue); //As expected the left sides are equal

    }
    @Test
    void mBST1(){ // I used this test case to see if branches are made correctly and what data is stored on each tree.
        int[] a = {7, 2, 9}; //This time i uses slightly different arrays.
        int[] b = {7, 2, 2};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(a);
        myBinarySearchTreeNode ex = new myBinarySearchTreeNode(b);

        assertEquals(ex.myValue , tree.myValue); //As expected roots are equal
        assertEquals(ex.left.myValue , tree.left.myValue); //As expected the left sides are equal.
        assertEquals(ex.right.myValue , tree.right.myValue);// This assertequals gave me an error because both are different hence not the same right side.

    }
    @Test
    void mBST2(){
        int[] a = {2, 4, 1}; //This test case is used to see if my size method works correctly.
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(a);
        int b = 3; // Since there are 3 numbers in the array it should produce a tree of size three.
        assertEquals(b , tree.size()); // As expected the size is correct.
    }
    @Test
    void mBST3(){
        int[] a = {7, 2, 9, 1, 5 ,-2 , -3};  //This time i tested size again but incorporated negative numbers and is a much larger array.
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(a);
        int b = 7;
        assertEquals(b , tree.size()); //As expected the size was 7 , so the size method worked perfectly.

    }
    @Test
    void mBST4(){
        int[] a = {5, 2, 7}; //This method is supposed to test the height from the lowest branch of tree.
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(a);
        int b = 1; //Since the tree has 2 levels then the height should only be 1
        assertEquals(b , tree.height());

    }

    @Test
    void mBST5(){
        int[] a = {7, 2, 9 ,4 , 5 ,1 ,3 , 8 , 10 , 11}; //Since this tree has 4 levels the expected height should be 3.
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(a); //This case is important to see if numbers go correctly on each branch and height is taken of true lowest point.
        int b = 3;
        assertEquals(b , tree.height()); //As expected although right side has hight of 2 , since left side has height of 3. That is true height.
                                        // Hence test case was a success.
    }

    @Test
    void mBST6(){
        int[] a = {7, 2, 9, 1, 5 ,-2 , -3}; // The depth in this method determines the distance between a node and the root of the tree.
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(a);
        int b = 1; // I chose this node in order to see if my depth method actually works. The depth should be 1 since my node of interest is 9.
        tree.print();
        assertEquals(b , tree.depth(9)); // As expected the depth was correct.

    }
    @Test
    void mBST7(){
        int[] a = {7, 2, 9, 1, 5 ,-2 , -3}; //This test case requires my depth method to go trough multiple levels to find node.
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(a);
        int b = 3; //since node of interest is -2 then my depth should be 3.
        tree.print();
        assertEquals(b , tree.depth(-2)); //As expected the depth was correct.

    }
}
