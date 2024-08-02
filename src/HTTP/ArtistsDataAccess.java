package HTTP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class ArtistsDataAccess {
        public static Map<Integer, Artists> getArtist(Connection connection) throws SQLException {
        String selectArtists = "SELECT artistId, name FROM artists";
        PreparedStatement statementArtists;
        statementArtists = connection.prepareStatement(selectArtists);
        ResultSet resultArtists = statementArtists.executeQuery();
        Map<Integer, Artists> artistsMap = new HashMap<>();
        while (resultArtists.next()){
            int id = resultArtists.getInt("genreId");
            String name = resultArtists.getString("name");
            Artists artists = new Artists(id, name);
            artistsMap.put(id, artists);
        }
        return artistsMap;
    }
}
