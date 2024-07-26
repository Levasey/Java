package HTTP;

import java.sql.*;
import java.util.ArrayList;

public class AlbumsController {
    public static String format(ArrayList<Albums> albums){
        StringBuilder str = new StringBuilder("<ol>\n");
        for (int i = 0; i < albums.size(); i++) {
            Albums text = albums.get(i);
            str.append("<li><a href=\"album").append(text.albumId).append(" ").append(text.title).append(" artist ").append(text.artistId).append("\"></li>\n");
        }
        str.append("</ol>\n");
        return str.toString();
    }

    public static ArrayList<Albums> getData() throws SQLException {
        ArrayList<Albums> a = new ArrayList<>();
        String path = "./Task/files/task7361/chinook.db";
//Устанави подключение к файлу Базы Данных
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);
//Подготовь запрос
        String sql = "SELECT  Title, AlbumId, ArtistId FROM albums";
        PreparedStatement statement = connection.prepareStatement(sql);
//выполни запрос
        ResultSet rs = statement.executeQuery();
//если в результате есть данные, перейди к первой/следующей строчке
        while (rs.next()) {
            Albums albums = new  Albums();
            albums.artistId = rs.getString("ArtistId");
            albums.title = rs.getString("Title");
            albums.albumId = rs.getString("AlbumId");
            a.add(albums);
        }
        return a;
    }

    public static void main(String[] args) throws SQLException {
        ArrayList<Albums> a = getData();
        String b = format(a);
        System.out.println(b);
    }
}
