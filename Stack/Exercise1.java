// 1. Write a Java program to implement a stack with push and pop operations. Find the top element of the stack and check if it is empty or not.

// Main.java file
public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        stack.display();
    }

}

// Stack.java file
public class Stack<T> {
    private T[] arr;
    private int top;

    @SuppressWarnings("unchecked")
    public Stack(int size) {
        arr = (T[]) new Object[size];
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

}
