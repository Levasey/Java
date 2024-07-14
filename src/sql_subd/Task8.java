package sql_subd;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        String TrackId = scanner.nextLine();
        ArrayList<Tracks> a = sql(TrackId);
        for (int i = 0; i < a.size(); i++){
            Tracks c = a.get(i);
            Genres g = (Genres) a.get(i);
            Albums albums = (Albums) a.get(i);
            System.out.println("Название: " + c.name);
            System.out.println("Композитор: " + c.composer);
            System.out.println("Длительность: " + c.milliseconds);
            System.out.println("Цена: " + c.unitPrice);
            System.out.println("Альбом: " + albums.title);
            System.out.println("Жанр: " + g.name);
        }
    }

    public static ArrayList<Tracks> sql(String TrackId) throws SQLException {
        ArrayList<Tracks> track = new ArrayList<>();
        String path = "./Task/files/task7361/chinook.db";
//Устанави подключение к файлу Базы Данных
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);
//Подготовь запрос
        String sql = "select tracks.Name, tracks.Milliseconds, tracks.UnitPrice, tracks.Composer, albums.title, genres.Name " +
                "from tracks, albums, genres " +
                "where tracks.AlbumId = (SELECT albums.AlbumId FROM albums) " +
                "AND tracks.GenreId = (SELECT GenreId FROM genres) AND TrackId=?";
        PreparedStatement statement = connection.prepareStatement(sql);
//укажи, что вместо вопроса нужно подставить значение от пользователя
        statement.setInt(1, Integer.parseInt(TrackId));
//выполни запрос
        ResultSet rs = statement.executeQuery();
//если в результате есть данные, перейди к первой/следующей строчке
        while (rs.next()) {
            Tracks tracks = new Tracks();
            Genres genres = new Genres();
            Albums albums = new Albums();
            //в текущей строчке результата(таблицы) прочитай данные из колонки Name
            genres.name = rs.getString("Name");
            albums.title = rs.getString("Title");
            tracks.name = rs.getString("Name");
            tracks.composer = rs.getString("Composer");
            tracks.milliseconds = rs.getString("Milliseconds");
            tracks.unitPrice = rs.getString("UnitPrice");
            track.add(tracks);
            track.add(genres);
            track.add(albums);
        }
        return track;
    }
}
