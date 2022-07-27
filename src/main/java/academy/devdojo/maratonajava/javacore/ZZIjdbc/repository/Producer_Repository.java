package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.UIManager.getInt;

@Log4j2

public class Producer_Repository {
    public static void save(Producer producer) throws SQLException {
        String sql = " INSERT INTO `anime_store`.`producer`(`producercol`) VALUES ('%s');".format(producer.getName());
        try (Connection con = ConnectionFactory.getConnection();
             Statement smt = con.createStatement()) {

            int rowsAffected = smt.executeUpdate(sql);
            log.info("Insert producer in database, Database rows affect'{}';", producer.getName(), rowsAffected);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert '{}'", producer.getName(), e);
        }

    }

        public static void saveTransaction(List<Producer> producers) throws SQLException {
        try (Connection con = ConnectionFactory.getConnection()){;
            con.setAutoCommit(false);
             preparedStatementSaveTransaction(con, producers);
             con.commit();
             con.setAutoCommit(true);

        } catch(SQLException e)

    {
        log.error("Error while trying to save'{}'", producers, e);
    }

}

    private static void preparedStatementSaveTransaction(Connection connection, List<Producer> producers) throws SQLException {
        String sql = " INSERT INTO `anime_store`.`producer` (`producercol`) VALUES(?) ;";
        boolean shoudRollback = false;
        for (Producer p : producers) {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                log.info("Saving producer'{}'", p.getName());
                ps.setString(1, p.getName());
                //if(p.getName().equals("Toei Animation")) throw new SQLException("Can't save toei animation" );pra causar o rollback bd

                ps.execute();
            } catch (SQLException e) {
                e.printStackTrace();
                shoudRollback = true;
            }

        }
        if(shoudRollback) {
            log.warn("Transaction is going be rollback");
            connection.rollback();
        }

    }

    public static void delete(int id) throws SQLException {
        String sql = " DELETE FROM `anime_store`.`producer` WHERE(`id`= '%d') ;".format(String.valueOf(id));
        try (Connection con = ConnectionFactory.getConnection();
             Statement smt = con.createStatement()) {

            int rowsAffected = smt.executeUpdate(sql);
            log.info("dELET producer in database, Database rows affect'{}';", id, rowsAffected);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert '{}'", id, e);
        }
    }

    public static void update(Producer producer) throws SQLException {
        String sql = " UPDATE FROM `anime_store`.`producer` SET `producercol` = '%s' WHERE(`id`= '%d') ;".format(producer.getName(), producer.getId());
        try (Connection con = ConnectionFactory.getConnection();
             Statement smt = con.createStatement()) {

            int rowsAffected = smt.executeUpdate(sql);
            log.info("UPDATE producer in database, Database rows affect'{}';", producer.getId(), rowsAffected);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to UPDTAE'{}'", producer.getId(), e);
        }
    }

    public static void updatePreparedStatement(Producer producer) throws SQLException {
        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement smt = preparedStatementFindByUpdate(con, producer)) {

            int rowsAffected = smt.executeUpdate();
            log.info("UPDATE producer in database, Database rows affect'{}';", producer.getId(), rowsAffected);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to UPDTAE'{}'", producer.getId(), e);
        }
    }

    private static PreparedStatement preparedStatementFindByUpdate(Connection connection, Producer producer) throws SQLException {
        String sql = " UPDATE FROM `anime_store`.`producer` SET `producercol` = '?' WHERE(`id`= '?') ;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;

    }

    public static List<Producer> findAll() throws SQLException {
        log.info("Finfing all Producers");
        return findByName("");

        //   String sql = "SELECT id, producercol FROM anime_store.producer";
        // List<Producer> producers = new ArrayList<>();

        //try (Connection con = ConnectionFactory.getConnection();
        //   Statement smt = con.createStatement();
        // ResultSet rs = smt.executeQuery(sql)) {

//            while (rs.next()) {
        //              Producer producer = Producer.builder().id(rs.getInt("id")).name(rs.getString("nome")).build();
        ///            producers.add(producer);

        //     }


        //} catch (SQLException e) {
        //  log.error("Error while trying to find all'{}'", e);

        //}
        //return producers;

    }

    public static List<Producer> findByName(String name) throws SQLException {
        log.info("Finfing all Producers");

        String sql = "SELECT * FROM anime_store.producer where producercol like '%%%s%%';".format(name);
        List<Producer> producers = new ArrayList<>();

        try (Connection con = ConnectionFactory.getConnection();
             Statement smt = con.createStatement();
             ResultSet rs = smt.executeQuery(sql)) {

            while (rs.next()) {
                Producer producer = Producer.builder().id(rs.getInt("id")).name(rs.getString("nome")).build();
                producers.add(producer);

            }


        } catch (SQLException e) {
            log.error("Error while trying to find all'{}'", e);

        }
        return producers;

    }

    public static List<Producer> findByNamePreparedStatement(String name) throws SQLException {
        log.info("Finfing all Producers");

        String sql = "SELECT * FROM anime_store.producer where producercol like ?;";
        List<Producer> producers = new ArrayList<>();

        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementFindByName(con, name);
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

    public static List<Producer> findByNameCalableStatement(String name) throws SQLException {
        log.info("Finfing all Producers");

        String sql = "SELECT * FROM anime_store.producer where producercol like ?;";
        List<Producer> producers = new ArrayList<>();

        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = calableStatementFindByName(con, name);
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

    private static CallableStatement calableStatementFindByName(Connection connection, String name) throws SQLException {
        String sql = "CALL `anime_store`.`sp_get_producer_by_name`(?);";

        CallableStatement ps = connection.prepareCall(sql);
        ps.setString(1, String.format("%%s%s%%s", name));
        return ps;

    }

    private static PreparedStatement preparedStatementFindByName(Connection connection, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, String.format("%%s%s%%s", name));
        return ps;

    }

    public static void showProducerMetaData() {
        log.info("Showing producer metadata");

        String sql = "SELECT * FROM anime_store.producer where producercol like '%%%s%%';";


        try (Connection con = ConnectionFactory.getConnection();
             Statement smt = con.createStatement();
             ResultSet rs = smt.executeQuery(sql)) {
            ResultSetMetaData rsMetaData = rs.getMetaData();
            rs.next();
            int columnCount = rsMetaData.getColumnCount();
            log.info("Columns count '{}'", columnCount);
            for (int i = 0; i <= columnCount; i++) {
                log.info("Table name'{}'", rsMetaData.getTableName(i));
                log.info("Column'{}'", rsMetaData.getColumnName(i));
                log.info("Column size'{}'", rsMetaData.getColumnDisplaySize(i));
                log.info("Column type'{}'", rsMetaData.getColumnTypeName(i));
            }


        } catch (SQLException e) {
            log.error("Error while trying to find all'{}'", e);

        }

    }

    public static void showDriverMetaData() throws SQLException {
        log.info("Showing producer  driver metadata");

        String sql = "SELECT * FROM anime_store.producer where producercol like '%%%s%%';";


        try (Connection con = ConnectionFactory.getConnection()) {

            DatabaseMetaData dbMetadata = con.getMetaData();
            if (dbMetadata.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Supports TYPE_FOWARD_ONLY");
                if (dbMetadata.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info(" AND Supports CONCUR UPDATE");

                }
            }


            if (dbMetadata.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if (dbMetadata.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info(" AND Supports CONCUR UPDATE");

                }
            }

            if (dbMetadata.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                log.info("Supports TYPE_SCROLL_SENSITIVE");
                if (dbMetadata.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info(" AND Supports CONCUR UPDATE");

                }
            }


        } catch (SQLException e) {
            log.error("Error while trying to find all'", e);

        }
    }

    public static void showTypeScrollWorking() {
        String sql = "SELECT * FROM anime_store.producer;";

        try (Connection con = ConnectionFactory.getConnection();
             Statement smt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = smt.executeQuery(sql)) {

            log.info("LAst row '{}'", rs.last());
            log.info("row  number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("nome")).build());

            log.info("First row '{}'", rs.first());
            log.info("row  number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("nome")).build());

            log.info("row absolute   '{}'", rs.absolute(2));
            log.info("row  number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("nome")).build());

            log.info(" row Relative  '{}'", rs.relative(-1));
            log.info("row  number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("nome")).build());

            log.info("is last", rs.isLast());
            log.info("row  number '{}'", rs.getRow());

            log.info("is firt row '{}'", rs.isFirst());
            log.info("row  number '{}'", rs.getRow());

            log.info("LAst row '{}'", rs.last());
            log.info("_______________________________________________________");
            log.info("Next row '{}'", rs.next());
            log.info("After row '{}'", rs.isAfterLast());
            while (rs.previous()) {
                log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("nome")).build());
            }


        } catch (SQLException e) {
            log.error("Error while trying to find all'{}'", e);

        }

    }

    public static List<Producer> findByNameUpdatetoUperCase(String name) throws SQLException {
        log.info("Finfing all Producers");

        String sql = "SELECT * FROM anime_store.producer where producercol like '%%%s%%';".format(name);
        List<Producer> producers = new ArrayList<>();

        try (Connection con = ConnectionFactory.getConnection();
             Statement smt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = smt.executeQuery(sql)) {

            while (rs.next()) {
                rs.updateString("procedurecol", rs.getString("procedurecol").toUpperCase());
                //rs.cancelRowUpdates();

                rs.updateRow();
                Producer producer = Producer.builder().id(rs.getInt("id")).name(rs.getString("procedurecol")).build();
                producers.add(producer);

            }


        } catch (SQLException e) {
            log.error("Error while trying to find all'{}'", e);

        }
        return producers;

    }

    public static List<Producer> findByNameAndInsertWheNotFound(String name) throws SQLException {
        log.info("Finfing all Producers");

        String sql = "SELECT * FROM anime_store.producer where producercol like '%%%s%%';".format(name);
        List<Producer> producers = new ArrayList<>();

        try (Connection con = ConnectionFactory.getConnection();
             Statement smt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = smt.executeQuery(sql)) {
            if (rs.next()) return producers;
            insertNewProducer(name, rs);
            producers.add(getProducer(rs));
            rs.deleteRow();

        }

        return producers;
    }

    public static void findByNameAndDelete(String name) throws SQLException {
        log.info("Finfing all Producers");

        String sql = "SELECT * FROM anime_store.producer where producercol like '%%%s%%';".format(name);
        List<Producer> producers = new ArrayList<>();

        try (Connection con = ConnectionFactory.getConnection();
             Statement smt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = smt.executeQuery(sql)) {

            while (rs.next()) {
                log.info("Deleting'{}'", rs.getString("procedurecol"));
                rs.deleteRow();
            }

        } catch (SQLException e) {
            log.error("Error while triyng to producrs", e);
        }
    }

    private static void insertNewProducer(String name, ResultSet rs) throws SQLException {
        rs.moveToInsertRow();
        rs.updateString("procedurecol", name);
        rs.insertRow();
    }

    private static Producer getProducer(ResultSet rs) throws SQLException {
        rs.beforeFirst();
        rs.next();
        Producer producer = Producer
                .builder()
                .id(rs.getInt("id"))
                .name(rs.getString("procedurecol"))
                .build();
        return producer;
    }
}
