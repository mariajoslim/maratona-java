package academy.devdojo.maratonajava.javacore.ZZJcrud.service;

import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repositorio.ProducerRepository;
import lombok.SneakyThrows;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void buildMenu(int op) throws SQLException {
        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
            default->
                throw new IllegalArgumentException("Not a valid option");
        }
    }

    @SneakyThrows
    private static void findByName() {
        System.out.println("Type the name or empty all");
        String name = SCANNER.nextLine();

        ProducerRepository.findByName(name)
                .forEach(p -> System.out.printf("[%d] - ID %s%n", p.getId(), p.getName()));
    }


    private static void delete() throws SQLException {

        System.out.println("Type one of the want2 to delete");
        findByName();
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure?");
        String choice = SCANNER.nextLine();
        if ("s".equalsIgnoreCase(choice)) {
            ProducerRepository.delete(id);
        }
    }

    private static void save() throws SQLException {

        System.out.println("Type the name of the producer");
        String name = SCANNER.nextLine();
        Producer producer = Producer.builder().name(name).build();
        ProducerRepository.save(producer);
    }

    public static void update() throws SQLException {
        System.out.println("Type the id of the object you want to update");
        Optional<Producer> producerOptional= ProducerRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if(producerOptional.isEmpty()){
            System.out.println("Producer not found");
            return;
        }
        Producer producerFromDb = producerOptional.get();
        System.out.println("Producer found");
        System.out.println("Type the nee name or enterto keep the save");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? producerFromDb.getName():name;
       Producer producerToUpdate =  Producer.builder()
                .id(producerFromDb.getId())
                .name(name)
                .build();
       ProducerRepository.update(producerToUpdate);
    }

}
