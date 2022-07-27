package academy.devdojo.maratonajava.javacore.ZZFtheads.test;

class ThreadExample extends Thread {
    private final char c;

    public ThreadExample(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.print(Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}
class ThreadExampleRunnable implements Runnable{
    private final char c;

    public ThreadExampleRunnable(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.print(Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
            try {
                Thread.sleep(2000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



//tipos de thread daemon x usera
public class ThreadTest01 {
    public static void main(String[] args) {
     //   ThreadExample t1 = new ThreadExample('A');
    //    ThreadExample t2 = new ThreadExample('B');
     //   ThreadExample t3 = new ThreadExample('C');
    //    ThreadExample t4 = new ThreadExample('D');

        Thread t1 = new Thread(new ThreadExampleRunnable('A'),"T1b");
        Thread t2 = new Thread(new ThreadExampleRunnable('M'),"T2B");
        Thread t3 = new Thread(new ThreadExampleRunnable('I'),"T3B");
        Thread t4 = new Thread(new ThreadExampleRunnable('O'),"T4B");

        Thread t5 = new Thread(new ThreadExample('R'),"T1A");
        Thread t6 = new Thread(new ThreadExample('N'),"T12A");
        Thread t7 = new Thread(new ThreadExample('E'),"T3A");
        Thread t8 = new Thread(new ThreadExample('T'),"T14A");

        //  t2.run();
        // t3.run();
        //t4.run();
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();


    }
}
