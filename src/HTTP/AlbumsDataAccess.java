package HTTP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlbumsDataAccess {
    public static ArrayList<Albums> getAlbums(Connection connection, String artistId) throws SQLException {
        ArrayList<Albums> albums = new ArrayList<>();
        String selectAlbums = "SELECT albumId, title from albums where artistId=?";
        PreparedStatement statementAlbums = connection.prepareStatement(selectAlbums);
        statementAlbums.setInt(1, Integer.parseInt(artistId));
        ResultSet resultAlbums = statementAlbums.executeQuery();
        while (resultAlbums.next()){
            Albums albums1 = new Albums();
            albums1.albumId = resultAlbums.getString("albumId");
            albums1.title = resultAlbums.getString("title");
            albums.add(albums1);
        }
        return albums;
    }
}
