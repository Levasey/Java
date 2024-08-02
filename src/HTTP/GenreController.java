package HTTP;

import dto.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

import static dto.AlbumDataAccess.getAlbumsData;
import static dto.ArtistDataAccess.getArtistData;

public class GenreController {
    public static StringBuilder format(Integer genreId) throws SQLException {
        Map<Integer, Genres> genresMap;
        Map<Integer, Tracks> tracksMap;
        Map<Integer, Albums> albumsMap;
        Map<Integer, Artists> artistsMap;
        try {
            String path = "./Task/files/task7361/chinook.db";
            Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);//Устанави подключение к файлу Базы Данных
            genresMap = GenreDataAccess.getGenresData(connection);
            tracksMap = TrackDataAccess.getTracksData(connection);
            artistsMap = getArtistData(connection);
            albumsMap = getAlbumsData(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Genres genres = genresMap.get(genreId);
        StringBuilder str = new StringBuilder();
        str.append("Артисты/Группы исполняющие в стиле ").append(genres.getName()).append("\n");
        str.append("<ol>");
        for (int i = 1; i < tracksMap.size(); i++) {
            Tracks tracks = tracksMap.get(i);
            if (tracks.getGenreId() == genreId) {
                int albumId = tracks.getAlbumId();
                for (int j = 1; j < albumsMap.size(); j++) {
                    Albums albums = albumsMap.get(j);
                    if (albumId == albums.getAlbumId()) {
                        int artistId = albums.getArtistId();
                        for (int k = 1; k < artistsMap.size(); k++) {
                            Artists artists = artistsMap.get(k);
                            if (artistId == artists.getArtistId()) {
                                str.append("<li> <a href=\"artist?artist_id=").append(artists.getArtistId()).append("\"> ").append(artists.getName()).append("</li>\n");
                            }
                        }
                    }
                }
            }
        }
        str.append("</ol>");
        return str;
    }
}