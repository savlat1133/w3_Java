// 5. Write a Java program to find the maximum and minimum elements in a stack.

// Main.java file
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);
        stack.push(2);
        stack.push(5);
        stack.push(3);
        stack.push(4);
        stack.push(1);
        System.out.println(stack.getMax());
    }
}

// Stack.java
public class Stack<T extends Comparable<T>>{
    private T[] arr;
    private int top;

    @SuppressWarnings("unchecked")
    public Stack(int size) {
        arr = (T[]) new Comparable[size];
        top = -1;
    }

    public void push(T element) {
        if (top == arr.length - 1) {
            throw new StackOverflowError("Stack if full.");
        }
        arr[++top] = element;
    }

    public T pop() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty.");
        }
        return arr[top--];
    }

    public T peek() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty.");
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public void sortAsc(){
        if (top == -1) {
            throw new IllegalStateException("Stack is empty.");
        }
        Stack<T> tempStack = new Stack<>(arr.length);

        while(!isEmpty()){
            T current = pop();

            while(!tempStack.isEmpty() && tempStack.peek().compareTo(current) > 0){
                push(tempStack.pop());
            }
            tempStack.push(current);
        }

        while (!tempStack.isEmpty()){
            push(tempStack.pop());
        }
    }

    public void sortDesc(){
        if (top == -1) {
            throw new IllegalStateException("Stack is empty.");
        }
        Stack<T> tempStack = new Stack<>(arr.length);

        while(!isEmpty()){
            T current = pop();

            while(!tempStack.isEmpty() && tempStack.peek().compareTo(current) < 0){
                push(tempStack.pop());
            }
            tempStack.push(current);
        }

        while (!tempStack.isEmpty()){
            push(tempStack.pop());
        }
    }

    public void reverse(){
        if (top == -1) {
            throw new IllegalStateException("Stack is empty.");
        }
        Stack<T> tempStack = new Stack<>(arr.length);

        while(!isEmpty()){
            T current = pop();
            tempStack.push(current);
        }
        while(!tempStack.isEmpty()){
            push(tempStack.pop());
        }
    }


    public T getMax() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty.");
        }

        T max = arr[0];
        for (int i = 1; i <= top; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }

    public T getMin() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty.");
        }

        T max = arr[0];
        for (int i = 1; i <= top; i++) {
            if (arr[i].compareTo(max) < 0) {
                max = arr[i];
            }
        }
        return max;
    }
}
