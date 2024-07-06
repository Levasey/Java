package sql_subd;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        String albumId = scanner.nextLine();
        ArrayList<Tracks> a = sql(albumId);
        for (int i = 0; i < a.size(); i++){
            Tracks c = a.get(i);
            System.out.print(c.name + ",");
            System.out.print(c.milliseconds + ",");
            System.out.print(c.unitPrice + "\n");
        }
    }

    public static ArrayList<Tracks> sql(String albumId) throws SQLException {
        ArrayList<Tracks> a = new ArrayList<>();

        String path = "./Task/files/task7361/chinook.db";
//Устанави подключение к файлу Базы Данных
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);
//Подготовь запрос
        String sql = "select Name, Milliseconds, UnitPrice from tracks where AlbumId=?";
        PreparedStatement statement = connection.prepareStatement(sql);
//укажи, что вместо вопроса нужно подставить значение от пользователя
        statement.setInt(1, Integer.parseInt(albumId));
//выполни запрос
        ResultSet rs = statement.executeQuery();
//если в результате есть данные, перейди к первой/следующей строчке
        while (rs.next()) {
            Tracks tracks = new Tracks();
            //в текущей строчке результата(таблицы) прочитай данные из колонки Name
            tracks.name = rs.getString("Name");
            tracks.milliseconds = rs.getString("Milliseconds");
            tracks.unitPrice = rs.getString("UnitPrice");
            a.add(tracks);
        }
        return a;
    }
}
