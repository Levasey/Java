package sql_subd;

import java.sql.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        String albumId = scanner.nextLine();


        String path = "./Task/files/task7361/chinook.db";
//Устанави подключение к файлу Базы Данных
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);
//Подготовь запрос
        String sql = "select Name from tracks where AlbumId=?";
        PreparedStatement statement = connection.prepareStatement(sql);
//укажи, что вместо вопроса нужно подставить значение от пользователя
        statement.setInt(1, Integer.parseInt(albumId));
//выполни запрос
        ResultSet rs = statement.executeQuery();
//если в результате есть данные, перейди к первой/следующей строчке
        while (rs.next()) {
            //в текущей строчке результата(таблицы) прочитай данные из колонки Name
            String name = rs.getString("Name");
            System.out.println(name);//выведи данные на экран
        }
    }
}
