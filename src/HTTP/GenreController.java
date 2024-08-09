package HTTP;

import dto.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import static dto.AlbumDataAccess.getAlbumsData;
import static dto.ArtistDataAccess.getArtistData;

public class GenreController {
    public static StringBuilder format(Integer genreId) throws SQLException {
        Map<Integer, Genres> genresMap;
        ArrayList<Artists> artistsArrayList;
        try {
            String path = "./Task/files/task7361/chinook.db";
            Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);//Устанави подключение к файлу Базы Данных
            genresMap = GenreDataAccess.getGenresData(connection);
            artistsArrayList = dto.GenreToArtistAccess.getArtistData(connection, genreId);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        Genres genres = genresMap.get(genreId);
        StringBuilder str = new StringBuilder();
        str.append("Артисты/Группы исполняющие в стиле ").append(genres.getName()).append("\n");
        str.append("<ol>");

        for (int k = 1; k < artistsArrayList.size(); k++) {
            Artists artists = artistsArrayList.get(k);
            str.append("<li> <a href=\"artist?artist_id=").append(artists.getArtistId()).append("\"> ").append(artists.getName()).append("</li>\n");
        }
        str.append("</ol>");
        return str;
    }
}