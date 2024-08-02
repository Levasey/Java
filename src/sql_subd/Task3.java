package sql_subd;

import dto.TrackDataAccess;
import dto.Tracks;

import java.sql.*;
import java.util.Map;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws SQLException {
        String path = "./Task/files/task7361/chinook.db";
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);//Устанави подключение к файлу Базы Данных
        Scanner scanner = new Scanner(System.in);
        int trackId = scanner.nextInt();
        Map<Integer, Tracks> tracksMap = TrackDataAccess.getTracksData(connection);
        Tracks tracks = tracksMap.get(trackId);
        String name = tracks.getName();
        String composer = tracks.getComposer();
        String milliseconds = tracks.getMilliseconds();
        String unitPrice = tracks.getUnitPrice();
        System.out.println("Название: " + name + "\n" +
                "Композитор: " + composer + "\n" +
                "Длительность: " + milliseconds + "\n" +
                "Цена: " + unitPrice);
    }
}
