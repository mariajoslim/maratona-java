package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.server.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTest01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        //searchPricesSync(storeService);
        searchPricesAsyncCompletableFuture(storeService);

    }
    private static void searchPricesSync(StoreService storeService){
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Store1"));
        System.out.println(storeService.getPriceSync("Store2"));
        System.out.println(storeService.getPriceSync("Store3"));
        System.out.println(storeService.getPriceSync("Store4"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to serachPriceSync%d%n",(end-start));

    }

    private static void searchPricesAsyncFuture(StoreService storeService){
        long start = System.currentTimeMillis();
      Future<Double> princeAsyncFuture1 =  storeService.getPriceAsyncFuture("Store1");
        Future<Double> princeAsyncFuture2   = storeService.getPriceAsyncFuture("Store2");
        Future<Double> princeAsyncFuture3  =storeService.getPriceAsyncFuture("Store3");
        Future<Double> princeAsyncFuture4 = storeService.getPriceAsyncFuture("Store4");
        try {
            System.out.println( princeAsyncFuture1.get());
            System.out.println( princeAsyncFuture2.get());
            System.out.println(princeAsyncFuture3.get());
            System.out.println(princeAsyncFuture4.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to serachPriceSync%d%n",(end-start));
        StoreService.shutdown();
    }

    private static void searchPricesAsyncCompletableFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        CompletableFuture<Double> princeAsyncFuture1 = (CompletableFuture<Double>) storeService.getPriceAsyncCompletableFuture("Store1");
        CompletableFuture<Double> princeAsyncFuture2   = (CompletableFuture<Double>) storeService.getPriceAsyncCompletableFuture("Store2");
        CompletableFuture<Double> princeAsyncFuture3  = (CompletableFuture<Double>) storeService.getPriceAsyncCompletableFuture("Store3");
        CompletableFuture<Double> princeAsyncFuture4 = (CompletableFuture<Double>) storeService.getPriceAsyncCompletableFuture("Store4");
            System.out.println(princeAsyncFuture1.join());
            System.out.println(princeAsyncFuture2.join());
            System.out.println(princeAsyncFuture3.join());
            System.out.println(princeAsyncFuture4.join());






        long end = System.currentTimeMillis();
        System.out.printf("Time passed to serachPriceSync%d%n",(end-start));
    }}



