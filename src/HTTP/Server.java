package HTTP;

import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

public class Server {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/", new MainHandler());
        server.createContext("/artist_list", new ArtistListHandler());
        server.createContext("/artist", new AtristHandler());
        server.setExecutor(null);
        server.start();
    }
}
