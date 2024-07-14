package sql_subd;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        String albumId1 = scanner.nextLine();
        String albumId2 = scanner.nextLine();
        String albumId3 = scanner.nextLine();
        ArrayList<Tracks> a = sql(albumId1, albumId2, albumId3);
        for (int i = 0; i < a.size(); i++){
            Tracks c = a.get(i);
            System.out.print(c.milliseconds + "    ");
            System.out.print(c.albumId + "    ");
            System.out.print(c.unitPrice + "    ");
            System.out.print(c.name + "    \n");
        }
    }

    public static ArrayList<Tracks> sql(String albumId1, String albumId2, String albumId3) throws SQLException {
        ArrayList<Tracks> a = new ArrayList<>();

        String path = "./Task/files/task7361/chinook.db";
//Устанави подключение к файлу Базы Данных
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);
//Подготовь запрос
        String sql = "select Name, Milliseconds, UnitPrice, AlbumId from tracks where AlbumId=? or AlbumId=? or AlbumId=?";
        PreparedStatement statement = connection.prepareStatement(sql);
//укажи, что вместо вопроса нужно подставить значение от пользователя
        statement.setInt(1, Integer.parseInt(albumId1));
        statement.setInt(2, Integer.parseInt(albumId2));
        statement.setInt(3, Integer.parseInt(albumId3));
//выполни запрос
        ResultSet rs = statement.executeQuery();
//если в результате есть данные, перейди к первой/следующей строчке
        while (rs.next()) {
            Tracks tracks = new Tracks();
            //в текущей строчке результата(таблицы) прочитай данные из колонки Name
            tracks.albumId = rs.getString("AlbumId");
            tracks.name = rs.getString("Name");
            tracks.milliseconds = rs.getString("Milliseconds");
            tracks.unitPrice = rs.getString("UnitPrice");
            a.add(tracks);
        }
        return a;
    }
}
