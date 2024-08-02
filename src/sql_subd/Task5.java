package sql_subd;

import java.sql.*;
import java.util.Map;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) throws SQLException, NullPointerException {
        String path = "./Task/files/task7361/chinook.db";
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);//Устанави подключение к файлу Базы Данных
        Scanner scanner = new Scanner(System.in);
        int albumId1 = scanner.nextInt();
        int albumId2 = scanner.nextInt();
        int albumId3 = scanner.nextInt();
        Map<Integer, Tracks> tracksMap = TrackDataAccess.getTracks(connection);
        for (int i = 1; i < tracksMap.size(); i++) {
            Tracks tracks = tracksMap.get(i);
            int albumId = tracks.getAlbumId();
            if (albumId == albumId1 || albumId == albumId2 || albumId == albumId3){
                System.out.println(tracks.getMilliseconds() + "   " + tracks.getAlbumId() + "  " + tracks.getUnitPrice()
                        + "   " + tracks.getName());
            }
        }
    }
}
