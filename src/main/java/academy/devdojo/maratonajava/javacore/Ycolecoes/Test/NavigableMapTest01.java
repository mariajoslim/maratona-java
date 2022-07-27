package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {


        NavigableMap<String,String> map = new TreeMap<>();
        map.put("A","Letra A");
        map.put("D","Letra D");
        map.put("B","Letra B");
        map.put("C","Letra C");
        map.put("E","Letra E");

        for(Map.Entry<String, String>entry: map.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
        //System.out.println(map.headMap("C").remove("A"));
        System.out.println(map.headMap("C",true));
        System.out.println(map.ceilingEntry("C"));
        System.out.println(map.ceilingEntry("B"));
        System.out.println(map.ceilingEntry("D"));
        System.out.println(map.higherKey("D"));
        System.out.println(map.higherKey("B"));
        System.out.println(map.higherKey("A"));
        System.out.println(map.lowerKey("C"));
        System.out.println(map.floorKey("A"));
        //System.out.println(map);
    }
}
