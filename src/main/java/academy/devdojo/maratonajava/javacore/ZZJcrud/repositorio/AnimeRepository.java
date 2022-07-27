package academy.devdojo.maratonajava.javacore.ZZJcrud.repositorio;


import academy.devdojo.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class AnimeRepository {
    public static List<Anime> findByName(String name) throws SQLException {
        log.info("Finfing all animes");

        String sql = "SELECT * FROM anime_store.Anime where animecol like ?;";
        List<Anime> animes = new ArrayList<>();

        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindByName(con, name);
             ResultSet rs = ps.executeQuery();) {

            while (rs.next()) {
                Producer = producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("nome"))
                Anime anime = Anime
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("nome"))
                        .episodes(rs.getInt("episodes"))
                        .producer(producer)
                        .build();
                animes.add(anime);

            }


        } catch (SQLException e) {
            log.error("Error while trying to find all'{}'", e);

        }
        return animes;

    }

    private static PreparedStatement createPreparedStatementFindByName(Connection connection, String name) throws SQLException {
        String sql = """
                SELECT a.id, a.name,a.episodes, a.producer_id, p.name as 'producer_name' FROM anime_store.anime a inner join
                anime_store.producer p on a.producer_id = p.id
                "where a.id = ? '%%';
                 """;
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, String.format("%%s%s%%s", name));
        return ps;

    }

    public static void delete(int id) throws SQLException {
        String sql = " DELETE FROM `anime_store`.`Anime` WHERE(`id`= '?') ;";
        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementDelete(con, id)) {
            ps.execute();
            log.info("dELET Anime in database, '{}';", id);

        } catch (SQLException e) {
            log.error("Error while trying to insert '{}'", id, e);
        }
    }

    private static PreparedStatement createPreparedStatementDelete(Connection connection, Integer id) throws SQLException {
        String sql = "DELETE  FROM anime_store.Anime where name like ?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;

    }


    public static void save(Anime anime) throws SQLException {
        log.info("Save Anime'{}', Anime");
        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement smt = createPrepareStstementSave(con, anime)) {

            smt.execute();
            log.info("Insert Anime in database, Database rows affect'{}';", anime.getId());
        } catch (SQLException e) {
            log.error("Error while trying to insert '{}'", anime.getId(), e);
        }

    }

    private static PreparedStatement createPrepareStstementSave(Connection connection, Anime anime) throws SQLException {
        String sql = " INSERT INTO `anime_store`.`Anime`(`animecol`.`episodes`,`producer_id`) VALUES (?,?,?);";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(3,anime.getEpisodes());
        ps.setInt(2, anime.getProducer().getId());
        return ps;

    }

    public static Optional<Anime> findById(Integer id) throws SQLException {
        log.info("Finfing all animes");
        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindById(con, id);
             ResultSet rs = ps.executeQuery();) {
            if (!(rs.next())) return Optional.empty();
            Producer = producer.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("nome"))
            Anime anime = Anime
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("nome"))
                    .episodes(rs.getInt("episodes"))
                    .producer(producer)
                    .build();

            return Optional.of(anime);

        } catch (SQLException e) {
            log.error("Error while trying to find all'{}'", e);

        }

        return Optional.empty();
    }

    private static PreparedStatement createPreparedStatementFindById(Connection connection, Integer id) throws SQLException {
        String sql = "\"\"\"\n" +
                "                SELECT a.id, a.name,a.episodes, a.producer_id, p.name as 'producer_name' FROM anime_store.anime a inner join\n" +
                "                anime_store.producer p on a.producer_id = p.id\n" +
                "                \"where name like ?;\n" +
                "                 \"\"\";;
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;

    }

    public static void update(Anime anime) throws SQLException {
        log.info("Updating Anime");
        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement smt = preparedStatementUpdate(con, Anime)) {

            smt.executeUpdate();
            log.info("UPDATE Anime in database, Database rows affect'{}';", anime.getId());
        } catch (SQLException e) {
            log.error("Error while trying to UPDTAE'{}'", anime.getId(), e);
        }
    }

    private static PreparedStatement preparedStatementUpdate(Connection connection, Anime anime) throws SQLException {
        String sql = " UPDATE FROM `anime_store`.anime` SET `animecol` = '?', `episodes` = ? WHERE(`id`= '?') ;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(1, anime.getEpisodes());
        ps.setInt(2, anime.getId());
        return ps;

    }

}
