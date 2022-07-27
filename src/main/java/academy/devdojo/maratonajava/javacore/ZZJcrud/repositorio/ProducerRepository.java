package academy.devdojo.maratonajava.javacore.ZZJcrud.repositorio;


import academy.devdojo.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class ProducerRepository {
    public static List<Producer> findByName(String name) throws SQLException {
        log.info("Finfing all Producers");

        String sql = "SELECT * FROM anime_store.producer where producercol like ?;";
        List<Producer> producers = new ArrayList<>();

        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindByName(con, name);
             ResultSet rs = ps.executeQuery();) {

            while (rs.next()) {
                Producer producer = Producer.builder().id(rs.getInt("id")).name(rs.getString("nome")).build();
                producers.add(producer);

            }


        } catch (SQLException e) {
            log.error("Error while trying to find all'{}'", e);

        }
        return producers;

    }

    private static PreparedStatement createPreparedStatementFindByName(Connection connection, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, String.format("%%s%s%%s", name));
        return ps;

    }

    public static void delete(int id) throws SQLException {
        String sql = " DELETE FROM `anime_store`.`producer` WHERE(`id`= '?') ;";
        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementDelete(con, id)) {
            ps.execute();
            log.info("dELET producer in database, '{}';", id);

        } catch (SQLException e) {
            log.error("Error while trying to insert '{}'", id, e);
        }
    }
    private static PreparedStatement createPreparedStatementDelete(Connection connection, Integer id) throws SQLException {
        String sql = "DELETE  FROM anime_store.producer where name like ?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1,  id) ;
        return ps;

    }


    public static void save(Producer producer) throws SQLException {
        log.info("Save producer'{}', producer");
        try (Connection con = academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory.getConnection();
             PreparedStatement smt = createPrepareStstementSave(con,producer)) {

            smt.execute();
            log.info("Insert producer in database, Database rows affect'{}';", producer.getId());
        } catch (SQLException e) {
            log.error("Error while trying to insert '{}'", producer.getId(), e);
        }

    }

    private static PreparedStatement createPrepareStstementSave(Connection connection, Producer producer) throws SQLException {
        String sql = " INSERT INTO `anime_store`.`producer`(`producercol`) VALUES (?);";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;

    }

    public static Optional<Producer> findById(Integer id) throws SQLException {
        log.info("Finfing all Producers");

        String sql = "SELECT * FROM anime_store.producer where producercol like ?;";
        List<Producer> producers = new ArrayList<>();

        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindById(con, id);
             ResultSet rs = ps.executeQuery();) {
            if(!(rs.next())) return Optional.empty();
             return Optional.of(Producer
                     .builder()
                     .id(rs.getInt("id")).
                     name(rs.getString("nome")).
                     build());

        } catch (SQLException e) {
            log.error("Error while trying to find all'{}'", e);

        }

return Optional.empty();
    }

    private static PreparedStatement createPreparedStatementFindById(Connection connection, Integer id) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where id = ?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1,id);
        return ps;

    }

    public static void update(Producer producer) throws SQLException {
        log.info("Updating producer");
        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement smt = preparedStatementUpdate(con, producer)) {

            smt.executeUpdate();
            log.info("UPDATE producer in database, Database rows affect'{}';", producer.getId());
        } catch (SQLException e) {
            log.error("Error while trying to UPDTAE'{}'", producer.getId(), e);
        }
    }

    private static PreparedStatement preparedStatementUpdate(Connection connection,Producer producer) throws SQLException {
        String sql = " UPDATE FROM `anime_store`.`producer` SET `producercol` = '?' WHERE(`id`= '?') ;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;

    }

}
