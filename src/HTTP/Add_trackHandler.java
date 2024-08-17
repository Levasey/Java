package HTTP;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.PrintWriter;

public class Add_trackHandler implements HttpHandler {
    public void handle(HttpExchange exchange) throws IOException {
        String page = null;
        page = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta charset=\"utf-8\"/>\n" +
                "<head/>\n" +
                "<body>\n" +
                "Добавление треков" +
                "<form method=\"post\" action=\"/add_track_to_playlist\">\n" +
                "<select name = \"playlist\">" + PlaylistController.allPlaylist() +
                "</select>" +
                "<select name=\"track\">" + TracksController.allTracks() +
                "</select>" +
                "<input type=\"submit\"></input>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>";
        exchange.sendResponseHeaders(200, page.getBytes().length);
        PrintWriter writer = new PrintWriter(exchange.getResponseBody());
        writer.write(page);
        writer.close();
    }

}
