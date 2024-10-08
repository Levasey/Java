package HTTP;

import dto.Playlist;
import dto.PlaylistDataAccess;
import dto.Tracks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

import static dto.TrackDataAccess.getTracksData;

public class PlaylistController {
    public static StringBuilder format(String playlistName) throws SQLException {
        Map<Integer, Playlist> playlistMap;
        try {
            String path = "./Task/files/task7361/chinook.db";
            Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);//Устанави подключение к файлу Базы Данных
            playlistMap = dto.PlaylistDataAccess.addPlaylist(connection, playlistName);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        StringBuilder str = new StringBuilder();
        str.append("<ol>");
        for (Integer key : playlistMap.keySet()) {
            Playlist playlist = playlistMap.get(key);
            str.append("<li> <a href=\"add_playlist?add_playlist=").append(playlist.getPlaylistId()).append("\"> ")
                    .append(playlist.getName()).append("</li>\n");
        }
        str.append("</ol>");
        return str;
    }

    public static StringBuilder allPlaylistSet() {
        Map<Integer, Playlist> playlistMap;
        StringBuilder str = new StringBuilder();
        try {
            String path = "./Task/files/task7361/chinook.db";
            Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);//Устанави подключение к файлу Базы Данных
            playlistMap = PlaylistDataAccess.getPlaylist(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        str.append("<ol>");
        for (Integer key : playlistMap.keySet()) {
            Playlist playlist = playlistMap.get(key);
            str.append("<li> <a href=\"add_playlist?add_playlist=").append(playlist.getPlaylistId())
                    .append("\"class=\"button listButton\">").append(playlist.getName())
                    .append("</a><a href=\"del_playlist?del_playlist=").append(playlist.getPlaylistId())
                    .append("\"class=\"button delButton\">Delete</a></li>\n");
        }
        str.append("</ol>");
        return str;
    }

    public static StringBuilder delPlaylist(int playlistId){
        Map<Integer, Playlist> playlistMap;
        StringBuilder str = new StringBuilder();
        try {
            String path = "./Task/files/task7361/chinook.db";
            Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);//Устанави подключение к файлу Базы Данных
            playlistMap = PlaylistDataAccess.removeDataFromPlaylist(connection, playlistId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        str.append("<ol>");
        for (Integer key : playlistMap.keySet()) {
            Playlist playlist = playlistMap.get(key);
            str.append("<li> <a href=\"add_playlist?add_playlist=").append(playlist.getPlaylistId())
                    .append("\"class=\"button listButton\">").append(playlist.getName())
                    .append("</a><a href=\"del_playlist?del_playlist=").append(playlist.getPlaylistId())
                    .append("\"class=\"button delButton\">Delete</a></li>\n");
        }
        str.append("</ol>");
        return str;
    }
}
