package academy.devdojo.maratonajava.javacore.ZZDOptional.tes;

import academy.devdojo.maratonajava.javacore.ZZDOptional.dominio.Manga;
import academy.devdojo.maratonajava.javacore.ZZDOptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no Hero");
        mangaByTitle.ifPresent(m->m.setTitle("Boku no Hero 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);
        System.out.println( mangaById);

        Manga newManga = MangaRepository.findByTitle("Drifters ").orElseGet(()-> new Manga(5, "Drifters",25));
        System.out.println(newManga);
    }
}
