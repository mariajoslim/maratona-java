package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.server;

import java.util.concurrent.*;

public class StoreService {
    private static final ExecutorService ex = Executors.newCachedThreadPool();

    public double getPriceSync(String storename ){
        System.out.printf("Getting prices sync store%s%n",storename);
        return priceGenerator();
    }
    public Future<Double>getPriceAsyncFuture(String storeName){
        System.out.printf("Getting prices sync store%s%n",storeName);
       return ex.submit(this::priceGenerator);


    }

    public Future<Double>getPriceAsyncCompletableFuture(String storeName){
        System.out.printf("Getting prices sync store%s%n",storeName);
        return CompletableFuture.supplyAsync(this::priceGenerator);


    }

    private double priceGenerator(){
        System.out.printf("%s generating price %n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1,500)*10;
    }
public static  void shutdown(){
        ex.shutdown();

}
    private void delay()   {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
