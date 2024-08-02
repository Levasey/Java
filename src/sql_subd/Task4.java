package sql_subd;

import java.sql.*;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        int upperMilliseconds = scanner.nextInt();
        double lowerUnitPrice = scanner.nextDouble();
        String path = "./Task/files/task7361/chinook.db";
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);
//Подготовь запрос
        String sql = "select  Milliseconds, UnitPrice, Name, Composer from tracks where Milliseconds < ?" +
                "and UnitPrice > ?";
        PreparedStatement statement = connection.prepareStatement(sql);
//укажи, что вместо вопроса нужно подставить значение от пользователя
        statement.setInt(1, upperMilliseconds);
        statement.setDouble(2, lowerUnitPrice);
//выполни запрос
        ResultSet rs = statement.executeQuery();
//если в результате есть данные, перейди к первой/следующей строчке
        while (rs.next()) {
            //в текущей строчке результата(таблицы) прочитай данные из колонки Name
            String name = rs.getString("Name");
            String composer = rs.getString("Composer");
            String milliseconds = rs.getString("Milliseconds");
            String unitPrice = rs.getString("UnitPrice");
            System.out.println(milliseconds + "   " + unitPrice + "   " + name + "   " + composer);
        }
    }
}
