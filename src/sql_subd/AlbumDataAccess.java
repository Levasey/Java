package sql_subd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class AlbumDataAccess {
    public static Map<String, Albums> getAlbums(Connection connection) throws SQLException {
            String selectAlbums = "select albumId, Title, artistId from albums";
            PreparedStatement statementAlbums = connection.prepareStatement(selectAlbums);
            ResultSet resultAlbums = statementAlbums.executeQuery();
            Map<String, Albums> albumIdToNameMap = new HashMap<>();
            while(resultAlbums.next()) {
                String id = resultAlbums.getString("albumId");
                String title = resultAlbums.getString("Title");
                String artistId = resultAlbums.getString("artistId");
                Albums a = new Albums(id, title, artistId);
                albumIdToNameMap.put(id, a);
            }
            return albumIdToNameMap;
        }
}
