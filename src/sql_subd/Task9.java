package sql_subd;

import dto.AlbumDataAccess;
import dto.Albums;
import dto.TrackDataAccess;
import dto.Tracks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        int albumId = scanner.nextInt();
        String path = "./Task/files/task7361/chinook.db";
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);//Устанави подключение к файлу Базы Данных
        Map<Integer, Albums> albumsMap = AlbumDataAccess.getAlbumsData(connection);
        Map<Integer, Tracks> tracksMap = TrackDataAccess.getTracksData(connection);
        Albums a = albumsMap.get(albumId);
        String title  = a.getTitle();
        System.out.println("Альбом: " + title);
        for (int i = 1; i < tracksMap.size(); i++) {
            Tracks tracks = tracksMap.get(i);
            int trackAlbumId = tracks.getAlbumId();
            if (trackAlbumId == albumId){
                System.out.println(tracks.getName() + "  " + tracks.getMilliseconds());
            }
        }
    }
}