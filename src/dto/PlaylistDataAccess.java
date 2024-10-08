package dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class PlaylistDataAccess {
    public static Map<Integer, Playlist> addPlaylist(Connection connection, String playlistName) throws SQLException {
        String insertPlaylist = "INSERT INTO playlists (name) VALUES (?)";
        PreparedStatement statementPlaylist = connection.prepareStatement(insertPlaylist);
        statementPlaylist.setString(1, playlistName);
        statementPlaylist.execute();
        String selectPlaylist = "SELECT playlistId, name FROM playlists";
        PreparedStatement preparedStatement = connection.prepareStatement(selectPlaylist);
        ResultSet resultPlaylist = preparedStatement.executeQuery();
        Map<Integer, Playlist> playlistMap = new HashMap<>();
        while (resultPlaylist.next()) {
            int id = resultPlaylist.getInt("playlistId");
            String name = resultPlaylist.getString("name");
            Playlist playlist = new Playlist(id, name);
            playlistMap.put(id, playlist);
        }
        return playlistMap;

    }

    public static Map<Integer, Playlist> getPlaylist(Connection connection) throws SQLException{
        String selectPlaylist = "SELECT playlistId, name FROM playlists";
        PreparedStatement preparedStatement = connection.prepareStatement(selectPlaylist);
        ResultSet resultPlaylist = preparedStatement.executeQuery();
        Map<Integer, Playlist> playlistMap = new HashMap<>();
        while (resultPlaylist.next()){
            int id = resultPlaylist.getInt("playlistId");
            String name = resultPlaylist.getString("name");
            Playlist playlist = new Playlist(id, name);
            playlistMap.put(id, playlist);
        }
        return playlistMap;
    }

    public static Map<Integer, Playlist> removeDataFromPlaylist(Connection connection,int playlistId) throws SQLException{
        String deletePlaylist = "DELETE FROM Playlists WHERE playlistId=?";
        PreparedStatement statementPlaylist = connection.prepareStatement(deletePlaylist);
        statementPlaylist.setInt(1, playlistId);
        statementPlaylist.execute();
                String selectPlaylist = "SELECT playlistId, name FROM playlists";
        PreparedStatement preparedStatement = connection.prepareStatement(selectPlaylist);
        ResultSet resultPlaylist = preparedStatement.executeQuery();
        Map<Integer, Playlist> playlistMap = new HashMap<>();
        while (resultPlaylist.next()) {
            int id = resultPlaylist.getInt("playlistId");
            String name = resultPlaylist.getString("name");
            Playlist playlist = new Playlist(id, name);
            playlistMap.put(id, playlist);
        }
        return playlistMap;
    }
}
