package HTTP;

import dto.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;


public class PlaylistTrackController {
    public static StringBuilder format(int playlistId) throws SQLException, NullPointerException {
        ArrayList<Integer> playlistTrack;
        Map<Integer, Tracks> tracksMap;
        Map<Integer, Playlist> playlistMap;
        try {
            String path = "./Task/files/task7361/chinook.db";
            Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);//Устанави подключение к файлу Базы Данных
            tracksMap = TrackDataAccess.getTracksData(connection);
            playlistTrack = PlaylistTrackDataAccess.getPlaylistTrack(connection, playlistId);
            playlistMap = PlaylistDataAccess.getPlaylist(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        StringBuilder str = new StringBuilder();
        Playlist playlist = playlistMap.get(playlistId);
        str.append("Playlist: ").append(playlist.getName());
        str.append("<ol>");
        for (int i = 0; i < playlistTrack.size(); i++) {
            int trackId = playlistTrack.get(i);
            Tracks tracks = tracksMap.get(trackId);
            str.append("<li>").append(tracks.getName()).append("</a><a href=\"del_track_from_playlist?del_track_from_playlist=")
                    .append(tracks.getTrackId()).append("&id=").append(playlistId).append("\"class=\"button delButton\" >Delete</a></li>");
        }
        str.append("</ol>");
        return str;
    }

    public static StringBuilder addTrackToPlaylist(int playlistId, int trackId) {
        ArrayList<Integer> playlistTrack;
        Map<Integer, Tracks> tracksMap;
        Map<Integer, Playlist> playlistMap;
        try {
            String path = "./Task/files/task7361/chinook.db";
            Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);//Устанави подключение к файлу Базы Данных
            tracksMap = TrackDataAccess.getTracksData(connection);
            playlistTrack = PlaylistTrackDataAccess.addPlaylistTrack(connection, playlistId, trackId);
            playlistMap = PlaylistDataAccess.getPlaylist(connection);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        StringBuilder str = new StringBuilder();
        Playlist playlist = playlistMap.get(playlistId);
        str.append("Playlist: ").append(playlist.getName());
        str.append("<ol>");
        for (int i = 0; i < playlistTrack.size(); i++) {
            int track_Id = playlistTrack.get(i);
            Tracks addtracks = tracksMap.get(track_Id);
            str.append("<li>").append(addtracks.getName()).append("</a><a href=\"del_track_from_playlist?del_track_from_playlist=")
                    .append(addtracks.getTrackId()).append("\"class=\"button delButton\">Delete</a></li>");
        }
        str.append("</ol>");
        return str;
    }

    public static StringBuilder delTrackToPlaylist(int trackId, int playlistId) {
        ArrayList<Integer> playlistTrack;
        Map<Integer, Tracks> tracksMap;
        Map<Integer, Playlist> playlistMap;
        try {
            String path = "./Task/files/task7361/chinook.db";
            Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);//Устанави подключение к файлу Базы Данных
            tracksMap = TrackDataAccess.getTracksData(connection);
            playlistTrack = PlaylistTrackDataAccess.delPlaylistTrack(connection, trackId, playlistId);
            playlistMap = PlaylistDataAccess.getPlaylist(connection);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        StringBuilder str = new StringBuilder();
        Playlist playlist = playlistMap.get(playlistId);
        str.append("Playlist: ").append(playlist.getName());
        str.append("<ol>");
        for (int i = 0; i < playlistTrack.size(); i++) {
            int track_Id = playlistTrack.get(i);
            Tracks addtracks = tracksMap.get(track_Id);
            str.append("<li>").append(addtracks.getName()).append("</a><a href=\"del_track_from_playlist?del_track_from_playlist=")
                    .append(addtracks.getTrackId()).append("\"class=\"button delButton\">Delete</a></li>");
        }
        str.append("</ol>");
        return str;
    }
}
