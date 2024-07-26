package sql_subd;

import java.sql.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import static sql_subd.AlbumDataAccess.getAlbums;

public class Task8 {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        String TrackId = scanner.nextLine();
        ArrayList<Tracks> a = sql(TrackId);

        for (int i = 0; i < a.size(); i++) {
            Tracks c = a.get(i);
            System.out.println("Название: " + c.name);
            System.out.println("Композитор: " + c.composer);
            System.out.println("Длительность: " + c.milliseconds);
            System.out.println("Цена: " + c.unitPrice);
        }
    }

    public static ArrayList<Tracks> sql(String TrackId) throws SQLException {
        ArrayList<Tracks> track = new ArrayList<>();
        String path = "./Task/files/task7361/chinook.db";
//Устанави подключение к файлу Базы Данных
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);
//Подготовь запрос
        String sql = "SELECT Name, Milliseconds, UnitPrice, Composer, albumId FROM tracks WHERE TrackId=?";
        PreparedStatement statement = connection.prepareStatement(sql);
//укажи, что вместо вопроса нужно подставить значение от пользователя
        statement.setInt(1, Integer.parseInt(TrackId));
//выполни запрос
        ResultSet rs = statement.executeQuery();
//если в результате есть данные, перейди к первой/следующей строчке
        Map<String, Albums> albumsMap = getAlbums(connection);
        while (rs.next()) {
            Tracks tracks = new Tracks();
            tracks.albumId = rs.getString("albumId");

            Albums a = albumsMap.get(tracks.albumId);
            String title  = a.getTitle();
            //в текущей строчке результата(таблицы) прочитай данные из колонки Name

            tracks.name = rs.getString("Name");
            tracks.composer = rs.getString("Composer");
            tracks.milliseconds = rs.getString("Milliseconds");
            tracks.unitPrice = rs.getString("UnitPrice");
            track.add(tracks);
        }
        return track;
    }
}