package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.server.StoreService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import java.util.concurrent.Future;
import java.util.stream.Collectors;


public class CompletableFutureTest02 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPricesAsyncCompletableFuture(storeService);

    }

    private static void searchPricesAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store1","Store2", "Store3","Store4");
        List<CompletableFuture<Double>> completableFuture = new ArrayList<>();
        for (String store : stores) {
            Future<Double> priceAsyncCompletableFuture = storeService.getPriceAsyncCompletableFuture(store);
   //      completableFuture.add(priceAsyncCompletableFuture);
        }
       List <Double>prices =  completableFuture.stream().map(CompletableFuture::join).collect(Collectors.toList());



      //  System.out.println(prices);
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to serachPriceSync%d%n", (end - start));
    }
}