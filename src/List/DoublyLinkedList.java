package List;

import javax.swing.*;

public class DoublyLinkedList extends LinkedList{

    public void insertFirst(DoublyNode newNode) {
        if (tail == null) {
            tail = newNode;
        } else {
            ((DoublyNode) head).setPrevious(newNode);
        }
        newNode.setNext(head);
        head = newNode;
    }

    public void insertMiddle(DoublyNode newNode, DoublyNode previous) {
        newNode.setNext(previous.getNext());
        newNode.setPrevious(previous);
        ((DoublyNode) previous.getNext()).setPrevious(newNode);
        previous.setNext(newNode);
    }

    public void insertLast(DoublyNode newNode) {
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        newNode.setPrevious((DoublyNode) tail);
        tail = newNode;
    }

    public void deleteFirst(){
        head = head.getNext();
        if (head == null){
            tail = null;
        } else {
            ((DoublyNode)head).setPrevious(null);
        }
    }

    public void deleteMiddle(DoublyNode node){
        ((DoublyNode) node.getNext()).setPrevious(node.getPrevious());
        node.getPrevious().setNext(node.getNext());
    }

    public void deleteLast(){
        tail = ((DoublyNode)tail).getPrevious();
        if (tail != null){
            tail.setNext(null);
        } else {
            head = null;
        }
    }
    void deleteBefore(DoublyNode X){
        DoublyNode A=X.getPrevious();
        if (A != null && A.getPrevious() != null) {
                A.getPrevious().setNext(X);
                X.setPrevious(A.getPrevious());
        }
        else if(A != null && A.getPrevious() == null){
            head = X;
            X.setPrevious((DoublyNode) head);
        }
    }

    public DoublyNode middle() {
        if (head == null) {
            return null;
        }
        DoublyNode slow = (DoublyNode) head;
        DoublyNode fast = (DoublyNode) head;
        while (fast != null && fast.next != null) {
            slow = (DoublyNode) slow.next;
            fast = (DoublyNode) fast.next.next;
        }
        return slow;
    }
    void doubleList (){
        DoublyNode n1 = (DoublyNode) head;
        while(n1 != null){
            DoublyNode n2 = new DoublyNode(n1.data);
            n2.next = n1.next;
            n1.setNext(n2);
            n1 = (DoublyNode) n1.next.next;
        }
    }
    void removeKth(int K) {
        DoublyNode current = (DoublyNode) head;
        DoublyNode previous = null;
        for (int i = 1; i < K; i++) {
            previous = current;
            current = (DoublyNode) current.next;
        }
        if (current != null) {
            if (previous != null) {
                previous.next = current.next;
            }
        }
    }
    DoublyLinkedList getEvenOnes(){
        DoublyNode current = (DoublyNode) head;
        DoublyLinkedList evenList = new DoublyLinkedList();
        int index = 0;
        while(current != null){
            if(index % 2 == 0){
                DoublyNode evenNode = new DoublyNode(current.data);
                evenList.insertLast(evenNode);
            }
            index++;
            current = (DoublyNode) current.next;
        }
        return evenList;
    }
    DoublyLinkedList sortElements(){ //güzel soru
        DoublyNode current = (DoublyNode) head;
        DoublyLinkedList newList = new DoublyLinkedList();
        int biggest = 0;
        while(current != null){
            if(current.data > biggest){
                biggest = current.data;
            }
            current = (DoublyNode) current.next;
        }
        current = (DoublyNode) head;
        int a = 0;
        for(int i = 1; i<=biggest;i++) {
            while(current != null){
                if(current.data == i){
                    a++;
                }
                current = (DoublyNode) current.next;
            }
            while(a != 0){
                DoublyNode newNode = new DoublyNode(i);
                newList.insertLast(newNode);
                a--;
            }
            current = (DoublyNode) head;
        }
        return newList;
    }
    public void cutPaste(DoublyNode first , DoublyNode last, DoublyNode paste) {
        DoublyNode prevOfFirst=first.getPrevious();
        DoublyNode nextOfLast= (DoublyNode) last.getNext();

        if(prevOfFirst!=null){
            prevOfFirst.setNext(nextOfLast); // A <-> E
        } else {
            head=nextOfLast;
        }

        if(nextOfLast !=null){
            nextOfLast.setPrevious(prevOfFirst); // A <-> E
        } else {
            tail=prevOfFirst;
        }
        DoublyNode current = first; //kesilmiş düğümün başlangıç bölümü= current
        while(current!=last.getNext()){ //kesilmiş düğümün son bölümüne kadar
            DoublyNode next = (DoublyNode) current.getNext();
            current.setPrevious(paste); //kesilmiş düğümün başlangıç bölümünü yapıştırılacak düğümün önceki düğümü yap
            current.setNext(paste.getNext()); //kesilmiş düğümün başlangıç bölümünü yapıştırılacak düğümün sonraki düğümü yap
            if(paste.getNext()!=null){
                ((DoublyNode) paste.getNext()).setPrevious(current);
            }
            paste.setNext(current);
            current=next;
        }

    }

}




