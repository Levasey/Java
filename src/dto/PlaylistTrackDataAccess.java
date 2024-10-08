package dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class PlaylistTrackDataAccess {
    public static ArrayList<Integer> getPlaylistTrack(Connection connection, int playListId) throws SQLException {
        String selectPlaylistTrack = "SELECT trackId FROM playlist_track WHERE playlistId=?";
        PreparedStatement statementPlaylistTrack;
        statementPlaylistTrack = connection.prepareStatement(selectPlaylistTrack);
        statementPlaylistTrack.setInt(1, playListId);
        ResultSet resultPlaylistTrack = statementPlaylistTrack.executeQuery();
        ArrayList<Integer> playlistTrack = new ArrayList<>();
        while (resultPlaylistTrack.next()) {
            int trackId = resultPlaylistTrack.getInt("trackId");
            playlistTrack.add(trackId);
        }
        return playlistTrack;
    }

    public static ArrayList<Integer> addPlaylistTrack(Connection connection, int playListId, int trackId) throws SQLException {
        String insertPlaylistTrack = "INSERT OR IGNORE INTO playlist_track (playlistId, trackId) VALUES (?,?)";
        PreparedStatement statement = connection.prepareStatement(insertPlaylistTrack);
        statement.setInt(1, playListId);
        statement.setInt(2, trackId);
        statement.execute();
        String selectPlaylistTrack = "SELECT trackId FROM playlist_track WHERE playlistId=?";
        PreparedStatement statementPlaylistTrack;
        statementPlaylistTrack = connection.prepareStatement(selectPlaylistTrack);
        statementPlaylistTrack.setInt(1, playListId);
        ResultSet resultPlaylistTrack = statementPlaylistTrack.executeQuery();
        ArrayList<Integer> playlistTrack = new ArrayList<>();
        while (resultPlaylistTrack.next()) {
            int track_id = resultPlaylistTrack.getInt("trackId");
            playlistTrack.add(track_id);
        }
        return playlistTrack;
    }

    public static ArrayList<Integer> delPlaylistTrack(Connection connection, int trackId, int playListId) throws SQLException {
        String removePlaylistTrack = "DELETE FROM playlist_track WHERE trackId=?";
        PreparedStatement statement = connection.prepareStatement(removePlaylistTrack);
        statement.setInt(1, trackId);
        statement.execute();
        String selectPlaylistTrack = "SELECT trackId FROM playlist_track WHERE playlistId=?";
        PreparedStatement statementPlaylistTrack;
        statementPlaylistTrack = connection.prepareStatement(selectPlaylistTrack);
        statementPlaylistTrack.setInt(1, playListId);
        ResultSet resultPlaylistTrack = statementPlaylistTrack.executeQuery();
        ArrayList<Integer> playlistTrack = new ArrayList<>();
        while (resultPlaylistTrack.next()) {
            int track_id = resultPlaylistTrack.getInt("trackId");
            playlistTrack.add(track_id);
        }
        return playlistTrack;
    }
}
