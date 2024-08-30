package HTTP;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.PrintWriter;

public class DelTrackFromPlaylistHandler implements HttpHandler {
    public void handle(HttpExchange exchange) throws IOException {
        String query = exchange.getRequestURI().getQuery();
        int index1 = query.indexOf("=");
        int index2 = query.indexOf("&");
        int index3 = query.lastIndexOf("=");
        int trackId = Integer.parseInt(query.substring(index1 + 1, index2));
        int playListId = Integer.parseInt(query.substring(index3 + 1, query.length()));
        String page = "" + PlaylistTrackController.delTrackToPlaylist(trackId, playListId);
        exchange.getResponseHeaders().add("Location", "/add_playlist?/add_playlist=" + playListId);
        exchange.sendResponseHeaders(303, page.getBytes().length);
        PrintWriter writer = new PrintWriter(exchange.getResponseBody());
        writer.write(page);
        writer.close();
    }
}
