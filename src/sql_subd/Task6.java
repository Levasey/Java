package sql_subd;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        ArrayList<Tracks> a = sql(text);
        for (int i = 0; i < a.size(); i++){
            Tracks c = a.get(i);
            System.out.print(c.trackId + "    ");
            System.out.print(c.name + "    ");
            System.out.print(c.composer + "    \n");
        }
    }

    public static ArrayList<Tracks> sql(String text) throws SQLException {
        ArrayList<Tracks> a = new ArrayList<>();
        String path = "./Task/files/task7361/chinook.db";
//Устанави подключение к файлу Базы Данных
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);
//Подготовь запрос
        String sql = "SELECT  TrackId, Name, Composer FROM tracks WHERE Name LIKE '%?%' OR Composer LIKE '%?%'";
        PreparedStatement statement = connection.prepareStatement(sql);
//укажи, что вместо вопроса нужно подставить значение от пользователя
        statement.setString(1, text);
        statement.setString(2, text);
//выполни запрос
        ResultSet rs = statement.executeQuery();
//если в результате есть данные, перейди к первой/следующей строчке
        while (rs.next()) {
            Tracks tracks = new Tracks();
            //в текущей строчке результата(таблицы) прочитай данные из колонки Name
            tracks.trackId = rs.getString("TrackId");
            tracks.name = rs.getString("Name");
            tracks.composer = rs.getString("Composer");
            a.add(tracks);
        }
        return a;
    }
}
