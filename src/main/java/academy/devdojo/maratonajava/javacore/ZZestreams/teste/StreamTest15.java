package academy.devdojo.maratonajava.javacore.ZZestreams.teste;

import academy.devdojo.maratonajava.javacore.ZZestreams.dominio.Categoria;
import academy.devdojo.maratonajava.javacore.ZZestreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZestreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static academy.devdojo.maratonajava.javacore.ZZestreams.dominio.Categoria.DRAMA;
import static java.util.stream.Collectors.*;

public class StreamTest15 {

        private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
                new LightNovel("DNZ",10.2, DRAMA),
                new LightNovel("Cdz",18.2,Categoria.FANTASY),
                new LightNovel("SAilor moom",3.2,Categoria.ROMANCE),
                new LightNovel("kim possible",13.45,Categoria.FANTASY),
                new LightNovel("3 espias demais",4.2, DRAMA))
        );
    public static void main(String[] args) {
  Map<Categoria,DoubleSummaryStatistics> colect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategoria,summarizingDouble(LightNovel::getPrice)));
        System.out.println(colect);
       // Map<Categoria,Map<Promotion,List<LightNovel>>> colect1= lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategoria,groupingBy(StreamTest15::getPromotion)));
        //Map<Categoria,List<Promotion>> colect1= lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategoria,mapping (StreamTest15::getPromotion,toList())));
        Map<Categoria,Set<Promotion>> colect1= lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategoria,mapping (StreamTest15::getPromotion,toSet())));
        Map<Categoria, LinkedList<Promotion>> collect2 = lightNovels.stream().collect(groupingBy(LightNovel::getCategoria, mapping(StreamTest15::getPromotion, toCollection(LinkedList::new))));


        System.out.println(collect2);
    }
    private static Promotion getPromotion(LightNovel ln){return ln.getPrice()<6? Promotion.UNDER_PROMOTION:Promotion.NORMAL_PRICE;

    }}

