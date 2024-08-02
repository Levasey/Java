package HTTP;

import dto.Albums;

import java.sql.*;
import java.util.Map;

import static dto.AlbumDataAccess.getAlbumsData;

public class AlbumsController {
    public static String format(Map<Integer, Albums> albumsMap){
        try {
            String path = "./Task/files/task7361/chinook.db";
            Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);//Устанави подключение к файлу Базы Данных
            albumsMap = getAlbumsData(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        StringBuilder str = new StringBuilder("<ol>\n");
        for (int i = 1; i < albumsMap.size(); i++) {
            Albums text = albumsMap.get(i);
            str.append("<li><a href=\"album").append(text.getAlbumId()).append("\"> ").append(text.getTitle()).append(" artist ").append(text.getArtistId()).append("</li>\n");
        }
        str.append("</ol>\n");
        return str.toString();
    }
}
