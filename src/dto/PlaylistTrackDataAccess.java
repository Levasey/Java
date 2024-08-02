package dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class PlaylistTrackDataAccess {
    public static Map<Integer, PlaylistTrack> getPlaylistTrack(Connection connection) throws SQLException{
        String selectPlaylistTrack = "SELECT playlistId, trackId FROM playlist_track";
        PreparedStatement statementPlaylistTrack;
        statementPlaylistTrack = connection.prepareStatement(selectPlaylistTrack);
        ResultSet resultPlaylistTrack = statementPlaylistTrack.executeQuery();
        Map<Integer, PlaylistTrack> playlistTrackMap = new HashMap<>();
        while (resultPlaylistTrack.next()){
            int id = resultPlaylistTrack.getInt("playlistId");
            int trackId = resultPlaylistTrack.getInt("trackId");
            PlaylistTrack playlistTrack = new PlaylistTrack(id, trackId);
            playlistTrackMap.put(id, playlistTrack);
        }
        return playlistTrackMap;
    }
}
