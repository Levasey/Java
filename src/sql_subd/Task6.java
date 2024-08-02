package sql_subd;

import java.sql.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) throws SQLException {
        String path = "./Task/files/task7361/chinook.db";
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);//Устанави подключение к файлу Базы Данных
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<Integer, Tracks> tracksMap = TrackDataAccess.getTracks(connection);
        for (int i = 1; i < tracksMap.size(); i++) {
            Tracks tracks = tracksMap.get(i);
            int id = tracks.getTrackId();
            String name = tracks.getName().toLowerCase();
            String composer = tracks.getComposer().toLowerCase();
            if (name.equals(text) || composer.equals(text)){
                System.out.println(id + "   " + name + "    " + composer);
            }
        }
    }
}
