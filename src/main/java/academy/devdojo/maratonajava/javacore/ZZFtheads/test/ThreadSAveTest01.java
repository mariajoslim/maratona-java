package academy.devdojo.maratonajava.javacore.ZZFtheads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeNames{
    private final List<String> names = new ArrayList();
    public synchronized void add(String name){
        names.add(name);
    }
    public synchronized void removeFirst(){
        if(names.size()>0){
            System.out.println(names.remove(0));
        }

    }
}

public class ThreadSAveTest01 {
    public static void main(String[] args) {
        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("junkrat");
        Runnable r = threadSafeNames::removeFirst;
        new Thread(r).start();
        new Thread(r).start();
    }
}
