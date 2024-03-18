package List;

import Array.Element;

public class Stack{
    private Node top;

    public Stack(){
        top = null;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public Node peek(){
        return top;
    }

    public void push(Node node){
        node.setNext(top);
        top = node;
    }

    public Node pop(){
        Node topNode = top;
        top = top.next;
        return topNode;
    }
    void swapTopmost2(){
            Node n1 = pop();
            Node n2 = pop();
            push(n2);
            push(n1);
        }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = top;
        while (current != null) {
            sb.append(current.getData());
            current = current.getNext();
            if (current != null) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
    int multiply (){
        int data1 = 0,data2 = 0;
        if(top.next != null){
            data1 = top.getData();
            data2 = top.next.getData();
            top=top.next.next;
        }
        return data1*data2;
    }
    public Stack copy() { // tam anlamadım
        Stack copyStack = new Stack();
        Node current = top;
        Node prev = null;
        Node newTop = null;

        // Traverse the original stack and copy each node
        while (current != null) {
            Node newNode = new Node(current.data);
            if (prev != null) {
                prev.next = newNode;
            } else {
                newTop = newNode;
            }
            prev = newNode;
            current = current.next;
        }

        // Set the top of the copy stack
        copyStack.top = newTop;

        return copyStack;
    }
    void removeOddIndexed() {
        Stack tempStack = new Stack();
        int index = 1;
        while (!isEmpty()) {
            Node newNode = pop();
            tempStack.push(newNode);
            index++;
        }
        while (index > 1) {
            Node newNode = tempStack.pop();
            if (index % 2 == 0) {
                push(newNode);
            }
            index--;
        }
    }
    Node pop(int k){
        Node cur = top;
        Node n = null;
        Node prev = null;
        int index = 1;
        while(index != k){
            prev = cur;
            cur = cur.next;
            index++;
        }
        if(prev != null) {
            n = new Node(cur.data);
            prev.next = cur.next;
        }
        return n;
    }
    void compress(){//sınav sorusu,kolay
        Node n = top;
        Node n1 = n.next;
        while(n1 != null){
            if(n.data == n1.data){
                n.next = n1.next;
            }else{
                n = n1;
            }
            n1 = n1.next;
        }
    }
    void push(int k, int data){
        Node current = top;
        Node prev = null;
        Node prev2 = null;
        while(k != 0){
            prev2 = prev;
            prev = current;
            current = current.next;
            k--;
        }
        if(prev2 != null) {
            Node newNode = new Node(data);
            prev2.next = newNode;
            newNode.next = prev;
        }
        else {
            Node newNode = new Node(data);
            top = newNode;
            newNode.next = prev;
        }
    }
}
