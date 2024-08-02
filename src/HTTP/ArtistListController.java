package HTTP;

import java.sql.*;
import java.util.ArrayList;

public class ArtistListController {
    public static StringBuilder format(ArrayList<Artists> artists){
        StringBuilder str = new StringBuilder("<ol>\n");
        for (int i = 0; i < artists.size(); i++) {
            Artists text = artists.get(i);
            str.append("<li><a href=\"artist?artist_id=").append(i).append("\">").append(text.name).append("</li>\n");
        }
        str.append("</ol>\n");
        return str;
    }

    public static ArrayList<Artists> getData() throws SQLException {
        ArrayList<Artists> a = new ArrayList<>();
        String path = "./Task/files/task7361/chinook.db";
//Устанави подключение к файлу Базы Данных
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);
//Подготовь запрос
        String sql = "SELECT ArtistId, Name  FROM artists";
        PreparedStatement statement = connection.prepareStatement(sql);
//выполни запрос
        ResultSet rs = statement.executeQuery();
//если в результате есть данные, перейди к первой/следующей строчке
        while (rs.next()) {
            Artists artists = new Artists();
            artists.artistId = rs.getString("ArtistId");
            artists.name = rs.getString("Name");
            a.add(artists);
        }
        return a;
    }

    public static void main(String[] args) throws SQLException {
        ArrayList<Artists> a = getData();
        StringBuilder b = format(a);
        System.out.println(b);
    }
}


