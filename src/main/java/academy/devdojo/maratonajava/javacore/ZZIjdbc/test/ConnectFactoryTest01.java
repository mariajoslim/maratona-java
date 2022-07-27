package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;
@Log4j2
public class ConnectFactoryTest01 {
    public static void main(String[] args) {

        Producer producerToUpdate = Producer.builder().id(1).name("SailoeMoon").build();
        ProducerServiceRowSet.updateJdbcRowSet(producerToUpdate);
        log.info("______________________________________________________");
        ProducerServiceRowSet.updateCachedRowSet(producerToUpdate);


        //  List<Producer> producers = ProducerServiceRowSet.findByNameJdbcRowSet("NHK");
        //log.info(producers);

    }
}
