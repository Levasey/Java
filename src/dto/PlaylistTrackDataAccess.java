package dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class PlaylistTrackDataAccess {
    public static ArrayList<Integer> getPlaylistTrack(Connection connection, int playListId) throws SQLException{
        String selectPlaylistTrack = "SELECT trackId FROM playlist_track WHERE playlistId=?";
        PreparedStatement statementPlaylistTrack;
        statementPlaylistTrack = connection.prepareStatement(selectPlaylistTrack);
        statementPlaylistTrack.setInt(1, playListId);
        ResultSet resultPlaylistTrack = statementPlaylistTrack.executeQuery();
        ArrayList<Integer> playlistTrack = new ArrayList<>();
        while (resultPlaylistTrack.next()){
            int trackId = resultPlaylistTrack.getInt("trackId");
            playlistTrack.add(trackId);
        }
        return playlistTrack;
    }
}
