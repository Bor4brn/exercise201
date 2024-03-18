package Array;

public class Stack {
    private Element[] array;
    private int top;
    private int N;

    public Stack(int N) {
        this.N = N;
        array = new Element[N];
        top = -1;
    }

    boolean isFull() {
        return top == N - 1;
    }

    public int getN() {
        return N;
    }

    boolean isEmpty() {
        return top == -1;
    }

    Element peek() {
        return array[top];
    }

    void push(Element element) {
        if (!isFull()) {
            top++;
            array[top] = element;
        }
    }

    Element pop() {
        if (!isEmpty()) {
            top--;
            return array[top + 1];
        }
        return null;
    }

    int largest() {
        int largest;
        Stack t = new Stack(N);
        Element e;
        e = pop();
        t.push(e);
        largest = e.getData();
        while (!isEmpty()) {
            e = pop();
            t.push(e);
            if (e.getData() > largest) {
                largest = e.getData();
            }
        }
        while(t.isEmpty() == false){
            e = t.pop();
            push(e);
        }
        return largest;
    }
    boolean isBalanced(String s){
        Stack stack = new Stack(s.length());
        for(int i = 0; i<s.length();i++){
            char b = s.charAt(i);
            if(b =='('){
                stack.push(new Element(b));
            }
            else if(b == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
    boolean isBalanced2(String s){
        Stack stack = new Stack(s.length());
        for(int i = 0; i<s.length();i++){
            char b = s.charAt(i);
            if(b =='('|| b=='{'||b =='['){
                stack.push(new Element(b));
            }
            else if(b == ')'|| b=='}'||b ==']'){
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
    public boolean palindrome(String s) {
        Stack stack = new Stack(s.length());
        // Push characters of the string onto the stack
        for (int i = 0; i < s.length(); i++) {
            Element e = new Element(s.charAt(i));
            stack.push(e);
        }
        // Compare characters from the stack with characters from the string
        for (int i = 0; i < s.length(); i++) {
            Element e = stack.pop();
            if (e.getData() != s.charAt(i)) {
                return false; // Characters don't match, not a palindrome
            }
        }
        return stack.isEmpty(); // If stack is empty, it's a palindrome
    }

    void enlarge() {
        int newCapacity = N * 2; // Double the capacity
        Element[] newArray = new Element[newCapacity];

        // Copy elements from the original array to the new array
        for (int i = 0; i <= top; i++) {
            newArray[i] = array[i];
        }

        // Update the array reference and capacity
        array = newArray;
        N = newCapacity;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = top; i >= 0; i--) {
            sb.append(array[i].getData());
            if (i != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    void swapTopmost2() { //Amele işi yaptın, stackin içine atmadan poplayıp tekrar içeri alabiliyosun
        Stack s1 = new Stack(1);
        Stack s2 = new Stack(1);
        int i1 = 1;
        int i2 = 1;
        while(i1 != 0){
           Element e1 = pop();
           s1.push(e1);
           i1--;
        }
        while(i2 != 0){
            Element e2 = pop();
            s2.push(e2);
            i2--;
        }
        Element e = s1.pop();
        push(e);
        Element e1 = s2.pop();
        push(e1);
    }
    Element bottom(){
        Element e;
        e = pop();
        while(!isEmpty()){
             e = pop();
        }
        return e;
    }
    int multiply (){
        int data= 0,data2 =0;
        if(top >= 1){
            data = array[top].getData();
            data2 = array[top-1].getData();
            top--;
            top--;
        }
        return data*data2;
    }
    void removeBottom(){
        Stack s = new Stack(N-1);
        while(!isEmpty()){
            Element e = pop();
            s.push(e);
        }
        while(!s.isEmpty()){
            Element e = s.pop();
            push(e);
        }
    }
    Stack copy(){
        Stack copy = new Stack(N);
        while(top >= 0){
            Element e = new Element(array[top].getData());
            copy.array[top] = e;
            top--;
            copy.top ++;
        }
        return copy;
    }
    void doubleStack(){ //Array size ı önceden 2*N vermezsen olmuyo, düzelt
        Stack secondStack = new Stack(N);
        while(!isEmpty()){
            Element e;
            e = pop();
            secondStack.push(e);
        }
        while(!secondStack.isEmpty()){
            Element element = secondStack.pop();
            push(element);
            push(element);
            }
        }
    void removeMiddle(){
        Stack s = new Stack(N);
        int size = 0;
        while(!isEmpty()){
            Element e = pop();
            s.push(e);
            size++;
        }
        for(int i = 0;i<(size-1)/2;i++){
            Element e = s.pop();
            push(e);
        }
        s.pop();
        while(!s.isEmpty()){
            Element e = s.pop();
            push(e);
        }
    }
    void removeBottomK(int K){
         Stack s = new Stack(N);
         while(!isEmpty()){
             Element e = pop();
             s.push(e);
         }
         for(int i = 0 ; i<K ;i++){
             s.pop();
         }
         while(!s.isEmpty()){
             Element e = s.pop();
             push(e);
         }
    }
    Element pop(int k) {//TAM OLMADI TEKRAR BAK
        int index = 1;
        int elementIndex = N - k;
        Element removedElement = array[elementIndex];
        for (int i = elementIndex; i < N - 1; i++) {
            array[i] = array[i + 1];
        }
        N--;
        return removedElement;
    }
    void compress() {
        Stack tempStack = new Stack(N);
        while (!isEmpty()) {
            Element currentElement = pop();
            if (tempStack.isEmpty() || currentElement.getData() != tempStack.array[top].getData()) {
                tempStack.push(currentElement);
            }
        }
        while (!tempStack.isEmpty()) {
            push(tempStack.pop());
        }
    }
    void push(int k, int data){
        Element[] elements = new Element[k-1];
        if(!isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                Element e = array[top];
                elements[i] = e;
                top--;
            }
        }
        Element e1 = new Element(data);
        top++;
        array[top] = e1;
        for(int i = k-2;i>=0;i--){
            Element e2 = elements[i];
            top++;
            array[top] = e2;
        }
    }
}


