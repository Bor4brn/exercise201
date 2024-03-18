package List;
import Array.Element;
import List.Stack;
import org.junit.Test;


public class LinkedListTest {
    @Test
    public void TestSwap(){
        DoublyLinkedList l1 = new DoublyLinkedList();
        DoublyNode d1 = new DoublyNode(1);
        DoublyNode d2 = new DoublyNode(2);
        DoublyNode d3 = new DoublyNode(3);
        l1.insertFirst(d1);
        l1.insertFirst(d2);
        l1.insertFirst(d3);
        System.out.println(l1.toString());
        System.out.println(l1.toString());
    }
    @Test
    public void TestPrimeFactors(){
        LinkedList l1 = new LinkedList();
        LinkedList l2 =l1.primeFactors(15);
        System.out.println(l2.toString());
    }
    @Test
    public void TestRemoveDivisibleByN(){
        LinkedList l1 = new LinkedList();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        l1.insertFirst(n1);
        l1.insertFirst(n2);
        l1.insertFirst(n3);
        LinkedList l2 = l1.removeDivisibleByN(15);
        System.out.println(l1.toString());
        System.out.println(l2.toString());
    }
    @Test
    public void TestReverse(){
        LinkedList l1 = new LinkedList();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        l1.insertFirst(n1);
        l1.insertFirst(n2);
        l1.insertFirst(n3);
        l1.insertFirst(n4);
        System.out.println(l1.toString());
        LinkedList l2 = l1.reverse();
        System.out.println(l2.toString());
    }
    @Test
    public void TestPalindrom(){
        LinkedList l1 = new LinkedList();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        l1.insertFirst(n1);
        l1.insertFirst(n2);
        l1.insertFirst(n3);
        l1.insertFirst(n4);
        System.out.println(l1.toString());
        boolean a = l1.palindrom();
        System.out.println(a);
    }
    @Test
    public void testIntersection() {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n7 = new Node(1);
        l1.insertFirst(n1);
        l2.insertFirst(n2);
        l2.insertFirst(n7);

        System.out.println("LinkedList l1: " + l1.toString());
        System.out.println("LinkedList l2: " + l2.toString());

        LinkedList l3 = LinkedList.intersection(l1, l2);

        System.out.println("Intersection: " + l3.toString());
    }
    @Test
    public void testDeleteAll() {
        LinkedList l1 = new LinkedList();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        l1.insertFirst(n1);
        l1.insertFirst(n2);
        System.out.println(l1.toString());
        l1.deleteAll(2);
        System.out.println(l1.toString());
    }
    @Test
    public void testSubList() {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        l1.insertFirst(n1);
        l1.insertFirst(n2);
        l1.insertFirst(n3);
        l2.insertFirst(n2);
        l2.insertFirst(n3);
        boolean b = l1.subList(l2);
        System.out.println(b);
    }
    @Test
    public void testDoubleList() {
        DoublyLinkedList l1 = new DoublyLinkedList();
        DoublyNode n1 = new DoublyNode(1);
        DoublyNode n2 = new DoublyNode(2);
        DoublyNode n3 = new DoublyNode(3);
        l1.insertFirst(n1);
        l1.insertFirst(n2);
        l1.insertFirst(n3);
        l1.doubleList();
        System.out.println(l1);
    }
    @Test
    public void testFibonacci() {
        LinkedList l1 = LinkedList.fibonacci(3 ,5);
        System.out.println(l1);
    }
    @Test
    public void testDuplicate() {
        LinkedList l1 = new LinkedList();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(3);
        Node n5 = new Node(3);
        l1.insertFirst(n1);
        l1.insertFirst(n2);
        l1.insertFirst(n3);
        l1.insertFirst(n4);
        l1.insertFirst(n5);
        System.out.println(l1.toString());
        l1.removeDuplicates();
        System.out.println(l1.toString());
    }
    @Test
    public void testSingles() {
        LinkedList l1 = new LinkedList();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(3);
        Node n5 = new Node(3);
        l1.insertFirst(n1);
        l1.insertFirst(n2);
        l1.insertFirst(n3);
        l1.insertFirst(n4);
        l1.insertFirst(n5);
        System.out.println(l1.toString());
        l1.removeSingles();
        System.out.println(l1.toString());
    }
    @Test
    public void testRemoveKth() {
        DoublyLinkedList l1 = new DoublyLinkedList();
        DoublyNode n1 = new DoublyNode(1);
        DoublyNode n2 = new DoublyNode(2);
        DoublyNode n3 = new DoublyNode(3);
        DoublyNode n4 = new DoublyNode(4);
        l1.insertFirst(n1);
        l1.insertFirst(n2);
        l1.insertFirst(n3);
        l1.insertFirst(n4);
        System.out.println(l1);
        l1.removeKth(2);
        System.out.println(l1);
    }
    @Test
    public void testReversed() {
        LinkedList l1 = new LinkedList();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        l1.insertFirst(n1);
        l1.insertFirst(n2);
        l1.insertFirst(n3);
        System.out.println(l1);
        l1.addAfterEachNode(n4);
        System.out.println(l1);
    }
    @Test
    public void testInsertNew() {
        LinkedList l1 = new LinkedList();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        l1.insertFirst(n1);
        l1.insertFirst(n2);
        l1.insertFirst(n3);
        System.out.println(l1);
        l1.addAfterEachNode(n4);
        System.out.println(l1);
    }
    @Test
    public void testPrintOdds() {
        LinkedList l1 = new LinkedList();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        l1.insertFirst(n1);
        l1.insertFirst(n2);
        l1.insertFirst(n3);
        l1.printOddNodes();
    }
    @Test
    public void testDeletePrimes() {
        LinkedList l1 = new LinkedList();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        l1.insertFirst(n1);
        l1.insertFirst(n2);
        l1.insertFirst(n3);
        l1.deletePrimes();
        System.out.println(l1);
    }
    @Test
    public void testPrim() {
        LinkedList l1 = new LinkedList();
        l1.extractPrime(20);
    }
    @Test
    public void testReturnEvens() {
        DoublyLinkedList l1 = new DoublyLinkedList();
        DoublyLinkedList l2 = new DoublyLinkedList();
        DoublyNode n1 = new DoublyNode(1);
        DoublyNode n2 = new DoublyNode(2);
        DoublyNode n3 = new DoublyNode(3);
        DoublyNode n4 = new DoublyNode(4);
        l1.insertFirst(n1);
        l1.insertFirst(n2);
        l1.insertFirst(n3);
        l1.insertFirst(n4);
        System.out.println(l1);
        l2 = l1.getEvenOnes();
        System.out.println(l2);
    }
    @Test
    public void testOnlyDuplicates() {
        LinkedList l1 = new LinkedList();
        Node n1 = new Node(1);
        Node n5 = new Node(1);
        Node n2 = new Node(2);
        Node n6 = new Node(2);
        Node n3 = new Node(3);
        Node n7 = new Node(3);
        Node n4 = new Node(4);
        Node n8 = new Node(4);
        l1.insertFirst(n1);
        l1.insertFirst(n2);
        l1.insertFirst(n3);
        l1.insertFirst(n4);
        l1.insertFirst(n5);
        l1.insertFirst(n6);
        l1.insertFirst(n7);
        l1.insertFirst(n8);
        System.out.println(l1.containsOnlyDuplicates());
    }
    @Test
    public void testPrimeDivisors() {
        LinkedList l1 = new LinkedList();
        System.out.println(l1.primeDivisors(200));
    }
    @Test
    public void testSwap2TopMost() {
        Stack stack = new Stack();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);// Initialize with sufficient size
        stack.push(n1);
        stack.push(n2);
        stack.push(n3);
        stack.push(n4);
        stack.swapTopmost2();
        System.out.println(stack);
    }
    @Test
    public void testCopy() {
        Stack stack = new Stack();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        stack.push(n1);
        stack.push(n2);
        stack.push(n3);
        stack.push(n4);
        Stack s = stack.copy();
        System.out.println(s);
    }
    @Test
    public void testRemoveOdds() {
        Stack stack = new Stack();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        stack.push(n1);
        stack.push(n2);
        stack.push(n3);
        stack.push(n4);
        System.out.println(stack);
        stack.removeOddIndexed();
        System.out.println(stack);
    }
    @Test
    public void testPop() {
        Stack stack = new Stack();

        System.out.println(stack.pop(2).getData());
        System.out.println(stack);
    }
    @Test
    public void testCompress() {
        Stack stack = new Stack();
        Node n1 = new Node(1);
        Node n2 = new Node(5);
        Node n3 = new Node(5);
        Node n4 = new Node(4);
        stack.push(n1);
        stack.push(n2);
        stack.push(n3);
        stack.push(n4);
        stack.compress();
        System.out.println(stack);
    }
    @Test
    public void testDeleteBefore() {
        DoublyLinkedList l1 = new DoublyLinkedList();
        DoublyNode n1 = new DoublyNode(1);
        DoublyNode n2 = new DoublyNode(2);
        DoublyNode n3 = new DoublyNode(3);
        DoublyNode n4 = new DoublyNode(4);
        l1.insertFirst(n1);
        l1.insertFirst(n2);
        l1.insertFirst(n3);
        l1.insertFirst(n4);
        l1.deleteBefore(n1);
        System.out.println(l1);
    }
    @Test
    public void testOneLeft() {
        LinkedList l1 = new LinkedList();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        l1.insertFirst(n1);
        l1.insertFirst(n2);
        l1.insertFirst(n3);
        l1.insertFirst(n4);
        l1.lastOneWins(2);
        System.out.println(l1);
    }
    @Test
    public void testSortElements() {
        DoublyLinkedList l1 = new DoublyLinkedList();
        DoublyNode n1 = new DoublyNode(3);
        DoublyNode n2 = new DoublyNode(2);
        DoublyNode n3 = new DoublyNode(3);
        DoublyNode n4 = new DoublyNode(4);
        l1.insertFirst(n1);
        l1.insertFirst(n2);
        l1.insertFirst(n3);
        l1.insertFirst(n4);
        DoublyLinkedList l2 = l1.sortElements();
        System.out.println(l2);
    }
    @Test
    public void testEvenSortedElements() {
        LinkedList l1 = new LinkedList();
        Node n1 = new Node(4);
        Node n2 = new Node(3);
        Node n3 = new Node(6);
        Node n4 = new Node(14);
        l1.insertFirst(n1);
        l1.insertFirst(n2);
        l1.insertFirst(n3);
        l1.insertFirst(n4);
        System.out.println(l1);
        System.out.println(l1.evenOddSorted());
    }
    @Test
    public void TestCutPaste(){
        DoublyLinkedList list1=new DoublyLinkedList();
        list1.insertLast(new DoublyNode(4));
        list1.insertLast(new DoublyNode(3));
        list1.insertLast(new DoublyNode(5));
        list1.insertLast(new DoublyNode(8));
        list1.insertLast(new DoublyNode(9));
        DoublyLinkedList list2=new DoublyLinkedList();
        list2.insertLast(new DoublyNode(1));
        list2.insertLast(new DoublyNode(2));
        list2.insertLast(new DoublyNode(10));
        list2.insertLast(new DoublyNode(11));
        list1.cutPaste(new DoublyNode(3), new DoublyNode(8), new DoublyNode(2));
        System.out.println(list1.toString());
        System.out.println(list2.toString());
    }
    @Test
    public void testPush() {
        Stack stack = new Stack();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        stack.push(n1);
        stack.push(n2);
        stack.push(n3);
        stack.push(n4);
        stack.push(2,5);
        System.out.println(stack);
    }
}