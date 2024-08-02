package HTTP;

import dto.Artists;

import java.sql.*;
import java.util.Map;

import static dto.ArtistDataAccess.getArtistData;


public class ArtistListController {
    public static StringBuilder format() throws SQLException {
        Map<Integer, Artists> artistsMap;
        try {
            String path = "./Task/files/task7361/chinook.db";
            Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);//Устанави подключение к файлу Базы Данных
            artistsMap = getArtistData(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        StringBuilder str = new StringBuilder("<ol>\n");
        for (int i = 1; i < artistsMap.size(); i++) {
            Artists text = artistsMap.get(i);
            str.append("<li><a href=\"artist?artist_id=").append(i).append("\">").append(text.getName()).append("</li>\n");
        }
        str.append("</ol>\n");
        return str;
    }

    public static void main(String[] args) throws SQLException {
        StringBuilder str = format();
        System.out.println(str);
    }
}


