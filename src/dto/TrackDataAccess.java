package dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class TrackDataAccess {
    public static Map<Integer, Tracks> getTracksData(Connection connection) throws SQLException {
        String selectTracks = "select trackId, Name, albumId, MediaTypeId, GenreId, Composer, Milliseconds, Bytes, UnitPrice " +
                "FROM tracks ";
        PreparedStatement statementAlbums = connection.prepareStatement(selectTracks);
        ResultSet resultTracks = statementAlbums.executeQuery();
        Map<Integer, Tracks> trackIdToNameMap = new HashMap<>();
        while (resultTracks.next()) {
            int id = resultTracks.getInt("trackId");
            String name = resultTracks.getString("Name");
            int albumId = resultTracks.getInt("albumId");
            String mediaTypeId = resultTracks.getString("MediaTypeId");
            int genreId = resultTracks.getInt("GenreId");
            String composer = resultTracks.getString("Composer");
            String milliseconds = resultTracks.getString("Milliseconds");
            String bytes = resultTracks.getString("Bytes");
            String unitPrice = resultTracks.getString("UnitPrice");
            Tracks tracks = new Tracks(id, name, albumId, mediaTypeId, genreId, composer, milliseconds, bytes, unitPrice);
            trackIdToNameMap.put(id, tracks);
        }
        return trackIdToNameMap;
    }

    public static Map<Integer, Tracks> getTrack(Connection connection, int playlistId) throws SQLException {
        String select = "SELECT trackId, name FROM tracks WHERE trackId NOT IN (SELECT trackId FROM playlist_track WHERE playlistId=?)";
        PreparedStatement statementTrack = connection.prepareStatement(select);
        statementTrack.setInt(1, playlistId);
        ResultSet resultTracks = statementTrack.executeQuery();
        Map<Integer, Tracks> trackIdToNameMap = new HashMap<>();
        while (resultTracks.next()) {
            int id = resultTracks.getInt("trackId");
            String name = resultTracks.getString("Name");
            Tracks track = new Tracks(id, name);
            trackIdToNameMap.put(id, track);
        }
        return trackIdToNameMap;
    }
}
