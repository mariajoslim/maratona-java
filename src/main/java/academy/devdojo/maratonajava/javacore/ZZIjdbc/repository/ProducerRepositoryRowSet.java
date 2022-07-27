package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.listener.CustomRowSetListener;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ProducerRepositoryRowSet {
    public static List<Producer> findByNameJdbcRowSet(String name) {
        String sql = "SELET FROM anime_store.producer where producercol like ?;";
        List<Producer>producers = new ArrayList<>();
        try(JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setString(1,String.format("%%%s%%", name));
            jrs.execute();
            while(jrs.next()){
                Producer producer = Producer.builder()
                        .id(jrs.getInt("id"))
                        .name(jrs.getString("producercol"))
                        .build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
return producers;
 }public static void updateJdbcRowSet(Producer producer) {
        String sql = "SELET FROM anime_store.producer where producercol like ?;";

        try(JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){
            jrs.addRowSetListener(new CustomRowSetListener());

            jrs.setCommand(sql);
            jrs.setString(1,producer.getName());
            jrs.setInt(2,producer.getId());
            jrs.execute();
            if(!jrs.next()) return;
            jrs.updateString("producercol", producer.getName());
            jrs.updateRow();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 public static void updateCachedRowSet(Producer producer) {
        String sql = "SELET FROM producer where like ?;";

        try(CachedRowSet cachedRowSet = ConnectionFactory.getCachedRowSet();
        Connection conn = ConnectionFactory.getConnection()){
            conn.setAutoCommit(false );
            cachedRowSet.addRowSetListener(new CustomRowSetListener());

            cachedRowSet.setCommand(sql);
            cachedRowSet.setString(1,producer.getName());
            cachedRowSet.setInt(2,producer.getId());
            cachedRowSet.execute(conn);
            if(!cachedRowSet.next()) return;
            cachedRowSet.updateString("producercol", producer.getName());
            cachedRowSet.updateRow();
            TimeUnit.SECONDS.sleep(10);
            cachedRowSet.acceptChanges();


        } catch (SQLException  | InterruptedException e) {
            e.printStackTrace();
        }
    }
 }
 /*public static void updateJdbcRowSet(Producer producer) {
        String sql = "UPDATE `anime_store`.`producer` SET `producercol` = ? WHERE(`id` = ?);";

        try(JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){
            jrs.setCommand(sql);
            jrs.setString(1,producer.getName());
            jrs.setInt(2,producer.getId());
            jrs.execute();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}*/
