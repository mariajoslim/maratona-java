package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.server.StoreService;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.server.StoreServiceDeprecated;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;


public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeService = new StoreServiceDeprecated();
        searchPricesAsyncCompletableFuture(storeService);

    }

    private static void searchPricesAsyncCompletableFuture(StoreServiceDeprecated storeService) {
        long start = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(10,t->{// t é um runnable
            Thread thread = new Thread();
            thread.setDaemon(true);
            return thread;
        });
        List<String> stores = List.of("Store1","Store2", "Store3","Store4");
        List<CompletableFuture<Double>>completableFutures = stores.stream()
                .map(s->CompletableFuture.supplyAsync(()->storeService.getPriceSync(s),executor))
                .collect(Collectors.toList());
        List<Double>prices = completableFutures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

      System.out.println(prices);
        long end = System.currentTimeMillis();
        executor.shutdown();
        System.out.printf("Time passed to serachPriceSync%d%n", (end - start));
    }
}