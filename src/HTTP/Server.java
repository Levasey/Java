package HTTP;

import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

public class Server {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/", new MainHandler());
        server.createContext("/artist_list", new ArtistListHandler());
        server.createContext("/genre_list", new GenreListHandler());
        server.createContext("/artist", new AtristHandler());
        server.createContext("/album", new TracksHandler());
        server.createContext("/genre", new GenreHandler());
        server.createContext("/playlists", new PlayListHandler());
        server.createContext("/add_playlist", new Add_playlistHandler());
        server.setExecutor(null);
        server.start();
    }
}
