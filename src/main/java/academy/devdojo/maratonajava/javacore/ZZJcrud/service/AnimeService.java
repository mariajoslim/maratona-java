package academy.devdojo.maratonajava.javacore.ZZJcrud.service;

import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repositorio.AnimeRepository;
import lombok.SneakyThrows;

import java.sql.SQLException;
import java.util.Optional;
import java.util.Scanner;

public class AnimeService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void buildMenu(int op) throws SQLException {
        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
           // default->
              //  throw new IllegalArgumentException("Not a valid option");
        }
    }

    @SneakyThrows
    private static void findByName() {
        System.out.println("Type the name or empty all");
        String name = SCANNER.nextLine();

        AnimeRepository.findByName(name)
                .forEach(p -> System.out.printf("[%d] - ID %s %d %s%n", p.getId(), p.getName(), p.getEpisodes(),p.getProducer().getName());
    }


    private static void delete() throws SQLException {

        System.out.println("Type one of the want2 to delete");
        findByName();
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure?");
        String choice = SCANNER.nextLine();
        if ("s".equalsIgnoreCase(choice)) {
            AnimeRepository.delete(id);
        }
    }

    private static void save() throws SQLException {

        System.out.println("Type the name of the anime");
        String name = SCANNER.nextLine();
        System.out.println("Type the espisodes of the anime");
        Integer episodes = SCANNER.nextLine();
        System.out.println("Type the id of the anime");
        Integer id = SCANNER.nextLine();

        Anime anime = Anime
                .builder()
               .name(name)
                .producer(Producer.builder().id(producerId).build())
                .build();
            AnimeRepository.save(anime);
    }

    public static void update() throws SQLException {
        System.out.println("Type the id of the object you want to update");
        Optional<Anime> animeOptional= AnimeRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if(animeOptional.isEmpty()){
            System.out.println("Anime not found");
            return;
        }
        Anime animeFromDb = animeOptional.get();
        System.out.println("Anime found");
        System.out.println("Type the nee name or enterto keep the save");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? animeFromDb.getName():name;

        Anime animeFromDb = animeOptional.get();
        System.out.println("Anime found");
        System.out.println("Type the nee name or enterto keep the save");
        int episodes name = Integer.parseInt(SCANNER.nextLine());

       Anime animeToUpdate =  Anime.builder()
                .id(animeFromDb.getId())
                .name(name)
               .episodes(episodes)
               .producer(anime.FromDb.getProducer())
                .build();
       AnimeRepository.update(animeToUpdate);
    }

}
