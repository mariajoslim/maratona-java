package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Quote;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.server.StoreServiceWithDiscount;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest06 {


    private static CompletableFuture<?> completableFutures;

    public static void main(String[] args) {
            StoreServiceWithDiscount service = new StoreServiceWithDiscount() ;
            searchPricesWithDiscountAsync(service);


        }

        private static void  searchPricesWithDiscountAsync( StoreServiceWithDiscount service) {
            long start = System.currentTimeMillis();
            List<String> stores = List.of("Store1","Store2", "Store3","Store4");
            stores.stream()
            //  stores.forEach(s-> System.out.println(storeService.getPriceSync(s)));

                    .map(s-> CompletableFuture.supplyAsync(()->service.getPriceSync(s)))
                    .map(cf->cf.thenApply(Quote::newQuote))
                    .map(cf->cf.thenCompose(quote->CompletableFuture.supplyAsync(()->service.applyDiscount(quote))))
                    .map(cf->cf.thenAccept(store-> System.out.printf("%s finished im %d%n", store,(System.currentTimeMillis()-start))))
                    .toArray(CompletableFuture[]::new);
           // CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(completableFutures);
            CompletableFuture<Object> voidCompletableFuture = CompletableFuture.anyOf(completableFutures);
            voidCompletableFuture.join();
            System.out.printf("Finished?%",voidCompletableFuture.isDone());


            long end = System.currentTimeMillis();


            System.out.printf("Time passed to serch pricesync %dm%n",(end-start));
        }



}
