// 1. Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.

import java.util.concurrent.*;

// HelloThread.java file
public class HelloThread extends Thread{
    @Override
    public void run(){
        System.out.println("3.Hello world!");
    }
}


// ForkJoinTask.java file
import java.util.concurrent.RecursiveTask;

public class ForkJoinTask extends RecursiveTask<Void> {
    @Override
    public Void compute(){
        System.out.println("7.Hello world!");
        return null;
    }
}

// Main.java file
public class Main {

    public static void main(String[] args) {

        //Thread with an Anonymous Inner Class
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1.Hello world!");
            }
        });
        thread.start();

        //Thread with a Lambda Expression
        new Thread(() -> {
            System.out.println("2.Hello world!");
        }).start();

        //Thread by Extending the Thread Class
        HelloThread thread1 = new HelloThread();
        thread1.start();

        //Thread using ExecutorService and Callable
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<String> callable = () -> {
            System.out.println("4.Hello world!");
            return "";
        };

        Future<String> future = executor.submit(callable);
        try{
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
        executor.shutdown();

        //Thread using ExecutorService and Runnable
        ExecutorService executor1 = Executors.newSingleThreadExecutor();
        Runnable runnable = () -> {
            System.out.println("5.Hello world!");
        };
        executor1.execute(runnable);
        executor1.shutdown();

        //Thread using ScheduledExecutorService
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Runnable runnable1 = () ->{
            System.out.println("6.Hello world!");
        };
        scheduler.schedule(runnable1, 0, TimeUnit.SECONDS);
        scheduler.shutdown();

        //Thread using ForkJoinPool for Parallel Processing
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask task = new ForkJoinTask();
        forkJoinPool.invoke(task);
    }
}
