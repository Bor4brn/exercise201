package List;

public class LinkedList {

    protected Node head;
    protected Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Node getHead() {
        return head;
    }

    public void insertFirst(Node newNode) {
        if (isEmpty()) {
            tail = newNode;
        }
        newNode.setNext(head);
        head = newNode;
    }

    public void insertLast(Node newNode) {
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
    }

    public void insertMiddle(Node newNode, Node previous) {
        newNode.setNext(previous.getNext());
        previous.setNext(newNode);
    }

    /**
     * @param value The value to be searched.
     * @return The node that has the data value. If no node exists, returns null.
     */
    public Node search(int value) {
        Node tmp = head;
        while (tmp != null) {
            if (value == tmp.getData()) {
                return tmp;
            }
            tmp = tmp.getNext();
        }
        return null;
    }

    public Node getNodeI(int i) {
        Node tmp = head;
        int index = 0;
        while (tmp != null) {
            if (index == i) {
                return tmp;
            }
            index++;
            tmp = tmp.getNext();
        }
        return null;
    }

    public int numberOfElements() {
        Node tmp = head;
        int count = 0;
        while (tmp != null) {
            count++;
            tmp = tmp.getNext();
        }
        return count;
    }

    public void deleteFirst() {
        head = head.getNext();
        if (isEmpty()) {
            tail = null;
        }
    }

    public Node getPrevious(Node node) {
        Node tmp = head;
        Node previous = null;
        while (tmp != node) {
            previous = tmp;
            tmp = tmp.getNext();
        }
        return previous;
    }

    public void deleteValue(int value) {
        Node tmp = head;
        Node previous = null;
        while (tmp != null) {
            if (tmp.getData() == value) {
                if (previous != null) {
                    previous.setNext(tmp.next);
                    if (tmp.next == null) {
                        tail = previous;
                    }
                } else {
                    head = tmp.next;
                    if (head == null) {
                        tail = null;
                    }
                }
                break;
            }
            previous = tmp;
            tmp = tmp.getNext();
        }
    }

    public void deleteLast() {
        tail = getPrevious(tail);
        if (tail != null) {
            tail.setNext(null);
        } else {
            head = null;
        }
    }

    public void deleteMiddle(Node node) {
        Node previous;
        previous = getPrevious(node);
        previous.setNext(node.getNext());
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        Node tmp = head;
        while (tmp != null) {
            result.append(tmp).append(" ");
            tmp = tmp.getNext();
        }
        return result.toString();
    }

    static LinkedList union(LinkedList l1, LinkedList l2) {
        int data;
        LinkedList result;
        Node tmp1, tmp2, node;
        result = new LinkedList();
        tmp1 = l1.head;
        tmp2 = l2.head;
        while (tmp1 != null && tmp2 != null) {
            if (tmp1.data < tmp2.data) {
                data = tmp1.data;
                tmp1 = tmp1.next;
            } else if (tmp1.data > tmp2.data) {
                data = tmp2.data;
                tmp2 = tmp2.next;
            } else {
                data = tmp1.data;
                tmp1 = tmp1.next;
                tmp2 = tmp2.next;
            }
            node = new Node(data);
            result.insertLast(node);
        }
        return result;
    }

    void insertBeforeLast(Node newNode) {
        LinkedList l1 = new LinkedList();
        Node current = head;
        Node previous = null;
        while (current.next != null) {
            previous = current;
            current = current.getNext();
        }

        // Insert the new node before the last node
        if (previous != null) {
            // newNode becomes the new last node
            previous.setNext(newNode);
            newNode.setNext(current);
        } else {
            // If there's only one node in the list
            newNode.setNext(head);
            head = newNode;
        }
    }

    void AddToSortedList(int x) {
        Node newNode = new Node(x);
        Node current = head;
        Node previous = null;
        if (head == null || x < head.getData()) {
            newNode.setNext(head);
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
        }
        while (current != null && x >= current.getData()) {
            previous = current;
            current = current.getNext();
        }
        newNode.setNext(current);
        previous.setNext(newNode);
        if (current == null) {
            tail = newNode;
        }
    }

    void deleteKth(int k) {
        LinkedList l1 = new LinkedList();
        Node current = head;
        Node previous = null;
        for (int i = 1; i < k; i++) {
            previous = current;
            current = current.getNext();
        }
        if (current != null) {
            if (previous != null) {
                previous.setNext(current.getNext());
            } else {
                head = current.getNext();
            }
        }
    }

    void move(Node X, int n) {
        Node curr = head;
        int j = 0;
        if (curr != null) {
            while (j < n - 1) {
                curr = curr.next;
                j++;
            }
            X.next = curr.next;
            curr.next = X;
        }
    }

    public LinkedList primeFactors(int N) {
        LinkedList primeFactor = new LinkedList();
        for (int primeNums = 2; primeNums <= N; primeNums++) {
            while (N % primeNums == 0) {
                Node primeNumber = new Node(primeNums);
                primeFactor.insertFirst(primeNumber);
                N /= primeNums;
            }
        }
        return primeFactor;
    }

    LinkedList removeDivisibleByN(int N) {
        Node n1 = head;
        Node n2 = null;
        LinkedList l1 = new LinkedList();
        while (n1 != null) {
            if (N % n1.data == 0) {
                if (n2 == null) {
                    head = n1.next;
                } else {
                    n2.setNext(n1.getNext());
                }
                Node n3 = new Node(n1.data);
                l1.insertFirst(n3);
            }
            n2 = n1;
            n1 = n1.next;
        }
        return l1;
    }

    public LinkedList reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return this;
    }

    boolean palindrom() {
        Boolean b = true;
        LinkedList l1 = new LinkedList();
        Node current = l1.head;
        for (int i = 1; i < l1.numberOfElements() / 2; i++) {
            if (current.data == l1.tail.data) {
                current = current.next;
                tail = getPrevious(tail);
            } else {
                b = false;
            }
        }
        return b;
    }

    static LinkedList intersection ( LinkedList l1 , LinkedList l2 ){
        Node n1 = l1.head;
        Node n2 = l2.head;
        int data;
        LinkedList l3 = new LinkedList();
        while(n1 != null && n2 != null){
            if(n1.data == n2.data){
                data = n1.data;
                Node newNode = new Node(data);
                l3.insertFirst(newNode);
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return l3;
    }

    void deleteAll(int X) {
        Node current = head;
        Node previous = null;
        while (current != null) {
            if (current.data == X) {
                if (previous != null) {
                    previous.setNext(current.next);
                } else {
                    head = current.next;
                }
            }
            previous = current;
            current = current.next;
        }
    }

    boolean subList(LinkedList sub) {
        Node current = head;
        Node current2 = sub.head;
        while (current != null && current2 != null) {
            if (current.data == current2.data) {
                current = current.next;
                current2 = current2.next;
            } else {
                current = current.next;
            }
        }
        return current2 == null;
    }

    void removeBeforeLast() {
        Node current = head;
        Node previous = null;
        while (current.next.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = current.next;
    }

    static LinkedList fibonacci(int A, int B) {
        int i, b, data, nu1 = 0, nu2 = 1, nu3;
        Node n1, n2;
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        LinkedList l3 = new LinkedList();
        for (i = 2; i <= A; i++) {
            nu3 = nu1 + nu2;
            n1 = new Node(nu3);
            l2.insertLast(n1);
            nu1 = nu2;
            nu2 = nu3;
        }
        for (b = 2; b <= B; b++) {
            nu3 = nu1 + nu2;
            n2 = new Node(nu3);
            l3.insertLast(n2);
            nu1 = nu2;
            nu2 = nu3;
        }
        Node current = l2.head;
        Node current2 = l3.head;
        while (current != null && current2 != null) {
            if (current2.data != current.data) {
                data = current2.data;
                Node n3 = new Node(data);
                l1.insertLast(n3);
            }
            current = current.next;
            current2 = current2.next;
        }
        return l1;
    }

    void removeDuplicates() {
        Node current = head;
        while (current != null && current.next != null) {
            Node runner = current;
            while (runner.next != null) {
                if (current.data == runner.next.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    void removeSingles() {
        Node current = head;
        while (current != null && current.next != null) {
            Node runner = current;
            while (runner.next != null) {
                if (current.data != runner.next.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    public void addAfterEachNode(Node newNode) {
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = newNode;
            newNode.next = next;
            current = next;
        }
    }

    void printOddNodes() {
        Node current = head;
        int index = 1;
        while (current != null) {
            if (index % 2 != 0) { // check if index is odd
                System.out.println(current.data);
            }
            current = current.next;
            index++;
        }
    }

    void deletePrimes() {//güzel soru
        Node current = head;
        Node prev = null;

        while (current != null) {
            boolean prime = true;
            if (current.data <= 1) {
                prime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(current.data); i++) {
                    if (current.data % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }
            if (prime) {
                if (current == head) {
                    head = head.next;
                    current = head;
                } else {
                    prev.next = current.next;
                    current = prev.next;
                }
            } else {
                prev = current;
                current = current.next;
            }
        }
    }

    void deleteBetween(int p, int q) {//bakılcak

    }

    void extractPrime(int N) {//olmadı, tekrar dene
        for (int i = 2; i <= N; i++) {
            Node newNode = new Node(i);
            insertLast(newNode);
        }
        Node current = head;
        Node nextNode = current.next;
        while (current != null) {
            boolean prime = true;
            if (current.data <= 1) {
                prime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(current.data); i++) {
                    if (current.data % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }
            if (prime) {
                System.out.println(current.data);
                while (nextNode != null) {
                    if (nextNode.data % current.data == 0) {
                        current.next = nextNode.next;
                        nextNode = current.next;
                    } else {
                        nextNode = nextNode.next;
                    }
                }
            } else {
                while (nextNode != null) {
                    current = nextNode;
                    nextNode = nextNode.next;
                }
            }
        }
    }

    boolean containsOnlyDuplicates() {
        Node current = head;
        Node nextNode = current.next;
        Boolean b = true;
        double index = 0;
        while (nextNode != null) {
            if (current.data != nextNode.data) {
                nextNode = nextNode.next;
            } else {
                current = current.next;
                nextNode = current.next;
                index++;
            }
        }
        double result = (double) numberOfElements() / 2.0;
        if (index != result) {
            b = false;
        }
        return b;
    }

    public LinkedList primeDivisors(int N) {
        LinkedList primes = new LinkedList();
        for (int i = 2; i <= N; i++) {
            if (N % i == 0) {
                boolean isPrime = true;
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    Node prime = new Node(i);
                    primes.insertLast(prime);
                }
            }
        }
        LinkedList primeDivisors = new LinkedList();
        Node current = primes.head;
        while(current != null){
            while(N % current.data == 0){
                N = N/current.data;
                Node primeDivisor = new Node(current.data);
                primeDivisors.insertLast(primeDivisor);
            }
            if(N % current.data != 0){
                current = current.next;
            }
        }
        return primeDivisors;
    }
    public Node lastOneWins(int k){
        Node temp=head;
        Node prev=null;

        while(head!=tail){
            int i=1;
            while(i<k){
                prev=temp;
                temp=temp.getNext();
                if(temp==null){
                    prev=null;
                    temp=head;
                }
                i++;
            }
            if(prev==null) {
                head = head.getNext();
            } else {
                prev.setNext(temp.getNext());
            }
            if(temp==tail){
                tail=prev;
            }
            temp=temp.getNext();
            if(temp==null){
                temp=head; //dairesel list özelliği
            }
        }
        return head;
    }
    boolean evenOddSorted() {
        Boolean b = true;
        Node current = head;
        while(current.next.next != null){
            if(current.data < current.next.next.data){
                b = true;
            }
            else{
                b = false;
                break;
            }
            current = current.next;
            current = current.next;
        }
        return b;
    }
}











