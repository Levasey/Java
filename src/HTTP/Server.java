package HTTP;

import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        Logger logger = Logger.getLogger("com.sun.net.httpserver");
        logger.setLevel(Level.FINER);
        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.FINER);
        logger.addHandler(handler);
        server.createContext("/", new MainHandler());
        server.createContext("/artist_list", new ArtistListHandler());
        server.createContext("/genre_list", new GenreListHandler());
        server.createContext("/artist", new AtristHandler());
        server.createContext("/album", new AlbumToTracksHandler());
        server.createContext("/genre", new GenreHandler());
        server.createContext("/playlists", new PlayListHandler());
        server.createContext("/add_playlists", new Add_playlistHandler());
        server.createContext("/del_playlist", new Del_playlistHandler());
        server.createContext("/add_playlist", new PlaylistToTrackHandler());
        server.createContext("/add_track_to_playlist", new PlaylistTrackHandler());
        server.createContext("/image/", new ImageHandler());
        server.setExecutor(null);
        server.start();
    }
}
