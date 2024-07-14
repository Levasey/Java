package sql_subd;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        String upperMilliseconds = scanner.nextLine();
        String lowerUnitPrice = scanner.nextLine();
        ArrayList<Tracks> a = sql(upperMilliseconds, lowerUnitPrice);
        for (int i = 0; i < a.size(); i++){
            Tracks c = a.get(i);
            System.out.print(c.milliseconds + "    ");
            System.out.print(c.unitPrice + "    ");
            System.out.print(c.name + "    ");
            System.out.print(c.composer + "    \n");
        }
    }

    public static ArrayList<Tracks> sql(String upperMilliseconds, String lowerUnitPrice) throws SQLException {
        ArrayList<Tracks> a = new ArrayList<>();
        String path = "./Task/files/task7361/chinook.db";
//Устанави подключение к файлу Базы Данных
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);
//Подготовь запрос
        String sql = "select  Milliseconds, UnitPrice, Name, Composer from tracks where Milliseconds < ?" +
                "and UnitPrice > ?";
        PreparedStatement statement = connection.prepareStatement(sql);
//укажи, что вместо вопроса нужно подставить значение от пользователя
        statement.setInt(1, Integer.parseInt(upperMilliseconds));
        statement.setDouble(2, Double.parseDouble(lowerUnitPrice));
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
