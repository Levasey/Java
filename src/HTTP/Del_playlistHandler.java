package HTTP;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.PrintWriter;

public class Del_playlistHandler implements HttpHandler {
    public void handle(HttpExchange exchange) throws IOException {
        String query = exchange.getRequestURI().getQuery();
        int index = query.indexOf("=");
        int playlistId = Integer.parseInt(query.substring(index + 1, query.length()));
        String page = "" + PlaylistController.delPlaylist(playlistId);
        exchange.getResponseHeaders().add("Location", "/playlists");
        exchange.sendResponseHeaders(303, page.getBytes().length);
        PrintWriter writer = new PrintWriter(exchange.getResponseBody());
        writer.write(page);
        writer.close();

    }
}
