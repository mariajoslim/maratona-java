package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Maria José"));
        System.out.println(tq.offer("Maria José"));
        System.out.println(tq.offer("Maria José",10, TimeUnit.SECONDS));
        tq.put("DevDojo");
        tq.transfer("DevDojo");
        if(tq.hasWaitingConsumer()){
            tq.transfer("");
            tq.transfer("DEVDOJO");
        }
        System.out.println(tq.tryTransfer("Academy"));
        System.out.println(tq.tryTransfer("Academy",5,TimeUnit.SECONDS ));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());
    }
}
