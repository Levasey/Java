package sql_subd;

import java.sql.*;

public class Task7 {
    public static void main(String[] args) throws SQLException {
        String path = "./Task/files/task7361/chinook.db";
//Устанави подключение к файлу Базы Данных
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);
//Подготовь запрос
        String sql = "SELECT * FROM artists";
        PreparedStatement statement = connection.prepareStatement(sql);
//выполни запрос
        ResultSet rs = statement.executeQuery();
//если в результате есть данные, перейди к первой/следующей строчке
        while (rs.next()) {
            System.out.printf("%-5s%s%n",
                    rs.getString("ArtistId"),
                    rs.getString("Name")
                    );
        }
    }
}
