package Array;

import org.junit.Test;

import java.sql.SQLOutput;

public class StackTest {
    @Test
    public void testLargest(){
        Stack s = new Stack(5);
        Element e = new Element(1);
        Element e1 = new Element(2);
        Element e2 = new Element(3);
        Element e3 = new Element(4);
        Element e4 = new Element(5);
        s.push(e);
        s.push(e1);
        s.push(e2);
        s.push(e3);
        s.push(e4);
        System.out.println(s.largest());
    }
    @Test
    public void testIsBalanced() {
        Stack stack = new Stack(100); // Initialize with sufficient size

        String balancedSequence = "((()))";
        String unbalancedSequence = "((())";

        System.out.println( stack.isBalanced(balancedSequence)); // Output: true
        System.out.println( stack.isBalanced(unbalancedSequence)); // Output: false
    }
    @Test

    public void testIsBalanced2() {
        Stack stack = new Stack(100); // Initialize with sufficient size

        String balancedSequence = " ({()[{}]}())";

        String unbalancedSequence = "(}])(";

        System.out.println( stack.isBalanced2(balancedSequence)); // Output: true
        System.out.println( stack.isBalanced2(unbalancedSequence)); // Output: false
    }
    @Test

    public void testEnlarged() {
        Stack stack = new Stack(5); // Initialize with sufficient size
        stack.push(new Element(1));
        stack.push(new Element(2));
        stack.push(new Element(3));
        stack.push(new Element(4));
        stack.push(new Element(5));
        stack.enlarge();
        System.out.println(stack.getN());
        stack.push(new Element(1));
        stack.push(new Element(2));
        stack.push(new Element(3));
        stack.push(new Element(4));
        stack.push(new Element(5));
        System.out.println(stack.toString());
    }
    @Test
    public void testPalindrome() {
        Stack stack = new Stack(100);
        String palindromeString = "rasasdewqr";
        System.out.println(stack.palindrome(palindromeString));
    }
    @Test
    public void testSwap2Most() {
        Stack stack = new Stack(5); // Initialize with sufficient size
        stack.push(new Element(1));
        stack.push(new Element(2));
        stack.push(new Element(3));
        stack.push(new Element(4));
        stack.push(new Element(5));
        stack.swapTopmost2();
        System.out.println(stack);
    }
    @Test
    public void testGetDown() {
        Stack stack = new Stack(5); // Initialize with sufficient size
        stack.push(new Element(1));
        stack.push(new Element(2));
        stack.push(new Element(3));
        stack.push(new Element(4));
        stack.push(new Element(5));
        Stack s2 = new Stack(1);
        System.out.println(stack.bottom().getData());
    }
    @Test
    public void testMultiply() {
        Stack stack = new Stack(6); // Initialize with sufficient size
        stack.push(new Element(1));
        stack.push(new Element(2));
        stack.push(new Element(3));
        stack.push(new Element(4));
        stack.push(new Element(5));
        stack.push(new Element(6));
        System.out.println(stack.multiply());
        System.out.println(stack);
    }
    @Test
    public void testRemoveBottom() {
        Stack stack = new Stack(6); // Initialize with sufficient size
        stack.push(new Element(1));
        stack.push(new Element(2));
        stack.push(new Element(3));
        stack.push(new Element(4));
        stack.push(new Element(5));
        stack.push(new Element(6));
        stack.removeBottom();
        System.out.println(stack);
    }
    @Test
    public void testCopy() {
        Stack stack = new Stack(6); // Initialize with sufficient size
        stack.push(new Element(1));
        stack.push(new Element(2));
        stack.push(new Element(3));
        stack.push(new Element(4));
        stack.push(new Element(5));
        stack.push(new Element(6));
        Stack s = stack.copy();
        System.out.println(s);
    }
    @Test
    public void testDoubleStack() {
        Stack stack = new Stack(6); // Initialize with sufficient size
        stack.push(new Element(1));
        stack.push(new Element(2));
        stack.push(new Element(3));
        stack.push(new Element(4));
        stack.push(new Element(5));
        stack.push(new Element(6));
        System.out.println(stack);
        stack.doubleStack();
        System.out.println(stack);

    }
    @Test
    public void testRemoveMiddle() {
        Stack stack = new Stack(7); // Initialize with sufficient size
        stack.push(new Element(1));
        stack.push(new Element(2));
        stack.push(new Element(3));
        stack.push(new Element(4));
        stack.push(new Element(5));
        stack.push(new Element(6));
        stack.push(new Element(7));
        stack.removeMiddle();
        System.out.println(stack);
    }
    @Test
    public void testRemoveK() {
        Stack stack = new Stack(7); // Initialize with sufficient size
        stack.push(new Element(1));
        stack.push(new Element(2));
        stack.push(new Element(3));
        stack.push(new Element(4));
        stack.push(new Element(5));
        stack.push(new Element(6));
        stack.push(new Element(7));
        stack.removeBottomK(5);
        System.out.println(stack);
    }
    @Test
    public void testRemoveKth() {
        Stack stack = new Stack(7); // Initialize with sufficient size
        stack.push(new Element(1));
        stack.push(new Element(2));
        stack.push(new Element(3));
        stack.push(new Element(4));
        stack.push(new Element(5));
        stack.push(new Element(6));
        stack.push(new Element(7));
        System.out.println(stack.pop(5).getData());
        System.out.println(stack);
    }
    @Test
    public void testCompress() {
        Stack stack = new Stack(7);
        stack.push(new Element(1));
        stack.push(new Element(2));
        stack.push(new Element(2));
        stack.push(new Element(2));
        stack.push(new Element(5));
        stack.push(new Element(6));
        stack.push(new Element(7));
        stack.compress();
        System.out.println(stack);
    }
    @Test
    public void testANan(){
        Stack stack = new Stack(4);
        stack.push(new Element(2));
        stack.push(new Element(3));
        stack.push(new Element(4));
        stack.push(1,8);
        System.out.println(stack);
    }
}
