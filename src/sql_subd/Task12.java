package sql_subd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String path = "./Task/files/task7361/chinook.db";
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);
        Map<Integer, Tracks> tracksMap = TrackDataAccess.getTracks(connection);
        Map<Integer, PlaylistTrack> playlistTrackMap = PlaylistTrackDataAccess.getPlaylistTrack(connection);
        int count = 0;
        PlaylistTrack playlistTrack = playlistTrackMap.get(id);
        if (id == playlistTrack.getPlaylistId()){
            int playlistTrackId = playlistTrack.getTrackId();
            for (int i = 1; i < tracksMap.size(); i++) {
                Tracks tracks = tracksMap.get(i);
                if (tracks.getTrackId() == playlistTrackId) {
                    System.out.println(tracks.getMilliseconds() + "  " + tracks.getName());
                    count += Integer.parseInt(tracks.getMilliseconds());
                }
            }
        }
        System.out.println("Суммарная длительность треков плейлиста " + count);
    }
}