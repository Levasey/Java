package sql_subd;

import dto.PlaylistTrack;
import dto.PlaylistTrackDataAccess;
import dto.TrackDataAccess;
import dto.Tracks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        int playlistId = scanner.nextInt();
        String path = "./Task/files/task7361/chinook.db";
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);
        Map<Integer, Tracks> tracksMap = TrackDataAccess.getTracksData(connection);
        ArrayList<Integer> playlistTrack = PlaylistTrackDataAccess.getPlaylistTrack(connection, playlistId);
        int count = 0;
        System.out.println("Индификаторы треков плейлиста ");
        for (int j = 0; j < playlistTrack.size(); j++) {
            int trackId = playlistTrack.get(j);
            System.out.print(trackId + " ");
        }
        System.out.println();
        for (int i = 0; i < playlistTrack.size(); i++) {
            int trackId = playlistTrack.get(i);
            Tracks tracks = tracksMap.get(trackId);
            System.out.println(tracks.getMilliseconds() + "  " + tracks.getName());
            count += Integer.parseInt(tracks.getMilliseconds());
        }
        System.out.println("Суммарная длительность треков плейлиста " + count);
    }
}