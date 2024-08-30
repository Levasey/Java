package HTTP;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Scanner;

public class Add_playlistHandler implements HttpHandler {
    public void handle(HttpExchange exchange) throws IOException {
        Scanner s = new Scanner(exchange.getRequestBody());
        String params = s.nextLine();
        int index = params.indexOf("=");
        String playlistName = params.substring(index + 1, params.length());
        s.close();
        String page = null;
        try {
            page = "" + PlaylistController.format(playlistName);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        exchange.getResponseHeaders().add("Location", "/playlists");
        exchange.sendResponseHeaders(303, page.getBytes().length);
        PrintWriter writer = new PrintWriter(exchange.getResponseBody());
        writer.write(page);
        writer.close();
    }
}