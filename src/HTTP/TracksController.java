package HTTP;

import java.sql.*;
import java.util.ArrayList;

public class TracksController {
    public static String format(ArrayList<Tracks> tracks){
        StringBuilder str = new StringBuilder("<ol>\n");
        for (int i = 0; i < tracks.size(); i++) {
            Tracks text = tracks.get(i);
            str.append("<li><a href=\"track").append(text.trackId).append("\"> ").append(text.name).append(" albumId").append(text.albumId).append("</li>\n");
        }
        str.append("</ol>\n");
        return str.toString();
    }

    public static ArrayList<Tracks> getData() throws SQLException {
        ArrayList<Tracks> a = new ArrayList<>();
        String path = "./Task/files/task7361/chinook.db";
//Устанави подключение к файлу Базы Данных
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);
//Подготовь запрос
        String sql = "SELECT  TrackId, Name, AlbumId, MediaTypeId, GenreId, Composer, Milliseconds, Bytes, UnitPrice " +
                "FROM tracks";
        PreparedStatement statement = connection.prepareStatement(sql);
//выполни запрос
        ResultSet rs = statement.executeQuery();
//если в результате есть данные, перейди к первой/следующей строчке
        while (rs.next()) {
            Tracks tracks = new Tracks();
            tracks.trackId = rs.getString("TrackId");
            tracks.name = rs.getString("Name");
            tracks.albumId = rs.getString("AlbumId");
            tracks.mediaTypeId = rs.getString("MediaTypeId");
            tracks.genreId = rs.getString("GenreId");
            tracks.composer = rs.getString("Composer");
            tracks.milliseconds = rs.getString("Milliseconds");
            tracks.bytes = rs.getString("Bytes");
            tracks.unitPrice = rs.getString("UnitPrice");
            a.add(tracks);
        }
        return a;
    }

    public static void main(String[] args) throws SQLException {
        ArrayList<Tracks> a = getData();
        String b = format(a);
        System.out.println(b);
    }
}
