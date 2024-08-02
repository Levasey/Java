package sql_subd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class AlbumDataAccess {
    public static Map<Integer, Albums> getAlbums(Connection connection) throws SQLException {
            String selectAlbums = "select albumId, Title, artistId from albums";
            PreparedStatement statementAlbums = connection.prepareStatement(selectAlbums);
            ResultSet resultAlbums = statementAlbums.executeQuery();
            Map<Integer, Albums> albumIdToNameMap = new HashMap<>();
            while(resultAlbums.next()) {
                int id = resultAlbums.getInt("albumId");
                String title = resultAlbums.getString("Title");
                int artistId = resultAlbums.getInt("artistId");
                Albums a = new Albums(id, title, artistId);
                albumIdToNameMap.put(id, a);
            }
            return albumIdToNameMap;
        }
}
