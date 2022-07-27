package academy.devdojo.maratonajava.javacore.ZZFtheads.test;

import academy.devdojo.maratonajava.javacore.ZZFtheads.dominio.Account;

public class ThreadAccountTest01 implements Runnable {

    private final Account account = new Account();
    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01,"HESTIA");
        Thread t2 = new Thread(threadAccountTest01,"bell cranel");
        t1.start();
        t2.start();





    }
    @Override
    public void run() {
        for(int i=0; i<5;i++){
            withdral(10);
            if(account.getBalance()<0){
                System.out.println("FODEO");
            }
        }

    }

    private  void  withdral(int amount)   {
        System.out.println(getName()+"Fora dp simcronize");
        synchronized (account) {
            System.out.println(getName()+"Dentro dp simcronize");
            if (account.getBalance() >= amount) {
                System.out.println(Thread.currentThread().getName() + "  esté indo sacar dinehro");
                account.withdrawl(amount);

                System.out.println(Thread.currentThread().getName() + "  completou o saque,valor atual da conta" + account.getBalance());

            } else {
                System.out.println("sem mooney " + Thread.currentThread().getName() + "efetuar o saque " + account.getBalance());
            }
        }

    }
    private String getName(){
        return Thread.currentThread().getName();
    }


}
