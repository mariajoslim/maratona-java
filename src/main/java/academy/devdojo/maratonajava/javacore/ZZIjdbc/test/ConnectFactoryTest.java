package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.Producer_Repository;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.sql.SQLException;
import java.util.List;

@Log4j2

public class ConnectFactoryTest {
    public static void main(String[] args) throws SQLException {
      Producer producer = Producer.builder().name("CDZ").build();
      Producer producerToUpdate = Producer.builder().id(1).name("CDZ").build();
      //ProducerService.save(producer);
      //  ProducerService.delete(2);
      //  ProducerService.update(producerToUpdate);
     //   ProducerService.updatePreparedStatement(producerToUpdate);
       // List<Producer> producers = ProducerService.findAll();
        //List<Producer> producers = ProducerService.findByName("Mad");
     //   log.info("Producers found '{}'", producers);
       // ProducerService.showProducerMetaData();
        //ProducerService.showDriverMetaData ();
       // ProducerService.showTypeScrollWorking ();
       //List<Producer>producers= ProducerService.findByNameUpdatetoUperCase ("CDZ");
     //   log.info("Producers found '{}'", producers);
   // List<Producer>producers= ProducerService.findByNameAndInsertWheNotFound ("1-CDZ");
  //      ProducerService.findByNameAndDelete ("1-CDZ");
      // log.info("Producers found '{}'", producers);
//List <Producer> producers =  ProducerService.findByNamePreparedStatement ("B or X'='X");
  //    log.info("Producers found '{}'", producers);

        List <Producer> producers =  ProducerService.findByNameCalableStatement ("Mad House");
  log.info("Producers found '{}'", producers);





        //  log.info("info");
      //  log.debug("debug");
      //  log.warn("warn");
      //  log.error("error");
      //  log.trace("trace");

    }
}
