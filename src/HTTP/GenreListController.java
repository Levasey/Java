package HTTP;

import dto.Genres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class GenreListController {
    public static StringBuilder format() throws SQLException{
        Map<Integer, Genres> genresMap;
        try {
            String path = "./Task/files/task7361/chinook.db";
            Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);//Устанави подключение к файлу Базы Данных
            genresMap = dto.GenreDataAccess.getGenresData(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        StringBuilder str = new StringBuilder("<ol>\n");
        for (int i = 1; i < genresMap.size(); i++) {
            Genres text = genresMap.get(i);
            str.append("<li><a href=\"genre?genre_id=").append(i).append("\">").append(text.getName()).append("</li>\n");
        }
        str.append("</ol>\n");
        return str;
    }

}
