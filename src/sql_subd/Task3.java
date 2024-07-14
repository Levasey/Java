package sql_subd;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        String TrackId = scanner.nextLine();
        ArrayList<Tracks> a = sql(TrackId);
        for (int i = 0; i < a.size(); i++){
            Tracks c = a.get(i);
            System.out.println("Название: " + c.name);
            System.out.println("Композитор: " + c.composer);
            System.out.println("Длительность: " + c.milliseconds);
            System.out.println("Цена: " + c.unitPrice);
        }
    }

    public static ArrayList<Tracks> sql(String TrackId) throws SQLException {
        ArrayList<Tracks> a = new ArrayList<>();

        String path = "./Task/files/task7361/chinook.db";
//Устанави подключение к файлу Базы Данных
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);
//Подготовь запрос
        String sql = "select Name, Milliseconds, UnitPrice, Composer from tracks where TrackId=?";
        PreparedStatement statement = connection.prepareStatement(sql);
//укажи, что вместо вопроса нужно подставить значение от пользователя
        statement.setInt(1, Integer.parseInt(TrackId));
//выполни запрос
        ResultSet rs = statement.executeQuery();
//если в результате есть данные, перейди к первой/следующей строчке
        while (rs.next()) {
            Tracks tracks = new Tracks();
            //в текущей строчке результата(таблицы) прочитай данные из колонки Name
            tracks.name = rs.getString("Name");
            tracks.composer = rs.getString("Composer");
            tracks.milliseconds = rs.getString("Milliseconds");
            tracks.unitPrice = rs.getString("UnitPrice");
            a.add(tracks);
        }
        return a;
    }
}
