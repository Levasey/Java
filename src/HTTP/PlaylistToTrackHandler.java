package HTTP;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class PlaylistToTrackHandler implements HttpHandler {
    public void handle(HttpExchange exchange) throws IOException, NullPointerException {
        String query = exchange.getRequestURI().getQuery();
        int index = query.indexOf("=");
        int playlistId = Integer.parseInt(query.substring(index + 1, query.length()));
        String page = null;
        try {
            page = "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta charset=\"utf-8\"/>\n" +
                    "<head/>\n" +
                    "<body>\n" +
                    "Добавление треков" +
                    "<form method=\"post\" action=\"/add_track_to_playlist\">\n" +
                    "<input type=\"hidden\" name=\"playlist\" value=\"" + playlistId + "\">" +
                    "<select name=\"track\">" + TracksController.allTracks(playlistId) +
                    "</select>" +
                    "<input type=\"submit\"></input>\n" +
                    "</form>\n" +
                    PlaylistTrackController.format(playlistId) +
                    "</body>\n" +
                    "</html>";
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        exchange.sendResponseHeaders(200, page.getBytes().length);
        PrintWriter writer = new PrintWriter(exchange.getResponseBody());
        writer.write(page);
        writer.close();
    }
}
