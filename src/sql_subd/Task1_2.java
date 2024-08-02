package sql_subd;

import java.sql.*;
import java.util.Map;
import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) throws SQLException {
        String path = "./Task/files/task7361/chinook.db";
//Устанави подключение к файлу Базы Данных
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);
        Scanner scanner = new Scanner(System.in);
        int albumId = scanner.nextInt();
        Map<Integer, Tracks> tracksMap = TrackDataAccess.getTracks(connection);
        Tracks tracks = tracksMap.get(albumId);
        String name = tracks.getName();
        String milliseconds = tracks.getMilliseconds();
        String unitPrice = tracks.getUnitPrice();
        System.out.println(name + " , " + milliseconds + " , " + unitPrice);
    }
}
