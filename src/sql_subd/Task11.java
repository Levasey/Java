package sql_subd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        int artistId = scanner.nextInt();
        String path = "./Task/files/task7361/chinook.db";
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);
        Map<Integer, Albums> albumsMap = AlbumDataAccess.getAlbums(connection);
        Map<Integer, Tracks> tracksMap = TrackDataAccess.getTracks(connection);
        System.out.println("Треки исполнителя: ");
        for (int i = 1; i < albumsMap.size(); i++) {
            Albums albums = albumsMap.get(i);
            if (albums.getArtistId() == artistId){
                for (int j = 1; j < tracksMap.size(); j++) {
                    Tracks tracks = tracksMap.get(j);
                    if (albums.getAlbumId() == tracks.getAlbumId()){
                        System.out.print(tracks.getName());
                    }
                }
            }
        }
    }
}
