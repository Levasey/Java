package sql_subd;

import java.sql.*;
import java.util.Map;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        int trackId = scanner.nextInt();
        String path = "./Task/files/task7361/chinook.db";
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);//Устанави подключение к файлу Базы Данных
        Map<Integer, Albums> albumsMap = AlbumDataAccess.getAlbums(connection);
        Map<Integer, Tracks> tracksMap = TrackDataAccess.getTracks(connection);
        Map<Integer, Genres> genresMap = GenreDataAccess.getGenres(connection);
        Tracks tracks = tracksMap.get(trackId);
        int albumId = tracks.getAlbumId();
        int genreId = tracks.getGenreId();
        Albums a = albumsMap.get(albumId);
        String title  = a.getTitle();
        Genres genres = genresMap.get(genreId);
        String genreName = genres.getName();
        String name = tracks.getName();
        String composer = tracks.getComposer();
        String milliseconds = tracks.getMilliseconds();
        String unitPrice = tracks.getUnitPrice();
        StringBuilder str = new StringBuilder();
        System.out.println(str.append("Название: ").append(name).append("\n").append("Композитор: ").append(composer).append("\n")
                        .append("Длительность: ").append(milliseconds).append("\n").append("Цена: ").append(unitPrice).append("\n")
                .append("Альбом: ").append(title).append("\n").append("Жанр: ").append(genreName));
    }
}
