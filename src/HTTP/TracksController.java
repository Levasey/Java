package HTTP;

import dto.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.Map;

import static dto.TrackDataAccess.getTracksData;

public class TracksController {
    public static String format(Integer albumId) {
        Map<Integer, Tracks> tracksMap;
        Map<Integer, Albums> albumsMap;
        Map<Integer, Artists> artistsMap;
        try {
            String path = "./Task/files/task7361/chinook.db";
            Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);//Устанави подключение к файлу Базы Данных
            tracksMap = getTracksData(connection);
            albumsMap = AlbumDataAccess.getAlbumsData(connection);
            artistsMap = ArtistDataAccess.getArtistData(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        int artistId = 0;
        Albums albums1 = albumsMap.get(albumId);
        for (int i = 1; i < albumsMap.size(); i++) {
            Albums albums = albumsMap.get(i);
            if (albumId == albums.getAlbumId()) {
                artistId = albums.getArtistId();
            }
        }
        Artists artists = artistsMap.get(artistId);
        StringBuilder str = new StringBuilder();
        str.append("Песни из альбома ").append(albums1.getTitle()).append(". Группы ").append(artists.getName()).append("\n");
        str.append("<ol>");
        for (int i = 1; i < tracksMap.size(); i++) {
            Tracks text = tracksMap.get(i);
            if (text.getAlbumId() == albumId) {
                str.append("<li><a href=\"track?").append(text.getTrackId()).append("\"> ").append(text.getName()).append("</li>\n");
            }
        }
        str.append("</ol>\n");
        return str.toString();
    }

    public static StringBuilder allTracks(int playlistId) {
        Map<Integer, Tracks> tracksMap;
        try {
            String path = "./Task/files/task7361/chinook.db";
            Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);//Устанави подключение к файлу Базы Данных
            tracksMap = dto.TrackDataAccess.getTrack(connection, playlistId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        StringBuilder str = new StringBuilder();
        for (Integer key : tracksMap.keySet()) {
            Tracks track = tracksMap.get(key);
            if (track.getName() == null) {
                str.append("треков нет");
            } else
                str.append("<option value=\"").append(track.getTrackId()).append("\">").append(track.getName()).append("</option>\"");
        }
        return str;
    }
}