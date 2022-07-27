package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Quote;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.server.StoreServiceDeprecated;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.server.StoreServiceWithDiscount;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;


public class CompletableFutureTest004 {
    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount() ;
        searchPricesWithDiscountAsync(service);


    }

    private static void  searchPricesWithDiscountAsync( StoreServiceWithDiscount storeService) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store1","Store2", "Store3","Store4");
      //  stores.forEach(s-> System.out.println(storeService.getPriceSync(s)));
        stores.stream()
                .map(storeService::getPriceSync)
                .map(Quote::newQuote)
                .map(storeService::applyDiscount)
                .forEach(System.out::println);
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to serch pricesync %dm%n",(end-start));
    }
}