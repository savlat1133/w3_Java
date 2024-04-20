// 2. Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.

public class Main{

    public static void main(String[] args) {
        PrinterThread evenThread = new PrinterThread(2,20,"EvenThread");
        PrinterThread oddThread = new PrinterThread(1,19, "OddThread");

        oddThread.start();
        evenThread.start();
    }
}

class PrinterThread extends Thread{
    private int maxNumber;
    private int minNumber;
    private String name;
    private static Object lock = new Object();

    PrinterThread(int from, int to, String name){
        this.minNumber = from;
        this.maxNumber = to;
        this.name = name;
    }

    @Override
    public void run(){
        synchronized (lock){
            for (int i = minNumber; i <= maxNumber; i += 2){
                System.out.println(name + ": " + i);
                lock.notify();
                try {
                    if(i < maxNumber){
                        lock.wait();
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
