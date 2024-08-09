package dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GenreToArtistAccess {
    public static ArrayList<Artists> getArtistData(Connection connection, int genreId) throws SQLException {
        String selectGenres = "SELECT DISTINCT ar.artistId, ar.name FROM tracks t left join albums al on t.albumId=al.albumId " +
                "left join artists ar on al.artistId=ar.artistId where t.genreId=?";
        PreparedStatement statementGenres = connection.prepareStatement(selectGenres);
        statementGenres.setInt(1, genreId);
        ResultSet resultGenres = statementGenres.executeQuery();
        ArrayList<Artists> artistsArrayList = new ArrayList<>();
        while (resultGenres.next()){
            int id = resultGenres.getInt("artistId");
            String name = resultGenres.getString("name");
            Artists artists = new Artists(id, name);
            artistsArrayList.add(artists);
        }
        return artistsArrayList;
    }
}
