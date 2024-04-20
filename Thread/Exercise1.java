// 1. Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.

public class Main{
    public static void main(String[] args) {
        HelloWorldThread thread = new HelloWorldThread();
        thread.start();
    }
}
class HelloWorldThread extends Thread{
    @Override
    public void run() {
        System.out.println("Hello, World!");
    }
}
