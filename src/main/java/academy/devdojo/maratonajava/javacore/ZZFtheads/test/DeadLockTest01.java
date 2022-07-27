package academy.devdojo.maratonajava.javacore.ZZFtheads.test;

public class DeadLockTest01 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();
        Runnable r1 =() ->{
            synchronized(lock1){
                System.out.println("Thread1 : Segurando lock1");
                System.out.println("Thread1 : Segurando lock2");
                synchronized (lock2){
                    System.out.println("Thread 1: Segurando lock 2");

                }
            }

        };
        Runnable r2 =() ->{
            synchronized(lock2){
                System.out.println("Thread2 : Segurando lock2");
                System.out.println("Thread2 : Segurando lock1");
                synchronized (lock1){
                    System.out.println("Thread 2: Segurando lock 1");

                }
            }

        };
        new Thread(r1).start();
        new Thread(r2).start();

    }
}
