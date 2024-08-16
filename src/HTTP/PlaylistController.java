package HTTP;

import dto.Playlist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class PlaylistController {
    public static StringBuilder format(String playlistName) throws SQLException {
        Map<Integer, Playlist> playlistMap;
        try {
            String path = "./Task/files/task7361/chinook.db";
            Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);//Устанави подключение к файлу Базы Данных
            playlistMap = dto.PlaylistDataAccess.addPlaylist(connection, playlistName);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        StringBuilder str = new StringBuilder();
        str.append("<ol>");
        for (int i = 1; i < playlistMap.size(); i++) {
            Playlist playlist = playlistMap.get(i);
            str.append("<li> <a href=\"add_playlist?add_playlist=").append(playlist.getPlaylistId()).append("\"> ").append(playlist.getName()).append("</li>\n");
        }
        str.append("</ol>");
        return str;
    }
}
