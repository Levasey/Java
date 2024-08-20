package HTTP;

import dto.PlaylistTrackDataAccess;
import dto.TrackDataAccess;
import dto.Tracks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;


public class PlaylistTrackController {
    public static StringBuilder format(int playlistId) throws SQLException{
        ArrayList<Integer> playlistTrack;
        Map<Integer, Tracks> tracksMap;
        try {
            String path = "./Task/files/task7361/chinook.db";
            Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);//Устанави подключение к файлу Базы Данных
            tracksMap = TrackDataAccess.getTracksData(connection);
            playlistTrack = PlaylistTrackDataAccess.getPlaylistTrack(connection, playlistId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < playlistTrack.size(); i++) {
            int trackId = playlistTrack.get(i);
            Tracks tracks = tracksMap.get(trackId);
            str.append(tracks.getName());
        }
        return str;
    }
}
