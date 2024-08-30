package HTTP;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Scanner;

public class PlaylistTrackHandler implements HttpHandler {
    public void handle(HttpExchange exchange) throws IOException {
        Scanner s = new Scanner(exchange.getRequestBody());
        String query = s.nextLine();
        int index1 = query.indexOf("=");
        int index3 = query.indexOf("&");
        int index2 = query.lastIndexOf("=");
        int playListId = Integer.parseInt(query.substring(index1 + 1, index3));
        int trackId = Integer.parseInt(query.substring(index2 + 1, query.length()));

        String page = "" + PlaylistTrackController.addTrackToPlaylist(playListId, trackId);

        exchange.getResponseHeaders().add("Location", "/add_playlist?/add_playlist=" + playListId);
        exchange.sendResponseHeaders(303, page.getBytes().length);
        PrintWriter writer = new PrintWriter(exchange.getResponseBody());
        writer.write(page);
        writer.close();
    }
}
