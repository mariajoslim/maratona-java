package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTeste01 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc", "você2");
        System.out.println(map);
        for (String key : map.keySet()
        ) {
            System.out.println(key + " " + map.get(key));


        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        for (String value : map.values()) {
            System.out.println(value);
        }
        System.out.println("_________________________________________________________________________________________________________________________________________________________________________");
        for (Map.Entry<String, String> entry:map.entrySet()
             ) {
            System.out.println(entry.getKey()+"  +"+entry.getValue());
            
        }
    }
}
