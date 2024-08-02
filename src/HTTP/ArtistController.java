package HTTP;

import java.sql.*;
import java.util.ArrayList;

public class ArtistController {
    public static StringBuilder getArtist(String artistId) throws SQLException {
        ArrayList<Artists> a = new ArrayList<>();
        try {
            String path = "./Task/files/task7361/chinook.db";
            Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);//Устанави подключение к файлу Базы Данных
            String sql = "SELECT ArtistId, Name  FROM artists";//Подготовь запрос
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();//выполни запрос
            while (rs.next()) {
                Artists artists = new Artists();
                artists.name = rs.getString("Name");
                artists.artistId = rs.getString("artistId");
                a.add(artists);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        StringBuilder str = new StringBuilder();
        /*artistId =
        Artists text = a.get(artistId);
        str.append("Альбомы ").append().append("<a href='/album?album_id=70'>Лучшее за 20 лет</a>");*/
        return str;
    }
}
