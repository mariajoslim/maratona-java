package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;

import java.sql.SQLException;
import java.util.List;

public class ConnectionTest02 {
    public static void main(String[] args) throws SQLException {
        Producer producer1 = Producer.builder().name("Toei Animation").build();
        Producer producer2 = Producer.builder().name("AIr Berttchrichers").build();
        Producer producer3 = Producer.builder().name("Álamo").build();
        ProducerService.saveTransaction(List.of(producer1,producer2,producer3));

    }
}
