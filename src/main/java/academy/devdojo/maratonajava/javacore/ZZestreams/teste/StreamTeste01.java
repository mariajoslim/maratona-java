package academy.devdojo.maratonajava.javacore.ZZestreams.teste;

import academy.devdojo.maratonajava.javacore.ZZestreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//ordenar Litgh Novel por titulo
//retrieve  the first  3 litgh novel whith less then 4
public class StreamTeste01 {

    private static List<LightNovel>lightNovels = new ArrayList<>(List.of(
            new LightNovel("DNZ",10.2),
            new LightNovel("Cdz",18.2),
            new LightNovel("SAilor moom",3.2),
            new LightNovel("kim possible",13.45),
            new LightNovel("3 espias demais",4.2))
    );
    public static void main(String[] args) {
        lightNovels.sort((Comparator.comparing(LightNovel::getYiyle)));
        List<String>titles = new ArrayList<>();

        for(LightNovel lightNovel:lightNovels) {
            if (lightNovel.getPrice() <= 4) {
                titles.add(lightNovel.getYiyle());

            }
            if (titles.size() >= 3) {
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println(titles);



    }
}
