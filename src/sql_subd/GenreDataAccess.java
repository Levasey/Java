package sql_subd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class GenreDataAccess {
    public static Map<Integer, Genres> getGenres(Connection connection) throws SQLException{
        String selectGenres = "SELECT genreId, name FROM genres";
        PreparedStatement statementGenres;
        statementGenres = connection.prepareStatement(selectGenres);
        ResultSet resultGenres = statementGenres.executeQuery();
        Map<Integer, Genres> genresMap = new HashMap<>();
        while (resultGenres.next()){
            int id = resultGenres.getInt("genreId");
            String name = resultGenres.getString("name");
            Genres genres = new Genres(id, name);
            genresMap.put(id, genres);
        }
        return genresMap;
    }
}
