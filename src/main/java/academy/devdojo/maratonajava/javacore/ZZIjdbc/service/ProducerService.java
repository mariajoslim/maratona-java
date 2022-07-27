package academy.devdojo.maratonajava.javacore.ZZIjdbc.service;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.Producer_Repository;

import java.sql.SQLException;
import java.util.List;

public class ProducerService {
    public static void save(Producer producer) throws SQLException {
        Producer_Repository.save(producer);
    }

    public static void saveTransaction(List<Producer> producers) throws SQLException {
        Producer_Repository.saveTransaction(producers);
    }
        public static void delete(Integer id) throws SQLException {
        requireValidId(id);
        Producer_Repository.delete(id);
    }


    public static void update(Producer producer) throws SQLException {
        requireValidId(producer.getId());
        Producer_Repository.update(producer);
    } public static void updatePreparedStatement(Producer producer) throws SQLException {
        requireValidId(producer.getId());
        Producer_Repository.update(producer);
    }

    public static List<Producer> findAll() throws SQLException {
        return Producer_Repository.findAll();
    }
    public static List<Producer> findByName(String name) throws SQLException {
        return Producer_Repository.findByName(name);
    }
 public static List<Producer> findByNamePreparedStatement(String name) throws SQLException {
        return Producer_Repository.findByNamePreparedStatement(name);
    }

    public static List<Producer> findByNameCalableStatement(String name) throws SQLException {
        return Producer_Repository.findByNameCalableStatement(name);
    }

    public static void showProducerMetaData() {
        Producer_Repository.showProducerMetaData();
    }
    public static void showDriverMetaData() {
        Producer_Repository.showProducerMetaData();
    }
    public static void showTypeScrollWorking() {
        Producer_Repository.showTypeScrollWorking();
    }

    public static List<Producer> findByNameUpdatetoUperCase(String name) throws SQLException {
        return Producer_Repository.findByNameUpdatetoUperCase(name);
    }
    public static List<Producer> findByNameAndInsertWheNotFound(String name) throws SQLException {
        return Producer_Repository.findByNameAndInsertWheNotFound(name);
    }
    public static void findByNameAndDelete(String name) throws SQLException {
         Producer_Repository.findByNameAndDelete(name);
    }


    private static void requireValidId(Integer id){
        if(id ==null || id<=0){
            throw new IllegalArgumentException("Id invalido");
        }
    }
}