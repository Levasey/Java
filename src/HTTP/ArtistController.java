package HTTP;

import dto.Albums;
import dto.Artists;

import java.sql.*;
import java.util.Map;

import static dto.AlbumDataAccess.getAlbumsData;
import static dto.ArtistDataAccess.getArtistData;

public class ArtistController {
    public static StringBuilder format(Integer artistId) throws SQLException {
        Map<Integer, Artists> artistIdToNameMap;
        Map<Integer, Albums> albumIdToMap;
        try {
            String path = "./Task/files/task7361/chinook.db";
            Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);//Устанави подключение к файлу Базы Данных
            artistIdToNameMap = getArtistData(connection);
            albumIdToMap = getAlbumsData(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Artists artists = artistIdToNameMap.get(artistId);
        StringBuilder str = new StringBuilder();
        str.append("Альбомы группы ").append(artists.getName()).append("\n");
        str.append("<ol>");
        for (int i = 1; i < albumIdToMap.size(); i++) {
            Albums albums1 = albumIdToMap.get(i);
            if (albums1.getArtistId() == artistId){
                str.append("<li> <a href=\"album?album_id=").append(albums1.getAlbumId()).append("\"> ").append(albums1.getTitle()).append("</li>\n");
            }
        }
        str.append("</ol>");
        return str;
    }
}
